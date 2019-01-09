<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.pr.prtexec.rec.*
	,	chosun.ciis.pr.prtexec.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	PR_PRTEXEC_7000_LDataSet ds = (PR_PRTEXEC_7000_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "fac_clsf", "");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			PR_PRTEXEC_7000_LCURLIST1Record rec = (PR_PRTEXEC_7000_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cdnm_cd);
		}
		
		recordSet = rx.add(dataSet, "medi_cd", "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			PR_PRTEXEC_7000_LCURLIST2Record rec = (PR_PRTEXEC_7000_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cdnm_cd);
		}
		
		recordSet = rx.add(dataSet, "sect_cd", "");
		for(int i = 0; i < ds.curlist3.size(); i++) {
			PR_PRTEXEC_7000_LCURLIST3Record rec = (PR_PRTEXEC_7000_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cdnm_cd);
		}
		/****** CURLIST END */

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

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<gubun/>
			<fac_clsf/>
			<medi_cd/>
			<edt_nm/>
			<ecnt/>
			<prt_dt/>
			<advt_clr_pcnt/>
			<advt_bw_pcnt/>
			<atic_clr_pcnt/>
			<clr_pcnt/>
			<bw_pcnt/>
			<prv_side_advt_clr_pcnt/>
			<prv_side_advt_bw_pcnt/>
			<wht_pj_qty/>
			<blk_pj_qty/>
			<sect_nm/>
			<sect_cnt/>
			<sect_pcnt/>
			<sect_clr_pcnt/>
			<sect_bw_pcnt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed May 06 15:05:29 KST 2009 */ %>