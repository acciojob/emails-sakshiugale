package com.driver;

import org.apache.commons.lang3.tuple.Pair;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;

public class Workspace extends Gmail{

    private ArrayList<Meeting> calendar; // Stores all the meetings

    public Workspace(String emailId) {
        // The inboxCapacity is equal to the maximum value an integer can store.

    }package com.driver;

import org.apache.commons.lang3.tuple.Pair;


import java.util.ArrayList;
import java.util.Collections;

    public class Workspace extends Gmail{

        private ArrayList<Meeting> calendar; // Stores all the meetings

        public Workspace(String emailId) {
            // The inboxCapacity is equal to the maximum value an integer can store.
            super(emailId, Integer.MAX_VALUE);
            this.calendar = new ArrayList<>();
        }

        public void addMeeting(Meeting meeting){
            //add the meeting to calendar
            calendar.add(meeting);
        }

        public int findMaxMeetings(){
            // find the maximum number of meetings you can attend
            // 1. At a particular time, you can be present in at most one meeting
            // 2. If you want to attend a meeting, you must join it at its start time and leave at end time.
            // Example: If a meeting ends at 10:00 am, you cannot attend another meeting starting at 10:00 am
            Collections.sort(calendar, (m1, m2) -> m1.getEndTime().compareTo(m2.getEndTime()));

            int maxMeetings = 1; // At least one meeting can be attended (the one with the earliest end time)

            for (int i = 0; i < calendar.size() - 1; i++) {
                Meeting currentMeeting = calendar.get(i);
                Meeting nextMeeting = calendar.get(i + 1);

                if (nextMeeting.getStartTime().isAfter(currentMeeting.getEndTime())) {
                    maxMeetings++;
                }
            }

            return maxMeetings;
        }
    }

    public void addMeeting(Meeting meeting){
        //add the meeting to calendar

    }

    public int findMaxMeetings(){
        // find the maximum number of meetings you can attend
        // 1. At a particular time, you can be present in at most one meeting
        // 2. If you want to attend a meeting, you must join it at its start time and leave at end time.
        // Example: If a meeting ends at 10:00 am, you cannot attend another meeting starting at 10:00 am

    }
}
