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

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.pub.dm.*;
import chosun.ciis.ad.pub.rec.*;

/**
 * 
 */


public class AD_PUB_1025_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String medi_cd;
	public String preng_occr_dt;
	public String preng_occr_seq;
	public String dlco_no;
	public String dlco_nm;
	public String sect_cd;
	public String sect_seq;
	public String cm;
	public String dn;
	public String chro_clsf_nm;
	public String uprc;
	public String advt_fee;
	public String vat;
	public String pubc_tot_amt;
	public String rtax_yn;
	public String tabl_yn;
	public String hndl_clsf;
	public String agn;
	public String agn_nm;
	public String fee_rate;
	public String fee;
	public String hndl_plac_cd;
	public String hndl_plac_nm;
	public String coms_rate;
	public String coms;
	public String advt_clas;
	public String indt_clsf;
	public String indt_clsf_nm;
	public String mony_kind;
	public String chro_clsf;
	public String type_clsf;
	public String type_clsf_nm;
	public String exrate;
	public String pubc_clsf;
	public String grp_cmpy_cd;
	public String frex_cntr_amt;
	public String edt_clsf;
	public String slcrg_pers;
	public String slcrg_pers_nm;
	public String dept_cd;
	public String dept_nm;
	public String mchrg_pers;
	public String mchrg_pers_nm;
	public String advt_cont;
	public String remk;
	public String preng_dt;
	public String pubc_side;
	public String nwsp_type_yn;
	public String nwsp_side_type;
	public String pre_issu_yn;
	public String ast_pers;
	public String ast_pers_nm;
	public String pubc_frdt;
	public String pubc_todt;
	public String fee_vat;
	public String coms_vat;
	public String pragn_yn;
	public String dtls_medi_cd;

	public AD_PUB_1025_SDataSet(){}
	public AD_PUB_1025_SDataSet(String errcode, String errmsg, String medi_cd, String preng_occr_dt, String preng_occr_seq, String dlco_no, String dlco_nm, String sect_cd, String sect_seq, String cm, String dn, String chro_clsf_nm, String uprc, String advt_fee, String vat, String pubc_tot_amt, String rtax_yn, String tabl_yn, String hndl_clsf, String agn, String agn_nm, String fee_rate, String fee, String hndl_plac_cd, String hndl_plac_nm, String coms_rate, String coms, String advt_clas, String indt_clsf, String indt_clsf_nm, String mony_kind, String chro_clsf, String type_clsf, String type_clsf_nm, String exrate, String pubc_clsf, String grp_cmpy_cd, String frex_cntr_amt, String edt_clsf, String slcrg_pers, String slcrg_pers_nm, String dept_cd, String dept_nm, String mchrg_pers, String mchrg_pers_nm, String advt_cont, String remk, String preng_dt, String pubc_side, String nwsp_type_yn, String nwsp_side_type, String pre_issu_yn, String ast_pers, String ast_pers_nm, String pubc_frdt, String pubc_todt, String fee_vat, String coms_vat, String pragn_yn, String dtls_medi_cd){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.medi_cd = medi_cd;
		this.preng_occr_dt = preng_occr_dt;
		this.preng_occr_seq = preng_occr_seq;
		this.dlco_no = dlco_no;
		this.dlco_nm = dlco_nm;
		this.sect_cd = sect_cd;
		this.sect_seq = sect_seq;
		this.cm = cm;
		this.dn = dn;
		this.chro_clsf_nm = chro_clsf_nm;
		this.uprc = uprc;
		this.advt_fee = advt_fee;
		this.vat = vat;
		this.pubc_tot_amt = pubc_tot_amt;
		this.rtax_yn = rtax_yn;
		this.tabl_yn = tabl_yn;
		this.hndl_clsf = hndl_clsf;
		this.agn = agn;
		this.agn_nm = agn_nm;
		this.fee_rate = fee_rate;
		this.fee = fee;
		this.hndl_plac_cd = hndl_plac_cd;
		this.hndl_plac_nm = hndl_plac_nm;
		this.coms_rate = coms_rate;
		this.coms = coms;
		this.advt_clas = advt_clas;
		this.indt_clsf = indt_clsf;
		this.indt_clsf_nm = indt_clsf_nm;
		this.mony_kind = mony_kind;
		this.chro_clsf = chro_clsf;
		this.type_clsf = type_clsf;
		this.type_clsf_nm = type_clsf_nm;
		this.exrate = exrate;
		this.pubc_clsf = pubc_clsf;
		this.grp_cmpy_cd = grp_cmpy_cd;
		this.frex_cntr_amt = frex_cntr_amt;
		this.edt_clsf = edt_clsf;
		this.slcrg_pers = slcrg_pers;
		this.slcrg_pers_nm = slcrg_pers_nm;
		this.dept_cd = dept_cd;
		this.dept_nm = dept_nm;
		this.mchrg_pers = mchrg_pers;
		this.mchrg_pers_nm = mchrg_pers_nm;
		this.advt_cont = advt_cont;
		this.remk = remk;
		this.preng_dt = preng_dt;
		this.pubc_side = pubc_side;
		this.nwsp_type_yn = nwsp_type_yn;
		this.nwsp_side_type = nwsp_side_type;
		this.pre_issu_yn = pre_issu_yn;
		this.ast_pers = ast_pers;
		this.ast_pers_nm = ast_pers_nm;
		this.pubc_frdt = pubc_frdt;
		this.pubc_todt = pubc_todt;
		this.fee_vat = fee_vat;
		this.coms_vat = coms_vat;
		this.pragn_yn = pragn_yn;
		this.dtls_medi_cd = dtls_medi_cd;
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

	public void setPreng_occr_dt(String preng_occr_dt){
		this.preng_occr_dt = preng_occr_dt;
	}

	public void setPreng_occr_seq(String preng_occr_seq){
		this.preng_occr_seq = preng_occr_seq;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setSect_seq(String sect_seq){
		this.sect_seq = sect_seq;
	}

	public void setCm(String cm){
		this.cm = cm;
	}

	public void setDn(String dn){
		this.dn = dn;
	}

	public void setChro_clsf_nm(String chro_clsf_nm){
		this.chro_clsf_nm = chro_clsf_nm;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
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

	public void setRtax_yn(String rtax_yn){
		this.rtax_yn = rtax_yn;
	}

	public void setTabl_yn(String tabl_yn){
		this.tabl_yn = tabl_yn;
	}

	public void setHndl_clsf(String hndl_clsf){
		this.hndl_clsf = hndl_clsf;
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

	public void setAdvt_clas(String advt_clas){
		this.advt_clas = advt_clas;
	}

	public void setIndt_clsf(String indt_clsf){
		this.indt_clsf = indt_clsf;
	}

	public void setIndt_clsf_nm(String indt_clsf_nm){
		this.indt_clsf_nm = indt_clsf_nm;
	}

	public void setMony_kind(String mony_kind){
		this.mony_kind = mony_kind;
	}

	public void setChro_clsf(String chro_clsf){
		this.chro_clsf = chro_clsf;
	}

	public void setType_clsf(String type_clsf){
		this.type_clsf = type_clsf;
	}

	public void setType_clsf_nm(String type_clsf_nm){
		this.type_clsf_nm = type_clsf_nm;
	}

	public void setExrate(String exrate){
		this.exrate = exrate;
	}

	public void setPubc_clsf(String pubc_clsf){
		this.pubc_clsf = pubc_clsf;
	}

	public void setGrp_cmpy_cd(String grp_cmpy_cd){
		this.grp_cmpy_cd = grp_cmpy_cd;
	}

	public void setFrex_cntr_amt(String frex_cntr_amt){
		this.frex_cntr_amt = frex_cntr_amt;
	}

	public void setEdt_clsf(String edt_clsf){
		this.edt_clsf = edt_clsf;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public void setSlcrg_pers_nm(String slcrg_pers_nm){
		this.slcrg_pers_nm = slcrg_pers_nm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
	}

	public void setMchrg_pers_nm(String mchrg_pers_nm){
		this.mchrg_pers_nm = mchrg_pers_nm;
	}

	public void setAdvt_cont(String advt_cont){
		this.advt_cont = advt_cont;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setPreng_dt(String preng_dt){
		this.preng_dt = preng_dt;
	}

	public void setPubc_side(String pubc_side){
		this.pubc_side = pubc_side;
	}

	public void setNwsp_type_yn(String nwsp_type_yn){
		this.nwsp_type_yn = nwsp_type_yn;
	}

	public void setNwsp_side_type(String nwsp_side_type){
		this.nwsp_side_type = nwsp_side_type;
	}

	public void setPre_issu_yn(String pre_issu_yn){
		this.pre_issu_yn = pre_issu_yn;
	}

	public void setAst_pers(String ast_pers){
		this.ast_pers = ast_pers;
	}

	public void setAst_pers_nm(String ast_pers_nm){
		this.ast_pers_nm = ast_pers_nm;
	}

	public void setPubc_frdt(String pubc_frdt){
		this.pubc_frdt = pubc_frdt;
	}

	public void setPubc_todt(String pubc_todt){
		this.pubc_todt = pubc_todt;
	}

	public void setFee_vat(String fee_vat){
		this.fee_vat = fee_vat;
	}

	public void setComs_vat(String coms_vat){
		this.coms_vat = coms_vat;
	}

	public void setPragn_yn(String pragn_yn){
		this.pragn_yn = pragn_yn;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
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

	public String getPreng_occr_dt(){
		return this.preng_occr_dt;
	}

	public String getPreng_occr_seq(){
		return this.preng_occr_seq;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getSect_seq(){
		return this.sect_seq;
	}

	public String getCm(){
		return this.cm;
	}

	public String getDn(){
		return this.dn;
	}

	public String getChro_clsf_nm(){
		return this.chro_clsf_nm;
	}

	public String getUprc(){
		return this.uprc;
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

	public String getRtax_yn(){
		return this.rtax_yn;
	}

	public String getTabl_yn(){
		return this.tabl_yn;
	}

	public String getHndl_clsf(){
		return this.hndl_clsf;
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

	public String getAdvt_clas(){
		return this.advt_clas;
	}

	public String getIndt_clsf(){
		return this.indt_clsf;
	}

	public String getIndt_clsf_nm(){
		return this.indt_clsf_nm;
	}

	public String getMony_kind(){
		return this.mony_kind;
	}

	public String getChro_clsf(){
		return this.chro_clsf;
	}

	public String getType_clsf(){
		return this.type_clsf;
	}

	public String getType_clsf_nm(){
		return this.type_clsf_nm;
	}

	public String getExrate(){
		return this.exrate;
	}

	public String getPubc_clsf(){
		return this.pubc_clsf;
	}

	public String getGrp_cmpy_cd(){
		return this.grp_cmpy_cd;
	}

	public String getFrex_cntr_amt(){
		return this.frex_cntr_amt;
	}

	public String getEdt_clsf(){
		return this.edt_clsf;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getSlcrg_pers_nm(){
		return this.slcrg_pers_nm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
	}

	public String getMchrg_pers_nm(){
		return this.mchrg_pers_nm;
	}

	public String getAdvt_cont(){
		return this.advt_cont;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getPreng_dt(){
		return this.preng_dt;
	}

	public String getPubc_side(){
		return this.pubc_side;
	}

	public String getNwsp_type_yn(){
		return this.nwsp_type_yn;
	}

	public String getNwsp_side_type(){
		return this.nwsp_side_type;
	}

	public String getPre_issu_yn(){
		return this.pre_issu_yn;
	}

	public String getAst_pers(){
		return this.ast_pers;
	}

	public String getAst_pers_nm(){
		return this.ast_pers_nm;
	}

	public String getPubc_frdt(){
		return this.pubc_frdt;
	}

	public String getPubc_todt(){
		return this.pubc_todt;
	}

	public String getFee_vat(){
		return this.fee_vat;
	}

	public String getComs_vat(){
		return this.coms_vat;
	}

	public String getPragn_yn(){
		return this.pragn_yn;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.medi_cd = Util.checkString(cstmt.getString(4));
		this.preng_occr_dt = Util.checkString(cstmt.getString(5));
		this.preng_occr_seq = Util.checkString(cstmt.getString(6));
		this.dlco_no = Util.checkString(cstmt.getString(7));
		this.dlco_nm = Util.checkString(cstmt.getString(8));
		this.sect_cd = Util.checkString(cstmt.getString(9));
		this.sect_seq = Util.checkString(cstmt.getString(10));
		this.cm = Util.checkString(cstmt.getString(11));
		this.dn = Util.checkString(cstmt.getString(12));
		this.chro_clsf_nm = Util.checkString(cstmt.getString(13));
		this.uprc = Util.checkString(cstmt.getString(14));
		this.advt_fee = Util.checkString(cstmt.getString(15));
		this.vat = Util.checkString(cstmt.getString(16));
		this.pubc_tot_amt = Util.checkString(cstmt.getString(17));
		this.rtax_yn = Util.checkString(cstmt.getString(18));
		this.tabl_yn = Util.checkString(cstmt.getString(19));
		this.hndl_clsf = Util.checkString(cstmt.getString(20));
		this.agn = Util.checkString(cstmt.getString(21));
		this.agn_nm = Util.checkString(cstmt.getString(22));
		this.fee_rate = Util.checkString(cstmt.getString(23));
		this.fee = Util.checkString(cstmt.getString(24));
		this.hndl_plac_cd = Util.checkString(cstmt.getString(25));
		this.hndl_plac_nm = Util.checkString(cstmt.getString(26));
		this.coms_rate = Util.checkString(cstmt.getString(27));
		this.coms = Util.checkString(cstmt.getString(28));
		this.advt_clas = Util.checkString(cstmt.getString(29));
		this.indt_clsf = Util.checkString(cstmt.getString(30));
		this.indt_clsf_nm = Util.checkString(cstmt.getString(31));
		this.mony_kind = Util.checkString(cstmt.getString(32));
		this.chro_clsf = Util.checkString(cstmt.getString(33));
		this.type_clsf = Util.checkString(cstmt.getString(34));
		this.type_clsf_nm = Util.checkString(cstmt.getString(35));
		this.exrate = Util.checkString(cstmt.getString(36));
		this.pubc_clsf = Util.checkString(cstmt.getString(37));
		this.grp_cmpy_cd = Util.checkString(cstmt.getString(38));
		this.frex_cntr_amt = Util.checkString(cstmt.getString(39));
		this.edt_clsf = Util.checkString(cstmt.getString(40));
		this.slcrg_pers = Util.checkString(cstmt.getString(41));
		this.slcrg_pers_nm = Util.checkString(cstmt.getString(42));
		this.dept_cd = Util.checkString(cstmt.getString(43));
		this.dept_nm = Util.checkString(cstmt.getString(44));
		this.mchrg_pers = Util.checkString(cstmt.getString(45));
		this.mchrg_pers_nm = Util.checkString(cstmt.getString(46));
		this.advt_cont = Util.checkString(cstmt.getString(47));
		this.remk = Util.checkString(cstmt.getString(48));
		this.preng_dt = Util.checkString(cstmt.getString(49));
		this.pubc_side = Util.checkString(cstmt.getString(50));
		this.nwsp_type_yn = Util.checkString(cstmt.getString(51));
		this.nwsp_side_type = Util.checkString(cstmt.getString(52));
		this.pre_issu_yn = Util.checkString(cstmt.getString(53));
		this.ast_pers = Util.checkString(cstmt.getString(54));
		this.ast_pers_nm = Util.checkString(cstmt.getString(55));
		this.pubc_frdt = Util.checkString(cstmt.getString(56));
		this.pubc_todt = Util.checkString(cstmt.getString(57));
		this.fee_vat = Util.checkString(cstmt.getString(58));
		this.coms_vat = Util.checkString(cstmt.getString(59));
		this.pragn_yn = Util.checkString(cstmt.getString(60));
		this.dtls_medi_cd = Util.checkString(cstmt.getString(61));
		ResultSet rset0 = (ResultSet) cstmt.getObject(62);
		while(rset0.next()){
			AD_PUB_1025_SCURLISTRecord rec = new AD_PUB_1025_SCURLISTRecord();
			rec.bus_seq = Util.checkString(rset0.getString("bus_seq"));
			rec.bus_plc = Util.checkString(rset0.getString("bus_plc"));
			rec.bus_clsf = Util.checkString(rset0.getString("bus_clsf"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(63);
		while(rset1.next()){
			AD_PUB_1025_SCURLIST2Record rec = new AD_PUB_1025_SCURLIST2Record();
			rec.seq = Util.checkString(rset1.getString("seq"));
			rec.evnt_nm = Util.checkString(rset1.getString("evnt_nm"));
			rec.amt = Util.checkString(rset1.getString("amt"));
			rec.vat = Util.checkString(rset1.getString("vat"));
			rec.tot_amt = Util.checkString(rset1.getString("tot_amt"));
			rec.fee = Util.checkString(rset1.getString("fee"));
			rec.fee_vat = Util.checkString(rset1.getString("fee_vat"));
			rec.tot_fee = Util.checkString(rset1.getString("tot_fee"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_PUB_1025_SDataSet ds = (AD_PUB_1025_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_PUB_1025_SCURLISTRecord curlistRec = (AD_PUB_1025_SCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_PUB_1025_SCURLIST2Record curlist2Rec = (AD_PUB_1025_SCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedi_cd()%>
<%= ds.getPreng_occr_dt()%>
<%= ds.getPreng_occr_seq()%>
<%= ds.getDlco_no()%>
<%= ds.getDlco_nm()%>
<%= ds.getSect_cd()%>
<%= ds.getSect_seq()%>
<%= ds.getCm()%>
<%= ds.getDn()%>
<%= ds.getChro_clsf_nm()%>
<%= ds.getUprc()%>
<%= ds.getAdvt_fee()%>
<%= ds.getVat()%>
<%= ds.getPubc_tot_amt()%>
<%= ds.getRtax_yn()%>
<%= ds.getTabl_yn()%>
<%= ds.getHndl_clsf()%>
<%= ds.getAgn()%>
<%= ds.getAgn_nm()%>
<%= ds.getFee_rate()%>
<%= ds.getFee()%>
<%= ds.getHndl_plac_cd()%>
<%= ds.getHndl_plac_nm()%>
<%= ds.getComs_rate()%>
<%= ds.getComs()%>
<%= ds.getAdvt_clas()%>
<%= ds.getIndt_clsf()%>
<%= ds.getIndt_clsf_nm()%>
<%= ds.getMony_kind()%>
<%= ds.getChro_clsf()%>
<%= ds.getType_clsf()%>
<%= ds.getType_clsf_nm()%>
<%= ds.getExrate()%>
<%= ds.getPubc_clsf()%>
<%= ds.getGrp_cmpy_cd()%>
<%= ds.getFrex_cntr_amt()%>
<%= ds.getEdt_clsf()%>
<%= ds.getSlcrg_pers()%>
<%= ds.getSlcrg_pers_nm()%>
<%= ds.getDept_cd()%>
<%= ds.getDept_nm()%>
<%= ds.getMchrg_pers()%>
<%= ds.getMchrg_pers_nm()%>
<%= ds.getAdvt_cont()%>
<%= ds.getRemk()%>
<%= ds.getPreng_dt()%>
<%= ds.getPubc_side()%>
<%= ds.getNwsp_type_yn()%>
<%= ds.getNwsp_side_type()%>
<%= ds.getPre_issu_yn()%>
<%= ds.getAst_pers()%>
<%= ds.getAst_pers_nm()%>
<%= ds.getPubc_frdt()%>
<%= ds.getPubc_todt()%>
<%= ds.getFee_vat()%>
<%= ds.getComs_vat()%>
<%= ds.getPragn_yn()%>
<%= ds.getDtls_medi_cd()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.bus_seq%>
<%= curlistRec.bus_plc%>
<%= curlistRec.bus_clsf%>
<%= curlist2Rec.seq%>
<%= curlist2Rec.evnt_nm%>
<%= curlist2Rec.amt%>
<%= curlist2Rec.vat%>
<%= curlist2Rec.tot_amt%>
<%= curlist2Rec.fee%>
<%= curlist2Rec.fee_vat%>
<%= curlist2Rec.tot_fee%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 21 16:18:55 KST 2017 */