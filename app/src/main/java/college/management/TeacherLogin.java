package college.management;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import college.management.StudentProfile.StudentproA;
import college.management.TeacherProfile.TeacherProA;


public class TeacherLogin extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_login);

        getSupportActionBar().hide(); // Hide Action bar
    }




    public void loginTeacher(View view) {

        EditText TeacherName = (EditText) findViewById(R.id.teacher_username);
        EditText TeacherPassword = (EditText) findViewById(R.id.teacher_password);

        /*TextView text= (TextView) findViewById(R.id.welcome);
        String msg = TeacherName.getText().toString();
        text.setText(msg);
        */


        if(TeacherName.getText().toString().equals("test") && TeacherPassword.getText().toString().equals("test"))
        {
            Intent i = new Intent(this, TeacherProA.class);
            startActivity(i);

        }


        else if(TeacherName.getText().toString().equals("Swapna") && TeacherPassword.getText().toString().equals("rani"))
        {
            Intent i = new Intent(this, TeacherProA.class);
            startActivity(i);

        }

        else if(TeacherName.getText().toString().equals("") && TeacherPassword.getText().toString().equals(""))
        {
            Intent i = new Intent(this, TeacherProA.class);
            startActivity(i);

        }


        else
        {
            Toast.makeText(this, "Wrong Username or Password!", Toast.LENGTH_LONG).show();

        }


    }










    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_teacher_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
