package databingdingbyjava.myapplication.attributeSetter;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.widget.ImageView;

import databingdingbyjava.myapplication.R;

public class AttributeImageView extends ImageView {

    private String imageUrl;
    private Drawable error;


    public AttributeImageView(Context context) {
        super(context);
    }

    public AttributeImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.attribute_image_view);
        imageUrl = array.getString(R.styleable.attribute_image_view_imageUrl);
        error = ContextCompat.getDrawable(context, array.getResourceId(R.styleable.attribute_image_view_error, R.drawable.error));
        array.recycle();
        setImageDrawable(error);
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setError(Drawable error) {
        this.error = error;
    }
}
