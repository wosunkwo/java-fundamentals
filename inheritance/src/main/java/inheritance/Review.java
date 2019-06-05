package inheritance;

public class Review {
    //the private variables that will represent properties of a Review class
    private String body;
    private String author;
    private int numOfStars;
    Restaurant restaurant;
    Shop shop;
    Theater theater;
    String movie;

    //default constructor that will be called if a new Review class object is instantiated without any parameter
    public Review(){
        this.body = "";
        this.author = "";
        this.numOfStars = 0;
        this.movie = "";
    }

    //the constructor that will be called if an object is instantiated with the right number of parameters
    public Review(String author, String body, int numOfStars){
        this.author = author;
        this.body = body;
        this.movie = "";
        if(numOfStars > 5){
            this.numOfStars = 5;
        }else{
            this.numOfStars = numOfStars;
        }
    }

    public Review(String author, String body, int numOfStars, Theater theater, String movie){
        this.author = author;
        this.body = body;
        this.movie = movie;
        theater.addReview(this);
        if(numOfStars > 5){
            this.numOfStars = 5;
        }else{
            this.numOfStars = numOfStars;
        }
    }


    public String toString(){
        StringBuilder result = new StringBuilder();
        result.append("Author: " + this.getAuthor() + "\n" + "Comment: " + this.getBody() + "\n" + "Number of Stars: "+ this.getNumOfStars() + "\n" + "For: " + this.getMovie());
        return result.toString();
    }


    //Get and Set methods for the private variables of this class
    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getNumOfStars() {
        return this.numOfStars;
    }

    public void setNumOfStars(int numOfStars) {
        this.numOfStars = numOfStars;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }
}
