/***************************************************************************************************
* 파일명 : 
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


package chosun.ciis.se.boi.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.rec.*;

/**
 * 
 */


public class SE_BOI_2510_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_BOI_2510_LDataSet(){}
	public SE_BOI_2510_LDataSet(String errcode, String errmsg){
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

		ResultSet rset8 = (ResultSet) cstmt.getObject(11);
		while(rset8.next()){
			SE_BOI_2510_LCURLISTRecord rec = new SE_BOI_2510_LCURLISTRecord();
			rec.occr_dt = Util.checkString(rset8.getString("occr_dt"));
			rec.slip_clsf = Util.checkString(rset8.getString("slip_clsf"));
			rec.seq = Util.checkString(rset8.getString("seq"));
			rec.dept_cd = Util.checkString(rset8.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset8.getString("dept_nm"));
			rec.area_cd = Util.checkString(rset8.getString("area_cd"));
			rec.rcpm_dt = Util.checkString(rset8.getString("rcpm_dt"));
			rec.cnt = Util.checkString(rset8.getString("cnt"));
			rec.actu_slip_no = Util.checkString(rset8.getString("actu_slip_no"));
			rec.acct_slip_no = Util.checkString(rset8.getString("acct_slip_no"));
			rec.rcpm_amt = Util.checkString(rset8.getString("rcpm_amt"));
			rec.clos_yn = Util.checkString(rset8.getString("clos_yn"));
			rec.bank_cd = Util.checkString(rset8.getString("bank_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_BOI_2510_LDataSet ds = (SE_BOI_2510_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_BOI_2510_LCURLISTRecord curlistRec = (SE_BOI_2510_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.occr_dt%>
<%= curlistRec.slip_clsf%>
<%= curlistRec.seq%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.area_cd%>
<%= curlistRec.rcpm_dt%>
<%= curlistRec.cnt%>
<%= curlistRec.actu_slip_no%>
<%= curlistRec.acct_slip_no%>
<%= curlistRec.rcpm_amt%>
<%= curlistRec.clos_yn%>
<%= curlistRec.bank_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 14 16:15:43 KST 2009 */