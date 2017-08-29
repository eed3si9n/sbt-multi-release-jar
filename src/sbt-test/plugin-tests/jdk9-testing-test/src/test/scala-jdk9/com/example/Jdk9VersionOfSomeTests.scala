package com.example

import org.scalatest._

class Jdk9VersionOfSomeTests extends WordSpec with Matchers {

  "src/test/scala-jdk9 tests" should {

    "only run on JDK9" in {
      System.getProperty("java.version") should === ("9")
    }
    
    "load the JDK9 specific class" in {
      val impl = new MyJavaVersionDependentForTest
      impl.loaded should ===("jdk9")
      impl.running should ===("1.9")
    }

  }
}
