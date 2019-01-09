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


public class FC_ACCT_2450_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2450_LDataSet(){}
	public FC_ACCT_2450_LDataSet(String errcode, String errmsg){
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
			FC_ACCT_2450_LCURCOMMLISTRecord rec = new FC_ACCT_2450_LCURCOMMLISTRecord();
			rec.titl = Util.checkString(rset0.getString("titl"));
			rec.reso_amt = Util.checkString(rset0.getString("reso_amt"));
			rec.impt_expn_clsf = Util.checkString(rset0.getString("impt_expn_clsf"));
			rec.proc_clsf = Util.checkString(rset0.getString("proc_clsf"));
			rec.proc_clsf_nm = Util.checkString(rset0.getString("proc_clsf_nm"));
			rec.proc_dt_tm = Util.checkString(rset0.getString("proc_dt_tm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.incmg_pers_ipadd = Util.checkString(rset0.getString("incmg_pers_ipadd"));
			this.curcommlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2450_LDataSet ds = (FC_ACCT_2450_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		FC_ACCT_2450_LCURCOMMLISTRecord curcommlistRec = (FC_ACCT_2450_LCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.titl%>
<%= curcommlistRec.reso_amt%>
<%= curcommlistRec.impt_expn_clsf%>
<%= curcommlistRec.proc_clsf%>
<%= curcommlistRec.proc_clsf_nm%>
<%= curcommlistRec.proc_dt_tm%>
<%= curcommlistRec.emp_no%>
<%= curcommlistRec.nm_korn%>
<%= curcommlistRec.incmg_pers_ipadd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 15 21:25:24 KST 2009 */