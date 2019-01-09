<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
  	, chosun.ciis.co.base.util.*
	,	chosun.ciis.co.dlco.rec.*
	,	chosun.ciis.co.dlco.ds.*;
	"
%>

<%
	CO_DLCO_1010_SDataSet ds = (CO_DLCO_1010_SDataSet)request.getAttribute("ds");
	  String strEncodeImage_seal = "";
	  strEncodeImage_seal = ds.getEncodeimage_seal();
	    String strEncodeImage_ern = "";
	  strEncodeImage_ern = ds.getEncodeimage_ern();
	  	    String strEncodeImage_acct_aplc_frm = "";
	  strEncodeImage_acct_aplc_frm  = ds.getEncodeimage_acct_aplc_frm();
	  	    String strEncodeImage_psbk_copy = "";
	  strEncodeImage_psbk_copy = ds.getEncodeimage_psbk_copy();
	  	    String strEncodeImage_use_seal = "";
	  strEncodeImage_use_seal = ds.getEncodeimage_use_seal();
	
	  RwXml rx = new RwXml();
	  int root = RwXml.rootNodeID;
		int resPhoto = 0;
		int record = 0;
		String errcode = ds.errcode;
		String errmsg = ds.errmsg;
		resPhoto = rx.add(root, "resPhoto", "");
	try {
		 record = rx.add(resPhoto, "seal_phot", 	strEncodeImage_seal, 		  "type=\"xsd:base64Binary\"");
		 record = rx.add(resPhoto, "ern_phot", 		strEncodeImage_ern, 		  "type=\"xsd:base64Binary\"");
		 record = rx.add(resPhoto, "acct_aplc_frm", strEncodeImage_acct_aplc_frm, "type=\"xsd:base64Binary\"");
		 record = rx.add(resPhoto, "psbk_copy", 	strEncodeImage_psbk_copy,     "type=\"xsd:base64Binary\"");
		 record = rx.add(resPhoto, "use_seal", 		strEncodeImage_use_seal,      "type=\"xsd:base64Binary\"");
	}catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(resPhoto, "errcode", errcode);
		rx.add(resPhoto, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>