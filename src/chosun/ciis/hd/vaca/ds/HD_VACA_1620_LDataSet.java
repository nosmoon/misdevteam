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


package chosun.ciis.hd.vaca.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.rec.*;

/**
 * 
 */


public class HD_VACA_1620_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_VACA_1620_LDataSet(){}
	public HD_VACA_1620_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_VACA_1620_LCURLISTRecord rec = new HD_VACA_1620_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.obj_dept_cd = Util.checkString(rset0.getString("obj_dept_cd"));
			rec.obj_dept_nm = Util.checkString(rset0.getString("obj_dept_nm"));
			rec.obj_emp_no = Util.checkString(rset0.getString("obj_emp_no"));
			rec.obj_nm_korn = Util.checkString(rset0.getString("obj_nm_korn"));
			rec.prv_aprv_emp_no = Util.checkString(rset0.getString("prv_aprv_emp_no"));
			rec.prv_aprv_nm_korn = Util.checkString(rset0.getString("prv_aprv_nm_korn"));
			rec.aft_aprv_emp_no = Util.checkString(rset0.getString("aft_aprv_emp_no"));
			rec.aft_aprv_nm_korn = Util.checkString(rset0.getString("aft_aprv_nm_korn"));
			rec.fr_dt = Util.checkString(rset0.getString("fr_dt"));
			rec.to_dt = Util.checkString(rset0.getString("to_dt"));
			rec.use_yn = Util.checkString(rset0.getString("use_yn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_VACA_1620_LDataSet ds = (HD_VACA_1620_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_VACA_1620_LCURLISTRecord curlistRec = (HD_VACA_1620_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.seq%>
<%= curlistRec.obj_dept_cd%>
<%= curlistRec.obj_dept_nm%>
<%= curlistRec.obj_emp_no%>
<%= curlistRec.obj_nm_korn%>
<%= curlistRec.prv_aprv_emp_no%>
<%= curlistRec.prv_aprv_nm_korn%>
<%= curlistRec.aft_aprv_emp_no%>
<%= curlistRec.aft_aprv_nm_korn%>
<%= curlistRec.fr_dt%>
<%= curlistRec.to_dt%>
<%= curlistRec.use_yn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 22 17:05:36 KST 2018 */