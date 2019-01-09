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


package chosun.ciis.ad.common.ds;

import java.sql.CallableStatement;
import java.sql.SQLException;

import somo.framework.util.Util;

/**
 * 
 */


public class AD_CO_9008_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String dlco_clsf;
	public String srch_nm;
	public String srch_cd;
	public String chk_cnt;

	public AD_CO_9008_SDataSet(){}
	public AD_CO_9008_SDataSet(String errcode, String errmsg, String dlco_clsf, String srch_nm, String srch_cd, String chk_cnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.dlco_clsf = dlco_clsf;
		this.srch_nm = srch_nm;
		this.srch_cd = srch_cd;
		this.chk_cnt = chk_cnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setSrch_nm(String srch_nm){
		this.srch_nm = srch_nm;
	}

	public void setSrch_cd(String srch_cd){
		this.srch_cd = srch_cd;
	}

	public void setChk_cnt(String chk_cnt){
		this.chk_cnt = chk_cnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getSrch_nm(){
		return this.srch_nm;
	}

	public String getSrch_cd(){
		return this.srch_cd;
	}

	public String getChk_cnt(){
		return this.chk_cnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.dlco_clsf = Util.checkString(cstmt.getString(5));
		this.srch_nm = Util.checkString(cstmt.getString(6));
		this.srch_cd = Util.checkString(cstmt.getString(7));
		this.chk_cnt = Util.checkString(cstmt.getString(8));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_CO_9008_SDataSet ds = (AD_CO_9008_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDlco_clsf()%>
<%= ds.getSrch_nm()%>
<%= ds.getSrch_cd()%>
<%= ds.getChk_cnt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 25 17:25:04 KST 2009 */