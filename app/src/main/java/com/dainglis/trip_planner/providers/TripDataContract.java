
/* SOURCE FILE HEADER COMMENT ======================================================================

    FILENAME:       TripDataContract.java
    PROJECT:        PROG3150 - Assignment 03
    PROGRAMMERS:    David Inglis, Nick Iden, Steven Knapp, Michel Gomes Lima, Megan Bradshaw
    DATE:           April 10th, 2020
    DESCRIPTION:    This file contains definitions used by the TripDataContentProvider

================================================================================================= */

package com.dainglis.trip_planner.providers;

import android.net.Uri;

public class TripDataContract {
    public static final String AUTHORITY = "com.dainglis.trip_planner.provider";

    public static final String KEY_TRIP_ID = "tripId";

    public static final String DATE_FORMAT = "yyyy-MM-dd";
    public static final String TIME_FORMAT = "HH:mm";
    public static final String DATETIME_FORMAT = "yyyy-MM-dd HH:mm";

    private static final Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY);

    public static class Trip {
        public static final Uri CONTENT_URI = Uri.withAppendedPath(TripDataContract.CONTENT_URI, "trips");
        public static final Uri CONTENT_URI_BY_DATE = Uri.withAppendedPath(TripDataContract.CONTENT_URI, "trips/by");
        public static final Uri CONTENT_URI_NOW = Uri.withAppendedPath(TripDataContract.CONTENT_URI, "trips/now");
    }

    public static class Event {
        public static final Uri CONTENT_URI = Uri.withAppendedPath(TripDataContract.CONTENT_URI, "events");
        public static final Uri CONTENT_URI_TRIP_ID = Uri.withAppendedPath(TripDataContract.CONTENT_URI, "events/by");
    }

}
