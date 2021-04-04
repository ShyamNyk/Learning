package com.shyam.learning.multithreading;

/*1)transient keyword is used along with instance variables to exclude them from the serialization process. 
if a field is transient its value will not be persisted.
On the other hand, the volatile keyword can also be used in variables to indicate 
compiler and JVM that always read its value from the main memory and follow happens-before relationship on the visibility of volatile variables among multiple threads
*/

/*2) transient keyword can not be used along with static keyword but volatile can be used along with static.*/

/*3) transient variables are initialized with default value during de-serialization and there assignment or restoration of value has to be handled by application code.*/

public class DifferenceBetweenTransientVolatile {

}
