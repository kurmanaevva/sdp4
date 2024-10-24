# sdp4
1. The system is designed to handle multiple payment methods, like Credit Card, PayPal, Cryptocurrency. I created PaymentStrategy Interface. It defines the contract for all payment methods. Then there are CreditCardPayment class which handles payments via credit card, PayPalPayment class which handles payments via PayPal, CryptoPayment class which handles payments via cryptocurrency. ShoppingCart Class has methods to set the current payment strategy and process payments using the current strategy. Main class demonstrates the use of different payment strategies and how the system switches between them.
2. Here I created WeatherStation class and methods like addDisplay(WeatherDisplay display) which registers a new display, removeDisplay(WeatherDisplay display) which removes an existing display, notifyDisplays() which notifies all registered displays with updated weather data and setWeatherData(double temperature, double humidity, double pressure) which Updates the weather data and triggers the notification. The WeatherDisplay interface defines a contract for all display devices. Also there are CurrentConditionsDisplay class which displays current temperature, humidity, and pressure, StatisticsDisplay class which sisplays some statistics and ForecastDisplay which displays weather forecast based on pressure, WeatherData Class which manages the weather data changes and coordinates the display updates. The Main class demonstrates how the system works by registering different displays and updating the weather data.
3. There are Command Interface that defines methods execute() and undo(), Concrete Commands like TurnTVOn, SetVolume, DimLights that implement specific actions, devices like TV, Stereo, and Light receive and execute commands, RemoteControl Class that holds slots for commands and supports undoing the last command and Main Class which emonstrates device control and the undo feature.
4. Here I created State Interface that defines actions like payOrder, shipOrder, NewState, PaidState, ShippedState, Order Class that maintains the current state and delegates actions to it and Main Class that demonstrates various order processing scenarios.
5. There are Approver Base Class that defines a method to handle requests, TeamLead, Manager, Director, and CEO that handle requests of varying amounts, ExpenseRequest Class which represents an expense with properties like amount and purpose, ApprovalChain Class that sets up the approvers in a chain, Main Class which demonstrates the approval process.
6. I created ChatMediator Interface that defines methods for sending messages and adding users, ChatRoom Class that acts as the mediator for communication, User class which defines methods for sending and receiving messages, RegularUser, PremiumUser that implement specific user behaviors and Main Class that demonstrates how users send messages via the chat mediator.
7. There are Document class that can create and restore mementos, DocumentVersion class that stores document state, VersionControl class which manages document versions and Main class that demonstrates saving and restoring document versions.
8. Here I created Shape interface to accept visitors, Circle, Rectangle, and Triangle to implement specific shapes, Visitor interface to define visit methods for each shape, AreaCalculator Visitor to calculate the area for each shape and Drawing class to hold a collection of shapes and demonstrates area calculation.
9. In this task I created ReportGenerator class that defines a template method generateReport(), PDFReportGenerator, HTMLReportGenerator and Main class that demonstrates generating reports in different formats.
10. There are Playlist class for storing a collection of Song objects, iterators like SequentialIterator, ShuffleIterator, GenreFilterIterator and Main Class for demonstrating song traversal using different iterators.
