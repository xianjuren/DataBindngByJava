package databingdingbyjava.myapplication.observable;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableArrayMap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import databingdingbyjava.myapplication.R;
import databingdingbyjava.myapplication.databinding.ActivityObservableBinding;

/**
 * google为我们提供了一些Obserable类： ObservableBoolean, ObservableByte,
 * ObservableChar, ObservableShort, ObservableInt, ObservableLong,
 * ObservableFloat, ObservableDouble, and ObservableParcelable
 */
public class ObservableActivity extends AppCompatActivity {

    private ObservableFileUser user = new ObservableFileUser();
    private ObservableUser obserUser = new ObservableUser();
    private ObservableArrayMap<String, Object> mapUser = new ObservableArrayMap<>();
    private ObservableArrayList<Object> listUser = new ObservableArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityObservableBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_observable);
        binding.setUser(obserUser);
        binding.setFileUser(user);
        binding.setListUser(listUser);
        binding.setMapUser(mapUser);
        initValue(null);
    }
    //button的onClick方法
    public void initValue(View view) {
        user.firstName.set("武松");
        user.lastName.set("林冲");
        user.age.set(56);

        obserUser.setFirstName("芍药");
        obserUser.setLastName("牡丹");

        mapUser.put("firstName", "孙悟空");
        mapUser.put("lastName", "猪八戒");
        mapUser.put("age", 10000);
        listUser.clear();
        listUser.add("郭德纲");
        listUser.add("郭麒麟");
        listUser.add(43);
    }

    public void resetValue(View view) {
        user.firstName.set("张飞");
        user.lastName.set("关于");
        user.age.set(48);

        obserUser.setFirstName("菊花");
        obserUser.setLastName("郁金香");

        mapUser.put("firstName", "林黛玉");
        mapUser.put("lastName", "贾宝玉");
        mapUser.put("age", 666);
        listUser.clear();
        listUser.add("岳云鹏");
        listUser.add("孙悦");
        listUser.add(33);
    }
}
