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


package chosun.ciis.pl.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.sal.dm.*;
import chosun.ciis.pl.sal.rec.*;

/**
 * 
 */


public class PL_SAL_1200_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList sale_clsfcur = new ArrayList();
	public ArrayList sendclsfcur = new ArrayList();
	public ArrayList medi_clsfcur = new ArrayList();
	public ArrayList wh_cdcur = new ArrayList();
	public ArrayList sell_typecur = new ArrayList();
	public ArrayList deal_ptcrcur = new ArrayList();
	public ArrayList medi_cdcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_SAL_1200_MDataSet(){}
	public PL_SAL_1200_MDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			PL_SAL_1200_MMEDI_CLSFCURRecord rec = new PL_SAL_1200_MMEDI_CLSFCURRecord();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset1.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset1.getString("cdabrvnm_cd"));
			this.medi_clsfcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			PL_SAL_1200_MMEDI_CDCURRecord rec = new PL_SAL_1200_MMEDI_CDCURRecord();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset2.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset2.getString("cdabrvnm_cd"));
			this.medi_cdcur.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(7);
		while(rset3.next()){
			PL_SAL_1200_MSALE_CLSFCURRecord rec = new PL_SAL_1200_MSALE_CLSFCURRecord();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset3.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset3.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset3.getString("cdabrvnm_cd"));
			this.sale_clsfcur.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(8);
		while(rset4.next()){
			PL_SAL_1200_MSENDCLSFCURRecord rec = new PL_SAL_1200_MSENDCLSFCURRecord();
			rec.cd = Util.checkString(rset4.getString("cd"));
			rec.cdnm = Util.checkString(rset4.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset4.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset4.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset4.getString("cdabrvnm_cd"));
			this.sendclsfcur.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(9);
		while(rset5.next()){
			PL_SAL_1200_MWH_CDCURRecord rec = new PL_SAL_1200_MWH_CDCURRecord();
			rec.cd = Util.checkString(rset5.getString("cd"));
			rec.cdnm = Util.checkString(rset5.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset5.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset5.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset5.getString("cdabrvnm_cd"));
			this.wh_cdcur.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(10);
		while(rset6.next()){
			PL_SAL_1200_MSELL_TYPECURRecord rec = new PL_SAL_1200_MSELL_TYPECURRecord();
			rec.cd = Util.checkString(rset6.getString("cd"));
			rec.cdnm = Util.checkString(rset6.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset6.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset6.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset6.getString("cdabrvnm_cd"));
			this.sell_typecur.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(11);
		while(rset7.next()){
			PL_SAL_1200_MDEAL_PTCRCURRecord rec = new PL_SAL_1200_MDEAL_PTCRCURRecord();
			rec.deal_dt = Util.checkString(rset7.getString("deal_dt"));
			rec.deal_grp_seq = Util.checkString(rset7.getString("deal_grp_seq"));
			rec.deal_seq = Util.checkString(rset7.getString("deal_seq"));
			rec.medi_clsf = Util.checkString(rset7.getString("medi_clsf"));
			rec.medi_cd = Util.checkString(rset7.getString("medi_cd"));
			rec.medi_ser_no = Util.checkString(rset7.getString("medi_ser_no"));
			rec.medi_nm = Util.checkString(rset7.getString("medi_nm"));
			rec.stok_qty = Util.checkString(rset7.getString("stok_qty"));
			rec.deal_qty = Util.checkString(rset7.getString("deal_qty"));
			rec.deal_uprc = Util.checkString(rset7.getString("deal_uprc"));
			rec.dcrate = Util.checkString(rset7.getString("dcrate"));
			rec.deal_amt = Util.checkString(rset7.getString("deal_amt"));
			rec.sale_clsf = Util.checkString(rset7.getString("sale_clsf"));
			rec.sendclsf = Util.checkString(rset7.getString("sendclsf"));
			rec.wh_cd = Util.checkString(rset7.getString("wh_cd"));
			rec.sell_type = Util.checkString(rset7.getString("sell_type"));
			rec.remk = Util.checkString(rset7.getString("remk"));
			this.deal_ptcrcur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_SAL_1200_MDataSet ds = (PL_SAL_1200_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.medi_clsfcur.size(); i++){
		PL_SAL_1200_MMEDI_CLSFCURRecord medi_clsfcurRec = (PL_SAL_1200_MMEDI_CLSFCURRecord)ds.medi_clsfcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.medi_cdcur.size(); i++){
		PL_SAL_1200_MMEDI_CDCURRecord medi_cdcurRec = (PL_SAL_1200_MMEDI_CDCURRecord)ds.medi_cdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.sale_clsfcur.size(); i++){
		PL_SAL_1200_MSALE_CLSFCURRecord sale_clsfcurRec = (PL_SAL_1200_MSALE_CLSFCURRecord)ds.sale_clsfcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.sendclsfcur.size(); i++){
		PL_SAL_1200_MSENDCLSFCURRecord sendclsfcurRec = (PL_SAL_1200_MSENDCLSFCURRecord)ds.sendclsfcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.wh_cdcur.size(); i++){
		PL_SAL_1200_MWH_CDCURRecord wh_cdcurRec = (PL_SAL_1200_MWH_CDCURRecord)ds.wh_cdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.sell_typecur.size(); i++){
		PL_SAL_1200_MSELL_TYPECURRecord sell_typecurRec = (PL_SAL_1200_MSELL_TYPECURRecord)ds.sell_typecur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.deal_ptcrcur.size(); i++){
		PL_SAL_1200_MDEAL_PTCRCURRecord deal_ptcrcurRec = (PL_SAL_1200_MDEAL_PTCRCURRecord)ds.deal_ptcrcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedi_clsfcur()%>
<%= ds.getMedi_cdcur()%>
<%= ds.getSale_clsfcur()%>
<%= ds.getSendclsfcur()%>
<%= ds.getWh_cdcur()%>
<%= ds.getSell_typecur()%>
<%= ds.getDeal_ptcrcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= medi_clsfcurRec.cd%>
<%= medi_clsfcurRec.cdnm%>
<%= medi_clsfcurRec.cd_abrv_nm%>
<%= medi_clsfcurRec.cdnm_cd%>
<%= medi_clsfcurRec.cdabrvnm_cd%>
<%= medi_cdcurRec.cd%>
<%= medi_cdcurRec.cdnm%>
<%= medi_cdcurRec.cd_abrv_nm%>
<%= medi_cdcurRec.cdnm_cd%>
<%= medi_cdcurRec.cdabrvnm_cd%>
<%= sale_clsfcurRec.cd%>
<%= sale_clsfcurRec.cdnm%>
<%= sale_clsfcurRec.cd_abrv_nm%>
<%= sale_clsfcurRec.cdnm_cd%>
<%= sale_clsfcurRec.cdabrvnm_cd%>
<%= sendclsfcurRec.cd%>
<%= sendclsfcurRec.cdnm%>
<%= sendclsfcurRec.cd_abrv_nm%>
<%= sendclsfcurRec.cdnm_cd%>
<%= sendclsfcurRec.cdabrvnm_cd%>
<%= wh_cdcurRec.cd%>
<%= wh_cdcurRec.cdnm%>
<%= wh_cdcurRec.cd_abrv_nm%>
<%= wh_cdcurRec.cdnm_cd%>
<%= wh_cdcurRec.cdabrvnm_cd%>
<%= sell_typecurRec.cd%>
<%= sell_typecurRec.cdnm%>
<%= sell_typecurRec.cd_abrv_nm%>
<%= sell_typecurRec.cdnm_cd%>
<%= sell_typecurRec.cdabrvnm_cd%>
<%= deal_ptcrcurRec.deal_dt%>
<%= deal_ptcrcurRec.deal_grp_seq%>
<%= deal_ptcrcurRec.deal_seq%>
<%= deal_ptcrcurRec.medi_clsf%>
<%= deal_ptcrcurRec.medi_cd%>
<%= deal_ptcrcurRec.medi_ser_no%>
<%= deal_ptcrcurRec.medi_nm%>
<%= deal_ptcrcurRec.stok_qty%>
<%= deal_ptcrcurRec.deal_qty%>
<%= deal_ptcrcurRec.deal_uprc%>
<%= deal_ptcrcurRec.dcrate%>
<%= deal_ptcrcurRec.deal_amt%>
<%= deal_ptcrcurRec.sale_clsf%>
<%= deal_ptcrcurRec.sendclsf%>
<%= deal_ptcrcurRec.wh_cd%>
<%= deal_ptcrcurRec.sell_type%>
<%= deal_ptcrcurRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 24 18:16:37 KST 2009 */