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


package chosun.ciis.hd.evlu.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.rec.*;

/**
 * 
 */


public class HD_EVLU_3902_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_EVLU_3902_LDataSet(){}
	public HD_EVLU_3902_LDataSet(String errcode, String errmsg){
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
			HD_EVLU_3902_LCURLISTRecord rec = new HD_EVLU_3902_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.in_cmpy_dt = Util.checkString(rset0.getString("in_cmpy_dt"));
			rec.evlu_yy = Util.checkString(rset0.getString("evlu_yy"));
			rec.tms_clsf_name = Util.checkString(rset0.getString("tms_clsf_name"));
			rec.evlu_pers1 = Util.checkString(rset0.getString("evlu_pers1"));
			rec.evlu_pers2 = Util.checkString(rset0.getString("evlu_pers2"));
			rec.evlu_pers_deci_grad_last = Util.checkString(rset0.getString("evlu_pers_deci_grad_last"));
			rec.evlu_grp_name = Util.checkString(rset0.getString("evlu_grp_name"));
			rec.evlu_frdt = Util.checkString(rset0.getString("evlu_frdt"));
			rec.evlu_todt = Util.checkString(rset0.getString("evlu_todt"));
			rec.noti_dt = Util.checkString(rset0.getString("noti_dt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_EVLU_3902_LDataSet ds = (HD_EVLU_3902_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_EVLU_3902_LCURLISTRecord curlistRec = (HD_EVLU_3902_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.nm_korn%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.posi_cd%>
<%= curlistRec.posi_nm%>
<%= curlistRec.in_cmpy_dt%>
<%= curlistRec.evlu_yy%>
<%= curlistRec.tms_clsf_name%>
<%= curlistRec.evlu_pers1%>
<%= curlistRec.evlu_pers2%>
<%= curlistRec.evlu_pers_deci_grad_last%>
<%= curlistRec.evlu_grp_name%>
<%= curlistRec.evlu_frdt%>
<%= curlistRec.evlu_todt%>
<%= curlistRec.noti_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 26 16:15:31 KST 2013 */