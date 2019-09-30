package lectures.part1basics

object Expressions extends App{

  val x = 1 + 2 // EXPRESSION
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= ..... side effects (change variable)
  println(aVariable)

  // Instructions (sth tells computer to DO) vs Expression (sth has a VALUE and/or type)

  // IF expression
  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3 // IF EXPRESSION
  println(aConditionValue)
  println(if(aCondition) 5 else 3)
  println(5 + 3)

  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  // NEVER WRITE WHILE LOOP AGAIN, very specific to imperative programming

  // Scala enforces EVERYTHING to be an EXPRESSION!

  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue)

  // side effects: println(), whiles, reassigning vars
  // side effects are reminiscent of imperative programming that is they are like instructions
  // but in Scala they are still expressions returning units

  // Code blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

  // 1. difference between "hello world" vs println("hello world")?
  // "hello world" is value of type string, is a string
  // println("hello world") is an expression of a side effect, is a unit

  // 2. What is the value of someValue and someOtherValue?
  // someValue value is true
  // someOtherValue value is 42

  val someValue = {
    2 < 3
  }
  println(someValue)

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }
  println(someOtherValue)


}
