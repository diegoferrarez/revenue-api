package br.com.scto.revenue.domain.model.cont;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Tarifa {

    private Long id;
    private LocalDate dataCadastrada;
    private LocalDate dataTarifaInicio;
    private LocalDate dataTarifaFim;
    private String codigoTarifa;
    private BigDecimal valorTarifa;
    private boolean isAtiva;

}
