
public class Week2ConditionsAndLoops {

	public static void main(String[] args) {
		int age = 14;
		boolean hasLicense = false;
		System.out.println(age >= 16 && hasLicense);
		if (age >= 16 && hasLicense)
		{
			System.out.println("You can drive!");
		} else {
			System.out.println("You cannot drive!");
		}
		
		age = 18;
		System.out.println(age >= 16 && hasLicense);
		if (age >= 16 && hasLicense)
		{
			System.out.println("You can drive!");
		} else {
			System.out.println("You cannot drive!");
		}
		
		hasLicense = true;
		System.out.println(age >= 16 && hasLicense);
		if (age >= 16 && hasLicense)
		{
			System.out.println("You can drive!");
		} else {
			System.out.println("You cannot drive!");
		}

		double costOfMilk = 4.15;
		int thirstLevel = 4;
		if (costOfMilk < 2.5 || thirstLevel > 6)
		{
			System.out.println("Milk Please!");
		} else {
			System.out.println("No Thanks");
		}
		
		costOfMilk = 4.15;
		thirstLevel = 7;
		if (costOfMilk < 2.5 || thirstLevel > 6)
		{
			System.out.println("Milk Please!");
		} else {
			System.out.println("No Thanks");
		}
		
		costOfMilk = 2.15;
		thirstLevel = 7;
		if (costOfMilk < 2.5 || thirstLevel > 6)
		{
			System.out.println("Milk Please!");
		} else {
			System.out.println("No Thanks");
		}
		
		costOfMilk = 2.15;
		thirstLevel = 4;
		if (costOfMilk < 2.5 || thirstLevel > 6)
		{
			System.out.println("Milk Please!");
		} else {
			System.out.println("No Thanks");
		}
		
		int numberOfCookies = 10;
		int numberOfChildren = 10;
		int remainingCookies = numberOfCookies % numberOfChildren;
		if (remainingCookies == 0) {
			System.out.println("Sad Face!");
		} else if (remainingCookies < 2) {
			System.out.println("Yes!");
		} else if (remainingCookies < 5) {
			System.out.println("Whooohooooo!");
		} else {
			System.out.println("Jackpot!");
		}
		
		numberOfChildren = 9;
		remainingCookies = numberOfCookies % numberOfChildren;
		if (remainingCookies == 0) {
			System.out.println("Sad Face!");
		} else if (remainingCookies < 2) {
			System.out.println("Yes!");
		} else if (remainingCookies < 5) {
			System.out.println("Whooohooooo!");
		} else {
			System.out.println("Jackpot!");
		}
		
		numberOfChildren = 6;
		remainingCookies = numberOfCookies % numberOfChildren;
		if (remainingCookies == 0) {
			System.out.println("Sad Face!");
		} else if (remainingCookies < 2) {
			System.out.println("Yes!");
		} else if (remainingCookies < 5) {
			System.out.println("Whooohooooo!");
		} else {
			System.out.println("Jackpot!");
		}
		
		numberOfCookies = 17;
		numberOfChildren = 22;
		remainingCookies = numberOfCookies % numberOfChildren;
		if (remainingCookies == 0) {
			System.out.println("Sad Face!");
		} else if (remainingCookies < 2) {
			System.out.println("Yes!");
		} else if (remainingCookies < 5) {
			System.out.println("Whooohooooo!");
		} else {
			System.out.println("Jackpot!");
		}
		
		String loyaltyMemberStatus = "SILVER";
		double loyaltyMemberDiscount = 0.0;
		
		switch (loyaltyMemberStatus) {
			case "SILVER":
				loyaltyMemberDiscount = 0.1;
				break;
			case "GOLD":
				loyaltyMemberDiscount = 0.15;
				break;
			case "PLATINUM":
				loyaltyMemberDiscount = 0.25;
				break;
		}
		
		System.out.println(loyaltyMemberDiscount);
		
		double billTotal = 623.45;
		double adjustedTotal = billTotal - loyaltyMemberDiscount * billTotal;
		
		if (adjustedTotal > 500) {
			switch (loyaltyMemberStatus) {
				case "SILVER":
					loyaltyMemberStatus = "GOLD";
					break;
				case "GOLD":
					loyaltyMemberStatus = "PLATINUM";
					break;
				}	
		}
		
		System.out.println(loyaltyMemberStatus);
		System.out.println(adjustedTotal);
		
		String username = "John098";
		String password = "09876";
		
		if (username == "Tommy123" && password == "12345") {
			System.out.println("Login successful!");
		} else {
			System.out.println("Access denied!!!");
		}
		
		username = "Tommy123";
		password = "12345";
		
		if (username.equals("Tommy123") && password.equals("12345")) {
			System.out.println("Login successful!");
		} else {
			System.out.println("Access denied!!!");
		}
		
		for (int x = 0; x < 10; x++) {
			System.out.println(x);
		}
		
		for (int x = 10; x >= 0; x--) {
			System.out.println(x);
		}
		
		for (int x = 0; x <= 100; x+=2) {
			System.out.println(x);
		}
		
		for (int x = 0; x <= 100; x++) {
			if (x %2 ==0) {
				System.out.println(x + " Even");
			} else {
				System.out.println(x + " Odd");
			}
		}
		
		int x = 100;
		while ( x >= 0) {
			System.out.println(x + " Remainder = " + (x % 3));
			x--;
		}
			
		
		

	}

}
