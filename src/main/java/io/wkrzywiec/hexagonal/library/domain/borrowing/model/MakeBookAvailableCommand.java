package io.wkrzywiec.hexagonal.library.domain.borrowing.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MakeBookAvailableCommand {
    private Long bookId;
}
