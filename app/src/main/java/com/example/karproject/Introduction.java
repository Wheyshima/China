package com.example.karproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class Introduction extends AppCompatActivity {

    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.introduction);

        final ImageButton startImageButton = (ImageButton) findViewById(R.id.imageButton2);
        TextView textView1 =(TextView)findViewById(R.id.textView1);
        TextView textView2 =(TextView)findViewById(R.id.textView2);
        TextView textView3 =(TextView)findViewById(R.id.textView3);
        TextView textView4 =(TextView)findViewById(R.id.textView4);

        startImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Introduction.this,Choice.class); startActivity(intent);finish();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        textView1.setText("\n"+"  Чтобы пройти игру вам надо прожить день в Древнем Китае во время 19 века"+"\n");
        textView2.setText("  За этот день выдолжны посетить 4 места: парикмахерскую, магазин одежды, оружейную и рынок"+"\n");
        textView2.setText(textView2.getText()+"\n"+"  Все ваши выборы влияют на исход! Так что будьте внимательны и не ленитесь прочитать факты о Древнем Китае.");
        textView3.setText("  1)в 19 веке Китай был под властью маньчжур и поэтому все китайские мужчины должны были сбривать спереди волосы а оставшиеся заплетать в косы, неисполнение каралось смертью. по умолчанию ваши волосы заплетены в пучок "+"\n"
                +"  2)Бао-цзы-традиционные китайские пирожки. Рыба-белка-это рыба разрезанная, поджаренная особым образом и политая красным соусом. Рыба-белка сытнее бао-цзы"+"\n"
        +"  3)Буддийские монахи часто одевают оранжевые и красные одеяния"+"\n"
           +"  4)Одежда монаха добавит маны, которая может тебе помочь в бою"+"\n"
                );
        textView4.setText("Вы выглядите так:");



    }
}