package com.cogent.SpringIOC;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
//        Product product = new Product();
//        product.setId(1);
//        product.setName("Laptop");
//        product.setPrice(23000);
        
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Product product = (Product)context.getBean("product");		//default returns Object so we type casted it into Product
        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(Arrays.toString(product.getRams()));			//a String array - String[]
        
        System.out.println(product.getLaptop().getId());
        System.out.println(product.getLaptop().getBrand());
        
        System.out.println(product.getLaptop().getColors());			//an ArrayList of type Strings IN LAPTOP
        
        System.out.println(product.getLaptop().getCountry());			//a HashMap of type Object (they keys), Object (the values) IN LAPTOP
        
        System.out.println(product.getLaptop().getEmployees());			//an ArrayList of type HashMap<Object, Object> IN LAPTOP
        
        System.out.println(product.getLaptop().getBodymanu());			//does not show the data, only reference
//        System.out.println(product.getLaptop().getBodymanu().getId()); 	//does NOT work due to BodyManu being an ArrayList in Laptop!
        
        Object[] bm = product.getLaptop().getBodymanu().toArray();		//so we can see the actual values, not the references
        for(Object obj:bm)
        {
        	System.out.print(((BodyManu)obj).getId() + " ");			//an int from BodyManu
        	System.out.println(((BodyManu)obj).getCompany());			// followed by a String from BodyManu
        }
        
        
    }
}
