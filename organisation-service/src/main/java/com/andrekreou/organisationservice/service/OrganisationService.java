package com.andrekreou.organisationservice.service;

import com.andrekreou.organisationservice.dto.OrganisationDto;

public interface OrganisationService {
    OrganisationDto saveOrganisation(OrganisationDto organisationDto);
    OrganisationDto getOrganisationByCode(String organisationCode);
}
