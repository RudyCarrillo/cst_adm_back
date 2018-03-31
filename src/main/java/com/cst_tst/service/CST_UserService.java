package com.cst_tst.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cst_tst.dao.CST_UserRepository;
import com.cst_tst.model.CST_UserModel;

@Service
public class CST_UserService {

	@Autowired
	protected CST_UserRepository userRepository;

	public CST_UserModel save(CST_UserModel user) {
		// 
		return this.userRepository.save(user);	
	}
}
