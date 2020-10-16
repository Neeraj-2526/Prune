package com.neeraj.anew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

import java.util.Locale;

public class Enter_OTP_sent extends AppCompatActivity {
    TextView t1,t2,t3;
    private static final long  Start_TIME3 = 30000;
    private CountDownTimer mcountDownTimer3;
    private long mTimeLeftMillis3 =Start_TIME3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter__o_t_p_sent);
        t1=findViewById(R.id.textView191);
        t2=findViewById(R.id.textView190);
        t3=findViewById(R.id.textView192);
        mcountDownTimer3=new CountDownTimer(mTimeLeftMillis3,1000) {
            @Override
            public void onTick(long l) {
                mTimeLeftMillis3 = l;
                updateCountDownText();
            }
            private void updateCountDownText(){
                int minutes=(int)(mTimeLeftMillis3/1000)/60;
                int seconds=(int)(mTimeLeftMillis3/1000)%60;
                String timeLeft=String.format(Locale.getDefault(),"%02d",seconds);
                t1.setText(timeLeft);

            }

            @Override
            public void onFinish() {
                mcountDownTimer3.cancel();
                t2.setText("");
                t3.setText("");
                t1.setText("Retry");
            }
        }.start();

    }
}