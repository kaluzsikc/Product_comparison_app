package com.codeclan.project.Project3.repositories.SearchItemRepository;

import com.codeclan.project.Project3.models.Country;
import com.codeclan.project.Project3.models.SearchItem;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class SearchItemRepositoryImpl implements SearchItemRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Country> getAllCountriesForItem(Long searchItemId){
        List<Country> results = null;
        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Country.class);
            cr.createAlias("searchitems", "searchitem");
            cr.add(Restrictions.eq("searchitem.id", searchItemId));
            results = cr.list();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }
}
