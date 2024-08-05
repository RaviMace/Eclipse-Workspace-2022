// Access Modifier
/* Access.M		Within Class	Within Package	Outside Package	 Outside Package
 * Key Words									  Sub-class()
 * Public			Yes				Yes				  Yes				Yes		
 * Protected		Yes				Yes				  Yes				 No	
 * Default			Yes				Yes				   No				 No
 * Private			Yes				 No				   No				 No
 */
package com.java.oop.accessmodifierpackageone;

public class AccessModifierPrivate {
	
	// public - access to all level
	public void bankName() {
		System.out.println("Having home loan in HDFC bank");
	}
	
	// protected - within the package and outside the package using inheritance concept
	protected void loanDetails() {
		System.out.println("50 lakhs Home Loan");
	}
	
	// default - no keyword - access only within the package
	void atmPassword() {
		System.out.println("2222 is ATM password");
	}
	
	// private - access only within THE CLASS
	private void internetBanking() {
		System.out.println("abc123 is Internet Banking password");
	}
	
	public static void main(String[] args) {
		AccessModifierPrivate ob = new AccessModifierPrivate();
		ob.bankName();
		ob.loanDetails();
		ob.atmPassword();
		ob.internetBanking();
	}

}
