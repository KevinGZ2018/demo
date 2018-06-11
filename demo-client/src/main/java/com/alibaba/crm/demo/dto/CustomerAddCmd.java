package com.alibaba.crm.demo.dto;

import com.alibaba.crm.demo.dto.clientobject.CustomerCO;
import com.alibaba.sofa.dto.Command;
import lombok.Data;

@Data
public class CustomerAddCmd extends Command{

    private CustomerCO customer;
    
}
