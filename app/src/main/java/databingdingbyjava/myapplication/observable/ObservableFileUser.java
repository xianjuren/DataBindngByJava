package databingdingbyjava.myapplication.observable;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * ObservableFields是自包含具有单个字段的observable对象。
 * 它有所有基本类型和一个是引用类型。要使用它需要在data对象中创建public final字段：
 */
public class ObservableFileUser {

    public final ObservableField<String> firstName = new ObservableField<>();
    public final ObservableField<String> lastName = new ObservableField<>();
    public final ObservableInt age = new ObservableInt();
}
