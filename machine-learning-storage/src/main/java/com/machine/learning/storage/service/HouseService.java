package com.machine.learning.storage.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.machine.learning.house.bean.AnJuKeHoseEvt;
import com.machine.learning.storage.SessionFactory;
import com.machine.learning.storage.mapper.HouseMapper;

public class HouseService {
	
	private static HouseService instance;
	
	public static synchronized HouseService getInstance() {
		if(null==instance) {
			instance=new HouseService();
		}
		return instance;
	}
	
	private static SqlSessionFactory sqlSessionFactory=SessionFactory.getSqlSessionFactory();
	static SqlSession sqlSession;
	static {
		sqlSession = sqlSessionFactory.openSession();
	}
    
	public Integer addHouseInfo(AnJuKeHoseEvt info) {
		HouseMapper mapper = sqlSession.getMapper(HouseMapper.class);
		Integer count=mapper.addHouseInfo(info);
	    sqlSession.commit();
	    return count;
	}
}
