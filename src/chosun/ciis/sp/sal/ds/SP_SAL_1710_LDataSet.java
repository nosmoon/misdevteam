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


package chosun.ciis.sp.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sal.dm.*;
import chosun.ciis.sp.sal.rec.*;

/**
 * 
 */


public class SP_SAL_1710_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SP_SAL_1710_LDataSet(){}
	public SP_SAL_1710_LDataSet(String errcode, String errmsg){
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
			SP_SAL_1710_LCURLISTRecord rec = new SP_SAL_1710_LCURLISTRecord();
			rec.sale_yymm = Util.checkString(rset0.getString("sale_yymm"));
			rec.cnt = Util.checkString(rset0.getString("cnt"));
			rec.sale_amt = Util.checkString(rset0.getString("sale_amt"));
			rec.vat_amt = Util.checkString(rset0.getString("vat_amt"));
			rec.stot_amt = Util.checkString(rset0.getString("stot_amt"));
			rec.clos_yn = Util.checkString(rset0.getString("clos_yn"));
			rec.clos_proc_dt = Util.checkString(rset0.getString("clos_proc_dt"));
			rec.actu_slip_no = Util.checkString(rset0.getString("actu_slip_no"));
			rec.clos_pers_emp_nm = Util.checkString(rset0.getString("clos_pers_emp_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SP_SAL_1710_LDataSet ds = (SP_SAL_1710_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SP_SAL_1710_LCURLISTRecord curlistRec = (SP_SAL_1710_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.sale_yymm%>
<%= curlistRec.cnt%>
<%= curlistRec.sale_amt%>
<%= curlistRec.vat_amt%>
<%= curlistRec.stot_amt%>
<%= curlistRec.clos_yn%>
<%= curlistRec.clos_proc_dt%>
<%= curlistRec.actu_slip_no%>
<%= curlistRec.clos_pers_emp_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 19 19:48:11 KST 2012 */