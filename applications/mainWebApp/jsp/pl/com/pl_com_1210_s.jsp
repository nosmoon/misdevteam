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
* ���ϸ� : pl_com_1210_s.jsp
* ��� : 
* �ۼ����� : 2009-04-06
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
	PL_COM_1210_SDataSet ds = (PL_COM_1210_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	dataSet = rx.add(root, "resform", "");

	try {
		if(ds != null){
			rx.add(dataSet, "medi_clsf", ds.medi_clsf);
			rx.add(dataSet, "basi_yymm", ds.basi_yymm);
			rx.add(dataSet, "basi_dt", ds.basi_dt);
			rx.add(dataSet, "dlco_cd", ds.dlco_cd);
			rx.add(dataSet, "dlco_seq", ds.dlco_seq);
			rx.add(dataSet, "dlco_nm", StringUtil.replaceToXml(ds.dlco_nm));
			rx.add(dataSet, "send_plac_seq", ds.send_plac_seq);
			rx.add(dataSet, "send_plac_nm", StringUtil.replaceToXml(ds.send_plac_nm));
			rx.add(dataSet, "ordr_dt", ds.ordr_dt);
			rx.add(dataSet, "ordr_grp_seq", ds.ordr_grp_seq);
			rx.add(dataSet, "deal_dt", ds.deal_dt);
			rx.add(dataSet, "deal_grp_seq", ds.deal_grp_seq);
			rx.add(dataSet, "clos_yn", ds.clos_yn);
			rx.add(dataSet, "rcpm_yn", ds.rcpm_yn);
			rx.add(dataSet, "remk", StringUtil.replaceToXml(ds.remk));
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

<% /* �ۼ��ð� : Mon Apr 06 21:12:07 KST 2009 */ %>