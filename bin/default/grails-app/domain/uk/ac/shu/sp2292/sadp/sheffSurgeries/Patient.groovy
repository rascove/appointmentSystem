package uk.ac.shu.sp2292.sadp.sheffSurgeries

class Patient extends Person
{
    String address, residence, patientId
    Date patientDob, dateRegistered

    static constraints =
    {
        address()
        residence()
        patientDob()
        patientId()
        dateRegistered()
    }

    static hasOne = [surgery: Surgery]

    static hasMany =
    [
        appointments: Appointment,
        prescriptions: Prescription
    ]
}
