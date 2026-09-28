package phonesim;

public class Sim {

    private String company;
    private long number;

    
    public String getCompany() {
        return company;
    }

    public long getNumber() {
        return number;
    }

    
    public void setCompany(String company) {
        this.company = company;
    }

    public void setNumber(long number) {
        this.number = number;
    }

   
    Sim() {}

    Sim(String company, long number) {
        this.company = company;
        this.number = number;
    }
}
