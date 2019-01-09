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


public class AD_BAS_1010_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String dlco_no;
	public String dlco_nm;
	public String dlco_abrv_nm;
	public String ern;
	public String zip_1;
	public String zip_2;
	public String addr;
	public String dtls_addr;
	public String presi_nm;
	public String presi_prn;
	public String presi_zip_1;
	public String presi_zip_2;
	public String presi_addr;
	public String presi_dtls_addr;
	public String bizcond;
	public String item;
	public String grp_cmpy_cd;
	public String eps_clsf_cd;
	public String cntr_yn;
	public String mang_clsf;
	public String oth_cmpy_dlco_yn;
	public String govern_advt_yn;
	public String cntr_type;
	public String slcrg_pers;
	public String mchrg_pers;
	public String slcrg_pers_nm;
	public String mchrg_pers_nm;
	public String indt_cd;
	public String type_cd;
	public String fndt_dt;
	public String dhon_dt;
	public String chg_dt_tm;
	public String chg_pers;
	public String capt_amt;
	public String gnr_advcs_yn;
	public String arow_advcs_yn;
	public String agn_yn;
	public String advt_bo_yn;
	public String bo_bof_yn;
	public String del_yn;
	public String elec_tax_comp_cd;
	public String email_id;
	public String nmd_agn_yn;
	public String chk_cnt;
	public String preng_yn;

	public AD_BAS_1010_SDataSet(){}
	public AD_BAS_1010_SDataSet(String errcode, String errmsg, String dlco_no, String dlco_nm, String dlco_abrv_nm, String ern, String zip_1, String zip_2, String addr, String dtls_addr, String presi_nm, String presi_prn, String presi_zip_1, String presi_zip_2, String presi_addr, String presi_dtls_addr, String bizcond, String item, String grp_cmpy_cd, String eps_clsf_cd, String cntr_yn, String mang_clsf, String oth_cmpy_dlco_yn, String govern_advt_yn, String cntr_type, String slcrg_pers, String mchrg_pers, String slcrg_pers_nm, String mchrg_pers_nm, String indt_cd, String type_cd, String fndt_dt, String dhon_dt, String chg_dt_tm, String chg_pers, String capt_amt, String gnr_advcs_yn, String arow_advcs_yn, String agn_yn, String advt_bo_yn, String bo_bof_yn, String del_yn, String elec_tax_comp_cd, String email_id, String nmd_agn_yn, String chk_cnt, String preng_yn){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.dlco_no = dlco_no;
		this.dlco_nm = dlco_nm;
		this.dlco_abrv_nm = dlco_abrv_nm;
		this.ern = ern;
		this.zip_1 = zip_1;
		this.zip_2 = zip_2;
		this.addr = addr;
		this.dtls_addr = dtls_addr;
		this.presi_nm = presi_nm;
		this.presi_prn = presi_prn;
		this.presi_zip_1 = presi_zip_1;
		this.presi_zip_2 = presi_zip_2;
		this.presi_addr = presi_addr;
		this.presi_dtls_addr = presi_dtls_addr;
		this.bizcond = bizcond;
		this.item = item;
		this.grp_cmpy_cd = grp_cmpy_cd;
		this.eps_clsf_cd = eps_clsf_cd;
		this.cntr_yn = cntr_yn;
		this.mang_clsf = mang_clsf;
		this.oth_cmpy_dlco_yn = oth_cmpy_dlco_yn;
		this.govern_advt_yn = govern_advt_yn;
		this.cntr_type = cntr_type;
		this.slcrg_pers = slcrg_pers;
		this.mchrg_pers = mchrg_pers;
		this.slcrg_pers_nm = slcrg_pers_nm;
		this.mchrg_pers_nm = mchrg_pers_nm;
		this.indt_cd = indt_cd;
		this.type_cd = type_cd;
		this.fndt_dt = fndt_dt;
		this.dhon_dt = dhon_dt;
		this.chg_dt_tm = chg_dt_tm;
		this.chg_pers = chg_pers;
		this.capt_amt = capt_amt;
		this.gnr_advcs_yn = gnr_advcs_yn;
		this.arow_advcs_yn = arow_advcs_yn;
		this.agn_yn = agn_yn;
		this.advt_bo_yn = advt_bo_yn;
		this.bo_bof_yn = bo_bof_yn;
		this.del_yn = del_yn;
		this.elec_tax_comp_cd = elec_tax_comp_cd;
		this.email_id = email_id;
		this.nmd_agn_yn = nmd_agn_yn;
		this.chk_cnt = chk_cnt;
		this.preng_yn = preng_yn;
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

	public void setDlco_abrv_nm(String dlco_abrv_nm){
		this.dlco_abrv_nm = dlco_abrv_nm;
	}

	public void setErn(String ern){
		this.ern = ern;
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

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setPresi_prn(String presi_prn){
		this.presi_prn = presi_prn;
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

	public void setBizcond(String bizcond){
		this.bizcond = bizcond;
	}

	public void setItem(String item){
		this.item = item;
	}

	public void setGrp_cmpy_cd(String grp_cmpy_cd){
		this.grp_cmpy_cd = grp_cmpy_cd;
	}

	public void setEps_clsf_cd(String eps_clsf_cd){
		this.eps_clsf_cd = eps_clsf_cd;
	}

	public void setCntr_yn(String cntr_yn){
		this.cntr_yn = cntr_yn;
	}

	public void setMang_clsf(String mang_clsf){
		this.mang_clsf = mang_clsf;
	}

	public void setOth_cmpy_dlco_yn(String oth_cmpy_dlco_yn){
		this.oth_cmpy_dlco_yn = oth_cmpy_dlco_yn;
	}

	public void setGovern_advt_yn(String govern_advt_yn){
		this.govern_advt_yn = govern_advt_yn;
	}

	public void setCntr_type(String cntr_type){
		this.cntr_type = cntr_type;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
	}

	public void setSlcrg_pers_nm(String slcrg_pers_nm){
		this.slcrg_pers_nm = slcrg_pers_nm;
	}

	public void setMchrg_pers_nm(String mchrg_pers_nm){
		this.mchrg_pers_nm = mchrg_pers_nm;
	}

	public void setIndt_cd(String indt_cd){
		this.indt_cd = indt_cd;
	}

	public void setType_cd(String type_cd){
		this.type_cd = type_cd;
	}

	public void setFndt_dt(String fndt_dt){
		this.fndt_dt = fndt_dt;
	}

	public void setDhon_dt(String dhon_dt){
		this.dhon_dt = dhon_dt;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setCapt_amt(String capt_amt){
		this.capt_amt = capt_amt;
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

	public void setAdvt_bo_yn(String advt_bo_yn){
		this.advt_bo_yn = advt_bo_yn;
	}

	public void setBo_bof_yn(String bo_bof_yn){
		this.bo_bof_yn = bo_bof_yn;
	}

	public void setDel_yn(String del_yn){
		this.del_yn = del_yn;
	}

	public void setElec_tax_comp_cd(String elec_tax_comp_cd){
		this.elec_tax_comp_cd = elec_tax_comp_cd;
	}

	public void setEmail_id(String email_id){
		this.email_id = email_id;
	}

	public void setNmd_agn_yn(String nmd_agn_yn){
		this.nmd_agn_yn = nmd_agn_yn;
	}

	public void setChk_cnt(String chk_cnt){
		this.chk_cnt = chk_cnt;
	}

	public void setPreng_yn(String preng_yn){
		this.preng_yn = preng_yn;
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

	public String getDlco_abrv_nm(){
		return this.dlco_abrv_nm;
	}

	public String getErn(){
		return this.ern;
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

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getPresi_prn(){
		return this.presi_prn;
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

	public String getBizcond(){
		return this.bizcond;
	}

	public String getItem(){
		return this.item;
	}

	public String getGrp_cmpy_cd(){
		return this.grp_cmpy_cd;
	}

	public String getEps_clsf_cd(){
		return this.eps_clsf_cd;
	}

	public String getCntr_yn(){
		return this.cntr_yn;
	}

	public String getMang_clsf(){
		return this.mang_clsf;
	}

	public String getOth_cmpy_dlco_yn(){
		return this.oth_cmpy_dlco_yn;
	}

	public String getGovern_advt_yn(){
		return this.govern_advt_yn;
	}

	public String getCntr_type(){
		return this.cntr_type;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
	}

	public String getSlcrg_pers_nm(){
		return this.slcrg_pers_nm;
	}

	public String getMchrg_pers_nm(){
		return this.mchrg_pers_nm;
	}

	public String getIndt_cd(){
		return this.indt_cd;
	}

	public String getType_cd(){
		return this.type_cd;
	}

	public String getFndt_dt(){
		return this.fndt_dt;
	}

	public String getDhon_dt(){
		return this.dhon_dt;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getCapt_amt(){
		return this.capt_amt;
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

	public String getAdvt_bo_yn(){
		return this.advt_bo_yn;
	}

	public String getBo_bof_yn(){
		return this.bo_bof_yn;
	}

	public String getDel_yn(){
		return this.del_yn;
	}

	public String getElec_tax_comp_cd(){
		return this.elec_tax_comp_cd;
	}

	public String getEmail_id(){
		return this.email_id;
	}

	public String getNmd_agn_yn(){
		return this.nmd_agn_yn;
	}

	public String getChk_cnt(){
		return this.chk_cnt;
	}

	public String getPreng_yn(){
		return this.preng_yn;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.dlco_no = Util.checkString(cstmt.getString(6));
		this.dlco_nm = Util.checkString(cstmt.getString(7));
		this.dlco_abrv_nm = Util.checkString(cstmt.getString(8));
		this.ern = Util.checkString(cstmt.getString(9));
		this.zip_1 = Util.checkString(cstmt.getString(10));
		this.zip_2 = Util.checkString(cstmt.getString(11));
		this.addr = Util.checkString(cstmt.getString(12));
		this.dtls_addr = Util.checkString(cstmt.getString(13));
		this.presi_nm = Util.checkString(cstmt.getString(14));
		this.presi_prn = Util.checkString(cstmt.getString(15));
		this.presi_zip_1 = Util.checkString(cstmt.getString(16));
		this.presi_zip_2 = Util.checkString(cstmt.getString(17));
		this.presi_addr = Util.checkString(cstmt.getString(18));
		this.presi_dtls_addr = Util.checkString(cstmt.getString(19));
		this.bizcond = Util.checkString(cstmt.getString(20));
		this.item = Util.checkString(cstmt.getString(21));
		this.grp_cmpy_cd = Util.checkString(cstmt.getString(22));
		this.eps_clsf_cd = Util.checkString(cstmt.getString(23));
		this.cntr_yn = Util.checkString(cstmt.getString(24));
		this.mang_clsf = Util.checkString(cstmt.getString(25));
		this.oth_cmpy_dlco_yn = Util.checkString(cstmt.getString(26));
		this.govern_advt_yn = Util.checkString(cstmt.getString(27));
		this.cntr_type = Util.checkString(cstmt.getString(28));
		this.slcrg_pers = Util.checkString(cstmt.getString(29));
		this.mchrg_pers = Util.checkString(cstmt.getString(30));
		this.slcrg_pers_nm = Util.checkString(cstmt.getString(31));
		this.mchrg_pers_nm = Util.checkString(cstmt.getString(32));
		this.indt_cd = Util.checkString(cstmt.getString(33));
		this.type_cd = Util.checkString(cstmt.getString(34));
		this.fndt_dt = Util.checkString(cstmt.getString(35));
		this.dhon_dt = Util.checkString(cstmt.getString(36));
		this.chg_dt_tm = Util.checkString(cstmt.getString(37));
		this.chg_pers = Util.checkString(cstmt.getString(38));
		this.capt_amt = Util.checkString(cstmt.getString(39));
		this.gnr_advcs_yn = Util.checkString(cstmt.getString(40));
		this.arow_advcs_yn = Util.checkString(cstmt.getString(41));
		this.agn_yn = Util.checkString(cstmt.getString(42));
		this.advt_bo_yn = Util.checkString(cstmt.getString(43));
		this.bo_bof_yn = Util.checkString(cstmt.getString(44));
		this.del_yn = Util.checkString(cstmt.getString(45));
		this.elec_tax_comp_cd = Util.checkString(cstmt.getString(46));
		this.email_id = Util.checkString(cstmt.getString(47));
		this.nmd_agn_yn = Util.checkString(cstmt.getString(48));
		this.chk_cnt = Util.checkString(cstmt.getString(49));
		this.preng_yn = Util.checkString(cstmt.getString(50));
		ResultSet rset0 = (ResultSet) cstmt.getObject(51);
		while(rset0.next()){
			AD_BAS_1010_SCURLISTRecord rec = new AD_BAS_1010_SCURLISTRecord();
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.job_clsf = Util.checkString(rset0.getString("job_clsf"));
			rec.advcs_feat = Util.checkString(rset0.getString("advcs_feat"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.tel_no = Util.checkString(rset0.getString("tel_no"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(52);
		while(rset1.next()){
			AD_BAS_1010_SCURLIST2Record rec = new AD_BAS_1010_SCURLIST2Record();
			rec.seq = Util.checkString(rset1.getString("seq"));
			rec.dlco_info = Util.checkString(rset1.getString("dlco_info"));
			rec.chrg_pers = Util.checkString(rset1.getString("chrg_pers"));
			rec.insrt_dt = Util.checkString(rset1.getString("insrt_dt"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BAS_1010_SDataSet ds = (AD_BAS_1010_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_BAS_1010_SCURLISTRecord curlistRec = (AD_BAS_1010_SCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_BAS_1010_SCURLIST2Record curlist2Rec = (AD_BAS_1010_SCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDlco_no()%>
<%= ds.getDlco_nm()%>
<%= ds.getDlco_abrv_nm()%>
<%= ds.getErn()%>
<%= ds.getZip_1()%>
<%= ds.getZip_2()%>
<%= ds.getAddr()%>
<%= ds.getDtls_addr()%>
<%= ds.getPresi_nm()%>
<%= ds.getPresi_prn()%>
<%= ds.getPresi_zip_1()%>
<%= ds.getPresi_zip_2()%>
<%= ds.getPresi_addr()%>
<%= ds.getPresi_dtls_addr()%>
<%= ds.getBizcond()%>
<%= ds.getItem()%>
<%= ds.getGrp_cmpy_cd()%>
<%= ds.getEps_clsf_cd()%>
<%= ds.getCntr_yn()%>
<%= ds.getMang_clsf()%>
<%= ds.getOth_cmpy_dlco_yn()%>
<%= ds.getGovern_advt_yn()%>
<%= ds.getCntr_type()%>
<%= ds.getSlcrg_pers()%>
<%= ds.getMchrg_pers()%>
<%= ds.getSlcrg_pers_nm()%>
<%= ds.getMchrg_pers_nm()%>
<%= ds.getIndt_cd()%>
<%= ds.getType_cd()%>
<%= ds.getFndt_dt()%>
<%= ds.getDhon_dt()%>
<%= ds.getChg_dt_tm()%>
<%= ds.getChg_pers()%>
<%= ds.getCapt_amt()%>
<%= ds.getGnr_advcs_yn()%>
<%= ds.getArow_advcs_yn()%>
<%= ds.getAgn_yn()%>
<%= ds.getAdvt_bo_yn()%>
<%= ds.getBo_bof_yn()%>
<%= ds.getDel_yn()%>
<%= ds.getElec_tax_comp_cd()%>
<%= ds.getEmail_id()%>
<%= ds.getNmd_agn_yn()%>
<%= ds.getChk_cnt()%>
<%= ds.getPreng_yn()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.seq%>
<%= curlistRec.job_clsf%>
<%= curlistRec.advcs_feat%>
<%= curlistRec.chrg_pers%>
<%= curlistRec.tel_no%>
<%= curlist2Rec.seq%>
<%= curlist2Rec.dlco_info%>
<%= curlist2Rec.chrg_pers%>
<%= curlist2Rec.insrt_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 22 15:49:02 KST 2014 */