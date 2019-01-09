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


package chosun.ciis.mc.co.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.co.dm.*;
import chosun.ciis.mc.co.rec.*;

/**
 * 
 */


public class MC_CO_2070_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_budg_type_cd_010;
	public String xx_budg_type_cd_020;
	public String xx_budg_type_cd_030;
	public String xx_budg_cd_010;
	public String xx_budg_cd_020;
	public String xx_budg_cd_030;
	public String xx_budg_cd_040;
	public String xx_budg_cd_050;
	public String xx_budg_cd_060;
	public String xx_from_clas_cd1_010;
	public String xx_to_clas_cd1_010;
	public String xx_from_clas_cd1_020;
	public String xx_to_clas_cd1_020;

	public MC_CO_2070_MDataSet(){}
	public MC_CO_2070_MDataSet(String errcode, String errmsg, String xx_budg_type_cd_010, String xx_budg_type_cd_020, String xx_budg_type_cd_030, String xx_budg_cd_010, String xx_budg_cd_020, String xx_budg_cd_030, String xx_budg_cd_040, String xx_budg_cd_050, String xx_budg_cd_060, String xx_from_clas_cd1_010, String xx_to_clas_cd1_010, String xx_from_clas_cd1_020, String xx_to_clas_cd1_020){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_budg_type_cd_010 = xx_budg_type_cd_010;
		this.xx_budg_type_cd_020 = xx_budg_type_cd_020;
		this.xx_budg_type_cd_030 = xx_budg_type_cd_030;
		this.xx_budg_cd_010 = xx_budg_cd_010;
		this.xx_budg_cd_020 = xx_budg_cd_020;
		this.xx_budg_cd_030 = xx_budg_cd_030;
		this.xx_budg_cd_040 = xx_budg_cd_040;
		this.xx_budg_cd_050 = xx_budg_cd_050;
		this.xx_budg_cd_060 = xx_budg_cd_060;
		this.xx_from_clas_cd1_010 = xx_from_clas_cd1_010;
		this.xx_to_clas_cd1_010 = xx_to_clas_cd1_010;
		this.xx_from_clas_cd1_020 = xx_from_clas_cd1_020;
		this.xx_to_clas_cd1_020 = xx_to_clas_cd1_020;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_budg_type_cd_010(String xx_budg_type_cd_010){
		this.xx_budg_type_cd_010 = xx_budg_type_cd_010;
	}

	public void setXx_budg_type_cd_020(String xx_budg_type_cd_020){
		this.xx_budg_type_cd_020 = xx_budg_type_cd_020;
	}

	public void setXx_budg_type_cd_030(String xx_budg_type_cd_030){
		this.xx_budg_type_cd_030 = xx_budg_type_cd_030;
	}

	public void setXx_budg_cd_010(String xx_budg_cd_010){
		this.xx_budg_cd_010 = xx_budg_cd_010;
	}

	public void setXx_budg_cd_020(String xx_budg_cd_020){
		this.xx_budg_cd_020 = xx_budg_cd_020;
	}

	public void setXx_budg_cd_030(String xx_budg_cd_030){
		this.xx_budg_cd_030 = xx_budg_cd_030;
	}

	public void setXx_budg_cd_040(String xx_budg_cd_040){
		this.xx_budg_cd_040 = xx_budg_cd_040;
	}

	public void setXx_budg_cd_050(String xx_budg_cd_050){
		this.xx_budg_cd_050 = xx_budg_cd_050;
	}

	public void setXx_budg_cd_060(String xx_budg_cd_060){
		this.xx_budg_cd_060 = xx_budg_cd_060;
	}

	public void setXx_from_clas_cd1_010(String xx_from_clas_cd1_010){
		this.xx_from_clas_cd1_010 = xx_from_clas_cd1_010;
	}

	public void setXx_to_clas_cd1_010(String xx_to_clas_cd1_010){
		this.xx_to_clas_cd1_010 = xx_to_clas_cd1_010;
	}

	public void setXx_from_clas_cd1_020(String xx_from_clas_cd1_020){
		this.xx_from_clas_cd1_020 = xx_from_clas_cd1_020;
	}

	public void setXx_to_clas_cd1_020(String xx_to_clas_cd1_020){
		this.xx_to_clas_cd1_020 = xx_to_clas_cd1_020;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_budg_type_cd_010(){
		return this.xx_budg_type_cd_010;
	}

	public String getXx_budg_type_cd_020(){
		return this.xx_budg_type_cd_020;
	}

	public String getXx_budg_type_cd_030(){
		return this.xx_budg_type_cd_030;
	}

	public String getXx_budg_cd_010(){
		return this.xx_budg_cd_010;
	}

	public String getXx_budg_cd_020(){
		return this.xx_budg_cd_020;
	}

	public String getXx_budg_cd_030(){
		return this.xx_budg_cd_030;
	}

	public String getXx_budg_cd_040(){
		return this.xx_budg_cd_040;
	}

	public String getXx_budg_cd_050(){
		return this.xx_budg_cd_050;
	}

	public String getXx_budg_cd_060(){
		return this.xx_budg_cd_060;
	}

	public String getXx_from_clas_cd1_010(){
		return this.xx_from_clas_cd1_010;
	}

	public String getXx_to_clas_cd1_010(){
		return this.xx_to_clas_cd1_010;
	}

	public String getXx_from_clas_cd1_020(){
		return this.xx_from_clas_cd1_020;
	}

	public String getXx_to_clas_cd1_020(){
		return this.xx_to_clas_cd1_020;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_budg_type_cd_010 = Util.checkString(cstmt.getString(5));
		this.xx_budg_type_cd_020 = Util.checkString(cstmt.getString(6));
		this.xx_budg_type_cd_030 = Util.checkString(cstmt.getString(7));
		this.xx_budg_cd_010 = Util.checkString(cstmt.getString(8));
		this.xx_budg_cd_020 = Util.checkString(cstmt.getString(9));
		this.xx_budg_cd_030 = Util.checkString(cstmt.getString(10));
		this.xx_budg_cd_040 = Util.checkString(cstmt.getString(11));
		this.xx_budg_cd_050 = Util.checkString(cstmt.getString(12));
		this.xx_budg_cd_060 = Util.checkString(cstmt.getString(13));
		this.xx_from_clas_cd1_010 = Util.checkString(cstmt.getString(14));
		this.xx_to_clas_cd1_010 = Util.checkString(cstmt.getString(15));
		this.xx_from_clas_cd1_020 = Util.checkString(cstmt.getString(16));
		this.xx_to_clas_cd1_020 = Util.checkString(cstmt.getString(17));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_CO_2070_MDataSet ds = (MC_CO_2070_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_budg_type_cd_010()%>
<%= ds.getXx_budg_type_cd_020()%>
<%= ds.getXx_budg_type_cd_030()%>
<%= ds.getXx_budg_cd_010()%>
<%= ds.getXx_budg_cd_020()%>
<%= ds.getXx_budg_cd_030()%>
<%= ds.getXx_budg_cd_040()%>
<%= ds.getXx_budg_cd_050()%>
<%= ds.getXx_budg_cd_060()%>
<%= ds.getXx_from_clas_cd1_010()%>
<%= ds.getXx_to_clas_cd1_010()%>
<%= ds.getXx_from_clas_cd1_020()%>
<%= ds.getXx_to_clas_cd1_020()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 13 15:33:04 KST 2012 */