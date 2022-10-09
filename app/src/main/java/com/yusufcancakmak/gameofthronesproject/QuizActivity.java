package com.yusufcancakmak.gameofthronesproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView textViewquiz;
    private TextView question;
    private Button buttonA,buttonB,buttonC;
    private Button buttonsubmit;
    int score =0;
    int sorusayisi =QuestionAnswer.sorular.length;
    int dogrucevapIndex =0;
    String secilencevap = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        textViewquiz=findViewById(R.id.textViewquiz);
        question=findViewById(R.id.question);
        buttonA=findViewById(R.id.buttonA);
        buttonB=findViewById(R.id.buttonB);
        buttonC=findViewById(R.id.buttonC);
        buttonsubmit=findViewById(R.id.buttonsubmit);


       buttonA.setOnClickListener(this);
       buttonB.setOnClickListener(this);
       buttonC.setOnClickListener(this);
        buttonsubmit.setOnClickListener(this);

        textViewquiz.setText("Soru sayısı : "+sorusayisi);

        loadNewQuestion();

    }

    @Override
    public void onClick(View view) {
        buttonA.setBackgroundColor(Color.WHITE);
        buttonB.setBackgroundColor(Color.WHITE);
        buttonC.setBackgroundColor(Color.WHITE);
        Button clickbutton =(Button) view;
        if (clickbutton.getId()==R.id.buttonsubmit){
            if (secilencevap.equals(QuestionAnswer.dogrucevaplar[dogrucevapIndex])){
                score++;
            }
            dogrucevapIndex++;
            loadNewQuestion();

        }else {
            secilencevap=clickbutton.getText().toString();
            clickbutton.setBackgroundColor(Color.GREEN);
        }
    }

    public void loadNewQuestion(){
        if (dogrucevapIndex==sorusayisi){
            finishQuiz();
            return;
        }
        question.setText(QuestionAnswer.sorular[dogrucevapIndex]);
        buttonA.setText(QuestionAnswer.sıklar[dogrucevapIndex][0]);
        buttonB.setText(QuestionAnswer.sıklar[dogrucevapIndex][1]);
        buttonC.setText(QuestionAnswer.sıklar[dogrucevapIndex][2]);

    }
    public void finishQuiz(){
        String gecmedurumu="";
        if (score>sorusayisi*0.60){
            gecmedurumu ="Başarılı";
        }else {
            gecmedurumu="Başarısız";

        }
        new AlertDialog.Builder(this)
                .setTitle(gecmedurumu)
                .setMessage("Sonuc "+ score +" / " +sorusayisi)
                .setPositiveButton("Tekrar dene",(((dialogInterface, i) -> restartQuiz())))
                .show();
    }
    public void restartQuiz(){
        score = 0;
        dogrucevapIndex = 0;
        loadNewQuestion();
    }

}