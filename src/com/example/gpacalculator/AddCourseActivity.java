package com.example.gpacalculator;

import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class AddCourseActivity extends Activity implements View.OnClickListener{
	
	Button add, cancel;
	EditText course_text_name;
	Course course = new Course();
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_course);
		init();
		
	}
	
	public void onClick(View v) {
		if(v.getId() == R.id.cancelButton)
			finish();
		else if(v.getId() == R.id.addButton){
			if(course_text_name.getText().toString().length() == 0){
				course_text_name.setError("Course Name is not entered!");
			}
			else {
				course.course_name = course_text_name.getText().toString();
				
				Intent e = new Intent(AddCourseActivity.this, MainActivity.class);
				e.putExtra("courseName", course_text_name.getText().toString());
				startActivityForResult(e, R.id.subjectName);
			}
		}
	}
	private void init() {
		add = (Button)findViewById(R.id.addButton);
		cancel = (Button)findViewById(R.id.cancelButton);
		course_text_name = (EditText)findViewById(R.id.subjectName);
		
		add.setOnClickListener(this);
		cancel.setOnClickListener(this);
		course_text_name.setOnClickListener(this);
		
	}
	
}
