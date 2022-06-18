package com.imsisojib.portfolio.repositories;

import com.imsisojib.portfolio.models.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyProfileRepository extends JpaRepository<Profile, Long>{

}
