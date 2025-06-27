# JAVA
This repository is about the basics of <b>JAVA</b> programming language which uses in many industrires for many reasons. In this, the basics are cleared and understand with the help of some examples that will use in further programmes. <b>LOGICS</b> are more important for every coder, so this is easy and best start for the building logics.<br>
<hr>
<h2>CONTENTS : </h2>
<ul>
  <li><b>CALCULATER</b></li>
  <li><b>Greatest Common Divisor</b></li>
  <li><b>Fibonacci Series</b></li>
  <li><b>PATTERNS</b></li>
</ul>
<hr>
<h3>CALCULATOR</h3>
  <div>Improved - <a href='https://github.com/himanshuaryan/JAVA/blob/main/calc4.java'>Calculator 5</a></div><br>
  <ol>
    <li><b><a href='https://github.com/himanshuaryan/JAVA/blob/main/calc0.java'>First</a></b> : Uses if-else condition and functions keyword..</li>
    <li><b><a href='https://github.com/himanshuaryan/JAVA/blob/main/calc1.java'>Second</a></b> : Replaced if-else with switch case for better functionality.</li>
    <li><b><a href='https://github.com/himanshuaryan/JAVA/blob/main/calc2.java'>Third</a></b> : Add while loop to execute continuously as user wants.</li>
    <li><b><a href='https://github.com/himanshuaryan/JAVA/blob/main/calc3.java'>First</a></b> : Improve the while loop with th do-whlie loop for better functioning. </li>
    <li><b><a href='https://github.com/himanshuaryan/JAVA/blob/main/calc4.java'>First</a></b> : Improve the readablity and functionality of the code.</li>
  </ol><br>

<h3>Greatest Common Divisor</h3>
  <div>Program - <a href='https://github.com/himanshuaryan/JAVA/blob/main/greatest common divisor.java'><b>Click Here</b></a></div><br>
  <ol>
    <li>GCD(int a, int b) Method:</li>
    <ul>
      <li>method takes two integers, a and b, as input.</li>
      <li>It initializ two integer arrays, s1 and s2, to store the divisors of a and b respectively. The arrays are sized to a and b which could lead to many zero entries if the numbers have few divisors.</li>
      <li>It iterates from 1 up to a (and b) to find all divisors of each number. If a number i divides a (or b) evenly, i is stored in the respective array.</li>
      <li>The method then prints the lists of divisors for both a and b.</li>
      <li>Finally, it compares the elements of s1 and s2 to find the largest common divisor, which is then assigned to the gcd variable. This approach involves iterating through all divisors and could be optimized.</li>
      <li>The calculated GCD is printed to the console.</li>
    </ul><br>
    <li>main(String[] args) Method:</li>
    <ul>
      <li>This is the program's starting point.</li>
      <li>It uses a Scanner to get two integer inputs from the user.</li>
      <li>It then calls the GCD() method with these two integers.</li>
      <li>After displaying the GCD, it prompts user if they want to calculate another GCD.</li>
      <li>The program continues to loop until the user enters anything other than "YES" (case-insensitive).</li>
      <li>A farewell message is displayed before the program exits.</li>
    </ul>
  </ol><br>

<h3>Fibonacci Series</h3>
  <div>Program - <a href='https://github.com/himanshuaryan/JAVA/blob/main/fibonacci series.java'><b>Click Here</b></a></div><br>
  <ol>
    <li>fibser(int a) method:</li>
    <ul>
      <li>Takes an integer a as input, representing the desired length of the Fibonacci series.</li>
      <li>Initializes an integer array fibValues of size a.</li>
      <li>Sets the first two elements of fibValues to 0 and 1 respectively (the base cases for the Fibonacci series).</li>
      <li>It then iteratively calculates the remaining Fibonacci numbers by adding the previous two numbers in the series and storing them in the fibValues array.</li>
      <li>Finally, it prints the calculated Fibonacci series to the console.</li>
    </ul><br>
    <li>main(String[] args) method:</li>
    <ul>
      <li> the entry point of the program.</li>
      <li>It uses a Scanner object to get input from the user.</li>
      <li>It prompts the user to enter a number greater than 1 to find its Fibonacci series.</li>
      <li>It calls the fibser() method with the user's input.</li>
      <li>After displaying the series, it asks the user if they want to find another Fibonacci series.</li>
      <li>The program continues to loop until the user enters "No" (case-insensitive).</li>
      <li>A thank you message is displayed when the user exits the program.</li>
    </ul>
  </ol>
<hr>
<div><b>Deeveloper : <a href='https://github.com/himanshuaryan'>HIMANSHU  ARYAN</b></div>
