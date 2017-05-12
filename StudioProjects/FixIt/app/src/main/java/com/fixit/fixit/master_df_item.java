package com.fixit.fixit;

import android.graphics.drawable.Drawable;
import android.media.Image;

/**
 * Created by saintagrro on 5/2/17.
 */

public class master_df_item {
    String title;
    String description;
    Drawable icon;
    String title_expanded;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Drawable getIcon() {
        return icon;
    }

    public void setIcon(Drawable icon) {
        this.icon = icon;
    }

    public String getTitle_expanded() {
        return title_expanded;
    }

    public void setTitle_expanded(String title_expanded) {
        this.title_expanded = title_expanded;
    }

    public master_df_item(String title, String description, Drawable icon, String title_expanded) {
        this.title = title;
        this.description = description;
        this.icon = icon;
        this.title_expanded = title_expanded;
    }
}
