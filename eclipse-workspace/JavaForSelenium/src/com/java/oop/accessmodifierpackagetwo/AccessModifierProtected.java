package com.java.oop.accessmodifierpackagetwo;

import com.java.oop.accessmodifierpackageone.AccessModifierPrivate;

public class AccessModifierProtected extends AccessModifierPrivate{

	public static void main(String[] args) {
		AccessModifierProtected ob = new AccessModifierProtected();
		ob.bankName();			// Public
		ob.loanDetails();		// Protected
		//ob.atmPassword(); 	// Default
		//ob.internetBanking(); 	// Private
	}

}
