package ie.ul.week1lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the intent that started this activity and extract the message
        Intent i = getIntent();
        String message = i.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string to its text
        TextView textView = findViewById(R.id.message);
        textView.setText(message);
    }
}
