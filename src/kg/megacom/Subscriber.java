package kg.megacom;

public class Subscriber {
    private String inn;
    private String name;
    private String surname;

    public Subscriber() {
    }

    public Subscriber(String inn, String name, String surname) {
        this.inn = inn;
        this.name = name;
        this.surname = surname;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "inn='" + inn + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
