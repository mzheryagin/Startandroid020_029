package ru.startandoid.intentextras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
  EditText etFirstName;
  EditText etLastName;
  Button btnSubmit;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    etFirstName = (EditText)findViewById(R.id.etFirstName);
    etLastName = (EditText)findViewById(R.id.etLastName);
    btnSubmit = (Button)findViewById(R.id.btSubmit);
    btnSubmit.setOnClickListener(this);
  }

  @Override
  public void onClick(View view) {
    Intent intent = new Intent(this, ViewActivity.class);
    intent.putExtra("fname", etFirstName.getText().toString());
    intent.putExtra("lname", etLastName.getText().toString());
    startActivity(intent);
  }
}
