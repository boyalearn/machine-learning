package com.machine.learning.house.explore;

import java.util.LinkedList;
import java.util.List;

import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.machine.learning.explore.web.WebExplore;

public class ZYDCExplore extends WebExplore{

	@Override
	public void doFindUseFulInfo() {
		// TODO Auto-generated method stub
		
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
}
  