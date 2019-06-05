package inheritance;

import java.util.*;

public class Theater {
    private String name;
    private HashSet<String> movies = new HashSet<>();
    ArrayList<Review> reviews = new ArrayList<Review>();

    public Theater(){
        name = "";
    }

    public Theater(String name, String movie){
        this.name = name;
        movies.add(movie);
    }

    public Theater(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashSet<String> getMovies() {
        return this.movies;
    }

    public void addReview(Review review) {
        if(!(this.reviews.contains(review))){ //condition to make sure we don't add the same review twice to our restaurant
           if(review.movie != "" && !(this.movies.contains(review.movie))){
               throw new IllegalArgumentException(getName() + " theater does not have the " + review.movie + " movie you are trying to review");
           }else{
               this.reviews.add(review);
               review.theater = this;
           }
        }
    }

    public void addMovie (String movie){
        this.movies.add(movie);
    }

    public void removeMovie (String movie){
      if(this.movies.contains(movie)){
          this.movies.remove(movie);
      }else{
          throw new IllegalArgumentException("You are trying to remove a movie that is not on the list");
      }
    }

    public String toString(){
        if(movies.isEmpty() && reviews.isEmpty()){
            return String.format("Hello, Welcome to %s theater.", this.getName());
        }else {
            //loop through the list of reviews and store them in a string builder
            StringBuilder reviewsOutput = new StringBuilder();
            for(Review reviewList: this.reviews){
                reviewsOutput.append(reviewList + "\n");
            }

            //loop through the movies set and store them in a string builder
            StringBuilder moviesOutput = new StringBuilder();
            List<String> moviesList = new ArrayList<String>(this.movies);
            Collections.sort(moviesList);
            Iterator<String> i = moviesList.iterator();
            while (i.hasNext()) {
                moviesOutput.append(i.next() + "\n");
            }
            return String.format("Hello, Welcome to %s theater. These are our current list of movies:\n%s\nThese are our current list of reviews:\n%s", this.getName(), moviesOutput, reviewsOutput);
        }
    }

}
