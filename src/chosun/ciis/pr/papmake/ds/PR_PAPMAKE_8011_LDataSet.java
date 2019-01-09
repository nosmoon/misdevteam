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


package chosun.ciis.pr.papmake.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.papmake.dm.*;
import chosun.ciis.pr.papmake.rec.*;

/**
 * 
 */


public class PR_PAPMAKE_8011_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PR_PAPMAKE_8011_LDataSet(){}
	public PR_PAPMAKE_8011_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			PR_PAPMAKE_8011_LCURLISTRecord rec = new PR_PAPMAKE_8011_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.dcmt_no = Util.checkString(rset0.getString("dcmt_no"));
			rec.dcmt_clsf = Util.checkString(rset0.getString("dcmt_clsf"));
			rec.dcmt_nm = Util.checkString(rset0.getString("dcmt_nm"));
			rec.requ_dt = Util.checkString(rset0.getString("requ_dt"));
			rec.requ_pers = Util.checkString(rset0.getString("requ_pers"));
			rec.requ_pers_nm = Util.checkString(rset0.getString("requ_pers_nm"));
			rec.resp_dt = Util.checkString(rset0.getString("resp_dt"));
			rec.resp_pers = Util.checkString(rset0.getString("resp_pers"));
			rec.resp_pers_nm = Util.checkString(rset0.getString("resp_pers_nm"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.fac_clsf_nm = Util.checkString(rset0.getString("fac_clsf_nm"));
			rec.remk2 = Util.checkString(rset0.getString("remk2"));
			rec.dcmt_tp = Util.checkString(rset0.getString("dcmt_tp"));
			rec.tel_no = Util.checkString(rset0.getString("tel_no"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PR_PAPMAKE_8011_LDataSet ds = (PR_PAPMAKE_8011_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		PR_PAPMAKE_8011_LCURLISTRecord curlistRec = (PR_PAPMAKE_8011_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.occr_dt%>
<%= curlistRec.dcmt_no%>
<%= curlistRec.dcmt_clsf%>
<%= curlistRec.dcmt_nm%>
<%= curlistRec.requ_dt%>
<%= curlistRec.requ_pers%>
<%= curlistRec.requ_pers_nm%>
<%= curlistRec.resp_dt%>
<%= curlistRec.resp_pers%>
<%= curlistRec.resp_eprs_nm%>
<%= curlistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 21 17:25:16 KST 2016 */