package com.repository;

import java.util.List;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

	@Query("select * from users where lname = ?0")
	List<User> findByLname(String lname);

}
