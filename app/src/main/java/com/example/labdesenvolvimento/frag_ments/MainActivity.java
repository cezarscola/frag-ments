package com.example.labdesenvolvimento.frag_ments;

import android.net.Uri;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, fr1.OnFragmentInteractionListener, fr2.OnFragmentInteractionListener {

    Button btnfr1, btnfr2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fr1 fragmento1 = new fr1();

        getSupportFragmentManager().beginTransaction().add(R.id.contenedor,fragmento1);
        btnfr1 = (Button)findViewById(R.id.btnFrag1);
        btnfr2 = (Button)findViewById(R.id.btnFrag2);


        btnfr2.setOnClickListener(this);
        btnfr1.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btnFrag1:

                fr1 fragmento1 = new fr1();
                FragmentTransaction transition = getSupportFragmentManager().beginTransaction();
                transition.replace(R.id.contenedor, fragmento1);
                transition.commit();

                break;

            case R.id.btnFrag2:

                fr2 fragmento2 = new fr2();
                FragmentTransaction transition1 = getSupportFragmentManager().beginTransaction();
                transition1.replace(R.id.contenedor, fragmento2);
                transition1.commit();

                break;

        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
