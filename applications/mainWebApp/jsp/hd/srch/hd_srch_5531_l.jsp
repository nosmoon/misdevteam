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
	HD_SRCH_5531_LDataSet ds = (HD_SRCH_5531_LDataSet)request.getAttribute("ds");
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
			HD_SRCH_5531_LCURLIST1Record rec = (HD_SRCH_5531_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "posk_gbn", rec.posk_gbn);
			rx.add(record, "m_cnt", rec.m_cnt);
			rx.add(record, "m_avg_saly", rec.m_avg_saly);
			rx.add(record, "m_sum_saly", rec.m_sum_saly);
			rx.add(record, "w_cnt", rec.w_cnt);
			rx.add(record, "w_avg_saly", rec.w_avg_saly);
			rx.add(record, "w_sum_saly", rec.w_sum_saly);
			rx.add(record, "tot_cnt", rec.tot_cnt);
			rx.add(record, "tot_avg_saly", rec.tot_avg_saly);
			rx.add(record, "tot_sum_saly", rec.tot_sum_saly);
			//rx.add(record, "posk_gbn", StringUtil.replaceToXml(rec.posk_gbn));
			//rx.add(record, "m_cnt", StringUtil.replaceToXml(rec.m_cnt));
			//rx.add(record, "m_avg_saly", StringUtil.replaceToXml(rec.m_avg_saly));
			//rx.add(record, "m_sum_saly", StringUtil.replaceToXml(rec.m_sum_saly));
			//rx.add(record, "w_cnt", StringUtil.replaceToXml(rec.w_cnt));
			//rx.add(record, "w_avg_saly", StringUtil.replaceToXml(rec.w_avg_saly));
			//rx.add(record, "w_sum_saly", StringUtil.replaceToXml(rec.w_sum_saly));
			//rx.add(record, "tot_cnt", StringUtil.replaceToXml(rec.tot_cnt));
			//rx.add(record, "tot_avg_saly", StringUtil.replaceToXml(rec.tot_avg_saly));
			//rx.add(record, "tot_sum_saly", StringUtil.replaceToXml(rec.tot_sum_saly));
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
<hd_srch_5531_l>
	<dataSet>
		<CURLIST1>
			<record>
				<posk_gbn/>
				<m_cnt/>
				<m_avg_saly/>
				<m_sum_saly/>
				<w_cnt/>
				<w_avg_saly/>
				<w_sum_saly/>
				<tot_cnt/>
				<tot_avg_saly/>
				<tot_sum_saly/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_srch_5531_l>
*/
%>

<% /* 작성시간 : Mon Nov 19 11:44:27 KST 2018 */ %>