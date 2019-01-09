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


package chosun.ciis.as.aset.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.aset.dm.*;
import chosun.ciis.as.aset.rec.*;

/**
 * 
 */


public class AS_ASET_1500_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_budg_cd;
	public String xx_budg_nm;
	public String xx_mang_cd_4;
	public String xx_job_clsf_02;
	public String xx_cd_clsf;
	public String xx_occr_slip_clsf;

	public AS_ASET_1500_MDataSet(){}
	public AS_ASET_1500_MDataSet(String errcode, String errmsg, String xx_budg_cd, String xx_budg_nm, String xx_mang_cd_4, String xx_job_clsf_02, String xx_cd_clsf, String xx_occr_slip_clsf){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_budg_cd = xx_budg_cd;
		this.xx_budg_nm = xx_budg_nm;
		this.xx_mang_cd_4 = xx_mang_cd_4;
		this.xx_job_clsf_02 = xx_job_clsf_02;
		this.xx_cd_clsf = xx_cd_clsf;
		this.xx_occr_slip_clsf = xx_occr_slip_clsf;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_budg_cd(String xx_budg_cd){
		this.xx_budg_cd = xx_budg_cd;
	}

	public void setXx_budg_nm(String xx_budg_nm){
		this.xx_budg_nm = xx_budg_nm;
	}

	public void setXx_mang_cd_4(String xx_mang_cd_4){
		this.xx_mang_cd_4 = xx_mang_cd_4;
	}

	public void setXx_job_clsf_02(String xx_job_clsf_02){
		this.xx_job_clsf_02 = xx_job_clsf_02;
	}

	public void setXx_cd_clsf(String xx_cd_clsf){
		this.xx_cd_clsf = xx_cd_clsf;
	}

	public void setXx_occr_slip_clsf(String xx_occr_slip_clsf){
		this.xx_occr_slip_clsf = xx_occr_slip_clsf;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_budg_cd(){
		return this.xx_budg_cd;
	}

	public String getXx_budg_nm(){
		return this.xx_budg_nm;
	}

	public String getXx_mang_cd_4(){
		return this.xx_mang_cd_4;
	}

	public String getXx_job_clsf_02(){
		return this.xx_job_clsf_02;
	}

	public String getXx_cd_clsf(){
		return this.xx_cd_clsf;
	}

	public String getXx_occr_slip_clsf(){
		return this.xx_occr_slip_clsf;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_budg_cd = Util.checkString(cstmt.getString(5));
		this.xx_budg_nm = Util.checkString(cstmt.getString(6));
		this.xx_mang_cd_4 = Util.checkString(cstmt.getString(7));
		this.xx_job_clsf_02 = Util.checkString(cstmt.getString(8));
		this.xx_cd_clsf = Util.checkString(cstmt.getString(9));
		this.xx_occr_slip_clsf = Util.checkString(cstmt.getString(10));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AS_ASET_1500_MDataSet ds = (AS_ASET_1500_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_budg_cd()%>
<%= ds.getXx_budg_nm()%>
<%= ds.getXx_mang_cd_4()%>
<%= ds.getXx_job_clsf_02()%>
<%= ds.getXx_cd_clsf()%>
<%= ds.getXx_occr_slip_clsf()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 02 19:18:24 KST 2012 */