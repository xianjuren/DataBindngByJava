package databingdingbyjava.myapplication.viewById;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;

import databingdingbyjava.myapplication.R;
import databingdingbyjava.myapplication.databinding.ActivityViewIdBinding;
import databingdingbyjava.myapplication.observable.ObservableUser;

/**
 * 在layout中对于每个带ID的View会生成一个public final字段。
 * Binding在View层次结构上做单一的传递，提取带ID的Views。
 * 这种机制比起某些Views使用findViewById还要快。
 */
public class ViewIdActivity extends AppCompatActivity {

    private ActivityViewIdBinding viewIdBinding;

    private ObservableUser user;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewIdBinding = DataBindingUtil.setContentView(this, R.layout.activity_view_id);
        user = new ObservableUser();
        initValue();
    }

    private void initValue() {
        viewIdBinding.tvFirstName.setText("开始");
        viewIdBinding.tvLastName.setText("结束");
        viewIdBinding.etInputLayout.etInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                user.setLastName(s.toString());
                viewIdBinding.setUser(user);
            }
        });
    }
}
