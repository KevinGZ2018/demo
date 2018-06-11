package com.alibaba.crm.demo.assembler;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.sofa.assembler.AssemblerI;
import com.alibaba.crm.demo.dto.clientobject.CustomerCO;

public class CustomerAssembler implements AssemblerI{

	public Map<String, String> assembleQueryParam(CustomerCO customerCO) {
		
		return new HashMap<>();
	}
}
