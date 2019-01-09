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


public class FC_ACCT_7011_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_7011_LDataSet(){}
	public FC_ACCT_7011_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(18);
		while(rset0.next()){
			FC_ACCT_7011_LCURLISTRecord rec = new FC_ACCT_7011_LCURLISTRecord();
			rec.acct_cd = Util.checkString(rset0.getString("acct_cd"));
			rec.slip_no = Util.checkString(rset0.getString("slip_no"));
			rec.fisc_dt = Util.checkString(rset0.getString("fisc_dt"));
			rec.use_amt = Util.checkString(rset0.getString("use_amt"));
			rec.rece_exp_clsf = Util.checkString(rset0.getString("rece_exp_clsf"));
			rec.rcpt_clsf = Util.checkString(rset0.getString("rcpt_clsf"));
			rec.card_mang_no = Util.checkString(rset0.getString("card_mang_no"));
			rec.use_pers_emp_no = Util.checkString(rset0.getString("use_pers_emp_no"));
			rec.rmks1 = Util.checkString(rset0.getString("rmks1"));
			rec.rmks2 = Util.checkString(rset0.getString("rmks2"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.use_dt = Util.checkString(rset0.getString("use_dt"));
			rec.attd_fee = Util.checkString(rset0.getString("attd_fee"));
			rec.prof_type_cd = Util.checkString(rset0.getString("prof_type_cd"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.erplace_addr = Util.checkString(rset0.getString("erplace_addr"));
			rec.firm_nm = Util.checkString(rset0.getString("firm_nm"));
			rec.presi_nm = Util.checkString(rset0.getString("presi_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_7011_LDataSet ds = (FC_ACCT_7011_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_7011_LCURLISTRecord curlistRec = (FC_ACCT_7011_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.acct_cd%>
<%= curlistRec.slip_no%>
<%= curlistRec.fisc_dt%>
<%= curlistRec.use_amt%>
<%= curlistRec.rece_exp_clsf%>
<%= curlistRec.rcpt_clsf%>
<%= curlistRec.card_mang_no%>
<%= curlistRec.use_pers_emp_no%>
<%= curlistRec.rmks1%>
<%= curlistRec.rmks2%>
<%= curlistRec.budg_cd%>
<%= curlistRec.use_dt%>
<%= curlistRec.attd_fee%>
<%= curlistRec.prof_type_cd%>
<%= curlistRec.ern%>
<%= curlistRec.prn%>
<%= curlistRec.erplace_addr%>
<%= curlistRec.firm_nm%>
<%= curlistRec.presi_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Feb 06 15:09:48 KST 2009 */