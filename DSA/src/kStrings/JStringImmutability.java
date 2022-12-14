package kStrings;
/*
String in java is immutable[ because of springpool - memory optimization]

Once u created a string its not allowed to change the string
we cannot add or remove characters , or not even substitute characters

This is because of memory optimisation , in stringpool

Say suppose if we have string as mutable , if a create
a string with String st = "Apple"; this will be stored in stringpool
in nextline i creates String st1 = "Apple"; , now java will give the same
reference to st1 , as that of st because both are of same value
if string become mutable , i tried to change st value , then as the st1 also
has the same reference its value will also get changed this results in unwanted changes
as st1 doesnot want to change to its value, this result in confusion , errors a lot mess

So this is the reason we cannot change the string once created
even we create with String st2 = new String("Apple"); this is also immutable


Now lets say i have
String st = "abc";
st = st+"abc";
System.out.println(st); //this will be abcabc

is this not contradicting to what we have discussed?
Not. because abc is not modified , the step st+"abc" will create a new string
and its memory address will be given to st
this will create a new string and return

 */
public class JStringImmutability {

}
