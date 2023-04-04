package uk.ac.shu.sp2292.sadp.sheffSurgeries

class Appointment
{
    Date appDateTime
    int duration
    String roomNumber

    static constraints =
    {
        appDateTime()
        duration()
        roomNumber()
        doctor(nullable: true)
    }

    static belongsTo = [Surgery, Doctor]

    static hasOne =
    [
        surgery: Surgery,
        patient: Patient,
        doctor: Doctor
    ]

    static hasMany = [nurses: Nurse]
}