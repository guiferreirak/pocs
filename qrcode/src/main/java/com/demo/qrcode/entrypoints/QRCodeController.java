package com.demo.qrcode.entrypoints;

import com.demo.qrcode.usecase.QRCodeUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;

@Controller
@RequestMapping("qrcode")
@RequiredArgsConstructor
public class QRCodeController {

    private final QRCodeUseCase qrcodeUseCase;

    @GetMapping
    public String viewQRCode(){
        return "qrcode/index";
    }

    @GetMapping("image")
    public void getQRCodeImage(HttpServletResponse response) throws Exception {
        response.setContentType("image/png");
        OutputStream outputStream = response.getOutputStream();
        outputStream.write(qrcodeUseCase.getQRCodeImage());
        outputStream.flush();
        outputStream.close();
    }
}
