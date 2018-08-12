package databingdingbyjava.myapplication.viewStub;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewStub;

import databingdingbyjava.myapplication.R;
import databingdingbyjava.myapplication.databinding.ActivityViewStubBinding;
import databingdingbyjava.myapplication.databinding.ViewStudOneLayoutBinding;
import databingdingbyjava.myapplication.observable.ObservableUser;


public class ViewStubActivity extends AppCompatActivity {

    private ActivityViewStubBinding viewStubBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewStubBinding = DataBindingUtil.setContentView(this, R.layout.activity_view_stub);
        viewStubBinding.viewStudOne.setOnInflateListener(new ViewStub.OnInflateListener() {
            @Override
            public void onInflate(ViewStub stub, View inflated) {
                ViewStudOneLayoutBinding layoutBinding = DataBindingUtil.bind(inflated);
                ObservableUser user = new ObservableUser();
                user.setLastName("一行白鹭");
                user.setFirstName("两只黄鹂");
                assert layoutBinding != null;
                layoutBinding.setUser(user);
            }
        });
        viewStubBinding.viewStudTwo.setOnInflateListener(new ViewStub.OnInflateListener() {
            @Override
            public void onInflate(ViewStub stub, View inflated) {
                ViewStudOneLayoutBinding layoutBinding = DataBindingUtil.bind(inflated);
                ObservableUser user = new ObservableUser();
                user.setLastName("海内存知己");
                user.setFirstName("天涯若比邻");
                assert layoutBinding != null;
                layoutBinding.setUser(user);
            }
        });
    }

    public void checkViewStub(View view) {
        if (!viewStubBinding.viewStudOne.isInflated()) {
            viewStubBinding.viewStudOne.getViewStub().inflate();
        } else {
            if (!viewStubBinding.viewStudTwo.isInflated()) {
                viewStubBinding.viewStudTwo.getViewStub().inflate();
            }
        }
    }
}
