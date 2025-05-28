package app.model;

public class Partner {
    private int partnerId;
    private String type;
    private String companyName;
    private String legalAddress;
    private String inn;
    private String directorName;
    private int rating;

    // Конструкторы, геттеры и сеттеры
    public Partner(int partnerId, String type, String companyName, String legalAddress, String inn, String directorName, int rating) {
        this.partnerId = partnerId;
        this.type = type;
        this.companyName = companyName;
        this.legalAddress = legalAddress;
        this.inn = inn;
        this.directorName = directorName;
        this.rating = rating;
    }

    // Геттеры и сеттеры
    public int getPartnerId() { return partnerId; }
    public void setPartnerId(int partnerId) { this.partnerId = partnerId; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }
    public String getLegalAddress() { return legalAddress; }
    public void setLegalAddress(String legalAddress) { this.legalAddress = legalAddress; }
    public String getInn() { return inn; }
    public void setInn(String inn) { this.inn = inn; }
    public String getDirectorName() { return directorName; }
    public void setDirectorName(String directorName) { this.directorName = directorName; }
    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }
}
