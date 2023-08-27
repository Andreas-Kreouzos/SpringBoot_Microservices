package com.andrekreou.organisationservice.controller;

import com.andrekreou.organisationservice.dto.OrganisationDto;
import com.andrekreou.organisationservice.service.OrganisationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(
        name = "Organisation Service - Organisation Controller",
        description = "Organisation Controller Exposes REST APIs for Organisation Service"
)
@RestController
@RequestMapping("api/organisations")
@AllArgsConstructor
public class OrganisationController {

    private OrganisationService organisationService;

    @Operation(
            summary = "Save Organisation REST API",
            description = "Save Organisation REST API is used to save organisation object in a database"
    )
    @ApiResponse(
            responseCode = "201",
            description = "HTTP Status 201 CREATED"
    )
    @PostMapping
    public ResponseEntity<OrganisationDto> saveOrganisation(@RequestBody OrganisationDto organisationDto) {
        OrganisationDto savedOrganisation = organisationService.saveOrganisation(organisationDto);
        return new ResponseEntity<>(savedOrganisation, HttpStatus.CREATED);
    }

    @Operation(
            summary = "Get Organisation REST API",
            description = "Get Organisation REST API is used to get a single organisation object from the database"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP Status 200 SUCCESS"
    )
    @GetMapping("{code}")
    public ResponseEntity<OrganisationDto> getOrganisation(@PathVariable("code") String organisationCode) {
        OrganisationDto organisationDto = organisationService.getOrganisationByCode(organisationCode);
        return new ResponseEntity<>(organisationDto, HttpStatus.OK);
    }
}
