package com.machine.learning.explore.web.thread;

import java.io.IOException;

import com.machine.learning.explore.Explore;

public class BaseWorkerWorker implements ExploreWorker{
	
	private Explore explore;
	
	private String url;
	
	

	public BaseWorkerWorker(String url,Explore explore) {
		super();
		this.explore = explore.getNewInstance();
		this.url = url;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		doExplore();
	}


	@Override
	public void doExplore() {
		try {
			explore.setUrl(url);
			System.out.println(url);
			explore.findContent();
			explore.doFindUseFulInfo();
		} catch (IOException e) {
			
		}
	}

}
