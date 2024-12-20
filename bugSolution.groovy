```groovy
def myMethod(List<String> list) {
  Iterator<String> iterator = list.iterator()
  while (iterator.hasNext()) {
    String element = iterator.next()
    println "Element: $element"
    if (element == "someValue") {
      iterator.remove()
    }
  }
}

List<String> myList = ["value1", "someValue", "value2", "someValue"]
myMethod(myList)
println myList //Verify the list after removal
```