package at.htl.planetshop.initBean;
import at.htl.planetshop.entity.PlanetCard;
import at.htl.planetshop.facade.CardFacade;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Startup
@Singleton
public class InitBean {

    @Inject
    CardFacade cardFacade;

    @PostConstruct
    public void init() throws IOException {
        PlanetCard card = new PlanetCard(14,"Schuhe", Files.readAllBytes(Paths.get("C:\\Users\\Robin\\Desktop\\Schule\\4AHIF_JAVA\\PlanetShop\\testpicture.jpg")));
        PlanetCard card1 = new PlanetCard(17, "Kleid");
        PlanetCard card2 = new PlanetCard(34, "Dildo");
        cardFacade.saveItem(card2);
        cardFacade.saveItem(card);
        cardFacade.saveItem(card1);
    }

}
