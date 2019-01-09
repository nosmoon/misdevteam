<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,   somo.framework.util.*
	,	chosun.ciis.pl.bas.rec.*
	,	chosun.ciis.pl.bas.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : pl_bas_1130_a.jsp
* ��� : 
* �ۼ����� : 2009-02-25
* �ۼ��� : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	PL_BAS_1130_ADataSet ds = (PL_BAS_1130_ADataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int recordSet = 0;
	int dataSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	String resultMsg = Util.checkString((String)request.getAttribute("resultMsg"));

	resData = rx.add(root, "resultData", "");
	dataSet = rx.add(resData, "searchDtl", "");

	String medi_cd = ds.medi_cd;
	String medi_ser_no = ds.medi_ser_no;

	rx.add(dataSet, "medi_cd", medi_cd);
	rx.add(dataSet, "medi_ser_no", medi_ser_no);

	rx.add(dataSet, "statusMsg", "OK" );
	if(!"".equals(resultMsg)){
		rx.add(dataSet, "resultMsg", resultMsg);
	}else{
		rx.add(dataSet, "resultMsg", "���������� ó���Ǿ����ϴ�.");
	}

	try {
	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(resData, "errcode", errcode);
		rx.add(resData, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* �ۼ��ð� : Fri Feb 20 13:48:19 KST 2009 */ %>