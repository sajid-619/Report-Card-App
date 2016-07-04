package com.example.reportcard;


public class TestRow {

    public String testName;
    public int testMaxMarks;

    public TestRow() {
        this.testName = "";
        this.testMaxMarks = 0;
    }

    public TestRow(String testName, int testMaxMarks) {
        this.testName = testName;
        this.testMaxMarks = testMaxMarks;
    }


    public String getTestName(){
        return testName;
    }

    public int getTestMaxMarks(){
        return testMaxMarks;
    }
    
    @Override
    public String toString() {
        return "ReportCard{" +
                "Grade='" + Grade + '\'' +
                ", Comments='" + Comments + '\'' +
                ", Average=" + Average +
                ", subject='" + subject + '\'' +
                ", term='" + term + '\'' +
                ", studentName='" + studentName + '\'' +
                '}';
    }

    /**
     * Calculates a students grade based on homeworks, exams, and participation
     *
     * @return grade
     */
    public double calculateGrade() {

        double grade = 0;
        return grade;
    }

    /**
     * Calculates a students average by adding all the grades from each class and dividing by the number of classes
     *
     * @return average
     */
    public double calculateAverage() {
        double average = 0;
        return average;
    }


}

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public void setTestMaxMarks(int testMaxMarks) {
        this.testMaxMarks = testMaxMarks;
    }
}
