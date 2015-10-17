package model.dao;

import org.apache.ibatis.session.SqlSession;

public interface MappingCallback<T> {
	T makeStatement(SqlSession session);
}
