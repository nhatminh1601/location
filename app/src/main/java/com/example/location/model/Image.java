package com.example.location.model;

import java.io.Serializable;

public class Image implements Serializable {
    Integer id;
    String name;
    String url;
    String desc;
    Integer group;
    Integer image;
    Integer isFavourite;

    public Image(Integer id, String name, String url, String desc, Integer group, Integer image, Integer isFavourite) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.desc = desc;
        this.group = group;
        this.image = image;
        this.isFavourite = isFavourite;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getGroup() {
        return group;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public Integer getIsFavourite() {
        return isFavourite;
    }

    public void setIsFavourite(Integer isFavourite) {
        this.isFavourite = isFavourite;
    }

    @Override
    public String toString() {
        return "Image{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", desc='" + desc + '\'' +
                ", group=" + group +
                ", image=" + image +
                ", isFavourite=" + isFavourite +
                '}';
    }
}
