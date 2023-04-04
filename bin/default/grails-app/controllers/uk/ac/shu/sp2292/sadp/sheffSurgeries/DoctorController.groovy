package uk.ac.shu.sp2292.sadp.sheffSurgeries

class DoctorController
{
    def scaffold = Doctor

    def index()
    {
        if (session.receptionist)
        {
            [doctorList: Doctor.findAllBySurgery(session.receptionist.surgery)]
        }
        else
        {
            response.sendError(401)
        }
    }

    def show()
    {
        if (session.receptionist)
        {
            [doctor: Doctor.findByIdAndSurgery(params.id, session.receptionist.surgery)]
        }
        else
        {
            response.sendError(401)
        }
    }

    def create()
    {
        if (session.receptionist)
        {
            [doctor: new Doctor(), surgery: session.receptionist.surgery]
        }
        else
        {
            response.sendError(401)
        }
    }

    def edit()
    {
        response.sendError(401)
    }

    def update()
    {
        response.sendError(401)
    }

    def delete()
    {
        response.sendError(401)
    }
}