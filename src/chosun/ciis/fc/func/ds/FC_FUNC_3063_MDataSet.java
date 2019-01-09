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


package chosun.ciis.fc.func.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_3063_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_newsp_rate_cash;
	public String xx_newsp_rate_90;
	public String xx_newsp_rate_120;
	public String xx_newsp_rate_125;
	public String xx_publis_rate_cash;
	public String xx_publis_rate_90;
	public String xx_publis_rate_120;
	public String xx_publis_rate_125;
	public String xx_newsp_sale_dd;
	public String xx_publis_sale_dd;
	public String xx_lent_proceeds_dd;

	public FC_FUNC_3063_MDataSet(){}
	public FC_FUNC_3063_MDataSet(String errcode, String errmsg, String xx_newsp_rate_cash, String xx_newsp_rate_90, String xx_newsp_rate_120, String xx_newsp_rate_125, String xx_publis_rate_cash, String xx_publis_rate_90, String xx_publis_rate_120, String xx_publis_rate_125, String xx_newsp_sale_dd, String xx_publis_sale_dd, String xx_lent_proceeds_dd){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_newsp_rate_cash = xx_newsp_rate_cash;
		this.xx_newsp_rate_90 = xx_newsp_rate_90;
		this.xx_newsp_rate_120 = xx_newsp_rate_120;
		this.xx_newsp_rate_125 = xx_newsp_rate_125;
		this.xx_publis_rate_cash = xx_publis_rate_cash;
		this.xx_publis_rate_90 = xx_publis_rate_90;
		this.xx_publis_rate_120 = xx_publis_rate_120;
		this.xx_publis_rate_125 = xx_publis_rate_125;
		this.xx_newsp_sale_dd = xx_newsp_sale_dd;
		this.xx_publis_sale_dd = xx_publis_sale_dd;
		this.xx_lent_proceeds_dd = xx_lent_proceeds_dd;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_newsp_rate_cash(String xx_newsp_rate_cash){
		this.xx_newsp_rate_cash = xx_newsp_rate_cash;
	}

	public void setXx_newsp_rate_90(String xx_newsp_rate_90){
		this.xx_newsp_rate_90 = xx_newsp_rate_90;
	}

	public void setXx_newsp_rate_120(String xx_newsp_rate_120){
		this.xx_newsp_rate_120 = xx_newsp_rate_120;
	}

	public void setXx_newsp_rate_125(String xx_newsp_rate_125){
		this.xx_newsp_rate_125 = xx_newsp_rate_125;
	}

	public void setXx_publis_rate_cash(String xx_publis_rate_cash){
		this.xx_publis_rate_cash = xx_publis_rate_cash;
	}

	public void setXx_publis_rate_90(String xx_publis_rate_90){
		this.xx_publis_rate_90 = xx_publis_rate_90;
	}

	public void setXx_publis_rate_120(String xx_publis_rate_120){
		this.xx_publis_rate_120 = xx_publis_rate_120;
	}

	public void setXx_publis_rate_125(String xx_publis_rate_125){
		this.xx_publis_rate_125 = xx_publis_rate_125;
	}

	public void setXx_newsp_sale_dd(String xx_newsp_sale_dd){
		this.xx_newsp_sale_dd = xx_newsp_sale_dd;
	}

	public void setXx_publis_sale_dd(String xx_publis_sale_dd){
		this.xx_publis_sale_dd = xx_publis_sale_dd;
	}

	public void setXx_lent_proceeds_dd(String xx_lent_proceeds_dd){
		this.xx_lent_proceeds_dd = xx_lent_proceeds_dd;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_newsp_rate_cash(){
		return this.xx_newsp_rate_cash;
	}

	public String getXx_newsp_rate_90(){
		return this.xx_newsp_rate_90;
	}

	public String getXx_newsp_rate_120(){
		return this.xx_newsp_rate_120;
	}

	public String getXx_newsp_rate_125(){
		return this.xx_newsp_rate_125;
	}

	public String getXx_publis_rate_cash(){
		return this.xx_publis_rate_cash;
	}

	public String getXx_publis_rate_90(){
		return this.xx_publis_rate_90;
	}

	public String getXx_publis_rate_120(){
		return this.xx_publis_rate_120;
	}

	public String getXx_publis_rate_125(){
		return this.xx_publis_rate_125;
	}

	public String getXx_newsp_sale_dd(){
		return this.xx_newsp_sale_dd;
	}

	public String getXx_publis_sale_dd(){
		return this.xx_publis_sale_dd;
	}

	public String getXx_lent_proceeds_dd(){
		return this.xx_lent_proceeds_dd;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_newsp_rate_cash = Util.checkString(cstmt.getString(5));
		this.xx_newsp_rate_90 = Util.checkString(cstmt.getString(6));
		this.xx_newsp_rate_120 = Util.checkString(cstmt.getString(7));
		this.xx_newsp_rate_125 = Util.checkString(cstmt.getString(8));
		this.xx_publis_rate_cash = Util.checkString(cstmt.getString(9));
		this.xx_publis_rate_90 = Util.checkString(cstmt.getString(10));
		this.xx_publis_rate_120 = Util.checkString(cstmt.getString(11));
		this.xx_publis_rate_125 = Util.checkString(cstmt.getString(12));
		this.xx_newsp_sale_dd = Util.checkString(cstmt.getString(13));
		this.xx_publis_sale_dd = Util.checkString(cstmt.getString(14));
		this.xx_lent_proceeds_dd = Util.checkString(cstmt.getString(15));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_3063_MDataSet ds = (FC_FUNC_3063_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_newsp_rate_cash()%>
<%= ds.getXx_newsp_rate_90()%>
<%= ds.getXx_newsp_rate_120()%>
<%= ds.getXx_newsp_rate_125()%>
<%= ds.getXx_publis_rate_cash()%>
<%= ds.getXx_publis_rate_90()%>
<%= ds.getXx_publis_rate_120()%>
<%= ds.getXx_publis_rate_125()%>
<%= ds.getXx_newsp_sale_dd()%>
<%= ds.getXx_publis_sale_dd()%>
<%= ds.getXx_lent_proceeds_dd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jan 05 14:12:55 KST 2012 */