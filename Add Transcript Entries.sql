/* CREATE TABLE Transcript (
    studentID INT,
    courseID CHAR(8),
    yearOffered INT,
    term INT,
    gradeType int,
    grade CHAR(3),
    credits INT,
    PRIMARY KEY (studentID, courseID, yearOffered, term),
    FOREIGN KEY (studentID) REFERENCES Employees(id)); */

INSERT INTO TRANSCRIPT VALUES( 123456, ENC1101, 2011, 1, 'B+', 3);