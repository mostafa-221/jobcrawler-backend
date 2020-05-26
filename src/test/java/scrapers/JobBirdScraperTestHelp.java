package scrapers;

import nl.ordina.jobcrawler.model.Vacancy;
import nl.ordina.jobcrawler.scrapers.HTMLStructureException;
import nl.ordina.jobcrawler.scrapers.JobBirdScraper;
import org.jsoup.nodes.Document;

public class JobBirdScraperTestHelp extends JobBirdScraper {
    public JobBirdScraperTestHelp() {

    }

    public int getTotalNumberOfPagesHelp(Document doc) {
        return getTotalNumberOfPages(doc);
    }

    public void setVacancyTitleHelp(Document doc, Vacancy vacancy) throws HTMLStructureException {
         setVacancyTitle(doc, vacancy);
    }
}
