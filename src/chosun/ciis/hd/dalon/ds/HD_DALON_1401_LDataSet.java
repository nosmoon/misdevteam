
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


package chosun.ciis.hd.dalon.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.dalon.dm.*;
import chosun.ciis.hd.dalon.rec.*;

/**
 * 
 */


public class HD_DALON_1401_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_DALON_1401_LDataSet(){}
	public HD_DALON_1401_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			HD_DALON_1401_LCURLISTRecord rec = new HD_DALON_1401_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.session_emp_no = Util.checkString(rset0.getString("session_emp_no"));
			rec.session_flnm = Util.checkString(rset0.getString("session_flnm"));
			rec.cost_obj_clsf = Util.checkString(rset0.getString("cost_obj_clsf"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.session_dept_cd = Util.checkString(rset0.getString("session_dept_cd"));
			rec.session_dept_cd_nm = Util.checkString(rset0.getString("session_dept_cd_nm"));
			rec.session_dty_cd = Util.checkString(rset0.getString("session_dty_cd"));
			rec.session_dty_nm = Util.checkString(rset0.getString("session_dty_nm"));
			rec.session_posi_cd = Util.checkString(rset0.getString("session_posi_cd"));
			rec.session_posi_nm = Util.checkString(rset0.getString("session_posi_nm"));
			rec.frdt = Util.checkString(rset0.getString("frdt"));
			rec.todt = Util.checkString(rset0.getString("todt"));
			rec.out_in_plac = Util.checkString(rset0.getString("out_in_plac"));
			rec.cost = Util.checkString(rset0.getString("cost"));
			rec.excl_pers_clsf = Util.checkString(rset0.getString("excl_pers_clsf"));
			rec.proc_stat = Util.checkString(rset0.getString("proc_stat"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_DALON_1401_LDataSet ds = (HD_DALON_1401_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_DALON_1401_LCURLISTRecord curlistRec = (HD_DALON_1401_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.session_emp_no%>
<%= curlistRec.session_flnm%>
<%= curlistRec.cost_obj_clsf%>
<%= curlistRec.session_dept_cd%>
<%= curlistRec.session_dept_cd_nm%>
<%= curlistRec.frdt%>
<%= curlistRec.todt%>
<%= curlistRec.out_in_plac%>
<%= curlistRec.cost%>
<%= curlistRec.proc_stat%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 14 16:13:42 KST 2009 */