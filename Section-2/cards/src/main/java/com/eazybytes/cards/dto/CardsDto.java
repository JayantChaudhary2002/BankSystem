package com.eazybytes.cards.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

import java.util.PrimitiveIterator;

@Schema(name = "Cards",
    description = "Schema to hold Card information"
)
@Data
public class CardsDto {

    @NotEmpty(message = "Mobile Number cannot be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    @Schema(
            description = "Mobile Number of Customer", example = "9018762534"
    )
    private String mobileNumber;

    @NotEmpty(message = "Card Number cannot be null or empty")
    @Pattern(regexp = "(^$|[0-9]{12})", message = "Card number must be 12 digits")
    @Schema(
            description = "Card Number of Customer", example = "109234876592"
    )
    private String cardNumber;

    @NotEmpty(message = "Card Type cannot be null or empty")
    @Schema(
            description = "Type of the card", example = "Credit Card"
    )
    private String cardType;

    @Positive(message = "Total card limit should be greater than zero")
    @Schema(
            description = "Total amount limit available against a card", example = "10000"
    )
    private int totalLimit;

    @PositiveOrZero(message = "Total amount should be equal or greater than zero")
    @Schema(
            description = "Total amount used by the customer", example = "1000"
    )
    private int amountUsed;

    @PositiveOrZero(message = "Total available amount should be equal or greater than zero")
    @Schema(
            description = "Total available amount against card", example = "9000"
    )
    private int availableAmount;
}
