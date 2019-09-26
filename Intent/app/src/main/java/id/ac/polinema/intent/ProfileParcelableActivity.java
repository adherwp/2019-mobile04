package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import id.ac.polinema.intent.model.User;

public class ProfileParcelableActivity extends AppCompatActivity {

    private TextView textUsername;
    private TextView textName;
    private TextView textAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);
        textUsername = findViewById(R.id.text_username);
        textName = findViewById(R.id.text_name);
        textAge = findViewById(R.id.text_age);
        // TODO: bind here

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            User user = extras.getParcelable(ParcelableActivity.USER_KEY);
            textUsername.setText(user.getUsername());
            textName.setText(user.getName());
            textAge.setText(String.valueOf(user.getAge()));
            // TODO: display value here
        }
    }
}
