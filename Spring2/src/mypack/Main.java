package mypack;
import org.springframework.beans.factory.BeanFactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class Main {
public static void main(String[] args) {
Resource r=new ClassPathResource("applicationcontext.xml");
BeanFactory factory=new XmlBeanFactory(r);
Employee e1=(Employee)factory.getBean("e1");
e1.display();
}
}
