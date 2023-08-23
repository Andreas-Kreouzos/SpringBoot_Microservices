package com.andrekreou.organisationservice.mapper;

import com.andrekreou.organisationservice.dto.OrganisationDto;
import com.andrekreou.organisationservice.entity.Organisation;

public class OrganisationMapper {

    public static OrganisationDto mapToOrganisationDto(Organisation organisation) {
        return new OrganisationDto(
                organisation.getId(),
                organisation.getOrganisationName(),
                organisation.getOrganisationDescription(),
                organisation.getOrganisationCode(),
                organisation.getCreatedDate()
        );
    }

    public static Organisation mapToOrganisation(OrganisationDto organisationDto) {
        return new Organisation(
                organisationDto.getId(),
                organisationDto.getOrganisationName(),
                organisationDto.getOrganisationDescription(),
                organisationDto.getOrganisationCode(),
                organisationDto.getCreatedDate()
        );
    }
}
