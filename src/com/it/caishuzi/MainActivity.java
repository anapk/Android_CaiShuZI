package com.it.caishuzi;

import java.util.Random;

import android.R.integer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	int rand;

	public void st(View view) {
		EditText num1ET = (EditText) findViewById(R.id.num1_et);
		EditText num2ET = (EditText) findViewById(R.id.num2_et);
		int num1 = Integer.parseInt(num1ET.getText().toString());
		int num2 = Integer.parseInt(num2ET.getText().toString());

		if (num1 >= num2) {
			Toast.makeText(this, "num2必须大于num2,请重新输入", 1).show();
		} else {
			int rand = new Random().nextInt(num2 - num1) + num1;
			System.out.println(rand);
		}
	}

	public void sb(View view) {
		EditText resET = (EditText) findViewById(R.id.res_et);
		int res = Integer.parseInt(resET.getText().toString());
		if (rand == res) {
			Toast.makeText(this, "恭喜你猜对了", 1).show();
		} else if (res > rand) {
			Toast.makeText(this, "数大了", 1).show();
		}else {
			Toast.makeText(this, "数小了", 1).show();
		}

	}

}
