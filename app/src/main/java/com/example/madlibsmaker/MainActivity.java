package com.example.madlibsmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendLib(View v)
    {
        EditText noun = (EditText) findViewById(R.id.noun);
        EditText adverb = (EditText) findViewById(R.id.leftOrgEdTxt);
        EditText adjective = (EditText) findViewById(R.id.rightOrgEdTxt);
        EditText adjective2 = (EditText) findViewById(R.id.adjective2);
        EditText place = (EditText) findViewById(R.id.place);
        EditText verb = (EditText) findViewById(R.id.verb);
        EditText object = (EditText) findViewById(R.id.object);
        EditText number = (EditText) findViewById(R.id.number);
        EditText name = (EditText) findViewById(R.id.name);
        EditText verb2 = (EditText) findViewById(R.id.verb2);

        String nounStr = noun.getText().toString();
        String adverbStr = adverb.getText().toString();
        String adjectiveStr = adjective.getText().toString();
        String adjective2Str = adjective2.getText().toString();
        String placeStr = place.getText().toString();
        String verbStr = verb.getText().toString();
        String objectStr = object.getText().toString();
        String numberStr = number.getText().toString();
        String nameStr = name.getText().toString();
        String verb2Str = verb2.getText().toString();

        Intent intent = new Intent(this, MadLibActivity.class);

        intent.putExtra(MadLibActivity.NOUN, nounStr);
        intent.putExtra(MadLibActivity.ADVERB, adverbStr);
        intent.putExtra(MadLibActivity.ADJECTIVE, adjectiveStr);
        intent.putExtra(MadLibActivity.ADJECTIVE2, adjective2Str);
        intent.putExtra(MadLibActivity.PLACE, placeStr);
        intent.putExtra(MadLibActivity.VERB, verbStr);
        intent.putExtra(MadLibActivity.OBJECT, objectStr);
        intent.putExtra(MadLibActivity.NUMBER, numberStr);
        intent.putExtra(MadLibActivity.NAME, nameStr);
        intent.putExtra(MadLibActivity.VERB2, verb2Str);

        startActivity(intent);

    }
}
