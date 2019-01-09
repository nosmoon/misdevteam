/***************************************************************************************************
* 파일명 : .java
* 기능 : 연결재무제표-내부거래관리 목록조회(건별조회)
* 작성일자 : 2014.12.04
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


public class FC_ACCT_2614_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2614_LDataSet(){}
	public FC_ACCT_2614_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_ACCT_2614_LCURLISTRecord rec = new FC_ACCT_2614_LCURLISTRecord();
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
			rec.cfsobj_seq = Util.checkString(rset0.getString("cfsobj_seq"));
			rec.clos_clsf = Util.checkString(rset0.getString("clos_clsf"));
			rec.budg_clsf_cd = Util.checkString(rset0.getString("budg_clsf_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2614_LDataSet ds = (FC_ACCT_2614_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2614_LCURLISTRecord curlistRec = (FC_ACCT_2614_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.fisc_dt%>
<%= curlistRec.slip_no%>
<%= curlistRec.rmks%>
<%= curlistRec.dr_amt%>
<%= curlistRec.crdt_amt%>
<%= curlistRec.mang_clsf_cd_nm%>
<%= curlistRec.mang_no%>
<%= curlistRec.clas_nm%>
<%= curlistRec.budg_cd%>
<%= curlistRec.budg_nm%>
<%= curlistRec.acct_cd%>
<%= curlistRec.acct_nm%>
<%= curlistRec.dlco_clsf_cd_nm%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.boks_dlco_nm%>
<%= curlistRec.medi_cd_nm%>
<%= curlistRec.dtls_medi_cdnm%>
<%= curlistRec.evnt_cd_nm%>
<%= curlistRec.clam_dept_cd_nm%>
<%= curlistRec.obj_acct_cd_nm%>
<%= curlistRec.obj_amt%>
<%= curlistRec.bank_cd%>
<%= curlistRec.bank_cd_nm%>
<%= curlistRec.cfsobj_seq%>
<%= curlistRec.clos_clsf%>
<%= curlistRec.budg_clsf_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Dec 04 15:01:05 KST 2014 */