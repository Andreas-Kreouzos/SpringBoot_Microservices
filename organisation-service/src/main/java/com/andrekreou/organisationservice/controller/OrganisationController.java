package com.andrekreou.organisationservice.controller;

import com.andrekreou.organisationservice.dto.OrganisationDto;
import com.andrekreou.organisationservice.service.OrganisationService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/organisations")
@AllArgsConstructor
public class OrganisationController {

    private OrganisationService organisationService;

    @PostMapping
    public ResponseEntity<OrganisationDto> saveOrganisation(@RequestBody OrganisationDto organisationDto) {
        OrganisationDto savedOrganisation = organisationService.saveOrganisation(organisationDto);
        return new ResponseEntity<>(savedOrganisation, HttpStatus.CREATED);
    }
}
