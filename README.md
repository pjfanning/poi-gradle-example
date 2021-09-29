# poi-gradle-example
A basic example demonstrating how to build and run a simple xlsx test using POI.

To test with the provided `Sample-Sales-Data.xlsx`:

Mac/Linux
```
./gradlew run
```

Windows
```
gradlew.bat run
```

To provide your own file - it is best to provide the full absolute file path:

Mac/Linux
```
./gradlew run --args=/path/my.xlsx
```

Windows
```
gradlew.bat run --args=C:\path\my.xlsx
```
