package ljp.qianfeng.com.daydagger.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import ljp.qianfeng.com.daydagger.R;
import ljp.qianfeng.com.daydagger.bean.SelectedBean;

/**
 * Created by Administrator on 2016/11/1 0001.
 */
public class MainListAdapter extends BaseAdapter {
    List<SelectedBean.DataBean.ItemsBean> list;
    Context context;
    LayoutInflater layoutInflater;

    public MainListAdapter(Context context) {
        this.context = context;
        layoutInflater=LayoutInflater.from(context);
    }

    public void setList(List<SelectedBean.DataBean.ItemsBean> list) {
        this.list = list;
    }

    @Override
    public int getCount() {
        return list==null?0:list.size();
    }

    @Override
    public Object getItem(int i) {
        return list==null?null:list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder viewHolder=null;
        if(view==null){
            view=layoutInflater.inflate(R.layout.mlist_item,null,false);
            viewHolder=new ViewHolder(view);
        }else {
            viewHolder= (ViewHolder) view.getTag();
        }
        SelectedBean.DataBean.ItemsBean itemsBean=list.get(i);
        if(itemsBean!=null) {
            String title=itemsBean.getTitle();
            viewHolder.textView.setText(title);
            Picasso.with(context).load(itemsBean.getCover_image_url()).into(viewHolder.imageView);

        }
        return view;
    }

    class ViewHolder{
        @BindView(R.id.list_item_image)
        ImageView imageView;
        @BindView(R.id.list_item_text)
        TextView textView;
        public ViewHolder(View view) {
            view.setTag(this);
            ButterKnife.bind(this,view);
        }
    }
}
