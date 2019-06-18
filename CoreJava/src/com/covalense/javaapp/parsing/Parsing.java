package com.covalense.javaapp.parsing;

public class Parsing {

	public static void main(String[] args) {
String a="1";
String b="2";
String c="1.12";
String d="true";
System.out.println(a+b);
int i=Integer.parseInt(a);
int j=Integer.parseInt(b);
System.out.println(i+j);
double d1=Double.parseDouble(c);
System.out.println(d1);
boolean boo=Boolean.parseBoolean(d);
System.out.println(boo);

	}

}
