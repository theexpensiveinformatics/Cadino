package theexpensiveinformatics.cadino;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class superior_canal extends AppCompatActivity {

    TextView txt_final_des;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_superior_canal);
        //status bar
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        Window window = this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this,R.color.white));

        //des
        txt_final_des=(TextView) findViewById(R.id.txt_final_dec);
        txt_final_des.setText("Dizziness appear after nose blowing / weight lifting (Hennebert’s phenomenon), which increases CSF pressure and/or after exposure to loud noises (Tullio’s phenomenon) and/or after straining, increased pressure in the ear. \n" +
                "\n" +
                "Vertigo and oscillopsia induced by loud noises or change in intracranial / middle ear pressure. Nystagmus vertical and torsional. Chronic disequilibrium. Weber lateralizes to affected ear. Tuning fork may be heard when placed on lateral malleolus of the foot. Audiogram: Bone conduction <0 dB. Air-bone gap exist with normal air conduction threshold 24+-7 dB 250-4000 Hz. Clinical manifestations: only vestibular or only auditory or both vestibular and auditory. \n");
    }
}