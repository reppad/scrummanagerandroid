package com.reppad.scrummanager.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.reppad.scrummanager.R;

public class Card extends Activity {
	private TextView card;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card);
        
        card = (TextView) findViewById(R.id.card);
        
        Bundle b = this.getIntent().getExtras();
        card.setText(b.getString("cardValue"));
    }
}