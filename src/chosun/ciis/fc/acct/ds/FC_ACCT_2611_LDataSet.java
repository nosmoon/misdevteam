/***************************************************************************************************
* 파일명 : .java
* 기능 : 연결재무제표-내부거래대상 조회
* 작성일자 : 2014.11.20
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


public class FC_ACCT_2611_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long inamt;
	public long outamt;
	public long cfsinamt;
	public long cfsoutamt;
	public long tax_inamt;
	public long tax_outamt;

	public FC_ACCT_2611_LDataSet(){}
	public FC_ACCT_2611_LDataSet(String errcode, String errmsg, long inamt, long outamt, long cfsinamt, long cfsoutamt, long tax_inamt, long tax_outamt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.inamt = inamt;
		this.outamt = outamt;
		this.cfsinamt = cfsinamt;
		this.cfsoutamt = cfsoutamt;
		this.tax_inamt = tax_inamt;
		this.tax_outamt = tax_outamt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setInamt(long inamt){
		this.inamt = inamt;
	}

	public void setOutamt(long outamt){
		this.outamt = outamt;
	}

	public void setCfsinamt(long cfsinamt){
		this.cfsinamt = cfsinamt;
	}

	public void setCfsoutamt(long cfsoutamt){
		this.cfsoutamt = cfsoutamt;
	}

	public void setTax_inamt(long tax_inamt){
		this.tax_inamt = tax_inamt;
	}

	public void setTax_outamt(long tax_outamt){
		this.tax_outamt = tax_outamt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getInamt(){
		return this.inamt;
	}

	public long getOutamt(){
		return this.outamt;
	}

	public long getCfsinamt(){
		return this.cfsinamt;
	}

	public long getCfsoutamt(){
		return this.cfsoutamt;
	}

	public long getTax_inamt(){
		return this.tax_inamt;
	}

	public long getTax_outamt(){
		return this.tax_outamt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			FC_ACCT_2611_LCURLISTRecord rec = new FC_ACCT_2611_LCURLISTRecord();
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
		this.inamt = cstmt.getLong(14);
		this.outamt = cstmt.getLong(15);
		this.cfsinamt = cstmt.getLong(16);
		this.cfsoutamt = cstmt.getLong(17);
		this.tax_inamt = cstmt.getLong(18);
		this.tax_outamt = cstmt.getLong(19);
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2611_LDataSet ds = (FC_ACCT_2611_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2611_LCURLISTRecord curlistRec = (FC_ACCT_2611_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getInamt()%>
<%= ds.getOutamt()%>
<%= ds.getCfsinamt()%>
<%= ds.getCfsoutamt()%>
<%= ds.getTax_inamt()%>
<%= ds.getTax_outamt()%>
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


/* 작성시간 : Tue Dec 02 16:43:37 KST 2014 */