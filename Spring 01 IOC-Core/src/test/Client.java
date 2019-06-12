package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

		public static void main(String args[]) {
			Resource resource = new ClassPathResource("resources/spring.xml");
			BeanFactory beanfactory = new XmlBeanFactory(resource);
			System.out.println("Document Valid");
			beanfactory.getBean("t"); // At the time of first user request bean is created.
			beanfactory.getBean("t");
			beanfactory.getBean("t");			
		}
}
