package model.common;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisSqlSessionFactory {
	private static SqlSessionFactory sessionFactory;
	
	static{
		String resource = "mybatis-config.xml";
		try{
			Reader reader = Resources.getResourceAsReader(resource);
			sessionFactory = new SqlSessionFactoryBuilder().build(reader); 
			reader.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public static SqlSessionFactory getSessionFactory() {
		return sessionFactory;
	}	
}
