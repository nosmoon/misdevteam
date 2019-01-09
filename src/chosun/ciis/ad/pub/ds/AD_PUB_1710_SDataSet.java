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


package chosun.ciis.ad.pub.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.pub.rec.AD_PUB_1710_SCURLISTRecord;

/**
 * 
 */


public class AD_PUB_1710_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String medi_cd;
	public String proc_dt;
	public String proc_seq;
	public String pubc_occr_dt;
	public String pubc_occr_seq;
	public String pubc_slip_no;
	public String hndl_clsf;
	public String dlco_no;
	public String dlco_nm;
	public String advt_cont;
	public String pubc_side;
	public String issu_ser_no;
	public String publ_std;
	public String advt_fee;
	public String vat;
	public String pubc_tot_amt;
	public String agn;
	public String agn_nm;
	public String fee_rate;
	public String fee;
	public String hndl_plac_cd;
	public String hndl_plac_nm;
	public String coms_rate;
	public String coms;
	public String div_yn;
	public String clos_stat;
	public String clamt_stat;
	public String sale_stmt_issu_yn;
	public String purc_stmt_issu_yn;
	public String sum_advt_fee;
	public String sum_vat;
	public String sum_pubc_tot_amt;
	public String sum_fee;
	public String sum_coms;

	public AD_PUB_1710_SDataSet(){}
	public AD_PUB_1710_SDataSet(String errcode, String errmsg, String medi_cd, String proc_dt, String proc_seq, String pubc_occr_dt, String pubc_occr_seq, String pubc_slip_no, String hndl_clsf, String dlco_no, String dlco_nm, String advt_cont, String pubc_side, String issu_ser_no, String publ_std, String advt_fee, String vat, String pubc_tot_amt, String agn, String agn_nm, String fee_rate, String fee, String hndl_plac_cd, String hndl_plac_nm, String coms_rate, String coms, String div_yn, String clos_stat, String clamt_stat, String sale_stmt_issu_yn, String purc_stmt_issu_yn, String sum_advt_fee, String sum_vat, String sum_pubc_tot_amt, String sum_fee, String sum_coms){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.medi_cd = medi_cd;
		this.proc_dt = proc_dt;
		this.proc_seq = proc_seq;
		this.pubc_occr_dt = pubc_occr_dt;
		this.pubc_occr_seq = pubc_occr_seq;
		this.pubc_slip_no = pubc_slip_no;
		this.hndl_clsf = hndl_clsf;
		this.dlco_no = dlco_no;
		this.dlco_nm = dlco_nm;
		this.advt_cont = advt_cont;
		this.pubc_side = pubc_side;
		this.issu_ser_no = issu_ser_no;
		this.publ_std = publ_std;
		this.advt_fee = advt_fee;
		this.vat = vat;
		this.pubc_tot_amt = pubc_tot_amt;
		this.agn = agn;
		this.agn_nm = agn_nm;
		this.fee_rate = fee_rate;
		this.fee = fee;
		this.hndl_plac_cd = hndl_plac_cd;
		this.hndl_plac_nm = hndl_plac_nm;
		this.coms_rate = coms_rate;
		this.coms = coms;
		this.div_yn = div_yn;
		this.clos_stat = clos_stat;
		this.clamt_stat = clamt_stat;
		this.sale_stmt_issu_yn = sale_stmt_issu_yn;
		this.purc_stmt_issu_yn = purc_stmt_issu_yn;
		this.sum_advt_fee = sum_advt_fee;
		this.sum_vat = sum_vat;
		this.sum_pubc_tot_amt = sum_pubc_tot_amt;
		this.sum_fee = sum_fee;
		this.sum_coms = sum_coms;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setProc_dt(String proc_dt){
		this.proc_dt = proc_dt;
	}

	public void setProc_seq(String proc_seq){
		this.proc_seq = proc_seq;
	}

	public void setPubc_occr_dt(String pubc_occr_dt){
		this.pubc_occr_dt = pubc_occr_dt;
	}

	public void setPubc_occr_seq(String pubc_occr_seq){
		this.pubc_occr_seq = pubc_occr_seq;
	}

	public void setPubc_slip_no(String pubc_slip_no){
		this.pubc_slip_no = pubc_slip_no;
	}

	public void setHndl_clsf(String hndl_clsf){
		this.hndl_clsf = hndl_clsf;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setAdvt_cont(String advt_cont){
		this.advt_cont = advt_cont;
	}

	public void setPubc_side(String pubc_side){
		this.pubc_side = pubc_side;
	}

	public void setIssu_ser_no(String issu_ser_no){
		this.issu_ser_no = issu_ser_no;
	}

	public void setPubl_std(String publ_std){
		this.publ_std = publ_std;
	}

	public void setAdvt_fee(String advt_fee){
		this.advt_fee = advt_fee;
	}

	public void setVat(String vat){
		this.vat = vat;
	}

	public void setPubc_tot_amt(String pubc_tot_amt){
		this.pubc_tot_amt = pubc_tot_amt;
	}

	public void setAgn(String agn){
		this.agn = agn;
	}

	public void setAgn_nm(String agn_nm){
		this.agn_nm = agn_nm;
	}

	public void setFee_rate(String fee_rate){
		this.fee_rate = fee_rate;
	}

	public void setFee(String fee){
		this.fee = fee;
	}

	public void setHndl_plac_cd(String hndl_plac_cd){
		this.hndl_plac_cd = hndl_plac_cd;
	}

	public void setHndl_plac_nm(String hndl_plac_nm){
		this.hndl_plac_nm = hndl_plac_nm;
	}

	public void setComs_rate(String coms_rate){
		this.coms_rate = coms_rate;
	}

	public void setComs(String coms){
		this.coms = coms;
	}

	public void setDiv_yn(String div_yn){
		this.div_yn = div_yn;
	}

	public void setClos_stat(String clos_stat){
		this.clos_stat = clos_stat;
	}

	public void setClamt_stat(String clamt_stat){
		this.clamt_stat = clamt_stat;
	}

	public void setSale_stmt_issu_yn(String sale_stmt_issu_yn){
		this.sale_stmt_issu_yn = sale_stmt_issu_yn;
	}

	public void setPurc_stmt_issu_yn(String purc_stmt_issu_yn){
		this.purc_stmt_issu_yn = purc_stmt_issu_yn;
	}

	public void setSum_advt_fee(String sum_advt_fee){
		this.sum_advt_fee = sum_advt_fee;
	}

	public void setSum_vat(String sum_vat){
		this.sum_vat = sum_vat;
	}

	public void setSum_pubc_tot_amt(String sum_pubc_tot_amt){
		this.sum_pubc_tot_amt = sum_pubc_tot_amt;
	}

	public void setSum_fee(String sum_fee){
		this.sum_fee = sum_fee;
	}

	public void setSum_coms(String sum_coms){
		this.sum_coms = sum_coms;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getProc_dt(){
		return this.proc_dt;
	}

	public String getProc_seq(){
		return this.proc_seq;
	}

	public String getPubc_occr_dt(){
		return this.pubc_occr_dt;
	}

	public String getPubc_occr_seq(){
		return this.pubc_occr_seq;
	}

	public String getPubc_slip_no(){
		return this.pubc_slip_no;
	}

	public String getHndl_clsf(){
		return this.hndl_clsf;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getAdvt_cont(){
		return this.advt_cont;
	}

	public String getPubc_side(){
		return this.pubc_side;
	}

	public String getIssu_ser_no(){
		return this.issu_ser_no;
	}

	public String getPubl_std(){
		return this.publ_std;
	}

	public String getAdvt_fee(){
		return this.advt_fee;
	}

	public String getVat(){
		return this.vat;
	}

	public String getPubc_tot_amt(){
		return this.pubc_tot_amt;
	}

	public String getAgn(){
		return this.agn;
	}

	public String getAgn_nm(){
		return this.agn_nm;
	}

	public String getFee_rate(){
		return this.fee_rate;
	}

	public String getFee(){
		return this.fee;
	}

	public String getHndl_plac_cd(){
		return this.hndl_plac_cd;
	}

	public String getHndl_plac_nm(){
		return this.hndl_plac_nm;
	}

	public String getComs_rate(){
		return this.coms_rate;
	}

	public String getComs(){
		return this.coms;
	}

	public String getDiv_yn(){
		return this.div_yn;
	}

	public String getClos_stat(){
		return this.clos_stat;
	}

	public String getClamt_stat(){
		return this.clamt_stat;
	}

	public String getSale_stmt_issu_yn(){
		return this.sale_stmt_issu_yn;
	}

	public String getPurc_stmt_issu_yn(){
		return this.purc_stmt_issu_yn;
	}

	public String getSum_advt_fee(){
		return this.sum_advt_fee;
	}

	public String getSum_vat(){
		return this.sum_vat;
	}

	public String getSum_pubc_tot_amt(){
		return this.sum_pubc_tot_amt;
	}

	public String getSum_fee(){
		return this.sum_fee;
	}

	public String getSum_coms(){
		return this.sum_coms;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.medi_cd = Util.checkString(cstmt.getString(4));
		this.proc_dt = Util.checkString(cstmt.getString(5));
		this.proc_seq = Util.checkString(cstmt.getString(6));
		this.pubc_occr_dt = Util.checkString(cstmt.getString(7));
		this.pubc_occr_seq = Util.checkString(cstmt.getString(8));
		this.pubc_slip_no = Util.checkString(cstmt.getString(9));
		this.hndl_clsf = Util.checkString(cstmt.getString(10));
		this.dlco_no = Util.checkString(cstmt.getString(11));
		this.dlco_nm = Util.checkString(cstmt.getString(12));
		this.advt_cont = Util.checkString(cstmt.getString(13));
		this.pubc_side = Util.checkString(cstmt.getString(14));
		this.issu_ser_no = Util.checkString(cstmt.getString(15));
		this.publ_std = Util.checkString(cstmt.getString(16));
		this.advt_fee = Util.checkString(cstmt.getString(17));
		this.vat = Util.checkString(cstmt.getString(18));
		this.pubc_tot_amt = Util.checkString(cstmt.getString(19));
		this.agn = Util.checkString(cstmt.getString(20));
		this.agn_nm = Util.checkString(cstmt.getString(21));
		this.fee_rate = Util.checkString(cstmt.getString(22));
		this.fee = Util.checkString(cstmt.getString(23));
		this.hndl_plac_cd = Util.checkString(cstmt.getString(24));
		this.hndl_plac_nm = Util.checkString(cstmt.getString(25));
		this.coms_rate = Util.checkString(cstmt.getString(26));
		this.coms = Util.checkString(cstmt.getString(27));
		this.div_yn = Util.checkString(cstmt.getString(28));
		this.clos_stat = Util.checkString(cstmt.getString(29));
		this.clamt_stat = Util.checkString(cstmt.getString(30));
		this.sale_stmt_issu_yn = Util.checkString(cstmt.getString(31));
		this.purc_stmt_issu_yn = Util.checkString(cstmt.getString(32));
		this.sum_advt_fee = Util.checkString(cstmt.getString(33));
		this.sum_vat = Util.checkString(cstmt.getString(34));
		this.sum_pubc_tot_amt = Util.checkString(cstmt.getString(35));
		this.sum_fee = Util.checkString(cstmt.getString(36));
		this.sum_coms = Util.checkString(cstmt.getString(37));
		ResultSet rset0 = (ResultSet) cstmt.getObject(38);
		while(rset0.next()){
			AD_PUB_1710_SCURLISTRecord rec = new AD_PUB_1710_SCURLISTRecord();
			rec.pubc_slip_no = Util.checkString(rset0.getString("pubc_slip_no"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.advt_cont = Util.checkString(rset0.getString("advt_cont"));
			rec.issu_ser_no = Util.checkString(rset0.getString("issu_ser_no"));
			rec.publ_std = Util.checkString(rset0.getString("publ_std"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			rec.vat = Util.checkString(rset0.getString("vat"));
			rec.pubc_tot_amt = Util.checkString(rset0.getString("pubc_tot_amt"));
			rec.fee = Util.checkString(rset0.getString("fee"));
			rec.coms = Util.checkString(rset0.getString("coms"));
			rec.pubc_occr_dt = Util.checkString(rset0.getString("pubc_occr_dt"));
			rec.pubc_occr_seq = Util.checkString(rset0.getString("pubc_occr_seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_PUB_1710_SDataSet ds = (AD_PUB_1710_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_PUB_1710_SCURLISTRecord curlistRec = (AD_PUB_1710_SCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedi_cd()%>
<%= ds.getProc_dt()%>
<%= ds.getProc_seq()%>
<%= ds.getPubc_occr_dt()%>
<%= ds.getPubc_occr_seq()%>
<%= ds.getPubc_slip_no()%>
<%= ds.getHndl_clsf()%>
<%= ds.getDlco_no()%>
<%= ds.getDlco_nm()%>
<%= ds.getAdvt_cont()%>
<%= ds.getPubc_side()%>
<%= ds.getIssu_ser_no()%>
<%= ds.getPubl_std()%>
<%= ds.getAdvt_fee()%>
<%= ds.getVat()%>
<%= ds.getPubc_tot_amt()%>
<%= ds.getAgn()%>
<%= ds.getAgn_nm()%>
<%= ds.getFee_rate()%>
<%= ds.getFee()%>
<%= ds.getHndl_plac_cd()%>
<%= ds.getHndl_plac_nm()%>
<%= ds.getComs_rate()%>
<%= ds.getComs()%>
<%= ds.getDiv_yn()%>
<%= ds.getClos_stat()%>
<%= ds.getClamt_stat()%>
<%= ds.getSale_stmt_issu_yn()%>
<%= ds.getPurc_stmt_issu_yn()%>
<%= ds.getSum_advt_fee()%>
<%= ds.getSum_vat()%>
<%= ds.getSum_pubc_tot_amt()%>
<%= ds.getSum_fee()%>
<%= ds.getSum_coms()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.pubc_slip_no%>
<%= curlistRec.dlco_no%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.advt_cont%>
<%= curlistRec.issu_ser_no%>
<%= curlistRec.publ_std%>
<%= curlistRec.advt_fee%>
<%= curlistRec.vat%>
<%= curlistRec.pubc_tot_amt%>
<%= curlistRec.fee%>
<%= curlistRec.coms%>
<%= curlistRec.pubc_occr_dt%>
<%= curlistRec.pubc_occr_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 17 15:56:24 KST 2009 */