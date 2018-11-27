/*
 * Copyright (c) GeoWay All Rights Reserved. 2018.9.25.
 * 项目名称：MajinIdelScala
 * 工程名称：demo6
 * 文件名称：specs.scala
 * 开始日期:18-9-25 下午5:08
 * Author:马锦
 * Version:1.0.0
 * 文件路径:D:/MajinIdelScala/demo6/src/test/scala/samples/specs.scala
 * 修改日期：18-9-20 上午9:40
 *
 */

package samples

import org.junit.runner.RunWith
import org.specs2.mutable._
import org.specs2.runner._
  

/**
 * Sample specification.
 * 
 * This specification can be executed with: scala -cp <your classpath=""> ${package}.SpecsTest
 * Or using maven: mvn test
 *
 * For more information on how to write or run specifications, please visit: 
 *   http://etorreborre.github.com/specs2/guide/org.specs2.guide.Runners.html
 *
 */
@RunWith(classOf[JUnitRunner])
class MySpecTest extends Specification {
  "The 'Hello world' string" should {
    "contain 11 characters" in {
      "Hello world" must have size(11)
    }
    "start with 'Hello'" in {
      "Hello world" must startWith("Hello")
    }
    "end with 'world'" in {
      "Hello world" must endWith("world")
    }
  }
}
