package databingdingbyjava.myapplication.collection;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.SparseArray;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import databingdingbyjava.myapplication.R;
import databingdingbyjava.myapplication.databinding.ActivityCollcetionBinding;

public class CollectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       ActivityCollcetionBinding collcetionBinding = DataBindingUtil.setContentView(this, R.layout.activity_collcetion);

        String[] literals = new String[]{"liang", "fei"};

        List<String> list = new ArrayList<>();
        SparseArray<String> sparse = new SparseArray<>(2);

        String key = "firstName";
        int index = 0;

        for (int i = 0; i < literals.length; i++) {
            list.add(literals[i]);
            sparse.put(0, literals[i]);
        }

        Map<String, String> map = new HashMap<>();
        map.put(key, "liang");
        map.put("lastName", "fei");

        collcetionBinding.setIndex(index);
        collcetionBinding.setList(list);
        collcetionBinding.setKey(key);
        collcetionBinding.setMap(map);
        collcetionBinding.setSpare(sparse);
    }
}
