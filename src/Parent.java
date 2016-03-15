/**
 * Created by jeffjorgensen on 15/03/2016.
 */
public class Parent {
    private String name;
    private String workPhone;

    public Parent(){}

    public Parent(String name) {
        this.name = name;
    }

    public Parent(String name, String workPhone) {
        this.name = name;
        this.workPhone = workPhone;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }
}
