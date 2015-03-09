package com.example.hw1;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
	}
	protected void onStart() {
		Log.d("Log", "Start Second activity");
		super.onStart();
	}
	protected void onResume() {
		Log.d("Log", "Resume Second activity");
		super.onResume();
	}
	protected void onPause() {
		Log.d("Log", "Pause Second activity");
		super.onPause();
	}
	protected void onDestroy() {
		Log.d("Log", "Destroy Second activity");
		super.onDestroy();
	}
	public void onBackPressed() {
		Log.d("Log", "Back Pressed");
		SecondActivity.this.finish();
	}
	 protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		Log.d("Log", "on Save Instance State Second activity");
	}
	 protected void onRestoreInstanceState(Bundle savedInstanceState) {
		 super.onRestoreInstanceState(savedInstanceState);
		 Log.d("Log", "on Restore Instance State Second activity");
	}
}