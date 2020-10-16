package com.neeraj.anew.volley;

public interface VolleyRequestListener {
    void onDataLoaded(String response) throws Exception;
    void onError(String error);
}
