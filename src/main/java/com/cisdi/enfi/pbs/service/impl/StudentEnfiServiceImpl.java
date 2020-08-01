package com.cisdi.enfi.pbs.service.impl;

import com.cisdi.enfi.pbs.service.StudentEnfiService;
import com.cisdi.enfi.pbs.vo.StudentVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class StudentEnfiServiceImpl extends BaseServiceImpl implements StudentEnfiService {

    @Override
    @Transactional(propagation= Propagation.NOT_SUPPORTED)
    public List<Map<String, Object>> getAllStudents(StudentVo epVo) throws Exception {
        String sql = "SELECT id,name from CUX.CUX_TEST_STUDENT";
        String countSql = "SELECT count(*) from ("+sql+")";
        long total = this.getTotalCountBySql(countSql,null);
        Map<String,Object> map = new HashMap<>();
        map.put("total",total);
        List<Map<String,Object>> returnList = this.getObjListBySqlPaged(sql,epVo.getPage(),epVo.getPageSize(),null);
        returnList.add(0,map);
        return returnList;
    }
}
