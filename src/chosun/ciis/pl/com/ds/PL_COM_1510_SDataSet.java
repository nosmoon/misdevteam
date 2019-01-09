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


package chosun.ciis.pl.com.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.com.dm.*;
import chosun.ciis.pl.com.rec.*;

/**
 * 
 */


public class PL_COM_1510_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String stok_qty;
	public String deal_uprc;
	public String dcrate;
	public String wh_cd;
	public String sendclsf;
	public String prv_deli_qty;
	public String prv_widr_qty;
	public String prv_retn_qty;
	public String vexc_medi_ser_no;

	public PL_COM_1510_SDataSet(){}
	public PL_COM_1510_SDataSet(String errcode, String errmsg, String stok_qty, String deal_uprc, String dcrate, String wh_cd, String sendclsf, String prv_deli_qty, String prv_widr_qty, String prv_retn_qty, String vexc_medi_ser_no){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.stok_qty = stok_qty;
		this.deal_uprc = deal_uprc;
		this.dcrate = dcrate;
		this.wh_cd = wh_cd;
		this.sendclsf = sendclsf;
		this.prv_deli_qty = prv_deli_qty;
		this.prv_widr_qty = prv_widr_qty;
		this.prv_retn_qty = prv_retn_qty;
		this.vexc_medi_ser_no = vexc_medi_ser_no;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setStok_qty(String stok_qty){
		this.stok_qty = stok_qty;
	}

	public void setDeal_uprc(String deal_uprc){
		this.deal_uprc = deal_uprc;
	}

	public void setDcrate(String dcrate){
		this.dcrate = dcrate;
	}

	public void setWh_cd(String wh_cd){
		this.wh_cd = wh_cd;
	}

	public void setSendclsf(String sendclsf){
		this.sendclsf = sendclsf;
	}

	public void setPrv_deli_qty(String prv_deli_qty){
		this.prv_deli_qty = prv_deli_qty;
	}

	public void setPrv_widr_qty(String prv_widr_qty){
		this.prv_widr_qty = prv_widr_qty;
	}

	public void setPrv_retn_qty(String prv_retn_qty){
		this.prv_retn_qty = prv_retn_qty;
	}

	public void setVexc_medi_ser_no(String vexc_medi_ser_no){
		this.vexc_medi_ser_no = vexc_medi_ser_no;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getStok_qty(){
		return this.stok_qty;
	}

	public String getDeal_uprc(){
		return this.deal_uprc;
	}

	public String getDcrate(){
		return this.dcrate;
	}

	public String getWh_cd(){
		return this.wh_cd;
	}

	public String getSendclsf(){
		return this.sendclsf;
	}

	public String getPrv_deli_qty(){
		return this.prv_deli_qty;
	}

	public String getPrv_widr_qty(){
		return this.prv_widr_qty;
	}

	public String getPrv_retn_qty(){
		return this.prv_retn_qty;
	}

	public String getVexc_medi_ser_no(){
		return this.vexc_medi_ser_no;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.stok_qty = Util.checkString(cstmt.getString(11));
		this.deal_uprc = Util.checkString(cstmt.getString(12));
		this.dcrate = Util.checkString(cstmt.getString(13));
		this.wh_cd = Util.checkString(cstmt.getString(14));
		this.sendclsf = Util.checkString(cstmt.getString(15));
		this.prv_deli_qty = Util.checkString(cstmt.getString(16));
		this.prv_widr_qty = Util.checkString(cstmt.getString(17));
		this.prv_retn_qty = Util.checkString(cstmt.getString(18));
		this.vexc_medi_ser_no = Util.checkString(cstmt.getString(19));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_COM_1510_SDataSet ds = (PL_COM_1510_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getStok_qty()%>
<%= ds.getDeal_uprc()%>
<%= ds.getDcrate()%>
<%= ds.getWh_cd()%>
<%= ds.getSendclsf()%>
<%= ds.getPrv_deli_qty()%>
<%= ds.getPrv_widr_qty()%>
<%= ds.getPrv_retn_qty()%>
<%= ds.getVexc_medi_ser_no()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Sep 02 18:19:25 KST 2013 */