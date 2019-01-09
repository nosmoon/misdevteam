/***************************************************************************************************
* 파일명 : .java
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


package chosun.ciis.hd.lvcmpy.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.rec.*;

/**
 * 
 */


public class HD_LVCMPY_3600_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_LVCMPY_3600_LDataSet(){}
	public HD_LVCMPY_3600_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			HD_LVCMPY_3600_LCURLISTRecord rec = new HD_LVCMPY_3600_LCURLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.priv_lvcmpy_saly_estm_amt = Util.checkString(rset0.getString("priv_lvcmpy_saly_estm_amt"));
			rec.this_month_out_amt = Util.checkString(rset0.getString("this_month_out_amt"));
			rec.lvcmpy_saly_estm_amt = Util.checkString(rset0.getString("lvcmpy_saly_estm_amt"));
			rec.set_amt = Util.checkString(rset0.getString("set_amt"));
			rec.last_month_sum = Util.checkString(rset0.getString("last_month_sum"));
			rec.diff_amt = Util.checkString(rset0.getString("diff_amt"));
			rec.this_month_in_amt = Util.checkString(rset0.getString("this_month_in_amt"));
			rec.this_year_sum = Util.checkString(rset0.getString("this_year_sum"));
			rec.total_year_sum = Util.checkString(rset0.getString("total_year_sum"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_LVCMPY_3600_LDataSet ds = (HD_LVCMPY_3600_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_LVCMPY_3600_LCURLISTRecord curlistRec = (HD_LVCMPY_3600_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.emp_no%>
<%= curlistRec.nm_korn%>
<%= curlistRec.priv_lvcmpy_saly_estm_amt%>
<%= curlistRec.this_month_out_amt%>
<%= curlistRec.lvcmpy_saly_estm_amt%>
<%= curlistRec.set_amt%>
<%= curlistRec.last_month_sum%>
<%= curlistRec.diff_amt%>
<%= curlistRec.this_month_in_amt%>
<%= curlistRec.this_year_sum%>
<%= curlistRec.total_year_sum%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 09 15:05:55 KST 2012 */