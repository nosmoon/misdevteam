<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.evlu.rec.*
	,	chosun.ciis.hd.evlu.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_EVLU_5903_LDataSet ds = (HD_EVLU_5903_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");
//	String  tot_evlu = ds.tot_evlu;
	
	int tot_evlu = rx.add(dataSet, "tot_evlu", ds.tot_evlu);	
	System.out.println(" tot_evlu : " + tot_evlu);
	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_EVLU_5903_LCURLISTRecord rec = (HD_EVLU_5903_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "cmpy_cd", rec.cmpy_cd);
			//rx.add(record, "evlu_yy", rec.evlu_yy);
			//rx.add(record, "tms_clsf", rec.tms_clsf);
			//rx.add(record, "tgt_evlu_pers_emp_no", rec.tgt_evlu_pers_emp_no);
			rx.add(record, "evlu_subj_cd", rec.evlu_subj_cd);
			rx.add(record, "evlu_subj_nm", rec.evlu_subj_nm);
			rx.add(record, "evlu_item_cd", rec.evlu_item_cd);
			rx.add(record, "evlu_item_nm", rec.evlu_item_nm);
			rx.add(record, "viewpoint", rec.viewpoint);
			rx.add(record, "t1_cd", rec.t1_cd);
			rx.add(record, "t1_scor", rec.t1_scor);
			rx.add(record, "t1_chk", rec.t1_chk);
			rx.add(record, "t2_cd", rec.t2_cd);
			rx.add(record, "t2_scor", rec.t2_scor);
			rx.add(record, "t2_chk", rec.t2_chk);
			rx.add(record, "t3_cd", rec.t3_cd);
			rx.add(record, "t3_scor", rec.t3_scor);
			rx.add(record, "t3_chk", rec.t3_chk);
			rx.add(record, "t4_cd", rec.t4_cd);
			rx.add(record, "t4_scor", rec.t4_scor);
			rx.add(record, "t4_chk", rec.t4_chk);
			rx.add(record, "t5_cd", rec.t5_cd);
			rx.add(record, "t5_scor", rec.t5_scor);
			rx.add(record, "t5_chk", rec.t5_chk);
			rx.add(record, "t6_cd", rec.t6_cd);
			rx.add(record, "t6_scor", rec.t6_scor);
			rx.add(record, "t6_chk", rec.t6_chk);
			rx.add(record, "t7_cd", rec.t7_cd);
			rx.add(record, "t7_scor", rec.t7_scor);
			rx.add(record, "t7_chk", rec.t7_chk);
			rx.add(record, "t_opn", rec.t_opn);
			rx.add(record, "scr", "");
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "evlu_yy", StringUtil.replaceToXml(rec.evlu_yy));
			//rx.add(record, "tms_clsf", StringUtil.replaceToXml(rec.tms_clsf));
			//rx.add(record, "tgt_evlu_pers_emp_no", StringUtil.replaceToXml(rec.tgt_evlu_pers_emp_no));
			//rx.add(record, "evlu_subj_cd", StringUtil.replaceToXml(rec.evlu_subj_cd));
			//rx.add(record, "evlu_subj_nm", StringUtil.replaceToXml(rec.evlu_subj_nm));
			//rx.add(record, "evlu_item_cd", StringUtil.replaceToXml(rec.evlu_item_cd));
			//rx.add(record, "evlu_item_nm", StringUtil.replaceToXml(rec.evlu_item_nm));
			//rx.add(record, "viewpoint", StringUtil.replaceToXml(rec.viewpoint));
			//rx.add(record, "t1_cd", StringUtil.replaceToXml(rec.t1_cd));
			//rx.add(record, "t1_scor", StringUtil.replaceToXml(rec.t1_scor));
			//rx.add(record, "t1_chk", StringUtil.replaceToXml(rec.t1_chk));
			//rx.add(record, "t2_cd", StringUtil.replaceToXml(rec.t2_cd));
			//rx.add(record, "t2_scor", StringUtil.replaceToXml(rec.t2_scor));
			//rx.add(record, "t2_chk", StringUtil.replaceToXml(rec.t2_chk));
			//rx.add(record, "t3_cd", StringUtil.replaceToXml(rec.t3_cd));
			//rx.add(record, "t3_scor", StringUtil.replaceToXml(rec.t3_scor));
			//rx.add(record, "t3_chk", StringUtil.replaceToXml(rec.t3_chk));
			//rx.add(record, "t4_cd", StringUtil.replaceToXml(rec.t4_cd));
			//rx.add(record, "t4_scor", StringUtil.replaceToXml(rec.t4_scor));
			//rx.add(record, "t4_chk", StringUtil.replaceToXml(rec.t4_chk));
			//rx.add(record, "t5_cd", StringUtil.replaceToXml(rec.t5_cd));
			//rx.add(record, "t5_scor", StringUtil.replaceToXml(rec.t5_scor));
			//rx.add(record, "t5_chk", StringUtil.replaceToXml(rec.t5_chk));
			//rx.add(record, "t6_cd", StringUtil.replaceToXml(rec.t6_cd));
			//rx.add(record, "t6_scor", StringUtil.replaceToXml(rec.t6_scor));
			//rx.add(record, "t6_chk", StringUtil.replaceToXml(rec.t6_chk));
			//rx.add(record, "t7_cd", StringUtil.replaceToXml(rec.t7_cd));
			//rx.add(record, "t7_scor", StringUtil.replaceToXml(rec.t7_scor));
			//rx.add(record, "t7_chk", StringUtil.replaceToXml(rec.t7_chk));
			//rx.add(record, "t_opn", StringUtil.replaceToXml(rec.t_opn));
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
<hd_evlu_5903_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<evlu_yy/>
				<tms_clsf/>
				<tgt_evlu_pers_emp_no/>
				<evlu_subj_cd/>
				<evlu_subj_nm/>
				<evlu_item_cd/>
				<evlu_item_nm/>
				<viewpoint/>
				<t1_cd/>
				<t1_scor/>
				<t1_chk/>
				<t2_cd/>
				<t2_scor/>
				<t2_chk/>
				<t3_cd/>
				<t3_scor/>
				<t3_chk/>
				<t4_cd/>
				<t4_scor/>
				<t4_chk/>
				<t5_cd/>
				<t5_scor/>
				<t5_chk/>
				<t6_cd/>
				<t6_scor/>
				<t6_chk/>
				<t7_cd/>
				<t7_scor/>
				<t7_chk/>
				<t_opn/>
			</record>
		</CURLIST>
	</dataSet>
</hd_evlu_5903_l>
*/
%>

<% /* 작성시간 : Tue Jun 09 13:59:00 KST 2009 */ %>