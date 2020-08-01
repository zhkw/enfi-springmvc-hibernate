package com.cisdi.enfi.pbs.facade.impl;

import com.cisdi.enfi.pbs.facade.StudentFacade;
import com.cisdi.enfi.pbs.service.StudentEnfiService;
import com.cisdi.enfi.pbs.vo.StudentVo;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Component
@Transactional
public class StudentFacadeImpl implements StudentFacade {

    @Resource
    StudentEnfiService studentEnfiService;

    @Override
    @Transactional(propagation= Propagation.NOT_SUPPORTED)
    public List<Map<String, Object>> getAllStudents(StudentVo epVo) throws Exception {
        return studentEnfiService.getAllStudents(epVo);
    }
}
