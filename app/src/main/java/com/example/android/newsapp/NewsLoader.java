package com.example.android.newsapp;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class NewsLoader extends AsyncTaskLoader<List<News>> {
    /** Tag for log messages */
    private static final String LOG_TAG = NewsLoader.class.getName();

    /** Query URL */
    private String mUrl;

    /**
     * Constructs a new {@link NewsLoader}.
     *
     * @param context of the activity
     * @param url to load data from
     */
    public NewsLoader (Context context, String url){
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<News> loadInBackground() {
        // Perform the HTTP request for news data and process the response.
        if (mUrl == null){
            return null;
        }

        ArrayList<News> news = //create test data
                new ArrayList<News>();
        news.add(new News("test1", "http://www.google.com"));
        news.add(new News("test2", "http://www.facebook.com"));
        news.add(new News("test3", "http://www.udacity.com"));//QueryUtils.fetchEarthquakeData(mUrl);
        return news;
    }
}
