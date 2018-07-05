package com.machine.learning.explore.demo;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.machine.learning.explore.Explore;
import com.machine.learning.explore.web.WebExplore;
import com.machine.learning.explore.web.utils.StringUtils;

public class ZYDCExplore extends WebExplore{

	@Override
	public List<String> findUrlInContent() {
		List<String> urls=new LinkedList<String>();
		Document doc=super.getContent();
		Elements els=doc.select(".item-mod");
		for(Element e:els){
			String url=e.attr("data-link");
			if(!StringUtils.isEmpty(url)){
				urls.add(url);
			}
			
		}
		System.out.println(urls);
		return urls;
	}

	@SuppressWarnings("unused")
	@Override
	public void doFindUseFulInfo() {
		Document doc=super.getContent();
		
		String price=doc.select("div.price").text();
		String around_price=doc.select(".around-price").select("span").text();
		String lpAddr_text=doc.select(".lpAddr-text").text();
		System.out.println(doc);
	}
	
	
	public static void main(String[] args) throws IOException{
		ZYDCExplore explore=new ZYDCExplore();
		explore.setUrl("https://cd.fang.anjuke.com/loupan/438032.html");
		explore.findContent();
		explore.doFindUseFulInfo();
	}

	@Override
	public Explore getNewInstance() {
		// TODO Auto-generated method stub
		return new ZYDCExplore();
	}
	
}