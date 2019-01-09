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


package chosun.ciis.ad.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.bas.dm.*;
import chosun.ciis.ad.bas.rec.*;

/**
 * 
 */


public class AD_BAS_1030_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String dlco_no;
	public String bis_dlco_yn;
	public String dlco_abrv_nm;
	public String ern;
	public String presi_nm;
	public String bizcond;
	public String item;
	public String zip;
	public String addr;
	public String dtls_addr;
	public String dlco_nm;
	public String use_yn;
	public String advcs_agn_flag;

	public AD_BAS_1030_ADataSet(){}
	public AD_BAS_1030_ADataSet(String errcode, String errmsg, String dlco_no, String bis_dlco_yn, String dlco_abrv_nm, String ern, String presi_nm, String bizcond, String item, String zip, String addr, String dtls_addr, String dlco_nm, String use_yn, String advcs_agn_flag){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.dlco_no = dlco_no;
		this.bis_dlco_yn = bis_dlco_yn;
		this.dlco_abrv_nm = dlco_abrv_nm;
		this.ern = ern;
		this.presi_nm = presi_nm;
		this.bizcond = bizcond;
		this.item = item;
		this.zip = zip;
		this.addr = addr;
		this.dtls_addr = dtls_addr;
		this.dlco_nm = dlco_nm;
		this.use_yn = use_yn;
		this.advcs_agn_flag = advcs_agn_flag;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setBis_dlco_yn(String bis_dlco_yn){
		this.bis_dlco_yn = bis_dlco_yn;
	}

	public void setDlco_abrv_nm(String dlco_abrv_nm){
		this.dlco_abrv_nm = dlco_abrv_nm;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setBizcond(String bizcond){
		this.bizcond = bizcond;
	}

	public void setItem(String item){
		this.item = item;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtls_addr(String dtls_addr){
		this.dtls_addr = dtls_addr;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public void setAdvcs_agn_flag(String advcs_agn_flag){
		this.advcs_agn_flag = advcs_agn_flag;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getBis_dlco_yn(){
		return this.bis_dlco_yn;
	}

	public String getDlco_abrv_nm(){
		return this.dlco_abrv_nm;
	}

	public String getErn(){
		return this.ern;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getBizcond(){
		return this.bizcond;
	}

	public String getItem(){
		return this.item;
	}

	public String getZip(){
		return this.zip;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtls_addr(){
		return this.dtls_addr;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getUse_yn(){
		return this.use_yn;
	}

	public String getAdvcs_agn_flag(){
		return this.advcs_agn_flag;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.dlco_no = Util.checkString(cstmt.getString(46));
		this.bis_dlco_yn = Util.checkString(cstmt.getString(47));
		this.dlco_abrv_nm = Util.checkString(cstmt.getString(48));
		this.ern = Util.checkString(cstmt.getString(49));
		this.presi_nm = Util.checkString(cstmt.getString(50));
		this.bizcond = Util.checkString(cstmt.getString(51));
		this.item = Util.checkString(cstmt.getString(52));
		this.zip = Util.checkString(cstmt.getString(53));
		this.addr = Util.checkString(cstmt.getString(54));
		this.dtls_addr = Util.checkString(cstmt.getString(55));
		this.dlco_nm = Util.checkString(cstmt.getString(56));
		this.use_yn = Util.checkString(cstmt.getString(57));
		this.advcs_agn_flag = Util.checkString(cstmt.getString(58));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BAS_1030_ADataSet ds = (AD_BAS_1030_ADataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDlco_no()%>
<%= ds.getBis_dlco_yn()%>
<%= ds.getDlco_abrv_nm()%>
<%= ds.getErn()%>
<%= ds.getPresi_nm()%>
<%= ds.getBizcond()%>
<%= ds.getItem()%>
<%= ds.getZip()%>
<%= ds.getAddr()%>
<%= ds.getDtls_addr()%>
<%= ds.getDlco_nm()%>
<%= ds.getUse_yn()%>
<%= ds.getAdvcs_agn_flag()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 22 14:55:39 KST 2014 */