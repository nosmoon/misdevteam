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


public class FC_ACCT_2473_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2473_SDataSet(){}
	public FC_ACCT_2473_SDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			FC_ACCT_2473_SCURLISTRecord rec = new FC_ACCT_2473_SCURLISTRecord();
			rec.acct_cd = Util.checkString(rset0.getString("acct_cd"));
			rec.acct_nm = Util.checkString(rset0.getString("acct_nm"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.boks_dlco_nm = Util.checkString(rset0.getString("boks_dlco_nm"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.mang_no = Util.checkString(rset0.getString("mang_no"));
			rec.mang_clsf_cd = Util.checkString(rset0.getString("mang_clsf_cd"));
			rec.mang_clsf_nm = Util.checkString(rset0.getString("mang_clsf_nm"));
			rec.bank_cd = Util.checkString(rset0.getString("bank_cd"));
			rec.bank_nm = Util.checkString(rset0.getString("bank_nm"));
			rec.comp_dt = Util.checkString(rset0.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.unit = Util.checkString(rset0.getString("unit"));
			rec.qunt = Util.checkString(rset0.getString("qunt"));
			rec.use_dept_cd = Util.checkString(rset0.getString("use_dept_cd"));
			rec.use_dept_nm = Util.checkString(rset0.getString("use_dept_nm"));
			rec.obj_acct_cd = Util.checkString(rset0.getString("obj_acct_cd"));
			rec.obj_acct_nm = Util.checkString(rset0.getString("obj_acct_nm"));
			rec.obj_amt = Util.checkString(rset0.getString("obj_amt"));
			rec.note_stat = Util.checkString(rset0.getString("note_stat"));
			rec.note_stat_nm = Util.checkString(rset0.getString("note_stat_nm"));
			rec.frcr_clsf_cd = Util.checkString(rset0.getString("frcr_clsf_cd"));
			rec.exrate = Util.checkString(rset0.getString("exrate"));
			rec.frcr_amt = Util.checkString(rset0.getString("frcr_amt"));
			rec.obj_dt = Util.checkString(rset0.getString("obj_dt"));
			rec.dtls_medi_cd = Util.checkString(rset0.getString("dtls_medi_cd"));
			rec.evnt_cd = Util.checkString(rset0.getString("evnt_cd"));
			rec.prop_equip_cd = Util.checkString(rset0.getString("prop_equip_cd"));
			rec.incmg_dt = Util.checkString(rset0.getString("incmg_dt"));
			rec.intg_dlco_cd = Util.checkString(rset0.getString("intg_dlco_cd"));
			rec.dtls_medi_nm = Util.checkString(rset0.getString("dtls_medi_nm"));
			rec.evnt_nm = Util.checkString(rset0.getString("evnt_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2473_SDataSet ds = (FC_ACCT_2473_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2473_SCURLISTRecord curlistRec = (FC_ACCT_2473_SCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.acct_cd%>
<%= curlistRec.acct_nm%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.boks_dlco_nm%>
<%= curlistRec.medi_cd%>
<%= curlistRec.medi_nm%>
<%= curlistRec.mang_no%>
<%= curlistRec.mang_clsf_cd%>
<%= curlistRec.mang_clsf_nm%>
<%= curlistRec.bank_cd%>
<%= curlistRec.bank_nm%>
<%= curlistRec.comp_dt%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.unit%>
<%= curlistRec.qunt%>
<%= curlistRec.use_dept_cd%>
<%= curlistRec.use_dept_nm%>
<%= curlistRec.obj_acct_cd%>
<%= curlistRec.obj_acct_nm%>
<%= curlistRec.obj_amt%>
<%= curlistRec.note_stat%>
<%= curlistRec.note_stat_nm%>
<%= curlistRec.frcr_clsf_cd%>
<%= curlistRec.exrate%>
<%= curlistRec.frcr_amt%>
<%= curlistRec.obj_dt%>
<%= curlistRec.dtls_medi_cd%>
<%= curlistRec.evnt_cd%>
<%= curlistRec.prop_equip_cd%>
<%= curlistRec.incmg_dt%>
<%= curlistRec.intg_dlco_cd%>
<%= curlistRec.dtls_medi_nm%>
<%= curlistRec.evnt_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 24 11:11:48 KST 2009 */