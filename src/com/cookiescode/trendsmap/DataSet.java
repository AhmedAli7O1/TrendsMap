package com.cookiescode.trendsmap;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Ahmed Ali on 29/03/2016.
 */
public class DataSet {
    private HashMap<String, HashSet<Tweet>> tweets;

    public HashMap<String, HashSet<Tweet>> getTweets() {
        return tweets;
    }

    public void setTweets(HashMap<String, HashSet<Tweet>> tweets) {
        this.tweets = tweets;
    }
}
