package com.sunhui.activitylifetext;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void doClick(View view) {
		switch (view.getId()) {
		case R.id.btn1:
			Intent intent = new Intent(this, NormalActivityActivity.class);
			startActivity(intent);
			break;
		case R.id.btn2:
			Intent intent2 = new Intent(this, DialogActivity.class);
			startActivity(intent2);
			break;
		}
	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.d("one", "onStart");
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.d("one", "onResume");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.d("one", "onPause");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.d("one", "onStop");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d("one", "onDestory");
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		Log.d("one", "onRestart");
	}
}
