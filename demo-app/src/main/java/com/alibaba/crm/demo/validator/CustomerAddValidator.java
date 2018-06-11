package com.alibaba.crm.demo.validator;

import org.springframework.stereotype.Component;

import com.alibaba.sofa.logger.Logger;
import com.alibaba.sofa.logger.LoggerFactory;
import com.alibaba.crm.demo.dto.CustomerAddCmd;
import com.alibaba.crm.demo.validator.extensionpoint.CustomerAddValidatorExtPt;

@Component
public class CustomerAddValidator implements CustomerAddValidatorExtPt {

	private Logger logger = LoggerFactory.getLogger(CustomerAddValidator.class);
	
	@Override
	public void validate(Object candidate) {
		logger.debug("Do common validation");
		CustomerAddCmd addCmd = (CustomerAddCmd)candidate;
	}
}
