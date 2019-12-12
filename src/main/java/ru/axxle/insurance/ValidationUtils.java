package ru.axxle.insurance;

public class ValidationUtils {
    public static final String r1 = "^[a-zA-Z0-9]{3}";
    public static final String r1_message = "length must be 3";
    //хочу тут видеть статик мапу <имя поля> - <regex паттерн>
    // и юзать ее дважды:
    // - при создании бинов веб-моделей  //@Pattern(regexp="^[a-zA-Z0-9]{3}", message="length must be 3")
    // - отдать на фронт, чтобы в браузере тоже была валидация (синтаксисы не сравнивал, возможно есть отличия)
}
