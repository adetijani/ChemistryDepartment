package entities;

public class principal extends staff{

    private String qualification;
    private String experience;
    private String email;
    public principal() {
    }

    public String getQualification() {
        return qualification;
    }

    public String getExperience() {
        return experience;
    }

    @Override
    public String getEmail() {
        return email;
    }



    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
