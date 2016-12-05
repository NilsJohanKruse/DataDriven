package de.axa.ses;

import java.util.Date;
import java.util.List;

/**
 * Created by User on 05.12.2016.
 */
public class Request {

    private String country;
    private Date departureDate;
    private Date returnDate;
    private List<Integer> travellerAges;
    private List<String> options;
    private String cover;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public List<Integer> getTravellerAges() {
        return travellerAges;
    }

    public void setTravellerAges(List<Integer> travellerAges) {
        this.travellerAges = travellerAges;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }



}
