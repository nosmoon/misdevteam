

package chosun.ciis.hd.com.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.com.dm.*;
import chosun.ciis.hd.com.rec.*;

/**
 * 
 */


public class HD_COM_1110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String dept_cnt;
	public String dept_cd;
	public String dept_nm;

	public HD_COM_1110_LDataSet(){}
	public HD_COM_1110_LDataSet(String errcode, String errmsg, String dept_cnt, String dept_cd, String dept_nm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.dept_cnt = dept_cnt;
		this.dept_cd = dept_cd;
		this.dept_nm = dept_nm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setDept_cnt(String dept_cnt){
		this.dept_cnt = dept_cnt;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getDept_cnt(){
		return this.dept_cnt;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.dept_cnt = Util.checkString(cstmt.getString(5));
		this.dept_cd = Util.checkString(cstmt.getString(6));
		this.dept_nm = Util.checkString(cstmt.getString(7));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_COM_1110_LDataSet ds = (HD_COM_1110_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDept_cnt()%>
<%= ds.getDept_cd()%>
<%= ds.getDept_nm()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 29 14:08:58 KST 2011 */