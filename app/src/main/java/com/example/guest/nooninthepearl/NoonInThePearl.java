package com.example.guest.nooninthepearl;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

public class NoonInThePearl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noon_in_the_pearl);

        //Build the intent
        Uri location = Uri.parse("geo:0,0?q=1600+Amphitheatre+Parkway,+Mountain+View,+California");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);

        //Verify it resolves
        PackageManager packageManager = getPackageManager();
        List<ResolveInfo> activities = packageManager.queryIntentActivities(mapIntent, 0);
        boolean isIntentSafe = activities.size() > 0;

        //Start an activity if it's safe
        if (isIntentSafe) {
            startActivity(mapIntent);

        }
    }
//    Uri number = Uri.parse("tel:1234567");
//    Intent callIntent = new Intent(Intent.ACTION_DIAL, number);

//
//    //Map point based on address
//    Uri location = Uri.parse("geo:0,0?q=1600+Amphitheatre+Parkway,+Mountain+View,+California");
//    //Map point based on latitude/longitude
//    Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
//
//    Uri webpage = Uri.parse("http://www.android.com");
//    Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);







}
