package com.codeclan.project.Project3.repositories.SearchItemRepository;

import com.codeclan.project.Project3.models.Country;
import com.codeclan.project.Project3.models.SearchItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SearchItemRepository extends JpaRepository<SearchItem, Long>, SearchItemRepositoryCustom {
    public List<Country> getAllCountriesForItem(Long searchItemId);
}
