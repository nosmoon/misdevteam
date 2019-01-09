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


package chosun.ciis.is.dep.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.dep.dm.*;
import chosun.ciis.is.dep.rec.*;

/**
 * 
 */


public class IS_DEP_1751_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_DEP_1751_LDataSet(){}
	public IS_DEP_1751_LDataSet(String errcode, String errmsg){
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
			IS_DEP_1751_LCURLISTRecord rec = new IS_DEP_1751_LCURLISTRecord();
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.slip_clsf = Util.checkString(rset0.getString("slip_clsf"));
			rec.slip_clsf_nm = Util.checkString(rset0.getString("slip_clsf_nm"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.subseq = Util.checkString(rset0.getString("subseq"));
			rec.rcpm_slip_no = Util.checkString(rset0.getString("rcpm_slip_no"));
			rec.rcpm_plac_clsf = Util.checkString(rset0.getString("rcpm_plac_clsf"));
			rec.rcpm_plac_clsf_nm = Util.checkString(rset0.getString("rcpm_plac_clsf_nm"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.total_amt = Util.checkString(rset0.getString("total_amt"));
			rec.rcpm_clsf = Util.checkString(rset0.getString("rcpm_clsf"));
			rec.note_clsf_cd = Util.checkString(rset0.getString("note_clsf_cd"));
			rec.rcpm_clsf_nm = Util.checkString(rset0.getString("rcpm_clsf_nm"));
			rec.amt = Util.checkString(rset0.getString("amt"));
			rec.advt_amt = Util.checkString(rset0.getString("advt_amt"));
			rec.mchrg_pers = Util.checkString(rset0.getString("mchrg_pers"));
			rec.mchrg_pers_nm = Util.checkString(rset0.getString("mchrg_pers_nm"));
			rec.rcpm_acct = Util.checkString(rset0.getString("rcpm_acct"));
			rec.rcpm_acct_nm = Util.checkString(rset0.getString("rcpm_acct_nm"));
			rec.sale_aprv_no = Util.checkString(rset0.getString("sale_aprv_no"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_DEP_1751_LDataSet ds = (IS_DEP_1751_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_DEP_1751_LCURLISTRecord curlistRec = (IS_DEP_1751_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.occr_dt%>
<%= curlistRec.slip_clsf%>
<%= curlistRec.slip_clsf_nm%>
<%= curlistRec.seq%>
<%= curlistRec.subseq%>
<%= curlistRec.rcpm_slip_no%>
<%= curlistRec.rcpm_plac_clsf%>
<%= curlistRec.rcpm_plac_clsf_nm%>
<%= curlistRec.dlco_no%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.total_amt%>
<%= curlistRec.rcpm_clsf%>
<%= curlistRec.note_clsf_cd%>
<%= curlistRec.rcpm_clsf_nm%>
<%= curlistRec.amt%>
<%= curlistRec.advt_amt%>
<%= curlistRec.mchrg_pers%>
<%= curlistRec.mchrg_pers_nm%>
<%= curlistRec.rcpm_acct%>
<%= curlistRec.rcpm_acct_nm%>
<%= curlistRec.sale_aprv_no%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 22 15:56:49 KST 2012 */