package theexpensiveinformatics.cadino;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

import java.util.Timer;
import java.util.TimerTask;

public class agreement extends AppCompatActivity {
    TextView head,head2,txt;
    LottieAnimationView lottieAgreement;
    LinearLayout btm_lin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agreement);


        //status bar
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        Window window = this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this,R.color.white));


        head=(TextView)     findViewById(R.id.head);
        head2=(TextView)findViewById(R.id.head2);
        txt=(TextView)findViewById(R.id.txt);
        btm_lin=(LinearLayout)findViewById(R.id.btm_lin);
        lottieAgreement=(LottieAnimationView)findViewById(R.id.lottie_agreement );
        Timer _timer = new Timer();



        head.setText("Instructions & Disclaimer");

        //before animation
        _Animator(head, "alpha",0,0);
        _Animator(head2, "alpha",0,0);
        _Animator(lottieAgreement, "alpha",0,0);
        _Animator(txt, "alpha",0,0);
        _Animator(btm_lin, "alpha",0,0);
        _Animator(btm_lin, "ScaleX",0.7,0);
        _Animator(btm_lin, "ScaleY",0.7,0);
        _Animator(head, "TranslationY",100,0);
        _Animator(head2, "TranslationY",100,0);
        _Animator(txt, "TranslationY",100,0);
        _Animator(lottieAgreement, "TranslationY",100,0);



        //timer start
        TimerTask timer = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        _Animator(head, "TranslationY",0,500);
                        _Animator(head, "alpha",1,500);
                    }
                });
            }
        };
        _timer.schedule(timer, (int)(300));
        timer = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        _Animator(lottieAgreement, "TranslationY",0,500);
                        _Animator(lottieAgreement, "alpha",1,500);
                    }
                });
            }
        };
        _timer.schedule(timer, (int)(600));
        timer = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        _Animator(head2, "TranslationY",0,500);
                        _Animator(head2, "alpha",1,500);
                    }
                });
            }
        };
        _timer.schedule(timer, (int)(900));
        timer = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        _Animator(txt, "TranslationY",0,500);
                        _Animator(txt, "alpha",1,500);
                    }
                });
            }
        };
        _timer.schedule(timer, (int)(1100));
        timer = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        _Animator(btm_lin, "alpha",1,500);
                        _Animator(btm_lin, "ScaleX",1,500);
                        _Animator(btm_lin, "ScaleY",1,500);
                    }
                });
            }
        };
        _timer.schedule(timer, (int)(1300));

        btm_lin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(agreement.this, home.class);
                startActivity(i);
                finish();
            }
        });



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