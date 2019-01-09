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
	PR_OTHCNSM_2330_LDataSet ds = (PR_OTHCNSM_2330_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "gridData3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			PR_OTHCNSM_2330_LCURLIST3Record rec = (PR_OTHCNSM_2330_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "psplat_clsf", rec.psplat_clsf);
			rx.add(record, "psplat_fee", rec.psplat_fee);
			rx.add(record, "gnaw_fee", rec.gnaw_fee);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
			rx.add(record, "aply_dt", rec.aply_dt);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "sect_cd", rec.sect_cd);
			//rx.add(record, "psplat_clsf", StringUtil.replaceToXml(rec.psplat_clsf));
			//rx.add(record, "psplat_fee", StringUtil.replaceToXml(rec.psplat_fee));
			//rx.add(record, "gnaw_fee", StringUtil.replaceToXml(rec.gnaw_fee));
			//rx.add(record, "fac_clsf", StringUtil.replaceToXml(rec.fac_clsf));
			//rx.add(record, "fac_clsf_nm", StringUtil.replaceToXml(rec.fac_clsf_nm));
			//rx.add(record, "aply_dt", StringUtil.replaceToXml(rec.aply_dt));
			//rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
			//rx.add(record, "sect_cd", StringUtil.replaceToXml(rec.sect_cd));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "gridData2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			PR_OTHCNSM_2330_LCURLIST2Record rec = (PR_OTHCNSM_2330_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "aply_dt", rec.aply_dt);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
			rx.add(record, "psplat_clsf", rec.psplat_clsf);
			rx.add(record, "psplat_fee", rec.psplat_fee);
			rx.add(record, "gnaw_fee", rec.gnaw_fee);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.add(record, "sect_nm", rec.sect_nm);
			//rx.add(record, "aply_dt", StringUtil.replaceToXml(rec.aply_dt));
			//rx.add(record, "fac_clsf", StringUtil.replaceToXml(rec.fac_clsf));
			//rx.add(record, "fac_clsf_nm", StringUtil.replaceToXml(rec.fac_clsf_nm));
			//rx.add(record, "psplat_clsf", StringUtil.replaceToXml(rec.psplat_clsf));
			//rx.add(record, "psplat_fee", StringUtil.replaceToXml(rec.psplat_fee));
			//rx.add(record, "gnaw_fee", StringUtil.replaceToXml(rec.gnaw_fee));
			//rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
			//rx.add(record, "sect_cd", StringUtil.replaceToXml(rec.sect_cd));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "gridData1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			PR_OTHCNSM_2330_LCURLIST1Record rec = (PR_OTHCNSM_2330_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.add(record, "psplat_clsf", rec.psplat_clsf);
			rx.add(record, "psplat_fee", rec.psplat_fee);
			rx.add(record, "gnaw_fee", rec.gnaw_fee);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "aply_dt", rec.aply_dt);
			//rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
			//rx.add(record, "sect_cd", StringUtil.replaceToXml(rec.sect_cd));
			//rx.add(record, "psplat_clsf", StringUtil.replaceToXml(rec.psplat_clsf));
			//rx.add(record, "psplat_fee", StringUtil.replaceToXml(rec.psplat_fee));
			//rx.add(record, "gnaw_fee", StringUtil.replaceToXml(rec.gnaw_fee));
			//rx.add(record, "fac_clsf", StringUtil.replaceToXml(rec.fac_clsf));
			//rx.add(record, "aply_dt", StringUtil.replaceToXml(rec.aply_dt));
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
<pr_othcnsm_2330_l>
	<dataSet>
		<CURLIST3>
			<record>
				<psplat_clsf/>
				<psplat_fee/>
				<gnaw_fee/>
				<fac_clsf/>
				<fac_clsf_nm/>
				<aply_dt/>
				<medi_cd/>
				<sect_cd/>
			</record>
		</CURLIST3>
	</dataSet>
</pr_othcnsm_2330_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<pr_othcnsm_2330_l>
	<dataSet>
		<CURLIST2>
			<record>
				<aply_dt/>
				<fac_clsf/>
				<fac_clsf_nm/>
				<psplat_clsf/>
				<psplat_fee/>
				<gnaw_fee/>
				<medi_cd/>
				<sect_cd/>
			</record>
		</CURLIST2>
	</dataSet>
</pr_othcnsm_2330_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<pr_othcnsm_2330_l>
	<dataSet>
		<CURLIST1>
			<record>
				<medi_cd/>
				<sect_cd/>
				<psplat_clsf/>
				<psplat_fee/>
				<gnaw_fee/>
				<fac_clsf/>
				<aply_dt/>
			</record>
		</CURLIST1>
	</dataSet>
</pr_othcnsm_2330_l>
*/
%>

<% /* 작성시간 : Tue Sep 22 16:52:01 KST 2009 */ %>