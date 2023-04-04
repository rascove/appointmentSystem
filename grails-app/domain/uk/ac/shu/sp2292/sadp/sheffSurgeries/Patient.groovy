package uk.ac.shu.sp2292.sadp.sheffSurgeries

class Patient
{
    String patientName, patientAddress, patientResidence, patientID, patientPhone
    Date patientDOB, dateRegistered

    static constraints =
    {
        patientName()
        patientAddress()
        patientResidence()
        patientDOB()
        patientID()
        dateRegistered()
        patientPhone()
    }

    static hasOne = [surgery: Surgery]

    static hasMany =
    [
        appointments: Appointment,
        prescriptions: Prescription
    ]
}
