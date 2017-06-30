package com.example.mlrit.wifiswitch;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Switch sw;
    TextView tv;
    String str="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.tv1);
        sw=(Switch)findViewById(R.id.sw);
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    WifiManager wifi=(WifiManager)getSystemService(Context.WIFI_SERVICE);
                    wifi.setWifiEnabled(true);
                    tv.setText("ON");
                    str="Your Mobile Wifi is ON";
                }
                else
                {
                    WifiManager wifi=(WifiManager)getSystemService(Context.WIFI_SERVICE);
                    wifi.setWifiEnabled(false);
                    tv.setText("OFF");
                    str="Your Mobile Wifi is OFF";
                }


            }
        });
    }

}
