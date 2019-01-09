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
	HD_AFFR_1002_LDataSet ds = (HD_AFFR_1002_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		//recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_1002_LCURLISTRecord rec = (HD_AFFR_1002_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			//int record = rx.add(recordSet, "record", "");
			rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
			rx.add(record, "proc_stat", rec.proc_stat);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "remk_adm", rec.remk_adm);
			rx.add(record, "real_preng_condo_nm", rec.real_preng_condo_nm);
			rx.add(record, "preng_condo_nm_1", rec.preng_condo_nm_1);
			rx.add(record, "preng_condo_nm_2", rec.preng_condo_nm_2);
			rx.add(record, "preng_no", rec.preng_no);
			rx.add(record, "use_frdt", rec.use_frdt);
			rx.add(record, "use_todt", rec.use_todt);
			rx.add(record, "cmpy_sply_use_yn", rec.cmpy_sply_use_yn);
			rx.add(record, "use_dds", rec.use_dds);
			rx.add(record, "guest_room_cnt", rec.guest_room_cnt);
			rx.add(record, "ptph_no", rec.ptph_no);
			rx.add(record, "tel_no", rec.tel_no);
			rx.add(record, "email_addr", rec.email_addr);
			rx.add(record, "use_pay_amt", rec.use_pay_amt);
			rx.add(record, "slf_burd_amt", rec.slf_burd_amt);
			rx.add(record, "cmpy_sply_amt", rec.cmpy_sply_amt);
			rx.add(record, "aplc_amt", rec.aplc_amt);
			rx.add(record, "slf_drbk_amt", rec.slf_drbk_amt);
			rx.add(record, "guest_room_fee_tot_amt", rec.guest_room_fee_tot_amt);
			rx.add(record, "send", "");
			//rx.add(record, "proc_stat_nm", StringUtil.replaceToXml(rec.proc_stat_nm));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			//rx.add(record, "remk_adm", StringUtil.replaceToXml(rec.remk_adm));
			//rx.add(record, "real_preng_condo_nm", StringUtil.replaceToXml(rec.real_preng_condo_nm));
			//rx.add(record, "preng_condo_nm_1", StringUtil.replaceToXml(rec.preng_condo_nm_1));
			//rx.add(record, "preng_condo_nm_2", StringUtil.replaceToXml(rec.preng_condo_nm_2));
			//rx.add(record, "preng_no", StringUtil.replaceToXml(rec.preng_no));
			//rx.add(record, "use_frdt", StringUtil.replaceToXml(rec.use_frdt));
			//rx.add(record, "use_todt", StringUtil.replaceToXml(rec.use_todt));
			//rx.add(record, "cmpy_sply_use_yn", StringUtil.replaceToXml(rec.cmpy_sply_use_yn));
			//rx.add(record, "use_dds", StringUtil.replaceToXml(rec.use_dds));
			//rx.add(record, "guest_room_cnt", StringUtil.replaceToXml(rec.guest_room_cnt));
			//rx.add(record, "ptph_no", StringUtil.replaceToXml(rec.ptph_no));
			//rx.add(record, "tel_no", StringUtil.replaceToXml(rec.tel_no));
			//rx.add(record, "email_addr", StringUtil.replaceToXml(rec.email_addr));
			//rx.add(record, "use_pay_amt", StringUtil.replaceToXml(rec.use_pay_amt));
			//rx.add(record, "slf_burd_amt", StringUtil.replaceToXml(rec.slf_burd_amt));
			//rx.add(record, "cmpy_sply_amt", StringUtil.replaceToXml(rec.cmpy_sply_amt));
			//rx.add(record, "slf_drbk_amt", StringUtil.replaceToXml(rec.slf_drbk_amt));
			//rx.add(record, "guest_room_fee_tot_amt", StringUtil.replaceToXml(rec.guest_room_fee_tot_amt));
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
<hd_affr_1002_l>
	<dataSet>
		<CURLIST>
			<record>
				<proc_stat_nm/>
				<remk/>
				<remk_adm/>
				<real_preng_condo_nm/>
				<preng_condo_nm_1/>
				<preng_condo_nm_2/>
				<preng_no/>
				<use_frdt/>
				<use_todt/>
				<cmpy_sply_use_yn/>
				<use_dds/>
				<guest_room_cnt/>
				<ptph_no/>
				<tel_no/>
				<email_addr/>
				<use_pay_amt/>
				<slf_burd_amt/>
				<cmpy_sply_amt/>
				<slf_drbk_amt/>
				<guest_room_fee_tot_amt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_affr_1002_l>
*/
%>

<% /* 작성시간 : Mon Dec 21 15:13:52 KST 2009 */ %>