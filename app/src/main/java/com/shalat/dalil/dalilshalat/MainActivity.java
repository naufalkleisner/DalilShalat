package com.shalat.dalil.dalilshalat;

import android.content.DialogInterface;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.shalat.dalil.dalilshalat.ApaItuActivity.KisahFragment;
import com.shalat.dalil.dalilshalat.R;


public class MainActivity extends AppCompatActivity {
    DrawerLayout mDrawerLayout;
    NavigationView mNavigationView;
    FragmentTransaction mFragmentTransaction;
    FragmentManager mFragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //seting DrawerLayout dan NavigatioinView
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mNavigationView = (NavigationView)findViewById(R.id.shitstuff);

        //menetapkan fragment pertama
        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.containerView,new ShalatFardhu()).commit();

        //setting item navigasi

        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                mDrawerLayout.closeDrawers();



                if (menuItem.getItemId() == R.id.rawatib) {
                    FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.containerView,new ShalatRawatib()).commit();

                }

                if (menuItem.getItemId() == R.id.Shalatwajib) {
                    FragmentTransaction qfragmentTransaction = mFragmentManager.beginTransaction();
                    qfragmentTransaction.replace(R.id.containerView,new ShalatFardhu()).commit();
                }
                if (menuItem.getItemId() == R.id.waktu){
                    FragmentTransaction bfragmentTransaction = mFragmentManager.beginTransaction();
                    bfragmentTransaction.replace(R.id.containerView,new WaktuShalatFragment()).commit();
                }

                if (menuItem.getItemId() == R.id.jumat){
                    FragmentTransaction bfragmentTransaction = mFragmentManager.beginTransaction();
                    bfragmentTransaction.replace(R.id.containerView,new JumatFragment()).commit();
                }
                if (menuItem.getItemId() == R.id.kisah){
                    FragmentTransaction bfragmentTransaction = mFragmentManager.beginTransaction();
                    bfragmentTransaction.replace(R.id.containerView,new KisahFragment()).commit();
                }

                return false;
            }

        });
        //setting Drawer tooggle  of the toolbar

        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(this,mDrawerLayout, toolbar,R.string.app_name,
                R.string.app_name);

        mDrawerLayout.setDrawerListener(mDrawerToggle);

        mDrawerToggle.syncState();

    }
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        MainActivity.this.finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();


    }
}
