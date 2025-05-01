package com.jaguzz.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {

    @Pattern(regexp ="(^$|[0-9]{10})", message = "Mobile number should be 10 digits")
    @NotEmpty(message = "Account Number can not be null or empty")
    @Schema(
            description = "Account Number of Eazy Bank account", example = "3454433243"
    )
    private Long accountNumber;

    @NotEmpty(message = "Account Type can not be null or empty")
    @Schema(
            description = "Account type of Eazy Bank account", example = "Savings"
    )

    private String accountType;

    @NotEmpty(message = "Branch Addres can not be null or empty")
    @Schema(
            description = "Eazy Bank branch address", example = "123 NewYork"
    )
    private String branchAddress;

}
