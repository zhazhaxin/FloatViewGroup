package cn.lemon.floatviewgroup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import cn.lemon.view.FloatViewGroup;

public class MainActivity extends AppCompatActivity {

    private FloatViewGroup mFloatViewGroup;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        mFloatViewGroup = (FloatViewGroup) findViewById(R.id.float_view_group);

        mFloatViewGroup.setAdapter(new FunctionAdapter(this));
    }
}
