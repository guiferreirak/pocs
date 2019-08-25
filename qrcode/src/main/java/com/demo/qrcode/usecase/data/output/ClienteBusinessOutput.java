package com.demo.qrcode.usecase.data.output;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClienteBusinessOutput {

    private String idCliente;
    private String nome;
    private String cpf;
    private String endereco;
    private LocalDate dataNascimento;
}
