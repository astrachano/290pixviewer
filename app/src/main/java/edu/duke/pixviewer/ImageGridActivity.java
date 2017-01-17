package edu.duke.pixviewer;

import android.os.Bundle;
import android.widget.GridView;

/**
 * Created by ola on 1/11/17.
 */

public class ImageGridActivity extends android.app.Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagegrid);

        GridView gridView = (GridView) findViewById(R.id.grid_view);
        gridView.setAdapter(new ImageAdapter(this));

    }
}
