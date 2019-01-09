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

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.dep.rec.AD_DEP_1751_LCURLISTRecord;

/**
 * 
 */


public class AD_DEP_1751_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_DEP_1751_LDataSet(){}
	public AD_DEP_1751_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(17);
		while(rset0.next()){
			AD_DEP_1751_LCURLISTRecord rec = new AD_DEP_1751_LCURLISTRecord();
			rec.occr_dt				= Util.checkString(rset0.getString("occr_dt"));
			rec.slip_clsf			= Util.checkString(rset0.getString("slip_clsf"));
			rec.seq					= Util.checkString(rset0.getString("seq"));
			rec.subseq				= Util.checkString(rset0.getString("subseq"));
			rec.rcpm_slip_no		= Util.checkString(rset0.getString("rcpm_slip_no"));
			rec.medi_cd				= Util.checkString(rset0.getString("medi_cd"));
			rec.medi_nm				= Util.checkString(rset0.getString("medi_nm"));
			rec.rcpm_plac_clsf 		= Util.checkString(rset0.getString("rcpm_plac_clsf"));
			rec.rcpm_plac_clsf_nm	= Util.checkString(rset0.getString("rcpm_plac_clsf_nm"));
			rec.note_clsf_cd		= Util.checkString(rset0.getString("note_clsf_cd"));
			rec.dlco_no				= Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm				= Util.checkString(rset0.getString("dlco_nm"));
			rec.total_amt			= Util.checkString(rset0.getString("total_amt"));
			rec.rcpm_clsf			= Util.checkString(rset0.getString("rcpm_clsf"));
			rec.rcpm_clsf_nm		= Util.checkString(rset0.getString("rcpm_clsf_nm"));
			rec.amt					= Util.checkString(rset0.getString("amt"));
			rec.advt_amt			= Util.checkString(rset0.getString("advt_amt"));
			rec.mchrg_pers			= Util.checkString(rset0.getString("mchrg_pers"));
			rec.mchrg_pers_nm		= Util.checkString(rset0.getString("mchrg_pers_nm"));
			rec.rcpm_acct			= Util.checkString(rset0.getString("rcpm_acct"));
			rec.rcpm_acct_nm		= Util.checkString(rset0.getString("rcpm_acct_nm"));
			rec.sale_aprv_no		= Util.checkString(rset0.getString("sale_aprv_no"));
			
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_DEP_1710_LDataSet ds = (AD_DEP_1710_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_DEP_1710_LCURLISTRecord curlistRec = (AD_DEP_1710_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.pubc_dt%>
<%= curlistRec.pubc_slip_no%>
<%= curlistRec.rcpm_shet_no%>
<%= curlistRec.proc_stat%>
<%= curlistRec.medi_nm%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.advt_fee%>
<%= curlistRec.vat%>
<%= curlistRec.setoff_advt_fee%>
<%= curlistRec.setoff_vat%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 26 18:09:51 KST 2009 */