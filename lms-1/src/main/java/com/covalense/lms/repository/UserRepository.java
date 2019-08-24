package com.covalense.lms.repository;




import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.covalense.lms.dto.UserRegisterBean;


public interface UserRepository extends CrudRepository<UserRegisterBean,Integer> {

	@Query("select u from UserRegisterBean u where u.email=:email" )
	public UserRegisterBean searchByEmail(@Param("email") String email);
	@Query("select u from UserRegisterBean u where u.userName LIKE CONCAT('%', :userName,'%')")
	public List<UserRegisterBean> searchByName(String userName);
}
