```groovy
def myMethod(List<Integer> numbers) {
    println numbers.sum()  // This line might throw a NullPointerException
}

myMethod(null) // Passing a null List
```