package com.hotelmanager.service;

import java.util.List;
import java.util.Optional;

public interface IGenericService<T> {
    List<T> findAll();
    T findById(Long id);
    T save(T t);
    void delete(T t);
    void deleteById(Long id);
}