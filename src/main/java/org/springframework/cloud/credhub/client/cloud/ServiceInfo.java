package org.springframework.cloud.credhub.client.cloud;

import org.springframework.cloud.service.UriBasedServiceInfo;

public class ServiceInfo extends UriBasedServiceInfo {
	private String userName;
	private String password;

	public ServiceInfo(String id, String url, String userName, String password) {
		super(id, url);
		this.userName = userName;
		this.password = password;
	}

	@Override
	public String getUserName() {
		return userName;
	}

	@Override
	public String getPassword() {
		return password;
	}
}
