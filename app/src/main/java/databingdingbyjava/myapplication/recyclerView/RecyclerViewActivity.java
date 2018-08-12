package databingdingbyjava.myapplication.recyclerView;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.List;

import databingdingbyjava.myapplication.R;
import databingdingbyjava.myapplication.customBinding.CustomUser;
import databingdingbyjava.myapplication.databinding.ActivityRecyclerBinding;

public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityRecyclerBinding recyclerBinding = DataBindingUtil.setContentView(this, R.layout.activity_recycler);
        recyclerBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        UserAdapter adapter = new UserAdapter();
        recyclerBinding.recyclerView.setAdapter(adapter);
        List<CustomUser> list =new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add(new CustomUser("北京第"+(i+1)+"胡同","北京西城"));
        }
        adapter.setData(list);
    }

}
