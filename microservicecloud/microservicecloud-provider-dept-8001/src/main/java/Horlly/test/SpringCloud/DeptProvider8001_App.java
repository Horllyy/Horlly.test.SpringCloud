package Horlly.test.SpringCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */

//@MapperScan(basePackages="Horlly.test.SpringCloud.dao")
@SpringBootApplication
@EnableEurekaClient
public class DeptProvider8001_App
{
    public static void main( String[] args )
    {
        SpringApplication.run(DeptProvider8001_App.class,args);
        System.out.println( "Hello World!" );
    }
}
