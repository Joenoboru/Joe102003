package com.example.user.joe102003;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click1(View v)
    {
        Uri uri = Uri.parse("http://tw.yahoo.com");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);

    }
    public void click2(View v)
    {
        Uri uri= Uri.parse("tel:54321");
        Intent it=new Intent(Intent.ACTION_DIAL,uri);
        startActivity(it);

    }
    public void click3(View v)
    {
        Uri mp= Uri.parse("geo:0.0?q=桃園縣中壢市");
        Intent it=new Intent(Intent.ACTION_VIEW,mp);
        startActivity(it);

    }

    public void click4(View v)
    {
        EditText ed = (EditText) findViewById(R.id.editText);
        String str=ed.getText().toString();

        Intent it = new Intent(MainActivity.this, Main2Activity.class);
        it.putExtra("message", str);
        startActivity(it);
    }
}
