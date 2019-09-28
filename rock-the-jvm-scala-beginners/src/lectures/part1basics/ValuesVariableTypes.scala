package lectures.part1basics

/**
 *  Created by Ruiye on 28-Sep-2019.
 */

object ValuesVariableTypes extends App {

  val x: Int = 99
  println(x)

  // VALS ARE IMMUTABLE
  // the types of vals are optional
  // COMPILER can infer types

  // val aString: String = "hello"; val anotherString = "goodbye"
  // semicolon can separate expressions, but not recommend

  val aString: String = "hello"
  val anotherString = "goodbye"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 3423
  val aLong: Long = 3423972323423423422L
  val aFloat: Float = 2.0f //32bit
  val aDouble: Double = 3.14 //64bit

  // variables
  var aVariable: Int = 4

  aVariable = 5 // side effects: change a variable, display sth on screen, etc

}
