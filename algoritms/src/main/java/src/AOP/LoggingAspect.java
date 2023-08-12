package src.AOP;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(public void src.AOP.Library.get*())")//pointCut
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: try to get book");
    }

}
