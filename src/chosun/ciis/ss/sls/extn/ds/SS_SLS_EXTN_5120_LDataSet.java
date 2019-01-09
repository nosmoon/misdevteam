/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_SLS_EXTN_5120_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_SLS_EXTN_5120_LDataSet(){}
	public SS_SLS_EXTN_5120_LDataSet(String errcode, String errmsg){
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
			SS_SLS_EXTN_5120_LCURCOMMLISTRecord rec = new SS_SLS_EXTN_5120_LCURCOMMLISTRecord();
			rec.dncomp = Util.checkString(rset0.getString("dncomp"));
			rec.dncompnm = Util.checkString(rset0.getString("dncompnm"));
			rec.adv_deptnm = Util.checkString(rset0.getString("adv_deptnm"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.tax_no = Util.checkString(rset0.getString("tax_no"));
			rec.suply_amt = Util.checkString(rset0.getString("suply_amt"));
			rec.vat_amt = Util.checkString(rset0.getString("vat_amt"));
			rec.sum_amt = Util.checkString(rset0.getString("sum_amt"));
			rec.prx_amt = Util.checkString(rset0.getString("prx_amt"));
			rec.net_inc_amt = Util.checkString(rset0.getString("net_inc_amt"));
			rec.rcpm_amt = Util.checkString(rset0.getString("rcpm_amt"));
			rec.rcpm_slip_no = Util.checkString(rset0.getString("rcpm_slip_no"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.budg_nm = Util.checkString(rset0.getString("budg_nm"));
			this.curcommlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_SLS_EXTN_5120_LDataSet ds = (SS_SLS_EXTN_5120_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_SLS_EXTN_5120_LCURCOMMLISTRecord curcommlistRec = (SS_SLS_EXTN_5120_LCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.dncomp%>
<%= curcommlistRec.dncompnm%>
<%= curcommlistRec.adv_deptnm%>
<%= curcommlistRec.ern%>
<%= curcommlistRec.dlco_nm%>
<%= curcommlistRec.tax_no%>
<%= curcommlistRec.suply_amt%>
<%= curcommlistRec.vat_amt%>
<%= curcommlistRec.sum_amt%>
<%= curcommlistRec.prx_amt%>
<%= curcommlistRec.net_inc_amt%>
<%= curcommlistRec.rcpm_amt%>
<%= curcommlistRec.rcpm_slip_no%>
<%= curcommlistRec.budg_cd%>
<%= curcommlistRec.budg_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Oct 04 16:14:54 KST 2016 */