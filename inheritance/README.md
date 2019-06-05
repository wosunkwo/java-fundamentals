LAB

Inheritance and Interfaces
This folder contains a Restaurant class, Review class, Shop class and Theater class. The restaurant class contais methods and variables about a generic restaurant, the shop class contais methods and variables about a generic shop, the theater class contains methods and variables about a generic theater, and the review class contains methods and variables that hold information about restaurant, shop and theater reviews


Challenge
Create classes and interfaces to represent reviews of restaurants. Create more classes that help users review shops, movie and  theaters, and allow reviewing non-restaurant things, while ensuring some common functionality.

Approach & Efficiency
I took an Object Oriented approach. I encapsulated all my functionalities inside of seperate methods and put all my methods inside of a class
addReview -> 0(n) Where n represnets the size of the array list
addMovies -> 0(1)
removeMovies -> 0(1)

API
void addReview(Review) : Adds a new review for the restaurant
void addMovies(String) : Adds a new movie to the list of movies the theater shows
void removeMovies(String) : Removes a movie from the list of movies the theater shows
Srtring toString(): displayes a default statement for the restaurant based on the restaurants properties
