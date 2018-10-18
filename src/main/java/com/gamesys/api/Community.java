package com.gamesys.api;

public class Community
{
    private StarRating starRating;

    public StarRating getStarRating() { return this.starRating; }

    public void setStarRating(StarRating starRating) { this.starRating = starRating; }

    private Statistics statistics;

    public Statistics getStatistics() { return this.statistics; }

    public void setStatistics(Statistics statistics) { this.statistics = statistics; }

    private String __prefix;

    public String getPrefix() { return this.__prefix; }

    public void setPrefix(String __prefix) { this.__prefix = __prefix; }
}
