package com.cisdi.enfi.pbs.service;

import com.cisdi.enfi.pbs.vo.StudentVo;

import java.util.List;
import java.util.Map;

public interface StudentEnfiService {
    public List<Map<String, Object>> getAllStudents(
            StudentVo epVo) throws Exception;
}
