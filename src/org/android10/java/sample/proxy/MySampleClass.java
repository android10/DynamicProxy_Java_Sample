/**
 * Copyright (C) 2014 android10.org. All rights reserved.
 * @author Fernando Cejas (the android10 coder)
 */
package org.android10.java.sample.proxy;

/**
 * Sample class that will be used with a Dynamic Proxy as part of this example.
 */
public class MySampleClass {

  public void printSomethingCool() {
    sleep(20);
    System.out.print("This is really cool...Dynamic Proxies rock!!!");
  }

  /**
   * Test method for sleeping.
   *
   * @param millis Amount of time to sleep.
   */
  private void sleep(long millis) {
    try {
      Thread.sleep(millis);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
