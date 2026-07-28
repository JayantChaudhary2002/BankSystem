package com.eazybytes.loans.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Schema(name = "Loans",
    description = "Schema to hold loan information"
)
@Data
public class LoansDto {

    @NotEmpty(message = "Mobile number can not be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile Number must be 10 digits")
    @Schema(
            description = "Mobile number of customer", example = "9018263256"
    )
    private String mobileNumber;

    @NotEmpty(message = "Loan number can not be null or empty")
    @Pattern(regexp = "(^$|[0-9]{12})", message = "Mobile Number must be 12 digits")
    @Schema(
            description = "Mobile number of customer", example = "901826325607"
    )
    private String loanNumber;

    @NotEmpty(message = "Loan Type cannot be null or empty")
    @Schema(
            description = "Type of the loan", example = "House Loan"
    )
    private String loanType;

    @Positive(message = "Total loan amount should be greater than zero")
    @Schema(
            description = "Total loan amount", example = "100000"
    )
    private int totalLoan;

    @PositiveOrZero(message = "Total loan amount paid should be equal to or greater than zero")
    @Schema(
            description = "Total loan amount paid", example = "10000"
    )
    private int amountPaid;

    @PositiveOrZero(message = "Total outstanding amount should be equal to greater than zero")
    @Schema(
            description = "Total Outstanding Amount", example = "90000"
    )
    private int outstandingAmount;
}
