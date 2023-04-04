package uk.ac.shu.sp2292.sadp.sheffSurgeries

class Prescription
{
    String prescriptionNumber, medicine
    int daysSupply
    double totalCost
    Date dateIssued
    boolean patientPaying

    static constraints =
    {
        prescriptionNumber(unique: true)
        medicine()
        daysSupply()
        totalCost()
        dateIssued()
        patientPaying()
    }

    static belongsTo = [Doctor, Patient]
    
    static hasOne =
    [
        doctor: Doctor,
        patient: Patient
    ]
}