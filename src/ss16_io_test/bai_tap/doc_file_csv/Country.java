package ss16_io_test.bai_tap.doc_file_csv;

public class Country {
    private final static String COMMA = ",";
    private Integer id;
    private String code;
    private String name;

    public Country() {
    }

    public Country(Integer id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toStringCountry() {
        return this.getId() + COMMA + this.getCode() + COMMA + this.getName();
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", code=" + code +
                ", name='" + name + '\'' +
                '}';
    }
}
