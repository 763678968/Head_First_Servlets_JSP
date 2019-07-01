//package com.example.web;
//
//// Servlet imports
//import java.util.zip.GZIPOutputStream;
//import javax.servlet.*;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpServletResponseWrapper;
//// I/O imports
//import java.io.*;
//import java.util.zip.GZIPOutputStream;
//
//public class CompressionResponseWrapper extends HttpServletResponseWrapper {
//
//    private GZIPServletOutputStream servletGzipOS = null;
//
//    private PrintWriter pw = null;
//
//    CompressionResponseWrapper(HttpServletResponse resp) {
//        super(resp);
//    }
//
//    public void setContentLength(int len) { }
//
//    public GZIPOutputStream getGZIPOutputStream() {
//        return this.servletGzipOS.internalGzipOS;
//    }
//
//    private Object streamUsed = null;
//
//    public ServletOutputStream getOutputStream() throws IOException {
//
//        if ((streamUsed != null) && (streamUsed != pw)) {
//            throw new IllegalStateException();
//        }
//
//        if (servletGzipOS == null) {
//            servletGzipOS = new GZIPServletOutputStream(getResponse().getOutputStream());
//            streamUsed = servletGzipOS;
//        }
//        return servletGzipOS;
//    }
//
//    public PrintWriter getWriter() throws IOException {
//
//        if ((streamUsed != null) && (streamUsed != servletGzipOS)) {
//            throw new IllegalStateException();
//        }
//
//        if (pw == null) {
//            servletGzipOS = new GZIPServletOutputStream(getResponse().getOutputStream());
//
//            OutputStreamWriter osw = new OutputStreamWriter(servletGzipOS, getResponse().getCharacterEncoding());
//
//            pw = new PrintWriter(osw);
//            streamUsed = pw;
//        }
//        return pw;
//    }
//}
//
////class GZIPServletOutputStream extends ServletOutputStream {
////
////    GZIPOutputStream internalGzipOS;
////
////    /** 装饰器构造函数 */
////    GZIPServletOutputStream(ServletOutputStream sos) throws IOException {
////        this.internalGzipOS = new GZIPOutputStream(sos);
////    }
////
////    public void write(int param) throws java.io.IOException {
////        internalGzipOS.write(param);
////    }
//}