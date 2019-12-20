package ru.axxle.insurance.web.mapper;

import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.MappingContext;
import ma.glasnost.orika.converter.ConverterFactory;
import ma.glasnost.orika.metadata.Type;
import ru.axxle.insurance.InsuranceCalc;
import ru.axxle.insurance.web.WebInsuranceCalc;
import ru.axxle.insurance.web.WebInsuranceCalcFull;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static ma.glasnost.orika.metadata.MappingDirection.A_TO_B;
import static ma.glasnost.orika.metadata.MappingDirection.B_TO_A;

public class InsuranceCalcRegisterImpl implements MapperRegister{
    @Override
    public void register(MapperFactory mapperFactory) {
        ConverterFactory converterFactory = mapperFactory.getConverterFactory();
        mapperFactory.classMap(WebInsuranceCalc.class, InsuranceCalc.class)
                .field("insuranceAmount", "insuranceAmount")
                .field("realtyType", "realtyType")
                .field("realtyBuildYear", "realtyBuildYear")

                //model.setRealtyArea(Double.parseDouble(webModel.getRealtyArea()));
                .fieldMap("realtyArea", "realtyArea").direction(A_TO_B)
                .converter(StringToDoubleConverter.class.getName()).add()

                .fieldMap("insuranceStartDate", "insuranceStartDate").direction(A_TO_B)
                .converter(StringToLocalDateConverter.class.getName()).add()

                .fieldMap("insuranceEndDate", "insuranceEndDate").direction(A_TO_B)
                .converter(StringToLocalDateConverter.class.getName()).add()
                .byDefault().register();

        mapperFactory.classMap(InsuranceCalc.class, WebInsuranceCalcFull.class)
                .field("insuranceAmount", "insuranceAmount")
                .field("realtyType", "realtyType")
                .field("realtyBuildYear", "realtyBuildYear")
                .fieldMap("realtyArea", "realtyArea").direction(A_TO_B)
                .converter(DoubleToStringConverter.class.getName()).add()
                .fieldMap("insuranceStartDate", "insuranceStartDate").direction(A_TO_B)
                .converter(LocalDateToStringConverter.class.getName()).add()
                .fieldMap("insuranceEndDate", "insuranceEndDate").direction(A_TO_B)
                .converter(LocalDateToStringConverter.class.getName()).add()
                .fieldMap("insuranceCalcDate", "insuranceCalcDate").direction(A_TO_B)
                .converter(LocalDateToStringConverter.class.getName()).add()
                .field("insurancePremium", "insurancePremium")
                .byDefault().register();
    }

    private static class StringToLocalDateConverter extends CustomConverter<String, LocalDate> {
        private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        @Override
        public LocalDate convert(String source, Type<? extends LocalDate> destinationType, MappingContext mappingContext) {
            return LocalDate.parse(source, formatter);
        }
    }

    private static class StringToDoubleConverter extends CustomConverter<String, Double> {
        @Override
        public Double convert(String source, Type<? extends Double> destinationType, MappingContext mappingContext) {
            return Double.parseDouble(source);
        }
    }

    private static class LocalDateToStringConverter extends CustomConverter<LocalDate, String> {
        private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        @Override
        public String convert(LocalDate source, Type<? extends String> destinationType, MappingContext mappingContext) {
            return source.format(formatter);
        }
    }
    private static class DoubleToStringConverter extends CustomConverter<Double, String> {
        @Override
        public String convert(Double source, Type<? extends String> destinationType, MappingContext mappingContext) {
            return String.format("%f.2", source);
        }
    }
}
