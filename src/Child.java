import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;

/**
 * Created by jeffjorgensen on 15/03/2016.
 */
public class Child {
    private String name;
    private int Cpr;
    private String adress;
    private String homePhone;
    private String cellPhone;
    private String contactPhone;
    private String eMail;
    private int numParents;
    private Parent[] parents = new Parent[numParents];
    private String note;
    private Calendar calendar;

    public Child() {}

    public Child(String name, int cpr, String adress, String homePhone,
                 String cellPhone, String contactPhone, String eMail,
                 int numParents, Parent[] parents, String note, Calendar calendar) {
        this.name = name;
        Cpr = cpr;
        this.adress = adress;
        this.homePhone = homePhone;
        this.cellPhone = cellPhone;
        this.contactPhone = contactPhone;
        this.eMail = eMail;
        this.numParents = numParents;
        this.parents = parents;
        this.note = note;
        this.calendar = calendar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCpr() {
        return Cpr;
    }

    public void setCpr(int cpr) {
        Cpr = cpr;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public int getNumParents() {
        return numParents;
    }

    public void setNumParents(int numParents) {
        this.numParents = numParents;
    }

    public Parent[] getParents() {
        return parents;
    }

    public void setParents(Parent p) {
        int counter = 0;
        for(int i = 0; i < getNumParents(); i++){
            if (parents[i].equals(null)) {
                parents[i] = p;
                counter++;
            } else {
                System.out.println("Too many parents");
            }
        }
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public String toString(){
        return ";" + name + ";" + Cpr + ";" + adress + ";" + homePhone + ";" + cellPhone + ";" + contactPhone + ";"
                + eMail + ";" + numParents + ";" + ";" + parents + ";" + note + ";" + calendar + ";";
    }
}
