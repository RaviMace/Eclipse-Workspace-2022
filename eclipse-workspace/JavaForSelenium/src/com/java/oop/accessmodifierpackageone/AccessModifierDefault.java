package com.java.oop.accessmodifierpackageone;

public class AccessModifierDefault {

	public static void main(String[] args) {
		AccessModifierPrivate ob = new AccessModifierPrivate();
		ob.bankName();			// Public
		ob.loanDetails();		// Protected
		ob.atmPassword();		// Default
		//ob.internetBanking();	// Private
	}

}
