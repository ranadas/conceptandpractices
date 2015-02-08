package com.rdas.rest.model;

/**
 * Created by rdas on 24/01/2015.
 */
import java.util.Date;

import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

import com.google.common.base.Preconditions;

@SuppressWarnings("all")
public class RegistryDatasetWatermark {

    private final static String datePattern = "yyyy-MM-dd";

    private final DateTime dateTime;

    public RegistryDatasetWatermark(Date date) {
        dateTime = new DateTime(date, DateTimeZone.UTC);
    }

    public RegistryDatasetWatermark(DateMidnight dm) {
        Preconditions.checkNotNull(dm);
        Preconditions.checkArgument(dm.getChronology().getZone().equals(DateTimeZone.UTC), "watermark timezone must be UTC");
        dateTime = new DateTime(dm.toInstant(), DateTimeZone.UTC);
    }

    public static RegistryDatasetWatermark today() {
        return new RegistryDatasetWatermark(DateMidnight.now(DateTimeZone.UTC));
    }

    public String getDateString() {
        DateTimeFormatter fmt = DateTimeFormat.forPattern(datePattern);
        String dateString = fmt.print(dateTime);
        return dateString;
    }

    public String toString() {
        DateTimeFormatter fmt = ISODateTimeFormat.dateTime();
        return fmt.print(dateTime);
    }

    public DateTime toDateTime() {
        return dateTime;
    }

    public Date toDate() {
        return dateTime.toDate();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        RegistryDatasetWatermark that = (RegistryDatasetWatermark) o;

        if (dateTime != null ? !dateTime.equals(that.dateTime) : that.dateTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        return dateTime != null ? dateTime.hashCode() : 0;
    }
}