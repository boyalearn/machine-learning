package com.machine.learning.storage;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SessionFactory {
	private static SqlSessionFactory sqlSessionFactory;
	
	public static synchronized SqlSessionFactory getSqlSessionFactory(){
        if(sqlSessionFactory==null){
            InputStream inputStream=null;
            try {
                inputStream= Resources.getResourceAsStream("mybatis-config.xml");
            }catch (Exception e){
                e.printStackTrace();
            }
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        }
        return sqlSessionFactory;

    }

}
