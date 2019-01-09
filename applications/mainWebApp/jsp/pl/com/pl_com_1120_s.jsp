<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pl.com.rec.*
	,	chosun.ciis.pl.com.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : pl_com_1120_s.jsp
* ��� : 
* �ۼ����� : 2009-03-09
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
	PL_COM_1120_SDataSet ds = (PL_COM_1120_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	dataSet = rx.add(root, "tempRes", "");

	try {
		if(ds != null){
			rx.add(dataSet, "rsltcnt", ds.rsltcnt);
			rx.add(dataSet, "medi_cd", ds.medi_cd);
			rx.add(dataSet, "medi_ser_no", ds.medi_ser_no);
			rx.add(dataSet, "medi_nm", StringUtil.replaceToXml(ds.medi_nm));
			rx.add(dataSet, "issu_cmpy", ds.issu_cmpy);
			rx.add(dataSet, "medi_clsf", ds.medi_clsf);
			rx.add(dataSet, "absence_clsf", ds.absence_clsf);
			rx.add(dataSet, "uprc", ds.uprc);
			rx.add(dataSet, "dcrate", ds.dcrate);
			rx.add(dataSet, "ser_no_basi", ds.ser_no_basi);
			rx.add(dataSet, "issu_clsf", ds.issu_clsf);
			rx.add(dataSet, "end_ser_no", ds.end_ser_no);
		}
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

<% /* �ۼ��ð� : Mon Mar 09 20:01:53 KST 2009 */ %>