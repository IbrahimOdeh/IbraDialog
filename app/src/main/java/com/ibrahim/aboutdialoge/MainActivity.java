package com.ibrahim.aboutdialoge;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.ibrahimodeh.ibradialog.IbraDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button showDialogBtn = findViewById(R.id.button);

        showDialogBtn.setOnClickListener(v ->
        {
            final IbraDialog ibraDialog = new IbraDialog(this);
            ibraDialog.setTitle("Ibrahim Odeh")
                    .setSubTitle("Professional Developer")
                    .setContent("I am Android and Web Developer, who provides the best services for your or your business.")
                    .setIcon(com.ibrahimodeh.ibradialog.R.drawable.ibrahim_logo)
                    .setFollow("Follow Me")
                    .setFacebookURL("https://fb.me/IbrahimOdehWebsite")
                    .setTwitterURL("https://twitter.com/IbrahimOdeh95")
                    .setInstagramURL("https://www.instagram.com/ibrahim0deh")
                    .setPinterestURL("https://www.pinterest.com/ibrahimodeh1995")
                    .setWebsiteURL("https://www.ibrahimodeh.com")
                    .isCancelable(true)
                    .show();
        });


    }


}