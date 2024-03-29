package module2._10_ExceptionHandling.Challenge.Part_2;

public class Movie {

    private String name;
    private String format;
    private double rating;

    public Movie(String name, String format, double rating) {
        setName(name);
        setFormat(format);
        setRating(rating);
    }

    public Movie(Movie source) {
        this.name = source.name;
        this.format = source.format;
        this.rating = source.rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("name cannot be null/blank");
        }
        this.name = name;
    }

    
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        if (format == null || format.isEmpty()) {
            throw new IllegalArgumentException("format cannot be null/blank");
        }
        this.format = format;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating < 0 || rating > 10) {
            throw new IllegalArgumentException("invalid rating");
        }
        this.rating = rating;
    }

    public String toString() {
        return this.rating + "\t" + this.format + "\t\t" + this.name + "\n";
    }
    

}
