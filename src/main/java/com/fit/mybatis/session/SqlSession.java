package com.fit.mybatis.session;

import java.util.List;
import javax.sql.DataSource;

/**
 * 请求过程
 * @author Stone
 * @version 1.0
 * @since 2021-09-12
 */
public interface SqlSession {


  /**
   * 列表查询
   * @param statement
   * @param <E>
   * @return
   */
  <E> List<E> selectList(String statement);

  /**
   * datasource
   * @return
   */
  DataSource getDataSource();
}
