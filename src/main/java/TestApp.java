import Diadoc.Api.DiadocApi;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

public class TestApp {

    public static void main(String[] args) throws Exception {
        DiadocApi a = new DiadocApi("#######", "https://diadoc-api.kontur.ru");
        a.Authenticate("asdasdasdasd");
    }

}
