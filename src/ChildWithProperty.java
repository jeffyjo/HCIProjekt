import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.util.Calendar;

/**
 * Created by jeffjorgensen on 16/03/2016.
 */
public class ChildWithProperty {
    private SimpleStringProperty name;
    private SimpleStringProperty adress;
    private SimpleStringProperty byOgPostnummer;
    private SimpleIntegerProperty Cpr;
    private SimpleStringProperty homePhone;
    private SimpleStringProperty cellPhone;
    private SimpleStringProperty contactPhone;
    private SimpleStringProperty eMail;
    //private int numParents;
    //private Parent[] parents = new Parent[10];
    private SimpleStringProperty note;

    public ChildWithProperty(){
        this.name = new SimpleStringProperty("");
        this.adress = new SimpleStringProperty("");
        this.byOgPostnummer = new SimpleStringProperty("");
        Cpr = new SimpleIntegerProperty(0);
        this.homePhone = new SimpleStringProperty("");
        this.cellPhone = new SimpleStringProperty("");
        this.contactPhone = new SimpleStringProperty("");
        this.eMail = new SimpleStringProperty("");
        this.note = new SimpleStringProperty("");
    }

    public ChildWithProperty(SimpleStringProperty name) {
        this.name = name;
    }

    public ChildWithProperty(String name, int Cpr) {
        this.Cpr = new SimpleIntegerProperty(Cpr);
        this.name = new SimpleStringProperty(name);
    }

    public ChildWithProperty(String name, String adress,
                 String byOgPostnummer, Integer cpr,
                 String homePhone, String cellPhone,
                 String contactPhone, String eMail,
                 String note, Calendar calendar) {

        this.name = new SimpleStringProperty(name);
        this.adress = new SimpleStringProperty(adress);
        this.byOgPostnummer = new SimpleStringProperty(byOgPostnummer);
        Cpr = new SimpleIntegerProperty(cpr);
        this.homePhone = new SimpleStringProperty(homePhone);
        this.cellPhone = new SimpleStringProperty(cellPhone);
        this.contactPhone = new SimpleStringProperty(contactPhone);
        this.eMail = new SimpleStringProperty(eMail);
        this.note = new SimpleStringProperty(note);
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getAdress() {
        return adress.get();
    }

    public SimpleStringProperty adressProperty() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress.set(adress);
    }

    public String getByOgPostnummer() {
        return byOgPostnummer.get();
    }

    public SimpleStringProperty byOgPostnummerProperty() {
        return byOgPostnummer;
    }

    public void setByOgPostnummer(String byOgPostnummer) {
        this.byOgPostnummer.set(byOgPostnummer);
    }

    public int getCpr() {
        return Cpr.get();
    }

    public SimpleIntegerProperty cprProperty() {
        return Cpr;
    }

    public void setCpr(int cpr) {
        this.Cpr.set(cpr);
    }

    public String getHomePhone() {
        return homePhone.get();
    }

    public SimpleStringProperty homePhoneProperty() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone.set(homePhone);
    }

    public String getCellPhone() {
        return cellPhone.get();
    }

    public SimpleStringProperty cellPhoneProperty() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone.set(cellPhone);
    }

    public String getContactPhone() {
        return contactPhone.get();
    }

    public SimpleStringProperty contactPhoneProperty() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone.set(contactPhone);
    }

    public String geteMail() {
        return eMail.get();
    }

    public SimpleStringProperty eMailProperty() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail.set(eMail);
    }

    public String getNote() {
        return note.get();
    }

    public SimpleStringProperty noteProperty() {
        return note;
    }

    public void setNote(String note) {
        this.note.set(note);
    }
}
