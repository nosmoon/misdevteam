

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


public class HD_EDU_2100_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_EDU_2100_LDataSet(){}
	public HD_EDU_2100_LDataSet(String errcode, String errmsg){
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
			HD_EDU_2100_LCURLISTRecord rec = new HD_EDU_2100_LCURLISTRecord();
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.rptv_posi_nm = Util.checkString(rset0.getString("rptv_posi_nm"));
			rec.cour_yyyymm = Util.checkString(rset0.getString("cour_yyyymm"));
			rec.cour_lng_cd_nm = Util.checkString(rset0.getString("cour_lng_cd_nm"));
			rec.cour_obj_cd_nm = Util.checkString(rset0.getString("cour_obj_cd_nm"));
			rec.cour_tm_cd_nm = Util.checkString(rset0.getString("cour_tm_cd_nm"));
			rec.lv_cd_nm = Util.checkString(rset0.getString("lv_cd_nm"));
			rec.lv_test_req_cd_nm = Util.checkString(rset0.getString("lv_test_req_cd_nm"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_EDU_2100_LDataSet ds = (HD_EDU_2100_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_EDU_2100_LCURLISTRecord curlistRec = (HD_EDU_2100_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.emp_no%>
<%= curlistRec.flnm%>
<%= curlistRec.rptv_posi_nm%>
<%= curlistRec.cour_yyyymm%>
<%= curlistRec.cour_lng_cd_nm%>
<%= curlistRec.cour_obj_cd_nm%>
<%= curlistRec.cour_tm_cd_nm%>
<%= curlistRec.lv_cd_nm%>
<%= curlistRec.lv_test_req_cd_nm%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 11 10:23:25 KST 2011 */