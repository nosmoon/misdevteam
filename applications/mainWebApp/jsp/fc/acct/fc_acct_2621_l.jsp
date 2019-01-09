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
	System.out.println("---------------");
	
	RwXml rx = new RwXml();
	FC_ACCT_2621_LDataSet ds = (FC_ACCT_2621_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int gridData1 = 0;
	int gridData2 = 0;
	long inamt1 = 0;
	long outamt1 = 0;
	long inamt2 = 0;
	long outamt2 = 0;
	long chk_inamt1 = 0;
	long chk_outamt1 = 0;
	long chk_inamt2 = 0;
	long chk_outamt2 = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	
	dataSet = rx.add(root, "tempData", "");
	gridData1 = rx.add(dataSet, "gridData1", "");	
	recordSet = rx.add(gridData1, "CURLIST", "");
	
	for(int i = 0; i < ds.curlist1.size(); i++) {
				
		FC_ACCT_2621_LCURLIST1Record rec = (FC_ACCT_2621_LCURLIST1Record)ds.curlist1.get(i);
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
		rx.add(record, "cfs_seq", rec.cfs_seq);
		rx.add(record, "clos_clsf", rec.clos_clsf);
		rx.add(record, "conn_grp", rec.conn_grp);
		rx.add(record, "conn_seq", rec.conn_seq);

		if(!rec.conn_seq.equals("0000000000")) {
			rx.add(record, "chk_yn", "Y");
			chk_inamt1 = chk_inamt1 + rec.crdt_amt;
			chk_outamt1 = chk_outamt1 + rec.dr_amt;
		} else {
			rx.add(record, "chk_yn", "N");
		}
		
		inamt1 = inamt1 + rec.crdt_amt;	//대변,수입
		outamt1 = outamt1 + rec.dr_amt;	//차변,비용
	}

	rx.add(recordSet, "inamt1", inamt1);
	rx.add(recordSet, "outamt1", outamt1);
	rx.add(recordSet, "chk_inamt1", chk_inamt1);
	rx.add(recordSet, "chk_outamt1", chk_outamt1);
	rx.add(recordSet, "totalcnt1", ds.curlist1.size());



	gridData2 = rx.add(dataSet, "gridData2", "");
	recordSet = rx.add(gridData2, "CURLIST", "");

	for(int i = 0; i < ds.curlist2.size(); i++) {
		FC_ACCT_2621_LCURLIST2Record rec = (FC_ACCT_2621_LCURLIST2Record)ds.curlist2.get(i);
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
		rx.add(record, "cfs_seq", rec.cfs_seq);
		rx.add(record, "clos_clsf", rec.clos_clsf);
		rx.add(record, "conn_grp", rec.conn_grp);
		rx.add(record, "conn_seq", rec.conn_seq);

		if(!rec.conn_seq.equals("0000000000")) {
			rx.add(record, "chk_yn", "Y");
			chk_inamt2 = chk_inamt2 + rec.crdt_amt;
			chk_outamt2 = chk_outamt2 + rec.dr_amt;
		} else {
			rx.add(record, "chk_yn", "N");
		}
		
		inamt2 = inamt2 + rec.crdt_amt;	//대변,수입
		outamt2 = outamt2 + rec.dr_amt;	//차변,비용
	}

	rx.add(recordSet, "inamt2", inamt2);
	rx.add(recordSet, "outamt2", outamt2);
	rx.add(recordSet, "chk_inamt2", chk_inamt2);
	rx.add(recordSet, "chk_outamt2", chk_outamt2);
	rx.add(recordSet, "totalcnt2", ds.curlist2.size());


	rx.add(dataSet, "errcode", errcode);
	rx.add(dataSet, "errmsg", errmsg);
	out.println(rx.xmlFlush());
	out.println(rx.xmlEndFlush());
	
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2621_l>
	<dataSet>
		<CURLIST2>
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
				<csf_seq/>
				<clos_clsf/>
				<conn_seq/>
				<budg_clsf_cd/>
			</record>
		</CURLIST2>
	</dataSet>
</fc_acct_2621_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2621_l>
	<dataSet>
		<CURLIST1>
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
				<csf_seq/>
				<clos_clsf/>
				<conn_seq/>
				<budg_clsf_cd/>
			</record>
		</CURLIST1>
	</dataSet>
</fc_acct_2621_l>
*/
%>

<% /* 작성시간 : Wed Dec 17 11:31:23 KST 2014 */ %>