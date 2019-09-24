import scala.math.abs
def sqrt(x: Double) = {
  @scala.annotation.tailrec
  def sqrtIter(guess: Double): Double =
    if (isGoodEnough(guess)) guess
    else sqrtIter(improve(guess))

  def improve(guess: Double) =
    (guess + x / guess) / 2

  def isGoodEnough(guess: Double) =
    abs(guess * guess - x) < 0.001
  sqrtIter(1.0)
}
sqrt(2)
sqrt(4)
sqrt(1e-6)
sqrt(1e16)



