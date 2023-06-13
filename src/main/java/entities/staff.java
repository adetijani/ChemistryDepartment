package entities;

public class staff{
    //staff Properties
    private String name;
    private String address;
    private String email;
    private String department;
    private String employmentStatus;
    private int phoneNumber;

    public staff(String name, String address, String email, String department,
                 String employmentStatus, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.department = department;
        this.employmentStatus = employmentStatus;
        this.phoneNumber = phoneNumber;
    }

    public staff() {
    }




    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "staff{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                ", employmentStatus='" + employmentStatus + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
