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


public class HD_LVCMPY_1302_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_LVCMPY_1302_LDataSet(){}
	public HD_LVCMPY_1302_LDataSet(String errcode, String errmsg){
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
			HD_LVCMPY_1302_LCURLISTRecord rec = new HD_LVCMPY_1302_LCURLISTRecord();
			rec.lvcmpy_mm_np = Util.checkString(rset0.getString("lvcmpy_mm_np"));
			rec.lvcmpy_mm_hlth_insr = Util.checkString(rset0.getString("lvcmpy_mm_hlth_insr"));
			rec.lvcmpy_mm_emp_insr = Util.checkString(rset0.getString("lvcmpy_mm_emp_insr"));
			rec.emp_insr_fee_drbk_amt = Util.checkString(rset0.getString("emp_insr_fee_drbk_amt"));
			rec.cnt = Util.checkString(rset0.getString("cnt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_LVCMPY_1302_LDataSet ds = (HD_LVCMPY_1302_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_LVCMPY_1302_LCURLISTRecord curlistRec = (HD_LVCMPY_1302_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.lvcmpy_mm_np%>
<%= curlistRec.lvcmpy_mm_hlth_insr%>
<%= curlistRec.lvcmpy_mm_emp_insr%>
<%= curlistRec.emp_insr_fee_drbk_amt%>
<%= curlistRec.cnt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Sep 07 22:29:44 KST 2009 */