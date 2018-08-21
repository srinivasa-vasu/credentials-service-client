package org.springframework.cloud.credhub.client.cloud;

import java.util.Map;

import org.springframework.cloud.cloudfoundry.CloudFoundryServiceInfoCreator;
import org.springframework.cloud.cloudfoundry.Tags;

public class CredsServiceInfo extends CloudFoundryServiceInfoCreator<ServiceInfo> {

	public CredsServiceInfo() {
		super(new Tags("secrets", "credentails", "credhub"), "credhub-ref");
	}

	@Override
	public ServiceInfo createServiceInfo(Map<String, Object> serviceData) {
		Map<String, Object> credentials = getCredentials(serviceData);
		return new ServiceInfo((String) serviceData.get("name"), getUriFromCredentials(credentials),
				(String) credentials.get("username"),
				(String) credentials.get("password"));
	}
}
