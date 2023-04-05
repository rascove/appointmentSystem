package uk.ac.shu.sp2292.sadp.sheffSurgeries

class DoctorController
{
    def scaffold = Doctor

    def index()
    {
        if (session.user instanceof Receptionist)
        {
            [doctorList: Doctor.findAllBySurgery(session.user.surgery)]
        }
        else
        {
            response.sendError(404)
        }
    }

    def show()
    {
        if (session.user instanceof Receptionist)
        {
            [doctor: Doctor.findByIdAndSurgery(params.id, session.user.surgery)]
        }
        else
        {
            response.sendError(404)
        }
    }

    def create()
    {
        if (session.user instanceof Receptionist)
        {
            [doctor: new Doctor(), surgery: session.user.surgery]
        }
        else
        {
            response.sendError(404)
        }
    }

    def edit()
    {
        response.sendError(404)
    }

    def update()
    {
        response.sendError(404)
    }

    def delete()
    {
        response.sendError(404)
    }
}