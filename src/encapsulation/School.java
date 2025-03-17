package encapsulation;

public class School {
    private String name;
    private int classes;
    private String address;

    public School (String name, int classes, String address){
        this.name = name;
        this.classes = classes;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getClasses() {
        return classes;
    }
    public void setClasses(String lastName){
        this.classes = classes;
    }
    public  String getAddress() {
        return address;
    }
    public  void setAddress(String address) {
        this.address = address;
    }

}
