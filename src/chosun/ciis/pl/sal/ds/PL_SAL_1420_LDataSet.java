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


public class PL_SAL_1420_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList ordr_ptcrcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public String ordr_dt;
	public String ordr_grp_seq;
	public String deal_dt;
	public String deal_grp_seq;
	public String medi_clsf;
	public String basi_dt;
	public String dlco_cd;
	public String dlco_seq;
	public String dlco_nm;
	public String send_plac_seq;
	public String send_plac_nm;
	public String send_plac_tel_no_1;
	public String send_plac_tel_no_2;
	public String send_plac_tel_no_3;
	public String send_plac_ptph_no_1;
	public String send_plac_ptph_no_2;
	public String send_plac_ptph_no_3;
	public String send_plac_fax_no_1;
	public String send_plac_fax_no_2;
	public String send_plac_fax_no_3;
	public String send_plac_zip_1;
	public String send_plac_zip_2;
	public String send_plac_addr;
	public String send_plac_dtls_addr;
	public String remk;

	public PL_SAL_1420_LDataSet(){}
	public PL_SAL_1420_LDataSet(String errcode, String errmsg, String ordr_dt, String ordr_grp_seq, String deal_dt, String deal_grp_seq, String medi_clsf, String basi_dt, String dlco_cd, String dlco_seq, String dlco_nm, String send_plac_seq, String send_plac_nm, String send_plac_tel_no_1, String send_plac_tel_no_2, String send_plac_tel_no_3, String send_plac_ptph_no_1, String send_plac_ptph_no_2, String send_plac_ptph_no_3, String send_plac_fax_no_1, String send_plac_fax_no_2, String send_plac_fax_no_3, String send_plac_zip_1, String send_plac_zip_2, String send_plac_addr, String send_plac_dtls_addr, String remk){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.ordr_dt = ordr_dt;
		this.ordr_grp_seq = ordr_grp_seq;
		this.deal_dt = deal_dt;
		this.deal_grp_seq = deal_grp_seq;
		this.medi_clsf = medi_clsf;
		this.basi_dt = basi_dt;
		this.dlco_cd = dlco_cd;
		this.dlco_seq = dlco_seq;
		this.dlco_nm = dlco_nm;
		this.send_plac_seq = send_plac_seq;
		this.send_plac_nm = send_plac_nm;
		this.send_plac_tel_no_1 = send_plac_tel_no_1;
		this.send_plac_tel_no_2 = send_plac_tel_no_2;
		this.send_plac_tel_no_3 = send_plac_tel_no_3;
		this.send_plac_ptph_no_1 = send_plac_ptph_no_1;
		this.send_plac_ptph_no_2 = send_plac_ptph_no_2;
		this.send_plac_ptph_no_3 = send_plac_ptph_no_3;
		this.send_plac_fax_no_1 = send_plac_fax_no_1;
		this.send_plac_fax_no_2 = send_plac_fax_no_2;
		this.send_plac_fax_no_3 = send_plac_fax_no_3;
		this.send_plac_zip_1 = send_plac_zip_1;
		this.send_plac_zip_2 = send_plac_zip_2;
		this.send_plac_addr = send_plac_addr;
		this.send_plac_dtls_addr = send_plac_dtls_addr;
		this.remk = remk;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
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

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
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

	public void setSend_plac_tel_no_1(String send_plac_tel_no_1){
		this.send_plac_tel_no_1 = send_plac_tel_no_1;
	}

	public void setSend_plac_tel_no_2(String send_plac_tel_no_2){
		this.send_plac_tel_no_2 = send_plac_tel_no_2;
	}

	public void setSend_plac_tel_no_3(String send_plac_tel_no_3){
		this.send_plac_tel_no_3 = send_plac_tel_no_3;
	}

	public void setSend_plac_ptph_no_1(String send_plac_ptph_no_1){
		this.send_plac_ptph_no_1 = send_plac_ptph_no_1;
	}

	public void setSend_plac_ptph_no_2(String send_plac_ptph_no_2){
		this.send_plac_ptph_no_2 = send_plac_ptph_no_2;
	}

	public void setSend_plac_ptph_no_3(String send_plac_ptph_no_3){
		this.send_plac_ptph_no_3 = send_plac_ptph_no_3;
	}

	public void setSend_plac_fax_no_1(String send_plac_fax_no_1){
		this.send_plac_fax_no_1 = send_plac_fax_no_1;
	}

	public void setSend_plac_fax_no_2(String send_plac_fax_no_2){
		this.send_plac_fax_no_2 = send_plac_fax_no_2;
	}

	public void setSend_plac_fax_no_3(String send_plac_fax_no_3){
		this.send_plac_fax_no_3 = send_plac_fax_no_3;
	}

	public void setSend_plac_zip_1(String send_plac_zip_1){
		this.send_plac_zip_1 = send_plac_zip_1;
	}

	public void setSend_plac_zip_2(String send_plac_zip_2){
		this.send_plac_zip_2 = send_plac_zip_2;
	}

	public void setSend_plac_addr(String send_plac_addr){
		this.send_plac_addr = send_plac_addr;
	}

	public void setSend_plac_dtls_addr(String send_plac_dtls_addr){
		this.send_plac_dtls_addr = send_plac_dtls_addr;
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

	public String getMedi_clsf(){
		return this.medi_clsf;
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

	public String getSend_plac_tel_no_1(){
		return this.send_plac_tel_no_1;
	}

	public String getSend_plac_tel_no_2(){
		return this.send_plac_tel_no_2;
	}

	public String getSend_plac_tel_no_3(){
		return this.send_plac_tel_no_3;
	}

	public String getSend_plac_ptph_no_1(){
		return this.send_plac_ptph_no_1;
	}

	public String getSend_plac_ptph_no_2(){
		return this.send_plac_ptph_no_2;
	}

	public String getSend_plac_ptph_no_3(){
		return this.send_plac_ptph_no_3;
	}

	public String getSend_plac_fax_no_1(){
		return this.send_plac_fax_no_1;
	}

	public String getSend_plac_fax_no_2(){
		return this.send_plac_fax_no_2;
	}

	public String getSend_plac_fax_no_3(){
		return this.send_plac_fax_no_3;
	}

	public String getSend_plac_zip_1(){
		return this.send_plac_zip_1;
	}

	public String getSend_plac_zip_2(){
		return this.send_plac_zip_2;
	}

	public String getSend_plac_addr(){
		return this.send_plac_addr;
	}

	public String getSend_plac_dtls_addr(){
		return this.send_plac_dtls_addr;
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

		this.ordr_dt = Util.checkString(cstmt.getString(7));
		this.ordr_grp_seq = Util.checkString(cstmt.getString(8));
		this.deal_dt = Util.checkString(cstmt.getString(9));
		this.deal_grp_seq = Util.checkString(cstmt.getString(10));
		this.medi_clsf = Util.checkString(cstmt.getString(11));
		this.basi_dt = Util.checkString(cstmt.getString(12));
		this.dlco_cd = Util.checkString(cstmt.getString(13));
		this.dlco_seq = Util.checkString(cstmt.getString(14));
		this.dlco_nm = Util.checkString(cstmt.getString(15));
		this.send_plac_seq = Util.checkString(cstmt.getString(16));
		this.send_plac_nm = Util.checkString(cstmt.getString(17));
		this.send_plac_tel_no_1 = Util.checkString(cstmt.getString(18));
		this.send_plac_tel_no_2 = Util.checkString(cstmt.getString(19));
		this.send_plac_tel_no_3 = Util.checkString(cstmt.getString(20));
		this.send_plac_ptph_no_1 = Util.checkString(cstmt.getString(21));
		this.send_plac_ptph_no_2 = Util.checkString(cstmt.getString(22));
		this.send_plac_ptph_no_3 = Util.checkString(cstmt.getString(23));
		this.send_plac_fax_no_1 = Util.checkString(cstmt.getString(24));
		this.send_plac_fax_no_2 = Util.checkString(cstmt.getString(25));
		this.send_plac_fax_no_3 = Util.checkString(cstmt.getString(26));
		this.send_plac_zip_1 = Util.checkString(cstmt.getString(27));
		this.send_plac_zip_2 = Util.checkString(cstmt.getString(28));
		this.send_plac_addr = Util.checkString(cstmt.getString(29));
		this.send_plac_dtls_addr = Util.checkString(cstmt.getString(30));
		this.remk = Util.checkString(cstmt.getString(31));
		ResultSet rset0 = (ResultSet) cstmt.getObject(32);
		while(rset0.next()){
			PL_SAL_1420_LORDR_PTCRCURRecord rec = new PL_SAL_1420_LORDR_PTCRCURRecord();
			rec.ordr_dt = Util.checkString(rset0.getString("ordr_dt"));
			rec.ordr_grp_seq = Util.checkString(rset0.getString("ordr_grp_seq"));
			rec.ordr_seq = Util.checkString(rset0.getString("ordr_seq"));
			rec.deal_dt = Util.checkString(rset0.getString("deal_dt"));
			rec.deal_grp_seq = Util.checkString(rset0.getString("deal_grp_seq"));
			rec.deal_seq = Util.checkString(rset0.getString("deal_seq"));
			rec.medi_clsf = Util.checkString(rset0.getString("medi_clsf"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_ser_no = Util.checkString(rset0.getString("medi_ser_no"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.stok_qty = Util.checkString(rset0.getString("stok_qty"));
			rec.deal_qty = Util.checkString(rset0.getString("deal_qty"));
			rec.deal_uprc = Util.checkString(rset0.getString("deal_uprc"));
			rec.dcrate = Util.checkString(rset0.getString("dcrate"));
			rec.deal_amt = Util.checkString(rset0.getString("deal_amt"));
			rec.sale_clsf = Util.checkString(rset0.getString("sale_clsf"));
			rec.sendclsf = Util.checkString(rset0.getString("sendclsf"));
			rec.wh_cd = Util.checkString(rset0.getString("wh_cd"));
			rec.sell_type = Util.checkString(rset0.getString("sell_type"));
			this.ordr_ptcrcur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_SAL_1420_LDataSet ds = (PL_SAL_1420_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.ordr_ptcrcur.size(); i++){
		PL_SAL_1420_LORDR_PTCRCURRecord ordr_ptcrcurRec = (PL_SAL_1420_LORDR_PTCRCURRecord)ds.ordr_ptcrcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getOrdr_dt()%>
<%= ds.getOrdr_grp_seq()%>
<%= ds.getDeal_dt()%>
<%= ds.getDeal_grp_seq()%>
<%= ds.getMedi_clsf()%>
<%= ds.getBasi_dt()%>
<%= ds.getDlco_cd()%>
<%= ds.getDlco_seq()%>
<%= ds.getDlco_nm()%>
<%= ds.getSend_plac_seq()%>
<%= ds.getSend_plac_nm()%>
<%= ds.getSend_plac_tel_no_1()%>
<%= ds.getSend_plac_tel_no_2()%>
<%= ds.getSend_plac_tel_no_3()%>
<%= ds.getSend_plac_ptph_no_1()%>
<%= ds.getSend_plac_ptph_no_2()%>
<%= ds.getSend_plac_ptph_no_3()%>
<%= ds.getSend_plac_fax_no_1()%>
<%= ds.getSend_plac_fax_no_2()%>
<%= ds.getSend_plac_fax_no_3()%>
<%= ds.getSend_plac_zip_1()%>
<%= ds.getSend_plac_zip_2()%>
<%= ds.getSend_plac_addr()%>
<%= ds.getSend_plac_dtls_addr()%>
<%= ds.getRemk()%>
<%= ds.getOrdr_ptcrcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= ordr_ptcrcurRec.ordr_dt%>
<%= ordr_ptcrcurRec.ordr_grp_seq%>
<%= ordr_ptcrcurRec.ordr_seq%>
<%= ordr_ptcrcurRec.deal_dt%>
<%= ordr_ptcrcurRec.deal_grp_seq%>
<%= ordr_ptcrcurRec.deal_seq%>
<%= ordr_ptcrcurRec.medi_clsf%>
<%= ordr_ptcrcurRec.medi_cd%>
<%= ordr_ptcrcurRec.medi_ser_no%>
<%= ordr_ptcrcurRec.medi_nm%>
<%= ordr_ptcrcurRec.stok_qty%>
<%= ordr_ptcrcurRec.deal_qty%>
<%= ordr_ptcrcurRec.deal_uprc%>
<%= ordr_ptcrcurRec.dcrate%>
<%= ordr_ptcrcurRec.deal_amt%>
<%= ordr_ptcrcurRec.sale_clsf%>
<%= ordr_ptcrcurRec.sendclsf%>
<%= ordr_ptcrcurRec.wh_cd%>
<%= ordr_ptcrcurRec.sell_type%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 02 20:57:50 KST 2009 */