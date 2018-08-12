package databingdingbyjava.myapplication.basic;


import android.databinding.BaseObservable;
import android.databinding.Bindable;

import databingdingbyjava.myapplication.BR;

public class User extends BaseObservable {

    private String firstName;
    private String lastName;
    private int age;

    public User(String firstName, String laistName, int age) {
        this(firstName, laistName);
        this.age = age;
        notifyPropertyChanged(BR.age);
    }

    public User(String firstName, String laistName) {
        this.firstName = firstName;
        this.lastName = laistName;
        notifyPropertyChanged(BR.firstName);
        notifyPropertyChanged(BR.lastName);
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    @Bindable
    public int getAge() {
        return age;
    }

    public boolean isShow() {
        return age > 18;
    }
}
