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


package chosun.ciis.fc.acct.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_2112_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String actu_slip_no;

	public FC_ACCT_2112_LDataSet(){}
	public FC_ACCT_2112_LDataSet(String errcode, String errmsg, String actu_slip_no){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.actu_slip_no = actu_slip_no;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.actu_slip_no = Util.checkString(cstmt.getString(9));
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			FC_ACCT_2112_LCURLISTRecord rec = new FC_ACCT_2112_LCURLISTRecord();
			rec.supr_dept_nm = Util.checkString(rset0.getString("supr_dept_nm"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.emp_nm = Util.checkString(rset0.getString("emp_nm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.in_cmpy_dt = Util.checkString(rset0.getString("in_cmpy_dt"));
			rec.lv_cmpy_dt = Util.checkString(rset0.getString("lv_cmpy_dt"));
			rec.sply_basi_cd = Util.checkString(rset0.getString("sply_basi_cd"));
			rec.duty_dds = Util.checkString(rset0.getString("duty_dds"));
			rec.sply_basi_amt = Util.checkString(rset0.getString("sply_basi_amt"));
			rec.sply_amt = Util.checkString(rset0.getString("sply_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2112_LDataSet ds = (FC_ACCT_2112_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2112_LCURLISTRecord curlistRec = (FC_ACCT_2112_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getActu_slip_no()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.supr_dept_nm%>
<%= curlistRec.dept_nm%>
<%= curlistRec.emp_nm%>
<%= curlistRec.emp_no%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_nm%>
<%= curlistRec.in_cmpy_dt%>
<%= curlistRec.lv_cmpy_dt%>
<%= curlistRec.sply_basi_cd%>
<%= curlistRec.duty_dds%>
<%= curlistRec.sply_basi_amt%>
<%= curlistRec.spsl_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 22 18:09:19 KST 2013 */