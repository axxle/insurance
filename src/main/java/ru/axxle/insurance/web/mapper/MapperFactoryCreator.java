package ru.axxle.insurance.web.mapper;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

public final class MapperFactoryCreator {
    final MapperFactory mapperFactory = new DefaultMapperFactory.Builder().constructorResolverStrategy(null).build();
    public MapperFactory getInstance() {
        return mapperFactory;
    }
}
