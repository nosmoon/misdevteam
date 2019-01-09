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


public class HD_EDU_1101_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_EDU_1101_LDataSet(){}
	public HD_EDU_1101_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			HD_EDU_1101_LCURLISTRecord rec = new HD_EDU_1101_LCURLISTRecord();
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.chrg_job = Util.checkString(rset0.getString("chrg_job"));
			rec.edu_nm = Util.checkString(rset0.getString("edu_nm"));
			rec.edu_instt = Util.checkString(rset0.getString("edu_instt"));
			rec.edu_frdt = Util.checkString(rset0.getString("edu_frdt"));
			rec.edu_todt = Util.checkString(rset0.getString("edu_todt"));
			rec.edu_dds = Util.checkString(rset0.getString("edu_dds"));
			rec.edu_tm = Util.checkString(rset0.getString("edu_tm"));
			rec.edu_cost = Util.checkString(rset0.getString("edu_cost"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.aprv_yn = Util.checkString(rset0.getString("aprv_yn"));
			rec.complt_yn = Util.checkString(rset0.getString("complt_yn"));
			rec.misno = Util.checkString(rset0.getString("misno"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.rfnd_yn = Util.checkString(rset0.getString("rfnd_yn"));
			rec.rfnd_cost = Util.checkString(rset0.getString("rfnd_cost"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_EDU_1101_LDataSet ds = (HD_EDU_1101_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_EDU_1101_LCURLISTRecord curlistRec = (HD_EDU_1101_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.emp_no%>
<%= curlistRec.flnm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.dty_cd%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_cd%>
<%= curlistRec.posi_nm%>
<%= curlistRec.chrg_job%>
<%= curlistRec.edu_nm%>
<%= curlistRec.edu_instt%>
<%= curlistRec.edu_frdt%>
<%= curlistRec.edu_todt%>
<%= curlistRec.edu_dds%>
<%= curlistRec.edu_tm%>
<%= curlistRec.edu_cost%>
<%= curlistRec.remk%>
<%= curlistRec.aprv_yn%>
<%= curlistRec.complt_yn%>
<%= curlistRec.misno%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.rfnd_yn%>
<%= curlistRec.rfnd_cost%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Nov 07 16:34:38 KST 2013 */