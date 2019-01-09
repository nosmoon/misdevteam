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


package chosun.ciis.is.dep.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.dep.dm.*;
import chosun.ciis.is.dep.rec.*;

/**
 * 
 */


public class IS_DEP_1525_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String medi_cd;
	public String dlco_no;
	public String dlco_nm;
	public String precpt_amt_bal;
	public String mtry_dt;
	public String occr_amt;
	public String proc_clsf;

	public IS_DEP_1525_SDataSet(){}
	public IS_DEP_1525_SDataSet(String errcode, String errmsg, String medi_cd, String dlco_no, String dlco_nm, String precpt_amt_bal, String mtry_dt, String occr_amt, String proc_clsf){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.medi_cd = medi_cd;
		this.dlco_no = dlco_no;
		this.dlco_nm = dlco_nm;
		this.precpt_amt_bal = precpt_amt_bal;
		this.mtry_dt = mtry_dt;
		this.occr_amt = occr_amt;
		this.proc_clsf = proc_clsf;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setPrecpt_amt_bal(String precpt_amt_bal){
		this.precpt_amt_bal = precpt_amt_bal;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setOccr_amt(String occr_amt){
		this.occr_amt = occr_amt;
	}

	public void setProc_clsf(String proc_clsf){
		this.proc_clsf = proc_clsf;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getPrecpt_amt_bal(){
		return this.precpt_amt_bal;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getOccr_amt(){
		return this.occr_amt;
	}

	public String getProc_clsf(){
		return this.proc_clsf;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.medi_cd = Util.checkString(cstmt.getString(8));
		this.dlco_no = Util.checkString(cstmt.getString(9));
		this.dlco_nm = Util.checkString(cstmt.getString(10));
		this.precpt_amt_bal = Util.checkString(cstmt.getString(11));
		this.mtry_dt = Util.checkString(cstmt.getString(12));
		this.occr_amt = Util.checkString(cstmt.getString(13));
		this.proc_clsf = Util.checkString(cstmt.getString(14));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_DEP_1525_SDataSet ds = (IS_DEP_1525_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedi_cd()%>
<%= ds.getDlco_no()%>
<%= ds.getDlco_nm()%>
<%= ds.getPrecpt_amt_bal()%>
<%= ds.getMtry_dt()%>
<%= ds.getOccr_amt()%>
<%= ds.getProc_clsf()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 21 20:27:39 KST 2012 */