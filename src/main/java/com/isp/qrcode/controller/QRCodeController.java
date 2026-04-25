package com.isp.qrcode.controller;

import com.isp.qrcode.dto.QRGenRequest;
import com.isp.qrcode.service.impl.QRCodeService;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qr")
public class QRCodeController {
    private final QRCodeService qrCodeService;

    public QRCodeController(QRCodeService qrCodeService) {
        this.qrCodeService = qrCodeService;
    }

    @PostMapping(value="/generate", produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<byte[]> generateQR(@RequestBody QRGenRequest request) throws Exception {
        byte[] image = qrCodeService.generateQRCode(
                request.getText(),
                request.getWidth(),
                request.getHeight()
        );
        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(image);
    }
}
