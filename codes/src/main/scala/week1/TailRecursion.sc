def normalFactorial(n: Int): Int =
  if (n == 0) 1 else n * normalFactorial(n - 1)


def factorial(n: Int): Int = {
  if (n == 0) 1 else n * factorial(n - 1)
  def tailFactorial(acc: Int, n: Int) : Int ={
    if (n == 0)  acc
    else tailFactorial(acc * n, n - 1)
  }
  tailFactorial(1, n)
}