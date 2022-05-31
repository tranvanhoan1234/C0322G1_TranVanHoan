package key_study.model.booking;
//Booking=bookingId : 2, dateStart :'null', dateEnd : null', customerID : null, facility : null, typeOfService='null',1,12/04/2022,2
public class Contract {
    private String someContracts;
    private Integer bookingCode;
    private String advanceDepositAmount;//số tiền cọc
    private String totalPaymentAmount;// số chi phí

    public Contract() {
    }

    public Contract(String someContracts, Integer bookingCode, String advanceDepositAmount, String totalPaymentAmount) {
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

    public Integer getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(Integer bookingCode) {
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
    public String toStringContract() {
        return getBookingCode()+","+getSomeContracts()+","+getAdvanceDepositAmount()+","+getTotalPaymentAmount();
    }
    @Override
    public String toString() {
        return "Contract" +
                "someContracts=" + someContracts + '\'' +
                ", bookingCode=" + bookingCode + '\'' +
                ", advanceDepositAmount: " + advanceDepositAmount + '\'' +
                ", totalPaymentAmount: " + totalPaymentAmount + '\'';
    }
}
