package com.demo.qrcode.gateway.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "cliente")
public class ClienteDocument {

    @Id
    private String idCliente;
    private String nome;
    private String cpf;
    private String endereco;
    private LocalDate dataNascimento;
}
