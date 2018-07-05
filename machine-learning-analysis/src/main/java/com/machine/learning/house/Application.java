package com.machine.learning.house;

import com.machine.learning.explore.BaseExecute;
import com.machine.learning.house.explore.ZYDCExplore;

public class Application {
	public  static void main(String[] args) {
		ZYDCExplore exploer=new ZYDCExplore();
		new BaseExecute("https://cd.fang.anjuke.com/loupan/all/p",exploer).start();
	}
}
