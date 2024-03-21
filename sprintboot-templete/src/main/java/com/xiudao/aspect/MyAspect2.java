package com.xiudao.aspect;

import org.aopalliance.aop.Advice;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.Pointcut;
import org.springframework.aop.PointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;
import org.springframework.stereotype.Service;

/**
 *  1、spring aop 是java层面的增强，通过java动态代理 或 cglib修改字节码 创建一个接口、或类的 子类。然后对这个子类增强.
 *  2、springboot 2.0 （默认使用cglib）
 *  3、java 动态代理有个缺点只能对接口代理，cglib则更加通用，可以对类代理
 *
 *  使用spring aop的原理是运行时生成一个代理类的子类。把代理类的方法包装起来 （debug时通过 this.getClass().getSuperClass() == '被切面的类'  就能看出来）
 *
 * @author xiudao
 * @date 2022/12/13
 */
@Service
public class MyAspect2 implements MethodInterceptor, PointcutAdvisor { // 这是aop的第二种方式（不建议使用），这种方式构造Pointcut不友好，还是用@Aspect注解的方式更简单些。
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("===");
        methodInvocation.proceed();
        System.out.println("+++++");
        return null;
    }

    @Override
    public Advice getAdvice() {
        return this;
    }


    @Override
    public boolean isPerInstance() {
        return false;
    }

    @Override
    public Pointcut getPointcut() {
        NameMatchMethodPointcut pointcut = new NameMatchMethodPointcut();
        pointcut.setMappedName("run3*"); // 拦截所有类中的run3开头的方法
        return pointcut;
    }
}
