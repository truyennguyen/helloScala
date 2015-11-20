object hightOrderFnct {
  def abs(x: Double) = if(x < 0) -x else x

  def sqrtIter(guess : Double, x: Double): Double =
    if(isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)

  def isGoodEnough(guess: Double, x: Double) =
    abs(guess * guess - x) < 0.001

  def improve(guess:Double, x:Double) =
    (guess + x/guess) / 2

  def sqrt(x: Double) = sqrtIter(1.0, x)

  sqrt(2)
  sqrt(4)
  sqrt(1e-6)

  def sum(f: Int => Int, a :Int, b: Int): Int =
    if(a > b) 0
    else f(a) + sum(f, a, b)

  def sumInts(a: Int, b: Int): Int = sum(id, a, b)
  def sumCubes(a: Int, b: Int): Int = sum(cube, a ,b)
  def sumFactorials(a: Int, b: Int): Int = sum(fact,  a ,b)

  def id(x: Int): Int = x
  def cube(x: Int): Int = x * x * x
  def fact(x: Int): Int = if(x == 0) 1 else fact(x - 1)

  def sum2(f: Int => Int, a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a + 1, f(a) + acc)
    }
    loop(a, 0)
  }

  sum2(x => x * x, 3, 5)
}