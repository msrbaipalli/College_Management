package college.management;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import college.management.StudentProfile.StudentproA;
import college.management.StudentProfile.StudentproB;
import college.management.StudentProfile.StudentproC;
import college.management.StudentProfile.StudentproD;


public class StudentLogin extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);

        getSupportActionBar().hide(); // Hide Action bar
    }


    public void loginStudent(View view) {

        EditText StudentName = (EditText) findViewById(R.id.student_username);
        EditText StudentPassword = (EditText) findViewById(R.id.student_password);


        /*PROFILE  */
        if(StudentName.getText().toString().equals("") && StudentPassword.getText().toString().equals(""))
        {
            Intent i = new Intent(this, StudentproA.class);
            startActivity(i);
        }



        /*PROFILE 1 */
        else if(StudentName.getText().toString().equals("12r01a0561") && StudentPassword.getText().toString().equals("561"))
        {
            Intent i = new Intent(this, StudentproC.class);
            startActivity(i);
        }

         /*PROFILE 2 */
        else if(StudentName.getText().toString().equals("2") && StudentPassword.getText().toString().equals("2"))
        {
            Intent i = new Intent(this, StudentproD.class);
            startActivity(i);
        }


        /*PROFILE  */
        else if(StudentName.getText().toString().equals("12r01a0593") && StudentPassword.getText().toString().equals("593"))
        {
            Intent i = new Intent(this, StudentproB.class);
            startActivity(i);
        }

        /*PROFILE  */
        else if(StudentName.getText().toString().equals("12r01a05a3") && StudentPassword.getText().toString().equals("5a3"))
        {
            Intent i = new Intent(this, StudentproA.class);
            startActivity(i);
        }

        /*PROFILE  */
        else if(StudentName.getText().toString().equals("12r01a05a7") && StudentPassword.getText().toString().equals("5a7"))
        {
            Intent i = new Intent(this, StudentproA.class);
            startActivity(i);
        }


        else
        {
            Toast.makeText(this,"Wrong Username or Password!", Toast.LENGTH_LONG).show();

        }


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_student_login, menu);
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
