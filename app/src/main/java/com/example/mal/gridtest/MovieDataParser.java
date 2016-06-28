package com.example.mal.gridtest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class MovieDataParser {
    public static List<String> getPosterPaths(String jsonString) throws JSONException{
        JSONObject movieData = new JSONObject(jsonString);
        JSONArray pathsJson = movieData.getJSONArray("poster_path");
        List<String> posterPaths = new ArrayList<>();
        for(int i = 0; i < pathsJson.length(); i++){
            String path = pathsJson.getString(i);
            posterPaths.add(path);
        }
        return posterPaths;
    }
}
