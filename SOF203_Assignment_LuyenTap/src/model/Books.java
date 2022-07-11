package model;

public class Books {

    private String book_ID;
    private String title;
    private String pub_ID;
    private String au_ID;
    private String notes;
    private String userName;

    public Books(String book_ID, String title, String pub_ID, String au_ID, String notes, String userName) {
        this.book_ID = book_ID;
        this.title = title;
        this.pub_ID = pub_ID;
        this.au_ID = au_ID;
        this.notes = notes;
        this.userName = userName;
    }

    public Books() {
    }

    public String getBook_ID() {
        return book_ID;
    }

    public void setBook_ID(String book_ID) {
        this.book_ID = book_ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPub_ID() {
        return pub_ID;
    }

    public void setPub_ID(String pub_ID) {
        this.pub_ID = pub_ID;
    }

    public String getAu_ID() {
        return au_ID;
    }

    public void setAu_ID(String au_ID) {
        this.au_ID = au_ID;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
