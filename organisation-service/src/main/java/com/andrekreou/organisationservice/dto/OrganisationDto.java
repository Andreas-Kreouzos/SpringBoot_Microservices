package com.andrekreou.organisationservice.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Schema(description = "OrganisationDto Model Information")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OrganisationDto {
    private Long id;
    @Schema(description = "Organisation Name")
    private String organisationName;
    @Schema(description = "Organisation Description")
    private String organisationDescription;
    @Schema(description = "Organisation Code")
    private String organisationCode;
    @Schema(description = "Organisation Created Date")
    private LocalDateTime createdDate;
}
