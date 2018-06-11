package com.alibaba.crm.demo.domain.customer.convertor;

import com.alibaba.crm.demo.tunnel.dataobject.CustomerDO;
import com.alibaba.crm.demo.domain.customer.entity.CustomerE;
import com.alibaba.crm.demo.domain.customer.valueobject.CompanyType;
import com.alibaba.crm.demo.dto.clientobject.CustomerCO;
import com.alibaba.crm.demo.dto.clientobject.CustomerType;
import com.alibaba.sofa.common.ApplicationContextHelper;
import com.alibaba.sofa.convertor.ConvertorI;
import org.springframework.stereotype.Component;

/**
 * CustomerConvertor
 *
 * @author Frank Zhang
 * @date 2018-01-07 3:08 AM
 */
@Component
public class CustomerConvertor implements ConvertorI<CustomerCO, CustomerE, CustomerDO> {

    @Override
    public CustomerE clientToEntity(CustomerCO customerCO){
        CustomerE customerEntity = (CustomerE) ApplicationContextHelper.getBean(CustomerE.class);
        customerEntity.setCompanyName(customerCO.getCompanyName());
        customerEntity.setCompanyType(CompanyType.valueOf(customerCO.getCustomerType().name()));
        return customerEntity;
    }

    @Override
    public CustomerCO dataToClient(CustomerDO dataObject) {
        CustomerCO customerCO = new CustomerCO();
        customerCO.setCustomerName(dataObject.getCompanyName());
        customerCO.setCustomerType(CustomerType.valueOf(dataObject.getCompanyType()));
        customerCO.setMemberId(dataObject.getMemberId());
        customerCO.setCustomerId(dataObject.getCustomerId());
        return customerCO;
    }
}
