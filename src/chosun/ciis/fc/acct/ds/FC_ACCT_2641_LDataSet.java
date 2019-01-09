/***************************************************************************************************
* 파일명 : .java
* 기능 : 연결재무제표-채권채무 확정대상연결 (목록조회)
* 작성일자 : 2015.01.05
* 작성자 : 이혁
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.fc.acct.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_2641_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList grplist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2641_LDataSet(){}
	public FC_ACCT_2641_LDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(19);
		while(rset0.next()){
			FC_ACCT_2641_LCURLIST1Record rec = new FC_ACCT_2641_LCURLIST1Record();
			rec.fisc_dt = Util.checkString(rset0.getString("fisc_dt"));
			rec.slip_no = Util.checkString(rset0.getString("slip_no"));
			rec.rmks = Util.checkString(rset0.getString("rmks"));
			rec.dr_amt = rset0.getInt("dr_amt");
			rec.crdt_amt = rset0.getInt("crdt_amt");
			rec.mang_clsf_cd_nm = Util.checkString(rset0.getString("mang_clsf_cd_nm"));
			rec.mang_no = Util.checkString(rset0.getString("mang_no"));
			rec.clas_nm = Util.checkString(rset0.getString("clas_nm"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.budg_nm = Util.checkString(rset0.getString("budg_nm"));
			rec.acct_cd = Util.checkString(rset0.getString("acct_cd"));
			rec.acct_nm = Util.checkString(rset0.getString("acct_nm"));
			rec.dlco_clsf_cd_nm = Util.checkString(rset0.getString("dlco_clsf_cd_nm"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.boks_dlco_nm = Util.checkString(rset0.getString("boks_dlco_nm"));
			rec.medi_cd_nm = Util.checkString(rset0.getString("medi_cd_nm"));
			rec.dtls_medi_cdnm = Util.checkString(rset0.getString("dtls_medi_cdnm"));
			rec.evnt_cd_nm = Util.checkString(rset0.getString("evnt_cd_nm"));
			rec.clam_dept_cd_nm = Util.checkString(rset0.getString("clam_dept_cd_nm"));
			rec.obj_acct_cd_nm = Util.checkString(rset0.getString("obj_acct_cd_nm"));
			rec.obj_amt = rset0.getInt("obj_amt");
			rec.bank_cd = Util.checkString(rset0.getString("bank_cd"));
			rec.bank_cd_nm = Util.checkString(rset0.getString("bank_cd_nm"));
			rec.cfs_seq = Util.checkString(rset0.getString("cfs_seq"));
			rec.clos_clsf = Util.checkString(rset0.getString("clos_clsf"));
			rec.conn_grp = Util.checkString(rset0.getString("conn_grp"));
			rec.conn_seq = Util.checkString(rset0.getString("conn_seq"));
			rec.budg_clsf_cd = Util.checkString(rset0.getString("budg_clsf_cd"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(20);
		while(rset1.next()){
			FC_ACCT_2641_LCURLIST2Record rec = new FC_ACCT_2641_LCURLIST2Record();
			rec.fisc_dt = Util.checkString(rset1.getString("fisc_dt"));
			rec.slip_no = Util.checkString(rset1.getString("slip_no"));
			rec.rmks = Util.checkString(rset1.getString("rmks"));
			rec.dr_amt = rset1.getInt("dr_amt");
			rec.crdt_amt = rset1.getInt("crdt_amt");
			rec.mang_clsf_cd_nm = Util.checkString(rset1.getString("mang_clsf_cd_nm"));
			rec.mang_no = Util.checkString(rset1.getString("mang_no"));
			rec.clas_nm = Util.checkString(rset1.getString("clas_nm"));
			rec.budg_cd = Util.checkString(rset1.getString("budg_cd"));
			rec.budg_nm = Util.checkString(rset1.getString("budg_nm"));
			rec.acct_cd = Util.checkString(rset1.getString("acct_cd"));
			rec.acct_nm = Util.checkString(rset1.getString("acct_nm"));
			rec.dlco_clsf_cd_nm = Util.checkString(rset1.getString("dlco_clsf_cd_nm"));
			rec.dlco_cd = Util.checkString(rset1.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset1.getString("dlco_nm"));
			rec.boks_dlco_nm = Util.checkString(rset1.getString("boks_dlco_nm"));
			rec.medi_cd_nm = Util.checkString(rset1.getString("medi_cd_nm"));
			rec.dtls_medi_cdnm = Util.checkString(rset1.getString("dtls_medi_cdnm"));
			rec.evnt_cd_nm = Util.checkString(rset1.getString("evnt_cd_nm"));
			rec.clam_dept_cd_nm = Util.checkString(rset1.getString("clam_dept_cd_nm"));
			rec.obj_acct_cd_nm = Util.checkString(rset1.getString("obj_acct_cd_nm"));
			rec.obj_amt = rset1.getInt("obj_amt");
			rec.bank_cd = Util.checkString(rset1.getString("bank_cd"));
			rec.bank_cd_nm = Util.checkString(rset1.getString("bank_cd_nm"));
			rec.cfs_seq = Util.checkString(rset1.getString("cfs_seq"));
			rec.clos_clsf = Util.checkString(rset1.getString("clos_clsf"));
			rec.conn_grp = Util.checkString(rset1.getString("conn_grp"));
			rec.conn_seq = Util.checkString(rset1.getString("conn_seq"));
			rec.budg_clsf_cd = Util.checkString(rset1.getString("budg_clsf_cd"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(21);
		while(rset2.next()){
			FC_ACCT_2641_LGRPLISTRecord rec = new FC_ACCT_2641_LGRPLISTRecord();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.nm = Util.checkString(rset2.getString("nm"));
			this.grplist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2641_LDataSet ds = (FC_ACCT_2641_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_ACCT_2641_LCURLIST1Record curlist1Rec = (FC_ACCT_2641_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		FC_ACCT_2641_LCURLIST2Record curlist2Rec = (FC_ACCT_2641_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.grplist.size(); i++){
		FC_ACCT_2641_LGRPLISTRecord grplistRec = (FC_ACCT_2641_LGRPLISTRecord)ds.grplist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getGrplist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.fisc_dt%>
<%= curlist1Rec.slip_no%>
<%= curlist1Rec.rmks%>
<%= curlist1Rec.dr_amt%>
<%= curlist1Rec.crdt_amt%>
<%= curlist1Rec.mang_clsf_cd_nm%>
<%= curlist1Rec.mang_no%>
<%= curlist1Rec.clas_nm%>
<%= curlist1Rec.budg_cd%>
<%= curlist1Rec.budg_nm%>
<%= curlist1Rec.acct_cd%>
<%= curlist1Rec.acct_nm%>
<%= curlist1Rec.dlco_clsf_cd_nm%>
<%= curlist1Rec.dlco_cd%>
<%= curlist1Rec.dlco_nm%>
<%= curlist1Rec.boks_dlco_nm%>
<%= curlist1Rec.medi_cd_nm%>
<%= curlist1Rec.dtls_medi_cdnm%>
<%= curlist1Rec.evnt_cd_nm%>
<%= curlist1Rec.clam_dept_cd_nm%>
<%= curlist1Rec.obj_acct_cd_nm%>
<%= curlist1Rec.obj_amt%>
<%= curlist1Rec.bank_cd%>
<%= curlist1Rec.bank_cd_nm%>
<%= curlist1Rec.cfs_seq%>
<%= curlist1Rec.clos_clsf%>
<%= curlist1Rec.conn_grp%>
<%= curlist1Rec.conn_seq%>
<%= curlist1Rec.budg_clsf_cd%>
<%= curlist2Rec.fisc_dt%>
<%= curlist2Rec.slip_no%>
<%= curlist2Rec.rmks%>
<%= curlist2Rec.dr_amt%>
<%= curlist2Rec.crdt_amt%>
<%= curlist2Rec.mang_clsf_cd_nm%>
<%= curlist2Rec.mang_no%>
<%= curlist2Rec.clas_nm%>
<%= curlist2Rec.budg_cd%>
<%= curlist2Rec.budg_nm%>
<%= curlist2Rec.acct_cd%>
<%= curlist2Rec.acct_nm%>
<%= curlist2Rec.dlco_clsf_cd_nm%>
<%= curlist2Rec.dlco_cd%>
<%= curlist2Rec.dlco_nm%>
<%= curlist2Rec.boks_dlco_nm%>
<%= curlist2Rec.medi_cd_nm%>
<%= curlist2Rec.dtls_medi_cdnm%>
<%= curlist2Rec.evnt_cd_nm%>
<%= curlist2Rec.clam_dept_cd_nm%>
<%= curlist2Rec.obj_acct_cd_nm%>
<%= curlist2Rec.obj_amt%>
<%= curlist2Rec.bank_cd%>
<%= curlist2Rec.bank_cd_nm%>
<%= curlist2Rec.cfs_seq%>
<%= curlist2Rec.clos_clsf%>
<%= curlist2Rec.conn_grp%>
<%= curlist2Rec.conn_seq%>
<%= curlist2Rec.budg_clsf_cd%>
<%= grplistRec.cd%>
<%= grplistRec.nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 05 17:39:06 KST 2015 */