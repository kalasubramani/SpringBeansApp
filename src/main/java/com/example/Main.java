package com.example;

import java.util.function.Supplier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.Config.ProjectConfig;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
      var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

      Parrot p =context.getBean("parrot",Parrot.class);
      System.out.println( " Parrot Class : " +p);
      
      String appName = context.getBean("appName",String.class);
      Integer appCode = context.getBean("appCode",Integer.class);
      String appCodeString = context.getBean("appCode", String.class);

        System.out.println( "Hello World!" + p.getName() + "   "+ appName + "   "+appCode + "   " + appCodeString);
        //Parrot p = new Parrot();

        //add a bean to context programatically
        Myna MyMyMyna = new Myna();
        MyMyMyna.setName("MyMyMyna");

        Supplier<Myna> mynaSupplier = ()->MyMyMyna;

        context.registerBean("BeanMyMyMyna", Myna.class,mynaSupplier,bc->bc.setPrimary(true));

        Myna m = context.getBean(Myna.class);
        System.out.println("Programatically registered bean : " + m.getName());

        //bean relationships
        System.out.println("---------------bean relationships----------");
         System.out.println( " Parrot Class : " +p.getName());

         Person person = context.getBean(Person.class);
         System.out.println("Person class : " + person.getName());

         System.out.println("Bean rln -> "+ person.getParrot());

         //auto wiring
          System.out.println("AUTOWIRING Bean rln -> "+ person.getMyna());

    }
}

