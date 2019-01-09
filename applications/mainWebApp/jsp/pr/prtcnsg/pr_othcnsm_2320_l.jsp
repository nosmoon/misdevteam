<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pr.prtcnsg.rec.*
	,	chosun.ciis.pr.prtcnsg.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	PR_OTHCNSM_2320_LDataSet ds = (PR_OTHCNSM_2320_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			PR_OTHCNSM_2320_LCURLIST1Record rec = (PR_OTHCNSM_2320_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "aply_dt", rec.aply_dt);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.add(record, "sect_nm", rec.sect_nm);
			rx.add(record, "papcmpy_cd_nm", rec.papcmpy_cd_nm);
			rx.add(record, "papcmpy_cd", rec.papcmpy_cd);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
			rx.add(record, "paper_uprc", rec.paper_uprc);
			//rx.add(record, "aply_dt", StringUtil.replaceToXml(rec.aply_dt));
			//rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
			//rx.add(record, "sect_cd", StringUtil.replaceToXml(rec.sect_cd));
			//rx.add(record, "papcmpy_cd_nm", StringUtil.replaceToXml(rec.papcmpy_cd_nm));
			//rx.add(record, "papcmpy_cd", StringUtil.replaceToXml(rec.papcmpy_cd));
			//rx.add(record, "fac_clsf", StringUtil.replaceToXml(rec.fac_clsf));
			//rx.add(record, "fac_clsf_nm", StringUtil.replaceToXml(rec.fac_clsf_nm));
			//rx.add(record, "paper_uprc", StringUtil.replaceToXml(rec.paper_uprc));
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
TrustForm�� Instance ����ο� �����ؼ� ���
<pr_othcnsm_2320_l>
	<dataSet>
		<CURLIST1>
			<record>
				<aply_dt/>
				<medi_cd/>
				<sect_cd/>
				<papcmpy_cd_nm/>
				<papcmpy_cd/>
				<fac_clsf/>
				<fac_clsf_nm/>
				<paper_uprc/>
			</record>
		</CURLIST1>
	</dataSet>
</pr_othcnsm_2320_l>
*/
%>

<% /* �ۼ��ð� : Tue Sep 22 16:52:01 KST 2009 */ %>