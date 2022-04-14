package Classes;

import Exceptions.ReviewException;

public class Review extends Person {

    private String reviewText;
    private Integer score;

    Review() {
    }

    public Review(String name, String reviewText, Integer score) {
        this.name = name;
        this.reviewText = reviewText;
        this.score = score;
    }

    public void setReviewText(String reviewText) throws ReviewException {
        if (reviewText.equals("")) {
            throw new ReviewException("Cannot be an empty review!");
        }
        else {
            this.reviewText = reviewText;
        }
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getReviewText() {
        return reviewText;
    }

    public Integer getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Classes.Review" +
                "\nName: " + name +
                "\nText of review: " + reviewText +
                "\nScore: " + score;
    }
}
