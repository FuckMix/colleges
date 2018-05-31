package cn.edu.zjut.colleges.dto;

public class Rank extends RankKey {
    private Integer rank;

    private Float score;

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Rank{" +
                "rank=" + rank +
                ", score=" + score +
                '}';
    }
}