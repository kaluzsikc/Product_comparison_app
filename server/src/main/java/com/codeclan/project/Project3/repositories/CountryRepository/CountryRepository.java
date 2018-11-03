package com.codeclan.project.Project3.repositories.CountryRepository;

import com.codeclan.project.Project3.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long>, CountryRepositoryCustom{
}
