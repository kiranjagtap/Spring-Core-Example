import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.service.ShapeService;

@Configuration
@ComponentScan({"com.aop"})
public class AopMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService service = context.getBean("shapeService", ShapeService.class);
		service.getCircle().setName("First Circle");
		//service.getCircle().setNameAndReturn("Circle");
		System.out.println(service.getCircle().getName());

    	//System.out.println(service.getTriangle().getName());

		/*AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopMain.class);
		ShapeService service = applicationContext.getBean(ShapeService.class);
		service.getCircle().setName("Circle using annotation");
		System.out.println(service.getCircle().getName());*/

		
	}

}
