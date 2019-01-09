<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.co.cocd.rec.*
	,	chosun.ciis.co.cocd.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	CO_COCD_1610_LDataSet ds = (CO_COCD_1610_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int curlist = rx.add(root, "curlist", "");

	try {
		/****** COMMCDCUR1 BEGIN */
		for(int i = 0; i < ds.commcdcur1.size(); i++) {
			CO_COCD_1610_LCOMMCDCUR1Record rec = (CO_COCD_1610_LCOMMCDCUR1Record)ds.commcdcur1.get(i);
			int record = rx.add(curlist, "record", "");
			
			rx.add(record, "pgm_id", rec.pgm_id);
			//rx.add(record, "pgm_nm", rec.pgm_nm);
			//rx.add(record, "pgm_onm", rec.pgm_onm);
			rx.add(record, "pgm_clf2", rec.pgm_clf2);
			rx.add(record, "pgm_clf2_nm", rec.pgm_clf2_nm);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "use_yn", rec.use_yn);
			rx.add(record, "prd_co_cd", rec.prd_co_cd);
			rx.add(record, "prd_co_nm", rec.prd_co_nm);
			rx.add(record, "prd_ym", rec.prd_ym);
			rx.add(record, "rmsg_dt_tm", rec.rmsg_dt_tm);
			rx.add(record, "mod_dt", rec.mod_dt);
			//rx.add(record, "pgm_id", StringUtil.replaceToXml(rec.pgm_id));
			rx.add(record, "pgm_nm", StringUtil.replaceToXml(rec.pgm_nm));
			rx.add(record, "pgm_onm", StringUtil.replaceToXml(rec.pgm_onm));
			//rx.add(record, "pgm_clf2", StringUtil.replaceToXml(rec.pgm_clf2));
			//rx.add(record, "pgm_clf2_nm", StringUtil.replaceToXml(rec.pgm_clf2_nm));
			//rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
			//rx.add(record, "use_yn", StringUtil.replaceToXml(rec.use_yn));
			//rx.add(record, "prd_co_cd", StringUtil.replaceToXml(rec.prd_co_cd));
			//rx.add(record, "prd_co_nm", StringUtil.replaceToXml(rec.prd_co_nm));
			//rx.add(record, "prd_ym", StringUtil.replaceToXml(rec.prd_ym));
			//rx.add(record, "rmsg_dt_tm", StringUtil.replaceToXml(rec.rmsg_dt_tm));
			//rx.add(record, "mod_dt", StringUtil.replaceToXml(rec.mod_dt));
		}
		/****** COMMCDCUR1 END */

	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<co_cocd_1610_l>
	<dataSet>
		<COMMCDCUR1>
			<record>
				<pgm_id/>
				<pgm_nm/>
				<pgm_onm/>
				<pgm_clf2/>
				<pgm_clf2_nm/>
				<medi_cd/>
				<use_yn/>
				<prd_co_cd/>
				<prd_co_nm/>
				<prd_ym/>
				<rmsg_dt_tm/>
				<mod_dt/>
			</record>
		</COMMCDCUR1>
	</dataSet>
</co_cocd_1610_l>
*/
%>

<% /* 작성시간 : Mon Jan 16 18:51:58 KST 2012 */ %>