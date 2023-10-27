package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Fragment mamaFragment=new mamaFragment();
    private Fragment jiejieFragment=new jiejieFragment();
    private Fragment laopoFragment=new laopoFragment();
    private Fragment nverFragment=new nverFragment();
    private Fragment tab=new tab();

    private FragmentManager fragmentManager;
    private LinearLayout mTmama,mTjiejie,mTlaopo,mTnver,mTtab;
    private ImageButton mTmgMaMa;
    private ImageButton mTmgJieJie;
    private ImageButton mTmgLaoPo;
    private ImageButton mTmgNvEr;
    private ImageButton mTmgTab;

    private TextView text_mama;
    private TextView text_jiejie;
    private TextView text_laopo;
    private TextView text_nver;
    private TextView text_tab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.lactivity_main);
        mTmama=(LinearLayout) findViewById(R.id.bottom_mama_bar);
        mTjiejie=(LinearLayout)findViewById(R.id.bottom_jiejie_bar);
        mTlaopo=(LinearLayout)findViewById(R.id.bottom_laopo_bar);
        mTnver=(LinearLayout)findViewById(R.id.bottom_nver_bar);
        mTtab=(LinearLayout)findViewById(R.id.bottom_tab_bar);

        mTmgMaMa=(ImageButton)findViewById(R.id.bottom_mama_image);
        mTmgJieJie=(ImageButton)findViewById(R.id.bottom_jiejie_image);
        mTmgLaoPo=(ImageButton)findViewById(R.id.bottom_laopo_image);
        mTmgNvEr=(ImageButton)findViewById(R.id.bottom_nver_image);
        mTmgTab=(ImageButton)findViewById(R.id.bottom_tab_image);

        text_mama=findViewById(R.id.bottom_mama_text);
        text_jiejie=findViewById(R.id.bottom_jiejie_text);
        text_laopo=findViewById(R.id.bottom_laopo_text);
        text_nver=findViewById(R.id.bottom_nver_text);
        text_tab=findViewById(R.id.bottom_tab_text);

        mTmama.setOnClickListener(this);
        mTjiejie.setOnClickListener(this);
        mTlaopo.setOnClickListener(this);
        mTnver.setOnClickListener(this);
        mTtab.setOnClickListener(this);

        initFragment();
        showfagment(4);
    }

    private void initFragment() {
        fragmentManager=getSupportFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.add(R.id.id_content,mamaFragment);
        transaction.add(R.id.id_content,jiejieFragment);
        transaction.add(R.id.id_content,laopoFragment);
        transaction.add(R.id.id_content,nverFragment);
        transaction.add(R.id.id_content,tab);
        transaction.commit();
    }

    private void showfagment(int i){
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        hideFragment(transaction);

        switch (i){
            case 0:
                Log.d("showfagment","1");
                transaction.show(mamaFragment);
                mTmgMaMa.setImageResource(R.drawable.mama);
                text_jiejie.setTextColor(Color.parseColor("#FFFFFF"));
                text_laopo.setTextColor(Color.parseColor("#FFFFFF"));
                text_nver.setTextColor(Color.parseColor("#FFFFFF"));
                text_tab.setTextColor(Color.parseColor("#FFFFFF"));
                break;
            case 1:
//                Log.d("")
                transaction.show(jiejieFragment);
                mTmgJieJie.setImageResource(R.drawable.jiejie);
                text_mama.setTextColor(Color.parseColor("#FFFFFF"));
                text_laopo.setTextColor(Color.parseColor("#FFFFFF"));
                text_nver.setTextColor(Color.parseColor("#FFFFFF"));
                text_tab.setTextColor(Color.parseColor("#FFFFFF"));
                break;
            case 2:
//                Log.d("")
                transaction.show(laopoFragment);
                mTmgLaoPo.setImageResource(R.drawable.laopo);
                text_mama.setTextColor(Color.parseColor("#FFFFFF"));
                text_jiejie.setTextColor(Color.parseColor("#FFFFFF"));
                text_nver.setTextColor(Color.parseColor("#FFFFFF"));
                text_tab.setTextColor(Color.parseColor("#FFFFFF"));
                break;
            case 3:
//                Log.d("")
                transaction.show(nverFragment);
                mTmgNvEr.setImageResource(R.drawable.nver);
                text_mama.setTextColor(Color.parseColor("#FFFFFF"));
                text_jiejie.setTextColor(Color.parseColor("#FFFFFF"));
                text_laopo.setTextColor(Color.parseColor("#FFFFFF"));
                text_tab.setTextColor(Color.parseColor("#FFFFFF"));
                break;
            case 4:
                transaction.show(tab);
                mTmgTab.setImageResource(R.drawable.tab);
                text_mama.setTextColor(Color.parseColor("#FFFFFF"));
                text_jiejie.setTextColor(Color.parseColor("#FFFFFF"));
                text_laopo.setTextColor(Color.parseColor("#FFFFFF"));
                text_nver.setTextColor(Color.parseColor("#FFFFFF"));
            default:
                break;

        }
        transaction.commit();
    }

    private void hideFragment(FragmentTransaction transaction) {
        transaction.hide(mamaFragment);
        transaction.hide(jiejieFragment);
        transaction.hide(laopoFragment);
        transaction.hide(nverFragment);
        transaction.hide(tab);
    }

    @Override
    public void onClick(View v) {
        Log.d("onClick","2");
        int i=v.getId();

        if (i==R.id.bottom_mama_bar){
            text_mama.setTextColor(Color.parseColor("#BB86FC"));
            showfagment(0);}

        else if (i== R.id.bottom_jiejie_bar){
            text_jiejie.setTextColor(Color.parseColor("#BB86FC"));
            showfagment(1);}

        else if (i== R.id.bottom_laopo_bar){
            text_laopo.setTextColor(Color.parseColor("#BB86FC"));
            showfagment(2);}

        else if (i== R.id.bottom_nver_bar){
            text_nver.setTextColor(Color.parseColor("#BB86FC"));
            showfagment(3);}

        else if (i== R.id.bottom_tab_bar){
            text_tab.setTextColor(Color.parseColor("#BB86FC"));
            showfagment(4);}
    }
    public void jumpToYS(View view){
        Intent intent = new Intent(MainActivity.this,YS.class);
        startActivity(intent);
    }
}

