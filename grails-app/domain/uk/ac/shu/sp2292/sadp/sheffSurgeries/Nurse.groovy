package uk.ac.shu.sp2292.sadp.sheffSurgeries

class Nurse extends MedicalStaff
{
    static hasOne = [surgery: Surgery]

    static hasMany = [appointments: Appointment]

    static belongsTo = Appointment
}