

package chosun.ciis.hd.saly.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_6100_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String msg;

	public HD_SALY_6100_LDataSet(){}
	public HD_SALY_6100_LDataSet(String errcode, String errmsg, String msg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			HD_SALY_6100_LCURLISTRecord rec = new HD_SALY_6100_LCURLISTRecord();
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.start_mm = Util.checkString(rset0.getString("start_mm"));
			rec.end_mm = Util.checkString(rset0.getString("end_mm"));
			rec.saly_st_mm = Util.checkString(rset0.getString("saly_st_mm"));
			rec.saly_ed_mm = Util.checkString(rset0.getString("saly_ed_mm"));
			rec.dedu_amt = Util.checkString(rset0.getString("dedu_amt"));
			rec.lock_amt = Util.checkString(rset0.getString("lock_amt"));
			rec.total_amt = Util.checkString(rset0.getString("total_amt"));
			rec.total_amt2 = Util.checkString(rset0.getString("total_amt2"));
			rec.saly_proc_yn = Util.checkString(rset0.getString("saly_proc_yn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SALY_6100_LDataSet ds = (HD_SALY_6100_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SALY_6100_LCURLISTRecord curlistRec = (HD_SALY_6100_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dept_nm%>
<%= curlistRec.emp_no%>
<%= curlistRec.nm_korn%>
<%= curlistRec.posi_nm%>
<%= curlistRec.start_mm%>
<%= curlistRec.end_mm%>
<%= curlistRec.saly_st_mm%>
<%= curlistRec.saly_ed_mm%>
<%= curlistRec.dedu_amt%>
<%= curlistRec.lock_amt%>
<%= curlistRec.total_amt%>
<%= curlistRec.total_amt2%>
<%= curlistRec.saly_proc_yn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Nov 24 14:30:07 KST 2010 */