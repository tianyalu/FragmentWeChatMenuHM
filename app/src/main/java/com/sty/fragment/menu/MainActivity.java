package com.sty.fragment.menu;

//import android.app.FragmentManager;
//import android.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.sty.fragment.menu.fragment.FragmentContacts;
import com.sty.fragment.menu.fragment.FragmentDiscover;
import com.sty.fragment.menu.fragment.FragmentMe;
import com.sty.fragment.menu.fragment.FragmentWeChat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private LinearLayout llContent;
    private Button btnWeChat;
    private Button btnContacts;
    private Button btnDiscover;
    private Button btnMe;

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        setListener();
    }

    private void initViews(){
        llContent = findViewById(R.id.ll_content);
        btnWeChat = (Button) findViewById(R.id.btn_wechat);
        btnContacts = (Button) findViewById(R.id.btn_contacts);
        btnDiscover = (Button) findViewById(R.id.btn_discover);
        btnMe = (Button) findViewById(R.id.btn_me);

        //fragmentManager = getFragmentManager();
        fragmentManager = getSupportFragmentManager(); //兼容API level 11[3.0]以下版本
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.ll_content, new FragmentWeChat());
        fragmentTransaction.commit();
    }

    private void setListener(){
        btnWeChat.setOnClickListener(this);
        btnContacts.setOnClickListener(this);
        btnDiscover.setOnClickListener(this);
        btnMe.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        //fragmentManager = getFragmentManager();
        fragmentManager = getSupportFragmentManager(); //兼容API level 11[3.0]以下版本
        fragmentTransaction = fragmentManager.beginTransaction();

        switch (v.getId()){
            case R.id.btn_wechat:
                fragmentTransaction.replace(R.id.ll_content, new FragmentWeChat());
                break;
            case R.id.btn_contacts:
                fragmentTransaction.replace(R.id.ll_content, new FragmentContacts());
                break;
            case R.id.btn_discover:
                fragmentTransaction.replace(R.id.ll_content, new FragmentDiscover());
                break;
            case R.id.btn_me:
                fragmentTransaction.replace(R.id.ll_content, new FragmentMe());
                break;
            default:
                break;
        }
        fragmentTransaction.commit();
    }
}
