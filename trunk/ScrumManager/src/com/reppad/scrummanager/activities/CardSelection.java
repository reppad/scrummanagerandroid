package com.reppad.scrummanager.activities;

import java.text.DecimalFormatSymbols;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.reppad.scrummanager.R;

public class CardSelection extends Activity {

	private Intent card;
	private String infiniteString;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cardselection);

		TextView question = (TextView) findViewById(R.id.miniatureQuestion);
		TextView infinite = (TextView) findViewById(R.id.miniatureInfinite);
		TextView coffee = (TextView) findViewById(R.id.miniatureCoffee);

		question.setText("?");
		infiniteString = new DecimalFormatSymbols().getInfinity();
		infinite.setText(infiniteString);
		
		card = new Intent(this, Card.class);
	}

	public void clickZero(View v) {
		card.putExtra("cardValue", "0");
		startActivity(card);
	}
	public void clickHalf(View v) {
		card.putExtra("cardValue", "1/2");
		startActivity(card);
	}
	public void clickOne(View v) {
		card.putExtra("cardValue", "1");
		startActivity(card);
	}
	public void clickTwo(View v) {
		card.putExtra("cardValue", "2");
		startActivity(card);
	}
	public void clickThree(View v) {
		card.putExtra("cardValue", "3");
		startActivity(card);
	}
	public void clickFive(View v) {
		card.putExtra("cardValue", "5");
		startActivity(card);
	}
	public void clickEight(View v) {
		card.putExtra("cardValue", "8");
		startActivity(card);
	}
	public void clickThirteen(View v) {
		card.putExtra("cardValue", "13");
		startActivity(card);
	}
	public void clickTwenty(View v) {
		card.putExtra("cardValue", "20");
		startActivity(card);
	}
	public void clickFourty(View v) {
		card.putExtra("cardValue", "40");
		startActivity(card);
	}
	public void clickHundred(View v) {
		card.putExtra("cardValue", "100");
		startActivity(card);
	}
	public void clickQuestion(View v) {
		card.putExtra("cardValue", "?");
		startActivity(card);
	}
	public void clickInfinite(View v) {
		card.putExtra("cardValue", infiniteString);
		startActivity(card);
	}
	public void clickCoffee(View v) {
		card.putExtra("cardValue", "");
		startActivity(card);
	}
}