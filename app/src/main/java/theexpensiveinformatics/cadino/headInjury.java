package theexpensiveinformatics.cadino;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

public class headInjury extends AppCompatActivity {

    LinearLayout con_unable,con_bleeding,con_transient,con_headace,con_bppv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_head_injury);

        //status bar
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        Window window = this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this,R.color.white));


        //unable open eye
        con_unable=(LinearLayout)  findViewById(R.id.con_unable_eyes);
        con_unable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int_unable = new Intent(headInjury.this, unableCloseEyes.class);
                startActivity(int_unable);
            }
        });

        //bleeding
        con_bleeding=(LinearLayout)     findViewById(R.id.con_bleeding);
        con_bleeding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int_bleeding = new Intent(headInjury.this, bleeding.class);
                startActivity(int_bleeding);
            }
        });

        //transient
        con_transient=(LinearLayout) findViewById(R.id.con_Transient);
        con_transient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int_transient = new Intent(headInjury.this, Transient.class);
                startActivity(int_transient);
            }
        });

        //headache
        con_headace=(LinearLayout) findViewById(R.id.con_headace);
        con_headace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int_headache = new Intent(headInjury.this , Headache.class);
                startActivity(int_headache);
            }
        });
    }
}