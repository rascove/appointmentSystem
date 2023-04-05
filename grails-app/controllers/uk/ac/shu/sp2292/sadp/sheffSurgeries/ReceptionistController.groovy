package uk.ac.shu.sp2292.sadp.sheffSurgeries

class ReceptionistController
{
    def scaffold = Receptionist

    def index()
    {
        if (session.user instanceof Receptionist)
        {
            [receptionistList: Receptionist.findAllBySurgery(session.user.surgery)]
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
            [receptionist: Receptionist.findByIdAndSurgery(params.id, session.user.surgery)]
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
            [receptionist: new Receptionist(), surgery: session.user.surgery]
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