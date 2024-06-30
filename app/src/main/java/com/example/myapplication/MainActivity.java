package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    final private String TAG = "myapplication";
    private boolean led_on;
    private Button btn;
    private CheckBox checkBox1 = null;
    private CheckBox checkBox2 = null;
    private CheckBox checkBox3 = null;
    private CheckBox checkBox4 = null;

    class MyButtonListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            // Code here executes on main thread after user presses button
            led_on = !led_on;
            setLedBtn(led_on);
        }
    }

    public void ledOnClick(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        if (view.getId() == R.id.led1) {
            if (checked) {
                // Put some meat on the sandwich
                Toast.makeText(getApplicationContext(), "LED1 on", Toast.LENGTH_SHORT).show();
            } else {
                // Remove the meat
                Toast.makeText(getApplicationContext(), "LED1 off", Toast.LENGTH_SHORT).show();
            }
        } else if (view.getId() == R.id.led2) {
            if (checked) {
                // Put some meat on the sandwich
                Toast.makeText(getApplicationContext(), "LED2 on", Toast.LENGTH_SHORT).show();
            } else {
                // Remove the meat
                Toast.makeText(getApplicationContext(), "LED2 off", Toast.LENGTH_SHORT).show();
            }
        } else if (view.getId() == R.id.led3) {
            if (checked) {
                // Put some meat on the sandwich
                Toast.makeText(getApplicationContext(), "LED3 on", Toast.LENGTH_SHORT).show();
            } else {
                // Remove the meat
                Toast.makeText(getApplicationContext(), "LED3 off", Toast.LENGTH_SHORT).show();
            }
        } else if (view.getId() == R.id.led4) {
            if (checked) {
                // Put some meat on the sandwich
                Toast.makeText(getApplicationContext(), "LED4 on", Toast.LENGTH_SHORT).show();
            } else {
                // Remove the meat
                Toast.makeText(getApplicationContext(), "LED4 off", Toast.LENGTH_SHORT).show();
            }
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        led_on = true;
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        setLedBtn(led_on);
        btn.setOnClickListener(new MyButtonListener());
        checkBox1 = (CheckBox) findViewById(R.id.led1);
        checkBox2 = (CheckBox) findViewById(R.id.led2);
        checkBox3 = (CheckBox) findViewById(R.id.led3);
        checkBox4 = (CheckBox) findViewById(R.id.led4);
        setLedBtn(led_on);


    }

    protected void setLedBtn(boolean state) {
        if(btn != null
                && checkBox1 != null
                && checkBox2 != null
                && checkBox3 != null
                && checkBox4 != null ) {
            if (state) {
                btn.setText(R.string.led_on);
                checkBox1.setChecked(true);
                checkBox2.setChecked(true);
                checkBox3.setChecked(true);
                checkBox4.setChecked(true);
            }
            else {
                btn.setText(R.string.led_off);
                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
            }
        } else {
            Log.e(TAG, "the button is null and do nothing: ");
        }
    }
}