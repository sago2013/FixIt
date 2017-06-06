package com.fixit.fixit;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

/**
 * Created by saintagrro on 5/31/17.
 */

public class MoreHelp implements View.OnClickListener {

    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(),"Help Screen To Be implemented", Toast.LENGTH_SHORT).show();
    }

}
