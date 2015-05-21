# battleground
This small app counts provided letter in downloaded site

## dependiences:
- java 1.8
- maven

## usage:
- build project using ```mvn install```
- ```cd target```
- ```java -jar battleground-jar-with-dependencies.jar <letter f.e.: 'a'> <url f.e.: http://time.com> ```
or:
- ```java -jar battleground-jar-with-dependencies.jar``` which takes default arguments ('a' and 'http://time.com')

## sample result:
```$ java -jar battleground-jar-with-dependencies.jar a http://time.com```

```There is 516 "a" letter in site: http://time.com```
