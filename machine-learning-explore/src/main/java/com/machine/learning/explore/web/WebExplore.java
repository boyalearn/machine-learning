package com.machine.learning.explore.web;


import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import com.machine.learning.explore.Explore;

public abstract class WebExplore implements Explore{
	
	protected Document content;
	
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

	public void findContent() throws IOException {
		Connection conn = Jsoup.connect(url);     
		Response response = conn.execute(); 
		content=response.parse();
	}
	
	public boolean isMatch(String url){
		return true;
	}





	

}
