package databingdingbyjava.myapplication.observable;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import databingdingbyjava.myapplication.BR;

public class ObservableUser extends BaseObservable{
    private String lastName;
    private String firstName;

    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }
    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }
}
