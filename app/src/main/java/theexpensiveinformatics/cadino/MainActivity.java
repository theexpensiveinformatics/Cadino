package theexpensiveinformatics.cadino;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    ImageView cadino_img;
    TextView ent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //initialization zone
        Timer _timer = new Timer();
        ent = (TextView) findViewById(R.id.ENT);
        cadino_img =(ImageView)     findViewById( R.id.cadino_img);


        // traspereant status bar
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow(); // in Activity's onCreate() for instance
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }

        //before animation
        ent.setAlpha(0);
        ent.setAlpha(0);_Animator(ent, "TranslationY",100,0);
        ent.setAlpha(0);_Animator(cadino_img, "TranslationY",200,0);
        ent.setAlpha(0);_Animator(cadino_img, "alpha",0,0);


        //timer start
        TimerTask timer = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        _Animator(cadino_img, "TranslationY",0,600);
                        _Animator(cadino_img, "alpha",1,600);
                    }
                });
            }
        };
        _timer.schedule(timer, (int)(400));
         timer = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        _Animator(ent, "TranslationY",0,600);
                        _Animator(ent, "alpha",1,600);
                    }
                });
            }
        };
        _timer.schedule(timer, (int)(800));
        timer = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(MainActivity.this, agreement.class);
                        startActivity(i);
                        finish();
                    }
                });
            }
        };
        _timer.schedule(timer, (int)(2000));



    }


    //Animator Block
    public void _Animator(final View _view, final String _propertyName, final double _value, final double _duration) {
        ObjectAnimator anim = new ObjectAnimator();
        anim.setTarget(_view);
        anim.setPropertyName(_propertyName);
        anim.setFloatValues((float) _value);
        anim.setDuration((long) _duration);
        anim.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        anim.start();

    }
}