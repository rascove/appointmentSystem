package uk.ac.shu.sp2292.sadp.sheffSurgeries

abstract class Staff extends Person
{
    String email

    static constraints =
    {
        email()
    }
}