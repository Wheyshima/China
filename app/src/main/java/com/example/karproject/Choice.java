package com.example.karproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Choice extends AppCompatActivity {
   private int count_butt_1=0;
    private int count_butt_2=0;
    private int count_butt_3=0;
    private int count_butt_4=0;
    private int count_journey=0;
    private int count_poor=0;

    private int amount_health=20;
    private int amount_mana=20;
    private int amount_skills=20;

    private int not_let_click=0;
    private int boss_level=0;
    private  int count_end=0;





    TextView textView;
    ImageButton imageButton1;
    ImageButton imageButton2;
    ImageButton imageButton3;
    ImageButton imageButton4;

    ImageButton imageButton_help;
    ImageButton imageButton_ignor;


    ImageView imageView;




Plot plot=new Plot(this);




public void not_let_click_twice(int not_let_click){


imageView.setImageResource(R.drawable.image_menu_of_levels);

    imageButton1.setVisibility(View.VISIBLE);
    imageButton2.setVisibility(View.VISIBLE);
    imageButton3.setVisibility(View.VISIBLE);
    imageButton4.setVisibility(View.VISIBLE);
    imageView.setVisibility(View.VISIBLE);
    if (not_let_click==0){
    textView.setText(" Выберите цель на день");
    imageButton1.setVisibility(View.VISIBLE);
   imageButton2.setVisibility(View.VISIBLE);
    imageButton3.setVisibility(View.VISIBLE);
   imageButton4.setVisibility(View.VISIBLE);

   imageButton1.setImageResource(R.drawable.clothes_shop);
    imageButton2.setImageResource(R.drawable.gun_shop);
    imageButton3.setImageResource(R.drawable.hair_cut);
   imageButton4.setImageResource(R.drawable.shop);

        imageView.setImageResource(R.drawable.image_menu_of_levels);
    }

     if (not_let_click%10==1){
        textView.setText(" Выберите цель на день");
        imageButton1.setVisibility(View.GONE);



        imageButton1.setImageResource(R.drawable.clothes_shop);
        imageButton2.setImageResource(R.drawable.gun_shop);
        imageButton3.setImageResource(R.drawable.hair_cut);
        imageButton4.setImageResource(R.drawable.shop);

         imageView.setImageResource(R.drawable.image_menu_of_levels);

    }
     if (not_let_click/10%10==1){
        textView.setText(" Выберите цель на день");

        imageButton2.setVisibility(View.GONE);




        imageButton1.setImageResource(R.drawable.clothes_shop);
        imageButton2.setImageResource(R.drawable.gun_shop);
        imageButton3.setImageResource(R.drawable.hair_cut);
        imageButton4.setImageResource(R.drawable.shop);
         imageView.setImageResource(R.drawable.image_menu_of_levels);


    }

      if (not_let_click/100%10==1){
         textView.setText(" Выберите цель на день");
         imageButton3.setVisibility(View.GONE);



         imageButton1.setImageResource(R.drawable.clothes_shop);
         imageButton2.setImageResource(R.drawable.gun_shop);
         imageButton3.setImageResource(R.drawable.hair_cut);
         imageButton4.setImageResource(R.drawable.shop);
          imageView.setImageResource(R.drawable.image_menu_of_levels);


     }
    if (not_let_click/1000==1){
        textView.setText(" Выберите цель на день");

        imageButton4.setVisibility(View.GONE);


        imageButton1.setImageResource(R.drawable.clothes_shop);
        imageButton2.setImageResource(R.drawable.gun_shop);
        imageButton3.setImageResource(R.drawable.hair_cut);
        imageButton4.setImageResource(R.drawable.shop);
        imageView.setImageResource(R.drawable.image_menu_of_levels);

    }

    }



    public void boss() {
        textView.setText("Идя по пустынной улице на вас напали разбойники"+"\n"+"Вы начали вспоминать, что вы сегодня купили такого, что могло бы вам помочь:"+"\n");
        imageButton1.setVisibility(View.VISIBLE);
        imageButton2.setVisibility(View.VISIBLE);
        imageButton3.setVisibility(View.GONE);
        imageButton4.setVisibility(View.GONE);

        count_journey = 6;


        imageButton2.setImageResource(R.drawable.button_run_away);


        if (boss_level % 10 * boss_level % 1000 / 100 == 4) {
            imageButton2.setVisibility(View.GONE);
            textView.setText("Идя по пустынной улице на вас напали разбойники"+"\n");

            textView.setText(textView.getText() +"Разбойники вас отпустили, потому что подумали, что вы монах");
            textView.setText(textView.getText() + " Вы успешно прошли игру, попробуйте также альтернативные концовки");
            boss_level+=10000;
            count_journey=5;
            imageButton1.setImageResource(R.drawable.button_back_to_menu);
        } else {

            switch (boss_level % 10) {

                case 1: {
                    textView.setText(textView.getText() + " обычные одеяния"+"\n");

                    break;
                }
                case 2: {
                    textView.setText(textView.getText() + " красные одеяния"+"\n");

                    break;
                }
            }


            switch (boss_level % 100 / 10) {
                case 1: {
                    textView.setText(textView.getText() + " Пистолет"+"\n");
                    imageButton1.setImageResource(R.drawable.button_shoot);
                    break;
                }
                case 2: {
                    textView.setText(textView.getText() + " Кинжал"+"\n");
                    imageButton1.setImageResource(R.drawable.button_hit_with_knife);
                    break;
                }
                case 3: {
                    textView.setText(textView.getText() + " Меч"+"\n");
                    imageButton1.setImageResource(R.drawable.button_hit_with_sword);
                    break;
                }
            }


            switch (boss_level % 1000 / 100) {
                case 2: {
                    textView.setText(textView.getText() + " Лысину"+"\n");

                    break;
                }
                case 3: {
                    textView.setText(textView.getText() + " Бянь-фу"+"\n");

                    break;
                }
            }


            switch (boss_level / 1000%10000) {
                case 1: {
                    textView.setText(textView.getText() + " Бао-цзы"+"\n");

                    break;
                }
                case 2: {
                    textView.setText(textView.getText() + " Рыбу-белку"+"\n");

                    break;
                }

            }

        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choice);
        imageButton1=(ImageButton) findViewById(R.id.imageButton_111);
        imageButton2=(ImageButton)findViewById(R.id.imageButton_222);
        imageButton3=(ImageButton)findViewById(R.id.imageButton_333);
        imageButton4=(ImageButton)findViewById(R.id.imageButton_444);

        imageButton_ignor=(ImageButton)findViewById(R.id.imageButton_ignor);
        imageButton_help=(ImageButton)findViewById(R.id.imageButton_help);

        imageView=(ImageView)findViewById(R.id.ImageView1);


        textView=(TextView) findViewById(R.id.textView1);

        ProgressBar progressBar=(ProgressBar)findViewById(R.id.progressBar1) ;
        ProgressBar progressBar_mana=(ProgressBar)findViewById(R.id.progressBar2) ;
        ProgressBar progressBar_skills=(ProgressBar)findViewById(R.id.progressBar3) ;

        not_let_click_twice(not_let_click);



progressBar.setProgress(amount_health);
progressBar_mana.setProgress(amount_mana);
progressBar_skills.setProgress(amount_skills);

imageButton_help.setVisibility(View.GONE);
imageButton_ignor.setVisibility(View.GONE);


    imageButton1.setOnClickListener(new View.OnClickListener() {
        @Override
         public void onClick(View view) {
            if (count_end==1&& count_journey!=31 ) {

                try {
                    Intent intent = new Intent(Choice.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                    e.printStackTrace();

                }

            }
else{
    if (count_journey==31){
        try {
            Intent intent = new Intent(Choice.this, Introduction.class);
            startActivity(intent);
            finish();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
            if (not_let_click / 1000 % 10000 + not_let_click / 100 % 10 + not_let_click / 10 % 10 + not_let_click % 10 == 4 && boss_level < 6000&&count_journey!=6&& count_end!=1) {
                boss();
                count_butt_2=2;
            }
            else
            if (boss_level % 10 * boss_level % 1000 / 100 == 4 && boss_level >= 10000&&count_butt_2==2&&count_journey!=6&& count_end!=1) {

count_journey=5;
                imageButton1.setImageResource(R.drawable.button_back_to_menu);
                try {
                    Intent intent = new Intent(Choice.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                    e.printStackTrace();

                }
            } else if (count_butt_3 != 0&&count_journey!=6) {
                if (count_journey == 0) {
                    count_journey = 1;
                    plot.but_1_clothes_1();
                } else if (count_journey == 1) {
                    count_journey = 11;
                    plot.clothes_shop_back();
                    not_let_click += 1;
                    boss_level += 1;
                    amount_mana = 65;
                    progressBar_mana.setProgress(amount_mana);

                } else if (count_journey == 2) {
                    count_journey = 21;
                    not_let_click += 10;
                    plot.gun_shop_back();
                    boss_level += 10;
                    amount_skills = 90;
                    progressBar_skills.setProgress(amount_skills);
                } else if (count_journey == 3) {
                    count_journey = 31;
                  //  not_let_click += 100;
                    plot.you_died();
                    count_end=1;


                } else if (count_journey == 4) {
                    count_journey = 41;
                    not_let_click += 1000;
                    plot.shop_back();
                    boss_level += 1000;
                    amount_health = 50;
                    progressBar.setProgress(amount_health);
                } else if (count_journey > 10&& count_journey!=31) {
                    not_let_click_twice(not_let_click);


                    count_journey = 0;

                }

            } else {
                if (count_butt_2 == 0 && count_butt_1 == 0 && count_butt_4 == 0  && count_journey != 6) {
                    plot.you_died();

                    count_butt_2 = 1;
                    count_butt_1 = 1;
                    count_butt_4 = 1;
                } else if (count_butt_2 == 1 || count_butt_1 == 1 || count_butt_4 == 1 && count_journey != 6|| count_journey==31) {
                    // not_let_click_twice(not_let_click);
                    try {
                        Intent intent = new Intent(Choice.this,Introduction.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                        e.printStackTrace();

                    }
                    count_butt_2 = 0;
                    count_butt_1 = 0;
                    count_butt_4 = 0;
                }
                else
                if (count_journey == 6 && count_end != 1) {
                    count_journey = 8;
                    count_end=1;
                    switch (boss_level % 100 / 10) {
                        case 1: {
                            plot.good_end_gun();

                            break;
                        }
                        case 2: {
                            plot.bad_end_gun();

                            break;
                        }
                        case 3: {
                            if (amount_mana > 70) {
                                plot.good_end_gun();

                            } else {
                                plot.bad_end_gun();

                            }
                            break;
                        }
                    }
                }


            }
            }


        }

    });


        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count_butt_3 != 0&& count_journey!=6) {
                    if (count_journey % 10 == 0) {
                        count_journey = 2;
                        plot.but_2_gun_1();

                    } else if (count_journey == 1) {
                      count_journey=12;
                        not_let_click+=1;
                      plot.clothes_shop_back();
                        boss_level+=2;
                        amount_mana=80;
                        progressBar_mana.setProgress(amount_mana);
                    }
                    else if (count_journey == 2) {
                        count_journey=22;
                        not_let_click+=10;
                        plot.gun_shop_back();
                        boss_level+=20;
                        amount_skills=60;
                        progressBar_skills.setProgress(amount_skills);
                    }
                    else if (count_journey == 3) {
                        count_journey=32;
                        not_let_click+=100;
                        plot.hair_cut_back();
                        boss_level+=200;

                    }
                    else if (count_journey == 4) {
                        count_journey=42;
                        not_let_click+=1000;
                        plot.shop_back();
                        boss_level+=2000;
                        amount_health=65;
                        progressBar.setProgress(amount_health);
                    }
                }
                else {
                    if (count_butt_2 == 0 && count_butt_1 == 0 && count_butt_4 == 0&& count_journey!=6) {
                        plot.you_died();
                        count_butt_2 = 1;
                        count_butt_1 = 1;
                        count_butt_4 = 1;
                    } else if (count_butt_2 == 1||count_butt_1 == 1||count_butt_4 == 1&& count_journey!=6) {
                        not_let_click_twice(not_let_click);
                        count_butt_2 = 0;
                        count_butt_1 = 0;
                        count_butt_4 = 0;
                        count_journey=0;
                        // можно добавить всплывающее окно

                    }
                    else if (count_journey==6) {
count_journey=8;
                        if (amount_health>=60){
                            count_end = 1;
plot.good_end_run();
                        }
                        else {plot.bad_end_run();
                        count_end = 1;
                        }
                    }
                }

            }
        });


        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    if (count_journey==0){
                    count_journey=3;
                        count_butt_3=1;
                    plot.but_3_hair_1();

                    }
                    else if (count_journey==2){
                    count_journey=23;
                        not_let_click+=10;
                    plot.gun_shop_back();
                        boss_level+=30;
                        amount_skills=80;
                        progressBar_skills.setProgress(amount_skills);
                    }
                    else if (count_journey==3){
                        count_journey=33;
                        not_let_click+=100;
                        plot.hair_cut_back();

                    }
                }


        });


        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count_butt_3 != 0) {


                if (count_journey == 0) {
                    count_journey = 4;
                    plot.but_4_shop_1();

                }
            }

                else {
                    if (count_butt_4 == 0) {
                        plot.you_died();
                        count_butt_4 = 1;
                    } else if (count_butt_4 == 1) {
                        not_let_click_twice(not_let_click);
                        count_journey=0;
                        count_butt_4 = 0;
                        // можно добавить всплывающее окно

                    }
                }

            }
        });
    }
}