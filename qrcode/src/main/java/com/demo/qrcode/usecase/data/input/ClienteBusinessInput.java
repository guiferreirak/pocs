package com.demo.qrcode.usecase.data.input;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClienteBusinessInput {

    private String nome;
    private String cpf;
    private String endereco;
    private LocalDate dataNascimento;
}
