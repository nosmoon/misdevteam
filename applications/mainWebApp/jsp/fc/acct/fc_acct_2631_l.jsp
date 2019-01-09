<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_2631_LDataSet ds = (FC_ACCT_2631_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	
	dataSet = rx.add(root, "tempData", "");

		recordSet = rx.add(dataSet, "CURLIST", "");
		
		for(int i = 0; i < ds.curlist.size(); i++) {
				
			FC_ACCT_2631_LCURLISTRecord rec = (FC_ACCT_2631_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "fisc_dt", rec.fisc_dt);
			rx.add(record, "slip_no", rec.slip_no);
			rx.addCData(record, "rmks", rec.rmks);			
			rx.add(record, "dr_amt", rec.dr_amt);
			rx.add(record, "crdt_amt", rec.crdt_amt);
			rx.add(record, "mang_clsf_cd_nm", rec.mang_clsf_cd_nm);
			rx.add(record, "mang_no", rec.mang_no);
			rx.add(record, "clas_nm", rec.clas_nm);
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "budg_nm", rec.budg_nm);
			rx.add(record, "acct_cd", rec.acct_cd);
			rx.add(record, "acct_nm", rec.acct_nm);
			rx.add(record, "dlco_clsf_cd_nm", rec.dlco_clsf_cd_nm);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "boks_dlco_nm", rec.boks_dlco_nm);
			rx.add(record, "medi_cd_nm", rec.medi_cd_nm);
			rx.add(record, "dtls_medi_cdnm", rec.dtls_medi_cdnm);
			rx.add(record, "evnt_cd_nm", rec.evnt_cd_nm);
			rx.add(record, "clam_dept_cd_nm", rec.clam_dept_cd_nm);
			rx.add(record, "obj_acct_cd_nm", rec.obj_acct_cd_nm);
			rx.add(record, "obj_amt", rec.obj_amt);
			rx.add(record, "bank_cd", rec.bank_cd);
			rx.add(record, "bank_cd_nm", rec.bank_cd_nm);
			rx.add(record, "cfsobj_seq", rec.cfsobj_seq);
			rx.add(record, "clos_clsf", rec.clos_clsf);

			if(!rec.cfsobj_seq.equals("")) {
				rx.add(record, "chk_yn", "Y");
			} else {
				rx.add(record, "chk_yn", "N");
			}
			
			rx.add(record, "new_clsf", "");
		}
		rx.add(recordSet, "tot_dr_amt", ds.getTot_dr_amt());
		rx.add(recordSet, "tot_crdt_amt", ds.getTot_crdt_amt());
		rx.add(recordSet, "tot_diff_amt", ds.getTot_diff_amt());
		rx.add(recordSet, "chk_dr_amt", ds.getChk_dr_amt());
		rx.add(recordSet, "chk_crdt_amt", ds.getChk_crdt_amt());
		rx.add(recordSet, "chk_diff_amt", ds.getChk_diff_amt());
		rx.add(recordSet, "max_closym", ds.getMax_closym());
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		
		rx.add(dataSet, "errcode", errcode);
		rx.add(dataSet, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
		
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2631_l>
	<dataSet>
		<CURLIST>
			<record>
				<fisc_dt/>
				<slip_no/>
				<rmks/>
				<dr_amt/>
				<crdt_amt/>
				<mang_clsf_cd_nm/>
				<mang_no/>
				<clas_nm/>
				<budg_cd/>
				<budg_nm/>
				<acct_cd/>
				<acct_nm/>
				<dlco_clsf_cd_nm/>
				<dlco_cd/>
				<dlco_nm/>
				<boks_dlco_nm/>
				<medi_cd_nm/>
				<dtls_medi_cdnm/>
				<evnt_cd_nm/>
				<clam_dept_cd_nm/>
				<obj_acct_cd_nm/>
				<obj_amt/>
				<bank_cd/>
				<bank_cd_nm/>
				<cfsobj_seq/>
				<clos_clsf/>
				<budg_clsf_cd/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_2631_l>
*/
%>

<% /* 작성시간 : Mon Dec 29 10:57:40 KST 2014 */ %>