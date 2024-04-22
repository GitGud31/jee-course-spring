package com.hitema.intro.services;

import com.hitema.intro.models.Country;
import com.hitema.intro.repositories.CountryRepository;

import java.util.List;

public class ICountryService implements CountryService {

    private CountryRepository repository;

    public ICountryService(CountryRepository repository) {
        this.repository = repository;
    }

    @Override
    public Country create(Country country) {
        return repository.save(country);
    }

    @Override
    public Country read(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Country update(Country country) {
        return repository.save(country);
    }

    @Override
    public boolean delete(Long id) {
        repository.deleteById(id);

        return read(id) == null;
    }

    @Override
    public List<Country> readAll() {
        return repository.findAll();
    }
}
