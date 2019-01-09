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


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_1045_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String insd_acct_cd;
	public String acct_cd;
	public String acct_subj_nm;
	public String slip_incmg_exne;
	public String drcr_occr_clsf;
	public String drcr_bal_clsf;
	public String tbs_exne;
	public String balsht_exne;
	public String pfls_stat_exne;
	public String setoff_yn;
	public String supr_acct_cd;
	public String vip_aset_debt_exne;
	public String acct_levl;
	public String use_yn;
	public String use_dt;
	public String wste_dt;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String acct_nm_styl;
	public String mang_item_cd;
	public String drcr_clsf;
	public String mand_reg_yn;
	public String bal_mang_clsf;
	public String prty_rank;
	public String acct_abrv_nm;
	public String mang_item_nm;
	public String prty_rank2;

	public FC_ACCT_1045_IDM(){}
	public FC_ACCT_1045_IDM(String mode, String cmpy_cd, String insd_acct_cd, String acct_cd, String acct_subj_nm, String slip_incmg_exne, String drcr_occr_clsf, String drcr_bal_clsf, String tbs_exne, String balsht_exne, String pfls_stat_exne, String setoff_yn, String supr_acct_cd, String vip_aset_debt_exne, String acct_levl, String use_yn, String use_dt, String wste_dt, String incmg_pers, String incmg_pers_ipadd, String acct_nm_styl, String mang_item_cd, String drcr_clsf, String mand_reg_yn, String bal_mang_clsf, String prty_rank, String acct_abrv_nm, String mang_item_nm, String prty_rank2){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.insd_acct_cd = insd_acct_cd;
		this.acct_cd = acct_cd;
		this.acct_subj_nm = acct_subj_nm;
		this.slip_incmg_exne = slip_incmg_exne;
		this.drcr_occr_clsf = drcr_occr_clsf;
		this.drcr_bal_clsf = drcr_bal_clsf;
		this.tbs_exne = tbs_exne;
		this.balsht_exne = balsht_exne;
		this.pfls_stat_exne = pfls_stat_exne;
		this.setoff_yn = setoff_yn;
		this.supr_acct_cd = supr_acct_cd;
		this.vip_aset_debt_exne = vip_aset_debt_exne;
		this.acct_levl = acct_levl;
		this.use_yn = use_yn;
		this.use_dt = use_dt;
		this.wste_dt = wste_dt;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.acct_nm_styl = acct_nm_styl;
		this.mang_item_cd = mang_item_cd;
		this.drcr_clsf = drcr_clsf;
		this.mand_reg_yn = mand_reg_yn;
		this.bal_mang_clsf = bal_mang_clsf;
		this.prty_rank = prty_rank;
		this.acct_abrv_nm = acct_abrv_nm;
		this.mang_item_nm = mang_item_nm;
		this.prty_rank2 = prty_rank2;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setInsd_acct_cd(String insd_acct_cd){
		this.insd_acct_cd = insd_acct_cd;
	}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setAcct_subj_nm(String acct_subj_nm){
		this.acct_subj_nm = acct_subj_nm;
	}

	public void setSlip_incmg_exne(String slip_incmg_exne){
		this.slip_incmg_exne = slip_incmg_exne;
	}

	public void setDrcr_occr_clsf(String drcr_occr_clsf){
		this.drcr_occr_clsf = drcr_occr_clsf;
	}

	public void setDrcr_bal_clsf(String drcr_bal_clsf){
		this.drcr_bal_clsf = drcr_bal_clsf;
	}

	public void setTbs_exne(String tbs_exne){
		this.tbs_exne = tbs_exne;
	}

	public void setBalsht_exne(String balsht_exne){
		this.balsht_exne = balsht_exne;
	}

	public void setPfls_stat_exne(String pfls_stat_exne){
		this.pfls_stat_exne = pfls_stat_exne;
	}

	public void setSetoff_yn(String setoff_yn){
		this.setoff_yn = setoff_yn;
	}

	public void setSupr_acct_cd(String supr_acct_cd){
		this.supr_acct_cd = supr_acct_cd;
	}

	public void setVip_aset_debt_exne(String vip_aset_debt_exne){
		this.vip_aset_debt_exne = vip_aset_debt_exne;
	}

	public void setAcct_levl(String acct_levl){
		this.acct_levl = acct_levl;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public void setUse_dt(String use_dt){
		this.use_dt = use_dt;
	}

	public void setWste_dt(String wste_dt){
		this.wste_dt = wste_dt;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setAcct_nm_styl(String acct_nm_styl){
		this.acct_nm_styl = acct_nm_styl;
	}

	public void setMang_item_cd(String mang_item_cd){
		this.mang_item_cd = mang_item_cd;
	}

	public void setDrcr_clsf(String drcr_clsf){
		this.drcr_clsf = drcr_clsf;
	}

	public void setMand_reg_yn(String mand_reg_yn){
		this.mand_reg_yn = mand_reg_yn;
	}

	public void setBal_mang_clsf(String bal_mang_clsf){
		this.bal_mang_clsf = bal_mang_clsf;
	}

	public void setPrty_rank(String prty_rank){
		this.prty_rank = prty_rank;
	}

	public void setAcct_abrv_nm(String acct_abrv_nm){
		this.acct_abrv_nm = acct_abrv_nm;
	}

	public void setMang_item_nm(String mang_item_nm){
		this.mang_item_nm = mang_item_nm;
	}

	public void setPrty_rank2(String prty_rank2){
		this.prty_rank2 = prty_rank2;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getInsd_acct_cd(){
		return this.insd_acct_cd;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getAcct_subj_nm(){
		return this.acct_subj_nm;
	}

	public String getSlip_incmg_exne(){
		return this.slip_incmg_exne;
	}

	public String getDrcr_occr_clsf(){
		return this.drcr_occr_clsf;
	}

	public String getDrcr_bal_clsf(){
		return this.drcr_bal_clsf;
	}

	public String getTbs_exne(){
		return this.tbs_exne;
	}

	public String getBalsht_exne(){
		return this.balsht_exne;
	}

	public String getPfls_stat_exne(){
		return this.pfls_stat_exne;
	}

	public String getSetoff_yn(){
		return this.setoff_yn;
	}

	public String getSupr_acct_cd(){
		return this.supr_acct_cd;
	}

	public String getVip_aset_debt_exne(){
		return this.vip_aset_debt_exne;
	}

	public String getAcct_levl(){
		return this.acct_levl;
	}

	public String getUse_yn(){
		return this.use_yn;
	}

	public String getUse_dt(){
		return this.use_dt;
	}

	public String getWste_dt(){
		return this.wste_dt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getAcct_nm_styl(){
		return this.acct_nm_styl;
	}

	public String getMang_item_cd(){
		return this.mang_item_cd;
	}

	public String getDrcr_clsf(){
		return this.drcr_clsf;
	}

	public String getMand_reg_yn(){
		return this.mand_reg_yn;
	}

	public String getBal_mang_clsf(){
		return this.bal_mang_clsf;
	}

	public String getPrty_rank(){
		return this.prty_rank;
	}

	public String getAcct_abrv_nm(){
		return this.acct_abrv_nm;
	}

	public String getMang_item_nm(){
		return this.mang_item_nm;
	}

	public String getPrty_rank2(){
		return this.prty_rank2;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_1045_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_1045_IDM dm = (FC_ACCT_1045_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.insd_acct_cd);
		cstmt.setString(6, dm.acct_cd);
		cstmt.setString(7, dm.acct_subj_nm);
		cstmt.setString(8, dm.slip_incmg_exne);
		cstmt.setString(9, dm.drcr_occr_clsf);
		cstmt.setString(10, dm.drcr_bal_clsf);
		cstmt.setString(11, dm.tbs_exne);
		cstmt.setString(12, dm.balsht_exne);
		cstmt.setString(13, dm.pfls_stat_exne);
		cstmt.setString(14, dm.setoff_yn);
		cstmt.setString(15, dm.supr_acct_cd);
		cstmt.setString(16, dm.vip_aset_debt_exne);
		cstmt.setString(17, dm.acct_levl);
		cstmt.setString(18, dm.use_yn);
		cstmt.setString(19, dm.use_dt);
		cstmt.setString(20, dm.wste_dt);
		cstmt.setString(21, dm.incmg_pers);
		cstmt.setString(22, dm.incmg_pers_ipadd);
		cstmt.setString(23, dm.acct_nm_styl);
		cstmt.setString(24, dm.mang_item_cd);
		cstmt.setString(25, dm.drcr_clsf);
		cstmt.setString(26, dm.mand_reg_yn);
		cstmt.setString(27, dm.bal_mang_clsf);
		cstmt.setString(28, dm.prty_rank);
		cstmt.setString(29, dm.acct_abrv_nm);
		cstmt.setString(30, dm.mang_item_nm);
		cstmt.setString(31, dm.prty_rank2);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_1045_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("insd_acct_cd = [" + getInsd_acct_cd() + "]");
		System.out.println("acct_cd = [" + getAcct_cd() + "]");
		System.out.println("acct_subj_nm = [" + getAcct_subj_nm() + "]");
		System.out.println("slip_incmg_exne = [" + getSlip_incmg_exne() + "]");
		System.out.println("drcr_occr_clsf = [" + getDrcr_occr_clsf() + "]");
		System.out.println("drcr_bal_clsf = [" + getDrcr_bal_clsf() + "]");
		System.out.println("tbs_exne = [" + getTbs_exne() + "]");
		System.out.println("balsht_exne = [" + getBalsht_exne() + "]");
		System.out.println("pfls_stat_exne = [" + getPfls_stat_exne() + "]");
		System.out.println("setoff_yn = [" + getSetoff_yn() + "]");
		System.out.println("supr_acct_cd = [" + getSupr_acct_cd() + "]");
		System.out.println("vip_aset_debt_exne = [" + getVip_aset_debt_exne() + "]");
		System.out.println("acct_levl = [" + getAcct_levl() + "]");
		System.out.println("use_yn = [" + getUse_yn() + "]");
		System.out.println("use_dt = [" + getUse_dt() + "]");
		System.out.println("wste_dt = [" + getWste_dt() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("acct_nm_styl = [" + getAcct_nm_styl() + "]");
		System.out.println("mang_item_cd = [" + getMang_item_cd() + "]");
		System.out.println("drcr_clsf = [" + getDrcr_clsf() + "]");
		System.out.println("mand_reg_yn = [" + getMand_reg_yn() + "]");
		System.out.println("bal_mang_clsf = [" + getBal_mang_clsf() + "]");
		System.out.println("prty_rank = [" + getPrty_rank() + "]");
		System.out.println("acct_abrv_nm = [" + getAcct_abrv_nm() + "]");
		System.out.println("mang_item_nm = [" + getMang_item_nm() + "]");
		System.out.println("prty_rank2 = [" + getPrty_rank2() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String insd_acct_cd = req.getParameter("insd_acct_cd");
if( insd_acct_cd == null){
	System.out.println(this.toString+" : insd_acct_cd is null" );
}else{
	System.out.println(this.toString+" : insd_acct_cd is "+insd_acct_cd );
}
String acct_cd = req.getParameter("acct_cd");
if( acct_cd == null){
	System.out.println(this.toString+" : acct_cd is null" );
}else{
	System.out.println(this.toString+" : acct_cd is "+acct_cd );
}
String acct_subj_nm = req.getParameter("acct_subj_nm");
if( acct_subj_nm == null){
	System.out.println(this.toString+" : acct_subj_nm is null" );
}else{
	System.out.println(this.toString+" : acct_subj_nm is "+acct_subj_nm );
}
String slip_incmg_exne = req.getParameter("slip_incmg_exne");
if( slip_incmg_exne == null){
	System.out.println(this.toString+" : slip_incmg_exne is null" );
}else{
	System.out.println(this.toString+" : slip_incmg_exne is "+slip_incmg_exne );
}
String drcr_occr_clsf = req.getParameter("drcr_occr_clsf");
if( drcr_occr_clsf == null){
	System.out.println(this.toString+" : drcr_occr_clsf is null" );
}else{
	System.out.println(this.toString+" : drcr_occr_clsf is "+drcr_occr_clsf );
}
String drcr_bal_clsf = req.getParameter("drcr_bal_clsf");
if( drcr_bal_clsf == null){
	System.out.println(this.toString+" : drcr_bal_clsf is null" );
}else{
	System.out.println(this.toString+" : drcr_bal_clsf is "+drcr_bal_clsf );
}
String tbs_exne = req.getParameter("tbs_exne");
if( tbs_exne == null){
	System.out.println(this.toString+" : tbs_exne is null" );
}else{
	System.out.println(this.toString+" : tbs_exne is "+tbs_exne );
}
String balsht_exne = req.getParameter("balsht_exne");
if( balsht_exne == null){
	System.out.println(this.toString+" : balsht_exne is null" );
}else{
	System.out.println(this.toString+" : balsht_exne is "+balsht_exne );
}
String pfls_stat_exne = req.getParameter("pfls_stat_exne");
if( pfls_stat_exne == null){
	System.out.println(this.toString+" : pfls_stat_exne is null" );
}else{
	System.out.println(this.toString+" : pfls_stat_exne is "+pfls_stat_exne );
}
String setoff_yn = req.getParameter("setoff_yn");
if( setoff_yn == null){
	System.out.println(this.toString+" : setoff_yn is null" );
}else{
	System.out.println(this.toString+" : setoff_yn is "+setoff_yn );
}
String supr_acct_cd = req.getParameter("supr_acct_cd");
if( supr_acct_cd == null){
	System.out.println(this.toString+" : supr_acct_cd is null" );
}else{
	System.out.println(this.toString+" : supr_acct_cd is "+supr_acct_cd );
}
String vip_aset_debt_exne = req.getParameter("vip_aset_debt_exne");
if( vip_aset_debt_exne == null){
	System.out.println(this.toString+" : vip_aset_debt_exne is null" );
}else{
	System.out.println(this.toString+" : vip_aset_debt_exne is "+vip_aset_debt_exne );
}
String acct_levl = req.getParameter("acct_levl");
if( acct_levl == null){
	System.out.println(this.toString+" : acct_levl is null" );
}else{
	System.out.println(this.toString+" : acct_levl is "+acct_levl );
}
String use_yn = req.getParameter("use_yn");
if( use_yn == null){
	System.out.println(this.toString+" : use_yn is null" );
}else{
	System.out.println(this.toString+" : use_yn is "+use_yn );
}
String use_dt = req.getParameter("use_dt");
if( use_dt == null){
	System.out.println(this.toString+" : use_dt is null" );
}else{
	System.out.println(this.toString+" : use_dt is "+use_dt );
}
String wste_dt = req.getParameter("wste_dt");
if( wste_dt == null){
	System.out.println(this.toString+" : wste_dt is null" );
}else{
	System.out.println(this.toString+" : wste_dt is "+wste_dt );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String acct_nm_styl = req.getParameter("acct_nm_styl");
if( acct_nm_styl == null){
	System.out.println(this.toString+" : acct_nm_styl is null" );
}else{
	System.out.println(this.toString+" : acct_nm_styl is "+acct_nm_styl );
}
String mang_item_cd = req.getParameter("mang_item_cd");
if( mang_item_cd == null){
	System.out.println(this.toString+" : mang_item_cd is null" );
}else{
	System.out.println(this.toString+" : mang_item_cd is "+mang_item_cd );
}
String drcr_clsf = req.getParameter("drcr_clsf");
if( drcr_clsf == null){
	System.out.println(this.toString+" : drcr_clsf is null" );
}else{
	System.out.println(this.toString+" : drcr_clsf is "+drcr_clsf );
}
String mand_reg_yn = req.getParameter("mand_reg_yn");
if( mand_reg_yn == null){
	System.out.println(this.toString+" : mand_reg_yn is null" );
}else{
	System.out.println(this.toString+" : mand_reg_yn is "+mand_reg_yn );
}
String bal_mang_clsf = req.getParameter("bal_mang_clsf");
if( bal_mang_clsf == null){
	System.out.println(this.toString+" : bal_mang_clsf is null" );
}else{
	System.out.println(this.toString+" : bal_mang_clsf is "+bal_mang_clsf );
}
String prty_rank = req.getParameter("prty_rank");
if( prty_rank == null){
	System.out.println(this.toString+" : prty_rank is null" );
}else{
	System.out.println(this.toString+" : prty_rank is "+prty_rank );
}
String acct_abrv_nm = req.getParameter("acct_abrv_nm");
if( acct_abrv_nm == null){
	System.out.println(this.toString+" : acct_abrv_nm is null" );
}else{
	System.out.println(this.toString+" : acct_abrv_nm is "+acct_abrv_nm );
}
String mang_item_nm = req.getParameter("mang_item_nm");
if( mang_item_nm == null){
	System.out.println(this.toString+" : mang_item_nm is null" );
}else{
	System.out.println(this.toString+" : mang_item_nm is "+mang_item_nm );
}
String prty_rank2 = req.getParameter("prty_rank2");
if( prty_rank2 == null){
	System.out.println(this.toString+" : prty_rank2 is null" );
}else{
	System.out.println(this.toString+" : prty_rank2 is "+prty_rank2 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String insd_acct_cd = Util.checkString(req.getParameter("insd_acct_cd"));
String acct_cd = Util.checkString(req.getParameter("acct_cd"));
String acct_subj_nm = Util.checkString(req.getParameter("acct_subj_nm"));
String slip_incmg_exne = Util.checkString(req.getParameter("slip_incmg_exne"));
String drcr_occr_clsf = Util.checkString(req.getParameter("drcr_occr_clsf"));
String drcr_bal_clsf = Util.checkString(req.getParameter("drcr_bal_clsf"));
String tbs_exne = Util.checkString(req.getParameter("tbs_exne"));
String balsht_exne = Util.checkString(req.getParameter("balsht_exne"));
String pfls_stat_exne = Util.checkString(req.getParameter("pfls_stat_exne"));
String setoff_yn = Util.checkString(req.getParameter("setoff_yn"));
String supr_acct_cd = Util.checkString(req.getParameter("supr_acct_cd"));
String vip_aset_debt_exne = Util.checkString(req.getParameter("vip_aset_debt_exne"));
String acct_levl = Util.checkString(req.getParameter("acct_levl"));
String use_yn = Util.checkString(req.getParameter("use_yn"));
String use_dt = Util.checkString(req.getParameter("use_dt"));
String wste_dt = Util.checkString(req.getParameter("wste_dt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String acct_nm_styl = Util.checkString(req.getParameter("acct_nm_styl"));
String mang_item_cd = Util.checkString(req.getParameter("mang_item_cd"));
String drcr_clsf = Util.checkString(req.getParameter("drcr_clsf"));
String mand_reg_yn = Util.checkString(req.getParameter("mand_reg_yn"));
String bal_mang_clsf = Util.checkString(req.getParameter("bal_mang_clsf"));
String prty_rank = Util.checkString(req.getParameter("prty_rank"));
String acct_abrv_nm = Util.checkString(req.getParameter("acct_abrv_nm"));
String mang_item_nm = Util.checkString(req.getParameter("mang_item_nm"));
String prty_rank2 = Util.checkString(req.getParameter("prty_rank2"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String insd_acct_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("insd_acct_cd")));
String acct_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd")));
String acct_subj_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_subj_nm")));
String slip_incmg_exne = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_incmg_exne")));
String drcr_occr_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("drcr_occr_clsf")));
String drcr_bal_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("drcr_bal_clsf")));
String tbs_exne = Util.Uni2Ksc(Util.checkString(req.getParameter("tbs_exne")));
String balsht_exne = Util.Uni2Ksc(Util.checkString(req.getParameter("balsht_exne")));
String pfls_stat_exne = Util.Uni2Ksc(Util.checkString(req.getParameter("pfls_stat_exne")));
String setoff_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("setoff_yn")));
String supr_acct_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("supr_acct_cd")));
String vip_aset_debt_exne = Util.Uni2Ksc(Util.checkString(req.getParameter("vip_aset_debt_exne")));
String acct_levl = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_levl")));
String use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("use_yn")));
String use_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dt")));
String wste_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("wste_dt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String acct_nm_styl = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_nm_styl")));
String mang_item_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_item_cd")));
String drcr_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("drcr_clsf")));
String mand_reg_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("mand_reg_yn")));
String bal_mang_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("bal_mang_clsf")));
String prty_rank = Util.Uni2Ksc(Util.checkString(req.getParameter("prty_rank")));
String acct_abrv_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_abrv_nm")));
String mang_item_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_item_nm")));
String prty_rank2 = Util.Uni2Ksc(Util.checkString(req.getParameter("prty_rank2")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setInsd_acct_cd(insd_acct_cd);
dm.setAcct_cd(acct_cd);
dm.setAcct_subj_nm(acct_subj_nm);
dm.setSlip_incmg_exne(slip_incmg_exne);
dm.setDrcr_occr_clsf(drcr_occr_clsf);
dm.setDrcr_bal_clsf(drcr_bal_clsf);
dm.setTbs_exne(tbs_exne);
dm.setBalsht_exne(balsht_exne);
dm.setPfls_stat_exne(pfls_stat_exne);
dm.setSetoff_yn(setoff_yn);
dm.setSupr_acct_cd(supr_acct_cd);
dm.setVip_aset_debt_exne(vip_aset_debt_exne);
dm.setAcct_levl(acct_levl);
dm.setUse_yn(use_yn);
dm.setUse_dt(use_dt);
dm.setWste_dt(wste_dt);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setAcct_nm_styl(acct_nm_styl);
dm.setMang_item_cd(mang_item_cd);
dm.setDrcr_clsf(drcr_clsf);
dm.setMand_reg_yn(mand_reg_yn);
dm.setBal_mang_clsf(bal_mang_clsf);
dm.setPrty_rank(prty_rank);
dm.setAcct_abrv_nm(acct_abrv_nm);
dm.setMang_item_nm(mang_item_nm);
dm.setPrty_rank2(prty_rank2);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 02 15:40:13 KST 2009 */