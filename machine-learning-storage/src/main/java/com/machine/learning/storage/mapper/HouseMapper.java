package com.machine.learning.storage.mapper;



import com.machine.learning.house.bean.AnJuKeHoseEvt;

public interface HouseMapper {
	
	public AnJuKeHoseEvt findHouseInfoById(Integer id);
	
	public Integer addHouseInfo(AnJuKeHoseEvt houseEvt);
	
}
