package com.machine.learning.house.explore;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.machine.learning.explore.Explore;
import com.machine.learning.explore.web.WebExplore;
import com.machine.learning.house.bean.AnJuKeHoseEvt;
import com.machine.learning.storage.service.HouseService;

import net.sf.json.JSONObject;

public class ZYDCExplore extends WebExplore{

	@Override
	public void doFindUseFulInfo() {
        Document doc=super.getContent();
		String price=doc.select("div.price").text();
		String aroundPrice=doc.select(".around-price").select("span").text();
		String address=doc.select(".lpAddr-text").text();
		String content=doc.toString();
		String json=findLocation(content);	
		JSONObject jsonObj=JSONObject.fromObject(json);
		String houseName=jsonObj.get("panName").toString();
		String lng=jsonObj.get("lng").toString();
		String lat=jsonObj.get("lat").toString();
		AnJuKeHoseEvt house=new AnJuKeHoseEvt();
		house.setAddress(address);
		house.setAroundPrice(aroundPrice);
		house.setPrice(price);
		house.setHouseName(houseName);
		house.setLat(lat);
		house.setLng(lng);
		house.setUrl(this.url);
		house.setContent(this.content.body().text());
		HouseService.getInstance().addHouseInfo(house);
		
	}
	
	public String findLocation(String content) {
		String regEx="Loupan.Map(.{1,});";
		Pattern pat = Pattern.compile(regEx);  
        Matcher mat = pat.matcher(content);  
        String result="";
        if(mat.find()){
        	result=mat.group(1);
        }
        result=result.substring(1,result.length()-1);
        return result;
	}

	@Override
	public List<String> findUrlInContent() {
		List<String> urls=new LinkedList<String>();
		if(null!=content){
			Elements es=content.select(".item-mod");
			for(Element link:es){
				String findUrl=link.attr("data-link");
				if(!StringUtil.isBlank(findUrl)){
					if(isMatch(findUrl)){
						urls.add(findUrl);
					}
				}
			}
		}
		return urls;
	}
	public static void main(String[] args) throws IOException{
		/*ZYDCExplore explore=new ZYDCExplore();
		explore.setUrl("https://cd.fang.anjuke.com/loupan/438032.html");
		explore.findContent();
		explore.doFindUseFulInfo();*/
		ZYDCExplore explore=new ZYDCExplore();
		explore.setUrl("https://cd.fang.anjuke.com/loupan/all/p1/");
		explore.findContent();
		List<String> urls=explore.findUrlInContent();
		System.out.println(urls);;
	}

	@Override
	public Explore getNewInstance() {
		// TODO Auto-generated method stub
		return new ZYDCExplore();
	}
}
  