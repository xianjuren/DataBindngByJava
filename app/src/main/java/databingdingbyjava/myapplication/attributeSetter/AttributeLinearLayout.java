package databingdingbyjava.myapplication.attributeSetter;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

import databingdingbyjava.myapplication.R;


public class AttributeLinearLayout extends LinearLayout {

    private String age;
    private String firstName, lastName;
    private TextView mTvFirstName, mTvLatName, mTVage;

    public AttributeLinearLayout(Context context) {
        super(context);
    }

    public AttributeLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.attribute_linear_layout);
        age = array.getString(R.styleable.attribute_linear_layout_age);
        firstName = array.getString(R.styleable.attribute_linear_layout_firstName);
        lastName = array.getString(R.styleable.attribute_linear_layout_lastName);
        array.recycle();
        inflate(getContext(), R.layout.attribute_name, this);
        mTvFirstName = findViewById(R.id.tv_first_name);
        mTvLatName = findViewById(R.id.tv_last_name);
        mTVage = findViewById(R.id.tv_age);
    }


    public void setFirstName(String name) {
        firstName = name;
        mTvFirstName.setText(firstName);
    }

    public void setLastName(String name) {
        lastName = name;
        mTvLatName.setText(lastName);
    }

    public void setAge(String year) {
        this.age = year;
        mTVage.setText(age);
    }
}
