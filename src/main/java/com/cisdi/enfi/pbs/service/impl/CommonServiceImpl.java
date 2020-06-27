package com.cisdi.enfi.pbs.service.impl;

import com.cisdi.enfi.pbs.service.CommonService;
import org.springframework.stereotype.Service;

@Service
public class CommonServiceImpl extends BaseServiceImpl implements CommonService {

    @Override
    public Number getCurrentMaxNumber(String tableName, String field, String condition) throws Exception {
        return null;
    }
}
