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


package chosun.ciis.hd.srch.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.srch.dm.*;
import chosun.ciis.hd.srch.rec.*;

/**
 * 
 */


public class HD_SRCH_1020_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_SRCH_1020_LDataSet(){}
	public HD_SRCH_1020_LDataSet(String errcode, String errmsg){
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
			HD_SRCH_1020_LCURLISTRecord rec = new HD_SRCH_1020_LCURLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.up_dept_nm = Util.checkString(rset0.getString("up_dept_nm"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.gender = Util.checkString(rset0.getString("gender"));
			rec.cur_jobforc_nm = Util.checkString(rset0.getString("cur_jobforc_nm"));
			rec.emp_clsf_nm = Util.checkString(rset0.getString("emp_clsf_nm"));
			rec.in_cmpy_dt = Util.checkString(rset0.getString("in_cmpy_dt"));
			rec.last_upgrd_dt = Util.checkString(rset0.getString("last_upgrd_dt"));
			rec.birth_dt = Util.checkString(rset0.getString("birth_dt"));
			rec.age = Util.checkString(rset0.getString("age"));
			rec.in_cmpy_clsf_nm = Util.checkString(rset0.getString("in_cmpy_clsf_nm"));
			rec.open_invit_clsf_nm = Util.checkString(rset0.getString("open_invit_clsf_nm"));
			rec.open_invit_desty = Util.checkString(rset0.getString("open_invit_desty"));
			rec.j_dt1 = Util.checkString(rset0.getString("j_dt1"));
			rec.nativ_nm = Util.checkString(rset0.getString("nativ_nm"));
			rec.t1 = Util.checkString(rset0.getString("t1"));
			rec.t2 = Util.checkString(rset0.getString("t2"));
			rec.t3 = Util.checkString(rset0.getString("t3"));
			rec.t4 = Util.checkString(rset0.getString("t4"));
			rec.t5 = Util.checkString(rset0.getString("t5"));
			rec.t6 = Util.checkString(rset0.getString("t6"));
			rec.t7 = Util.checkString(rset0.getString("t7"));
			rec.tot_saly = Util.checkString(rset0.getString("tot_saly"));
			rec.last_appmt_dt = Util.checkString(rset0.getString("last_appmt_dt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SRCH_1020_LDataSet ds = (HD_SRCH_1020_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SRCH_1020_LCURLISTRecord curlistRec = (HD_SRCH_1020_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dept_cd%>
<%= curlistRec.up_dept_nm%>
<%= curlistRec.dept_nm%>
<%= curlistRec.emp_no%>
<%= curlistRec.nm_korn%>
<%= curlistRec.dty_cd%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_cd%>
<%= curlistRec.posi_nm%>
<%= curlistRec.gender%>
<%= curlistRec.cur_jobforc_nm%>
<%= curlistRec.emp_clsf_nm%>
<%= curlistRec.in_cmpy_dt%>
<%= curlistRec.last_upgrd_dt%>
<%= curlistRec.birth_dt%>
<%= curlistRec.age%>
<%= curlistRec.in_cmpy_clsf_nm%>
<%= curlistRec.open_invit_clsf_nm%>
<%= curlistRec.open_invit_desty%>
<%= curlistRec.j_dt1%>
<%= curlistRec.nativ_nm%>
<%= curlistRec.t1%>
<%= curlistRec.t2%>
<%= curlistRec.t3%>
<%= curlistRec.t4%>
<%= curlistRec.t5%>
<%= curlistRec.t6%>
<%= curlistRec.t7%>
<%= curlistRec.tot_saly%>
<%= curlistRec.last_appmt_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Dec 29 15:12:39 KST 2017 */