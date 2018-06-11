package com.alibaba.crm.demo.command.extensionpoint;

import com.alibaba.sofa.extension.ExtensionPointI;

public interface CustomerCheckConflictSearchConditionExtPt extends ExtensionPointI{
    
    public String getSearchCondition(String condition);
}
