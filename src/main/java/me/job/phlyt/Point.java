package me.job.phlyt;

import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
public class Point {
    private Integer score;
    public Point(Integer pt) {
        this.score = pt;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
