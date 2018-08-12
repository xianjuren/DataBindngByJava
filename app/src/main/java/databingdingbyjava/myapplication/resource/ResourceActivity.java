package databingdingbyjava.myapplication.resource;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import databingdingbyjava.myapplication.R;
import databingdingbyjava.myapplication.databinding.ActivityResourceBinding;

public class ResourceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       ActivityResourceBinding resourceBinding = DataBindingUtil.setContentView(this, R.layout.activity_resource);
        resourceBinding.setBCount(0);
        resourceBinding.setOCount(3);
        resourceBinding.setFirstName("Nemou");
        resourceBinding.setLastName("wona");
        resourceBinding.setLarge(true);
    }
}
