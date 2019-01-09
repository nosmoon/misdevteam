/***************************************************************************************************
* 파일명		: 
* 기능		:
* 작성일자	: 
* 작성자		: 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역	: 
* 수정자		:   
* 수정일자	: 
* 백업		: 
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

public class HD_EVLU_6101_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long tms1_done_cnt;
	public long tms1_doing_cnt;
	public long tms2_done_cnt;
	public long tms2_doing_cnt;

	public HD_EVLU_6101_LDataSet(){}
	public HD_EVLU_6101_LDataSet(String errcode, String errmsg, long tms1_done_cnt, long tms1_doing_cnt, long tms2_done_cnt, long tms2_doing_cnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.tms1_done_cnt = tms1_done_cnt;
		this.tms1_doing_cnt = tms1_doing_cnt;
		this.tms2_done_cnt = tms2_done_cnt;
		this.tms2_doing_cnt = tms2_doing_cnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTms1_done_cnt(long tms1_done_cnt){
		this.tms1_done_cnt = tms1_done_cnt;
	}

	public void setTms1_doing_cnt(long tms1_doing_cnt){
		this.tms1_doing_cnt = tms1_doing_cnt;
	}

	public void setTms2_done_cnt(long tms2_done_cnt){
		this.tms2_done_cnt = tms2_done_cnt;
	}

	public void setTms2_doing_cnt(long tms2_doing_cnt){
		this.tms2_doing_cnt = tms2_doing_cnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getTms1_done_cnt(){
		return this.tms1_done_cnt;
	}

	public long getTms1_doing_cnt(){
		return this.tms1_doing_cnt;
	}

	public long getTms2_done_cnt(){
		return this.tms2_done_cnt;
	}

	public long getTms2_doing_cnt(){
		return this.tms2_doing_cnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.tms1_done_cnt = cstmt.getLong(7);
		this.tms1_doing_cnt = cstmt.getLong(8);
		this.tms2_done_cnt = cstmt.getLong(9);
		this.tms2_doing_cnt = cstmt.getLong(10);
		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			HD_EVLU_6101_LCURLISTRecord rec = new HD_EVLU_6101_LCURLISTRecord();
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.tms1_dept_nm = Util.checkString(rset0.getString("tms1_dept_nm"));
			rec.tms1_emp_no = Util.checkString(rset0.getString("tms1_emp_no"));
			rec.tms1_nm_korn = Util.checkString(rset0.getString("tms1_nm_korn"));
			rec.tms1_dty_nm = Util.checkString(rset0.getString("tms1_dty_nm"));
			rec.tms2_dept_nm = Util.checkString(rset0.getString("tms2_dept_nm"));
			rec.tms2_emp_no = Util.checkString(rset0.getString("tms2_emp_no"));
			rec.tms2_nm_korn = Util.checkString(rset0.getString("tms2_nm_korn"));
			rec.tms2_dty_nm = Util.checkString(rset0.getString("tms2_dty_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_EVLU_6101_LDataSet ds = (HD_EVLU_6101_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_EVLU_6101_LCURLISTRecord curlistRec = (HD_EVLU_6101_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTms1_done_cnt()%>
<%= ds.getTms1_doing_cnt()%>
<%= ds.getTms2_done_cnt()%>
<%= ds.getTms2_doing_cnt()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.dept_nm%>
<%= curlistRec.emp_no%>
<%= curlistRec.nm_korn%>
<%= curlistRec.dty_nm%>
<%= curlistRec.tms1_dept_nm%>
<%= curlistRec.tms1_emp_no%>
<%= curlistRec.tms1_nm_korn%>
<%= curlistRec.tms1_dty_nm%>
<%= curlistRec.tms2_dept_nm%>
<%= curlistRec.tms2_emp_no%>
<%= curlistRec.tms2_nm_korn%>
<%= curlistRec.tms2_dty_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 08 21:40:52 KST 2009 */