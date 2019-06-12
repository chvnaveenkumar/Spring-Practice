package test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

		public static void main(String args[]) {
			ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
			// It will check xml document
			// it will create instances to singleton beans 
			// Class.forName("Test").newInstance(); Internally even constructor is private also.
			System.out.println("Document Valid");
			ap.getBean("t"); // if it is singletone instance is already created. if it is not singleton it will create at the time of 
							// calling ap.getBean.
			ap.getBean("t");
			ap.getBean("t");			
		}
}
