package lab.model.simple;

import lab.model.Country;

import java.io.Serializable;

public class SimpleCountry implements Serializable, Country {

    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String codeName;

    public SimpleCountry() {
    }

    public SimpleCountry(int id, String name, String codeName) {
        this.id = id;
        this.name = name;
        this.codeName = codeName;
    }

    public SimpleCountry(String name, String codeName) {
        this.name = name;
        this.codeName = codeName;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getCodeName() {
        return codeName;
    }

    @Override
    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public String toString() {
        return id + ". " + name + " (" + codeName + ")";
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SimpleCountry simpleCountry = (SimpleCountry) o;

        if (codeName != null ? !codeName.equals(simpleCountry.codeName) : simpleCountry.codeName != null) return false;
        if (name != null ? !name.equals(simpleCountry.name) : simpleCountry.name != null) return false;

        return true;
    }

    public int hashCode() {
        int result = 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (codeName != null ? codeName.hashCode() : 0);
        return result;
    }
}
