/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
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


public class FC_ACCT_2382_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2382_LDataSet(){}
	public FC_ACCT_2382_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			FC_ACCT_2382_LCURLISTRecord rec = new FC_ACCT_2382_LCURLISTRecord();
			rec.slip_arow_no = Util.checkString(rset0.getString("slip_arow_no"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.budg_nm = Util.checkString(rset0.getString("budg_nm"));
			rec.drcr_clsf = Util.checkString(rset0.getString("drcr_clsf"));
			rec.dr_amt = Util.checkString(rset0.getString("dr_amt"));
			rec.crdt_amt = Util.checkString(rset0.getString("crdt_amt"));
			rec.intg_dlco_cd = Util.checkString(rset0.getString("intg_dlco_cd"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.boks_dlco_nm = Util.checkString(rset0.getString("boks_dlco_nm"));
			rec.mang_clsf_cd = Util.checkString(rset0.getString("mang_clsf_cd"));
			rec.mang_no = Util.checkString(rset0.getString("mang_no"));
			rec.incm_clsf_cd = Util.checkString(rset0.getString("incm_clsf_cd"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.comp_dt = Util.checkString(rset0.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.unit = Util.checkString(rset0.getString("unit"));
			rec.qunt = Util.checkString(rset0.getString("qunt"));
			rec.tax_stmt_no = Util.checkString(rset0.getString("tax_stmt_no"));
			rec.setoff_slip_occr_dt = Util.checkString(rset0.getString("setoff_slip_occr_dt"));
			rec.setoff_slip_clsf_cd = Util.checkString(rset0.getString("setoff_slip_clsf_cd"));
			rec.setoff_slip_seq = Util.checkString(rset0.getString("setoff_slip_seq"));
			rec.setoff_slip_sub_seq = Util.checkString(rset0.getString("setoff_slip_sub_seq"));
			rec.setoff_slip_arow_no = Util.checkString(rset0.getString("setoff_slip_arow_no"));
			rec.obj_acct_cd = Util.checkString(rset0.getString("obj_acct_cd"));
			rec.obj_acct_nm = Util.checkString(rset0.getString("obj_acct_nm"));
			rec.obj_dt = Util.checkString(rset0.getString("obj_dt"));
			rec.obj_amt = Util.checkString(rset0.getString("obj_amt"));
			rec.rmks1 = Util.checkString(rset0.getString("rmks1"));
			rec.rmks2 = Util.checkString(rset0.getString("rmks2"));
			rec.etc_in = Util.checkString(rset0.getString("etc_in"));
			rec.use_dept_cd = Util.checkString(rset0.getString("use_dept_cd"));
			rec.use_dept_nm = Util.checkString(rset0.getString("use_dept_nm"));
			rec.prop_equip_cd = Util.checkString(rset0.getString("prop_equip_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2382_LDataSet ds = (FC_ACCT_2382_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2382_LCURLISTRecord curlistRec = (FC_ACCT_2382_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.slip_arow_no%>
<%= curlistRec.budg_cd%>
<%= curlistRec.budg_nm%>
<%= curlistRec.drcr_clsf%>
<%= curlistRec.dr_amt%>
<%= curlistRec.crdt_amt%>
<%= curlistRec.intg_dlco_cd%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.boks_dlco_nm%>
<%= curlistRec.mang_clsf_cd%>
<%= curlistRec.mang_no%>
<%= curlistRec.incm_clsf_cd%>
<%= curlistRec.medi_cd%>
<%= curlistRec.comp_dt%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.unit%>
<%= curlistRec.qunt%>
<%= curlistRec.tax_stmt_no%>
<%= curlistRec.setoff_slip_occr_dt%>
<%= curlistRec.setoff_slip_clsf_cd%>
<%= curlistRec.setoff_slip_seq%>
<%= curlistRec.setoff_slip_sub_seq%>
<%= curlistRec.setoff_slip_arow_no%>
<%= curlistRec.obj_acct_cd%>
<%= curlistRec.obj_acct_nm%>
<%= curlistRec.obj_dt%>
<%= curlistRec.obj_amt%>
<%= curlistRec.rmks1%>
<%= curlistRec.rmks2%>
<%= curlistRec.etc_in%>
<%= curlistRec.use_dept_cd%>
<%= curlistRec.use_dept_nm%>
<%= curlistRec.prop_equip_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 25 14:09:14 KST 2009 */