package com.demo.qrcode;

import com.demo.qrcode.entrypoints.converter.ClienteHttpConverter;
import com.demo.qrcode.entrypoints.data.request.ClienteContractRequest;
import com.demo.qrcode.usecase.ClienteUseCase;
import com.demo.qrcode.usecase.data.output.ClienteBusinessOutput;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
@RequiredArgsConstructor
@Log
public class QrcodeApplication /*implements CommandLineRunner*/ {

//	private final ClienteUseCase clienteUseCase;
//	private final ClienteHttpConverter clienteConverter;

	public static void main(String[] args) { SpringApplication.run(QrcodeApplication.class, args); }

//	@Override
//	public void run(String... args) throws Exception {
//
//		try{
//			ClienteContractRequest request1 = ClienteContractRequest.builder().nome("Gui").cpf("123456").endereco("Av. Guilherme").dataNascimento(LocalDate.now()).build();
//			ClienteContractRequest request2 = ClienteContractRequest.builder().nome("Fe").cpf("789012").endereco("Av. Fernanda").dataNascimento(LocalDate.now()).build();
//
//			ClienteBusinessOutput clienteBusinessOutput1 = clienteUseCase.cadastrarCliente(clienteConverter.toUsecase(request1));
//			ClienteBusinessOutput clienteBusinessOutput2 = clienteUseCase.cadastrarCliente(clienteConverter.toUsecase(request2));
//
//			log.info("Sucesso -------------------------------");
//		}catch (Exception ex){
//			throw new Exception("Erro na massa de teste");
//		}
//	}

}
