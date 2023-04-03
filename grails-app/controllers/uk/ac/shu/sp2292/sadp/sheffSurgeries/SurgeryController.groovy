package uk.ac.shu.sp2292.sadp.sheffSurgeries

class SurgeryController
{
    def index()
    {
        [surgeryList: Surgery.getAll()]
    }

    def show()
    {
        [surgery: Surgery.get(params.id)]
    }
}