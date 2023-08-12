package src.AOP;


import org.springframework.stereotype.Component;

@Component("lib")
public class Library {
    public void getBook(){
        System.out.println("I take Book");
    }
}
