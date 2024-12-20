# Groovy List Modification During Iteration

This example demonstrates a common issue in Groovy when modifying a list while iterating over it using `eachWithIndex`. Removing elements during iteration can cause the loop to skip elements or throw an exception.

## Bug
The `myMethod` function iterates through a list of strings. If an element matches "someValue", it's removed. This approach causes a problem because the index-based iteration doesn't adjust correctly when an element is removed, leading to skipped elements.

## Solution
The solution uses an iterator to safely remove elements while iterating. This avoids the index-based iteration issues of the original code.