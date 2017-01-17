package edu.duke.pixviewer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by ola on 1/11/17.
 */

public class ImageAdapter extends BaseAdapter {

    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public Integer[] mThumbs = {R.drawable.lp0_thumb, R.drawable.lp1_thumb,
                                R.drawable.lp2_thumb,  R.drawable.lp3_thumb,
                                R.drawable.lp4_thumb};

    @Override
    public int getCount(){
        return mThumbs.length;
    }

    @Override
    public Object getItem(int position){
        return mThumbs[position];
    }

    @Override
    public long getItemId(int position){
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView (mContext);
            imageView.setScaleType (ImageView.ScaleType.FIT_CENTER);
            imageView.setLayoutParams (new GridView.LayoutParams(220, 220));
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource (mThumbs[position]);
        return imageView;

    }
}
