package databingdingbyjava.myapplication.include;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

import databingdingbyjava.myapplication.R;
import databingdingbyjava.myapplication.customBinding.CustomUser;
import databingdingbyjava.myapplication.databinding.ActivityIncludeBinding;
import databingdingbyjava.myapplication.listener.OnChoiceClick;


public class IncludeActivity extends AppCompatActivity implements OnChoiceClick {

    ActivityIncludeBinding includeBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        includeBinding = DataBindingUtil.setContentView(this, R.layout.activity_include);
        includeBinding.setListener(this);
        includeBinding.setOkText("试一试");
        includeBinding.etInputLayout.etInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                CustomUser user = new CustomUser(s.toString(), "北京");
                includeBinding.setUser(user);
            }
        });

    }

    @Override
    public void choiceClick(View view) {
        Toast.makeText(this, "测试数据触发", Toast.LENGTH_SHORT).show();
    }
}
