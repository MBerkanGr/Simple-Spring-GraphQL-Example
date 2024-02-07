package com.mehmetberkan.SpringGraphQLExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/***
 * QueryResolver -> Get
 * MutationResolver  -> Save , Update
 */

@SpringBootApplication
public class SpringGraphQlExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGraphQlExampleApplication.class, args);
	}

}
