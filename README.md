# MyFirstLibrary

You can create a pair of points and calculate the distance in kilometers in between the points


## How to...
Create points
Example:
```kotlin
val buenosAiresObeliscoPoint = Point(-34.6037389, -58.3815704)
val nycStatueOfLibertPoint      = Point(40.6892494, -74.0445004)
```

Calculate the distance in between
Example:
```kotlin
val distance = LatLonDistanceCalculator.calculateDistance(buenosAiresObeliscoPoint, nycStatueOfLibertPoint)
```

Complete Example:
```kotlin
val buenosAiresObeliscoPoint    = Point(-34.6037389, -58.3815704)
val nycStatueOfLibertPoint      = Point(40.6892494, -74.0445004)
val distance = LatLonDistanceCalculator.calculateDistance(buenosAiresObeliscoPoint, nycStatueOfLibertPoint)

textView.text = "There are ${distance.toFloat()} km in between"
```