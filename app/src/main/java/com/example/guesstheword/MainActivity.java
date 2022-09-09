package com.example.guesstheword;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.Lottie;
import com.airbnb.lottie.LottieAnimationView;
import com.example.guesstheword.databinding.ActivityMainBinding;

import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public class MainActivity extends AppCompatActivity {


    private int maxlife = 5;
    public String Answer;
    public char letter;
    int presscount;
    int score = 0;
    public String[] Words = {"BIRD", "FIT", "BRAIN", "JACKPOT", "ACTION"};
    public char[] position;
    Animation smallbigforth;
    ActivityMainBinding binding;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    PopupWindow popupWindow, popupWindow2;
    ConstraintLayout constraintLayout, constraintLayout2;
    LottieAnimationView lottie, idea, win;
    ImageView retry, retry2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        editor = sharedPreferences.edit();
        Random random = new Random();
        int index = random.nextInt(Words.length);
        Answer = Words[index];
        position = Answer.toCharArray();

        smallbigforth = AnimationUtils.loadAnimation(this, R.anim.smallbigforth);
        int Length = Answer.length();
        if (Length == 3) {
            binding.editText1.setVisibility(View.VISIBLE);
            binding.editText2.setVisibility(View.VISIBLE);
            binding.editText3.setVisibility(View.VISIBLE);


        } else if (Length == 4) {
            binding.editText1.setVisibility(View.VISIBLE);
            binding.editText2.setVisibility(View.VISIBLE);
            binding.editText3.setVisibility(View.VISIBLE);
            binding.editText4.setVisibility(View.VISIBLE);

        } else if (Length == 5) {
            binding.editText1.setVisibility(View.VISIBLE);
            binding.editText2.setVisibility(View.VISIBLE);
            binding.editText3.setVisibility(View.VISIBLE);
            binding.editText4.setVisibility(View.VISIBLE);
            binding.editText5.setVisibility(View.VISIBLE);

        } else if (Length == 6) {
            binding.editText1.setVisibility(View.VISIBLE);
            binding.editText2.setVisibility(View.VISIBLE);
            binding.editText3.setVisibility(View.VISIBLE);
            binding.editText4.setVisibility(View.VISIBLE);
            binding.editText5.setVisibility(View.VISIBLE);
            binding.editText6.setVisibility(View.VISIBLE);


        } else if (Length == 7) {
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
        retry = findViewById(R.id.retry);
        binding.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
                finishAffinity();
            }
        });

        idea = findViewById(R.id.idea);
        idea.animate().translationX(2000).setDuration(2000).setStartDelay(2900);
        idea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random random2 = new Random();
                int index2 = random2.nextInt(position.length);
                letter = position[index2];
                if (position.length == 3) {
                    if (binding.editText1.getText().length() == 0) {
                        binding.editText1.setText(position[0]);
                        hintcharacter(String.valueOf(position[0]));
                    } else if (binding.editText2.getText().length() == 0) {
                        binding.editText2.setText(position[1]);
                        hintcharacter(String.valueOf(position[1]));
                    } else if (binding.editText3.getText().length() == 0) {
                        binding.editText3.setText(position[2]);
                        hintcharacter(String.valueOf(position[2]));
                    }
                } else if (position.length == 4) {
                    if (binding.editText1.getText().length() == 0) {
                        binding.editText1.setText(position[0]);
                        hintcharacter(String.valueOf(position[0]));
                    } else if (binding.editText2.getText().length() == 0) {
                        binding.editText2.setText(position[1]);
                        hintcharacter(String.valueOf(position[1]));
                    } else if (binding.editText3.getText().length() == 0) {
                        binding.editText3.setText(position[2]);
                        hintcharacter(String.valueOf(position[2]));
                    } else if (binding.editText4.getText().length() == 0) {
                        binding.editText4.setText(position[3]);
                        hintcharacter(String.valueOf(position[3]));
                    }

                } else if (position.length == 5) {
                    if (binding.editText1.getText().length() == 0) {
                        binding.editText1.setText(position[0]);
                        hintcharacter(String.valueOf(position[0]));
                    } else if (binding.editText2.getText().length() == 0) {
                        binding.editText2.setText(position[1]);
                        hintcharacter(String.valueOf(position[1]));
                    } else if (binding.editText3.getText().length() == 0) {
                        binding.editText3.setText(position[2]);
                        hintcharacter(String.valueOf(position[2]));
                    } else if (binding.editText4.getText().length() == 0) {
                        binding.editText4.setText(position[3]);
                        hintcharacter(String.valueOf(position[3]));
                    } else if (binding.editText5.getText().length() == 0) {
                        binding.editText5.setText(position[4]);
                        hintcharacter(String.valueOf(position[4]));
                    }

                } else if (position.length == 6) {
                    if (binding.editText1.getText().length() == 0) {
                        binding.editText1.setText(position[0]);
                        hintcharacter(String.valueOf(position[0]));
                    } else if (binding.editText2.getText().length() == 0) {
                        binding.editText2.setText(position[1]);
                        hintcharacter(String.valueOf(position[1]));
                    } else if (binding.editText3.getText().length() == 0) {
                        binding.editText3.setText(position[2]);
                        hintcharacter(String.valueOf(position[2]));
                    } else if (binding.editText4.getText().length() == 0) {
                        binding.editText4.setText(position[3]);
                        hintcharacter(String.valueOf(position[3]));
                    } else if (binding.editText5.getText().length() == 0) {
                        binding.editText5.setText(position[4]);
                        hintcharacter(String.valueOf(position[4]));
                    } else if (binding.editText6.getText().length() == 0) {
                        binding.editText5.setText(position[5]);
                        hintcharacter(String.valueOf(position[5]));
                    }

                } else if (position.length == 7) {
                    if (binding.editText1.getText().length() == 0) {
                        binding.editText1.setText(position[0]);
                        hintcharacter(String.valueOf(position[0]));
                    } else if (binding.editText2.getText().length() == 0) {
                        binding.editText2.setText(position[1]);
                        hintcharacter(String.valueOf(position[1]));
                    } else if (binding.editText3.getText().length() == 0) {
                        binding.editText3.setText(position[2]);
                        hintcharacter(String.valueOf(position[2]));
                    } else if (binding.editText4.getText().length() == 0) {
                        binding.editText4.setText(position[3]);
                        hintcharacter(String.valueOf(position[3]));
                    } else if (binding.editText5.getText().length() == 0) {
                        binding.editText5.setText(position[4]);
                        hintcharacter(String.valueOf(position[4]));
                    } else if (binding.editText6.getText().length() == 0) {
                        binding.editText6.setText(position[5]);
                        hintcharacter(String.valueOf(position[5]));
                    } else if (binding.editText7.getText().length() == 0) {
                        binding.editText7.setText(position[6]);
                        hintcharacter(String.valueOf(position[6]));
                    }

                }
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

    public void checkcharacter(String ch, Button button) {
        int index1 = Answer.indexOf(ch);
        switch (index1) {
            case 0:
                button.setEnabled(false);
                binding.editText1.getText().equals(ch);
                binding.editText1.setText(ch);
                button.setBackgroundColor(Color.parseColor("#11C100"));
                button.startAnimation(smallbigforth);
                button.setVisibility(View.INVISIBLE);
                presscount = presscount + 1;
                if (Answer.length() == presscount) {
                    score = score + 10;
                    editor.putString("score", String.valueOf(score));
                    editor.apply();
                    binding.score.setText(Integer.toString(score));
                    LayoutInflater layoutInflater2 = (LayoutInflater) MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    View customView2 = layoutInflater2.inflate(R.layout.popupwin, null);
                    popupWindow2 = new PopupWindow(customView2, ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
                    //display the popup window
                    popupWindow2.showAtLocation(constraintLayout2, Gravity.CENTER, 0, 0);
                    win = findViewById(R.id.congratulations);
                    win.animate().translationX(2000).setDuration(2000).setStartDelay(2900);
                    retry2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(MainActivity.this, MainActivity.class);
                            startActivity(intent);
                            finishAffinity();
                        }
                    });

                }
                break;
            case 1:
                button.setEnabled(false);
                binding.editText2.getText().equals(ch);
                binding.editText2.setText(ch);
                button.setBackgroundColor(Color.parseColor("#11C100"));
                button.startAnimation(smallbigforth);
                button.setVisibility(View.INVISIBLE);
                presscount = presscount + 1;
                if (Answer.length() == presscount) {
                    score = score + 10;
                    editor.putString("score", String.valueOf(score));
                    editor.apply();
                    binding.score.setText(Integer.toString(score));
                    LayoutInflater layoutInflater2 = (LayoutInflater) MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    View customView2 = layoutInflater2.inflate(R.layout.popupwin, null);
                    popupWindow2 = new PopupWindow(customView2, ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
                    //display the popup window
                    popupWindow2.showAtLocation(constraintLayout2, Gravity.CENTER, 0, 0);
                    win = findViewById(R.id.congratulations);
                    win.animate().translationX(2000).setDuration(2000).setStartDelay(2900);
                    retry2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(MainActivity.this, MainActivity.class);
                            startActivity(intent);
                            finishAffinity();
                        }
                    });
                }
                break;
            case 2:
                button.setEnabled(false);
                binding.editText3.getText().equals(ch);
                binding.editText3.setText(ch);
                button.setBackgroundColor(Color.parseColor("#11C100"));
                button.startAnimation(smallbigforth);
                button.setVisibility(View.INVISIBLE);
                presscount = presscount + 1;
                if (Answer.length() == presscount) {
                    score = score + 10;
                    editor.putString("score", String.valueOf(score));
                    editor.apply();
                    binding.score.setText(Integer.toString(score));
                    LayoutInflater layoutInflater2 = (LayoutInflater) MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    View customView2 = layoutInflater2.inflate(R.layout.popupwin, null);
                    popupWindow2 = new PopupWindow(customView2, ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
                    //display the popup window
                    popupWindow2.showAtLocation(constraintLayout2, Gravity.CENTER, 0, 0);
                    win = findViewById(R.id.congratulations);
                    win.animate().translationX(2000).setDuration(2000).setStartDelay(2900);
                    retry2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(MainActivity.this, MainActivity.class);
                            startActivity(intent);
                            finishAffinity();
                        }
                    });
                }
                break;
            case 3:
                button.setEnabled(false);
                binding.editText4.getText().equals(ch);
                binding.editText4.setText(ch);
                button.setBackgroundColor(Color.parseColor("#11C100"));
                button.startAnimation(smallbigforth);
                button.setVisibility(View.INVISIBLE);
                presscount = presscount + 1;
                if (Answer.length() == presscount) {
                    score = score + 10;
                    editor.putString("score", String.valueOf(score));
                    editor.apply();
                    binding.score.setText(Integer.toString(score));
                    LayoutInflater layoutInflater2 = (LayoutInflater) MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    View customView2 = layoutInflater2.inflate(R.layout.popupwin, null);
                    popupWindow2 = new PopupWindow(customView2, ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
                    //display the popup window
                    popupWindow2.showAtLocation(constraintLayout2, Gravity.CENTER, 0, 0);
                    win = findViewById(R.id.congratulations);
                    win.animate().translationX(2000).setDuration(2000).setStartDelay(2900);
                    retry2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(MainActivity.this, MainActivity.class);
                            startActivity(intent);
                            finishAffinity();
                        }
                    });
                }
                break;
            case 4:
                button.setEnabled(false);
                binding.editText5.getText().equals(ch);
                binding.editText5.setText(ch);
                button.setBackgroundColor(Color.parseColor("#11C100"));
                button.startAnimation(smallbigforth);
                button.setVisibility(View.INVISIBLE);
                presscount = presscount + 1;
                if (Answer.length() == presscount) {
                    score = score + 10;
                    editor.putString("score", String.valueOf(score));
                    editor.apply();
                    binding.score.setText(Integer.toString(score));
                    LayoutInflater layoutInflater2 = (LayoutInflater) MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    View customView2 = layoutInflater2.inflate(R.layout.popupwin, null);
                    popupWindow2 = new PopupWindow(customView2, ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
                    //display the popup window
                    popupWindow2.showAtLocation(constraintLayout2, Gravity.CENTER, 0, 0);
                    win = findViewById(R.id.congratulations);
                    win.animate().translationX(2000).setDuration(2000).setStartDelay(2900);
                    retry2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(MainActivity.this, MainActivity.class);
                            startActivity(intent);
                            finishAffinity();
                        }
                    });
                }
                break;
            case 5:
                button.setEnabled(false);
                binding.editText6.getText().equals(ch);
                binding.editText6.setText(ch);
                button.setBackgroundColor(Color.parseColor("#11C100"));
                button.startAnimation(smallbigforth);
                button.setVisibility(View.INVISIBLE);
                presscount = presscount + 1;
                if (Answer.length() == presscount) {
                    score = score + 10;
                    editor.putString("score", String.valueOf(score));
                    editor.apply();
                    binding.score.setText(Integer.toString(score));
                    LayoutInflater layoutInflater2 = (LayoutInflater) MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    View customView2 = layoutInflater2.inflate(R.layout.popupwin, null);
                    popupWindow2 = new PopupWindow(customView2, ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
                    //display the popup window
                    popupWindow2.showAtLocation(constraintLayout2, Gravity.CENTER, 0, 0);
                    win = findViewById(R.id.congratulations);
                    win.animate().translationX(2000).setDuration(2000).setStartDelay(2900);
                    retry2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(MainActivity.this, MainActivity.class);
                            startActivity(intent);
                            finishAffinity();
                        }
                    });
                }
                break;
            case 6:
                button.setEnabled(false);
                binding.editText7.getText().equals(ch);
                binding.editText7.setText(ch);
                button.setBackgroundColor(Color.parseColor("#11C100"));
                button.startAnimation(smallbigforth);
                button.setVisibility(View.INVISIBLE);
                presscount = presscount + 1;
                if (Answer.length() == presscount) {
                    score = score + 10;
                    editor.putString("score", String.valueOf(score));
                    editor.apply();
                    binding.score.setText(Integer.toString(score));
                    LayoutInflater layoutInflater2 = (LayoutInflater) MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    View customView2 = layoutInflater2.inflate(R.layout.popupwin, null);
                    popupWindow2 = new PopupWindow(customView2, ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
                    //display the popup window
                    popupWindow2.showAtLocation(constraintLayout2, Gravity.CENTER, 0, 0);
                    win = findViewById(R.id.congratulations);
                    win.animate().translationX(2000).setDuration(2000).setStartDelay(2900);
                    retry2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(MainActivity.this, MainActivity.class);
                            startActivity(intent);
                            finishAffinity();
                        }
                    });
                }
                break;
            default:
                button.setEnabled(false);
                button.setBackgroundColor(Color.parseColor("#FF0000"));
                button.startAnimation(smallbigforth);
                button.setVisibility(View.INVISIBLE);
                maxlife = maxlife - 1;
                binding.life.setText(Integer.toString(maxlife));
                if (maxlife == 0) {

                    score = score - 5;
                    editor.putString("score", String.valueOf(score));
                    editor.apply();
                    binding.score.setText(Integer.toString(score));
                    LayoutInflater layoutInflater = (LayoutInflater) MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    View customView = layoutInflater.inflate(R.layout.popuplose, null);
                    popupWindow = new PopupWindow(customView, ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
                    //display the popup window
                    popupWindow.showAtLocation(constraintLayout, Gravity.CENTER, 0, 0);
                    lottie = findViewById(R.id.lottie);
                    lottie.animate().translationX(2000).setDuration(2000).setStartDelay(2900);
                    retry.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(MainActivity.this, MainActivity.class);
                            startActivity(intent);
                            finishAffinity();
                        }
                    });

                }
        }
    }

    public void hintcharacter(String ch) {
        switch (ch.toLowerCase()) {
            case "a":
                binding.A.setBackgroundColor(Color.parseColor("#11C100"));
                binding.A.startAnimation(smallbigforth);
                binding.A.setVisibility(View.INVISIBLE);
                break;
            case "b":
                binding.B.setBackgroundColor(Color.parseColor("#11C100"));
                binding.B.startAnimation(smallbigforth);
                binding.B.setVisibility(View.INVISIBLE);
                break;
            case "c":
                binding.C.setBackgroundColor(Color.parseColor("#11C100"));
                binding.C.startAnimation(smallbigforth);
                binding.C.setVisibility(View.INVISIBLE);
                break;
            case "d":
                binding.D.setBackgroundColor(Color.parseColor("#11C100"));
                binding.D.startAnimation(smallbigforth);
                binding.D.setVisibility(View.INVISIBLE);
                break;
            case "e":
                binding.E.setBackgroundColor(Color.parseColor("#11C100"));
                binding.E.startAnimation(smallbigforth);
                binding.E.setVisibility(View.INVISIBLE);
                break;
            case "f":
                binding.F.setBackgroundColor(Color.parseColor("#11C100"));
                binding.F.startAnimation(smallbigforth);
                binding.F.setVisibility(View.INVISIBLE);
                break;
            case "g":
                binding.G.setBackgroundColor(Color.parseColor("#11C100"));
                binding.G.startAnimation(smallbigforth);
                binding.G.setVisibility(View.INVISIBLE);
                break;
            case "h":
                binding.H.setBackgroundColor(Color.parseColor("#11C100"));
                binding.H.startAnimation(smallbigforth);
                binding.H.setVisibility(View.INVISIBLE);
                break;
            case "i":
                binding.I.setBackgroundColor(Color.parseColor("#11C100"));
                binding.I.startAnimation(smallbigforth);
                binding.I.setVisibility(View.INVISIBLE);
                break;
            case "j":
                binding.J.setBackgroundColor(Color.parseColor("#11C100"));
                binding.J.startAnimation(smallbigforth);
                binding.J.setVisibility(View.INVISIBLE);
                break;
            case "k":
                binding.K.setBackgroundColor(Color.parseColor("#11C100"));
                binding.K.startAnimation(smallbigforth);
                binding.K.setVisibility(View.INVISIBLE);
                break;
            case "l":
                binding.L.setBackgroundColor(Color.parseColor("#11C100"));
                binding.L.startAnimation(smallbigforth);
                binding.L.setVisibility(View.INVISIBLE);
                break;
            case "m":
                binding.M.setBackgroundColor(Color.parseColor("#11C100"));
                binding.M.startAnimation(smallbigforth);
                binding.M.setVisibility(View.INVISIBLE);
                break;
            case "n":
                binding.N.setBackgroundColor(Color.parseColor("#11C100"));
                binding.N.startAnimation(smallbigforth);
                binding.N.setVisibility(View.INVISIBLE);
                break;
            case "o":
                binding.O.setBackgroundColor(Color.parseColor("#11C100"));
                binding.O.startAnimation(smallbigforth);
                binding.O.setVisibility(View.INVISIBLE);
                break;
            case "p":
                binding.P.setBackgroundColor(Color.parseColor("#11C100"));
                binding.P.startAnimation(smallbigforth);
                binding.P.setVisibility(View.INVISIBLE);
                break;
            case "q":
                binding.Q.setBackgroundColor(Color.parseColor("#11C100"));
                binding.Q.startAnimation(smallbigforth);
                binding.Q.setVisibility(View.INVISIBLE);
                break;
            case "r":
                binding.R1.setBackgroundColor(Color.parseColor("#11C100"));
                binding.R1.startAnimation(smallbigforth);
                binding.R1.setVisibility(View.INVISIBLE);
                break;
            case "s":
                binding.S.setBackgroundColor(Color.parseColor("#11C100"));
                binding.S.startAnimation(smallbigforth);
                binding.S.setVisibility(View.INVISIBLE);
                break;
            case "t":
                binding.T.setBackgroundColor(Color.parseColor("#11C100"));
                binding.T.startAnimation(smallbigforth);
                binding.T.setVisibility(View.INVISIBLE);
                break;
            case "u":
                binding.U.setBackgroundColor(Color.parseColor("#11C100"));
                binding.U.startAnimation(smallbigforth);
                binding.U.setVisibility(View.INVISIBLE);
                break;
            case "v":
                binding.V.setBackgroundColor(Color.parseColor("#11C100"));
                binding.V.startAnimation(smallbigforth);
                binding.V.setVisibility(View.INVISIBLE);
                break;
            case "w":
                binding.W.setBackgroundColor(Color.parseColor("#11C100"));
                binding.W.startAnimation(smallbigforth);
                binding.W.setVisibility(View.INVISIBLE);
                break;
            case "x":
                binding.X.setBackgroundColor(Color.parseColor("#11C100"));
                binding.X.startAnimation(smallbigforth);
                binding.X.setVisibility(View.INVISIBLE);
                break;
            case "y":
                binding.Y.setBackgroundColor(Color.parseColor("#11C100"));
                binding.Y.startAnimation(smallbigforth);
                binding.Y.setVisibility(View.INVISIBLE);
                break;
            case "z":
                binding.Z.setBackgroundColor(Color.parseColor("#11C100"));
                binding.Z.startAnimation(smallbigforth);
                binding.Z.setVisibility(View.INVISIBLE);
                break;
        }
    }
}
