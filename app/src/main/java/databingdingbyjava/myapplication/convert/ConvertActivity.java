package databingdingbyjava.myapplication.convert;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.databinding.BindingConversion;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableBoolean;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;

import databingdingbyjava.myapplication.R;
import databingdingbyjava.myapplication.databinding.ActivityConvertBinding;

public class ConvertActivity extends AppCompatActivity {

    private ObservableBoolean mBoolean = new ObservableBoolean();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityConvertBinding convertBinding = DataBindingUtil.setContentView(this, R.layout.activity_convert);
        mBoolean.set(true);
        convertBinding.setIsError(mBoolean);
        convertBinding.setHeight((int) dp2px(this, 300));
    }

    @BindingConversion
    public static ColorDrawable convertColorToDrawable(int color){
        return new ColorDrawable(color);
    }

    @BindingAdapter("layout_height")
    public static void setHeight(View view,int height){
        ViewGroup.LayoutParams params =view.getLayoutParams();
        params.height = height;
        view.setLayoutParams(params);
    }


    public void choiceToggle(View view) {
            mBoolean.set(!mBoolean.get());
    }


    public float dp2px(final Context context, final float dpValue) {
        return dpValue * context.getResources().getDisplayMetrics().density;
    }
}
