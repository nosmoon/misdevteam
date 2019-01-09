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


public class AD_BAS_1110_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String dlco_no;
	public String dlco_nm;
	public String ern;
	public String presi_nm;
	public String bizcond;
	public String capt_amt;
	public String tel;
	public String presi_prn;
	public String item;
	public String zip_1;
	public String zip_2;
	public String addr;
	public String dtls_addr;
	public String presi_zip_1;
	public String presi_zip_2;
	public String presi_addr;
	public String presi_dtls_addr;
	public String cntr_type;
	public String cntr_prd_frdt;
	public String cntr_prd_todt;
	public String fndt_dt;
	public String mang_clsf;
	public String grp_cmpy_cd;
	public String evlu_frdt;
	public String evlu_todt;
	public String dhon_dt;
	public String cntr_frdt;
	public String cntr_todt;
	public String gnr_advcs_yn;
	public String arow_advcs_yn;
	public String agn_yn;
	public String nmd_agn_yn;
	public String advt_bo_yn;
	public String bo_bof_yn;
	public String del_yn;
	public String deal_ptcr_unissu_yn;
	public String slcrg_pers;
	public String slcrg_pers_nm;
	public String mchrg_pers;
	public String mchrg_pers_nm;
	public String chg_dt_tm;
	public String chg_pers;
	public String gurt_pers;
	public String gurt_pers_addr;
	public String gurt_pers_prn;

	public AD_BAS_1110_SDataSet(){}
	public AD_BAS_1110_SDataSet(String errcode, String errmsg, String dlco_no, String dlco_nm, String ern, String presi_nm, String bizcond, String capt_amt, String tel, String presi_prn, String item, String zip_1, String zip_2, String addr, String dtls_addr, String presi_zip_1, String presi_zip_2, String presi_addr, String presi_dtls_addr, String cntr_type, String cntr_prd_frdt, String cntr_prd_todt, String fndt_dt, String mang_clsf, String grp_cmpy_cd, String evlu_frdt, String evlu_todt, String dhon_dt, String cntr_frdt, String cntr_todt, String gnr_advcs_yn, String arow_advcs_yn, String agn_yn, String nmd_agn_yn, String advt_bo_yn, String bo_bof_yn, String del_yn, String deal_ptcr_unissu_yn, String slcrg_pers, String slcrg_pers_nm, String mchrg_pers, String mchrg_pers_nm, String chg_dt_tm, String chg_pers, String gurt_pers, String gurt_pers_addr, String gurt_pers_prn){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.dlco_no = dlco_no;
		this.dlco_nm = dlco_nm;
		this.ern = ern;
		this.presi_nm = presi_nm;
		this.bizcond = bizcond;
		this.capt_amt = capt_amt;
		this.tel = tel;
		this.presi_prn = presi_prn;
		this.item = item;
		this.zip_1 = zip_1;
		this.zip_2 = zip_2;
		this.addr = addr;
		this.dtls_addr = dtls_addr;
		this.presi_zip_1 = presi_zip_1;
		this.presi_zip_2 = presi_zip_2;
		this.presi_addr = presi_addr;
		this.presi_dtls_addr = presi_dtls_addr;
		this.cntr_type = cntr_type;
		this.cntr_prd_frdt = cntr_prd_frdt;
		this.cntr_prd_todt = cntr_prd_todt;
		this.fndt_dt = fndt_dt;
		this.mang_clsf = mang_clsf;
		this.grp_cmpy_cd = grp_cmpy_cd;
		this.evlu_frdt = evlu_frdt;
		this.evlu_todt = evlu_todt;
		this.dhon_dt = dhon_dt;
		this.cntr_frdt = cntr_frdt;
		this.cntr_todt = cntr_todt;
		this.gnr_advcs_yn = gnr_advcs_yn;
		this.arow_advcs_yn = arow_advcs_yn;
		this.agn_yn = agn_yn;
		this.nmd_agn_yn = nmd_agn_yn;
		this.advt_bo_yn = advt_bo_yn;
		this.bo_bof_yn = bo_bof_yn;
		this.del_yn = del_yn;
		this.deal_ptcr_unissu_yn = deal_ptcr_unissu_yn;
		this.slcrg_pers = slcrg_pers;
		this.slcrg_pers_nm = slcrg_pers_nm;
		this.mchrg_pers = mchrg_pers;
		this.mchrg_pers_nm = mchrg_pers_nm;
		this.chg_dt_tm = chg_dt_tm;
		this.chg_pers = chg_pers;
		this.gurt_pers = gurt_pers;
		this.gurt_pers_addr = gurt_pers_addr;
		this.gurt_pers_prn = gurt_pers_prn;
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

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
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

	public void setCapt_amt(String capt_amt){
		this.capt_amt = capt_amt;
	}

	public void setTel(String tel){
		this.tel = tel;
	}

	public void setPresi_prn(String presi_prn){
		this.presi_prn = presi_prn;
	}

	public void setItem(String item){
		this.item = item;
	}

	public void setZip_1(String zip_1){
		this.zip_1 = zip_1;
	}

	public void setZip_2(String zip_2){
		this.zip_2 = zip_2;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtls_addr(String dtls_addr){
		this.dtls_addr = dtls_addr;
	}

	public void setPresi_zip_1(String presi_zip_1){
		this.presi_zip_1 = presi_zip_1;
	}

	public void setPresi_zip_2(String presi_zip_2){
		this.presi_zip_2 = presi_zip_2;
	}

	public void setPresi_addr(String presi_addr){
		this.presi_addr = presi_addr;
	}

	public void setPresi_dtls_addr(String presi_dtls_addr){
		this.presi_dtls_addr = presi_dtls_addr;
	}

	public void setCntr_type(String cntr_type){
		this.cntr_type = cntr_type;
	}

	public void setCntr_prd_frdt(String cntr_prd_frdt){
		this.cntr_prd_frdt = cntr_prd_frdt;
	}

	public void setCntr_prd_todt(String cntr_prd_todt){
		this.cntr_prd_todt = cntr_prd_todt;
	}

	public void setFndt_dt(String fndt_dt){
		this.fndt_dt = fndt_dt;
	}

	public void setMang_clsf(String mang_clsf){
		this.mang_clsf = mang_clsf;
	}

	public void setGrp_cmpy_cd(String grp_cmpy_cd){
		this.grp_cmpy_cd = grp_cmpy_cd;
	}

	public void setEvlu_frdt(String evlu_frdt){
		this.evlu_frdt = evlu_frdt;
	}

	public void setEvlu_todt(String evlu_todt){
		this.evlu_todt = evlu_todt;
	}

	public void setDhon_dt(String dhon_dt){
		this.dhon_dt = dhon_dt;
	}

	public void setCntr_frdt(String cntr_frdt){
		this.cntr_frdt = cntr_frdt;
	}

	public void setCntr_todt(String cntr_todt){
		this.cntr_todt = cntr_todt;
	}

	public void setGnr_advcs_yn(String gnr_advcs_yn){
		this.gnr_advcs_yn = gnr_advcs_yn;
	}

	public void setArow_advcs_yn(String arow_advcs_yn){
		this.arow_advcs_yn = arow_advcs_yn;
	}

	public void setAgn_yn(String agn_yn){
		this.agn_yn = agn_yn;
	}

	public void setNmd_agn_yn(String nmd_agn_yn){
		this.nmd_agn_yn = nmd_agn_yn;
	}

	public void setAdvt_bo_yn(String advt_bo_yn){
		this.advt_bo_yn = advt_bo_yn;
	}

	public void setBo_bof_yn(String bo_bof_yn){
		this.bo_bof_yn = bo_bof_yn;
	}

	public void setDel_yn(String del_yn){
		this.del_yn = del_yn;
	}

	public void setDeal_ptcr_unissu_yn(String deal_ptcr_unissu_yn){
		this.deal_ptcr_unissu_yn = deal_ptcr_unissu_yn;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public void setSlcrg_pers_nm(String slcrg_pers_nm){
		this.slcrg_pers_nm = slcrg_pers_nm;
	}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
	}

	public void setMchrg_pers_nm(String mchrg_pers_nm){
		this.mchrg_pers_nm = mchrg_pers_nm;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setGurt_pers(String gurt_pers){
		this.gurt_pers = gurt_pers;
	}

	public void setGurt_pers_addr(String gurt_pers_addr){
		this.gurt_pers_addr = gurt_pers_addr;
	}

	public void setGurt_pers_prn(String gurt_pers_prn){
		this.gurt_pers_prn = gurt_pers_prn;
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

	public String getDlco_nm(){
		return this.dlco_nm;
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

	public String getCapt_amt(){
		return this.capt_amt;
	}

	public String getTel(){
		return this.tel;
	}

	public String getPresi_prn(){
		return this.presi_prn;
	}

	public String getItem(){
		return this.item;
	}

	public String getZip_1(){
		return this.zip_1;
	}

	public String getZip_2(){
		return this.zip_2;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtls_addr(){
		return this.dtls_addr;
	}

	public String getPresi_zip_1(){
		return this.presi_zip_1;
	}

	public String getPresi_zip_2(){
		return this.presi_zip_2;
	}

	public String getPresi_addr(){
		return this.presi_addr;
	}

	public String getPresi_dtls_addr(){
		return this.presi_dtls_addr;
	}

	public String getCntr_type(){
		return this.cntr_type;
	}

	public String getCntr_prd_frdt(){
		return this.cntr_prd_frdt;
	}

	public String getCntr_prd_todt(){
		return this.cntr_prd_todt;
	}

	public String getFndt_dt(){
		return this.fndt_dt;
	}

	public String getMang_clsf(){
		return this.mang_clsf;
	}

	public String getGrp_cmpy_cd(){
		return this.grp_cmpy_cd;
	}

	public String getEvlu_frdt(){
		return this.evlu_frdt;
	}

	public String getEvlu_todt(){
		return this.evlu_todt;
	}

	public String getDhon_dt(){
		return this.dhon_dt;
	}

	public String getCntr_frdt(){
		return this.cntr_frdt;
	}

	public String getCntr_todt(){
		return this.cntr_todt;
	}

	public String getGnr_advcs_yn(){
		return this.gnr_advcs_yn;
	}

	public String getArow_advcs_yn(){
		return this.arow_advcs_yn;
	}

	public String getAgn_yn(){
		return this.agn_yn;
	}

	public String getNmd_agn_yn(){
		return this.nmd_agn_yn;
	}

	public String getAdvt_bo_yn(){
		return this.advt_bo_yn;
	}

	public String getBo_bof_yn(){
		return this.bo_bof_yn;
	}

	public String getDel_yn(){
		return this.del_yn;
	}

	public String getDeal_ptcr_unissu_yn(){
		return this.deal_ptcr_unissu_yn;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getSlcrg_pers_nm(){
		return this.slcrg_pers_nm;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
	}

	public String getMchrg_pers_nm(){
		return this.mchrg_pers_nm;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getGurt_pers(){
		return this.gurt_pers;
	}

	public String getGurt_pers_addr(){
		return this.gurt_pers_addr;
	}

	public String getGurt_pers_prn(){
		return this.gurt_pers_prn;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.dlco_no = Util.checkString(cstmt.getString(7));
		this.dlco_nm = Util.checkString(cstmt.getString(8));
		this.ern = Util.checkString(cstmt.getString(9));
		this.presi_nm = Util.checkString(cstmt.getString(10));
		this.bizcond = Util.checkString(cstmt.getString(11));
		this.capt_amt = Util.checkString(cstmt.getString(12));
		this.tel = Util.checkString(cstmt.getString(13));
		this.presi_prn = Util.checkString(cstmt.getString(14));
		this.item = Util.checkString(cstmt.getString(15));
		this.zip_1 = Util.checkString(cstmt.getString(16));
		this.zip_2 = Util.checkString(cstmt.getString(17));
		this.addr = Util.checkString(cstmt.getString(18));
		this.dtls_addr = Util.checkString(cstmt.getString(19));
		this.presi_zip_1 = Util.checkString(cstmt.getString(20));
		this.presi_zip_2 = Util.checkString(cstmt.getString(21));
		this.presi_addr = Util.checkString(cstmt.getString(22));
		this.presi_dtls_addr = Util.checkString(cstmt.getString(23));
		this.cntr_type = Util.checkString(cstmt.getString(24));
		this.cntr_prd_frdt = Util.checkString(cstmt.getString(25));
		this.cntr_prd_todt = Util.checkString(cstmt.getString(26));
		this.fndt_dt = Util.checkString(cstmt.getString(27));
		this.mang_clsf = Util.checkString(cstmt.getString(28));
		this.grp_cmpy_cd = Util.checkString(cstmt.getString(29));
		this.evlu_frdt = Util.checkString(cstmt.getString(30));
		this.evlu_todt = Util.checkString(cstmt.getString(31));
		this.dhon_dt = Util.checkString(cstmt.getString(32));
		this.cntr_frdt = Util.checkString(cstmt.getString(33));
		this.cntr_todt = Util.checkString(cstmt.getString(34));
		this.gnr_advcs_yn = Util.checkString(cstmt.getString(35));
		this.arow_advcs_yn = Util.checkString(cstmt.getString(36));
		this.agn_yn = Util.checkString(cstmt.getString(37));
		this.nmd_agn_yn = Util.checkString(cstmt.getString(38));
		this.advt_bo_yn = Util.checkString(cstmt.getString(39));
		this.bo_bof_yn = Util.checkString(cstmt.getString(40));
		this.del_yn = Util.checkString(cstmt.getString(41));
		this.deal_ptcr_unissu_yn = Util.checkString(cstmt.getString(42));
		this.slcrg_pers = Util.checkString(cstmt.getString(43));
		this.slcrg_pers_nm = Util.checkString(cstmt.getString(44));
		this.mchrg_pers = Util.checkString(cstmt.getString(45));
		this.mchrg_pers_nm = Util.checkString(cstmt.getString(46));
		this.chg_dt_tm = Util.checkString(cstmt.getString(47));
		this.chg_pers = Util.checkString(cstmt.getString(48));
		this.gurt_pers = Util.checkString(cstmt.getString(49));
		this.gurt_pers_addr = Util.checkString(cstmt.getString(50));
		this.gurt_pers_prn = Util.checkString(cstmt.getString(51));
		ResultSet rset0 = (ResultSet) cstmt.getObject(52);
		while(rset0.next()){
			AD_BAS_1110_SCURLISTRecord rec = new AD_BAS_1110_SCURLISTRecord();
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.repl_rtcn_cnfm1 = Util.checkString(rset0.getString("repl_rtcn_cnfm1"));
			rec.repl_rtcn_cnfm2 = Util.checkString(rset0.getString("repl_rtcn_cnfm2"));
			rec.repl_rtcn_cnfm3 = Util.checkString(rset0.getString("repl_rtcn_cnfm3"));
			rec.mortg_clsf = Util.checkString(rset0.getString("mortg_clsf"));
			rec.mortg_cont = Util.checkString(rset0.getString("mortg_cont"));
			rec.mortg_amt = Util.checkString(rset0.getString("mortg_amt"));
			rec.acct_no = Util.checkString(rset0.getString("acct_no"));
			rec.gurt_frdt = Util.checkString(rset0.getString("gurt_frdt"));
			rec.gurt_todt = Util.checkString(rset0.getString("gurt_todt"));
			rec.ewh_dt = Util.checkString(rset0.getString("ewh_dt"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.setup_pers = Util.checkString(rset0.getString("setup_pers"));
			rec.ewh_cnfm = Util.checkString(rset0.getString("ewh_cnfm"));
			rec.owh_cnfm = Util.checkString(rset0.getString("owh_cnfm"));
			rec.eip_stat = Util.checkString(rset0.getString("eip_stat"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(53);
		while(rset1.next()){
			AD_BAS_1110_SCURLIST2Record rec = new AD_BAS_1110_SCURLIST2Record();
			rec.seq = Util.checkString(rset1.getString("seq"));
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			rec.chrg_pers_nm = Util.checkString(rset1.getString("chrg_pers_nm"));
			rec.cntc_plac = Util.checkString(rset1.getString("cntc_plac"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BAS_1110_SDataSet ds = (AD_BAS_1110_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_BAS_1110_SCURLISTRecord curlistRec = (AD_BAS_1110_SCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_BAS_1110_SCURLIST2Record curlist2Rec = (AD_BAS_1110_SCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDlco_no()%>
<%= ds.getDlco_nm()%>
<%= ds.getErn()%>
<%= ds.getPresi_nm()%>
<%= ds.getBizcond()%>
<%= ds.getCapt_amt()%>
<%= ds.getTel()%>
<%= ds.getPresi_prn()%>
<%= ds.getItem()%>
<%= ds.getZip_1()%>
<%= ds.getZip_2()%>
<%= ds.getAddr()%>
<%= ds.getDtls_addr()%>
<%= ds.getPresi_zip_1()%>
<%= ds.getPresi_zip_2()%>
<%= ds.getPresi_addr()%>
<%= ds.getPresi_dtls_addr()%>
<%= ds.getCntr_type()%>
<%= ds.getCntr_prd_frdt()%>
<%= ds.getCntr_prd_todt()%>
<%= ds.getFndt_dt()%>
<%= ds.getMang_clsf()%>
<%= ds.getGrp_cmpy_cd()%>
<%= ds.getEvlu_frdt()%>
<%= ds.getEvlu_todt()%>
<%= ds.getDhon_dt()%>
<%= ds.getCntr_frdt()%>
<%= ds.getCntr_todt()%>
<%= ds.getGnr_advcs_yn()%>
<%= ds.getArow_advcs_yn()%>
<%= ds.getAgn_yn()%>
<%= ds.getNmd_agn_yn()%>
<%= ds.getAdvt_bo_yn()%>
<%= ds.getBo_bof_yn()%>
<%= ds.getDel_yn()%>
<%= ds.getDeal_ptcr_unissu_yn()%>
<%= ds.getSlcrg_pers()%>
<%= ds.getSlcrg_pers_nm()%>
<%= ds.getMchrg_pers()%>
<%= ds.getMchrg_pers_nm()%>
<%= ds.getChg_dt_tm()%>
<%= ds.getChg_pers()%>
<%= ds.getGurt_pers()%>
<%= ds.getGurt_pers_addr()%>
<%= ds.getGurt_pers_prn()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.seq%>
<%= curlistRec.repl_rtcn_cnfm1%>
<%= curlistRec.repl_rtcn_cnfm2%>
<%= curlistRec.repl_rtcn_cnfm3%>
<%= curlistRec.mortg_clsf%>
<%= curlistRec.mortg_cont%>
<%= curlistRec.mortg_amt%>
<%= curlistRec.acct_no%>
<%= curlistRec.gurt_frdt%>
<%= curlistRec.gurt_todt%>
<%= curlistRec.ewh_dt%>
<%= curlistRec.remk%>
<%= curlistRec.setup_pers%>
<%= curlistRec.ewh_cnfm%>
<%= curlistRec.owh_cnfm%>
<%= curlistRec.eip_stat%>
<%= curlist2Rec.seq%>
<%= curlist2Rec.dept_nm%>
<%= curlist2Rec.chrg_pers_nm%>
<%= curlist2Rec.cntc_plac%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 05 18:01:24 KST 2013 */