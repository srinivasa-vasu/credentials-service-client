package org.springframework.cloud.credhub.client.config;

import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import org.springframework.cloud.credhub.client.cloud.CredsService;

@Configuration
@Profile({ "cloud" })
public class CloudConfiguration extends AbstractCloudConfig {
	@Bean
	public CredsService credsService() {
		return connectionFactory().service(CredsService.class);
	}
}
