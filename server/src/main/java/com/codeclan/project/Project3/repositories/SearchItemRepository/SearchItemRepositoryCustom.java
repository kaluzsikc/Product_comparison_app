package com.codeclan.project.Project3.repositories.SearchItemRepository;

import com.codeclan.project.Project3.models.Country;
import com.codeclan.project.Project3.models.SearchItem;

import java.util.List;

public interface SearchItemRepositoryCustom {
    public List<Country> getAllCountriesForItem(Long searchItemId);
}
