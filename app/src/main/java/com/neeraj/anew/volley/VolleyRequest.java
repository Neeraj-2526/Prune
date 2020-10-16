package com.neeraj.anew.volley;

import android.content.Context;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import java.util.Map;

public class VolleyRequest {
    private VolleyRequestListener volleyRequestListener;
    private static VolleyRequest volleyRequest = null;
    private final static String TAG = "VolleyRequest.java";
    private RequestQueue requestQueue;

    public synchronized static VolleyRequest getInstance(Context context) {
        if (volleyRequest == null) {
            volleyRequest = new VolleyRequest(context);
        }
        return volleyRequest;
    }

    VolleyRequest(Context context) {
        this.requestQueue = VolleySingleton.getInstance(context).getRequestQueue();
    }

    public void makePOST_Request(String url, final Map<String, String> params, final VolleyRequestListener volleyRequestListener) {
        StringRequest request = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    volleyRequestListener.onDataLoaded(response);
                } catch (Exception e) {
                    volleyRequestListener.onError("Exception : " + e.getLocalizedMessage());
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                volleyRequestListener.onError(error.getMessage());
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                return params;
            }
        };
        request.setRetryPolicy(new DefaultRetryPolicy(5000
                , DefaultRetryPolicy.DEFAULT_MAX_RETRIES
                , DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        requestQueue.add(request);

    }

    public void makeGET_Request(String url, final VolleyRequestListener volleyRequestListener) {
        StringRequest request = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    volleyRequestListener.onDataLoaded(response);
                } catch (Exception e) {
                    volleyRequestListener.onError("Exception : " + e.getLocalizedMessage());
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                volleyRequestListener.onError(error.getMessage());
            }
        });
        request.setRetryPolicy(new DefaultRetryPolicy(5000
                , DefaultRetryPolicy.DEFAULT_MAX_RETRIES
                , DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        requestQueue.add(request);

    }
}
