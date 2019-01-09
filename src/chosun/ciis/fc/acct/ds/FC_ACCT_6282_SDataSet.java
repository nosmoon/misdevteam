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


public class FC_ACCT_6282_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList cur_vatdeclstmt_list_1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String vat_fr_yymm;
	public String vat_to_yymm;
	public String clos_yn;

	public FC_ACCT_6282_SDataSet(){}
	public FC_ACCT_6282_SDataSet(String errcode, String errmsg, String vat_fr_yymm, String vat_to_yymm, String clos_yn){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.vat_fr_yymm = vat_fr_yymm;
		this.vat_to_yymm = vat_to_yymm;
		this.clos_yn = clos_yn;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setVat_fr_yymm(String vat_fr_yymm){
		this.vat_fr_yymm = vat_fr_yymm;
	}

	public void setVat_to_yymm(String vat_to_yymm){
		this.vat_to_yymm = vat_to_yymm;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getVat_fr_yymm(){
		return this.vat_fr_yymm;
	}

	public String getVat_to_yymm(){
		return this.vat_to_yymm;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			FC_ACCT_6282_SCUR_VATDECLSTMT_LIST_1Record rec = new FC_ACCT_6282_SCUR_VATDECLSTMT_LIST_1Record();
			rec.erplace_cd = Util.checkString(rset0.getString("erplace_cd"));
			rec.form_no = Util.checkString(rset0.getString("form_no"));
			rec.form_nm = Util.checkString(rset0.getString("form_nm"));
			rec.make_yn = Util.checkString(rset0.getString("make_yn"));
			this.cur_vatdeclstmt_list_1.add(rec);
		}
		this.vat_fr_yymm = Util.checkString(cstmt.getString(11));
		this.vat_to_yymm = Util.checkString(cstmt.getString(12));
		this.clos_yn = Util.checkString(cstmt.getString(13));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_6282_SDataSet ds = (FC_ACCT_6282_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.cur_vatdeclstmt_list_1.size(); i++){
		FC_ACCT_6282_SCUR_VATDECLSTMT_LIST_1Record cur_vatdeclstmt_list_1Rec = (FC_ACCT_6282_SCUR_VATDECLSTMT_LIST_1Record)ds.cur_vatdeclstmt_list_1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCur_vatdeclstmt_list_1()%>
<%= ds.getVat_fr_yymm()%>
<%= ds.getVat_to_yymm()%>
<%= ds.getClos_yn()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= cur_vatdeclstmt_list_1Rec.erplace_cd%>
<%= cur_vatdeclstmt_list_1Rec.form_no%>
<%= cur_vatdeclstmt_list_1Rec.form_nm%>
<%= cur_vatdeclstmt_list_1Rec.make_yn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 23 21:17:17 KST 2014 */