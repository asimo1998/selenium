package pageObjects.constants.radomdata;

import library.random.RandomString;

public class RandomEmail extends RandomString {

    public String getEmail(){
        String emailName = randomAlphabetic(4) + randomAlphanumeric(3);
        String emailDomain = "@gmail.com";
        String emailUser = emailName + emailDomain;
        return emailUser;
    }
}
