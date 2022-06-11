package bai_tap_nho_2.model;

public class Degree {
    private Integer certificatedID;
    private String certificateName;
    private String certificateRank;
    private Integer certificatedDate;

    public Degree() {
    }

    public Degree(Integer certificatedID, String certificateName, String certificateRank, Integer certificatedDate) {
        this.certificatedID = certificatedID;
        this.certificateName = certificateName;
        this.certificateRank = certificateRank;
        this.certificatedDate = certificatedDate;
    }

    public Integer getCertificatedID() {
        return certificatedID;
    }

    public void setCertificatedID(Integer certificatedID) {
        this.certificatedID = certificatedID;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public String getCertificateRank() {
        return certificateRank;
    }

    public void setCertificateRank(String certificateRank) {
        this.certificateRank = certificateRank;
    }

    public Integer getCertificatedDate() {
        return certificatedDate;
    }

    public void setCertificatedDate(Integer certificatedDate) {
        this.certificatedDate = certificatedDate;
    }

    @Override
    public String toString() {
        return "Degree{" +
                "certificatedID=" + certificatedID +
                ", certificateName='" + certificateName + '\'' +
                ", certificateRank='" + certificateRank + '\'' +
                ", certificatedDate=" + certificatedDate +
                '}';
    }
    public String writer(){
        return getCertificatedID()+","+getCertificateName()+","+getCertificateRank()+","+getCertificatedDate();
    }
}
