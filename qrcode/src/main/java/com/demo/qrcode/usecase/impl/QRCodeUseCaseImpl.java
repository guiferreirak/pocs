package com.demo.qrcode.usecase.impl;

import com.demo.qrcode.usecase.QRCodeUseCase;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

@Component
@RequiredArgsConstructor
public class QRCodeUseCaseImpl implements QRCodeUseCase {

    private static final String CONTENT = "Teste QRCODE";
    private static final String PNG = "png";
    private static final Integer DUZENTOS = 200;

    //private final QRCodeWriter qrCode;

    @Override
    public byte[] getQRCodeImage() throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        QRCodeWriter qrCode = new QRCodeWriter();

        try{
            BitMatrix bitMatrix = qrCode.encode(CONTENT, BarcodeFormat.QR_CODE, DUZENTOS, DUZENTOS);
            MatrixToImageWriter.writeToStream(bitMatrix, PNG, byteArrayOutputStream);

            return byteArrayOutputStream.toByteArray();
        } catch (WriterException e) {
            throw new Exception("Erro no encode do QrCode");
        } catch (IOException e) {
            throw new Exception("Erro na conversão de QrCode to byteArray");
        }
    }

}
