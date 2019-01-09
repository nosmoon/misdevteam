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


package chosun.ciis.ad.common.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;

import chosun.ciis.ad.common.rec.AD_CO_1610_LCURLISTRecord;

/**
 * 
 */


public class AD_CO_1610_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_CO_1610_LDataSet(){}
	public AD_CO_1610_LDataSet(String errcode, String errmsg){
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
		
		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			AD_CO_1610_LCURLISTRecord rec = new AD_CO_1610_LCURLISTRecord();
			
			rec.bank_cd			= Util.checkString(rset0.getString("bank_cd"));
			rec.bank_nm				= Util.checkString(rset0.getString("bank_nm"));
			rec.note_clsf_cd 	= Util.checkString(rset0.getString("note_clsf_cd"));
			rec.note_clsf_nm		= Util.checkString(rset0.getString("note_clsf_nm"));
			rec.note_amt			= Util.checkString(rset0.getString("note_amt"));
			rec.comp_dt		 		= Util.checkString(rset0.getString("comp_dt"));
			rec.mtry_dt 			= Util.checkString(rset0.getString("mtry_dt"));
			rec.issu_cmpy_clsf_cd	= Util.checkString(rset0.getString("issu_cmpy_clsf_cd"));
			rec.issu_pers_nm		= Util.checkString(rset0.getString("issu_pers_nm"));
			rec.endorser_nm			= Util.checkString(rset0.getString("endorser_nm"));
			rec.rcpm_acct 			= Util.checkString(rset0.getString("rcpm_acct"));
			rec.rcpm_acct_nm		= Util.checkString(rset0.getString("rcpm_acct_nm"));
			rec.sale_aprv_no		= Util.checkString(rset0.getString("sale_aprv_no"));
			rec.elec_note_key		= Util.checkString(rset0.getString("elec_note_key"));
			
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_CO_1100_LDataSet ds = (AD_CO_1100_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_CO_1100_LCURLISTRecord curlistRec = (AD_CO_1100_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_CO_1100_LCURLIST2Record curlist2Rec = (AD_CO_1100_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cd%>
<%= curlistRec.cdnm%>
<%= curlist2Rec.major%>
<%= curlist2Rec.cd%>
<%= curlist2Rec.cdnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 02 15:48:45 KST 2009 */