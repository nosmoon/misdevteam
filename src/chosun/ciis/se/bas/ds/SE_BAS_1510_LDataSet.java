/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.bas.dm.*;
import chosun.ciis.se.bas.rec.*;

/**
 * 
 */


public class SE_BAS_1510_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList joblist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_BAS_1510_LDataSet(){}
	public SE_BAS_1510_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			SE_BAS_1510_LJOBLISTRecord rec = new SE_BAS_1510_LJOBLISTRecord();
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.part_nm = Util.checkString(rset0.getString("part_nm"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.chrg_emp_nm = Util.checkString(rset0.getString("chrg_emp_nm"));
			rec.clos_pers_emp_nm = Util.checkString(rset0.getString("clos_pers_emp_nm"));
			rec.clos_proc_dt = Util.checkString(rset0.getString("clos_proc_dt"));
			rec.clos_yn = Util.checkString(rset0.getString("clos_yn"));
			rec.work_remk_1 = Util.checkString(rset0.getString("work_remk_1"));
			rec.work_remk_2 = Util.checkString(rset0.getString("work_remk_2"));
			this.joblist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_BAS_1510_LDataSet ds = (SE_BAS_1510_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.joblist.size(); i++){
		SE_BAS_1510_LJOBLISTRecord joblistRec = (SE_BAS_1510_LJOBLISTRecord)ds.joblist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getJoblist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= joblistRec.dept_nm%>
<%= joblistRec.part_nm%>
<%= joblistRec.area_nm%>
<%= joblistRec.chrg_emp_nm%>
<%= joblistRec.clos_pers_emp_nm%>
<%= joblistRec.clos_proc_dt%>
<%= joblistRec.clos_yn%>
<%= joblistRec.work_remk_1%>
<%= joblistRec.work_remk_2%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 21 12:00:08 KST 2009 */