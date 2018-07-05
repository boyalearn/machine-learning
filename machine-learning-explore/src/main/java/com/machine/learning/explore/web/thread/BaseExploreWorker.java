package com.machine.learning.explore.web.thread;

import java.io.IOException;
import java.util.List;

import com.machine.learning.explore.Explore;

public class BaseExploreWorker implements ExploreWorker{
	private String  serchUrl;
	
	private Explore explore;
	
	

	public BaseExploreWorker(String serchUrl, Explore explore) {
		super();
		this.serchUrl = serchUrl;
		this.explore = explore.getNewInstance();
	}

	@Override
	public void run() {
		doExplore();
		
	}

	@Override
	public void doExplore() {
		try{
			int page=0;
			do{
				page++;
				String pageUrl=serchUrl+page;
				System.out.println(pageUrl);
			    explore.setUrl(pageUrl);
				explore.findContent();
				if(null==explore.getContent()){
					continue;
				}
				List<String> urls=explore.findUrlInContent();
				for(String url: urls){
					ThreadPool.getInstance().execute(new BaseWorkerWorker(url,explore));
				}
			}while(null!=explore.getContent());
			
		} catch (IOException e) {
			
		}
	}

}
