package com.alibaba.crm.demo.command.extension;

import com.alibaba.crm.demo.command.extensionpoint.CustomerCheckConflictSearchConditionExtPt;
import com.alibaba.crm.demo.common.BizCode;
import com.alibaba.sofa.extension.Extension;

@Extension(bizCode = BizCode.CGS)
public class CustomerSearchConditionCGSExt implements CustomerCheckConflictSearchConditionExtPt {

    @Override
    public String getSearchCondition(String condition) {
        return "CGS Search Condition";
    }

}
