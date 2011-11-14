package org.upsam.tecmov.client;

import android.os.Bundle;

import com.phonegap.DroidGap;

public class AndroidUpsamPhoneGapActivity extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("http://madridplaces.herokuapp.com/");
    }
}