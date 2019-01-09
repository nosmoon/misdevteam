/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.bns.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.bns.dm.*;
import chosun.ciis.se.bns.rec.*;

/**
 * 
 */


public class SE_BNS_1120_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String bns_item_cd;
	public String bns_item_nm;
	public String bns_item_clas;
	public String medi_cd;
	public String yy_plan_stok_qunt;
	public String stok_qunt;
	public String unit;
	public String stok_mang_yn;
	public String rchps_clsf;
	public String clgps_clsf;
	public String stmt_issu_clsf;
	public String send_clsf;
	public String aplc_frdt;
	public String aplc_todt;
	public String aplc_clos_tm;
	public String remk;
	public String use_yn;
	public String stmt_item_clsf;

	public SE_BNS_1120_SDataSet(){}
	public SE_BNS_1120_SDataSet(String errcode, String errmsg, String bns_item_cd, String bns_item_nm, String bns_item_clas, String medi_cd, String yy_plan_stok_qunt, String stok_qunt, String unit, String stok_mang_yn, String rchps_clsf, String clgps_clsf, String stmt_issu_clsf, String send_clsf, String aplc_frdt, String aplc_todt, String aplc_clos_tm, String remk, String use_yn, String stmt_item_clsf){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.bns_item_cd = bns_item_cd;
		this.bns_item_nm = bns_item_nm;
		this.bns_item_clas = bns_item_clas;
		this.medi_cd = medi_cd;
		this.yy_plan_stok_qunt = yy_plan_stok_qunt;
		this.stok_qunt = stok_qunt;
		this.unit = unit;
		this.stok_mang_yn = stok_mang_yn;
		this.rchps_clsf = rchps_clsf;
		this.clgps_clsf = clgps_clsf;
		this.stmt_issu_clsf = stmt_issu_clsf;
		this.send_clsf = send_clsf;
		this.aplc_frdt = aplc_frdt;
		this.aplc_todt = aplc_todt;
		this.aplc_clos_tm = aplc_clos_tm;
		this.remk = remk;
		this.use_yn = use_yn;
		this.stmt_item_clsf = stmt_item_clsf;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setBns_item_cd(String bns_item_cd){
		this.bns_item_cd = bns_item_cd;
	}

	public void setBns_item_nm(String bns_item_nm){
		this.bns_item_nm = bns_item_nm;
	}

	public void setBns_item_clas(String bns_item_clas){
		this.bns_item_clas = bns_item_clas;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setYy_plan_stok_qunt(String yy_plan_stok_qunt){
		this.yy_plan_stok_qunt = yy_plan_stok_qunt;
	}

	public void setStok_qunt(String stok_qunt){
		this.stok_qunt = stok_qunt;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setStok_mang_yn(String stok_mang_yn){
		this.stok_mang_yn = stok_mang_yn;
	}

	public void setRchps_clsf(String rchps_clsf){
		this.rchps_clsf = rchps_clsf;
	}

	public void setClgps_clsf(String clgps_clsf){
		this.clgps_clsf = clgps_clsf;
	}

	public void setStmt_issu_clsf(String stmt_issu_clsf){
		this.stmt_issu_clsf = stmt_issu_clsf;
	}

	public void setSend_clsf(String send_clsf){
		this.send_clsf = send_clsf;
	}

	public void setAplc_frdt(String aplc_frdt){
		this.aplc_frdt = aplc_frdt;
	}

	public void setAplc_todt(String aplc_todt){
		this.aplc_todt = aplc_todt;
	}

	public void setAplc_clos_tm(String aplc_clos_tm){
		this.aplc_clos_tm = aplc_clos_tm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public void setStmt_item_clsf(String stmt_item_clsf){
		this.stmt_item_clsf = stmt_item_clsf;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getBns_item_cd(){
		return this.bns_item_cd;
	}

	public String getBns_item_nm(){
		return this.bns_item_nm;
	}

	public String getBns_item_clas(){
		return this.bns_item_clas;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getYy_plan_stok_qunt(){
		return this.yy_plan_stok_qunt;
	}

	public String getStok_qunt(){
		return this.stok_qunt;
	}

	public String getUnit(){
		return this.unit;
	}

	public String getStok_mang_yn(){
		return this.stok_mang_yn;
	}

	public String getRchps_clsf(){
		return this.rchps_clsf;
	}

	public String getClgps_clsf(){
		return this.clgps_clsf;
	}

	public String getStmt_issu_clsf(){
		return this.stmt_issu_clsf;
	}

	public String getSend_clsf(){
		return this.send_clsf;
	}

	public String getAplc_frdt(){
		return this.aplc_frdt;
	}

	public String getAplc_todt(){
		return this.aplc_todt;
	}

	public String getAplc_clos_tm(){
		return this.aplc_clos_tm;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getUse_yn(){
		return this.use_yn;
	}

	public String getStmt_item_clsf(){
		return this.stmt_item_clsf;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.bns_item_cd = Util.checkString(cstmt.getString(5));
		this.bns_item_nm = Util.checkString(cstmt.getString(6));
		this.bns_item_clas = Util.checkString(cstmt.getString(7));
		this.medi_cd = Util.checkString(cstmt.getString(8));
		this.yy_plan_stok_qunt = Util.checkString(cstmt.getString(9));
		this.stok_qunt = Util.checkString(cstmt.getString(10));
		this.unit = Util.checkString(cstmt.getString(11));
		this.stok_mang_yn = Util.checkString(cstmt.getString(12));
		this.rchps_clsf = Util.checkString(cstmt.getString(13));
		this.clgps_clsf = Util.checkString(cstmt.getString(14));
		this.stmt_issu_clsf = Util.checkString(cstmt.getString(15));
		this.send_clsf = Util.checkString(cstmt.getString(16));
		this.aplc_frdt = Util.checkString(cstmt.getString(17));
		this.aplc_todt = Util.checkString(cstmt.getString(18));
		this.aplc_clos_tm = Util.checkString(cstmt.getString(19));
		this.remk = Util.checkString(cstmt.getString(20));
		this.use_yn = Util.checkString(cstmt.getString(21));
		this.stmt_item_clsf = Util.checkString(cstmt.getString(22));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_BNS_1120_SDataSet ds = (SE_BNS_1120_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBns_item_cd()%>
<%= ds.getBns_item_nm()%>
<%= ds.getBns_item_clas()%>
<%= ds.getMedi_cd()%>
<%= ds.getYy_plan_stok_qunt()%>
<%= ds.getStok_qunt()%>
<%= ds.getUnit()%>
<%= ds.getStok_mang_yn()%>
<%= ds.getRchps_clsf()%>
<%= ds.getClgps_clsf()%>
<%= ds.getStmt_issu_clsf()%>
<%= ds.getSend_clsf()%>
<%= ds.getAplc_frdt()%>
<%= ds.getAplc_todt()%>
<%= ds.getAplc_clos_tm()%>
<%= ds.getRemk()%>
<%= ds.getUse_yn()%>
<%= ds.getStmt_item_clsf()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 11 14:23:38 KST 2017 */