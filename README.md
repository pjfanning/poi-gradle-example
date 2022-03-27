# poi-gradle-example
A basic example demonstrating how to use [Gradle](https://gradle.org/) to build and run a simple xlsx test using [POI](https://poi.apache.org/).

To test with the provided `Sample-Sales-Data.xlsx`:

Mac/Linux
```
./gradlew run
```

Windows
```
gradlew.bat run
```

To provide your own file to be read - it is best to provide the full absolute file path:

Mac/Linux
```
./gradlew run --args=/path/my.xlsx
```

Windows
```
gradlew.bat run --args=C:\path\my.xlsx
```

To see the imported dependency jars:

Mac/Linux
```
./gradlew dependencies
```

Windows
```
gradlew.bat dependencies
```
