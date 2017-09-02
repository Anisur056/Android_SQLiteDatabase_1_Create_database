package com.anisdroid.Create_Database;

import android.app.*;
import android.os.*;

public class MainActivity extends Activity 
{
	My_DB_Helper ddd;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		ddd = new My_DB_Helper(this);
		
    }
}
