// SOLID Design Principles
	// 1. Single responsibility principle
		// Every Java class must implement only a single functionality/ Should have a single responsibility
		// Example:
			// Selenium Framework
				// POM
					// One class responsible for only one web page
				// Very specific helper classes( ExcelHelper, DatabaseHelper etc.)
				// Selenium API has browser specific driver classes( FirefoxDriver, ChromeDriver etc.)
	// 2. Open-Closed Principle
		// Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification
		// Once a class has been developed and tested, the class code shouldn’t change except for any bug fixes
		// New functionalities should be added without modifying the existing code/functionality
			// By adding new classes(inheritance)/code as required
		// Example
			/*
			 Suppose we are automating E-Commerce application
			 We have Customer class to represent the customers and it's actions
			 Now, the company has introduced VIP customers
			 Create a new VipCustomer class by inheriting from Customer class
			*/
	// 3. Liskov substitution Principle (LSP)
		// The child classes must be substituted for it's parents class
		// Example
			/*
			Considering the above example,
			 There is a method calculateDeliveryCharge(Customer customer)
			 It calculates delivery charge when customer information is passed
			 When we pass Customer object to calculateDeliveryCharge() method. It should return delivery charge
			 We are providing free delivery to VIP Customers
			 When we pass VipCustomer object for customer argument to calculateDeliveryCharge() method 
			 The program/code should work properly as well
			*/
	// Interface Segregation Principle
		// Create small role specific interfaces rather than one big general interface
		// Example
			/*
			Selenium Interfaces
				SearchContext 
				WebDriver 
				TakesScreenshot 
				JavascriptExecutor 
				Navigation 
				Options
				WebElement 
				Alert 
				Action
				ExpectedConditions
			*/
	// Dependency Inversion Principle
		// Software entities(classes, functions etc.) should depend on abstract class/ interface and not on concrete classes

