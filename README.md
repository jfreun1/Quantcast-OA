# Quantcast-OA by Jacob Freund
Most Active Cookie

## Usage

1.  Make sure any test.csv is placed into the Test Files folder located in the src directory.
2.  CD into the src directory
3.  Build the solution (javac MostActiveCookies.java)
4.  Run file with the following command structure: java MostActiveCookie -f FILENAME.csv -d DATE

For Example:

```bash
javac MostActiveCookie.java
```


```bash
java MostActiveCookie -f defaultTest.csv -d 2018-12-08
```

produces the following output:
```bash
SAZuXPGUrfbcn5UA
fbcn5UAVanZf6UtG
4sMM2LxV07bPJzwf
```

Notice that the date is assumed to be formed YEAR-MONTH-DAY.
    

## The Challenge

Write a command line program in your preferred language to process the log file and return the most active cookie for specified day.

## The Assumptions

● You're only allowed to use additional libraries for testing, logging and cli-parsing. There are libraries for most languages which make this too easy (e.g pandas) and we’d like you to show off you coding skills.

● You can assume -d parameter takes date in UTC time zone.

● You have enough memory to store the contents of the whole file.

● Cookies in the log file are sorted by timestamp (most recent occurrence is first line of the file).

## The Solution

Note that, since the cookies are sorted by timestamp, we can use a modified Binary Search to find the date we are looking for.  Once the date is found, we can use a HashMap frequency table to quickly find a list of the most used items (if there is a tie).  Furthermore, we utilize JUnit test to tests are functions.

## Room for Improvement

1.  More JUnit test could be developed.
2.  There are no checks for properly formatted input.  That is, we must assume that the imput is given exactly.
3.  We are not writing/saving our answer to a file.
4.  It is possible to abstract the code more using Object Oriented Programming.

##  Proof

<img width="719" alt="Screen Shot 2022-02-12 at 10 09 56 PM" src="https://user-images.githubusercontent.com/54517670/153738277-8a101c2b-4757-48c6-85f8-cd188743dddc.png">

