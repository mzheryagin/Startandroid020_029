package ru.startandoid.intentextras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ViewActivity extends AppCompatActivity {
  TextView tvName;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_view);

    tvName = (TextView)findViewById(R.id.tvName);

    Intent intent = getIntent();

    String firstName = intent.getStringExtra("fname");
    String lastName = intent.getStringExtra("lname");

    tvName.setText("Your name is " + firstName + " " + lastName);

  }
}
