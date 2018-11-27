/*
 * Copyright (c) GeoWay All Rights Reserved. 2018.10.19.
 * 项目名称：MajinIdelScala
 * 工程名称：demo5
 * 文件名称：App.scala
 * 开始日期:18-10-19 上午10:47
 * Author:马锦
 * Version:1.0.0
 * 文件路径:D:/MajinIdelScala/demo5/src/main/scala/geo/tools/App.scala
 * 修改日期：18-9-25 下午5:10
 *
 */

package geo.tools

/**
 * @author ${user.name}
 */
object App {
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {
    println( "Hello World!" )
    println("concat arguments = " + foo(args))
  }

}
