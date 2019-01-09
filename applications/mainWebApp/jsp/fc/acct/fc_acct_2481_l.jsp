<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	, java.lang.String.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
    ,   chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_2481_LDataSet ds = (FC_ACCT_2481_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");
		long dr_amt_sum = 0;
		long crdt_amt_sum = 0;
		for(int i = 0; i < ds.curlist.size(); i++) {
			FC_ACCT_2481_LCURLISTRecord rec = (FC_ACCT_2481_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "budg_cd_nm", StringUtil.replaceToXml(rec.budg_cd_nm));
			rx.add(record, "fisc_dt", rec.fisc_dt);
			rx.add(record, "slip_no", rec.slip_occr_dt+"-"+rec.slip_clsf_cd+"-"+rec.slip_seq+"-"+rec.slip_sub_seq+"-"+rec.slip_arow_no);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "slip_sub_seq", rec.slip_sub_seq);
			rx.add(record, "slip_arow_no", rec.slip_arow_no);
			rx.add(record, "rmks1", StringUtil.replaceToXml(rec.rmks1));
			rx.add(record, "rmks2", StringUtil.replaceToXml(rec.rmks2));
			rx.add(record, "dr_amt", rec.dr_amt);
			rx.add(record, "crdt_amt", rec.crdt_amt);
			rx.add(record, "mang_clsf_cd", rec.mang_clsf_cd);
			rx.add(record, "mang_clsf_cd_nm", StringUtil.replaceToXml(rec.mang_clsf_cd_nm));
			rx.add(record, "mang_no", rec.mang_no);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_clsf_cd_nm", rec.dlco_clsf_cd_nm);
			rx.add(record, "dlco_cd", rec.dlco_cd);
            rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
            rx.add(record, "boks_dlco_nm", StringUtil.replaceToXml(rec.boks_dlco_nm));
			rx.add(record, "medi_cd", rec.medi_cd);//매체코드
			rx.addCData(record, "medi_cd_nm", rec.medi_cd+"  "+rec.medi_cd_nm); //매체코드+매체명
			rx.add(record, "dtls_medi_cd", rec.dtls_medi_cd); //상세매체코드
			rx.addCData(record, "dtls_medi_cdnm", rec.dtls_medi_cd+"  "+rec.dtls_medi_cdnm); //상세매체코드+상세매체코드명
			rx.add(record, "prop_equip_cd", rec.prop_equip_cd);
			rx.add(record, "use_dept_cd", rec.use_dept_cd);
			rx.add(record, "evnt_cd", rec.evnt_cd);
			rx.add(record, "evnt_cd_nm", StringUtil.replaceToXml(rec.evnt_cd_nm));
			rx.add(record, "obj_amt", rec.obj_amt);
			rx.add(record, "clam_dept_cd_nm", StringUtil.replaceToXml(rec.clam_dept_cd_nm));
			rx.add(record, "obj_acct_cd_nm", rec.obj_acct_cd_nm);
			rx.add(record, "incm_clsf_cd_nm", rec.incm_clsf_cd_nm);
			rx.add(record, "chnl_clsf_cd", rec.chnl_clsf_cd);
						
			

			dr_amt_sum	=	dr_amt_sum + Long.parseLong(rec.dr_amt);
			crdt_amt_sum = crdt_amt_sum + Long.parseLong(rec.crdt_amt);
						
		}

		/****** CURLIST END */
		rx.add(recordSet, "totalcnt", ds.curlist.size());		
		rx.add(dataSet, "dr_amt_sum", dr_amt_sum);
		rx.add(dataSet, "crdt_amt_sum", crdt_amt_sum);
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
			<budg_cd/>
			<budg_cd_nm/>
			<fisc_dt/>
			<slip_occr_dt/>
			<slip_clsf_cd/>
			<slip_seq/>
			<slip_sub_seq/>
			<slip_arow_no/>
			<rmks1/>
			<rmks2/>
			<dr_amt/>
			<crdt_amt/>
			<mang_clsf_cd/>
			<mang_clsf_cd_nm/>
			<mang_no/>
			<dlco_clsf_cd/>
			<dlco_clsf_cd_nm/>
			<dlco_cd/>
			<dlco_nm/>
			<boks_dlco_nm/>
			<medi_cd/>
			<medi_cd_nm/>
			<prop_equip_cd/>
			<use_dept_cd/>
			<evnt_cd/>
			<evnt_cd_nm/>
			<obj_amt/>
			<clam_dept_cd_nm/>
			<obj_acct_cd_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 03 19:51:13 KST 2009 */ %>