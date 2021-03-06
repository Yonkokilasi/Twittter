package com.example.josephinemenge.twittter.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.josephinemenge.twittter.R;
import com.example.josephinemenge.twittter.Tweet;
import com.example.josephinemenge.twittter.ui.TweetsActivity;

import org.parceler.Parcels;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Josephine Menge on 03/07/2017.
 */

public class TweetsListAdapter extends RecyclerView.Adapter<TweetsListAdapter.TweetViewHolder>{

   private ArrayList<Tweet> mTweets = new ArrayList<>();
    private Context mContext;

    public TweetsListAdapter(Context context,ArrayList<Tweet> tweets){
        mContext = context;
        mTweets = tweets;
    }
    @Override
    public TweetsListAdapter.TweetViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tweet_list_item,parent,false);
       TweetViewHolder viewHolder = new TweetViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(TweetViewHolder holder, int position) {
        holder.bindTweet(mTweets.get(position));
    }



    @Override
    public int getItemCount() {
        return mTweets.size();
    }
    public class TweetViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    @Bind(R.id.tweetTextView)
        TextView mTweetTextView;
        @Bind(R.id.tweetUserTextView) TextView mUserTextView;
        private Context mContext;

        public TweetViewHolder(View itemView){
            super(itemView);
            ButterKnife.bind(this,itemView);
            mContext = itemView.getContext();
            itemView.setOnClickListener(this);
        }
        private void bindTweet(Tweet tweet) {
            mUserTextView.setText("@"+ tweet.getUser()+"/n says");
            mTweetTextView.setText(tweet.getTweetText());
        }

        @Override
        public void onClick(View v) {
            int itemPosition = getLayoutPosition();
            Intent intent = new Intent(mContext, TweetsActivity.class);
            Tweet clickedTweet = mTweets.get(itemPosition);
            intent.putExtra("tweet", Parcels.wrap(clickedTweet));
            mContext.startActivity(intent);

        }
    }
}
