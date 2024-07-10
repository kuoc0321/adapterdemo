package models;

/**
 * Employee from LDAP source
 */
public class LDAPEmployee {

    private Integer cn;
    private String givenName;
    private String surname;
    private String mail;

    public LDAPEmployee(Integer cn, String givenName, String surname, String mail)
    {
        this.cn = cn;
        this.givenName = givenName;
        this.surname = surname;
        this.mail = mail;
    }

    public Integer getCn() {
        return cn;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getSurname() {
        return surname;
    }

    public String getMail() {
        return mail;
    }

    @Override
    public String toString()
    {
        return "LDAPEmployee{" +
                "cn=" + cn +
                ", givenName='" + givenName + '\'' +
                ", surname='" + surname + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}