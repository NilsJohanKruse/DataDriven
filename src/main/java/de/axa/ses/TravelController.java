package de.axa.ses;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by User on 05.12.2016.
 */
@RestController
public class TravelController {

    @RequestMapping(value="/quote", method = POST)
    public ResponseEntity<Quote> getQuote(@RequestBody Request request) {
        Quote quote = new Quote();
        Long returnDate = request.getReturnDate().getTime();
        Long departureDate = request.getDepartureDate().getTime();

        DateTime dateTimeReturn = new DateTime(returnDate);
        DateTime dateTimeDeparture = new DateTime(departureDate);

        Days days = Days.daysBetween(dateTimeReturn, dateTimeDeparture);
        int days1 = days.getDays();

        int size = request.getTravellerAges().size();
        Double quoteCalc = 1.8 * days1 * size;
        quote.setQuote(quoteCalc);
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<Quote>(quote, headers, HttpStatus.OK);
    }

    @RequestMapping(value="/quote", method= GET)
    public ResponseEntity<String> getQuote() {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<String>("Test", headers, HttpStatus.OK);
    }

    @RequestMapping("/feedback")
    public Feedback getFeedback() {
        return new Feedback();
    }



}
