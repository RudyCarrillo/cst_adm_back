package com.cst_tst.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.cst_tst.model.CST_UserModel;
import com.cst_tst.service.CST_UserService;
import com.cst_tst.util.RestResponse;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mysql.jdbc.StringUtils;

@RestController
public class CST_UserController {
	
	@Autowired
    protected CST_UserService userService;    

	protected ObjectMapper mapper;
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public RestResponse save(@RequestBody String userJson) throws JsonParseException, JsonMappingException, IOException {
		this.mapper = new ObjectMapper();
		CST_UserModel user = this.mapper.readValue(userJson, CST_UserModel.class);
		
		if(!validate(user)) {
			return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(), "User not valid");
		}
		this.userService.save(user);
		
		return new RestResponse(HttpStatus.OK.value(),"OK");
	}
	
	private boolean validate(CST_UserModel user) {
		boolean isValid = true;	
		
		isValid = isValid & !StringUtils.isEmptyOrWhitespaceOnly(user.getUsername());
		isValid = isValid & !StringUtils.isEmptyOrWhitespaceOnly(user.getFirstName());
		isValid = isValid & !StringUtils.isEmptyOrWhitespaceOnly(user.getLastName());
		isValid = isValid & !StringUtils.isEmptyOrWhitespaceOnly(user.getEmail());
		isValid = isValid & !StringUtils.isEmptyOrWhitespaceOnly(user.getPassword());
		isValid = isValid & !StringUtils.isEmptyOrWhitespaceOnly(user.getPhone1());		
		
		return isValid;
	}
}
