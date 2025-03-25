package in.tcs.__sb_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		int i =10;
		SpringApplication.run(Application.class, args);
		int j =20;
		System.out.println(i);
		int k = 30;
		System.out.println(k);

        double price =2123.90;

              String name ="PremReddy";

	}

}
