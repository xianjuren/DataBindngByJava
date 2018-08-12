package databingdingbyjava.myapplication.customBinding;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.byjava.AllPathBinding;

import databingdingbyjava.myapplication.DiffPackBinding;
import databingdingbyjava.myapplication.R;
import databingdingbyjava.myapplication.UrlUtil;
import databingdingbyjava.myapplication.databinding.CustomPackBinding;


/**
 * 这个类将被放置在一个模块封装包里的databinding封装包下。那么它将被默认放置在com.byjava.databinding。
 * Binding类可通过调整data元素中的class属性来调控。
 * 重写命名会生成不同命名的Binding类如下面的xml所示
 * <data class="CustomPackBinding">,生成com.byjava.databinding.CustomPackBinding
 * <p>
 * 如果要想让该类生成在不同的包种，你需要添加前缀.，如<data class=".DiffPackBinding">,
 * 如下生成 com.byjava.DiffPackBinding，直接在模块包中生成。或者是提供完整包名，如下
 * <data class="com.byjava.AllPathBinding">，生成com.byjava.AllPathBinding
 */
public class CustomActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CustomUser user = new CustomUser("整洁", "北京");
        CustomPackBinding packBinding = DataBindingUtil.setContentView(this, R.layout.activity_custom_reset_name);
        packBinding.setUser(user);

//        DiffPackBinding diffPackBinding = DataBindingUtil.setContentView(this, R.layout.activity_custom_diff_pack);
//        diffPackBinding.setUser(user);
//
        //       AllPathBinding pathBinding = DataBindingUtil.setContentView(this, R.layout.activity_custom_all_path);
//        pathBinding.setUser(user);
    }
}
