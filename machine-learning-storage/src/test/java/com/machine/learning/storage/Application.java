package com.machine.learning.storage;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.machine.learning.house.bean.AnJuKeHoseEvt;
import com.machine.learning.storage.mapper.HouseMapper;

public class Application {

	public static void main(String[] args) {
		SqlSessionFactory sqlSessionFactory=SessionFactory.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        HouseMapper mapper = sqlSession.getMapper(HouseMapper.class);
        AnJuKeHoseEvt info=mapper.findHouseInfoById(1);
        mapper.addHouseInfo(info);
        sqlSession.commit();
        System.out.println(info);
	}

}
