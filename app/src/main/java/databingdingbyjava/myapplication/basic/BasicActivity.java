package databingdingbyjava.myapplication.basic;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import databingdingbyjava.myapplication.R;
import databingdingbyjava.myapplication.databinding.ActivityBasicBinding;


public class BasicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityBasicBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_basic);
        User user = new User("姚明", "麦迪", 19);
        binding.setUser(user);

    }
}
