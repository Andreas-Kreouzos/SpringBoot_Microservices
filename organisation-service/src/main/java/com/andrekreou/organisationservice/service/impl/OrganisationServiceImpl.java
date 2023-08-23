package com.andrekreou.organisationservice.service.impl;

import com.andrekreou.organisationservice.dto.OrganisationDto;
import com.andrekreou.organisationservice.entity.Organisation;
import com.andrekreou.organisationservice.mapper.OrganisationMapper;
import com.andrekreou.organisationservice.repository.OrganisationRepository;
import com.andrekreou.organisationservice.service.OrganisationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrganisationServiceImpl implements OrganisationService {

    private OrganisationRepository organisationRepository;

    @Override
    public OrganisationDto saveOrganisation(OrganisationDto organisationDto) {
        Organisation organisation = OrganisationMapper.mapToOrganisation(organisationDto);
        Organisation savedOrganisation =  organisationRepository.save(organisation);
        return OrganisationMapper.mapToOrganisationDto(savedOrganisation);
    }

}
