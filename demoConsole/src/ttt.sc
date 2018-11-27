import scala.language.postfixOps
val a = 5

val s = " women"

 a+s    //a.+(s)


s*a   // s.*(a)


s+a    //s.+(a)


val set = Set(1,2,3,4,45,3,2,6)
println(set)

1 to 5 toList

val m = List(("北京",1),("上海",3),("天津",2), ("北京",2), ("北京",1), ("上海",4), ("北京",2))
m.groupBy { x => x._1 }


val list=List(1,2,3,4,5)
for(elem<-list ) println(elem)
list.fold(10)(_+_)


val colorNum = 3
val colorStr = colorNum match {
  case 1 => "red"
  case 2 => "green"
  case 3 => "yellow"
  case 4 => "Not Allowed"
}
println(colorStr)


val university = Map("XMU" -> "Xiamen University", "THU" -> "Tsinghua University","PKU" -> "peking University")
  for ((k,v)<- university) printf("Code is : %s and name is: %s\n",k,v)


abstract class Person
case class Teacher(name:String,age:Int,teacherNo:Int) extends Person

val ss=Teacher("john",38,1024)
println(ss)

class Foo{}
object FooMaker { def apply() = new Foo }
val newFoo = FooMaker()


sc.version
