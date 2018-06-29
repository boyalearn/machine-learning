package com.machine.learning.explore.demo;

import com.machine.learning.explore.BaseExecute;

public class ExploreTest {
	public static void main(String[] args){
		ZYDCExplore exploer=new ZYDCExplore();
		new BaseExecute("https://cd.fang.anjuke.com/loupan/all/p",exploer).start();
	}
}
