package FactorialException;
// ****************************************************************
// MathUtils.java
//
// Provides static mathematical utility functions.
//
// ****************************************************************
public class MathUtils
{
//-------------------------------------------------------------
// Returns the factorial of the argument given
//-------------------------------------------------------------
public static int factorial(int n) throws IllegalArgumentException
{
if(n <= 0){
    throw new IllegalArgumentException("Number is less than 1.");
}
if(n > 16){
    throw new IllegalArgumentException("Number is grater than 16. Integer will not accept that.");
}
int fac = 1;
for (int i=n; i>0; i--)
fac *= i;
return fac;
}
}