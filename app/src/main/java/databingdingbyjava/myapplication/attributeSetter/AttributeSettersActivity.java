package databingdingbyjava.myapplication.attributeSetter;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import databingdingbyjava.myapplication.R;
import databingdingbyjava.myapplication.UrlUtil;
import databingdingbyjava.myapplication.databinding.ActivityAttributeBinding;

public class AttributeSettersActivity extends AppCompatActivity {
    public View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(AttributeSettersActivity.this, "准备切换图片", Toast.LENGTH_SHORT).show();
            attributeBinding.setImageUrl(UrlUtil.nextImgUrl());
        }
    };
    private ActivityAttributeBinding attributeBinding;

    @BindingAdapter({"bind:imageUrl", "bind:error"})
    public static void loadImage(ImageView view, String url, Drawable error) {
        RequestOptions options = new RequestOptions().error(error);
        Glide.with(view.getContext()).load(url).apply(options).into(view);
    }

    @BindingAdapter(value = {"url","placeHolder"},requireAll = false)
    public static void setImageUrl(ImageView view,String url,int placeHolder){
        RequestOptions options = new RequestOptions().placeholder(placeHolder);
        Glide.with(view.getContext()).load(url).apply(options).into(view);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        attributeBinding = DataBindingUtil.setContentView(this, R.layout.activity_attribute);
        attributeBinding.setActivity(this);
        attributeBinding.setImageUrl(UrlUtil.nextImgUrl());
    }
}
