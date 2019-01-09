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


public class IS_DEP_1910_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_DEP_1910_LDataSet(){}
	public IS_DEP_1910_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(15);
		while(rset0.next()){
			IS_DEP_1910_LCURLISTRecord rec = new IS_DEP_1910_LCURLISTRecord();
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.rmsg_ptph = Util.checkString(rset0.getString("rmsg_ptph"));
			rec.amt = Util.checkString(rset0.getString("amt"));
			rec.rcpm_clsf_nm = Util.checkString(rset0.getString("rcpm_clsf_nm"));
			rec.acct_mang_no_nm = Util.checkString(rset0.getString("acct_mang_no_nm"));
			rec.dept_cd_nm = Util.checkString(rset0.getString("dept_cd_nm"));
			rec.sub_dept_cd_nm = Util.checkString(rset0.getString("sub_dept_cd_nm"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.sms_trsm_yn = Util.checkString(rset0.getString("sms_trsm_yn"));
			rec.slip_clsf = Util.checkString(rset0.getString("slip_clsf"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.subseq = Util.checkString(rset0.getString("subseq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_DEP_1910_LDataSet ds = (IS_DEP_1910_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_DEP_1910_LCURLISTRecord curlistRec = (IS_DEP_1910_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.dlco_nm%>
<%= curlistRec.rmsg_ptph%>
<%= curlistRec.amt%>
<%= curlistRec.rcpm_clsf_nm%>
<%= curlistRec.acct_mang_no_nm%>
<%= curlistRec.dept_cd_nm%>
<%= curlistRec.sub_dept_cd_nm%>
<%= curlistRec.chrg_pers%>
<%= curlistRec.sms_trsm_yn%>
<%= curlistRec.slip_clsf%>
<%= curlistRec.seq%>
<%= curlistRec.subseq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 24 14:43:38 KST 2012 */