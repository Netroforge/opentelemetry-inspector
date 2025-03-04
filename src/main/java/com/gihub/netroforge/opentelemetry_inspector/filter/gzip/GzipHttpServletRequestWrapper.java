package com.gihub.netroforge.opentelemetry_inspector.filter.gzip;

import jakarta.servlet.ReadListener;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class GzipHttpServletRequestWrapper extends HttpServletRequestWrapper {

    private byte[] decompressedBytes;

    public GzipHttpServletRequestWrapper(HttpServletRequest request) throws IOException {
        super(request);
        decompressRequest(request);
    }

    private void decompressRequest(HttpServletRequest request) throws IOException {
        try (GZIPInputStream gzipInputStream = new GZIPInputStream(request.getInputStream())) {
            this.decompressedBytes = gzipInputStream.readAllBytes();
        }
    }

    @Override
    public ServletInputStream getInputStream() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.decompressedBytes);
        return new ServletInputStream() {
            @Override
            public int read() throws IOException {
                return byteArrayInputStream.read();
            }

            @Override
            public boolean isFinished() {
                return byteArrayInputStream.available() == 0;
            }

            @Override
            public boolean isReady() {
                return true;
            }

            @Override
            public void setReadListener(ReadListener readListener) {
                // Not implemented
            }
        };
    }
}