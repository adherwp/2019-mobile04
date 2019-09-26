package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import id.ac.polinema.intent.model.User;

public class ParcelableActivity extends AppCompatActivity {

    public static final String USER_KEY = "user";

    private EditText inputUsername;
    private EditText inputName;
    private EditText inputAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parcelable);
        inputUsername = findViewById(R.id.input_username);
        inputName = findViewById(R.id.input_name);
        inputAge = findViewById(R.id.input_age);
    }

    public void handleSubmit(View view) {
        String username = inputUsername.getText().toString();
        String name = inputName.getText().toString();
        int age = Integer.parseInt(inputAge.getText().toString());

        User user = new User(username, name, age);
        Intent intent = new Intent(this, ProfileParcelableActivity.class);
        intent.putExtra(USER_KEY, user);

        startActivity(intent);
    }
}
