package com.cisdi.enfi.pbs.facade;

import com.cisdi.enfi.pbs.vo.EquipmentPriceLibVo;
import com.cisdi.enfi.pbs.vo.StudentVo;

import java.util.List;
import java.util.Map;

public interface StudentFacade {
    public List<Map<String,Object>> getAllStudents(StudentVo epVo) throws Exception;
}
