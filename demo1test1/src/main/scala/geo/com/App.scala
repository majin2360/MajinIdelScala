/*
 * Copyright (c) GeoWay All Rights Reserved. 2018.9.25.
 * 项目名称：MajinIdelScala
 * 工程名称：demo1
 * 文件名称：App.scala
 * 开始日期:18-9-25 下午5:11
 * Author:马锦
 * Version:1.0.0
 * 文件路径:D:/MajinIdelScala/demo1/src/main/scala/geo/com/App.scala
 * 修改日期：18-9-25 下午5:10
 *
 */

package geo.com

object App {
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {
    println( "Hello World!" )
    println("concat arguments = " + foo(args))
  }

}
