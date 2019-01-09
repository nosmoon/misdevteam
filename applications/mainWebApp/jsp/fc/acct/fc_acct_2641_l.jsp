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
	FC_ACCT_2641_LDataSet ds = (FC_ACCT_2641_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int gridData1 = 0;
	int gridData2 = 0;
	int	item	  = 0;
	
	//지배회사
	long amt40_1 = 0;			//채권합계
	long amt50_1 = 0;			//채무합계
	long chk_amt40_1 = 0;		//선택된 채권합계
	long chk_amt50_1 = 0;		//선택된 채무합	
	//종속회사
	long amt40_2 = 0;			//채권합계
	long amt50_2 = 0;			//채무합계
	long chk_amt40_2 = 0;		//선택된 채권합계
	long chk_amt50_2 = 0;		//선택된 채무합

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	
	dataSet = rx.add(root, "tempData", "");
	gridData1 = rx.add(dataSet, "gridData1", "");	
	recordSet = rx.add(gridData1, "CURLIST", "");
	
	for(int i = 0; i < ds.curlist1.size(); i++) {
				
		FC_ACCT_2641_LCURLIST1Record rec = (FC_ACCT_2641_LCURLIST1Record)ds.curlist1.get(i);
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
		rx.add(record, "budg_clsf_cd", rec.budg_clsf_cd);

		if(!rec.conn_seq.equals("0000000000")) {
			rx.add(record, "chk_yn", "Y");
			chk_amt40_1 = chk_amt40_1 + ((rec.budg_clsf_cd.equals("40")) ? rec.dr_amt + rec.crdt_amt : 0);	//채권합계
			chk_amt50_1 = chk_amt50_1 + ((rec.budg_clsf_cd.equals("50")) ? rec.dr_amt + rec.crdt_amt : 0);	//채무합계
			
		} else {
			rx.add(record, "chk_yn", "N");
		}
			
		amt40_1 = amt40_1 + ((rec.budg_clsf_cd.equals("40")) ? rec.dr_amt + rec.crdt_amt : 0);	//채권합계
		amt50_1 = amt50_1 + ((rec.budg_clsf_cd.equals("50")) ? rec.dr_amt + rec.crdt_amt : 0);	//채무합계

	}

	rx.add(recordSet, "amt40_1", amt40_1);
	rx.add(recordSet, "amt50_1", amt50_1);
	rx.add(recordSet, "chk_amt40_1", chk_amt40_1);
	rx.add(recordSet, "chk_amt50_1", chk_amt50_1);
	rx.add(recordSet, "totalcnt1", ds.curlist1.size());



	gridData2 = rx.add(dataSet, "gridData2", "");
	recordSet = rx.add(gridData2, "CURLIST", "");

	for(int i = 0; i < ds.curlist2.size(); i++) {
		FC_ACCT_2641_LCURLIST2Record rec = (FC_ACCT_2641_LCURLIST2Record)ds.curlist2.get(i);
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
		rx.add(record, "budg_clsf_cd", rec.budg_clsf_cd);

		if(!rec.conn_seq.equals("0000000000")) {
			rx.add(record, "chk_yn", "Y");
			chk_amt40_2 = chk_amt40_2 + ((rec.budg_clsf_cd.equals("40")) ? rec.dr_amt + rec.crdt_amt : 0);	//채권합계
			chk_amt50_2 = chk_amt50_2 + ((rec.budg_clsf_cd.equals("50")) ? rec.dr_amt + rec.crdt_amt : 0);	//채무합계

		} else {
			rx.add(record, "chk_yn", "N");
		}
		
		amt40_2 = amt40_2 + ((rec.budg_clsf_cd.equals("40")) ? rec.dr_amt + rec.crdt_amt : 0);	//채권합계
		amt50_2 = amt50_2 + ((rec.budg_clsf_cd.equals("50")) ? rec.dr_amt + rec.crdt_amt : 0);	//채무합계
		
	}

	rx.add(recordSet, "amt40_2", amt40_2);
	rx.add(recordSet, "amt50_2", amt50_2);
	rx.add(recordSet, "chk_amt40_2", chk_amt40_2);
	rx.add(recordSet, "chk_amt50_2", chk_amt50_2);
		
	rx.add(recordSet, "totalcnt2", ds.curlist2.size());

	int combo_grp = rx.add(dataSet, "combo_grp", "");
	for(int i = 0; i < ds.grplist.size(); i++) {
		FC_ACCT_2641_LGRPLISTRecord rec = (FC_ACCT_2641_LGRPLISTRecord)ds.grplist.get(i);
			
		item  = rx.add( combo_grp, "item" , "");
		rx.add ( item, "value", rec.cd );
		rx.add ( item, "label", rec.nm );
	}
		
	rx.add(dataSet, "errcode", errcode);
	rx.add(dataSet, "errmsg", errmsg);
	out.println(rx.xmlFlush());
	out.println(rx.xmlEndFlush());
	
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2641_l>
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
</fc_acct_2641_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2641_l>
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
</fc_acct_2641_l>
*/
%>

<% /* 작성시간 : Wed Dec 17 11:31:23 KST 2014 */ %>