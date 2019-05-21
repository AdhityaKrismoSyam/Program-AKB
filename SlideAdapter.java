package com.akb.uts.tugas_akb;
//20 Mei 2019
//10116145
//Adhitya Krismo Syam
//AKB-4 / IF 4 2016
import android.content.Context;
import android.graphics.Color;
//import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SlideAdapter extends PagerAdapter {
    Context context;
    LayoutInflater inflater;

    //list gambar

    public int[] lst_image = {
            R.drawable.gambar1,
            R.drawable.gambar2,
            R.drawable.gambar3,
            R.drawable.gambar4

    };

    //list of title
    public String[] lst_title = {
            "BELAJAR",
            "UJIAN TENGAH SEMESTER",
            "DOSEN PENGAJAR",
            "TENTANG APLIKASI"
    };

    //list of desc
    public String [] lst_description ={
            "Desc 1",
            "Desc 2",
            "Desc 3",
            "Desc 4"
    };

    //list of background Colour

    public int[] lst_backgroundcolor ={
            Color.rgb(55,55,55),
            Color.rgb(239,85,85),
            Color.rgb(110,49,89),
            Color.rgb(1,188,212)
    };

    public SlideAdapter(Context context){
        this.context=context;
    }

    @Override
    public int getCount() {
        return lst_title.length;
    }

    @Override
    public boolean isViewFromObject(View view,Object object) {
        return (view==(LinearLayout)object);
    }

    @Override
    public Object instantiateItem( ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide,container,false);
        LinearLayout layoutslide = view.findViewById(R.id.slidelinearlayout);
        ImageView imgslide = (ImageView) view.findViewById(R.id.slideimg);
        TextView txttitle = (TextView) view.findViewById(R.id.txttitle);
        TextView description = (TextView) view.findViewById(R.id.txtdescription);
        layoutslide.setBackgroundColor(lst_backgroundcolor[position]);
        imgslide.setImageResource(lst_image[position]);
        txttitle.setText(lst_title[position]);
        description.setText(lst_description[position]);
        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem( ViewGroup container, int position, Object object) {
     container.removeView((LinearLayout)object);
    }
}
