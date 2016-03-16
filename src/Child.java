/**
 * Created by jeffjorgensen on 15/03/2016.
 */
public class Child {
    private String name;
    private String adress;
    private String byOgPostnummer;
    private int Cpr;
    private String homePhone;
    private String parent1;
    private String parent1Cell;
    private String parent1WorkPhone;
    private String parent2;
    private String parent2Cell;
    private String parent2WorkPhone;
    private String contactPerson;
    private String cellPhone;
    private String startDate;
    private String note;

    public Child(){
        this.name = "";
        this.adress = "";
        this.byOgPostnummer = "";
        this.Cpr = 0;
        this.parent1 = "";
        this.parent1Cell = "";
        this.parent1WorkPhone = "";
        this.parent2 = "";
        this.parent2Cell = "";
        this.parent2WorkPhone = "";
        this.contactPerson = "";
        this.cellPhone = "";
        this.startDate = "";
        this.note = "";
    }

    public Child(String name) {
        this.name = name;
    }

    public Child(String name, int cpr) {
        this.name = name;
        Cpr = cpr;
    }

    public Child(String name, String adress, String byOgPostnummer,
                 int cpr, String homePhone, String parent1, String parent1Cell,
                 String parent1WorkPhone, String parent2,
                 String parent2Cell, String parent2WorkPhone,
                 String contactPerson, String cellPhone,
                 String startDate, String note) {

        this.name = name;
        this.adress = adress;
        this.byOgPostnummer = byOgPostnummer;
        Cpr = cpr;
        this.homePhone = homePhone;
        this.parent1 = parent1;
        this.parent1Cell = parent1Cell;
        this.parent1WorkPhone = parent1WorkPhone;
        this.parent2 = parent2;
        this.parent2Cell = parent2Cell;
        this.parent2WorkPhone = parent2WorkPhone;
        this.contactPerson = contactPerson;
        this.cellPhone = cellPhone;
        this.startDate = startDate;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getByOgPostnummer() {
        return byOgPostnummer;
    }

    public void setByOgPostnummer(String byOgPostnummer) {
        this.byOgPostnummer = byOgPostnummer;
    }

    public int getCpr() {
        return Cpr;
    }

    public void setCpr(int cpr) {
        Cpr = cpr;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getParent1() {
        return parent1;
    }

    public void setParent1(String parent1) {
        this.parent1 = parent1;
    }

    public String getParent1Cell() {
        return parent1Cell;
    }

    public void setParent1Cell(String parent1Cell) {
        this.parent1Cell = parent1Cell;
    }

    public String getParent1WorkPhone() {
        return parent1WorkPhone;
    }

    public void setParent1WorkPhone(String parent1WorkPhone) {
        this.parent1WorkPhone = parent1WorkPhone;
    }

    public String getParent2() {
        return parent2;
    }

    public void setParent2(String parent2) {
        this.parent2 = parent2;
    }

    public String getParent2Cell() {
        return parent2Cell;
    }

    public void setParent2Cell(String parent2Cell) {
        this.parent2Cell = parent2Cell;
    }

    public String getParent2WorkPhone() {
        return parent2WorkPhone;
    }

    public void setParent2WorkPhone(String parent2WorkPhone) {
        this.parent2WorkPhone = parent2WorkPhone;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String toString(){
        return name + adress + byOgPostnummer + Cpr + parent1 + parent1Cell + parent1WorkPhone
                + parent2 + parent2Cell + parent2WorkPhone + contactPerson + cellPhone + startDate
                + note;
    }
}
