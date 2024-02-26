package models;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Report {

    // create report content
    private String generateReportString(String flightNumber, int soldTickets, int checkIns, double luggageWeight, double luggageVolume, String takeOffStatus, String reason, String departureTime) {
        String divider = "===============================";
        return new StringBuilder()
                .append(divider).append("\n")
                .append("============models.Report=============").append("\n")
                .append(divider).append("\n")
                .append("models.Flight number: ").append(flightNumber).append("\n")
                .append(divider).append("\n")
                .append("Sold Ticket: ").append(soldTickets).append("\n")
                .append(divider).append("\n")
                .append("Check in: ").append(checkIns).append("\n")
                .append(divider).append("\n")
                .append("Luggage weight: ").append(luggageWeight).append("\n")
                .append(divider).append("\n")
                .append("Luggage volume: ").append(luggageVolume).append("\n")
                .append(divider).append("\n")
                .append("Take off: ").append(takeOffStatus).append("\n")
                .append(divider).append("\n")
                .append("Reason (if can't): ").append(reason).append("\n")
                .append(divider).append("\n")
                .append("Departure time: ").append(departureTime).append(" (On time/Delay)").append("\n")
                .append("=============END===============").append("\n")
                .toString();
    }

    // print report
    public void printReport(String flightNumber, int soldTickets, int checkIns, double luggageWeight, double luggageVolume, String takeOffStatus, String reason, String departureTime) {
        //add a loop for every flight
        System.out.print(generateReportString(flightNumber, soldTickets, checkIns, luggageWeight, luggageVolume, takeOffStatus, reason, departureTime));
    }

    // write report file
    public void writeReportToFile(String flightNumber, int soldTickets, int checkIns, double luggageWeight, double luggageVolume, String takeOffStatus, String reason, String departureTime, String filePath) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            //add a loop for every flight
            writer.write(generateReportString(flightNumber, soldTickets, checkIns, luggageWeight, luggageVolume, takeOffStatus, reason, departureTime));
            writer.close();
            System.out.println("models.Report has been written to " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // test
    public static void main(String[] args) {
        // create report instance
        Report report = new Report();

        // change later
        String flightNumber = "AB1234";
        int soldTickets = 120;
        int checkIns = 110;
        double luggageWeight = 350.5;
        double luggageVolume = 75.3;
        String takeOffStatus = "Can";
        String reason = "N/A";
        String departureTime = "18:00";
        String filePath = "report.txt";

        // print report
        report.printReport(flightNumber, soldTickets, checkIns, luggageWeight, luggageVolume, takeOffStatus, reason, departureTime);

        // write report file
        report.writeReportToFile(flightNumber, soldTickets, checkIns, luggageWeight, luggageVolume, takeOffStatus, reason, departureTime, filePath);
    }
}