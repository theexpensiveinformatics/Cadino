package theexpensiveinformatics.cadino;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class Transient extends AppCompatActivity {

    TextView extra,extra2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transient);

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
                Intent int_perilymphatic = new Intent(Transient.this, PerilymphaticFistula.class);
                startActivity(int_perilymphatic);
            }
        });
    }
}