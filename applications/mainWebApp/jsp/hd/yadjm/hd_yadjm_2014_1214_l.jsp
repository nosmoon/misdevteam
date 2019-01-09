<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.yadjm.rec.*
	,	chosun.ciis.hd.yadjm.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_YADJM_2014_1214_LDataSet ds = (HD_YADJM_2014_1214_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			HD_YADJM_2014_1214_LCURLIST3Record rec = (HD_YADJM_2014_1214_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "faml_flnm", rec.faml_flnm);
			//rx.add(record, "faml_flnm", StringUtil.replaceToXml(rec.faml_flnm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_YADJM_2014_1214_LCURLIST2Record rec = (HD_YADJM_2014_1214_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			//rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_YADJM_2014_1214_LCURLIST1Record rec = (HD_YADJM_2014_1214_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			//rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_YADJM_2014_1214_LCURLISTRecord rec = (HD_YADJM_2014_1214_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "ern", rec.ern);
			rx.add(record, "firmnm", rec.firmnm);
			rx.add(record, "dona_plac_clsf", rec.dona_plac_clsf);
			rx.add(record, "dona_yymm", rec.dona_yymm);
			rx.add(record, "dona_ptcr_noit", rec.dona_ptcr_noit);
			rx.add(record, "dona_ptcr_amt", rec.dona_ptcr_amt);
			rx.add(record, "rmks", rec.rmks);
			rx.add(record, "rshp", rec.rshp);
			rx.add(record, "obj_pers_flnm", rec.obj_pers_flnm);
			rx.add(record, "prn", rec.prn);
			rx.add(record, "corr_txn_prd_dduc_amt", rec.corr_txn_prd_dduc_amt);
			rx.add(record, "cyov_amt", rec.cyov_amt);
			rx.add(record, "lastyear_cyov_amt", rec.lastyear_cyov_amt);
			rx.add(record, "seq", rec.seq);
			//rx.add(record, "ern", StringUtil.replaceToXml(rec.ern));
			//rx.add(record, "firmnm", StringUtil.replaceToXml(rec.firmnm));
			//rx.add(record, "dona_plac_clsf", StringUtil.replaceToXml(rec.dona_plac_clsf));
			//rx.add(record, "dona_yymm", StringUtil.replaceToXml(rec.dona_yymm));
			//rx.add(record, "dona_ptcr_noit", StringUtil.replaceToXml(rec.dona_ptcr_noit));
			//rx.add(record, "dona_ptcr_amt", StringUtil.replaceToXml(rec.dona_ptcr_amt));
			//rx.add(record, "rmks", StringUtil.replaceToXml(rec.rmks));
			//rx.add(record, "rshp", StringUtil.replaceToXml(rec.rshp));
			//rx.add(record, "obj_pers_flnm", StringUtil.replaceToXml(rec.obj_pers_flnm));
			//rx.add(record, "prn", StringUtil.replaceToXml(rec.prn));
			//rx.add(record, "corr_txn_prd_dduc_amt", StringUtil.replaceToXml(rec.corr_txn_prd_dduc_amt));
			//rx.add(record, "cyov_amt", StringUtil.replaceToXml(rec.cyov_amt));
			//rx.add(record, "lastyear_cyov_amt", StringUtil.replaceToXml(rec.lastyear_cyov_amt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
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
<hd_yadjm_2014_1214_l>
	<dataSet>
		<CURLIST3>
			<record>
				<faml_flnm/>
			</record>
		</CURLIST3>
	</dataSet>
</hd_yadjm_2014_1214_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_yadjm_2014_1214_l>
	<dataSet>
		<CURLIST2>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</CURLIST2>
	</dataSet>
</hd_yadjm_2014_1214_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_yadjm_2014_1214_l>
	<dataSet>
		<CURLIST1>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_yadjm_2014_1214_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_yadjm_2014_1214_l>
	<dataSet>
		<CURLIST>
			<record>
				<ern/>
				<firmnm/>
				<dona_plac_clsf/>
				<dona_yymm/>
				<dona_ptcr_noit/>
				<dona_ptcr_amt/>
				<rmks/>
				<rshp/>
				<obj_pers_flnm/>
				<prn/>
				<corr_txn_prd_dduc_amt/>
				<cyov_amt/>
				<lastyear_cyov_amt/>
				<seq/>
			</record>
		</CURLIST>
	</dataSet>
</hd_yadjm_2014_1214_l>
*/
%>

<% /* 작성시간 : Fri Jan 09 20:20:08 KST 2015 */ %>