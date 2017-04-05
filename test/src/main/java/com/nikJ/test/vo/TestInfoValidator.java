package com.nikJ.test.vo;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class TestInfoValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		
		return TestVO.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		TestVO testVO = (TestVO)target;
		
		if(testVO.getId() == null || testVO.getId().equals("")){
			errors.rejectValue("id", "required");
		}
		
		if(testVO.getName() == null || testVO.getName().equals("")){
			errors.rejectValue("name", "required");
		}
		
	}

}
