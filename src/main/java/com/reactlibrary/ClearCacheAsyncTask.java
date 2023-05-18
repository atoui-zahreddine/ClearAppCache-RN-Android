package com.reactlibrary;

import android.os.AsyncTask;
import android.util.Log;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableArray;

import java.io.File;

public class ClearCacheAsyncTask extends AsyncTask<Integer,Integer,String> {
    public ClearCacheModule myclearCacheModule = null;
    public Callback callback;
    public ReadableArray skipExtensions;
    public ClearCacheAsyncTask(ClearCacheModule clearCacheModule, Callback callback, ReadableArray skipExtensions) {
        super();
        this.myclearCacheModule = clearCacheModule;
        this.callback = callback;
        this.skipExtensions = skipExtensions;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        callback.invoke();

    }

    @Override
    protected String doInBackground(Integer... params) {
        myclearCacheModule.clearCache(skipExtensions);
        return null;
    }


}
