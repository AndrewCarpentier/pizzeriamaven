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
        }else if(!telPortable.startsWith("06") && !telPortable.startsWith("07")){
            LOGGER.error("[TEST] telPortable ne commence pas par 06 et 07");
            correct = false;
        }else if(telPortable.length() != 10){
            LOGGER.error("[TEST] Le telPortable na pas 10 chiffres");
            correct = false;
        }
        return correct;
    }
}
