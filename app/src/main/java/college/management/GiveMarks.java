package college.management;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;

public class GiveMarks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_give_marks);

        // Action bar color
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#006064"));
        getSupportActionBar().setBackgroundDrawable(colorDrawable);

    }

    public void MarksSubmit(View view) {


        Spinner year = (Spinner) findViewById(R.id.marksYear);
        String f1= year.getSelectedItem().toString();

        Spinner sem = (Spinner) findViewById(R.id.marksSem);
        String f2= sem.getSelectedItem().toString();

        Spinner branch = (Spinner) findViewById(R.id.marksBranch);
        String f3= branch.getSelectedItem().toString();

        Spinner section = (Spinner) findViewById(R.id.marksSection);
        String f4= section.getSelectedItem().toString();








        if(f1.equals("4th")&& f2.equals("II") && f3.equals("CSE") && f4.equals("B"))
        {
            Intent i = new Intent(this, TakeMarks.class);
            startActivity(i);

        }

        else {

            Toast.makeText(this, "Permission Denied", Toast.LENGTH_LONG).show();
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
