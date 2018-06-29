package com.machine.learning.explore.web.thread;

/**
 * 资源探索者
 * @author zouhuixing
 *
 */
public interface ExploreWorker extends Runnable{
	public void doExplore();
}
