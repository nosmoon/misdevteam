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
	MT_SUBMATRCLA_2000_500_LDataSet ds = (MT_SUBMATRCLA_2000_500_LDataSet)request.getAttribute("ds"); 
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
			MT_SUBMATRCLA_2000_500_LCURLISTRecord rec = (MT_SUBMATRCLA_2000_500_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			rx.add(record, "dept_cd_nm", StringUtil.replaceToXml(rec.dept_cd_nm));
			rx.add(record, "aplc_pers_nm", StringUtil.replaceToXml(rec.aplc_pers_nm));
      		rx.add(record, "clam_actu_cd_nm", StringUtil.replaceToXml(rec.clam_actu_cd_nm));
			rx.add(record, "via_dept_nm", StringUtil.replaceToXml(rec.via_dept_nm));
			rx.add(record, "via_dept_cnfm_yn", StringUtil.replaceToXml(rec.via_dept_cnfm_yn));
			rx.add(record, "misno_actu", StringUtil.replaceToXml(rec.misno_actu));
			rx.add(record, "misno_matr", StringUtil.replaceToXml(rec.misno_matr));
			rx.add(record, "clam_clsf", StringUtil.replaceToXml(rec.clam_clsf));
			rx.add(record, "wcl_issu_yn", StringUtil.replaceToXml(rec.wcl_issu_yn));
			rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			rx.add(record, "clam_actu_cd", StringUtil.replaceToXml(rec.clam_actu_cd));
			rx.add(record, "aplc_pers", StringUtil.replaceToXml(rec.aplc_pers));
			rx.add(record, "via_dept", StringUtil.replaceToXml(rec.via_dept));
			rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			rx.add(record, "oz_cnt", StringUtil.replaceToXml(rec.oz_cnt));
			//rx.add(record, "occr_dt", rec.occr_dt);
			//rx.add(record, "dept_cd_nm", rec.dept_cd_nm);
			//rx.add(record, "clam_actu_cd_nm", rec.clam_actu_cd_nm);
			//rx.add(record, "aplc_pers_nm", rec.aplc_pers_nm);
			//rx.add(record, "via_dept_nm", rec.via_dept_nm);
			//rx.add(record, "via_dept_cnfm_yn", rec.via_dept_cnfm_yn);
			//rx.add(record, "misno_actu", rec.misno_actu);
			//rx.add(record, "misno_matr", rec.misno_matr);
			//rx.add(record, "clam_clsf", rec.clam_clsf);
			//rx.add(record, "wcl_issu_yn", rec.wcl_issu_yn);
			//rx.add(record, "seq", rec.seq);
			//rx.add(record, "dept_cd", rec.dept_cd);
			//rx.add(record, "clam_actu_cd", rec.clam_actu_cd);
			//rx.add(record, "aplc_pers", rec.aplc_pers);
			//rx.add(record, "via_dept", rec.via_dept);
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
<mt_submatrcla_2000_500_l>
	<dataSet>
		<CURLIST>
			<record>
				<occr_dt/>
				<dept_cd_nm/>
				<clam_actu_cd_nm/>
				<aplc_pers_nm/>
				<via_dept_nm/>
				<via_dept_cnfm_yn/>
				<misno_actu/>
				<misno_matr/>
				<clam_clsf/>
				<wcl_issu_yn/>
				<seq/>
				<dept_cd/>
				<clam_actu_cd/>
				<aplc_pers/>
				<via_dept/>
				<remk/>
			</record>
		</CURLIST>
	</dataSet>
</mt_submatrcla_2000_500_l>
*/
%>

<% /* 작성시간 : Thu Jul 09 13:38:09 KST 2009 */ %>