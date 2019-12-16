package ru.axxle.insurance.web.service;

import ru.axxle.insurance.web.WebInsuranceCalc;
import ru.axxle.insurance.web.WebInsuranceClient;
import ru.axxle.insurance.web.WebInsuranceContract;
import ru.axxle.insurance.web.WebRealtyLocation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebInsuranceContractServiceImpl implements WebInsuranceContractService {
    
    @Override
    public WebInsuranceContract getPrefilled() {
        WebInsuranceContract webInsuranceContract = new WebInsuranceContract();
        webInsuranceContract.setStatus("NEW");
        return webInsuranceContract;
    }

    @Override
    public WebInsuranceContract getById(String id) {
        WebInsuranceContract webInsuranceContract = map.get(id);
        return webInsuranceContract;
    }


    ////////////////////////////////////////////
    private Map<String, WebInsuranceContract> map = new HashMap<>();
    private WebInsuranceContract contract1 =  new WebInsuranceContract();
    private WebInsuranceContract contract2 =  new WebInsuranceContract();
    {
        contract1.setCalcInfo(
                new WebInsuranceCalc(
                        "1200000",
                        "квартира",
                        "1955",
                        "43.5",
                        "2019-12-16",
                        "2020-12-15",
                        "2019-12-16",
                        "5351.22"

                )
        );
        contract1.setContractId("112112");
        contract1.setContractDate("2019-12-16");
        contract1.setStatus("CREATED");
        contract1.setHolderInfo(new WebInsuranceClient(
                "Иванов Иван Иваныч",
                "1988-07-28",
                "8009",
                "524504"
        ));
        contract1.setRealtyLocation(new WebRealtyLocation(
                "Россия",
                "480010",
                "Республика Башкортостан",
                "Уфимский район",
                "Уфа",
                "Ленина",
                "156",
                "",
                "1",
                "208",
                "Текст комментария"
        ));


        contract2.setCalcInfo(
                new WebInsuranceCalc(
                        "130000",
                        "дом",
                        "1995",
                        "112.5",
                        "2019-12-16",
                        "2020-12-15",
                        "2019-12-16",
                        "20351.22"

                )
        );
        contract2.setContractId("112113");
        contract2.setContractDate("2019-12-16");
        contract2.setStatus("CREATED");
        contract2.setHolderInfo(new WebInsuranceClient(
                "Федоров Федор Федорович",
                "1975-01-15",
                "8209",
                "554501"
        ));
        contract2.setRealtyLocation(new WebRealtyLocation(
                "Россия",
                "614000",
                "Пермский Край",
                "",
                "Пермь",
                "Островского",
                "11",
                "1",
                "",
                "",
                "Текст комментария тут"
        ));

        map.put(contract1.getContractId(), contract1);
        map.put(contract2.getContractId(), contract2);
    }
    ////////////////////////////////////////////


}