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


package chosun.ciis.hd.yadjm.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.yadjm.dm.*;
import chosun.ciis.hd.yadjm.rec.*;

/**
 * 
 */


public class HD_YADJM_115200_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList xx_combo_010 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_stok_savg_type_010;
	public String xx_stok_savg_type_020;
	public String xx_stok_savg_type_030;
	public String xx_stok_savg_type_040;
	public String xx_stok_savg_type_050;
	public String xx_stok_savg_type_060;
	public String xx_stok_savg_type_070;
	public String xx_stok_savg_type_080;
	public String xx_stok_savg_type_090;
	public String xx_edu_fee_clsf_cd;
	public String xx_faml_rshp_cd;

	public HD_YADJM_115200_MDataSet(){}
	public HD_YADJM_115200_MDataSet(String errcode, String errmsg, String xx_stok_savg_type_010, String xx_stok_savg_type_020, String xx_stok_savg_type_030, String xx_stok_savg_type_040, String xx_stok_savg_type_050, String xx_stok_savg_type_060, String xx_stok_savg_type_070, String xx_stok_savg_type_080, String xx_stok_savg_type_090, String xx_edu_fee_clsf_cd, String xx_faml_rshp_cd){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_stok_savg_type_010 = xx_stok_savg_type_010;
		this.xx_stok_savg_type_020 = xx_stok_savg_type_020;
		this.xx_stok_savg_type_030 = xx_stok_savg_type_030;
		this.xx_stok_savg_type_040 = xx_stok_savg_type_040;
		this.xx_stok_savg_type_050 = xx_stok_savg_type_050;
		this.xx_stok_savg_type_060 = xx_stok_savg_type_060;
		this.xx_stok_savg_type_070 = xx_stok_savg_type_070;
		this.xx_stok_savg_type_080 = xx_stok_savg_type_080;
		this.xx_stok_savg_type_090 = xx_stok_savg_type_090;
		this.xx_edu_fee_clsf_cd = xx_edu_fee_clsf_cd;
		this.xx_faml_rshp_cd = xx_faml_rshp_cd;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_stok_savg_type_010(String xx_stok_savg_type_010){
		this.xx_stok_savg_type_010 = xx_stok_savg_type_010;
	}

	public void setXx_stok_savg_type_020(String xx_stok_savg_type_020){
		this.xx_stok_savg_type_020 = xx_stok_savg_type_020;
	}

	public void setXx_stok_savg_type_030(String xx_stok_savg_type_030){
		this.xx_stok_savg_type_030 = xx_stok_savg_type_030;
	}

	public void setXx_stok_savg_type_040(String xx_stok_savg_type_040){
		this.xx_stok_savg_type_040 = xx_stok_savg_type_040;
	}

	public void setXx_stok_savg_type_050(String xx_stok_savg_type_050){
		this.xx_stok_savg_type_050 = xx_stok_savg_type_050;
	}

	public void setXx_stok_savg_type_060(String xx_stok_savg_type_060){
		this.xx_stok_savg_type_060 = xx_stok_savg_type_060;
	}

	public void setXx_stok_savg_type_070(String xx_stok_savg_type_070){
		this.xx_stok_savg_type_070 = xx_stok_savg_type_070;
	}

	public void setXx_stok_savg_type_080(String xx_stok_savg_type_080){
		this.xx_stok_savg_type_080 = xx_stok_savg_type_080;
	}

	public void setXx_stok_savg_type_090(String xx_stok_savg_type_090){
		this.xx_stok_savg_type_090 = xx_stok_savg_type_090;
	}

	public void setXx_edu_fee_clsf_cd(String xx_edu_fee_clsf_cd){
		this.xx_edu_fee_clsf_cd = xx_edu_fee_clsf_cd;
	}

	public void setXx_faml_rshp_cd(String xx_faml_rshp_cd){
		this.xx_faml_rshp_cd = xx_faml_rshp_cd;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_stok_savg_type_010(){
		return this.xx_stok_savg_type_010;
	}

	public String getXx_stok_savg_type_020(){
		return this.xx_stok_savg_type_020;
	}

	public String getXx_stok_savg_type_030(){
		return this.xx_stok_savg_type_030;
	}

	public String getXx_stok_savg_type_040(){
		return this.xx_stok_savg_type_040;
	}

	public String getXx_stok_savg_type_050(){
		return this.xx_stok_savg_type_050;
	}

	public String getXx_stok_savg_type_060(){
		return this.xx_stok_savg_type_060;
	}

	public String getXx_stok_savg_type_070(){
		return this.xx_stok_savg_type_070;
	}

	public String getXx_stok_savg_type_080(){
		return this.xx_stok_savg_type_080;
	}

	public String getXx_stok_savg_type_090(){
		return this.xx_stok_savg_type_090;
	}

	public String getXx_edu_fee_clsf_cd(){
		return this.xx_edu_fee_clsf_cd;
	}

	public String getXx_faml_rshp_cd(){
		return this.xx_faml_rshp_cd;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_YADJM_115200_MXX_COMBO_010Record rec = new HD_YADJM_115200_MXX_COMBO_010Record();
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			this.xx_combo_010.add(rec);
		}
		this.xx_stok_savg_type_010 = Util.checkString(cstmt.getString(6));
		this.xx_stok_savg_type_020 = Util.checkString(cstmt.getString(7));
		this.xx_stok_savg_type_030 = Util.checkString(cstmt.getString(8));
		this.xx_stok_savg_type_040 = Util.checkString(cstmt.getString(9));
		this.xx_stok_savg_type_050 = Util.checkString(cstmt.getString(10));
		this.xx_stok_savg_type_060 = Util.checkString(cstmt.getString(11));
		this.xx_stok_savg_type_070 = Util.checkString(cstmt.getString(12));
		this.xx_stok_savg_type_080 = Util.checkString(cstmt.getString(13));
		this.xx_stok_savg_type_090 = Util.checkString(cstmt.getString(14));
		this.xx_edu_fee_clsf_cd = Util.checkString(cstmt.getString(15));
		this.xx_faml_rshp_cd = Util.checkString(cstmt.getString(16));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_YADJM_115200_MDataSet ds = (HD_YADJM_115200_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.xx_combo_010.size(); i++){
		HD_YADJM_115200_MXX_COMBO_010Record xx_combo_010Rec = (HD_YADJM_115200_MXX_COMBO_010Record)ds.xx_combo_010.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_combo_010()%>
<%= ds.getXx_stok_savg_type_010()%>
<%= ds.getXx_stok_savg_type_020()%>
<%= ds.getXx_stok_savg_type_030()%>
<%= ds.getXx_stok_savg_type_040()%>
<%= ds.getXx_stok_savg_type_050()%>
<%= ds.getXx_stok_savg_type_060()%>
<%= ds.getXx_stok_savg_type_070()%>
<%= ds.getXx_stok_savg_type_080()%>
<%= ds.getXx_stok_savg_type_090()%>
<%= ds.getXx_edu_fee_clsf_cd()%>
<%= ds.getXx_faml_rshp_cd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= xx_combo_010Rec.cd_nm%>
<%= xx_combo_010Rec.cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 15 13:28:31 KST 2012 */