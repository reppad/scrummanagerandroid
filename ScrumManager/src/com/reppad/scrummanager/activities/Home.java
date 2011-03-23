package com.reppad.scrummanager.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.reppad.scrummanager.R;

//TODO les colonnes prennent la largeur du titre, ce qui casse la mise en page lorsque l'on agrandi le titre
public class Home extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
    }
    
    public void clickCards(View v) {
    	Intent cardSelection = new Intent(this, CardSelection.class);
//        cardSelection.putExtra(name, value);
        startActivity(cardSelection);
    }
    
    public void clickBoard(View v) {
    	Toast.makeText(this, R.string.notimplemented, Toast.LENGTH_SHORT).show();
    }
    
    public void clickExtras(View v) {
    	Toast.makeText(this, R.string.notimplemented, Toast.LENGTH_SHORT).show();
    }
    
    public void clickAbout(View v) {
    	Toast.makeText(this, R.string.notimplemented, Toast.LENGTH_SHORT).show();
    }
    
    public void clickZero(View v) {
		Intent card = new Intent(this, Card.class);
		card.putExtra("cardValue", "0");
		startActivity(card);
	}
}