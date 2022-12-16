package com.ibrahimodeh.ibradialog;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class IbraDialog extends Dialog {

    private final Context context;
    private final TextView title;
    private final TextView subTitle;
    private final TextView content;
    private final ImageView icon;
    private final TextView follow;
    private final ImageView facebook, twitter, instagram, pinterest;
    private final Button website;


    public IbraDialog(@NonNull Context context) {
        super(context, R.style.CustomDialog);
        this.context = context;

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_app);

        title = findViewById(R.id.tv_title);
        subTitle = findViewById(R.id.tv_subTitle);
        content = findViewById(R.id.tv_content);
        icon = findViewById(R.id.img_icon);
        follow = findViewById(R.id.tv_follow);
        facebook = findViewById(R.id.iv_facebook);
        twitter = findViewById(R.id.iv_twitter);
        instagram = findViewById(R.id.iv_instagram);
        pinterest = findViewById(R.id.iv_pinterest);
        website = findViewById(R.id.btn_website);
        this.getWindow().setBackgroundDrawableResource(android.R.color.transparent);

        this.setCancelable(false);

        init();
    }


    private void init()
    {
        setTitle("Ibrahim Odeh");
        setSubTitle("Professional Developer");
        setContent("Content");
        setIcon(R.drawable.ibrahim_logo);
        setFollow("Follow");
        setFacebookURL("https://www.facebook.com/");
        setTwitterURL("https://twitter.com/");
        setInstagramURL("https://www.instagram.com/");
        setPinterestURL("https://www.pinterest.com/");
        setWebsiteURL("https://www.ibrahimodeh.com");
    }

    public IbraDialog setWebsiteURL(String url)
    {
        website.setOnClickListener(v -> {
            openUrl(context, url);
        });
        return this;
    }

    public IbraDialog setFacebookURL(String url)
    {
        facebook.setOnClickListener(v -> {
            openUrl(context, url);
        });
        return this;
    }

    public IbraDialog setTwitterURL(String url)
    {
        twitter.setOnClickListener(v -> {
            openUrl(context, url);
        });
        return this;
    }

    public IbraDialog setInstagramURL(String url)
    {
        instagram.setOnClickListener(v -> {
            openUrl(context, url);
        });
        return this;
    }

    public IbraDialog setPinterestURL(String url)
    {
        pinterest.setOnClickListener(v -> {
            openUrl(context, url);
        });
        return this;
    }

    public IbraDialog setTitle(String title) {
        this.title.setText(title);
        return this;
    }

    public IbraDialog setSubTitle(String subTitle) {
        this.subTitle.setText(subTitle);
        return this;
    }

    public IbraDialog setContent(String content) {
        this.content.setText(content);
        return this;
    }

    public IbraDialog setFollow(String follow) {
        this.follow.setText(follow);
        return this;
    }

    public IbraDialog setIcon(int icon) {
        this.icon.setImageResource(icon);
        return this;
    }

    public IbraDialog setTextColor(int color) {
        title.setTextColor(color);
        subTitle.setTextColor(color);
        content.setTextColor(color);
        return this;
    }

    public IbraDialog isCancelable(boolean cancelable) {
        this.setCancelable(cancelable);
        return this;
    }

    public IbraDialog isOnTouchOutside(boolean cancelable) {
        this.setCanceledOnTouchOutside(cancelable);
        return this;
    }

    public IbraDialog isOnDismissListener(@Nullable OnDismissListener listener) {
        this.setOnDismissListener(listener);
        return this;
    }

    public IbraDialog isOnCancelListener(@Nullable OnCancelListener listener) {
        this.setOnCancelListener(listener);
        return this;
    }

    public IbraDialog isOnShowListener(@Nullable OnShowListener listener) {
        this.setOnShowListener(listener);
        return this;
    }

    public IbraDialog isOnKeyListener(@Nullable OnKeyListener listener) {
        this.setOnKeyListener(listener);
        return this;
    }

    public boolean isShowing() {
        return super.isShowing();
    }



    public static void openUrl(Context context,String url)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        context.startActivity(browserIntent);
    }


}
