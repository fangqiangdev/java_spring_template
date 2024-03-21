package com.xiudao.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 *
 * @author xiudao
 * @date 2022/12/14
 *
 * 1、只能拦截被spring托管的Bean
 * 2、在私有方法上不生效
 * 3、在final方法上不生效
 * 4、同一个类里面方法互相调用不生效
 *
 * JDK和CGLib动态代理有什么区别？
 * 两者实现的原理不同，JDK动态代理是基于Java反射来实现的，而CGLIB动态代理是基于修改字节码，生成子类来实现的，底层是使用的asm开源库。
 * 两者都有一些限制，JDK动态代理，Bean必须要有接口；CGLIB不能对final类或方法做代理。可以通过 @EnableAspectJAutoProxy(proxyTargetClass = true) 强制使用cglib
 */
@Aspect
@Component
public class MyAspect {

    @Around("execution(* com.xiudao.service.BizService2.run2(..))")
    public void aspect(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("方法调用前");
        joinPoint.proceed();
        System.out.println("方法调用后");
    }

}
