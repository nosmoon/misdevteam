<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.affr.rec.*
	,	chosun.ciis.hd.affr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_AFFR_3902_LDataSet ds = (HD_AFFR_3902_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */


		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_3902_LCURLISTRecord rec = (HD_AFFR_3902_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "aplc_dt", rec.aplc_dt);
			rx.addCData(record, "acq_pers", rec.acq_pers);
			rx.add(record, "start_plac", rec.start_plac);
			rx.add(record, "ariv_plac", rec.ariv_plac);
			rx.addCData(record, "use_purp", rec.use_purp);
			rx.addCData(record, "cont_item", rec.cont_item);
			rx.addCData(record, "remk", rec.remk);
			rx.add(record, "aplc_cnfm_yn", rec.aplc_cnfm_yn);
			rx.add(record, "aplc_cnfm_ynnm", rec.aplc_cnfm_ynnm);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "aplc_dt", StringUtil.replaceToXml(rec.aplc_dt));
			//rx.add(record, "acq_pers", StringUtil.replaceToXml(rec.acq_pers));
			//rx.add(record, "start_plac", StringUtil.replaceToXml(rec.start_plac));
			//rx.add(record, "ariv_plac", StringUtil.replaceToXml(rec.ariv_plac));
			//rx.add(record, "use_purp", StringUtil.replaceToXml(rec.use_purp));
			//rx.add(record, "cont_item", StringUtil.replaceToXml(rec.cont_item));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			//rx.add(record, "aplc_cnfm_yn", StringUtil.replaceToXml(rec.aplc_cnfm_yn));
			//rx.add(record, "aplc_cnfm_ynnm", StringUtil.replaceToXml(rec.aplc_cnfm_ynnm));
		}
		rx.add(dataSet, "totalcnt", ds.curlist.size());
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
<hd_affr_3902_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<emp_no/>
				<occr_dt/>
				<seq/>
				<flnm/>
				<dept_cd/>
				<dept_nm/>
				<aplc_dt/>
				<acq_pers/>
				<start_plac/>
				<ariv_plac/>
				<use_purp/>
				<cont_item/>
				<remk/>
				<aplc_cnfm_yn/>
				<aplc_cnfm_ynnm/>
			</record>
		</CURLIST>
	</dataSet>
</hd_affr_3902_l>
*/
%>

<% /* 작성시간 : Tue Dec 11 09:50:47 KST 2018 */ %>