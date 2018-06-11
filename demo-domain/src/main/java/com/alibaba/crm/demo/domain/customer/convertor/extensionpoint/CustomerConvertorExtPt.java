package com.alibaba.crm.demo.domain.customer.convertor.extensionpoint;

import com.alibaba.crm.demo.domain.customer.entity.CustomerE;
import com.alibaba.crm.demo.dto.clientobject.CustomerCO;
import com.alibaba.sofa.convertor.ConvertorI;
import com.alibaba.sofa.extension.ExtensionPointI;

/**
 * CustomerConvertorExtPt
 *
 * @author Frank Zhang
 * @date 2018-01-07 2:37 AM
 */
public interface CustomerConvertorExtPt extends ConvertorI, ExtensionPointI {

    public CustomerE clientToEntity(CustomerCO customerCO);
}
