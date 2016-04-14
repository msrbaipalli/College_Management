package college.management;


import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import college.management.Database.DBconnection;
import college.management.Database.DBconnectionA;
import college.management.Database.DBconnectionB;
import college.management.Database.DBconnectionC;
import college.management.Database.MarksHelper;
import college.management.Database.Subjects;

public class TakeMarks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_marks);

        // Action bar color
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#006064"));
        getSupportActionBar().setBackgroundDrawable(colorDrawable);

    }




    public void MarksSubmitted(View view) {

        int myNum = 0;

        Spinner proA = (Spinner) findViewById(R.id.marksRollno);
        String r1= proA.getSelectedItem().toString();

        MarksHelper helper = new MarksHelper(this);
        Subjects subMarks = helper.createMarks();


        EditText m1 = (EditText) findViewById(R.id.sub1);
        int m1v= -1;
        try {
            myNum = Integer.parseInt(m1.getText().toString());
            m1v = myNum;
        } catch(NumberFormatException nfe) {
            System.out.println("Could not parse " + nfe);
        }



        EditText m2 = (EditText) findViewById(R.id.sub2);
        int m2v= -1;
        try {
            myNum =  Integer.parseInt(m2.getText().toString());
            m2v = myNum;
        } catch(NumberFormatException nfe) {
            System.out.println("Could not parse " + nfe);
        }


        EditText m3 = (EditText) findViewById(R.id.sub3);
        int m3v= -1;
        try {
            myNum = Integer.parseInt(m3.getText().toString());
            m3v = myNum;
        } catch(NumberFormatException nfe) {
            System.out.println("Could not parse " + nfe);
        }



        if(r1.equals("12R01A0561")) {


            if(m1v > 25 || m1v < 0 || m1.getText().toString().equals("") )
            {
                Toast.makeText(this,"Enter marks in between 0-25 in subject I.", Toast.LENGTH_LONG).show();
            }

            else if(m2v > 25 || m2v < 0 || m2.getText().toString().equals(""))
            {
                Toast.makeText(this,"Enter marks in between 0-25 in subject II.", Toast.LENGTH_LONG).show();

            }

            else if(m3v > 25 || m3v < 0 || m3.getText().toString().equals(""))
            {
                Toast.makeText(this,"Enter marks in between 0-25 in subject III.", Toast.LENGTH_LONG).show();

            }

            else{

                // Save Marks into database
                DBconnectionB marksB = new DBconnectionB(this);
                marksB.insert(subMarks);
                marksB.close();
                Toast.makeText(this, "Marks has been awarded to " +r1+ ".", Toast.LENGTH_LONG).show();

            }



        }


        else if(r1.equals("12R01A0562")) {

            Toast.makeText(this, "This " +r1+ " has not been registered", Toast.LENGTH_LONG).show();

            // Save Marks into database
            /*DBconnectionC marksC = new DBconnectionC(this);
            marksC.insert(subMarks);
            marksC.close();
            Toast.makeText(this, "Marks has been awarded to " +r1+ ".", Toast.LENGTH_LONG).show();*/
        }



        else if(r1.equals("12R01A0563")) {

            if(m1v > 25 || m1v < 0)
            {
                Toast.makeText(this,"Enter marks in between 0-25 in subject I.", Toast.LENGTH_LONG).show();
            }

            else if(m2v > 25 || m2v < 0)
            {
                Toast.makeText(this,"Enter marks in between 0-25 in subject II.", Toast.LENGTH_LONG).show();

            }

            else if(m3v > 25 || m3v < 0)
            {
                Toast.makeText(this,"Enter marks in between 0-25 in subject III.", Toast.LENGTH_LONG).show();

            }

            else {

                // Save Marks into database
                DBconnection marks = new DBconnection(this);
                marks.insert(subMarks);
                marks.close();
                Toast.makeText(this, "Marks has been awarded to " +r1+ ".", Toast.LENGTH_LONG).show();
            }


        }

        else  if(r1.equals("12R01A0593")) {

            Toast.makeText(this, "This " +r1+ " has not been registered.", Toast.LENGTH_LONG).show();

            // Save Marks into database
            /*DBconnectionA marksA = new DBconnectionA(this);
            marksA.insert(subMarks);
            marksA.close();
            Toast.makeText(this, "Marks has been awarded to " +r1+ ".", Toast.LENGTH_LONG).show();*/
        }

        else  if(r1.equals("12R01A05A3")) {

            Toast.makeText(this, "This " +r1+ " has not been registered.", Toast.LENGTH_LONG).show();

            // Save Marks into database
            /*DBconnectionA marksA = new DBconnectionA(this);
            marksA.insert(subMarks);
            marksA.close();
            Toast.makeText(this, "Marks has been awarded to " +r1+ ".", Toast.LENGTH_LONG).show();*/
        }

        else  if(r1.equals("12R01A05A7")) {

            Toast.makeText(this, "This " +r1+ " has not been registered.", Toast.LENGTH_LONG).show();

            // Save Marks into database
            /*DBconnectionA marksA = new DBconnectionA(this);
            marksA.insert(subMarks);
            marksA.close();
            Toast.makeText(this, "Marks has been awarded to " +r1+ ".", Toast.LENGTH_LONG).show();*/
        }




        else
        {
            Toast.makeText(this, "Permission denied", Toast.LENGTH_LONG).show();
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        menu.add(0, 1, 0, "logout").setIcon(R.drawable.logout)
                .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 1:
                Intent intent = new Intent(this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("EXIT", true);
                startActivity(intent);

                return true;
            default:
                return false;
        }
    }


}
