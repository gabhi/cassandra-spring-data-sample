package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.java.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@EnableCassandraRepositories(basePackages = "com.repository")
@ComponentScan(basePackages = { "com" })
public class AppConfiguration extends AbstractCassandraConfiguration {

	@Override
	protected String getKeyspaceName() {
		return "fatih";
	}

	
	
}
