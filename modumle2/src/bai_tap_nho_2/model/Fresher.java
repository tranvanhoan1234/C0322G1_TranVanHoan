package bai_tap_nho_2.model;

public class Fresher extends Candidate{
    private String graduationDate;//Thời gian tốt nghiệp
    private String graduationRank;//Xếp loại tot ngiwep
    private String education;//Trường tốt nghiệp

    public Fresher() {
    }

    @Override
   public String readWrite() {
        return getCandidateID()+","+getFullName()+","+getBirthDay()+","+getPhone()+","+getEmail()+","+getCandidateType()+","+getCanidateCount()+","+getGraduationDate()+","+getGraduationRank()+","+getEducation();

    }

    public Fresher(Integer candidateID, String fullName, String birthDay, Integer phone, String email, String candidateType, Integer canidateCount, String graduationDate, String graduationRank, String education) {
        super(candidateID, fullName, birthDay, phone, email, candidateType, canidateCount);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Fresher{" +super.toString()+
                "graduationDate='" + graduationDate + '\'' +
                ", graduationRank='" + graduationRank + '\'' +
                ", education='" + education + '\'' +
                '}';
    }
}
