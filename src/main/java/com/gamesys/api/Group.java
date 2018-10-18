package com.gamesys.api;

public class Group
{
    private Title title;

    public Title getTitle() { return this.title; }

    public void setTitle(Title title) { this.title = title; }

    private Content content;

    public Content getContent() { return this.content; }

    public void setContent(Content content) { this.content = content; }

    private Thumbnail thumbnail;

    public Thumbnail getThumbnail() { return this.thumbnail; }

    public void setThumbnail(Thumbnail thumbnail) { this.thumbnail = thumbnail; }

    private Description description;

    public Description getDescription() { return this.description; }

    public void setDescription(Description description) { this.description = description; }

    private Community community;

    public Community getCommunity() { return this.community; }

    public void setCommunity(Community community) { this.community = community; }

    private String __prefix;

    public String getPrefix() { return this.__prefix; }

    public void setPrefix(String __prefix) { this.__prefix = __prefix; }
}
