package Horlly.test.SpringCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7002_App
{
    public static void main( String[] args )
    {
        SpringApplication.run(EurekaServer7002_App.class,args);
        System.out.println( "Hello EurekaServer7002_App!" );
    }
}