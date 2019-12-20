package ru.axxle.insurance.dao;

import ru.axxle.insurance.InsuranceContract;
import ru.axxle.insurance.web.WebInsuranceCalcFull;
import ru.axxle.insurance.web.WebInsuranceClient;
import ru.axxle.insurance.web.WebInsuranceContract;
import ru.axxle.insurance.web.WebRealtyLocation;

import java.math.BigDecimal;
import java.util.*;

public class InsuranceContractDaoImpl implements InsuranceContractDao {

    @Override
    public List<InsuranceContract> getAll() {
        List<InsuranceContract> all = new ArrayList<>();
        map.forEach((k, v) -> all.add(v));
        return all;
    }

    @Override
    public InsuranceContract getById(String entityId) {
        return map.get(entityId);
    }

    @Override
    public InsuranceContract create(InsuranceContract entity) {
        return null;
    }

    @Override
    public InsuranceContract update(InsuranceContract entity) {
        return null;
    }


    ////////////////////////////////////////////
    private Map<String, InsuranceContract> map = new HashMap<>();
    private InsuranceContract contract1 =  new InsuranceContract();
    private InsuranceContract contract2 =  new InsuranceContract();
    {
        contract1.setContractId("112112");
        contract1.setContractDate("2019-12-16");
        contract1.setInsurancePremium("4000.00");
        contract1.setInsuranceStartDate("2019-12-10");
        contract1.setInsuranceEndDate("2019-12-10");
        contract1.setFullName("Иванов Иван Иваныч");

        contract2.setContractId("112113");
        contract2.setContractDate("2019-12-16");
        contract2.setInsurancePremium("5000.00");
        contract2.setInsuranceStartDate("2019-11-10");
        contract2.setInsuranceEndDate("2019-11-10");
        contract2.setFullName("Федоров Федор Федорович");

        map.put(contract1.getContractId(), contract1);
        map.put(contract2.getContractId(), contract2);
    }
    /*{
        contract1.setCalcInfoFull(
                new WebInsuranceCalcFull(
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


        contract2.setCalcInfoFull(
                new WebInsuranceCalcFull(
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


    }*/
    //////////////////

}
