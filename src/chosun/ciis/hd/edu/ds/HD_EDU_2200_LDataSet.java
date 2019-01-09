

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


public class HD_EDU_2200_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String msg;

	public HD_EDU_2200_LDataSet(){}
	public HD_EDU_2200_LDataSet(String errcode, String errmsg, String msg){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.msg = msg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setMsg(String msg){
		this.msg = msg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getMsg(){
		return this.msg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.msg = Util.checkString(cstmt.getString(3));
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			HD_EDU_2200_LCURLISTRecord rec = new HD_EDU_2200_LCURLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_cd_nm = Util.checkString(rset0.getString("dept_cd_nm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.cour_lng_cd = Util.checkString(rset0.getString("cour_lng_cd"));
			rec.cour_obj_cd = Util.checkString(rset0.getString("cour_obj_cd"));
			rec.cour_tm_cd = Util.checkString(rset0.getString("cour_tm_cd"));
			rec.lv_cd = Util.checkString(rset0.getString("lv_cd"));
			rec.lv_test_req_cd = Util.checkString(rset0.getString("lv_test_req_cd"));
			rec.tel_no = Util.checkString(rset0.getString("tel_no"));
			rec.proc_stat = Util.checkString(rset0.getString("proc_stat"));
			rec.proc_stat_nm = Util.checkString(rset0.getString("proc_stat_nm"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_EDU_2200_LDataSet ds = (HD_EDU_2200_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_EDU_2200_LCURLISTRecord curlistRec = (HD_EDU_2200_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.dept_cd%>
<%= curlistRec.dept_cd_nm%>
<%= curlistRec.emp_no%>
<%= curlistRec.flnm%>
<%= curlistRec.cour_lng_cd%>
<%= curlistRec.cour_obj_cd%>
<%= curlistRec.cour_tm_cd%>
<%= curlistRec.lv_cd%>
<%= curlistRec.lv_test_req_cd%>
<%= curlistRec.tel_no%>
<%= curlistRec.proc_stat%>
<%= curlistRec.proc_stat_nm%>
<%= curlistRec.remk%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 12 14:54:45 KST 2011 */