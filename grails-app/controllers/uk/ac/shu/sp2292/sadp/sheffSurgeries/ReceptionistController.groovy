package uk.ac.shu.sp2292.sadp.sheffSurgeries

class ReceptionistController
{
    def scaffold = Receptionist

    def index()
    {
        if (session.receptionist)
        {
            [receptionistList: Receptionist.findAllBySurgery(session.receptionist.surgery)]
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
            [receptionist: Receptionist.findByIdAndSurgery(params.id, session.receptionist.surgery)]
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
            [receptionist: new Receptionist(), surgery: session.receptionist.surgery]
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