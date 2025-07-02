#Missing Number Finder
This Java program finds the missing number in a sequence of consecutive natural numbers. It assumes that one number is missing from the complete sequence.

📌 Features
Takes an array of numbers from the user.

Calculates the missing number from the series.

Uses mathematical formula for efficiency.

💻 How to Run
Save the code in a file named missingNumber.java.

Open any Java IDE or use a terminal/command prompt with JDK installed.

Compile the program using:
javac missingNumber.java
Run the program:
java missingNumber
Input the elements as prompted (excluding the missing number).

📎 Example
Enter the number of elements to be added : 4  
1  
2  
4  
5  
The missing number is 3
🧠 Logic Explanation
The sum of first n natural numbers is given by:
(n∗(n+1))/2

Since one number is missing, we use n + 1 in the formula.

Subtract the sum of the user-entered numbers from the expected sum to get the missing number.

