package com.example.josephinemenge.twittter;

import com.example.josephinemenge.twittter.BuildConfig;

/**
 * Created by Josephine Menge on 02/07/2017.
 */

public class Constants {
    public static final String CONSUMER_KEY = BuildConfig.TWITTER_CONSUMER_KEY;
    public static final String CONSUMER_SECRET = BuildConfig.TWITTER_CONSUMER_SECRET;
    public static final String TOKEN = BuildConfig.TWITTER_TOKEN;
    public static final String TOKEN_SECRET = BuildConfig.TWITTER_TOKEN_SECRET;
    public static final String BASE_URL = "https://api.twitter.com/1.1/search/tweets.json?result_type=recent&lang=en&count=50";
    public static final String QUERY_PARAMETERS = "q";
    public static final String PREFERENCES_USER_EMAIL = "email";
    public static final String PREFERENCES_USER_PASSWORD = "password";
}
