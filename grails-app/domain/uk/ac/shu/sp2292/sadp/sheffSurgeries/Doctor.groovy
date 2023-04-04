package uk.ac.shu.sp2292.sadp.sheffSurgeries

class Doctor
{
    String doctorName, qualifications, position, doctorEmail, password,
        doctorOffice, doctorPhone, bio

    static constraints =
    {
        doctorName()
        qualifications()
        position()
        doctorEmail()
        password()
        doctorOffice()
        doctorPhone()
        bio()
    }

    static hasOne = [surgery: Surgery]

    static hasMany =
    [
        appointments: Appointment,
        prescriptions: Prescription
    ]
}