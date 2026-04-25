package com.isp.qrcode.dto;


public class QRGenRequest {
    private String text;
    private int height;
    private int width;

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
}
