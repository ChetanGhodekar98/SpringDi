package Model;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Scanner scanner=new Scanner(System.in);
        System.out.println("1. NEXON");
        System.out.println("2. THAR");
        System.out.println("ENTER UR CHOICE");
        int choice= scanner.nextInt();

        Car car=null;
        if(choice==1){
            car=context.getBean("nexon", NexonCar.class);
        }else if(choice==2){
            car=context.getBean("thar", Thar.class);
        }else{
            System.out.println("INVALID CHOICE");
        }

        if(car!=null){
            car.getCarInformation();
            car.getEngineInformation();
        }else {
            System.out.println("SOMETHING WENT WRONG");
        }
    }
}
