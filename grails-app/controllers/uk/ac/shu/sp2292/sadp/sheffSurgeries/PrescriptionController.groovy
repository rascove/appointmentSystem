package uk.ac.shu.sp2292.sadp.sheffSurgeries

class PrescriptionController
{
    def scaffold = Prescription

    def results(String query)
    {
        [prescriptionList: Prescription.findAllByMedicineIlikeOrDaysSupplyOrTotalCost('%' + query + '%', query?.isInteger() ? query as Integer : Integer.MAX_VALUE, query?.isDouble() ? query as Double : 0)]
    }

    def index()
    {
        if (session.user instanceof Doctor)
        {
            [prescriptionList: Prescription.findAllByDoctor(session.user)]
        }
        else
        {
            response.sendError(404)
        }
    }

    def show()
    {
        if (session.user instanceof Doctor)
        {
            [prescription: Prescription.findByIdAndDoctor(params.id, session.user)]
        }
        else
        {
            response.sendError(404)
        }
    }

    def create()
    {
        if (session.user instanceof Doctor)
        {
            def surgery = session.user.surgery
            [
                prescription: new Prescription(),
                surgery: surgery,
                doctor: session.user,
                patientList: Patient.findAllBySurgery(surgery)
            ]
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