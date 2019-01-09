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


package chosun.ciis.mt.prnpap.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.prnpap.dm.*;
import chosun.ciis.mt.prnpap.rec.*;

/**
 * 
 */


public class MT_PRNPAP_3000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String clos_clsf;
	public String clos_clsf_nm;
	public String dpcn_clsf;
	public String stokwh_clsf;
	public String stokmidl_clsf;
	public String stokmach_clsf;
	public String paji_clsf;
	public String oth_div_clsf;

	public MT_PRNPAP_3000_LDataSet(){}
	public MT_PRNPAP_3000_LDataSet(String errcode, String errmsg, String clos_clsf, String clos_clsf_nm, String dpcn_clsf, String stokwh_clsf, String stokmidl_clsf, String stokmach_clsf, String paji_clsf, String oth_div_clsf){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.clos_clsf = clos_clsf;
		this.clos_clsf_nm = clos_clsf_nm;
		this.dpcn_clsf = dpcn_clsf;
		this.stokwh_clsf = stokwh_clsf;
		this.stokmidl_clsf = stokmidl_clsf;
		this.stokmach_clsf = stokmach_clsf;
		this.paji_clsf = paji_clsf;
		this.oth_div_clsf = oth_div_clsf;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setClos_clsf(String clos_clsf){
		this.clos_clsf = clos_clsf;
	}

	public void setClos_clsf_nm(String clos_clsf_nm){
		this.clos_clsf_nm = clos_clsf_nm;
	}

	public void setDpcn_clsf(String dpcn_clsf){
		this.dpcn_clsf = dpcn_clsf;
	}

	public void setStokwh_clsf(String stokwh_clsf){
		this.stokwh_clsf = stokwh_clsf;
	}

	public void setStokmidl_clsf(String stokmidl_clsf){
		this.stokmidl_clsf = stokmidl_clsf;
	}

	public void setStokmach_clsf(String stokmach_clsf){
		this.stokmach_clsf = stokmach_clsf;
	}

	public void setPaji_clsf(String paji_clsf){
		this.paji_clsf = paji_clsf;
	}

	public void setOth_div_clsf(String oth_div_clsf){
		this.oth_div_clsf = oth_div_clsf;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getClos_clsf(){
		return this.clos_clsf;
	}

	public String getClos_clsf_nm(){
		return this.clos_clsf_nm;
	}

	public String getDpcn_clsf(){
		return this.dpcn_clsf;
	}

	public String getStokwh_clsf(){
		return this.stokwh_clsf;
	}

	public String getStokmidl_clsf(){
		return this.stokmidl_clsf;
	}

	public String getStokmach_clsf(){
		return this.stokmach_clsf;
	}

	public String getPaji_clsf(){
		return this.paji_clsf;
	}

	public String getOth_div_clsf(){
		return this.oth_div_clsf;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.clos_clsf = Util.checkString(cstmt.getString(6));
		this.clos_clsf_nm = Util.checkString(cstmt.getString(7));
		this.dpcn_clsf = Util.checkString(cstmt.getString(8));
		this.stokwh_clsf = Util.checkString(cstmt.getString(9));
		this.stokmidl_clsf = Util.checkString(cstmt.getString(10));
		this.stokmach_clsf = Util.checkString(cstmt.getString(11));
		this.paji_clsf = Util.checkString(cstmt.getString(12));
		this.oth_div_clsf = Util.checkString(cstmt.getString(13));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_PRNPAP_3000_LDataSet ds = (MT_PRNPAP_3000_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getClos_clsf()%>
<%= ds.getClos_clsf_nm()%>
<%= ds.getDpcn_clsf()%>
<%= ds.getStokwh_clsf()%>
<%= ds.getStokmidl_clsf()%>
<%= ds.getStokmach_clsf()%>
<%= ds.getPaji_clsf()%>
<%= ds.getOth_div_clsf()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 28 11:09:33 KST 2009 */