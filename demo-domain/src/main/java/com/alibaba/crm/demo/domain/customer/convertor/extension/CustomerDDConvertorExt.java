package com.alibaba.crm.demo.domain.customer.convertor.extension;

import com.alibaba.crm.demo.common.AppConstants;
import com.alibaba.crm.demo.common.BizCode;
import com.alibaba.crm.demo.tunnel.dataobject.CustomerDO;
import com.alibaba.crm.demo.domain.customer.convertor.CustomerConvertor;
import com.alibaba.crm.demo.domain.customer.convertor.extensionpoint.CustomerConvertorExtPt;
import com.alibaba.crm.demo.domain.customer.entity.CustomerE;
import com.alibaba.crm.demo.domain.customer.valueobject.SourceType;
import com.alibaba.crm.demo.dto.clientobject.CustomerCO;
import com.alibaba.sofa.extension.Extension;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * CustomerDDConvertorExt
 *
 * @author Frank Zhang
 * @date 2018-01-08 1:57 PM
 */
@Extension(bizCode = BizCode.DD)
public class CustomerDDConvertorExt implements CustomerConvertorExtPt {

    @Autowired
    private CustomerConvertor customerConvertor;//Composite basic convertor to do basic conversion

    @Override
    public CustomerE clientToEntity(CustomerCO customerCO) {
        CustomerE customerEntity = customerConvertor.clientToEntity(customerCO);
        //In this business, AD and RFQ are regarded as different source
        if(AppConstants.SOURCE_AD.equals(customerCO.getSource()))
        {
            customerEntity.setSourceType(SourceType.AD);
        }
        if (AppConstants.SOURCE_RFQ.equals(customerCO.getSource())){
            customerEntity.setSourceType(SourceType.RFQ);
        }
        return customerEntity;
    }

    public CustomerCO dataToClient(CustomerDO customerDO){
        return customerConvertor.dataToClient(customerDO);
    }
}
