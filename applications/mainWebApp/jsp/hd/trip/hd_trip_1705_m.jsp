<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.trip.rec.*
	,	chosun.ciis.hd.trip.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_TRIP_1705_MDataSet ds = (HD_TRIP_1705_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "xx_proc_clsf_010", ds.getXx_proc_clsf_010());
		rx.add(dataSet, "xx_proc_clsf_020", ds.getXx_proc_clsf_020());
		rx.add(dataSet, "xx_proc_clsf_030", ds.getXx_proc_clsf_030());
		rx.add(dataSet, "xx_proc_clsf_040", ds.getXx_proc_clsf_040());
		rx.add(dataSet, "xx_rptv_posi_cd_010", ds.getXx_rptv_posi_cd_010());
		rx.add(dataSet, "xx_rptv_posi_cd_020", ds.getXx_rptv_posi_cd_020());
		rx.add(dataSet, "xx_rptv_posi_cd_030", ds.getXx_rptv_posi_cd_030());
		rx.add(dataSet, "xx_rptv_posi_cd_040", ds.getXx_rptv_posi_cd_040());
		rx.add(dataSet, "xx_pay_basi_clsf_010", ds.getXx_pay_basi_clsf_010());
		rx.add(dataSet, "xx_pay_basi_clsf_020", ds.getXx_pay_basi_clsf_020());
		rx.add(dataSet, "xx_pay_basi_clsf_030", ds.getXx_pay_basi_clsf_030());
		rx.add(dataSet, "xx_dspch_clsf_010", ds.getXx_dspch_clsf_010());
		rx.add(dataSet, "xx_dspch_clsf_020", ds.getXx_dspch_clsf_020());
		rx.add(dataSet, "xx_stay_clsf_010", ds.getXx_stay_clsf_010());
		rx.add(dataSet, "xx_mode_gubun_010", ds.getXx_mode_gubun_010());
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

<% /* 작성시간 : Tue Feb 07 14:46:32 KST 2012 */ %>