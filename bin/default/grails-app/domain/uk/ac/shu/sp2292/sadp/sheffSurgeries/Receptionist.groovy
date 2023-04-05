package uk.ac.shu.sp2292.sadp.sheffSurgeries

class Receptionist extends Staff
{
    String username, password

    static mapping =
    {
        surgery(lazy: false)
    }

    static constraints =
    {
        username()
        password()
    }

    static hasOne = [surgery: Surgery]
}