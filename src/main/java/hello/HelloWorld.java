package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
    public static void main(String[] args) {
      LocalTime currentTime = new LocalTime();
		  System.out.println("The current local time is changed to  :  " + currentTime);
        System.out.println("\n\nTesting webhook changes on commit in jenkins 456");
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
