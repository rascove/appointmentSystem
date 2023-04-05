package uk.ac.shu.sp2292.sadp.sheffSurgeries

abstract class MedicalStaff extends Staff
{
    String qualifications, office

    static constraints =
    {
        qualifications()
        office()
    }
}