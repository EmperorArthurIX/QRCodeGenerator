package com.isp.qrcode.service;

public interface IQRCodeService {
    byte[] generateQRCode(String text, int height, int width) throws Exception;
}
