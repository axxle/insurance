package ru.axxle.insurance.web.mapper;

public interface MapperFacade {

    <S,D> D map(S sourceObject, Class<D> destinationClass);

    <S,D> void map(S sourceObject, D destinationObject);

}
