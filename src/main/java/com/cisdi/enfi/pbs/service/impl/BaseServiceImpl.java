package com.cisdi.enfi.pbs.service.impl;

import com.cisdi.enfi.pbs.dao.TemplateFactory;
import com.cisdi.enfi.pbs.datamng.BaseDataMng;
import com.cisdi.enfi.pbs.datamng.BaseEntityMng;
import com.cisdi.enfi.pbs.model.Root;
import com.cisdi.enfi.pbs.service.BaseService;
import com.cisdi.enfi.pbs.utils.DBRouterUtils;
import org.hibernate.Session;
import org.hibernate.jdbc.Work;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;

@Service
@Transactional
public class BaseServiceImpl implements BaseService {

    @Resource
    protected BaseDataMng baseDataMng;
//    @Resource
//    protected BaseEntityMng baseEntityMng;
//    protected Connection conn;
//
//    protected static HibernateTemplate hibernateTemplate;
//
//    public HibernateTemplate getHibernateTemplate() {
//        return hibernateTemplate;
//    }
//
//    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
//        this.hibernateTemplate = hibernateTemplate;
//    }
//
//    static {
//        if (hibernateTemplate == null) {
//            hibernateTemplate = TemplateFactory
//                    .getHibernateTemplate(DBRouterUtils.getDBId());
//        }
//    }
//
//    public void clearSession() {
//        hibernateTemplate.getSessionFactory().getCurrentSession().clear();
//    }
//
//    public void flushSession() {
//        hibernateTemplate.getSessionFactory().getCurrentSession().flush();
//    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Object> prepareCall(String sql,
                                    List<Integer> inParamIndexs, List<Object> inParams,
                                    List<Integer> outResultIndex, List<Integer> outResultTypes) throws SQLException {
        List<Object> list = new ArrayList<Object>();
//        Session session = this.getHibernateTemplate().getSessionFactory().getCurrentSession();
//        session.doWork(new Work(){
//            @Override
//            public void execute(Connection connection) throws SQLException {
//                conn = connection;
//            }
//        });
//        CallableStatement cstmt = conn.prepareCall(sql);
//        for (int i = 0; inParamIndexs!=null && i < inParamIndexs.size(); i++){
//            cstmt.setObject(inParamIndexs.get(i), inParams.get(i));
//        }
//        for (int i = 0;outResultIndex!=null && i < outResultIndex.size(); i++){
//            cstmt.registerOutParameter(outResultIndex.get(i), outResultTypes.get(i));
//        }
//        cstmt.execute();
//        for (int i = 0;outResultIndex!=null && i < outResultIndex.size(); i++){
//            list.add(cstmt.getObject(outResultIndex.get(i)));
//        }
        return list;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public Root getObjById(String className, String id) throws Exception {
        Root root = null;
        String dbid = DBRouterUtils.getDBId();
        if (dbid == null) {
            root = baseDataMng.getObj(id, className);
        } else {
            root = baseDataMng.getObj(dbid, id, className);
        }

        return root;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public long getTotalCountBySql(String sql, List<Object> params)
            throws Exception {
        Map<String, Object> result =null;
        String countKey = "count(*)";
        List<Map<String,Object>> rlist=this.getObjListBySql(sql,params);
        if(rlist.size()>0){
            result =rlist.get(0);
        }
        if (result != null) {
            countKey = result.keySet().iterator().next();
            return Long.parseLong(result.get(countKey).toString());
        }

        return 0;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Map<String, Object>> getObjListBySql(String sql,
                                                     List<Object> objs) throws Exception {
        return baseDataMng.querySql(DBRouterUtils.getDBId(), sql, objs);
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Map<String, Object>> getObjListBySqlPaged(String sql, int page,
                                                          int pageSize, List<Object> params) throws Exception {
        //不分页
        List<Map<String, Object>> result = null;
        if (page == 0 && pageSize == -1) {
            return getObjListBySql(sql, params);
        }

        //分页
        String head = "select * from (select tt.*, rownum as rn from (";
        String end = ") tt where rownum <= ?) tb where tb.rn >= ?";
        String pagedSql = head + sql + end;

        //起始行
        int startRow = page * pageSize;
        int endRow = (page - 1) * pageSize + 1;

        List<Object> pas = new ArrayList<Object>();;
        if (params != null && !"".equals(params)) {
            pas.addAll(params);
        }
        pas.add(startRow);
        pas.add(endRow);

        result = getObjListBySql(pagedSql, pas);

        //当前页没有数据时，返回上一页的数据
        if (result != null && result.size() == 0 && page > 1) {
            //复制值
            List<Object> pas_1 = new ArrayList<Object>();
            if (params != null && !"".equals(params)) {
                pas_1.addAll(params);
            }
            startRow = (page - 1) * pageSize;
            endRow = (page - 2) * pageSize + 1;
            pas_1.add(startRow);
            pas_1.add(endRow);
            result = getObjListBySql(pagedSql, pas_1);
        }

        return result;
    }



}
