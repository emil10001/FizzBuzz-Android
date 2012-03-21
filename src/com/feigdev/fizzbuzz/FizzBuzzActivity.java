package com.feigdev.fizzbuzz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class FizzBuzzActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ((TextView)findViewById(R.id.text1)).setText( fizzbuzz() );
    }
    
    private String fizzbuzz(){
    	String fb= "";
    	for (int i=1; i<=100; i++){
    		boolean flag = false;
    		if (0 == i%3){
    			fb += "Fizz";
    			flag = true;
    		}
    		if (0 == i%5){
    			fb += "Buzz";
    			flag = true;
    		}
    		if (!flag){
    			fb += Integer.toString(i);
    		}
    		fb += ", ";
    	}
    	return fb;
    }
}