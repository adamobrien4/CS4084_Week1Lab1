package ie.ul.week1lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "ie.ul.Week1Lab1.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View v) {
        Intent i = new Intent(this, DisplayMessageActivity.class);
        EditText textField = (EditText) findViewById(R.id.messageText);
        String message = textField.getText().toString();
        i.putExtra(EXTRA_MESSAGE, message);
        startActivity(i);
    }
}
