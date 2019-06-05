package inheritance;

import java.util.ArrayList;

public class Restaurant {

    //Private variables that will represent the properties of a restaurant
    private String name;
    private String numOfDollarSigns;
    private int numOfStars;
    private ArrayList <Review> reviews = new ArrayList<>();


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
        for(Review reviewList: this.reviews){
            reviewOutput.append(reviewList + "\n");
        }
        if(this.reviews.size() == 0){
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
        return this.reviews;
    }

    public void addReview(Review review) {
        if(!(this.reviews.contains(review))){ //condition to make sure we don't add the same review twice to our restaurant
            this.reviews.add(review);
            review.restaurant = this;
            int sum = 0;
            for(Review reviewList : this.reviews){
                sum += reviewList.getNumOfStars();
            }
            this.setNumOfStars(sum / this.reviews.size());
        }
    }
}
