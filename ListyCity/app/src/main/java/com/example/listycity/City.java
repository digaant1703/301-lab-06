package com.example.listycity;

/**
 * This is a class that defines a City.
 * A City consists of a city name and its corresponding province.
 */
public class City implements Comparable<City> {
    /**
     * The name of the city.
     */
    private String city;

    /**
     * The name of the province where the city is located.
     */
    private String province;

    /**
     * Constructs a new City with the specified city name and province.
     *
     * @param city
     *  the name of the city
     * @param province
     *  the name of the province
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Returns the name of the city.
     *
     * @return
     *  the city name
     */
    String getCityName(){

        return this.city;
    }

    /**
     * Returns the name of the province.
     *
     * @return
     *  the province name
     */
    String getProvinceName(){

        return this.province;
    }

    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City otherCity = (City) o;
        return city.equals(otherCity.city) && province.equals(otherCity.province);
    }

    @Override
    public int hashCode() {
        int result = city.hashCode();
        result = 31 * result + province.hashCode();
        return result;
    }
}