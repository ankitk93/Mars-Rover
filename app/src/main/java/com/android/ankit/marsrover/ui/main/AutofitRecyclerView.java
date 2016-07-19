package com.android.ankit.marsrover.ui.main;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by techie93 on 4/9/2016.
 */
public class AutofitRecyclerView extends RecyclerView {

    private GridLayoutManager mLayoutManager;
    private int mColumnWidth = -1;

    public AutofitRecyclerView(Context context) {

        super(context);
    }

}
