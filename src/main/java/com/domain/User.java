package com.domain;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

import lombok.Data;

@Table("users")
@Data
public class User {

	@PrimaryKey
	private int user_id;
	private String fname;
	private String lname;
}
