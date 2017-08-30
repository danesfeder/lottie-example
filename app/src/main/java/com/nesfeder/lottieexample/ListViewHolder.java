package com.nesfeder.lottieexample;

import android.animation.ValueAnimator;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

class ListViewHolder extends RecyclerView.ViewHolder {

    TextView listText;
    private LottieAnimationView animationView;

    ListViewHolder(View itemView) {
        super(itemView);

        listText = (TextView) itemView.findViewById(R.id.listText);
        animationView = (LottieAnimationView) itemView.findViewById(R.id.lottieAnimationView);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startCheckAnimation();
            }
        });
    }

    private void startCheckAnimation() {
        ValueAnimator animator = ValueAnimator.ofFloat(0f, 1f).setDuration(500);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                animationView.setProgress((Float) valueAnimator.getAnimatedValue());
            }
        });

        if (animationView.getProgress() == 0f) {
            animator.start();
        } else {
            animationView.setProgress(0f);
        }
    }
}
