package com.example.karproject;

import android.view.View;

public class Plot {
    Choice choice;
    public int count_journey;
    /*String Second_pos, Third_pos, Fourth_pos, Fifth_pos;*/

    public Plot(Choice choice){
this.choice=choice;
    }




    public void but_1_clothes_1(){
        choice.textView.setText(" Придя в магазин, вы увидили лишь два вида одеяний(их вы можете посмотреть сверху). Хмм, какое же выбрать?");

        choice.imageButton1.setVisibility(View.VISIBLE);
        choice.imageButton2.setVisibility(View.VISIBLE);
        choice.imageButton4.setVisibility(View.GONE);
        choice.imageButton3.setVisibility(View.GONE);

        choice.imageButton1.setImageResource(R.drawable.button_simple_clothes);
        choice.imageButton2.setImageResource(R.drawable.button_monah_clothes);
        choice.imageView.setImageResource(R.drawable.image_clothes_shop);
    }
    public void but_2_gun_1(){
        choice.textView.setText(" В оружейной было много видов оружия(их вы можете посмотреть сверху) и вы выбрали:");
        choice.imageButton1.setVisibility(View.VISIBLE);
        choice.imageButton2.setVisibility(View.VISIBLE);
        choice.imageButton3.setVisibility(View.VISIBLE);


        choice.imageButton4.setVisibility(View.GONE);

        choice.imageButton1.setImageResource(R.drawable.button_gun);
        choice.imageButton2.setImageResource(R.drawable.button_kingzhal);
        choice.imageButton3.setImageResource(R.drawable.button_sword);
        choice.imageView.setImageResource(R.drawable.image__gun_shop);

    }
    public void but_4_shop_1(){
        choice.textView.setText(" Придя на рынок вы увидели лишь двух продавцов: с рыбой-белкой и бао-цзы(их вы можете посмотреть сверху). Выберите что-то одно");

        choice.imageButton1.setVisibility(View.VISIBLE);
        choice.imageButton2.setVisibility(View.VISIBLE);
        choice.imageButton3.setVisibility(View.GONE);
        choice.imageButton4.setVisibility(View.GONE);

        choice.imageButton1.setImageResource(R.drawable.button_bao_zhi);
        choice.imageButton2.setImageResource(R.drawable.button_squirell_fish);
        choice.imageView.setImageResource(R.drawable.image_shop);
    }



    public void but_3_hair_1(){
        choice.textView.setText(" Вы в парикмахерской, вам предложили несколько причесок(их вы можете посмотреть сверху):");

        choice.imageButton1.setVisibility(View.VISIBLE);
        choice.imageButton2.setVisibility(View.VISIBLE);
        choice.imageButton3.setVisibility(View.VISIBLE);
        choice.imageButton4.setVisibility(View.GONE);

        choice.imageButton1.setImageResource(R.drawable.button_shtori);
        choice.imageButton2.setImageResource(R.drawable.button_na_liso);
        choice.imageButton3.setImageResource(R.drawable.button_byan_fa);
        choice.imageView.setImageResource(R.drawable.image_hair_cut);
    }

    public void you_died(){
        choice.textView.setText(" продавец, увидев вашу причёску вызвал стражей и вас казнили, еще раз прочтите вступление и не умерайте так легко");
// добавить кнопку
        choice.imageButton1.setVisibility(View.VISIBLE);
        choice.imageButton2.setVisibility(View.GONE);
        choice.imageButton3.setVisibility(View.GONE);
        choice.imageButton4.setVisibility(View.GONE);
        count_journey=0;
        choice.imageButton1.setImageResource(R.drawable.button_back_to_menu);
        choice.imageView.setVisibility(View.GONE);


    }

    public void good_end_run(){
        choice.textView.setText(" Вам удалось убежать и прожить день Древнем Китае! Мои поздравления! ");
        choice.textView.setText(choice.textView.getText() + "Вы успешно прошли игру, попробуйте также альтернативные концовки");
        choice.imageButton1.setVisibility(View.VISIBLE);
        choice.imageButton2.setVisibility(View.GONE);
        choice.imageButton3.setVisibility(View.GONE);
        choice.imageButton4.setVisibility(View.GONE);
        choice.imageButton1.setImageResource(R.drawable.button_back_to_menu);
        // кнопка возвратиться в главное меню

    }
    public void bad_end_run(){
        choice.textView.setText(" Вам не удалось сбежать, вас догнали и  убили разбойники ");
        choice.textView.setText(choice.textView.getText() + "Вы не прошли игру, повторите попытку" );
        choice.imageButton1.setVisibility(View.VISIBLE);
        choice.imageButton2.setVisibility(View.GONE);
        choice.imageButton3.setVisibility(View.GONE);
        choice.imageButton4.setVisibility(View.GONE);
        choice.imageButton1.setImageResource(R.drawable.button_back_to_menu);
        // кнопка возвратиться в главное меню

    }

public void good_end_gun(){
    choice.textView.setText(" вы вырубили всех разбойников! "+"\n"+"Вам удалось победить разбойников и прожить день Древнем Китае! Мои поздравления!");
    choice.textView.setText(choice.textView.getText() + "Вы успешно прошли игру, попробуйте также альтернативные концовки" );
    choice.imageButton1.setVisibility(View.VISIBLE);
    choice.imageButton2.setVisibility(View.GONE);
    choice.imageButton3.setVisibility(View.GONE);
    choice.imageButton4.setVisibility(View.GONE);
    choice.imageButton1.setImageResource(R.drawable.button_back_to_menu);
}
public void bad_end_gun(){
    choice.textView.setText(" Силы вашего оружия недостаточно ");
    choice.textView.setText(choice.textView.getText() + "Вы не прошли игру, повторите попытку" );
    choice.imageButton1.setVisibility(View.VISIBLE);
    choice.imageButton2.setVisibility(View.GONE);
    choice.imageButton3.setVisibility(View.GONE);
    choice.imageButton4.setVisibility(View.GONE);
    choice.imageButton1.setImageResource(R.drawable.button_back_to_menu);
}

    public void  clothes_shop_back(){
        choice.textView.setText("Спасибо за покупку прекрасного одеяния - сказал вам на прощание продавец");
        choice.imageButton1.setVisibility(View.VISIBLE);
        choice.imageButton2.setVisibility(View.GONE);
        choice.imageButton3.setVisibility(View.GONE);
        choice.imageButton4.setVisibility(View.GONE);
        choice.imageButton1.setImageResource(R.drawable.button_back_to_menu);
        choice.imageView.setVisibility(View.GONE);

    }
    public void  shop_back(){
        choice.textView.setText("Спасибо за покупку еды - сказал вам на прощание продавец");
        choice.imageButton1.setVisibility(View.VISIBLE);
        choice.imageButton2.setVisibility(View.GONE);
        choice.imageButton3.setVisibility(View.GONE);
        choice.imageButton4.setVisibility(View.GONE);
        choice.imageButton1.setImageResource(R.drawable.button_back_to_menu);

        choice.imageView.setVisibility(View.GONE);
    }
    public void  gun_shop_back(){
        choice.textView.setText("Спасибо за покупку прекрасного оружия - сказал вам на прощание продавец");

        choice.imageButton1.setVisibility(View.VISIBLE);
        choice.imageButton2.setVisibility(View.GONE);
        choice.imageButton3.setVisibility(View.GONE);
        choice.imageButton4.setVisibility(View.GONE);
        choice.imageButton1.setImageResource(R.drawable.button_back_to_menu);
        choice.imageView.setVisibility(View.GONE);
    }
    public void  hair_cut_back(){
        choice.textView.setText("Приходите еще - сказал вам на прощание парикмахер");
        choice.imageButton1.setVisibility(View.VISIBLE);
        choice.imageButton2.setVisibility(View.GONE);
        choice.imageButton3.setVisibility(View.GONE);
        choice.imageButton4.setVisibility(View.GONE);
        choice.imageButton1.setImageResource(R.drawable.button_back_to_menu);
        choice.imageView.setVisibility(View.GONE);
    }
}
