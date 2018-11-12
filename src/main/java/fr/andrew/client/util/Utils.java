package fr.andrew.client.util;


import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Utils {
    private static Logger LOGGER = LoggerFactory.getLogger(Utils.class);

    public static boolean verifierEmail(String email){
        boolean correct = true;

        if(email == null){
            LOGGER.error("[TEST] email est null");
            correct = false;
        }else if("".equals(email)){
            LOGGER.error("[TEST] email est vide");
            correct = false;
        }else if(!email.contains("@")){
            LOGGER.error("[TEST] email ne contient pas de @");
            correct = false;
        }else if(!email.endsWith(".fr") && !email.endsWith(".com")){
            LOGGER.error("[TEST] email ne fini ni pas .com .fr");
            correct = false;
        }
        return correct;
    }

    public static boolean verifierTelPortable(String telPortable){
        boolean correct = true;

        if(telPortable == null){
            LOGGER.error("[TEST] telPortable est null");
            correct = false;
        }else if("".equals(telPortable)){
            LOGGER.error("[TEST] telPortable est vide");
            correct = false;
        }else if(telPortable.startsWith("06") && telPortable.startsWith("07")){
            LOGGER.error("[TEST] telPortable ne commence pas par 06 et 07");
            correct = true;
        }else if(telPortable.length() != 10){
            LOGGER.error("[TEST] Le telPortable n'a pas 10 chiffres");
            correct = false;
        }
        return correct;
    }

    public static boolean verifierTelFixe(String telFixe){
        boolean correct = true;

        if(telFixe == null){
            LOGGER.error("[TEST] telFixe est null");
            correct = false;
        }else if("".equals(telFixe)){
            LOGGER.error("[TEST] telFixe est vide");
            correct = false;
        }else if(telFixe.startsWith("01") && telFixe.startsWith("02") && telFixe.startsWith("03") && !telFixe.startsWith("04") && !telFixe.startsWith("05")){
            LOGGER.error("[TEST] telFixe ne commence pas par 01, 02, 03, 04 et 05");
            correct = true;
        }else if(telFixe.length() != 10){
            LOGGER.error("[TEST] Le telFixe n'a pas 10 chiffres");
            correct = false;
        }
        return correct;
    }
}
