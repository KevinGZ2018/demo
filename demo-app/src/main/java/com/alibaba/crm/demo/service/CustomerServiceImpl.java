package com.alibaba.crm.demo.service;

import com.alibaba.crm.demo.dto.CustomerCheckConflictCmd;
import com.alibaba.crm.demo.dto.CustomerFindByCriteriaQry;
import com.alibaba.sofa.command.CommandBusI;
import com.alibaba.sofa.dto.MultiResponse;
import com.alibaba.sofa.dto.Response;
import com.alibaba.crm.demo.api.CustomerServiceI;
import com.alibaba.crm.demo.dto.CustomerAddCmd;
import com.alibaba.crm.demo.dto.clientobject.CustomerCO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Note that HSFProvider requires Pandora Container. You can comment it out during development time.
 */
//@HSFProvider(serviceInterface = CustomerServiceI.class)
@Service
public class CustomerServiceImpl implements CustomerServiceI {

    @Autowired
    private CommandBusI commandBus;
    
    @Override
    public Response addCustomer(CustomerAddCmd customerAddCmd) {
        return (Response)commandBus.send(customerAddCmd);
    }

    @Override
    public MultiResponse<CustomerCO> checkConflict(CustomerCheckConflictCmd customerCheckConflictCmd) {
        return (MultiResponse<CustomerCO>)commandBus.send(customerCheckConflictCmd);
    }

    @Override
    public MultiResponse<CustomerCO> findByCriteria(CustomerFindByCriteriaQry CustomerFindByCriteriaQry) {
        return (MultiResponse<CustomerCO>)commandBus.send(CustomerFindByCriteriaQry);
    }

}
