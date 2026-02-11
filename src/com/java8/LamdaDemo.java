package com.java8;

public class LamdaDemo {
public static void main(String[] args) {
	MyFunctionalInterface max = (a,b) -> a>b?a:b;
	System.out.println(max.maximum(10, 20));
}
}
