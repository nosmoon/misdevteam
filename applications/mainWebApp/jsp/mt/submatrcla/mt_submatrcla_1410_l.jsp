<%@	page contentType="text/xml; charset=EUC-KR" %>
 
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.submatrcla.rec.*
	,	chosun.ciis.mt.submatrcla.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_SUBMATRCLA_1410_LDataSet ds = (MT_SUBMATRCLA_1410_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_SUBMATRCLA_1410_LCURLISTRecord rec = (MT_SUBMATRCLA_1410_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "close_dt", rec.close_dt);
			rx.add(record, "clos_yn", rec.clos_yn);
			rx.add(record, "redm_yn", rec.redm_yn);
			rx.add(record, "incmg_pers_nm", rec.incmg_pers_nm);
			rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "job_clsf", rec.job_clsf);
			rx.add(record, "cd_clsf", rec.cd_clsf);
			rx.add(record, "cd", rec.cd);
			rx.add(record, "sub_cd", rec.sub_cd);
			rx.add(record, "exec_no", rec.exec_no);
			//rx.add(record, "close_yymm", StringUtil.replaceToXml(rec.close_yymm));
			//rx.add(record, "clos_yn", StringUtil.replaceToXml(rec.clos_yn));
			//rx.add(record, "redm_yn", StringUtil.replaceToXml(rec.redm_yn));
			//rx.add(record, "incmg_pers_nm", StringUtil.replaceToXml(rec.incmg_pers_nm));
			//rx.add(record, "incmg_dt_tm", StringUtil.replaceToXml(rec.incmg_dt_tm));
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "job_clsf", StringUtil.replaceToXml(rec.job_clsf));
			//rx.add(record, "cd_clsf", StringUtil.replaceToXml(rec.cd_clsf));
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "sub_cd", StringUtil.replaceToXml(rec.sub_cd));
			//rx.add(record, "exec_no", StringUtil.replaceToXml(rec.exec_no));
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
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
<mt_etccar_7001_l>
	<dataSet>
		<CURLIST>
			<record>
				<close_yymm/>
				<clos_yn/>
				<redm_yn/>
				<incmg_pers_nm/>
				<incmg_dt_tm/>
				<cmpy_cd/>
				<job_clsf/>
				<cd_clsf/>
				<cd/>
				<sub_cd/>
				<exec_no/>
			</record>
		</CURLIST>
	</dataSet>
</mt_etccar_7001_l>
*/
%>

<% /* 작성시간 : Mon Apr 09 10:39:40 KST 2012 */ %>