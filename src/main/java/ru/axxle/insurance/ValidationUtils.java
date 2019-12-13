package ru.axxle.insurance;

public class ValidationUtils {
    //хочу тут видеть статик мапу <имя поля> - <regex паттерн>
    // и юзать ее дважды:
    // - при создании бинов веб-моделей  //@Pattern(regexp="^[a-zA-Z0-9]{3}", message="length must be 3")
    // - отдать на фронт, чтобы в браузере тоже была валидация (синтаксисы не сравнивал, возможно есть отличия)

    //<input type="text" id="insuranceContractId" pattern="[0-9]{6}">
    public static final String insuranceContractIdCheck = "[0-9]{6}";
    public static final String insuranceContractIdCheckMessage = "Номер договора должен состоять из 6 цифр, номера договоров не должны повторяться";
}
