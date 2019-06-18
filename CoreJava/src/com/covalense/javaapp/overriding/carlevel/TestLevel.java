package com.covalense.javaapp.overriding.carlevel;

public class TestLevel {

	public static void main(String[] args) {
Level1 l=new Level1();
l.speed();
Level1 l1=new Level2();
l1.speed();
Level1 l2=new Level3();
l2.speed();
	}

}
