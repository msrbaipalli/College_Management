package college.management;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.ColorRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TakeAttendance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_attendance);

        // Action bar color
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#006064"));
        getSupportActionBar().setBackgroundDrawable(colorDrawable);

    }

    /* ##################################################################################################*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        menu.add(0, 1, 0, "done").setIcon(R.drawable.done)
                .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 1:
                Toast.makeText(this, "Attendance has been submitted", Toast.LENGTH_LONG).show();
                finish();
                Intent attendance = new Intent(this, GiveAttendance.class);
                startActivity(attendance);

                return true;
            default:
                return false;
        }
    }
   /* ##################################################################################################*/


    public void ab1(View view) {
        Button b1= (Button) findViewById(R.id.a1);
        b1.setBackgroundColor(getResources().getColor(R.color.red));

        Button b2= (Button) findViewById(R.id.p1);
        b2.setBackgroundColor(getResources().getColor(R.color.gray));
    }

        public void pr1(View view) {
        Button b1= (Button) findViewById(R.id.p1);
        b1.setBackgroundColor(getResources().getColor(R.color.green));

        Button b2= (Button) findViewById(R.id.a1);
        b2.setBackgroundColor(getResources().getColor(R.color.gray));
        }




    public void ab2(View view) {
        Button b1= (Button) findViewById(R.id.a2);
        b1.setBackgroundColor(getResources().getColor(R.color.red));

        Button b2= (Button) findViewById(R.id.p2);
        b2.setBackgroundColor(getResources().getColor(R.color.gray));
    }

    public void pr2(View view) {
        Button b1= (Button) findViewById(R.id.p2);
        b1.setBackgroundColor(getResources().getColor(R.color.green));

        Button b2= (Button) findViewById(R.id.a2);
        b2.setBackgroundColor(getResources().getColor(R.color.gray));
    }


    public void ab3(View view) {
        Button b1= (Button) findViewById(R.id.a3);
        b1.setBackgroundColor(getResources().getColor(R.color.red));

        Button b2= (Button) findViewById(R.id.p3);
        b2.setBackgroundColor(getResources().getColor(R.color.gray));
    }

    public void pr3(View view) {
        Button b1= (Button) findViewById(R.id.p3);
        b1.setBackgroundColor(getResources().getColor(R.color.green));

        Button b2= (Button) findViewById(R.id.a3);
        b2.setBackgroundColor(getResources().getColor(R.color.gray));
    }


    public void ab4(View view) {
        Button b1= (Button) findViewById(R.id.a4);
        b1.setBackgroundColor(getResources().getColor(R.color.red));

        Button b2= (Button) findViewById(R.id.p4);
        b2.setBackgroundColor(getResources().getColor(R.color.gray));
    }

    public void pr4(View view) {
        Button b1= (Button) findViewById(R.id.p4);
        b1.setBackgroundColor(getResources().getColor(R.color.green));

        Button b2= (Button) findViewById(R.id.a4);
        b2.setBackgroundColor(getResources().getColor(R.color.gray));
    }


    public void ab5(View view) {
        Button b1= (Button) findViewById(R.id.a5);
        b1.setBackgroundColor(getResources().getColor(R.color.red));

        Button b2= (Button) findViewById(R.id.p5);
        b2.setBackgroundColor(getResources().getColor(R.color.gray));
    }

    public void pr5(View view) {
        Button b1= (Button) findViewById(R.id.p5);
        b1.setBackgroundColor(getResources().getColor(R.color.green));

        Button b2= (Button) findViewById(R.id.a5);
        b2.setBackgroundColor(getResources().getColor(R.color.gray));
    }


    public void ab6(View view) {
        Button b1= (Button) findViewById(R.id.a6);
        b1.setBackgroundColor(getResources().getColor(R.color.red));

        Button b2= (Button) findViewById(R.id.p6);
        b2.setBackgroundColor(getResources().getColor(R.color.gray));
    }

    public void pr6(View view) {
        Button b1= (Button) findViewById(R.id.p6);
        b1.setBackgroundColor(getResources().getColor(R.color.green));

        Button b2= (Button) findViewById(R.id.a6);
        b2.setBackgroundColor(getResources().getColor(R.color.gray));
    }


    public void ab7(View view) {
        Button b1= (Button) findViewById(R.id.a7);
        b1.setBackgroundColor(getResources().getColor(R.color.red));

        Button b2= (Button) findViewById(R.id.p7);
        b2.setBackgroundColor(getResources().getColor(R.color.gray));
    }

    public void pr7(View view) {
        Button b1= (Button) findViewById(R.id.p7);
        b1.setBackgroundColor(getResources().getColor(R.color.green));

        Button b2= (Button) findViewById(R.id.a7);
        b2.setBackgroundColor(getResources().getColor(R.color.gray));
    }


    public void ab8(View view) {
        Button b1= (Button) findViewById(R.id.a8);
        b1.setBackgroundColor(getResources().getColor(R.color.red));

        Button b2= (Button) findViewById(R.id.p8);
        b2.setBackgroundColor(getResources().getColor(R.color.gray));
    }

    public void pr8(View view) {
        Button b1= (Button) findViewById(R.id.p8);
        b1.setBackgroundColor(getResources().getColor(R.color.green));

        Button b2= (Button) findViewById(R.id.a8);
        b2.setBackgroundColor(getResources().getColor(R.color.gray));
    }


    public void ab9(View view) {
        Button b1= (Button) findViewById(R.id.a9);
        b1.setBackgroundColor(getResources().getColor(R.color.red));

        Button b2= (Button) findViewById(R.id.p9);
        b2.setBackgroundColor(getResources().getColor(R.color.gray));
    }

    public void pr9(View view) {
        Button b1= (Button) findViewById(R.id.p9);
        b1.setBackgroundColor(getResources().getColor(R.color.green));

        Button b2= (Button) findViewById(R.id.a9);
        b2.setBackgroundColor(getResources().getColor(R.color.gray));
    }


    public void ab10(View view) {
        Button b1= (Button) findViewById(R.id.a10);
        b1.setBackgroundColor(getResources().getColor(R.color.red));

        Button b2= (Button) findViewById(R.id.p10);
        b2.setBackgroundColor(getResources().getColor(R.color.gray));
    }

    public void pr10(View view) {
        Button b1= (Button) findViewById(R.id.p10);
        b1.setBackgroundColor(getResources().getColor(R.color.green));

        Button b2= (Button) findViewById(R.id.a10);
        b2.setBackgroundColor(getResources().getColor(R.color.gray));
    }




}
