# csci3301-spring-2025-final-project-Alwin-Linnea-Anton

How to run the program:
There's two test files, FoodPrepSimulatorLive.java that is interactive and takes input from the terminal.
The other is FoodPrepSimulatorTEST.java which has the tests. Both files should work if you just run the main function.

Explanation of Design Patterns:

Factory:

We used the simple factory method to make the three customer types, depending on a type enum we pass in, so we can make different types dynamically depending on the customer input.
We also used an abstract factory method to make foods of different types, so we can make different foods depending on customer needs.

Singleton:

We used a singleton pattern to create a NullCustomer type that is only returned when something goes wrong, to make debugging easier.

Decorator:

We used the decorator in combination with the factory in order to add customer name, excluded foods, and preferences. 
The reason for this is because these three will vary customer to customer, and using a decorator gives us the flexibility needed
to add these onto the customer object with these differences. 

Currently, however, we're taking excluded foods and preferences as strings. If we wanted to use these in other methods, we'd either 
have to parse the string or change how we input the data. 

Observer:

We also used the observer pattern to update the different customers when new menu items are added.
