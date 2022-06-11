package bai_tap_nho_2.model;

public abstract class Candidate {
    private Integer candidateID;
    private String fullName;
    private String birthDay;
    private Integer phone;
    private String email;
    private String candidateType;
    private Integer canidateCount;

    public Candidate() {
    }

    public Candidate(Integer candidateID, String fullName, String birthDay, Integer phone, String email, String candidateType, Integer canidateCount) {
        this.candidateID = candidateID;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
        this.candidateType = candidateType;
        this.canidateCount = canidateCount;
    }

    public Integer getCandidateID() {
        return candidateID;
    }

    public void setCandidateID(Integer candidateID) {
        this.candidateID = candidateID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCandidateType() {
        return candidateType;
    }

    public void setCandidateType(String candidateType) {
        this.candidateType = candidateType;
    }

    public Integer getCanidateCount() {
        return canidateCount;
    }

    public void setCanidateCount(Integer canidateCount) {
        this.canidateCount = canidateCount;
    }
public abstract String readWrite();
    @Override
    public String toString() {
        return "Candidate{" +
                "candidateID=" + candidateID +
                ", fullName='" + fullName + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", phone=" + phone +
                ", email=" + email +
                ", candidateType='" + candidateType + '\'' +
                ", canidateCount=" + canidateCount +
                '}';
    }
}
