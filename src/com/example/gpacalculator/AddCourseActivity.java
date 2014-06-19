package com.example.gpacalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddCourseActivity extends Activity implements View.OnClickListener{
	
	Button add, cancel;
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_course);
		init();
		
	}
	public void onClick(View v) {
		if(v.getId() == R.id.cancelButton)
			finish();
		else if(v.getId() == R.id.addButton){
			
		}
	}
	private void init() {
		add = (Button)findViewById(R.id.addButton);
		cancel = (Button)findViewById(R.id.cancelButton);
		
		add.setOnClickListener(this);
		cancel.setOnClickListener(this);
		
	}
	
	public void addCourse(View view){
		if(view.getId() == R.id.addButton){
			
		}
	}



}
