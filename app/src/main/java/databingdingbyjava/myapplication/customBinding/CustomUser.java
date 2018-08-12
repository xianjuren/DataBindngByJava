package databingdingbyjava.myapplication.customBinding;

public class CustomUser {
    private final String name;
    private final  String address;

    public CustomUser(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
