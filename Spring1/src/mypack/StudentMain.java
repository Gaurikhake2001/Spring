package mypack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext.xml");
		Student s1 = (Student)ctx.getBean("s1");
		
		System.out.println(s1);
	}

}
