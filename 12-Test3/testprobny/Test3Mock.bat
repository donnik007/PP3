@echo off
pause
if exist *.class del *.class

echo *******************
echo Compilation...
javac Check3Mock.java
javac Person.java
javac Isogram.java
javac Logic.java
javac Number.java
javac Cities.java
javac Pizza.java
javac Numbers.java
javac Product.java

echo *******************
echo Checking classes...
java -ea Check3Mock

echo *******************
pause
