package databingdingbyjava.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;


import databingdingbyjava.myapplication.attributeSetter.AttributeSettersActivity;
import databingdingbyjava.myapplication.basic.BasicActivity;
import databingdingbyjava.myapplication.collection.CollectionActivity;
import databingdingbyjava.myapplication.convert.ConvertActivity;
import databingdingbyjava.myapplication.customBinding.CustomActivity;
import databingdingbyjava.myapplication.include.IncludeActivity;
import databingdingbyjava.myapplication.observable.ObservableActivity;
import databingdingbyjava.myapplication.recyclerView.RecyclerViewActivity;
import databingdingbyjava.myapplication.resource.ResourceActivity;
import databingdingbyjava.myapplication.viewById.ViewIdActivity;
import databingdingbyjava.myapplication.viewStub.ViewStubActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_basic).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BasicActivity.class));
            }
        });
        findViewById(R.id.btn_include).setOnClickListener(this);

    }


    public void customBinding(View view) {
        startActivity(new Intent(this, CustomActivity.class));
    }

    public void collection(View view) {
        startActivity(new Intent(this, CollectionActivity.class));
    }

    public void resource(View view) {
        startActivity(new Intent(this, ResourceActivity.class));
    }

    public void observable(View view) {
        startActivity(new Intent(this, ObservableActivity.class));
    }

    public void viewId(View view) {
        startActivity(new Intent(this, ViewIdActivity.class));
    }

    public void viewStub(View view) {
        startActivity(new Intent(this, ViewStubActivity.class));
    }

    public void recycler(View view) {
        startActivity(new Intent(this, RecyclerViewActivity.class));
    }

    public void convert(View view){
        startActivity(new Intent(this, ConvertActivity.class));
    }


    public void attribute(View view) {
        startActivity(new Intent(this, AttributeSettersActivity.class));
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_include:
                //  Toast.makeText(this, "include与DataBingding或者是当前Gradle版本不兼容，暂时搁置", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, IncludeActivity.class));
                break;
        }
    }
}
