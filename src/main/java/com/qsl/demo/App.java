package com.qsl.demo;

import com.qsl.demo.api.IPayServer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"application.xml"});

        // 获取远程服务代理
        IPayServer IPayServer = (IPayServer)context.getBean("IPayServer");
        // 执行远程方法
        String hello = IPayServer.pay("world");
        // 显示调用结果
        System.out.println( hello );
    }
}
