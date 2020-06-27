package com.cisdi.enfi.pbs.service;


import com.cisdi.enfi.pbs.model.Root;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface BaseService {

    /**
     * 根据ID查询数据
     * @param className 类名
     * @param id 要查找的数据的ID
     * @return 返回查询结果Root对象
     * @throws Exception
     */
    public Root getObjById(String className, String id) throws Exception;
    /**
     * 存储过程调用
     * @param sql  调用存储过程语句
     * @param inParamIndexs 传入参数索引
     * @param inParams 传入参数值 和输入参数索引一一对应
     * @param outResultIndex 输出参数索引
     * @param outResultTypes 输出参数type类型 和输出参数索引一一对应
     * @return 输出参数的集合 按照输出参数索引从小到大存入
     * @throws SQLException
     */
    public List<Object> prepareCall(String sql,
                                    List<Integer> inParamIndexs, List<Object> inParams,
                                    List<Integer> outResultIndex, List<Integer> outResultTypes) throws SQLException;

    /**
     * 根据Sql进行分页查询
     *
     * @param sql
     * 		查询SQL
     * @param page
     * 		当前页（1为第一页）
     * @param pageSize
     * 		页大小
     * @param params
     * @return
     */
    public List<Map<String, Object>> getObjListBySqlPaged(String sql, int page, int pageSize,
                                                          List<Object> params) throws Exception;

    /** 根据sql查询结果数
     *
     * @param sql
     * @param params
     * @return
     * @throws BaseException
     */
    public long getTotalCountBySql(String sql, List<Object> params) throws Exception;

    /**
     * 根据sql查询数据
     * @param sql sql语句
     * @param objs 参数
     * @return 返回符合条件的对象集合
     * @throws Exception
     */
    public List<Map<String, Object>> getObjListBySql(String sql, List<Object> objs) throws Exception;

}
