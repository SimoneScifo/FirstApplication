package simone.it.firstapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Simone on 08/02/2017.
 */
public class LoginActivity extends Activity {
    EditText usernameET;
    EditText passwordET;
    Button loginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //link activity to layout
        setContentView(R.layout.activity_login);
        //assign xml items
        usernameET = (EditText) findViewById(R.id.login_username_et);
        passwordET = (EditText) findViewById(R.id.login_password_et);
        loginBtn = (Button) findViewById(R.id.login_btn);
        loginBtn.setOnClickListener(loginClickListener);
    }

    
    View.OnClickListener loginClickListener = new View.OnClickListener(){
        @Override
        public void onClick (View view){
            Toast.makeText(LoginActivity.this,"Logging successfull",Toast.LENGTH_LONG).show();
        }

    };
}
