package Part4.City;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"id", "name", "countryCode", "district", "population"})
public class City {
    public int ID;

    public String name;
    public String countryCode;
    public String district;
    public int population;

    public City(int ID, String name, String countryCode, String district, int population) {
        this.ID = ID;
        this.name = name;
        this.countryCode = countryCode;
        this.district = district;
        this.population = population;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + ID +
                ", name='" + name + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", district='" + district + '\'' +
                ", population=" + population +
                '}';
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}