package com.alibaba.crm.demo.domain.customer.rule.extension;

import com.alibaba.crm.demo.common.BizCode;
import com.alibaba.crm.demo.domain.customer.entity.CustomerE;
import com.alibaba.sofa.extension.Extension;
import com.alibaba.sofa.logger.Logger;
import com.alibaba.sofa.logger.LoggerFactory;
import com.alibaba.crm.demo.domain.customer.rule.extensionpoint.CustomerRuleExtPt;

@Extension(bizCode= BizCode.CGS)
public class CustomerCGSRuleExt implements CustomerRuleExtPt {
	Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public boolean addCustomerCheck(CustomerE customerE) {
		//Any Customer can be added
		return true;
	}
}
