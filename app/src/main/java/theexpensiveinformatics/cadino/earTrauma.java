package theexpensiveinformatics.cadino;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

public class earTrauma extends AppCompatActivity {
    LinearLayout con_forieng,con_slap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ear_trauma);


        //status bar
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        Window window = this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this,R.color.white));

        //slap
        con_slap=(LinearLayout) findViewById(R.id.con_Slap_ear);
        con_slap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int_slap = new Intent(earTrauma.this, SlapEar.class);
                startActivity(int_slap);
            }
        });

        //forign
        con_forieng=(LinearLayout) findViewById(R.id.con_foreign_bodies);
        con_forieng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int_forign = new Intent(earTrauma.this , foreignEar.class);
                startActivity(int_forign);
            }
        });
    }
}