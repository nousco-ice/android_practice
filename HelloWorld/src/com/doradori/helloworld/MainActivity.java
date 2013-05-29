package com.doradori.helloworld;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
                
        setContentView(R.layout.activity_main);
        
        Button btn = (Button)findViewById(R.id.button1);
        btn.setOnClickListener(new Button.OnClickListener() {
        	public void onClick(View v) {
        		Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_SHORT).show();
        	}
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
