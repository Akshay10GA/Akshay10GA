package com.springorm.ExpenseManagement;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	BeanFactory bf = new ClassPathXmlApplicationContext("spring.xml");
    	Vehicle vc = (Vehicle) bf.getBean("bike");
    	vc.eat();
    	
    }
}
