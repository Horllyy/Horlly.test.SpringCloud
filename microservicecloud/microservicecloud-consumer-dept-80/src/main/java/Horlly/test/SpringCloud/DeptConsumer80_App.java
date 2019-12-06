package Horlly.test.SpringCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */

@SpringBootApplication
public class DeptConsumer80_App
{
    public static void main( String[] args )
    {
        SpringApplication.run(DeptConsumer80_App.class,args);
        System.out.println( "Hello consumer!" );
    }
}
