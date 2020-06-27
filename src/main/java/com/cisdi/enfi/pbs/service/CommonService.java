package com.cisdi.enfi.pbs.service;

public interface CommonService extends BaseService {

    /**
     * 查询某张表中某一列符合某种条件下当前最大的数字
     * @param tableName 表名
     * @param field 列名(注意：这一列必中的数据须是可以被转换成数字的)
     * @param condition 查询过滤条件（例如：id='123'）
     * @return 符合条件的最大的maxNumber，Number类型，具体是Integer还是Double等等，根据不同的业务逻辑，分别调运intValue
     *         ()或doubleValue()等等
     * @throws Exception
     */
    public Number getCurrentMaxNumber(String tableName, String field,
                                      String condition) throws Exception;
}
