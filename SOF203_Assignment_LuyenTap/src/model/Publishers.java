package model;

public class Publishers {

    private String pub_ID;
    private String pub_Name;
    private String pub_Address;

    public Publishers(String pub_ID, String pub_Name, String pub_Address) {
        this.pub_ID = pub_ID;
        this.pub_Name = pub_Name;
        this.pub_Address = pub_Address;
    }

    public Publishers() {
    }

    public String getPub_ID() {
        return pub_ID;
    }

    public void setPub_ID(String pub_ID) {
        this.pub_ID = pub_ID;
    }

    public String getPub_Name() {
        return pub_Name;
    }

    public void setPub_Name(String pub_Name) {
        this.pub_Name = pub_Name;
    }

    public String getPub_Address() {
        return pub_Address;
    }

    public void setPub_Address(String pub_Address) {
        this.pub_Address = pub_Address;
    }

}
