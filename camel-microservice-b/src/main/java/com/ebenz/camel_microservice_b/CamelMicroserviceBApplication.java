package com.ebenz.camel_microservice_b;

import com.ebenz.camel_microservice_b.repo.DataRecordRepository;
import com.ebenz.camel_microservice_b.routes.FileRouter;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CamelMicroserviceBApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamelMicroserviceBApplication.class, args);
	}
	//@Autowired
	//private DataRecordRepository dataRecordRepository;
	//private FileRouter fileRouter;
	@Bean
	public FileRouter fileRouter(){
		//fileRouter.configure();
		return new FileRouter();
	}

//	public void setFileRouter(FileRouter fileRouter) throws Exception {
//		this.fileRouter = fileRouter;
//
//	}
}
