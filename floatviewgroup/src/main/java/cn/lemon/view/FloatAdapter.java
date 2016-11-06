package cn.lemon.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;



public abstract class FloatAdapter {

    private Context mContext;

    public FloatAdapter(Context context) {
        this.mContext = context;
    }

    /**
     * 获取每个子功能view
     */
    public View getItem(final int position) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.float_view_group, null);
        ((TextView) view.findViewById(R.id.hint)).setText(getItemHint(position));
        ImageView item = (ImageView) view.findViewById(R.id.function_button);
        item.setImageResource(getItemResource(position));
        item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClick(position);
            }
        });
        return view;
    }

    /**
     * 获取开关view
     */
    public ImageView getSwitchView() {
        ImageView switchView = new ImageView(mContext);
        switchView.setLayoutParams(new ViewGroup.LayoutParams(Util.dip2px(getContext(),56),Util.dip2px(getContext(),56)));
        switchView.setImageResource(getMainResource());
        return switchView;
    }

    public Context getContext(){
        return mContext;
    }

    public abstract int getCount();

    public abstract String getItemHint(int position);

    public abstract int getItemResource(int position);

    public abstract int getMainResource();

    public abstract void onItemClick(int position);

}
