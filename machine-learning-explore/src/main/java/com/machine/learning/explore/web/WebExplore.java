package com.machine.learning.explore.web;


import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import org.jsoup.Connection;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.machine.learning.explore.Explore;

public class WebExplore implements Explore{
	
	private Document content;
	
	private String url;




	public Document getContent() {
		return content;
	}

	public void setContent(Document content) {
		this.content = content;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public void findContent() throws IOException {
		Connection conn = Jsoup.connect(url);     
		Response response = conn.execute(); 
		content=response.parse();
	}

	@Override
	public List<String> findUrlInContent() {
		List<String> urls=new LinkedList<String>();
		if(null!=content){
			Elements es=content.select("a[href].position_link");
			for(Element link:es){
				String findUrl=link.attr("href");
				if(!StringUtil.isBlank(findUrl)){
					if(isMatch(findUrl)){
						urls.add(findUrl);
					}
				}
			}
		}
		return urls;
	}
	
	public boolean isMatch(String url){
		return true;
	}

	@Override
	public void doFindUseFulInfo() {
		
		
	}




	

}
