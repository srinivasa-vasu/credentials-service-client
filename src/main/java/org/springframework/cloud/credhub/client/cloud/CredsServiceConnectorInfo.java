package org.springframework.cloud.credhub.client.cloud;

import org.springframework.cloud.service.AbstractServiceConnectorCreator;
import org.springframework.cloud.service.ServiceConnectorConfig;

public class CredsServiceConnectorInfo
		extends AbstractServiceConnectorCreator<CredsService, ServiceInfo> {

	@Override
	public CredsService create(ServiceInfo serviceInfo,
			ServiceConnectorConfig serviceConnectorConfig) {
		return new CredsService(serviceInfo.getUri(), serviceInfo.getUserName(),
				serviceInfo.getPassword());
	}
}
