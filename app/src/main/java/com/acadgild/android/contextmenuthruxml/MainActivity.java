package com.acadgild.android.contextmenuthruxml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView context= (TextView)findViewById(R.id.context_menu);
        registerForContextMenu(context);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        menu.setHeaderTitle("Context Menu Example");
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context, menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.option1:
                Toast.makeText(this, "Clicked on Option 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.option2:
                Toast.makeText(this, "Clicked on Option 2", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }

}
