<%@ page contentType="text/xml; charset=EUC-KR" %>

<%@ page import="
    java.io.*
  , java.sql.*
  , java.util.*
  , kr.co.comsquare.rwXmlLib.*
  , kr.co.comsquare.db.*
  , kr.co.comsquare.util.Tokenizer
  , chosun.ciis.mt.submatrcla.rec.*
  , chosun.ciis.mt.submatrcla.ds.*;
  "
%>

<%
  RwXml rx = new RwXml();
  MT_SUBMATRCLA_2006_ADataSet ds = (MT_SUBMATRCLA_2006_ADataSet)request.getAttribute("ds");
  int root = RwXml.rootNodeID;
  int dataSet = 0;
  int recordSet = 0;
  String errcode = ds.errcode;
  String errmsg = ds.errmsg;
  dataSet = rx.add(root, "tempData", "");
  
  String doc_id = ds.getDecid_key();
  String ip_address = ds.getIp_address();
  try {
    rx.add(dataSet, "key", doc_id);
    rx.add(dataSet, "ip_addr", ip_address);
  }
  catch (Exception e) {
    errcode += " JSP Error";
    errmsg += " JSP Error Message = " + e.getMessage();
  }
  finally {
    rx.add(dataSet, "errcode", errcode);
    rx.add(dataSet, "errmsg", errmsg);
    out.println(rx.xmlFlush());
    out.println(rx.xmlEndFlush());
  }
%>

<% /* 작성시간 : Thu Apr 16 16:45:16 KST 2009 */ %>