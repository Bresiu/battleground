# battleground
This small app counts provided letter in downloaded site

## dependiences:
- java 1.8
- maven

## usage:
- build project using ```mvn install```
- ```cd target```
- ```java -jar battleground-jar-with-dependencies.jar <character f.e.: 'a'> <url f.e.: http://time.com> ```
or:
- ```java -jar battleground-jar-with-dependencies.jar``` which takes default arguments ('a' and 'http://time.com')

if provided arguments are not valid (character length != 1, or address is not valid url address), program will use default arguments

## sample result:
```$ java -jar battleground-jar-with-dependencies.jar a http://time.com```

```There is 516 "a" character in site: http://time.com```
