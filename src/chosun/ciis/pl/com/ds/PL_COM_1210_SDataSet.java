/***************************************************************************************************
* 파일명 : 
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


public class PL_COM_1210_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String medi_clsf;
	public String basi_yymm;
	public String basi_dt;
	public String dlco_cd;
	public String dlco_seq;
	public String dlco_nm;
	public String send_plac_seq;
	public String send_plac_nm;
	public String ordr_dt;
	public String ordr_grp_seq;
	public String deal_dt;
	public String deal_grp_seq;
	public String clos_yn;
	public String rcpm_yn;
	public String remk;

	public PL_COM_1210_SDataSet(){}
	public PL_COM_1210_SDataSet(String errcode, String errmsg, String medi_clsf, String basi_yymm, String basi_dt, String dlco_cd, String dlco_seq, String dlco_nm, String send_plac_seq, String send_plac_nm, String ordr_dt, String ordr_grp_seq, String deal_dt, String deal_grp_seq, String clos_yn, String rcpm_yn, String remk){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.medi_clsf = medi_clsf;
		this.basi_yymm = basi_yymm;
		this.basi_dt = basi_dt;
		this.dlco_cd = dlco_cd;
		this.dlco_seq = dlco_seq;
		this.dlco_nm = dlco_nm;
		this.send_plac_seq = send_plac_seq;
		this.send_plac_nm = send_plac_nm;
		this.ordr_dt = ordr_dt;
		this.ordr_grp_seq = ordr_grp_seq;
		this.deal_dt = deal_dt;
		this.deal_grp_seq = deal_grp_seq;
		this.clos_yn = clos_yn;
		this.rcpm_yn = rcpm_yn;
		this.remk = remk;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setBasi_yymm(String basi_yymm){
		this.basi_yymm = basi_yymm;
	}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_seq(String dlco_seq){
		this.dlco_seq = dlco_seq;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setSend_plac_seq(String send_plac_seq){
		this.send_plac_seq = send_plac_seq;
	}

	public void setSend_plac_nm(String send_plac_nm){
		this.send_plac_nm = send_plac_nm;
	}

	public void setOrdr_dt(String ordr_dt){
		this.ordr_dt = ordr_dt;
	}

	public void setOrdr_grp_seq(String ordr_grp_seq){
		this.ordr_grp_seq = ordr_grp_seq;
	}

	public void setDeal_dt(String deal_dt){
		this.deal_dt = deal_dt;
	}

	public void setDeal_grp_seq(String deal_grp_seq){
		this.deal_grp_seq = deal_grp_seq;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setRcpm_yn(String rcpm_yn){
		this.rcpm_yn = rcpm_yn;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getBasi_yymm(){
		return this.basi_yymm;
	}

	public String getBasi_dt(){
		return this.basi_dt;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_seq(){
		return this.dlco_seq;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getSend_plac_seq(){
		return this.send_plac_seq;
	}

	public String getSend_plac_nm(){
		return this.send_plac_nm;
	}

	public String getOrdr_dt(){
		return this.ordr_dt;
	}

	public String getOrdr_grp_seq(){
		return this.ordr_grp_seq;
	}

	public String getDeal_dt(){
		return this.deal_dt;
	}

	public String getDeal_grp_seq(){
		return this.deal_grp_seq;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getRcpm_yn(){
		return this.rcpm_yn;
	}

	public String getRemk(){
		return this.remk;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.medi_clsf = Util.checkString(cstmt.getString(8));
		this.basi_yymm = Util.checkString(cstmt.getString(9));
		this.basi_dt = Util.checkString(cstmt.getString(10));
		this.dlco_cd = Util.checkString(cstmt.getString(11));
		this.dlco_seq = Util.checkString(cstmt.getString(12));
		this.dlco_nm = Util.checkString(cstmt.getString(13));
		this.send_plac_seq = Util.checkString(cstmt.getString(14));
		this.send_plac_nm = Util.checkString(cstmt.getString(15));
		this.ordr_dt = Util.checkString(cstmt.getString(16));
		this.ordr_grp_seq = Util.checkString(cstmt.getString(17));
		this.deal_dt = Util.checkString(cstmt.getString(18));
		this.deal_grp_seq = Util.checkString(cstmt.getString(19));
		this.clos_yn = Util.checkString(cstmt.getString(20));
		this.rcpm_yn = Util.checkString(cstmt.getString(21));
		this.remk = Util.checkString(cstmt.getString(22));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_COM_1210_SDataSet ds = (PL_COM_1210_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedi_clsf()%>
<%= ds.getBasi_yymm()%>
<%= ds.getBasi_dt()%>
<%= ds.getDlco_cd()%>
<%= ds.getDlco_seq()%>
<%= ds.getDlco_nm()%>
<%= ds.getSend_plac_seq()%>
<%= ds.getSend_plac_nm()%>
<%= ds.getOrdr_dt()%>
<%= ds.getOrdr_grp_seq()%>
<%= ds.getDeal_dt()%>
<%= ds.getDeal_grp_seq()%>
<%= ds.getClos_yn()%>
<%= ds.getRcpm_yn()%>
<%= ds.getRemk()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 06 21:12:07 KST 2009 */