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


public class FC_ACCT_2901_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList src_tax_list = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2901_LDataSet(){}
	public FC_ACCT_2901_LDataSet(String errcode, String errmsg){
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
			FC_ACCT_2901_LSRC_TAX_LISTRecord rec = new FC_ACCT_2901_LSRC_TAX_LISTRecord();
			rec.check1 = Util.checkString(rset0.getString("check1"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.atic_fee = Util.checkString(rset0.getString("atic_fee"));
			rec.incm_clsf_nm = Util.checkString(rset0.getString("incm_clsf_nm"));
			rec.incm_tax = Util.checkString(rset0.getString("incm_tax"));
			rec.res_tax = Util.checkString(rset0.getString("res_tax"));
			rec.cal_pay_amt = Util.checkString(rset0.getString("cal_pay_amt"));
			this.src_tax_list.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2901_LDataSet ds = (FC_ACCT_2901_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.src_tax_list.size(); i++){
		FC_ACCT_2901_LSRC_TAX_LISTRecord src_tax_listRec = (FC_ACCT_2901_LSRC_TAX_LISTRecord)ds.src_tax_list.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSrc_tax_list()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= src_tax_listRec.check1%>
<%= src_tax_listRec.dlco_nm%>
<%= src_tax_listRec.dlco_cd%>
<%= src_tax_listRec.atic_fee%>
<%= src_tax_listRec.incm_clsf_nm%>
<%= src_tax_listRec.incm_tax%>
<%= src_tax_listRec.res_tax%>
<%= src_tax_listRec.cal_pay_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 18 10:18:59 KST 2009 */