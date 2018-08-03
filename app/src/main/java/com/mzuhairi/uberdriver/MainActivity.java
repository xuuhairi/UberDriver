package com.mzuhairi.uberdriver;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends AppCompatActivity {

  Button btnSignUp, btnRegister;

  @Override
  protected void attachBaseContext(Context newBase) {
    super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    //set before setContentView
    CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                                                       .setDefaultFontPath("fonts/Arkhip_font.ttf")
                                                       .setFontAttrId(R.attr.fontPath)
                                                       .build());
    setContentView(R.layout.activity_main);

    btnSignUp   = findViewById(R.id.btnSignIn);
    btnRegister = findViewById(R.id.btnRegister);
  }
}
