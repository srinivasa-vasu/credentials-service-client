package org.springframework.cloud.credhub.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.cloud.credhub.client.cloud.CredsService;

@RestController
public class CredentialsServiceController {

	private final CredsService credsService;

	public CredentialsServiceController(CredsService credsService) {
		this.credsService = credsService;
	}

	@GetMapping(value = "/secrets", produces = "application/json")
	public String getCredsService() {
		return credsService.toString();
	}
}
