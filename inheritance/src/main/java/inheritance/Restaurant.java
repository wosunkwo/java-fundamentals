package inheritance;

import java.util.ArrayList;

public class Restaurant {

    //Private variables that will represent the properties of a restaurant
    private String name;
    private String numOfDollarSigns;
    private int numOfStars;
    private ArrayList <Review> review = new ArrayList<>();


    //the default constructor that will be initialized if an object is instantiated without any arguments/parameters
    public Restaurant(){
        this.name = "";
        this.numOfStars = 0;
        this.numOfDollarSigns = "";
    }

    //the constructor that will be called if an object is instantiated with the right number of parameters
    public Restaurant(String name, String numOfDollarSigns, int numOfStars){
        this.name = name;
        this.numOfDollarSigns = numOfDollarSigns;
        if(numOfStars > 5){
            this.numOfStars = 5;
        }else{
            this.numOfStars = numOfStars;
        }
    }

    public String toString(){
        StringBuilder reviewOutput = new StringBuilder();
        for(Review reviewList: this.review){
            reviewOutput.append(reviewList + "\n");
        }
        if(this.review.size() == 0){
            return String.format("Welcome to %s, this is a %s star restaurant. Our price categories is %s.", this.getName(), this.getNumOfStars(), this.getNumOfDollarSigns());
        }else{
            return String.format("Welcome to %s, this is a %s star restaurant. Our price categories is %s.\nThis are our reviews below:\n\n%s", this.getName(), this.getNumOfStars(), this.getNumOfDollarSigns(), reviewOutput);
        }
    }

    //Get and Set methods for the private variables of this class
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumOfDollarSigns() {
        return this.numOfDollarSigns;
    }

    public void setNumOfDollarSigns(String numOfDollarSigns) {
        this.numOfDollarSigns = numOfDollarSigns;
    }

    public int getNumOfStars() {
        return this.numOfStars;
    }

    public void setNumOfStars(int numOfStars) {
        this.numOfStars = numOfStars;
    }

    public ArrayList getReview() {
        return this.review;
    }

    public void addReview(Review review) {
        this.review.add(review);
        if((this.getReview()).size() == 0){
            this.setNumOfStars(review.getNumOfStars());
        }else{
            int sum = 0;
            for(Review reviewList : this.review){
                sum += reviewList.getNumOfStars();
            }
            this.setNumOfStars(sum / this.review.size());
        }

    }

    public static void main (String[] args){
        Restaurant restaurant = new Restaurant("Nobu", "$$$$", 4);

        Review review = new Review("Williams Osunkwo", "This restaurant is crap, I really hated it. I am definitely never coming back here again", 1);
        Review review2 = new Review("James Bond", "This restaurant is actually nice, I really enjoyed my stay here. I will definitely be coming back again, whenever i am in the city", 5);
        restaurant.addReview(review);
        restaurant.addReview(review2);
        System.out.println(restaurant.toString());
    }
}
