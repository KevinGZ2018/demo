package com.alibaba.crm.demo.command;

import com.alibaba.crm.demo.dto.CustomerCheckConflictCmd;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.sofa.command.Command;
import com.alibaba.sofa.command.CommandExecutorI;
import com.alibaba.sofa.dto.MultiResponse;
import com.alibaba.sofa.extension.ExtensionExecutor;
import com.alibaba.crm.demo.command.extensionpoint.CustomerCheckConflictSearchConditionExtPt;
import com.alibaba.crm.demo.dto.clientobject.CustomerCO;
import com.alibaba.crm.demo.dto.CustomerCheckConflictCmd;

@Command
public class CustomerCheckConflictCmdExe implements CommandExecutorI<MultiResponse<CustomerCO>, CustomerCheckConflictCmd>{

    @Autowired
    private ExtensionExecutor extensionExecutor;
    
    @Override
    public MultiResponse<CustomerCO> execute(CustomerCheckConflictCmd cmd) {
        System.out.println("Shared logic");
        String searchCondition = extensionExecutor.execute(
                                   CustomerCheckConflictSearchConditionExtPt.class,
                                   extension -> extension.getSearchCondition("condition"));
        System.out.println("Shared logic with "+ searchCondition);
        return MultiResponse.of(null, 0);
    }

}
