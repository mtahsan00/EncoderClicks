package com.example.muhammad.encoderdistancecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main_Page extends AppCompatActivity {

    public static final int SINGLE_REVOLUTION_ENCODER = 1200;//running on the assumption that 1200 clicks = one revolution.
    public static double diameter;
    public static double circumfrence;
    public static double distance;
    public static double revolutions;
    public static double encoderClicks;
    public static TextView answer;
    public static EditText diameterInput;
    public static EditText distanceInput;

    public void clickFunction(View view){
        getInputs();
        //calculateCircumfrence();
        //calculateRevolutions();
        //convertRevolutions();
        setEcoderClicks();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__page);
        answer = (TextView)findViewById(R.id.encoderClicks);
        diameterInput = (EditText) findViewById(R.id.diameterField);
        distanceInput = (EditText) findViewById(R.id.distanceField);

    }

    public static void getInputs(){ //receives inputs from text boxes(Don't need to know this)
        diameter = Double.parseDouble(distanceInput.getText().toString());
        distance = Double.parseDouble(distanceInput.getText().toString());
    }
   public static double calculateCircumfrence(){ //calculates the circumference
        circumfrence = diameter * Math.PI;
        return circumfrence;
    }

   public static double calculateRevolutions(){ //calculate the Revolutions
       revolutions = distance/calculateRevolutions();
        return revolutions;
    }
   public static double convertRevolutions() { //translates the revolutions to encoder clicks.
       encoderClicks = calculateCircumfrence() * SINGLE_REVOLUTION_ENCODER;
       return encoderClicks;
   }
   public void setEcoderClicks(){
        String encoder = Double.toString(convertRevolutions());
        answer.setText(encoder);
    }
}
