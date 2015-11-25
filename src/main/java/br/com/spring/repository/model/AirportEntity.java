package br.com.spring.repository.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by rafaelfirmino on 24/11/15.
 */
@Entity(name="airport")
public class AirportEntity implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    private String city;

    private String country;

    @Column(name="iatacode")
    private String iataCode;

    @Column(name="icaocode")
    private String icaoCode;

    private double latitude;

    private double longitude;

    private double altitude;

    @Column(name="offsetutc")
    private double offsetFromUTC;

    @Column(name="dstcode")
    private String dstCode;

    private String timezone;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIataCode() {
        return iataCode;
    }

    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }

    public String getIcaoCode() {
        return icaoCode;
    }

    public void setIcaoCode(String icaoCode) {
        this.icaoCode = icaoCode;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public double getOffsetFromUTC() {
        return offsetFromUTC;
    }

    public void setOffsetFromUTC(double offsetFromUTC) {
        this.offsetFromUTC = offsetFromUTC;
    }

    public String getDstCode() {
        return dstCode;
    }

    public void setDstCode(String dstCode) {
        this.dstCode = dstCode;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AirportEntity that = (AirportEntity) o;

        if (id != that.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
