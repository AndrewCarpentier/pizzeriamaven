package fr.andrew.client.util;

import org.junit.Assert;
import org.junit.Test;


public class UtilsTest {

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
    public void verifierTelPortableKOTelPortableNotStartWith0607(){
        String telPortable = "0536477248";
        Boolean verifTelPortable = Utils.verifierTelPortable(telPortable);
        Assert.assertNotEquals(true,verifTelPortable);
    }

    @Test
    public void verifierTelPortableKOTelPortableNotEquals10Lenght(){
        String telPortable9 = "061565859"; //contain 9 chiffres
        String telPortable11 = "06158565955"; //contain 11 chiffres
        Boolean verifTelPortable = Utils.verifierTelPortable(telPortable9);
        Boolean verifTelPortable2 = Utils.verifierTelPortable(telPortable11);
        Assert.assertNotEquals(true,verifTelPortable);
        Assert.assertNotEquals(true,verifTelPortable2);
    }
}
