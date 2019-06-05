package inheritance;

import java.util.ArrayList;

public class Shop {
    String name;
    String description;
    String numOfDollarSigns;
    ArrayList<Review> reviews = new ArrayList<Review>();

    public Shop(){
        this.name = "";
        this.description = "";
        this.numOfDollarSigns = "";
    }

    public Shop(String name, String description, String numOfDollarSigns){
        this.name = name;
        this.description = description;
        this.numOfDollarSigns = numOfDollarSigns;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNumOfDollarSigns() {
        return this.numOfDollarSigns;
    }

    public void setNumOfDollarSigns(String numOfDollarSigns) {
        this.numOfDollarSigns = numOfDollarSigns;
    }

    public String toString(){
        if(this.reviews.size() == 0){
            return String.format("Welcome to %s. Our description is: %s. We are a %s shop", this.getName(), this.getDescription(), this.getNumOfDollarSigns());
        }else{
            StringBuilder reviewOutput = new StringBuilder();
            for(Review reviewList: this.reviews){
                reviewOutput.append(reviewList + "\n");
            }
            return String.format("Welcome to %s. Our description is: %s. We are a %s shop\nThese are our reviews below:\n\n%s", this.getName(), this.getDescription(), this.getNumOfDollarSigns(), reviewOutput);
        }

    }

    public void addReview(Review review) {
        if(!(this.reviews.contains(review))){ //condition to make sure we don't add the same review twice to our restaurant
            this.reviews.add(review);
        }
        review.shop = this;
    }

}
