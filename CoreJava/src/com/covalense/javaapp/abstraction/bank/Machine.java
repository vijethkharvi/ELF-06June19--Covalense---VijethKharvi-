package com.covalense.javaapp.abstraction.bank;

public class Machine {
void slot(ATMCard a) {
	a.validate();
	a.getInfo();
}
}
