package theexpensiveinformatics.cadino;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

public class BaroTrauma extends AppCompatActivity {

    LinearLayout con_ascent_one,con_ascent_two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baro_trauma);

        //status bar
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        Window window = this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this,R.color.white));

        //one
        con_ascent_one=(LinearLayout) findViewById(R.id.con_Ascent_one);
        con_ascent_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int_ascent_one = new Intent(BaroTrauma.this,Ascent_one.class);
                startActivity(int_ascent_one);
            }
        });


        //two
        con_ascent_two = (LinearLayout)findViewById(R.id.con_Ascent_two);
        con_ascent_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int_asecnt_two=new Intent(BaroTrauma.this , Ascent_two.class);
                startActivity(int_asecnt_two);
            }
        });

    }
}