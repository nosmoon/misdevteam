

package chosun.ciis.hd.info.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_2300_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_INFO_2300_LDataSet(){}
	public HD_INFO_2300_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			HD_INFO_2300_LCURLIST1Record rec = new HD_INFO_2300_LCURLIST1Record();
			rec.rownum = Util.checkString(rset0.getString("rownum"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.rptv_posi_cd = Util.checkString(rset0.getString("rptv_posi_cd"));
			rec.emp_srt_seq = Util.checkString(rset0.getString("emp_srt_seq"));
			rec.emp_album_clsf = Util.checkString(rset0.getString("emp_album_clsf"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_INFO_2300_LDataSet ds = (HD_INFO_2300_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_INFO_2300_LCURLIST1Record curlist1Rec = (HD_INFO_2300_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.rownum%>
<%= curlist1Rec.emp_no%>
<%= curlist1Rec.nm_korn%>
<%= curlist1Rec.dept_nm%>
<%= curlist1Rec.dty_nm%>
<%= curlist1Rec.posi_nm%>
<%= curlist1Rec.rptv_posi_cd%>
<%= curlist1Rec.emp_srt_seq%>
<%= curlist1Rec.emp_album_clsf%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 12 14:50:11 KST 2010 */