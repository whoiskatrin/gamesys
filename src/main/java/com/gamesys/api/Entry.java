package com.gamesys.api;

import java.util.Date;

public class Entry
{
    private String id;

    public String getId() { return this.id; }

    public void setId(String id) { this.id = id; }

    private VideoId videoId;

    public VideoId getVideoId() { return this.videoId; }

    public void setVideoId(VideoId videoId) { this.videoId = videoId; }

    private ChannelId channelId;

    public ChannelId getChannelId() { return this.channelId; }

    public void setChannelId(ChannelId channelId) { this.channelId = channelId; }

    private String title;

    public String getTitle() { return this.title; }

    public void setTitle(String title) { this.title = title; }

    private Link link;

    public Link getLink() { return this.link; }

    public void setLink(Link link) { this.link = link; }

    private Author author;

    public Author getAuthor() { return this.author; }

    public void setAuthor(Author author) { this.author = author; }

    private Date published;

    public Date getPublished() { return this.published; }

    public void setPublished(Date published) { this.published = published; }

    private Date updated;

    public Date getUpdated() { return this.updated; }

    public void setUpdated(Date updated) { this.updated = updated; }

    private Group group;

    public Group getGroup() { return this.group; }

    public void setGroup(Group group) { this.group = group; }
}
