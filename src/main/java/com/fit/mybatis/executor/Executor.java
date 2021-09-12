package com.fit.mybatis.executor;

import com.fit.mybatis.RowBounds;
import com.fit.mybatis.handler.ResultHandler;
import com.fit.mybatis.statement.MappedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Stone
 * @version 1.0
 * @since 2021-09-12
 */
public interface Executor {

  /**
   * 查询列表
   * @param ms
   * @param rowBounds
   * @param resultHandler
   * @param <E>
   * @return
   * @throws SQLException
   */
  <E> List<E> query(MappedStatement ms, RowBounds rowBounds, ResultHandler resultHandler) throws SQLException;
}
