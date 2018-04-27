package com.example.pc.dateee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar c = Calendar.getInstance();

        c.add(Calendar.MONTH, 1);

        String month = c.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault()).toUpperCase();

        Log.e("monthh: ",month);


        Date date = null;
        try {
            date = new SimpleDateFormat("MMMM", Locale.ENGLISH).parse("March");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int monthh = cal.get(Calendar.MONTH);

        Log.e("dsfhdshfdshf:dsfd:  ",monthh+"");
//        System.out.println(month == Calendar.FEBRUARY);






    }
}
