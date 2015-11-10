package demo

import org.scalatest.FunSuite

/**
 * Created by truynguyen on 11/9/15.
 */
class HelloTest extends FunSuite{
  test("sayHello method work correctly"){
    val hello = new Hello
    assert(hello.sayHello("Scala") == "Hello, Scala!")
  }
}
