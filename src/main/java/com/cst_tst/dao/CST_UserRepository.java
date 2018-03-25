package com.cst_tst.dao;

import com.cst_tst.model.CST_UserModel;
import org.springframework.data.repository.CrudRepository;

public interface CST_UserRepository extends CrudRepository<CST_UserModel, Long>{
    
}