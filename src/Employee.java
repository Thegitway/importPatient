import java.sql.Date;

public class Employee{


    int employe;
    Date birth;
    String prenom;
    String nom;
    String sex;
    Date date;

    public int getEmploye() {
        return employe;
    }

    public void setEmploye(int employe) {
        this.employe = employe;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Employee(String first_name,String last_name,String gender,Date hire_date,Date birth) {

        this.birth = birth;
        this.prenom = first_name;
        this.nom = last_name;
        this.sex = gender;
        this.date = hire_date;
    }


}