package uk.ac.shu.sp2292.sadp.sheffSurgeries

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller: "surgery", action: "index")
        "/about"(view: "/index")
        "500"(view: '/error')
        "404"(view: '/notFound')
        "401"(view: '/unauthorized')
    }
}
