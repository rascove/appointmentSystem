package uk.ac.shu.sp2292.sadp.sheffSurgeries

class Doctor extends MedicalStaff
{
    String position, password, bio

    static mapping =
    {
        surgery(lazy: false)
    }

    static constraints =
    {
        position()
        password()
        bio()
    }

    static hasOne = [surgery: Surgery]

    static hasMany =
    [
        appointments: Appointment,
        prescriptions: Prescription
    ]
}