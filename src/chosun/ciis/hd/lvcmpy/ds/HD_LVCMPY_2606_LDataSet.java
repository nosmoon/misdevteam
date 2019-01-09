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


public class HD_LVCMPY_2606_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_LVCMPY_2606_LDataSet(){}
	public HD_LVCMPY_2606_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			HD_LVCMPY_2606_LCURLISTRecord rec = new HD_LVCMPY_2606_LCURLISTRecord();
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.ernm = Util.checkString(rset0.getString("ernm"));
			rec.ern_no = Util.checkString(rset0.getString("ern_no"));
			rec.acct_no = Util.checkString(rset0.getString("acct_no"));
			rec.lgl_rcpm_amt = Util.checkString(rset0.getString("lgl_rcpm_amt"));
			rec.rcpm_amt = Util.checkString(rset0.getString("rcpm_amt"));
			rec.rcpm_dt = Util.checkString(rset0.getString("rcpm_dt"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.irp_amt = Util.checkString(rset0.getString("irp_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_LVCMPY_2606_LDataSet ds = (HD_LVCMPY_2606_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_LVCMPY_2606_LCURLISTRecord curlistRec = (HD_LVCMPY_2606_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.ernm%>
<%= curlistRec.ern_no%>
<%= curlistRec.acct_no%>
<%= curlistRec.lgl_rcpm_amt%>
<%= curlistRec.rcpm_amt%>
<%= curlistRec.rcpm_dt%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.irp_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 12 20:43:21 KST 2013 */