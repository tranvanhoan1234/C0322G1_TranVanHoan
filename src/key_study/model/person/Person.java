package key_study.model.person;

public abstract class Person {
    private String fullName;
    private String dateOfBirth;
    private String gender;
    private Integer citizenId;
    private Long numberPhone;
    private String gmail;

    public Person() {
    }

    public Person(String fullName, String dateOfBirth, String gender, Integer citizenId, Long numberPhone, String gmail) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.citizenId = citizenId;
        this.numberPhone = numberPhone;
        this.gmail = gmail;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(Integer citizenId) {
        this.citizenId = citizenId;
    }

    public Long getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(Long numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
public abstract String writerPerson();
    @Override
    public String toString() {
        return "fullName : '" + fullName + '\'' +
                ", dateOfBirth : '" + dateOfBirth + '\'' +
                ", gender : '" + gender + '\'' +
                ", citizenId : " + citizenId +
                ", numberPhone : " + numberPhone +
                ", gmail : '" + gmail + '\'' +
                ':';
    }
}
