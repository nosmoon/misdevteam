<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.srch.rec.*
	,	chosun.ciis.hd.srch.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SRCH_5411_LDataSet ds = (HD_SRCH_5411_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_SRCH_5411_LCURLIST1Record rec = (HD_SRCH_5411_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "clas_clsf_cd", rec.clas_clsf_cd);
			rx.add(record, "clas_clsf1", rec.clas_clsf1);
			rx.add(record, "clas_clsf_cd2", rec.clas_clsf_cd2);
			rx.add(record, "clas_clsf2", rec.clas_clsf2);
			rx.add(record, "prv_mm_amt", rec.prv_mm_amt);
			rx.add(record, "base_mm_amt", rec.base_mm_amt);
			rx.add(record, "prvmm_cmpr", rec.prvmm_cmpr);
			rx.add(record, "icdc_amt", rec.icdc_amt);
			rx.add(record, "remk", rec.remk);
			//rx.add(record, "clas_clsf_cd", StringUtil.replaceToXml(rec.clas_clsf_cd));
			//rx.add(record, "clas_clsf1", StringUtil.replaceToXml(rec.clas_clsf1));
			//rx.add(record, "clas_clsf_cd2", StringUtil.replaceToXml(rec.clas_clsf_cd2));
			//rx.add(record, "clas_clsf2", StringUtil.replaceToXml(rec.clas_clsf2));
			//rx.add(record, "prv_mm_amt", StringUtil.replaceToXml(rec.prv_mm_amt));
			//rx.add(record, "base_mm_amt", StringUtil.replaceToXml(rec.base_mm_amt));
			//rx.add(record, "prvmm_cmpr", StringUtil.replaceToXml(rec.prvmm_cmpr));
			//rx.add(record, "icdc_amt", StringUtil.replaceToXml(rec.icdc_amt));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
<hd_srch_5411_l>
	<dataSet>
		<CURLIST1>
			<record>
				<clas_clsf_cd/>
				<clas_clsf1/>
				<clas_clsf_cd2/>
				<clas_clsf2/>
				<prv_mm_amt/>
				<base_mm_amt/>
				<prvmm_cmpr/>
				<icdc_amt/>
				<remk/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_srch_5411_l>
*/
%>

<% /* 작성시간 : Wed Oct 31 14:05:01 KST 2018 */ %>