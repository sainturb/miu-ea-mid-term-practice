package miu.edu.term.mid.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class MyAspect {

    @Autowired
    private NotificationService service;

    @Autowired
    private HttpServletRequest request;


    @Pointcut("@annotation(MyAnnotation)")
    public void trigger() {}

    @Around("trigger()")
    public Object run(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long end = System.currentTimeMillis();
        if (end - start > 10) {
            if (request.getMethod().equals("POST") || request.getMethod().equals("PUT") ) {
                service.sendNotification(request.getHeader("CLIENT_ID"), "message");
            }
        }
        return result;
    }

}
