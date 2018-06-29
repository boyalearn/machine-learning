package com.machine.learning.explore.web.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPool {
	private Executor pool=new ThreadPoolExecutor(10,20,10000,TimeUnit.MILLISECONDS,new LinkedBlockingQueue<Runnable>(40000));
	private static ThreadPool instance=new ThreadPool();
	public static ThreadPool getInstance(){
		return instance;
	}
	
	public void execute(Runnable command){
		pool.execute(command);
	}

}
