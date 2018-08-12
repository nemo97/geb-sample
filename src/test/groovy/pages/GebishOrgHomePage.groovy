package pages

import geb.Page
import utils.ManualsMenuModule

class GebishOrgHomePage extends Page {

    static at = { title == "Geb - Very Groovy Browser Automation" }
    static url = "http://gebish.org"

    static content = {
        manualsMenu { module(ManualsMenuModule) }
    }
}