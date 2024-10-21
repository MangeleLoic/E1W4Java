package epicode.D1W4;


import epicode.D1W4.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



@SpringBootApplication
public class D1W4Application {

	public static void main(String[] args) {
		SpringApplication.run(D1W4Application.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(D1W4Application.class);

		Menu menu =context.getBean(Menu.class);
		System.out.println(menu);

	}


}
