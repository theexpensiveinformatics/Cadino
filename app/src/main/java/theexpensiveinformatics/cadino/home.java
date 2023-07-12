package theexpensiveinformatics.cadino;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Calendar;

public class home extends AppCompatActivity {
    TextView good;
    LinearLayout con_head,con_earTrauma,con_neck,con_earSurgury,con_Baro,con_other;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // light theme
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        //status bar
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        Window window = this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this,R.color.white));


        // good morning
        good=(TextView)    findViewById(R.id.good);
        Calendar c = Calendar.getInstance();
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);

        if (timeOfDay >= 0 && timeOfDay < 12) {
            good.setText("Good Morning,");
        } else if (timeOfDay >= 12 && timeOfDay < 16) {
            good.setText("Good Afternoon,");
        } else if (timeOfDay >= 16 && timeOfDay < 21) {
            good.setText("Good Evening,");
        } else if (timeOfDay >= 21 && timeOfDay < 24) {
            good.setText("Good Night,");
        }


        //head injury
        con_head=(LinearLayout) findViewById(R.id.con_head);
        con_head.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent head_injury = new Intent(home.this, headInjury.class);
                startActivity(head_injury);
            }
        });

        //ear trauma
        con_earTrauma = (LinearLayout) findViewById(R.id.con_earTrauma);
        con_earTrauma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int_earTruam= new Intent(home.this, earTrauma.class);
                startActivity(int_earTruam);
            }
        });

        //neck
        con_neck=(LinearLayout) findViewById(R.id.con_neck);
        con_neck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int_neck = new Intent(home.this , NeckTrauma.class);
                startActivity(int_neck);
            }
        });


        //earSurjury
        con_earSurgury=(LinearLayout)findViewById(R.id.con_earSurjury)  ;
        con_earSurgury.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int_earS = new Intent (home.this , PerilymphaticFistula.class);
                startActivity(int_earS);
            }
        });

        //baro
        con_Baro=(LinearLayout) findViewById(R.id.con_baroTrauma);
        con_Baro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int_baro = new Intent(home.this ,BaroTrauma.class);
                startActivity(int_baro);
            }
        });


    }
}