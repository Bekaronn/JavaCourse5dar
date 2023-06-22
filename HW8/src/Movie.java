public class Movie {
    String title;
    String studio;
    String rating = "PG";

    public Movie(String title, String studio, String rating){
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio){
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public void print(){
        System.out.println(String.format("названия %s, студия %s, рейтинг %s", title, studio, rating));
    }
}
