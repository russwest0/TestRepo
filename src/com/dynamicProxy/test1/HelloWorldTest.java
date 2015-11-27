package com.dynamicProxy.test1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;


public class HelloWorldTest {

    public static void main(String[] args) {
        HelloWorld helloWorld=new HelloWorldImpl();
        InvocationHandler handler=new HelloWorldHandler(helloWorld);
        
        //������̬�������
        HelloWorld proxy=(HelloWorld)Proxy.newProxyInstance(
                helloWorld.getClass().getClassLoader(), 
                helloWorld.getClass().getInterfaces(), 
                handler);
        proxy.sayHelloWorld();
    }
}
