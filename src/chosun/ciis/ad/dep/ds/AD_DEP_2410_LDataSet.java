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


package chosun.ciis.ad.dep.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.dep.dm.*;
import chosun.ciis.ad.dep.rec.*;

/**
 * 
 */


public class AD_DEP_2410_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_DEP_2410_LDataSet(){}
	public AD_DEP_2410_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			AD_DEP_2410_LCURLISTRecord rec = new AD_DEP_2410_LCURLISTRecord();
			rec.rcpm_slip_no = Util.checkString(rset0.getString("rcpm_slip_no"));
			rec.rcpm_shet_no = Util.checkString(rset0.getString("rcpm_shet_no"));
			rec.note_no = Util.checkString(rset0.getString("note_no"));
			rec.now_note_stat_nm = Util.checkString(rset0.getString("now_note_stat_nm"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.bank_cd = Util.checkString(rset0.getString("bank_cd"));
			rec.bank_nm = Util.checkString(rset0.getString("bank_nm"));
			rec.note_clsf_nm = Util.checkString(rset0.getString("note_clsf_nm"));
			rec.note_amt = Util.checkString(rset0.getString("note_amt"));
			rec.issu_pers_nm = Util.checkString(rset0.getString("issu_pers_nm"));
			rec.mang_chrg_pers = Util.checkString(rset0.getString("mang_chrg_pers"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.rcpm_acct = Util.checkString(rset0.getString("rcpm_acct"));
			rec.sale_aprv_no = Util.checkString(rset0.getString("sale_aprv_no"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.comp_dt = Util.checkString(rset0.getString("comp_dt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_DEP_2410_LDataSet ds = (AD_DEP_2410_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_DEP_2410_LCURLISTRecord curlistRec = (AD_DEP_2410_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.rcpm_slip_no%>
<%= curlistRec.rcpm_shet_no%>
<%= curlistRec.note_no%>
<%= curlistRec.now_note_stat_nm%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.bank_cd%>
<%= curlistRec.bank_nm%>
<%= curlistRec.note_clsf_nm%>
<%= curlistRec.note_amt%>
<%= curlistRec.issu_pers_nm%>
<%= curlistRec.mang_chrg_pers%>
<%= curlistRec.medi_nm%>
<%= curlistRec.rcpm_acct%>
<%= curlistRec.sale_aprv_no%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.comp_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 20 14:44:07 KST 2014 */