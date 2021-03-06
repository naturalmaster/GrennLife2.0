package com.reoger.grennlife.MainProject.model;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.reoger.grennlife.R;

/**
 * Created by 24540 on 2016/9/15.
 */
public class MyViewHolder extends RecyclerView.ViewHolder{

    public TextView mItemContent;
    public TextView mItemAuthor;
    public TextView mItemTimeAndLocation;
    public TextView mItemTitle;

    public LinearLayout mDynamicShare;
    public ImageView mDynamicLike;
    public LinearLayout mDynamicComment;

//    public GridLayout  mL;
    public LinearLayout mLinearLayout;


    public MyViewHolder(View itemView) {
        super(itemView);
        mItemAuthor = (TextView) itemView.findViewById(R.id.dynamic_item_author);
        mItemContent = (TextView) itemView.findViewById(R.id.dynamic_item_content);
        mItemTimeAndLocation = (TextView) itemView.findViewById(R.id.dynamic_item_time_location);

        mDynamicShare = (LinearLayout) itemView.findViewById(R.id.dynamic_item_share);
        mDynamicLike = (ImageView) itemView.findViewById(R.id.dynamic_item_like);
        mDynamicComment = (LinearLayout) itemView.findViewById(R.id.dynamic_item_comments);
        mItemTitle = (TextView) itemView.findViewById(R.id.dynamic_item_title);

//        mL = (GridLayout) itemView.findViewById(R.id.dynamic_gridlayout);
        mLinearLayout = (LinearLayout) itemView.findViewById(R.id.dynamic_linearLayout_main);

    }
}
