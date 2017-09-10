package fi.jamk.hanna.basicuicontrolsexercise2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // AutoCompleteTextView
        AutoCompleteTextView actv = (AutoCompleteTextView)
                findViewById(R.id.autoCompleteTextView); // add stings to control
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,
                new String[]
                        {"Pasi","Juha","Kari","Jouni","Esa","Hannu"});
        actv.setAdapter(aa);
    }

    public void loginButtonClicked(View view){
        AutoCompleteTextView autoText = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        String usernameText = autoText.getText().toString();
        EditText ed = (EditText) findViewById(R.id.editText);
        String passwordText = ed.getText().toString();
        // toast message to screen
        Toast.makeText(getApplicationContext(), usernameText + " " + passwordText,
                Toast.LENGTH_SHORT).show();
    }
}
