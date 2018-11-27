/*
 * Copyright (c) GeoWay All Rights Reserved. 2018.9.25.
 * 项目名称：MajinIdelScala
 * 工程名称：demo6
 * 文件名称：App.scala
 * 开始日期:18-9-25 下午5:08
 * Author:马锦
 * Version:1.0.0
 * 文件路径:D:/MajinIdelScala/demo6/src/main/scala/geo/net31/App.scala
 * 修改日期：18-9-20 上午9:40
 *
 */

package geo.net31

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
