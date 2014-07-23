package org.android10.java.sample.proxy;

import java.lang.reflect.Proxy;

public class Main {

  public static void main(String[] args) {
    MySampleProxied mySampleClass = new MySampleProxiedImpl();

    MySampleProxied myProxy = (MySampleProxied) Proxy.newProxyInstance(Main.class.getClassLoader(),
        new Class[] { MySampleProxied.class }, new StopWatchInvocationHandler(mySampleClass));

    myProxy.printSomethingCool();
  }
}
