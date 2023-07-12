package theexpensiveinformatics.cadino;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class PerilymphaticFistula extends AppCompatActivity {
    TextView extra,extra2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perilymphatic_fistula);

        //status bar
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        Window window = this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this,R.color.white));

        //extra
        extra=(TextView) findViewById(R.id.txt_extra);
        extra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int_superiorcanal = new Intent(PerilymphaticFistula.this, superior_canal.class);
                startActivity(int_superiorcanal);
            }
        });

        extra2=(TextView) findViewById(R.id.txt_extra2);
        extra2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int_chairi = new Intent(PerilymphaticFistula.this, ChiariMalformations.class);
                startActivity(int_chairi);
            }
        });
    }
}