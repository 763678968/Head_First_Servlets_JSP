package com.example.web;

// Servlet imports
import java.util.zip.GZIPOutputStream;
import javax.servlet.*;
// I/O imports
import java.io.*;
import java.util.zip.GZIPOutputStream;

public class CompressionResponseWrapper extends HttpServletResponseWrapper {

    private GZIPOutputStream servletGzipOS = null;

    private PrintWriter pw = null;

    CompressionResponseWrapper(HttpServletResponse resp) {
        super(resp);
    }

    public void setContentLength(int len) { }

    public GZIPOutputStream get GZIPOutputStream() {
        return this.servletGzipOS.internalGzipOS;
    }

    private Object streamUsed = null;

    public ServletOutputStream getOutputStream() throws IOException {

        if ((streamUsed != null) && (streamUsed != pw)) {
            throw new IllegalStateException();
        }

        if (servletGzipOS == null) {
            servletGzipOs = new GZIPServletOutputStream(getResponse().getOutputStream());
            streamUsed = servletGzipOS;
        }
        return servletGzipOS;
    }

    public PrintWriter getWriter() throws IOException {

        if ((streamUsed != null) && (streamUsed != servletGzipOs)) {
            throw new IlegalStateException();
        }

        if (pw == null) {
            servletGzipOS = new GZIPOutputStream(getResponse().getOutputStream());

            OutputStreamWriter osw = new OutputStreamWriter(servletGzipOS, getResponse().getCharacterEncoding());

            pw = new PrintWriter(osw);
            streamUsed = pw;
        }
        return pw;
    }
}
