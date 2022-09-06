package com.example.guesstheword;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.guesstheword.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private int maxlife=5;
    public String Answer;
    int presscount;
    int score=0;
    public String[] Words={"BIRD","FIT","BRAIN","JACKPOT","ACTION"};
    Animation smallbigforth;
    ActivityMainBinding binding;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        editor = sharedPreferences.edit();
        Random random=new Random();
        int index=random.nextInt(Words.length);
        Answer=Words[index];

        smallbigforth = AnimationUtils.loadAnimation(this, R.anim.smallbigforth);
        int Length=Answer.length();
        if (Length==3)
        {
            binding.editText1.setVisibility(View.VISIBLE);
            binding.editText2.setVisibility(View.VISIBLE);
            binding.editText3.setVisibility(View.VISIBLE);


        }
        else if(Length==4)
        {
            binding.editText1.setVisibility(View.VISIBLE);
            binding.editText2.setVisibility(View.VISIBLE);
            binding.editText3.setVisibility(View.VISIBLE);
            binding.editText4.setVisibility(View.VISIBLE);

        }
        else if (Length==5)
        {
            binding.editText1.setVisibility(View.VISIBLE);
            binding.editText2.setVisibility(View.VISIBLE);
            binding.editText3.setVisibility(View.VISIBLE);
            binding.editText4.setVisibility(View.VISIBLE);
            binding.editText5.setVisibility(View.VISIBLE);

        }
        else if(Length==6)
        {
            binding.editText1.setVisibility(View.VISIBLE);
            binding.editText2.setVisibility(View.VISIBLE);
            binding.editText3.setVisibility(View.VISIBLE);
            binding.editText4.setVisibility(View.VISIBLE);
            binding.editText5.setVisibility(View.VISIBLE);
            binding.editText6.setVisibility(View.VISIBLE);


        }
        else if(Length==7)
        {
            binding.editText1.setVisibility(View.VISIBLE);
            binding.editText2.setVisibility(View.VISIBLE);
            binding.editText3.setVisibility(View.VISIBLE);
            binding.editText4.setVisibility(View.VISIBLE);
            binding.editText5.setVisibility(View.VISIBLE);
            binding.editText6.setVisibility(View.VISIBLE);
            binding.editText7.setVisibility(View.VISIBLE);

        }
        binding.A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                checkcharacter("A", binding.A);
            }
        });
        binding.B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkcharacter("B", binding.B);
            }
        });
        binding.C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkcharacter("C", binding.C);
            }
        });
        binding.D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkcharacter("D", binding.D);
            }
        });
        binding.E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkcharacter("E", binding.E);
            }
        });
        binding.F.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkcharacter("F", binding.F);
            }
        });
        binding.G.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkcharacter("G", binding.G);
            }
        });
        binding.H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkcharacter("H", binding.H);
            }
        });
        binding.I.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkcharacter("I", binding.I);
            }
        });
        binding.J.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkcharacter("J", binding.J);
            }
        });
        binding.K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkcharacter("K", binding.K);
            }
        });
        binding.L.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkcharacter("L", binding.L);
            }
        });
        binding.M.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkcharacter("M", binding.M);
            }
        });
        binding.N.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkcharacter("N", binding.N);
            }
        });
        binding.O.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkcharacter("O", binding.O);
            }
        });
        binding.P.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkcharacter("P", binding.P);
            }
        });
        binding.Q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkcharacter("Q", binding.Q);
            }
        });
        binding.R1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkcharacter("R", binding.R1);
            }
        });
        binding.S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkcharacter("S", binding.S);
            }
        });
        binding.T.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkcharacter("T", binding.T);
            }
        });
        binding.U.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkcharacter("U", binding.U);
            }
        });
        binding.V.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkcharacter("V", binding.V);
            }
        });
        binding.W.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkcharacter("W", binding.W);
            }
        });
        binding.X.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkcharacter("X", binding.X);
            }
        });
        binding.Y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkcharacter("Y", binding.Y);
            }
        });
        binding.Z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkcharacter("Z", binding.Z);
            }
        });
        binding.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent);
                finishAffinity();
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        String s1 = sharedPreferences.getString("score", "");
        score = Integer.parseInt(s1);
        binding.score.setText(s1);
    }

    public void checkcharacter(String ch, Button button)
    {
        int index1=Answer.indexOf(ch);
        switch (index1){
            case 0:
                button.setEnabled(false);
                binding.editText1.getText().equals(ch);
                binding.editText1.setText(ch);
                button.setBackgroundColor(Color.parseColor("#11C100"));
                button.startAnimation(smallbigforth);
                button.setVisibility(View.INVISIBLE);
                presscount=presscount+1;
                if (Answer.length()==presscount)
                {
                    Toast.makeText(this, "You Won", Toast.LENGTH_SHORT).show();
                    score=score+10;
                    editor.putString("score", String.valueOf(score));
                    editor.apply();
                    binding.score.setText(Integer.toString(score));
                    Intent intent=new Intent(MainActivity.this,MainActivity.class);
                    startActivity(intent);
                    finishAffinity();
                }
                break;
            case 1:
                button.setEnabled(false);
                binding.editText2.getText().equals(ch);
                binding.editText2.setText(ch);
                button.setBackgroundColor(Color.parseColor("#11C100"));
                button.startAnimation(smallbigforth);
                button.setVisibility(View.INVISIBLE);
                presscount=presscount+1;
                if (Answer.length()==presscount)
                {
                    Toast.makeText(this, "You Won", Toast.LENGTH_SHORT).show();
                    score=score+10;
                    editor.putString("score", String.valueOf(score));
                    editor.apply();
                    binding.score.setText(Integer.toString(score));
                    Intent intent=new Intent(MainActivity.this,MainActivity.class);
                    startActivity(intent);
                    finishAffinity();
                }
                break;
            case 2:
                button.setEnabled(false);
                binding.editText3.getText().equals(ch);
                binding.editText3.setText(ch);
                button.setBackgroundColor(Color.parseColor("#11C100"));
                button.startAnimation(smallbigforth);
                button.setVisibility(View.INVISIBLE);
                presscount=presscount+1;
                if (Answer.length()==presscount)
                {
                    Toast.makeText(this, "You Won", Toast.LENGTH_SHORT).show();
                    score=score+10;
                    editor.putString("score", String.valueOf(score));
                    editor.apply();
                    binding.score.setText(Integer.toString(score));
                    Intent intent=new Intent(MainActivity.this,MainActivity.class);
                    startActivity(intent);
                    finishAffinity();
                }
                break;
            case 3:
                button.setEnabled(false);
                binding.editText4.getText().equals(ch);
                binding.editText4.setText(ch);
                button.setBackgroundColor(Color.parseColor("#11C100"));
                button.startAnimation(smallbigforth);
                button.setVisibility(View.INVISIBLE);
                presscount=presscount+1;
                if (Answer.length()==presscount)
                {
                    Toast.makeText(this, "You Won", Toast.LENGTH_SHORT).show();
                    score=score+10;
                    editor.putString("score", String.valueOf(score));
                    editor.apply();
                    binding.score.setText(Integer.toString(score));
                    Intent intent=new Intent(MainActivity.this,MainActivity.class);
                    startActivity(intent);
                    finishAffinity();
                }
                break;
            case 4:
                button.setEnabled(false);
                binding.editText5.getText().equals(ch);
                binding.editText5.setText(ch);
                button.setBackgroundColor(Color.parseColor("#11C100"));
                button.startAnimation(smallbigforth);
                button.setVisibility(View.INVISIBLE);
                presscount=presscount+1;
                if (Answer.length()==presscount)
                {
                    Toast.makeText(this, "You Won", Toast.LENGTH_SHORT).show();
                    score=score+10;
                    editor.putString("score", String.valueOf(score));
                    editor.apply();
                    binding.score.setText(Integer.toString(score));
                    Intent intent=new Intent(MainActivity.this,MainActivity.class);
                    startActivity(intent);
                    finishAffinity();
                }
                break;
            case 5:
                button.setEnabled(false);
                binding.editText6.getText().equals(ch);
                binding.editText6.setText(ch);
                button.setBackgroundColor(Color.parseColor("#11C100"));
                button.startAnimation(smallbigforth);
                button.setVisibility(View.INVISIBLE);
                presscount=presscount+1;
                if (Answer.length()==presscount)
                {
                    Toast.makeText(this, "You Won", Toast.LENGTH_SHORT).show();
                    score=score+10;
                    editor.putString("score", String.valueOf(score));
                    editor.apply();
                    binding.score.setText(Integer.toString(score));
                    Intent intent=new Intent(MainActivity.this,MainActivity.class);
                    startActivity(intent);
                    finishAffinity();
                }
                break;
            case 6:
                button.setEnabled(false);
                binding.editText7.getText().equals(ch);
                binding.editText7.setText(ch);
                button.setBackgroundColor(Color.parseColor("#11C100"));
                button.startAnimation(smallbigforth);
                button.setVisibility(View.INVISIBLE);
                presscount=presscount+1;
                if (Answer.length()==presscount)
                {
                    Toast.makeText(this, "You Won", Toast.LENGTH_SHORT).show();
                    score=score+10;
                    editor.putString("score", String.valueOf(score));
                    editor.apply();
                    binding.score.setText(Integer.toString(score));
                    Intent intent=new Intent(MainActivity.this,MainActivity.class);
                    startActivity(intent);
                    finishAffinity();
                }
                break;
            default:
                button.setEnabled(false);
                button.setBackgroundColor(Color.parseColor("#FF0000"));
                button.startAnimation(smallbigforth);
                button.setVisibility(View.INVISIBLE);
                maxlife=maxlife-1;
                binding.life.setText(Integer.toString(maxlife));
                if (maxlife==0)
                {
                    Toast.makeText(this, "You Lose", Toast.LENGTH_SHORT).show();
                    score=score-5;
                    editor.putString("score", String.valueOf(score));
                    editor.apply();
                    binding.score.setText(Integer.toString(score));
                    Intent intent=new Intent(MainActivity.this,MainActivity.class);
                    startActivity(intent);
                    finishAffinity();
                }
        }
    }
}
