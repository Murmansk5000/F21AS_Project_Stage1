# F21AS-Project

This repository contains the source code for an airport check-in system. The system handles passenger bookings, flight
management, and baggage processing.

## Project Structure

The project is structured as follows:

- `file`: Directory for miscellaneous and support files.
    - `log`: Contains log files that record application activities.
        - `check_in_yyyyMMddHHmmss.log`: Log file named with a timestamp, generated by Simulation.
    - `FlightList.txt`: Sample data file listing flight details, generated by GenerateData.
    - `PassengerList.txt`: Sample data file listing passenger details, generated by GenerateData.
    - `report.txt`: A generated report generate by CheckInSystem.
- `src`: This directory contains all the source code for the application.
    - `Stage1`: Contains the foundational modules and systems of the application.
        - `modules`: Core modules for the application's functionality.
            - `AllExceptions`: Custom exceptions specific to the application.
            - `Baggage`: Classes representing baggage.
            - `BaggageFactory`: Factory patterns for baggage object creation.
            - `BaggageList`: Data structure for managing a list of baggage items.
            - `Flight`: Flight-related information, representing flight.
            - `FlightList`: Management class for a list of fight items.
            - `Passenger`: Representation of passenger data.
            - `PassengerList`: Management class for a list of passengers.
        - `CheckInSystem`: Logic and controllers for the check-in process, the main class for stage 1.
        - `GenerateData`: Generate data for the program, the main class for stage 0.
        - `GUI`: Graphical User Interface for Stage 1 of the application.
        - `Report`: Reporting module for generating a report.
    - `Stage2`: Advanced stage with simulation and GUI components.
        - `GUI`: GUI components for Stage 2.
            - `CheckInCounterGUI`: GUI components specific to the check-in counters.
                - `FlightStatusGUI`: GUI components to display flight status information.
                - `PassengerQueueGUI`: GUI components for visualizing the passenger queue.
            - `CheckInCounter`: Classes and logic for one check-in counter.
            - `CheckInCounterManager`: Central management for all check-in counters.
            - `Log`: System for log.
            - `LogQueue`: Queue implementation for storing log.
            - `Observer`: Observer for reactive designs.
            - `PassengerQueue`: Management of the queue of passengers.
            - `Simulation`: Class for real-time simulation, the mian class for stage 2.
            - `Subject`: Components for observer pattern implementation.
- `test`: Contains test cases and test data.
- `.gitignore`: Git configuration file to ignore certain files and directories.
- `README.md`: The file you are reading right now that provides information about the project.

### Release Notes

#### Version 2.0

- Fixed log write conflicts and modified the queue implementation.
- Fine-tuned the counter's `run()` method.
- Changed counter closure logic: all counters are closed after all flights have taken off.
- Removed dependencies on certain threading packages.

#### Version 1.9

- Introduced changes in aircraft take-off logic, improved counter deletion logic.
- Enhanced the cleanup process for space occupied by stopped threads.
- Added some tests for the counter manager.
- Made the thread a daemon thread.

#### Version 1.8

- Made various optimizations and fixes to the GUI implementations.
- Adjusted counter spaces ratio, and fixed synchronization issues related to baggage handling for flights.

#### Version 1.7

- Focused on optimizing the GUI, fixing bugs related to baggage list updates.
- Correcting the load algorithm to use baggage volume calculations.
- Introduced optimizations to thread logic and added significant comments for clarity.

#### Version 1.6

- Optimized the logic of aircraft take-off calculations and made changes to GUI implementations to support these
  optimizations.

#### Version 1.4

- Major improvements to the GUI's aesthetic and functionality, including the integration of passenger queue, counter,
  and flight information into a unified display.

#### Version 1.3

- Enhanced the application's logic with updates to GUI designs, observer modes, and method optimizations.
- Removed dependencies on certain threading packages and modified counter operations.

#### Version 1.2

- Added a GUI package with new classes for displaying passenger, check-in counter, and flight information interfaces.

#### Version 1.1

- Introduced foundational features such as randomly generated baggage sizes, passenger queue management, check-in
  counter classes, and simulation setup.

#### Version 1.0

- Add the required test.

#### Version 0.9

- Functionality fully realised.

#### Version 0.8 (Bug Fixes)

- Completing almost all functions and debugging bugs.
- img debugging with data.
- Change some method when used.
- Adding method to check and renew.
-

#### Version 0.6 (test for Report)

- Implementing tests for the Report class.

#### Version 0.5 (Report)

- Report class is almost complete.
- Generate reports based on FlightList.
- Change img details.

#### Version 0.4 (img)

- img framework construction.
- A simple img.

#### Version 0.3 (Exception)

- New exception class and the ability to throw exceptions when calling a method.

#### Version 0.2 (Feature Enhancements)

- Write the methods that the base class might want to use.

#### Version 0.1 (Initial Release)

- Initialisation code, new classes to be used.
- Flight class, FlightList class, Passenger class etc.

## Acknowledgments

- Thanks to all contributors who have helped with the project.
