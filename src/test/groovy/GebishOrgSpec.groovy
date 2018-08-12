import geb.spock.GebSpec
import pages.GebishOrgHomePage
import pages.GoogleHomePage
import pages.TheBookOfGebPage

class GebishOrgSpec extends GebSpec {

    def "can get to the current Book of Geb"() {
        when:
        to GebishOrgHomePage

        and:
        manualsMenu.open()

        then:
        manualsMenu.links[0].text().startsWith("current")

        when:
        manualsMenu.links[0].click()

        then:
        at TheBookOfGebPage
    }


    def "Open google and search"() {
        when:
        GoogleHomePage g =   to GoogleHomePage
        then:
            g.searchTxt << "Gebish"
            g.searchBtn.click();
            waitFor {
                g.resultStats.displayed
            }

        then:
            at GoogleHomePage
    }
}