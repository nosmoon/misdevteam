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


package chosun.ciis.hd.edu.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.edu.dm.*;
import chosun.ciis.hd.edu.rec.*;

/**
 * 
 */


public class HD_EDU_1303_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_EDU_1303_LDataSet(){}
	public HD_EDU_1303_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			HD_EDU_1303_LCURLISTRecord rec = new HD_EDU_1303_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.edu_clsf = Util.checkString(rset0.getString("edu_clsf"));
			rec.lecture_nm = Util.checkString(rset0.getString("lecture_nm"));
			rec.edu_frdt = Util.checkString(rset0.getString("edu_frdt"));
			rec.edu_todt = Util.checkString(rset0.getString("edu_todt"));
			rec.edu_tm = Util.checkString(rset0.getString("edu_tm"));
			rec.edu_cost = Util.checkString(rset0.getString("edu_cost"));
			rec.emp_yn = Util.checkString(rset0.getString("emp_yn"));
			rec.edu_scor = Util.checkString(rset0.getString("edu_scor"));
			rec.complt_yn = Util.checkString(rset0.getString("complt_yn"));
			rec.complt_yn_nm = Util.checkString(rset0.getString("complt_yn_nm"));
			rec.emp_yn_nm = Util.checkString(rset0.getString("emp_yn_nm"));
			rec.edu_dtls_clsf = Util.checkString(rset0.getString("edu_dtls_clsf"));
			rec.edu_dtls_clsf_nm = Util.checkString(rset0.getString("edu_dtls_clsf_nm"));
			rec.lang_cd = Util.checkString(rset0.getString("lang_cd"));
			rec.lang_nm = Util.checkString(rset0.getString("lang_nm"));
			rec.offi_nm = Util.checkString(rset0.getString("offi_nm"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_EDU_1303_LDataSet ds = (HD_EDU_1303_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_EDU_1303_LCURLISTRecord curlistRec = (HD_EDU_1303_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.emp_no%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.flnm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.dty_cd%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_cd%>
<%= curlistRec.posi_nm%>
<%= curlistRec.edu_clsf%>
<%= curlistRec.lecture_nm%>
<%= curlistRec.edu_frdt%>
<%= curlistRec.edu_todt%>
<%= curlistRec.edu_tm%>
<%= curlistRec.edu_cost%>
<%= curlistRec.emp_yn%>
<%= curlistRec.edu_scor%>
<%= curlistRec.complt_yn%>
<%= curlistRec.complt_yn_nm%>
<%= curlistRec.emp_yn_nm%>
<%= curlistRec.edu_dtls_clsf%>
<%= curlistRec.edu_dtls_clsf_nm%>
<%= curlistRec.lang_cd%>
<%= curlistRec.lang_nm%>
<%= curlistRec.offi_nm%>
<%= curlistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Sep 06 16:05:09 KST 2018 */