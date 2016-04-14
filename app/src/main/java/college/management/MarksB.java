package college.management;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Spinner;
import android.widget.TextView;


import college.management.Database.DBconnectionB;

public class MarksB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marks_b);

         /*getSupportActionBar().hide();*/ // Hide Action bar
        // Action bar color
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#006064"));
        getSupportActionBar().setBackgroundDrawable(colorDrawable);


        // subject 1 marks retrieving
        DBconnectionB db= new DBconnectionB(this);
        String s1 = db.subjectI();
        String s2 = db.subjectII();
        String s3 = db.subjectIII();
        int total= db.total();
        float percent=db.percent();
        db.close();

        // Set textview
        TextView f1= (TextView) findViewById(R.id.s1b);
        f1.setText(s1);

        TextView f2= (TextView) findViewById(R.id.s2b);
        f2.setText(s2);

        TextView f3= (TextView) findViewById(R.id.s3b);
        f3.setText(s3);

        TextView ttl= (TextView) findViewById(R.id.ttlb);
        ttl.setText(String.valueOf(total));

        TextView percn= (TextView) findViewById(R.id.perb);
        percn.setText(String.valueOf(percent));






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
