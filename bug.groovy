```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { element, index ->
    println "Element at index $index: $element"
    if (element == "someValue") {
      list.remove(element) // This line can cause an issue
    }
  }
}

List<String> myList = ["value1", "someValue", "value2", "someValue"]
myMethod(myList)
```