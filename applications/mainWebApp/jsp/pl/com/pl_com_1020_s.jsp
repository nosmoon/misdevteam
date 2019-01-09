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
* 파일명 : pl_com_1020_s.jsp
* 기능 : 
* 작성일자 : 2009-03-09
* 작성자 : 김상옥
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	PL_COM_1020_SDataSet ds = (PL_COM_1020_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	dataSet = rx.add(root, "tempRes", "");

	try {
		if(ds != null){
			rx.add(dataSet, "rsltcnt", ds.rsltcnt);
			rx.add(dataSet, "dlco_cd", ds.dlco_cd);
			rx.add(dataSet, "dlco_seq", ds.dlco_seq);
			rx.add(dataSet, "dlco_clsf", ds.dlco_clsf);
			rx.add(dataSet, "area", ds.area);
			rx.add(dataSet, "dlco_nm", StringUtil.replaceToXml(ds.dlco_nm));
			rx.add(dataSet, "prv_curr_clsf", ds.prv_curr_clsf);
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

<% /* 작성시간 : Mon Mar 09 19:35:23 KST 2009 */ %>