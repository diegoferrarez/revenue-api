package br.com.scto.revenue.interfaces.web.dto;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class TarifaDTO {

        private Long id;
        private LocalDate dataCadastrada;
        private LocalDate dataTarifa;
        private String codigoTarifa;
        private BigDecimal valorTarifa;
}
