package bai_tap_nho_2.model;

import java.util.List;

public class Experience extends Candidate{
    private String expInYear;//Số năm kinh nghiệm
    private String proSkill;//Kỹ năng chuyên môn (ProSkill)

    public Experience() {
    }

    @Override
   public String readWrite() {
        return getCandidateID()+","+getFullName()+","+getBirthDay()+","+getPhone()+","+getEmail()+","+getCandidateType()+","+getCanidateCount()+","+getExpInYear()+","+getProSkill();
    }

    public Experience(Integer candidateID, String fullName, String birthDay, Integer phone, String email, String candidateType, Integer canidateCount, String expInYear, String proSkill) {
        super(candidateID, fullName, birthDay, phone, email, candidateType, canidateCount);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public String getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(String expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return "Experience{" +super.toString()+
                "expInYear='" + expInYear + '\'' +
                ", proSkill='" + proSkill + '\'' +
                '}';
    }
}
