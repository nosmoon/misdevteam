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


package chosun.ciis.mc.budg.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_40500_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_clsf_cd;
	public String xx_crte_clsf;
	public String xx_clas_cd1_010;
	public String xx_clas_cd1_020;

	public MC_BUDG_40500_MDataSet(){}
	public MC_BUDG_40500_MDataSet(String errcode, String errmsg, String xx_clsf_cd, String xx_crte_clsf, String xx_clas_cd1_010, String xx_clas_cd1_020){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_clsf_cd = xx_clsf_cd;
		this.xx_crte_clsf = xx_crte_clsf;
		this.xx_clas_cd1_010 = xx_clas_cd1_010;
		this.xx_clas_cd1_020 = xx_clas_cd1_020;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_clsf_cd(String xx_clsf_cd){
		this.xx_clsf_cd = xx_clsf_cd;
	}

	public void setXx_crte_clsf(String xx_crte_clsf){
		this.xx_crte_clsf = xx_crte_clsf;
	}

	public void setXx_clas_cd1_010(String xx_clas_cd1_010){
		this.xx_clas_cd1_010 = xx_clas_cd1_010;
	}

	public void setXx_clas_cd1_020(String xx_clas_cd1_020){
		this.xx_clas_cd1_020 = xx_clas_cd1_020;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_clsf_cd(){
		return this.xx_clsf_cd;
	}

	public String getXx_crte_clsf(){
		return this.xx_crte_clsf;
	}

	public String getXx_clas_cd1_010(){
		return this.xx_clas_cd1_010;
	}

	public String getXx_clas_cd1_020(){
		return this.xx_clas_cd1_020;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_clsf_cd = Util.checkString(cstmt.getString(5));
		this.xx_crte_clsf = Util.checkString(cstmt.getString(6));
		this.xx_clas_cd1_010 = Util.checkString(cstmt.getString(7));
		this.xx_clas_cd1_020 = Util.checkString(cstmt.getString(8));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_BUDG_40500_MDataSet ds = (MC_BUDG_40500_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_clsf_cd()%>
<%= ds.getXx_crte_clsf()%>
<%= ds.getXx_clas_cd1_010()%>
<%= ds.getXx_clas_cd1_020()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 16 13:38:43 KST 2012 */