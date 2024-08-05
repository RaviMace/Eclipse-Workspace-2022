package com.java.oop.accessmodifierpackagetwo;

import com.java.oop.accessmodifierpackageone.AccessModifierPrivate;

public class AccessModifierPublic {

	public static void main(String[] args) {
		AccessModifierPrivate ob = new AccessModifierPrivate();
		ob.bankName();			// Public
		//ob.loanDetails(); 	// Protected
		//ob.atmPassword(); 	// Default
		//ob.internetBanking();	// Private

	}

}
