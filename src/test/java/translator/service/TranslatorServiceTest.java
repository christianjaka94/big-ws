package translator.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import translator.Application;
import translator.domain.TranslatedText;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class TranslatorServiceTest {

    @Autowired
    TranslatorService translatorService;
    @Test
    public void translateTest() throws Exception {
        TranslatedText translatedText = translatorService.translate("fr", "es", "C'est le deuxième essai du service de traduction");
        assertEquals("Esta es la segunda prueba del servicio de traducción",translatedText.getTranslation());
    }

}
