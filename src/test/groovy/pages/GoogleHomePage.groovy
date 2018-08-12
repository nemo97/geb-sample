package pages

import geb.Page
import org.openqa.selenium.By
import utils.ManualsMenuModule

class GoogleHomePage extends Page {

    static at = { title.contains("Google") }
    static url = "http://gooogle.com"

    static content = {
        searchTxt { $("#lst-ib") }
        searchBtn { $(By.name("btnK")) }
        resultStats { $("#resultStats")}
    }

    void search() {
        //searchBtn.click()
        //waitFor { !linksContainer.hasClass("animating") }
    }
}