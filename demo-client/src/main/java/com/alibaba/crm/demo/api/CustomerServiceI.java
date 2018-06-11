package com.alibaba.crm.demo.api;

import com.alibaba.crm.demo.dto.CustomerAddCmd;
import com.alibaba.crm.demo.dto.CustomerCheckConflictCmd;
import com.alibaba.crm.demo.dto.CustomerFindByCriteriaQry;
import com.alibaba.sofa.dto.MultiResponse;
import com.alibaba.sofa.dto.Response;
import com.alibaba.crm.demo.dto.clientobject.CustomerCO;

public interface CustomerServiceI {

    public Response addCustomer(CustomerAddCmd customerAddCmd);
    
    public MultiResponse<CustomerCO> checkConflict(CustomerCheckConflictCmd customerCheckConflictCmd);
    
    public MultiResponse<CustomerCO> findByCriteria(CustomerFindByCriteriaQry CustomerFindByCriteriaQry);
}
