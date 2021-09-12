package com.fit.mybatis.session;

import java.util.List;
import javax.sql.DataSource;

/**
 * @author Stone
 * @version 1.0
 * @since 2021-09-12
 */
public class DefaultSqlSession implements SqlSession {

  private Configuration configuration;

  @Override
  public <E> List<E> selectList(String statement) {
    return null;
  }

  @Override
  public DataSource getDataSource() {
    return null;
  }
}
