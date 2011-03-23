package com.reppad.scrummanager.activities;

import android.app.Activity;
import android.os.Bundle;

import com.reppad.scrummanager.R;

public class Card extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card);
    }
}