package com.gamesys.api;

import java.util.ArrayList;
import java.util.Date;

public class Feed
{
    private ArrayList<Link> link;

    public ArrayList<Link> getLink() { return this.link; }

    public void setLink(ArrayList<Link> link) { this.link = link; }

    private String id;

    public String getId() { return this.id; }

    public void setId(String id) { this.id = id; }

    private ChannelId channelId;

    public ChannelId getChannelId() { return this.channelId; }

    public void setChannelId(ChannelId channelId) { this.channelId = channelId; }

    private String title;

    public String getTitle() { return this.title; }

    public void setTitle(String title) { this.title = title; }

    private Author author;

    public Author getAuthor() { return this.author; }

    public void setAuthor(Author author) { this.author = author; }

    private Date published;

    public Date getPublished() { return this.published; }

    public void setPublished(Date published) { this.published = published; }

    private ArrayList<Entry> entry;

    public ArrayList<Entry> getEntry() { return this.entry; }

    public void setEntry(ArrayList<Entry> entry) { this.entry = entry; }
}

