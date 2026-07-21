package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {

    @Schema(
            description = "Account Number of EazyBank Account"
    )
    @NotEmpty(message = "Account number cannot be null")
    @Pattern(regexp = "(^$|(0-9){10})", message = "Account number must be 10 digits")
    private Long accountNumber;

    @Schema(
            description = "Account type of Eazy Bank Account", example = "Savings"
    )
    @NotEmpty(message = "Account type cannot be null or empty")
    private String accountType;

    @Schema(
            description = "Eazy Bank branch address"
    )
    @NotEmpty(message = "Branch Address cannot be null or empty")
    private String branchAddress;
}
