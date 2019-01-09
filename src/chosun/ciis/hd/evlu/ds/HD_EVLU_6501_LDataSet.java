/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
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


public class HD_EVLU_6501_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String mem_per_tot;

	public HD_EVLU_6501_LDataSet(){}
	public HD_EVLU_6501_LDataSet(String errcode, String errmsg, String mem_per_tot){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.mem_per_tot = mem_per_tot;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setMem_per_tot(String mem_per_tot){
		this.mem_per_tot = mem_per_tot;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getMem_per_tot(){
		return this.mem_per_tot;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.mem_per_tot = Util.checkString(cstmt.getString(7));
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			HD_EVLU_6501_LCURLISTRecord rec = new HD_EVLU_6501_LCURLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.evlu_grp_cd = Util.checkString(rset0.getString("evlu_grp_cd"));
			rec.evlu_grp_nm = Util.checkString(rset0.getString("evlu_grp_nm"));
			rec.dept_nm1 = Util.checkString(rset0.getString("dept_nm1"));
			rec.emp_no1 = Util.checkString(rset0.getString("emp_no1"));
			rec.nm_korn1 = Util.checkString(rset0.getString("nm_korn1"));
			rec.dept_nm2 = Util.checkString(rset0.getString("dept_nm2"));
			rec.emp_no2 = Util.checkString(rset0.getString("emp_no2"));
			rec.nm_korn2 = Util.checkString(rset0.getString("nm_korn2"));
			rec.db_status = Util.checkString(rset0.getString("db_status"));
			rec.evlu_yy = Util.checkString(rset0.getString("evlu_yy"));
			rec.tms_clsf = Util.checkString(rset0.getString("tms_clsf"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_EVLU_6501_LDataSet ds = (HD_EVLU_6501_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_EVLU_6501_LCURLISTRecord curlistRec = (HD_EVLU_6501_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMem_per_tot()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.emp_no%>
<%= curlistRec.nm_korn%>
<%= curlistRec.dty_nm%>
<%= curlistRec.evlu_grp_cd%>
<%= curlistRec.evlu_grp_nm%>
<%= curlistRec.dept_nm1%>
<%= curlistRec.emp_no1%>
<%= curlistRec.nm_korn1%>
<%= curlistRec.dept_nm2%>
<%= curlistRec.emp_no2%>
<%= curlistRec.nm_korn2%>
<%= curlistRec.db_status%>
<%= curlistRec.evlu_yy%>
<%= curlistRec.tms_clsf%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Sep 22 16:20:04 KST 2015 */