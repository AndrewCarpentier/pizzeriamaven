package fr.andrew.client.util;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class UtilsTest {
    private static Logger LOGGER = LoggerFactory.getLogger(UtilsTest.class);

    @Before
    public void avantChaqueTest(){
        LOGGER.info("[TEST] DEBUT DU TEST");
    }

    @After
    public void apresChaqueTest(){
        LOGGER.info("[TEST] FIN DU TEST");
    }

    @Test
    public void verifierEmailOK(){
        String email = "andr3wcarpentier@gmail.com";
        Boolean verifEmail = Utils.verifierEmail(email);
        Assert.assertEquals(true,verifEmail);
    }

    @Test
    public void verifierEmailKOEmailNull(){
        String email = null;
        Boolean verifEmail = Utils.verifierEmail(email);
        Assert.assertNotEquals(true, verifEmail);
    }

    @Test
    public void verifierEmailKOEmailVide(){
        String email = "";
        Boolean verifEmail = Utils.verifierEmail(email);
        Assert.assertNotEquals(true, verifEmail);
    }

    @Test
    public void verifierEmailKOEmailNotContainsArobase(){
        String email = "andr3wcarpentiergmail.com";
        Boolean verifEmail = Utils.verifierEmail(email);
        Assert.assertNotEquals(true,verifEmail);
    }

    @Test
    public void verifierEmailKOEmailNotEndWithFrCom(){
        String email = "andr3wcarpentier@gmail.zz";
        Boolean verifEmail = Utils.verifierEmail(email);
        Assert.assertNotEquals(true,verifEmail);
    }

    @Test
    public void verifierTelPortableOK(){
        String telPortable = "0636477248";
        Boolean verifTelPortable = Utils.verifierTelPortable(telPortable);
        Assert.assertEquals(true,verifTelPortable);
    }

    @Test
    public void verifierTelPortableKOTelPortableNull(){
        String telPortable = null;
        Boolean verifTelPortable = Utils.verifierTelPortable(telPortable);
        Assert.assertNotEquals(true,verifTelPortable);
    }

    @Test
    public void verifierTelPortableKOTelPortableVide(){
        String telPortable = "";
        Boolean verifTelPortable = Utils.verifierTelPortable(telPortable);
        Assert.assertNotEquals(true,verifTelPortable);
    }

    @Test
    public void verifierTelPortableKOTelPortableStartWith0607(){
        String telPortable = "0536477248";
        Boolean verifTelPortable = Utils.verifierTelPortable(telPortable);
        Assert.assertEquals(true,verifTelPortable);
    }

    @Test
    public void verifierTelPortableKOTelPortableNotEquals10Length(){
        String telPortable9 = "061565859"; //contain 9 chiffres
        String telPortable11 = "06158565955"; //contain 11 chiffres
        Boolean verifTelPortable = Utils.verifierTelPortable(telPortable9);
        Boolean verifTelPortable2 = Utils.verifierTelPortable(telPortable11);
        Assert.assertNotEquals(true,verifTelPortable);
        Assert.assertNotEquals(true,verifTelPortable2);
    }

    @Test
    public void verifierTelFixeOK(){
        String telfixe = "0336477248";
        Boolean verifTelfixe = Utils.verifierTelFixe(telfixe);
        Assert.assertEquals(true,verifTelfixe);
    }

    @Test
    public void verifierTelFixeKOTelPortableNull(){
        String telfixe = null;
        Boolean verifTelFixe = Utils.verifierTelFixe(telfixe);
        Assert.assertNotEquals(true,verifTelFixe);
    }

    @Test
    public void verifierTelFixeKOTelPortableVide(){
        String telfixe = "";
        Boolean verifTelFixe = Utils.verifierTelFixe(telfixe);
        Assert.assertNotEquals(true,verifTelFixe);
    }

    @Test
    public void verifierTelFixeKOTelPortableStartWith0102030405(){
        String telfixe = "0636477248";
        Boolean verifTelFixe = Utils.verifierTelFixe(telfixe);
        Assert.assertEquals(true,verifTelFixe);
    }

    @Test
    public void verifierTelFixeKOTelPortableNotEquals10Length(){
        String telFixe9 = "051565859"; //contain 9 chiffres
        String telFixe11 = "05158565955"; //contain 11 chiffres
        Boolean verifTelFixe = Utils.verifierTelFixe(telFixe9);
        Boolean verifTelFixe2 = Utils.verifierTelFixe(telFixe11);
        Assert.assertNotEquals(true,verifTelFixe);
        Assert.assertNotEquals(true,verifTelFixe2);
    }
}
