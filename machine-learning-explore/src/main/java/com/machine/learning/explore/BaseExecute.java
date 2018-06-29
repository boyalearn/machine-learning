package com.machine.learning.explore;

import com.machine.learning.explore.web.thread.ThreadPool;
import com.machine.learning.explore.web.thread.BaseExploreWorker;

public class BaseExecute implements Execute{

	
	private Explore explore;
	
	private String searchUrl;

	public BaseExecute(String searchUrl,Explore explore) {
		super();
		this.explore = explore;
		this.searchUrl=searchUrl;
	}





	@Override
	public void start() {
		ThreadPool.getInstance().execute(new BaseExploreWorker(searchUrl,explore));
	}
 


}
