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


public class FC_ACCT_2022_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2022_LDataSet(){}
	public FC_ACCT_2022_LDataSet(String errcode, String errmsg){
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
			FC_ACCT_2022_LCURLISTRecord rec = new FC_ACCT_2022_LCURLISTRecord();
			rec.old_dlco_clsf_cd = Util.checkString(rset0.getString("old_dlco_clsf_cd"));
			rec.old_dlco_cd = Util.checkString(rset0.getString("old_dlco_cd"));
			rec.pubc_dt = Util.checkString(rset0.getString("pubc_dt"));
			rec.incm_clsf_cd = Util.checkString(rset0.getString("incm_clsf_cd"));
			rec.nosh = Util.checkString(rset0.getString("nosh"));
			rec.uprc = Util.checkString(rset0.getString("uprc"));
			rec.atic_fee = Util.checkString(rset0.getString("atic_fee"));
			rec.coms = Util.checkString(rset0.getString("coms"));
			rec.with_tax = Util.checkString(rset0.getString("with_tax"));
			rec.atic_nm = Util.checkString(rset0.getString("atic_nm"));
			rec.incm_tax = Util.checkString(rset0.getString("incm_tax"));
			rec.res_tax = Util.checkString(rset0.getString("res_tax"));
			rec.pch_compnm = Util.checkString(rset0.getString("pch_compnm"));
			rec.pubc_side = Util.checkString(rset0.getString("pubc_side"));
			rec.cal_pay_amt = Util.checkString(rset0.getString("cal_pay_amt"));
			rec.bank_clsf = Util.checkString(rset0.getString("bank_clsf"));
			rec.acct_no = Util.checkString(rset0.getString("acct_no"));
			rec.deps_pers_nm = Util.checkString(rset0.getString("deps_pers_nm"));
			rec.dtls_medi_cd = Util.checkString(rset0.getString("dtls_medi_cd"));
			rec.dtls_medi_cdnm = Util.checkString(rset0.getString("dtls_medi_cdnm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2022_LDataSet ds = (FC_ACCT_2022_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2022_LCURLISTRecord curlistRec = (FC_ACCT_2022_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.old_dlco_clsf_cd%>
<%= curlistRec.old_dlco_cd%>
<%= curlistRec.pubc_dt%>
<%= curlistRec.incm_clsf_cd%>
<%= curlistRec.nosh%>
<%= curlistRec.uprc%>
<%= curlistRec.atic_fee%>
<%= curlistRec.coms%>
<%= curlistRec.with_tax%>
<%= curlistRec.atic_nm%>
<%= curlistRec.incm_tax%>
<%= curlistRec.res_tax%>
<%= curlistRec.pch_compnm%>
<%= curlistRec.pubc_side%>
<%= curlistRec.cal_pay_amt%>
<%= curlistRec.bank_clsf%>
<%= curlistRec.acct_no%>
<%= curlistRec.deps_pers_nm%>
<%= curlistRec.dtls_medi_cd%>
<%= curlistRec.dtls_medi_cdnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 01 21:19:23 KST 2009 */