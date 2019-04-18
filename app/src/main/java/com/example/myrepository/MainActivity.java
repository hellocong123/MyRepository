package com.example.myrepository;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.myrepository.fragment.Fragment_1;
import com.example.myrepository.fragment.Fragment_2;
import com.example.myrepository.fragment.Fragment_3;
import com.example.myrepository.fragment.Fragment_4;
import com.example.myrepository.fragment.Fragment_5;
import com.example.myrepository.fragment.Fragment_6;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private static final String TAG = MainActivity.class.getCanonicalName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


        @SuppressWarnings("StatementWithEmptyBody")
        @Override
        public boolean onNavigationItemSelected(MenuItem item) {
            Log.i(TAG, "onNavigationItemSelected: "+item.getItemId());
            // 处理导航视图项单击此处
            int id = item.getItemId();

            if (id == R.id.nav_camera) {
                // Handle the camera action
                Log.i(TAG, "onNavigationItemSelected: "+id);
                switchFragment(0);
            } else if (id == R.id.nav_gallery) {
                switchFragment(1);
            } else if (id == R.id.nav_slideshow) {
                switchFragment(2);
            } else if (id == R.id.nav_manage) {
                switchFragment(3);
            } else if (id == R.id.nav_share) {
                switchFragment(4);
            } else if (id == R.id.nav_send) {
                switchFragment(5);

            }

            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            drawer.closeDrawer(GravityCompat.START);
            return true;
        }


    private Fragment_1 mFragment_1;
    private Fragment_2 mFragment_2;
    private Fragment_3 mFragment_3;
    private Fragment_4 mFragment_4;
    private Fragment_5 mFragment_5;
    private Fragment_6 mFragment_6;


    private void switchFragment(int index) {

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        hideFragmentAll(transaction);

        switch (index) {
            case 0:
                if (mFragment_1 == null) {
                    mFragment_1 = Fragment_1.newInstance();
                    transaction.add(R.id.fragment_container, mFragment_1);
                }
                transaction.show(mFragment_1);
                break;

            case 1:
                if (mFragment_2 == null) {
                    mFragment_2 = Fragment_2.newInstance();
                    transaction.add(R.id.fragment_container, mFragment_2);
                }
                transaction.show(mFragment_2);
                break;

            case 2:
                if (mFragment_3 == null) {
                    mFragment_3 = Fragment_3.newInstance();
                    transaction.add(R.id.fragment_container, mFragment_3);
                }
                transaction.show(mFragment_3);
                break;

            case 3:
                if (mFragment_4 == null) {
                    mFragment_4 = Fragment_4.newInstance();
                    transaction.add(R.id.fragment_container, mFragment_4);
                }
                transaction.show(mFragment_4);
                break;

            case 4:
                if (mFragment_5 == null) {
                    mFragment_5 = Fragment_5.newInstance();
                    transaction.add(R.id.fragment_container, mFragment_5);
                }
                transaction.show(mFragment_5);
                break;

            case 5:
                if (mFragment_6 == null) {
                    mFragment_6 = Fragment_6.newInstance();
                    transaction.add(R.id.fragment_container, mFragment_6);
                }
                transaction.show(mFragment_6);
                break;


        }
        transaction.commit();
    }

    private void hideFragmentAll(FragmentTransaction transaction) {

        if (mFragment_1 != null) transaction.hide(mFragment_1);
        if (mFragment_2 != null) transaction.hide(mFragment_2);
        if (mFragment_3 != null) transaction.hide(mFragment_3);
        if (mFragment_4 != null) transaction.hide(mFragment_4);
        if (mFragment_5 != null) transaction.hide(mFragment_5);
        if (mFragment_6 != null) transaction.hide(mFragment_6);

    }


}
