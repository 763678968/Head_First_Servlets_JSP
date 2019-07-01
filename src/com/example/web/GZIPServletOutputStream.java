package com.example.web;

import javax.servlet.ServletOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class GZIPServletOutputStream extends ServletOutputStream {

    GZIPOutputStream internalGzipOS;

    /** 装饰器构造函数 */
    GZIPServletOutputStream(ServletOutputStream sos) throws IOException {
        this.internalGzipOS = new GZIPOutputStream(sos);
    }

    public void writer(int param) throws java.io.IOException {
        internalGzipOS.write(param);
    }
}
