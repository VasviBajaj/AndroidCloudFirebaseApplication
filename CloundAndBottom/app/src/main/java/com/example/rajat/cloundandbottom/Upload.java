package com.example.rajat.cloundandbottom;

/**
 * Created by Ducat on 11/29/2017.
 */

public class Upload
{


    public String name;
    public String url;
    public String username;
    public int pic;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public Upload()
    {

    }
    public Upload(String name, String url) {
        this.name = name;
        this.url = url;
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

}
