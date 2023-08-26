package com.andrekreou.organisationservice.repository;

import com.andrekreou.organisationservice.entity.Organisation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganisationRepository extends JpaRepository<Organisation, Long> {
    Organisation findByOrganisationCode(String organisationCode);
}
