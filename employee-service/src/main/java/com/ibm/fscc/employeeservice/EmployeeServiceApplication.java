package com.ibm.fscc.employeeservice;

import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

@SpringBootApplication
public class EmployeeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
		UUID uuid = UUID.randomUUID();
        String uuidAsString = uuid.toString();

        System.out.println("Your UUID is: " + uuidAsString);
        


		ConnectionString connectionString = new ConnectionString("mongodb://employeedbuser:employeedbuserpwd@cluster0-shard-00-00.8b5zs.mongodb.net:27017,cluster0-shard-00-01.8b5zs.mongodb.net:27017,cluster0-shard-00-02.8b5zs.mongodb.net:27017/Employee?ssl=true&replicaSet=atlas-14dp5p-shard-0&authSource=admin&retryWrites=true&w=majority");
		MongoClientSettings settings = MongoClientSettings.builder()
		        .applyConnectionString(connectionString)
		        .build();
		MongoClient mongoClient = (MongoClient) MongoClients.create(settings);
		MongoDatabase database = mongoClient.getDatabase("test");

		
		

	}

}
