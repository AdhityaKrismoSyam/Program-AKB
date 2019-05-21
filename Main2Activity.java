package com.akb.uts.tugas_akb;
//20 Mei 2019
//10116145
//Adhitya Krismo Syam
//AKB-4 / IF 4 2016
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    private ViewPager viewPager;
    private SlideAdapter myadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        myadapter = new SlideAdapter(this);
        viewPager.setAdapter(myadapter);
    }
}
