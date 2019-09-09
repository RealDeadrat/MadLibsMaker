package com.example.madlibsmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class MadLibActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad_lib);

        Intent intent = getIntent();
        String noun = intent.getStringExtra(NOUN);
        String adverb = intent.getStringExtra(ADVERB);
        String adjective = intent.getStringExtra(ADJECTIVE);
        String adjective2 = intent.getStringExtra(ADJECTIVE2);
        String place = intent.getStringExtra(PLACE);
        String verb = intent.getStringExtra(VERB);
        String object = intent.getStringExtra(OBJECT);
        String number = intent.getStringExtra(NUMBER);
        String name = intent.getStringExtra(NAME);
        String verb2 = intent.getStringExtra(VERB2);

        //sets specific color for the generated words
        String genWordColor = "#ff0022";

        //applies color to generated words using the getColoredSpanned method
        String coloredNoun = getColoredSpanned(noun, genWordColor);
        String coloredAdverb = getColoredSpanned(adverb, genWordColor);
        String coloredAdjective = getColoredSpanned(adjective, genWordColor);
        String coloredAdjective2 = getColoredSpanned(adjective2, genWordColor);
        String coloredPlace = getColoredSpanned(place, genWordColor);
        String coloredVerb = getColoredSpanned(verb, genWordColor);
        String coloredObject = getColoredSpanned(object, genWordColor);
        String coloredNumber = getColoredSpanned(number, genWordColor);
        String coloredName = getColoredSpanned(name, genWordColor);
        String coloredVerb2 = getColoredSpanned(verb2, genWordColor);

        String strToDisplay = " bruh " + coloredNoun + " bruh " + coloredAdverb + " bruh " + coloredAdjective + " bruh " + coloredAdjective2 + " bruh " + coloredPlace + " bruh " + coloredVerb + " bruh " + coloredObject + " bruh " + coloredNumber + " bruh " + coloredName + " bruh " + coloredVerb2 + " bruh " ;
        TextView str = (TextView) findViewById(R.id.madlib);

        //the Html class is used to translate the code in the getColoredSpanned method which
        //changes the color, without translation the code would be added as more text and color wouldn't change
        str.setText(Html.fromHtml(strToDisplay));
    }

    //This method uses some Html code to change the color of the first String parameter inputted
    // to the color that is specified as the second String parameter
    //source: https://riptutorial.com/android/example/19946/single-textview-with-two-different-colors
    public String getColoredSpanned(String text, String color)
    {
        String input = "<font color=" + color + ">" + text + "</font>";
        return input;
    }

    public static final String NOUN = "noun";
    public static final String ADVERB = "adverb";
    public static final String ADJECTIVE = "adjective";
    public static final String ADJECTIVE2 = "adjective2";
    public static final String PLACE = "place";
    public static final String VERB = "verb";
    public static final String OBJECT = "object";
    public static final String NUMBER = "number";
    public static final String NAME = "name";
    public static final String VERB2 = "verb2";

}
