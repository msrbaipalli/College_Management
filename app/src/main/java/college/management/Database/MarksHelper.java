package college.management.Database;


import android.app.Activity;
import android.widget.EditText;

import college.management.R;

public class MarksHelper {

    private final Activity activity;

    public MarksHelper(Activity activity){
        this.activity= activity;
    }


    private String getTextFieldValue(int fieldID ) {

        EditText field= (EditText) activity.findViewById(fieldID);
        String value= field.getText().toString();
        return value;
    }



    public String getSub1() {

        return getTextFieldValue(R.id.sub1);

    }

    public String getSub2(){

        return getTextFieldValue(R.id.sub2);
    }


    public String getSub3(){

        return getTextFieldValue(R.id.sub3);
    }

    public Subjects createMarks() {

        return new Subjects(getSub1(), getSub2(), getSub3());
    }
}
