<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.affr.rec.*
	,	chosun.ciis.hd.affr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_AFFR_1200_LDataSet ds = (HD_AFFR_1200_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");
	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_1200_LCURLISTRecord rec = (HD_AFFR_1200_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "aplc_dt", rec.aplc_dt);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "preng_condo_nm_1", rec.preng_condo_nm_1);
			rx.add(record, "preng_condo_nm_2", rec.preng_condo_nm_2);
			rx.add(record, "real_preng_condo_nm", rec.real_preng_condo_nm);
			rx.add(record, "preng_no", rec.preng_no);
			rx.add(record, "use_frdt", rec.use_frdt);
			rx.add(record, "use_todt", rec.use_todt);
			rx.add(record, "use_dds", rec.use_dds);
			rx.add(record, "guest_room_cnt", rec.guest_room_cnt);
			rx.add(record, "cmpy_sply_use_yn", rec.cmpy_sply_use_yn);
			rx.add(record, "ptph_no", rec.ptph_no);
			rx.add(record, "tel_no", rec.tel_no);
			rx.add(record, "email_addr", rec.email_addr);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "use_pay_amt", rec.use_pay_amt);
			rx.add(record, "slf_burd_amt", rec.slf_burd_amt);
			rx.add(record, "cmpy_sply_amt", rec.cmpy_sply_amt);
			rx.add(record, "slf_drbk_amt", rec.slf_drbk_amt);
			rx.add(record, "guest_room_fee_tot_amt", rec.guest_room_fee_tot_amt);
			rx.add(record, "noti_yn", rec.noti_yn);
			rx.add(record, "drbk_obj_yn", rec.drbk_obj_yn);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "preng_condo_area_cd_1", rec.preng_condo_area_cd_1);
			rx.add(record, "preng_condo_cd_1", rec.preng_condo_cd_1);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "proc_stat", rec.proc_stat);
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
<dataSet>
	<CURLIST>
		<record>
			<aplc_dt/>
			<emp_no/>
			<flnm/>
			<dept_cd/>
			<dept_nm/>
			<dty_cd/>
			<dty_nm/>
			<posi_cd/>
			<posi_nm/>
			<preng_condo_nm_1/>
			<preng_condo_nm_2/>
			<real_preng_condo_nm/>
			<preng_no/>
			<use_frdt/>
			<use_todt/>
			<cmpy_sply_use_yn/>
			<use_dds/>
			<ptph_no/>
			<tel_no/>
			<email_addr/>
			<remk/>
			<use_pay_amt/>
			<slf_burd_amt/>
			<cmpy_sply_amt/>
			<slf_drbk_amt/>
			<guest_room_fee_tot_amt/>
			<noti_yn/>
			<drbk_obj_yn/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 10 17:32:53 KST 2009 */ %>