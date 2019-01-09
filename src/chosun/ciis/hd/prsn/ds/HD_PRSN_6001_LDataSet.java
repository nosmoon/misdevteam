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


package chosun.ciis.hd.prsn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.prsn.dm.*;
import chosun.ciis.hd.prsn.rec.*;

/**
 * 
 */


public class HD_PRSN_6001_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_PRSN_6001_LDataSet(){}
	public HD_PRSN_6001_LDataSet(String errcode, String errmsg){
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

		ResultSet rset2 = (ResultSet) cstmt.getObject(9);
		while(rset2.next()){
			HD_PRSN_6001_LCURLISTRecord rec = new HD_PRSN_6001_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset2.getString("cmpy_cd"));
			rec.seq = Util.checkString(rset2.getString("seq"));
			rec.obj_dept_cd = Util.checkString(rset2.getString("obj_dept_cd"));
			rec.obj_dept_nm = Util.checkString(rset2.getString("obj_dept_nm"));
			rec.obj_emp_no = Util.checkString(rset2.getString("obj_emp_no"));
			rec.obj_flnm = Util.checkString(rset2.getString("obj_flnm"));
			rec.prv_aprv_emp_no = Util.checkString(rset2.getString("prv_aprv_emp_no"));
			rec.prv_aprv_flnm = Util.checkString(rset2.getString("prv_aprv_flnm"));
			rec.aft_aprv_emp_no = Util.checkString(rset2.getString("aft_aprv_emp_no"));
			rec.aft_aprv_flnm = Util.checkString(rset2.getString("aft_aprv_flnm"));
			rec.fr_dt = Util.checkString(rset2.getString("fr_dt"));
			rec.to_dt = Util.checkString(rset2.getString("to_dt"));
			rec.use_yn = Util.checkString(rset2.getString("use_yn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_PRSN_6001_LDataSet ds = (HD_PRSN_6001_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_PRSN_6001_LCURLISTRecord curlistRec = (HD_PRSN_6001_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.obj_flnm%>
<%= curlistRec.prv_aprv_emp_no%>
<%= curlistRec.prv_aprv_flnm%>
<%= curlistRec.aft_aprv_emp_no%>
<%= curlistRec.aft_aprv_flnm%>
<%= curlistRec.fr_dt%>
<%= curlistRec.to_dt%>
<%= curlistRec.use_yn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 03 18:38:33 KST 2018 */