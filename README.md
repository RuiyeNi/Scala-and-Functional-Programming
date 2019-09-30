# Scala-and-Functional-Programming

## Section 1: The Absolute Scala Basics
### Values, Variables and Types
Takeaways 2019.09.28
``` Scala
val x: Int = 2 
// name: type (can be inferred)
// immutable = can't be assigned 

var x: Int = 1
x = 1
x += 1
//mutable
```
- prefer vals over vars
- all vals and vars have types
- compiler automatically infer types when omitted
- learned how to use basic types

### Expressions
Takeaways 2019.09.29
``` Scala
// Basic expressions: operators
val x = 3 + 5
val xIsEven = x % 2 == 0
val xIsOdd = !xIsEven

// if in Scala is an expression
val cond: Boolean = ...
val i = if (cond) 42 else 0

// Code blocks in Scala are expressions
// the value of the block is the value of its last expression
val x = {
	val cond: Boolean: = ...
	if (cond) 42 else 0
}
```

Expressions vs. Instructions
- instructions are *executed*(think Java), expressions are *evaluated*(Scala)
	- executed: do sth
	- evaluated: give me the value of sth
- in Scala we'll think in terms of expressions

*DO NOT* use while loops in your Scala code. 