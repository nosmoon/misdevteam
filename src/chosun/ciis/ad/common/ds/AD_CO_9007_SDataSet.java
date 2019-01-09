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


public class AD_CO_9007_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String slcrg_pers;
	public String slcrg_pers_nm;
	public String dept_cd;
	public String dept_nm;
	public String mchrg_pers;
	public String mchrg_pers_nm;
	public String grp_cmpy_cd;
	public String indt_cd;
	public String indt_nm;
	public String type_cd;
	public String type_nm;

	public AD_CO_9007_SDataSet(){}
	public AD_CO_9007_SDataSet(String errcode, String errmsg, String slcrg_pers, String slcrg_pers_nm, String dept_cd, String dept_nm, String mchrg_pers, String mchrg_pers_nm, String grp_cmpy_cd, String indt_cd, String indt_nm, String type_cd, String type_nm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.slcrg_pers = slcrg_pers;
		this.slcrg_pers_nm = slcrg_pers_nm;
		this.dept_cd = dept_cd;
		this.dept_nm = dept_nm;
		this.mchrg_pers = mchrg_pers;
		this.mchrg_pers_nm = mchrg_pers_nm;
		this.grp_cmpy_cd = grp_cmpy_cd;
		this.indt_cd = indt_cd;
		this.indt_nm = indt_nm;
		this.type_cd = type_cd;
		this.type_nm = type_nm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public void setSlcrg_pers_nm(String slcrg_pers_nm){
		this.slcrg_pers_nm = slcrg_pers_nm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
	}

	public void setMchrg_pers_nm(String mchrg_pers_nm){
		this.mchrg_pers_nm = mchrg_pers_nm;
	}

	public void setGrp_cmpy_cd(String grp_cmpy_cd){
		this.grp_cmpy_cd = grp_cmpy_cd;
	}
	
	public void setIndt_cd(String indt_cd){
		this.indt_cd = indt_cd;
	}
	
	public void setIndt_nm(String indt_nm){
		this.indt_nm = indt_nm;
	}
	
	public void setType_cd(String type_cd){
		this.type_cd = type_cd;
	}
	
	public void setType_nm(String type_nm){
		this.type_nm = type_nm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getSlcrg_pers_nm(){
		return this.slcrg_pers_nm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
	}

	public String getMchrg_pers_nm(){
		return this.mchrg_pers_nm;
	}

	public String getGrp_cmpy_cd(){
		return this.grp_cmpy_cd;
	}
	
	public String getIndt_cd(){
		return this.indt_cd;
	}
	
	public String getIndt_nm(){
		return this.indt_nm;
	}
	
	public String getType_cd(){
		return this.type_cd;
	}
	
	public String getType_nm(){
		return this.type_nm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.slcrg_pers = Util.checkString(cstmt.getString(5));
		this.slcrg_pers_nm = Util.checkString(cstmt.getString(6));
		this.dept_cd = Util.checkString(cstmt.getString(7));
		this.dept_nm = Util.checkString(cstmt.getString(8));
		this.mchrg_pers = Util.checkString(cstmt.getString(9));
		this.mchrg_pers_nm = Util.checkString(cstmt.getString(10));
		this.grp_cmpy_cd = Util.checkString(cstmt.getString(11));
		this.indt_cd = Util.checkString(cstmt.getString(12));
		this.indt_nm = Util.checkString(cstmt.getString(13));
		this.type_cd = Util.checkString(cstmt.getString(14));
		this.type_nm = Util.checkString(cstmt.getString(15));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_CO_9007_SDataSet ds = (AD_CO_9007_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSlcrg_pers()%>
<%= ds.getSlcrg_pers_nm()%>
<%= ds.getDept_cd()%>
<%= ds.getDept_nm()%>
<%= ds.getMchrg_pers()%>
<%= ds.getMchrg_pers_nm()%>
<%= ds.getGrp_cmpy_cd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 11 10:22:22 KST 2009 */