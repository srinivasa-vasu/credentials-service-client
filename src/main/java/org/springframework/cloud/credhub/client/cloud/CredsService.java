package org.springframework.cloud.credhub.client.cloud;

import java.util.StringJoiner;

public class CredsService {

	private final String uri;
	private final String userName;
	private final String password;

    public CredsService(String uri, String userName, String password) {
        this.uri = uri;
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", "{", "}")
                .add("\"uri\": \"" + uri + "\"")
                .add("\"userName\": \"" + userName + "\"")
                .add("\"password\": \"" + password + "\"")
                .toString();
    }
}
