package key_study.model.booking;

public class Contract {
    private String someContracts;
    Booking bookingCode;
    private String advanceDepositAmount;//số tiền cọc
    private String totalPaymentAmount;// số chi phí

    public Contract() {
    }

    public Contract(String someContracts, Booking bookingCode, String advanceDepositAmount, String totalPaymentAmount) {
        this.someContracts = someContracts;
        this.bookingCode = bookingCode;
        this.advanceDepositAmount = advanceDepositAmount;
        this.totalPaymentAmount = totalPaymentAmount;
    }

    public String getSomeContracts() {
        return someContracts;
    }

    public void setSomeContracts(String someContracts) {
        this.someContracts = someContracts;
    }

    public Booking getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(Booking bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getAdvanceDepositAmount() {
        return advanceDepositAmount;
    }

    public void setAdvanceDepositAmount(String advanceDepositAmount) {
        this.advanceDepositAmount = advanceDepositAmount;
    }

    public String getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    public void setTotalPaymentAmount(String totalPaymentAmount) {
        this.totalPaymentAmount = totalPaymentAmount;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "someContracts='" + someContracts + '\'' +
                ", bookingCode='" + bookingCode + '\'' +
                ", advanceDepositAmount='" + advanceDepositAmount + '\'' +
                ", totalPaymentAmount='" + totalPaymentAmount + '\'' +
                '}';
    }
}
