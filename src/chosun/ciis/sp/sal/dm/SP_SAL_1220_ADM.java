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


package chosun.ciis.sp.sal.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sal.ds.*;
import chosun.ciis.sp.sal.rec.*;

/**
 * 
 */


public class SP_SAL_1220_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String sale_yymm;
	public String rcpm_clsf;
	public String mang_no;
	public String entr_fee;
	public String phon_hdqt_fee;
	public String rent;
	public String hzone_use_fee;
	public String ictry_tel_fee;
	public String p00755tel_fee;
	public String intl_tel_fee;
	public String movm_tel_fee;
	public String onnet_curc_fee;
	public String p070curc_fee;
	public String in_pre_curc_fee;
	public String appm_curc_fee;
	public String img_curc_fee;
	public String sms_use_fee;
	public String supl_use_fee;
	public String sound_src_make_fee;
	public String frft;
	public String entr_fee_dscn;
	public String base_fee_dscn;
	public String rent_dscn;
	public String ictry_tel_dscn;
	public String hzone_dscn;
	public String movm_tel_dscn;
	public String intl_tel_dscn;
	public String p00755dscn;
	public String p070curc_dscn;
	public String in_pre_curc_dscn;
	public String appm_curc_dscn;
	public String cntr_prd_dscn;
	public String midl_plac_cmpy_dscn;
	public String onnet_dscn;
	public String etc_dscn;
	public String auto_shift_dscn;
	public String use_fee_tot;
	public String use_pers;
	public String use_prd;
	public String chg_matt;
	public String incmg_pers;
	public String incmg_pers_ip;

	public SP_SAL_1220_ADM(){}
	public SP_SAL_1220_ADM(String cmpy_cd, String sale_yymm, String rcpm_clsf, String mang_no, String entr_fee, String phon_hdqt_fee, String rent, String hzone_use_fee, String ictry_tel_fee, String p00755tel_fee, String intl_tel_fee, String movm_tel_fee, String onnet_curc_fee, String p070curc_fee, String in_pre_curc_fee, String appm_curc_fee, String img_curc_fee, String sms_use_fee, String supl_use_fee, String sound_src_make_fee, String frft, String entr_fee_dscn, String base_fee_dscn, String rent_dscn, String ictry_tel_dscn, String hzone_dscn, String movm_tel_dscn, String intl_tel_dscn, String p00755dscn, String p070curc_dscn, String in_pre_curc_dscn, String appm_curc_dscn, String cntr_prd_dscn, String midl_plac_cmpy_dscn, String onnet_dscn, String etc_dscn, String auto_shift_dscn, String use_fee_tot, String use_pers, String use_prd, String chg_matt, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.sale_yymm = sale_yymm;
		this.rcpm_clsf = rcpm_clsf;
		this.mang_no = mang_no;
		this.entr_fee = entr_fee;
		this.phon_hdqt_fee = phon_hdqt_fee;
		this.rent = rent;
		this.hzone_use_fee = hzone_use_fee;
		this.ictry_tel_fee = ictry_tel_fee;
		this.p00755tel_fee = p00755tel_fee;
		this.intl_tel_fee = intl_tel_fee;
		this.movm_tel_fee = movm_tel_fee;
		this.onnet_curc_fee = onnet_curc_fee;
		this.p070curc_fee = p070curc_fee;
		this.in_pre_curc_fee = in_pre_curc_fee;
		this.appm_curc_fee = appm_curc_fee;
		this.img_curc_fee = img_curc_fee;
		this.sms_use_fee = sms_use_fee;
		this.supl_use_fee = supl_use_fee;
		this.sound_src_make_fee = sound_src_make_fee;
		this.frft = frft;
		this.entr_fee_dscn = entr_fee_dscn;
		this.base_fee_dscn = base_fee_dscn;
		this.rent_dscn = rent_dscn;
		this.ictry_tel_dscn = ictry_tel_dscn;
		this.hzone_dscn = hzone_dscn;
		this.movm_tel_dscn = movm_tel_dscn;
		this.intl_tel_dscn = intl_tel_dscn;
		this.p00755dscn = p00755dscn;
		this.p070curc_dscn = p070curc_dscn;
		this.in_pre_curc_dscn = in_pre_curc_dscn;
		this.appm_curc_dscn = appm_curc_dscn;
		this.cntr_prd_dscn = cntr_prd_dscn;
		this.midl_plac_cmpy_dscn = midl_plac_cmpy_dscn;
		this.onnet_dscn = onnet_dscn;
		this.etc_dscn = etc_dscn;
		this.auto_shift_dscn = auto_shift_dscn;
		this.use_fee_tot = use_fee_tot;
		this.use_pers = use_pers;
		this.use_prd = use_prd;
		this.chg_matt = chg_matt;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSale_yymm(String sale_yymm){
		this.sale_yymm = sale_yymm;
	}

	public void setRcpm_clsf(String rcpm_clsf){
		this.rcpm_clsf = rcpm_clsf;
	}

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
	}

	public void setEntr_fee(String entr_fee){
		this.entr_fee = entr_fee;
	}

	public void setPhon_hdqt_fee(String phon_hdqt_fee){
		this.phon_hdqt_fee = phon_hdqt_fee;
	}

	public void setRent(String rent){
		this.rent = rent;
	}

	public void setHzone_use_fee(String hzone_use_fee){
		this.hzone_use_fee = hzone_use_fee;
	}

	public void setIctry_tel_fee(String ictry_tel_fee){
		this.ictry_tel_fee = ictry_tel_fee;
	}

	public void setP00755tel_fee(String p00755tel_fee){
		this.p00755tel_fee = p00755tel_fee;
	}

	public void setIntl_tel_fee(String intl_tel_fee){
		this.intl_tel_fee = intl_tel_fee;
	}

	public void setMovm_tel_fee(String movm_tel_fee){
		this.movm_tel_fee = movm_tel_fee;
	}

	public void setOnnet_curc_fee(String onnet_curc_fee){
		this.onnet_curc_fee = onnet_curc_fee;
	}

	public void setP070curc_fee(String p070curc_fee){
		this.p070curc_fee = p070curc_fee;
	}

	public void setIn_pre_curc_fee(String in_pre_curc_fee){
		this.in_pre_curc_fee = in_pre_curc_fee;
	}

	public void setAppm_curc_fee(String appm_curc_fee){
		this.appm_curc_fee = appm_curc_fee;
	}

	public void setImg_curc_fee(String img_curc_fee){
		this.img_curc_fee = img_curc_fee;
	}

	public void setSms_use_fee(String sms_use_fee){
		this.sms_use_fee = sms_use_fee;
	}

	public void setSupl_use_fee(String supl_use_fee){
		this.supl_use_fee = supl_use_fee;
	}

	public void setSound_src_make_fee(String sound_src_make_fee){
		this.sound_src_make_fee = sound_src_make_fee;
	}

	public void setFrft(String frft){
		this.frft = frft;
	}

	public void setEntr_fee_dscn(String entr_fee_dscn){
		this.entr_fee_dscn = entr_fee_dscn;
	}

	public void setBase_fee_dscn(String base_fee_dscn){
		this.base_fee_dscn = base_fee_dscn;
	}

	public void setRent_dscn(String rent_dscn){
		this.rent_dscn = rent_dscn;
	}

	public void setIctry_tel_dscn(String ictry_tel_dscn){
		this.ictry_tel_dscn = ictry_tel_dscn;
	}

	public void setHzone_dscn(String hzone_dscn){
		this.hzone_dscn = hzone_dscn;
	}

	public void setMovm_tel_dscn(String movm_tel_dscn){
		this.movm_tel_dscn = movm_tel_dscn;
	}

	public void setIntl_tel_dscn(String intl_tel_dscn){
		this.intl_tel_dscn = intl_tel_dscn;
	}

	public void setP00755dscn(String p00755dscn){
		this.p00755dscn = p00755dscn;
	}

	public void setP070curc_dscn(String p070curc_dscn){
		this.p070curc_dscn = p070curc_dscn;
	}

	public void setIn_pre_curc_dscn(String in_pre_curc_dscn){
		this.in_pre_curc_dscn = in_pre_curc_dscn;
	}

	public void setAppm_curc_dscn(String appm_curc_dscn){
		this.appm_curc_dscn = appm_curc_dscn;
	}

	public void setCntr_prd_dscn(String cntr_prd_dscn){
		this.cntr_prd_dscn = cntr_prd_dscn;
	}

	public void setMidl_plac_cmpy_dscn(String midl_plac_cmpy_dscn){
		this.midl_plac_cmpy_dscn = midl_plac_cmpy_dscn;
	}

	public void setOnnet_dscn(String onnet_dscn){
		this.onnet_dscn = onnet_dscn;
	}

	public void setEtc_dscn(String etc_dscn){
		this.etc_dscn = etc_dscn;
	}

	public void setAuto_shift_dscn(String auto_shift_dscn){
		this.auto_shift_dscn = auto_shift_dscn;
	}

	public void setUse_fee_tot(String use_fee_tot){
		this.use_fee_tot = use_fee_tot;
	}

	public void setUse_pers(String use_pers){
		this.use_pers = use_pers;
	}

	public void setUse_prd(String use_prd){
		this.use_prd = use_prd;
	}

	public void setChg_matt(String chg_matt){
		this.chg_matt = chg_matt;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSale_yymm(){
		return this.sale_yymm;
	}

	public String getRcpm_clsf(){
		return this.rcpm_clsf;
	}

	public String getMang_no(){
		return this.mang_no;
	}

	public String getEntr_fee(){
		return this.entr_fee;
	}

	public String getPhon_hdqt_fee(){
		return this.phon_hdqt_fee;
	}

	public String getRent(){
		return this.rent;
	}

	public String getHzone_use_fee(){
		return this.hzone_use_fee;
	}

	public String getIctry_tel_fee(){
		return this.ictry_tel_fee;
	}

	public String getP00755tel_fee(){
		return this.p00755tel_fee;
	}

	public String getIntl_tel_fee(){
		return this.intl_tel_fee;
	}

	public String getMovm_tel_fee(){
		return this.movm_tel_fee;
	}

	public String getOnnet_curc_fee(){
		return this.onnet_curc_fee;
	}

	public String getP070curc_fee(){
		return this.p070curc_fee;
	}

	public String getIn_pre_curc_fee(){
		return this.in_pre_curc_fee;
	}

	public String getAppm_curc_fee(){
		return this.appm_curc_fee;
	}

	public String getImg_curc_fee(){
		return this.img_curc_fee;
	}

	public String getSms_use_fee(){
		return this.sms_use_fee;
	}

	public String getSupl_use_fee(){
		return this.supl_use_fee;
	}

	public String getSound_src_make_fee(){
		return this.sound_src_make_fee;
	}

	public String getFrft(){
		return this.frft;
	}

	public String getEntr_fee_dscn(){
		return this.entr_fee_dscn;
	}

	public String getBase_fee_dscn(){
		return this.base_fee_dscn;
	}

	public String getRent_dscn(){
		return this.rent_dscn;
	}

	public String getIctry_tel_dscn(){
		return this.ictry_tel_dscn;
	}

	public String getHzone_dscn(){
		return this.hzone_dscn;
	}

	public String getMovm_tel_dscn(){
		return this.movm_tel_dscn;
	}

	public String getIntl_tel_dscn(){
		return this.intl_tel_dscn;
	}

	public String getP00755dscn(){
		return this.p00755dscn;
	}

	public String getP070curc_dscn(){
		return this.p070curc_dscn;
	}

	public String getIn_pre_curc_dscn(){
		return this.in_pre_curc_dscn;
	}

	public String getAppm_curc_dscn(){
		return this.appm_curc_dscn;
	}

	public String getCntr_prd_dscn(){
		return this.cntr_prd_dscn;
	}

	public String getMidl_plac_cmpy_dscn(){
		return this.midl_plac_cmpy_dscn;
	}

	public String getOnnet_dscn(){
		return this.onnet_dscn;
	}

	public String getEtc_dscn(){
		return this.etc_dscn;
	}

	public String getAuto_shift_dscn(){
		return this.auto_shift_dscn;
	}

	public String getUse_fee_tot(){
		return this.use_fee_tot;
	}

	public String getUse_pers(){
		return this.use_pers;
	}

	public String getUse_prd(){
		return this.use_prd;
	}

	public String getChg_matt(){
		return this.chg_matt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_SP_SAL_1220_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SP_SAL_1220_ADM dm = (SP_SAL_1220_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.sale_yymm);
		cstmt.setString(5, dm.rcpm_clsf);
		cstmt.setString(6, dm.mang_no);
		cstmt.setString(7, dm.entr_fee);
		cstmt.setString(8, dm.phon_hdqt_fee);
		cstmt.setString(9, dm.rent);
		cstmt.setString(10, dm.hzone_use_fee);
		cstmt.setString(11, dm.ictry_tel_fee);
		cstmt.setString(12, dm.p00755tel_fee);
		cstmt.setString(13, dm.intl_tel_fee);
		cstmt.setString(14, dm.movm_tel_fee);
		cstmt.setString(15, dm.onnet_curc_fee);
		cstmt.setString(16, dm.p070curc_fee);
		cstmt.setString(17, dm.in_pre_curc_fee);
		cstmt.setString(18, dm.appm_curc_fee);
		cstmt.setString(19, dm.img_curc_fee);
		cstmt.setString(20, dm.sms_use_fee);
		cstmt.setString(21, dm.supl_use_fee);
		cstmt.setString(22, dm.sound_src_make_fee);
		cstmt.setString(23, dm.frft);
		cstmt.setString(24, dm.entr_fee_dscn);
		cstmt.setString(25, dm.base_fee_dscn);
		cstmt.setString(26, dm.rent_dscn);
		cstmt.setString(27, dm.ictry_tel_dscn);
		cstmt.setString(28, dm.hzone_dscn);
		cstmt.setString(29, dm.movm_tel_dscn);
		cstmt.setString(30, dm.intl_tel_dscn);
		cstmt.setString(31, dm.p00755dscn);
		cstmt.setString(32, dm.p070curc_dscn);
		cstmt.setString(33, dm.in_pre_curc_dscn);
		cstmt.setString(34, dm.appm_curc_dscn);
		cstmt.setString(35, dm.cntr_prd_dscn);
		cstmt.setString(36, dm.midl_plac_cmpy_dscn);
		cstmt.setString(37, dm.onnet_dscn);
		cstmt.setString(38, dm.etc_dscn);
		cstmt.setString(39, dm.auto_shift_dscn);
		cstmt.setString(40, dm.use_fee_tot);
		cstmt.setString(41, dm.use_pers);
		cstmt.setString(42, dm.use_prd);
		cstmt.setString(43, dm.chg_matt);
		cstmt.setString(44, dm.incmg_pers);
		cstmt.setString(45, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.sp.sal.ds.SP_SAL_1220_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("sale_yymm = [" + getSale_yymm() + "]");
		System.out.println("rcpm_clsf = [" + getRcpm_clsf() + "]");
		System.out.println("mang_no = [" + getMang_no() + "]");
		System.out.println("entr_fee = [" + getEntr_fee() + "]");
		System.out.println("phon_hdqt_fee = [" + getPhon_hdqt_fee() + "]");
		System.out.println("rent = [" + getRent() + "]");
		System.out.println("hzone_use_fee = [" + getHzone_use_fee() + "]");
		System.out.println("ictry_tel_fee = [" + getIctry_tel_fee() + "]");
		System.out.println("p00755tel_fee = [" + getP00755tel_fee() + "]");
		System.out.println("intl_tel_fee = [" + getIntl_tel_fee() + "]");
		System.out.println("movm_tel_fee = [" + getMovm_tel_fee() + "]");
		System.out.println("onnet_curc_fee = [" + getOnnet_curc_fee() + "]");
		System.out.println("p070curc_fee = [" + getP070curc_fee() + "]");
		System.out.println("in_pre_curc_fee = [" + getIn_pre_curc_fee() + "]");
		System.out.println("appm_curc_fee = [" + getAppm_curc_fee() + "]");
		System.out.println("img_curc_fee = [" + getImg_curc_fee() + "]");
		System.out.println("sms_use_fee = [" + getSms_use_fee() + "]");
		System.out.println("supl_use_fee = [" + getSupl_use_fee() + "]");
		System.out.println("sound_src_make_fee = [" + getSound_src_make_fee() + "]");
		System.out.println("frft = [" + getFrft() + "]");
		System.out.println("entr_fee_dscn = [" + getEntr_fee_dscn() + "]");
		System.out.println("base_fee_dscn = [" + getBase_fee_dscn() + "]");
		System.out.println("rent_dscn = [" + getRent_dscn() + "]");
		System.out.println("ictry_tel_dscn = [" + getIctry_tel_dscn() + "]");
		System.out.println("hzone_dscn = [" + getHzone_dscn() + "]");
		System.out.println("movm_tel_dscn = [" + getMovm_tel_dscn() + "]");
		System.out.println("intl_tel_dscn = [" + getIntl_tel_dscn() + "]");
		System.out.println("p00755dscn = [" + getP00755dscn() + "]");
		System.out.println("p070curc_dscn = [" + getP070curc_dscn() + "]");
		System.out.println("in_pre_curc_dscn = [" + getIn_pre_curc_dscn() + "]");
		System.out.println("appm_curc_dscn = [" + getAppm_curc_dscn() + "]");
		System.out.println("cntr_prd_dscn = [" + getCntr_prd_dscn() + "]");
		System.out.println("midl_plac_cmpy_dscn = [" + getMidl_plac_cmpy_dscn() + "]");
		System.out.println("onnet_dscn = [" + getOnnet_dscn() + "]");
		System.out.println("etc_dscn = [" + getEtc_dscn() + "]");
		System.out.println("auto_shift_dscn = [" + getAuto_shift_dscn() + "]");
		System.out.println("use_fee_tot = [" + getUse_fee_tot() + "]");
		System.out.println("use_pers = [" + getUse_pers() + "]");
		System.out.println("use_prd = [" + getUse_prd() + "]");
		System.out.println("chg_matt = [" + getChg_matt() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String sale_yymm = req.getParameter("sale_yymm");
if( sale_yymm == null){
	System.out.println(this.toString+" : sale_yymm is null" );
}else{
	System.out.println(this.toString+" : sale_yymm is "+sale_yymm );
}
String rcpm_clsf = req.getParameter("rcpm_clsf");
if( rcpm_clsf == null){
	System.out.println(this.toString+" : rcpm_clsf is null" );
}else{
	System.out.println(this.toString+" : rcpm_clsf is "+rcpm_clsf );
}
String mang_no = req.getParameter("mang_no");
if( mang_no == null){
	System.out.println(this.toString+" : mang_no is null" );
}else{
	System.out.println(this.toString+" : mang_no is "+mang_no );
}
String entr_fee = req.getParameter("entr_fee");
if( entr_fee == null){
	System.out.println(this.toString+" : entr_fee is null" );
}else{
	System.out.println(this.toString+" : entr_fee is "+entr_fee );
}
String phon_hdqt_fee = req.getParameter("phon_hdqt_fee");
if( phon_hdqt_fee == null){
	System.out.println(this.toString+" : phon_hdqt_fee is null" );
}else{
	System.out.println(this.toString+" : phon_hdqt_fee is "+phon_hdqt_fee );
}
String rent = req.getParameter("rent");
if( rent == null){
	System.out.println(this.toString+" : rent is null" );
}else{
	System.out.println(this.toString+" : rent is "+rent );
}
String hzone_use_fee = req.getParameter("hzone_use_fee");
if( hzone_use_fee == null){
	System.out.println(this.toString+" : hzone_use_fee is null" );
}else{
	System.out.println(this.toString+" : hzone_use_fee is "+hzone_use_fee );
}
String ictry_tel_fee = req.getParameter("ictry_tel_fee");
if( ictry_tel_fee == null){
	System.out.println(this.toString+" : ictry_tel_fee is null" );
}else{
	System.out.println(this.toString+" : ictry_tel_fee is "+ictry_tel_fee );
}
String p00755tel_fee = req.getParameter("p00755tel_fee");
if( p00755tel_fee == null){
	System.out.println(this.toString+" : p00755tel_fee is null" );
}else{
	System.out.println(this.toString+" : p00755tel_fee is "+p00755tel_fee );
}
String intl_tel_fee = req.getParameter("intl_tel_fee");
if( intl_tel_fee == null){
	System.out.println(this.toString+" : intl_tel_fee is null" );
}else{
	System.out.println(this.toString+" : intl_tel_fee is "+intl_tel_fee );
}
String movm_tel_fee = req.getParameter("movm_tel_fee");
if( movm_tel_fee == null){
	System.out.println(this.toString+" : movm_tel_fee is null" );
}else{
	System.out.println(this.toString+" : movm_tel_fee is "+movm_tel_fee );
}
String onnet_curc_fee = req.getParameter("onnet_curc_fee");
if( onnet_curc_fee == null){
	System.out.println(this.toString+" : onnet_curc_fee is null" );
}else{
	System.out.println(this.toString+" : onnet_curc_fee is "+onnet_curc_fee );
}
String p070curc_fee = req.getParameter("p070curc_fee");
if( p070curc_fee == null){
	System.out.println(this.toString+" : p070curc_fee is null" );
}else{
	System.out.println(this.toString+" : p070curc_fee is "+p070curc_fee );
}
String in_pre_curc_fee = req.getParameter("in_pre_curc_fee");
if( in_pre_curc_fee == null){
	System.out.println(this.toString+" : in_pre_curc_fee is null" );
}else{
	System.out.println(this.toString+" : in_pre_curc_fee is "+in_pre_curc_fee );
}
String appm_curc_fee = req.getParameter("appm_curc_fee");
if( appm_curc_fee == null){
	System.out.println(this.toString+" : appm_curc_fee is null" );
}else{
	System.out.println(this.toString+" : appm_curc_fee is "+appm_curc_fee );
}
String img_curc_fee = req.getParameter("img_curc_fee");
if( img_curc_fee == null){
	System.out.println(this.toString+" : img_curc_fee is null" );
}else{
	System.out.println(this.toString+" : img_curc_fee is "+img_curc_fee );
}
String sms_use_fee = req.getParameter("sms_use_fee");
if( sms_use_fee == null){
	System.out.println(this.toString+" : sms_use_fee is null" );
}else{
	System.out.println(this.toString+" : sms_use_fee is "+sms_use_fee );
}
String supl_use_fee = req.getParameter("supl_use_fee");
if( supl_use_fee == null){
	System.out.println(this.toString+" : supl_use_fee is null" );
}else{
	System.out.println(this.toString+" : supl_use_fee is "+supl_use_fee );
}
String sound_src_make_fee = req.getParameter("sound_src_make_fee");
if( sound_src_make_fee == null){
	System.out.println(this.toString+" : sound_src_make_fee is null" );
}else{
	System.out.println(this.toString+" : sound_src_make_fee is "+sound_src_make_fee );
}
String frft = req.getParameter("frft");
if( frft == null){
	System.out.println(this.toString+" : frft is null" );
}else{
	System.out.println(this.toString+" : frft is "+frft );
}
String entr_fee_dscn = req.getParameter("entr_fee_dscn");
if( entr_fee_dscn == null){
	System.out.println(this.toString+" : entr_fee_dscn is null" );
}else{
	System.out.println(this.toString+" : entr_fee_dscn is "+entr_fee_dscn );
}
String base_fee_dscn = req.getParameter("base_fee_dscn");
if( base_fee_dscn == null){
	System.out.println(this.toString+" : base_fee_dscn is null" );
}else{
	System.out.println(this.toString+" : base_fee_dscn is "+base_fee_dscn );
}
String rent_dscn = req.getParameter("rent_dscn");
if( rent_dscn == null){
	System.out.println(this.toString+" : rent_dscn is null" );
}else{
	System.out.println(this.toString+" : rent_dscn is "+rent_dscn );
}
String ictry_tel_dscn = req.getParameter("ictry_tel_dscn");
if( ictry_tel_dscn == null){
	System.out.println(this.toString+" : ictry_tel_dscn is null" );
}else{
	System.out.println(this.toString+" : ictry_tel_dscn is "+ictry_tel_dscn );
}
String hzone_dscn = req.getParameter("hzone_dscn");
if( hzone_dscn == null){
	System.out.println(this.toString+" : hzone_dscn is null" );
}else{
	System.out.println(this.toString+" : hzone_dscn is "+hzone_dscn );
}
String movm_tel_dscn = req.getParameter("movm_tel_dscn");
if( movm_tel_dscn == null){
	System.out.println(this.toString+" : movm_tel_dscn is null" );
}else{
	System.out.println(this.toString+" : movm_tel_dscn is "+movm_tel_dscn );
}
String intl_tel_dscn = req.getParameter("intl_tel_dscn");
if( intl_tel_dscn == null){
	System.out.println(this.toString+" : intl_tel_dscn is null" );
}else{
	System.out.println(this.toString+" : intl_tel_dscn is "+intl_tel_dscn );
}
String p00755dscn = req.getParameter("p00755dscn");
if( p00755dscn == null){
	System.out.println(this.toString+" : p00755dscn is null" );
}else{
	System.out.println(this.toString+" : p00755dscn is "+p00755dscn );
}
String p070curc_dscn = req.getParameter("p070curc_dscn");
if( p070curc_dscn == null){
	System.out.println(this.toString+" : p070curc_dscn is null" );
}else{
	System.out.println(this.toString+" : p070curc_dscn is "+p070curc_dscn );
}
String in_pre_curc_dscn = req.getParameter("in_pre_curc_dscn");
if( in_pre_curc_dscn == null){
	System.out.println(this.toString+" : in_pre_curc_dscn is null" );
}else{
	System.out.println(this.toString+" : in_pre_curc_dscn is "+in_pre_curc_dscn );
}
String appm_curc_dscn = req.getParameter("appm_curc_dscn");
if( appm_curc_dscn == null){
	System.out.println(this.toString+" : appm_curc_dscn is null" );
}else{
	System.out.println(this.toString+" : appm_curc_dscn is "+appm_curc_dscn );
}
String cntr_prd_dscn = req.getParameter("cntr_prd_dscn");
if( cntr_prd_dscn == null){
	System.out.println(this.toString+" : cntr_prd_dscn is null" );
}else{
	System.out.println(this.toString+" : cntr_prd_dscn is "+cntr_prd_dscn );
}
String midl_plac_cmpy_dscn = req.getParameter("midl_plac_cmpy_dscn");
if( midl_plac_cmpy_dscn == null){
	System.out.println(this.toString+" : midl_plac_cmpy_dscn is null" );
}else{
	System.out.println(this.toString+" : midl_plac_cmpy_dscn is "+midl_plac_cmpy_dscn );
}
String onnet_dscn = req.getParameter("onnet_dscn");
if( onnet_dscn == null){
	System.out.println(this.toString+" : onnet_dscn is null" );
}else{
	System.out.println(this.toString+" : onnet_dscn is "+onnet_dscn );
}
String etc_dscn = req.getParameter("etc_dscn");
if( etc_dscn == null){
	System.out.println(this.toString+" : etc_dscn is null" );
}else{
	System.out.println(this.toString+" : etc_dscn is "+etc_dscn );
}
String auto_shift_dscn = req.getParameter("auto_shift_dscn");
if( auto_shift_dscn == null){
	System.out.println(this.toString+" : auto_shift_dscn is null" );
}else{
	System.out.println(this.toString+" : auto_shift_dscn is "+auto_shift_dscn );
}
String use_fee_tot = req.getParameter("use_fee_tot");
if( use_fee_tot == null){
	System.out.println(this.toString+" : use_fee_tot is null" );
}else{
	System.out.println(this.toString+" : use_fee_tot is "+use_fee_tot );
}
String use_pers = req.getParameter("use_pers");
if( use_pers == null){
	System.out.println(this.toString+" : use_pers is null" );
}else{
	System.out.println(this.toString+" : use_pers is "+use_pers );
}
String use_prd = req.getParameter("use_prd");
if( use_prd == null){
	System.out.println(this.toString+" : use_prd is null" );
}else{
	System.out.println(this.toString+" : use_prd is "+use_prd );
}
String chg_matt = req.getParameter("chg_matt");
if( chg_matt == null){
	System.out.println(this.toString+" : chg_matt is null" );
}else{
	System.out.println(this.toString+" : chg_matt is "+chg_matt );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
String rcpm_clsf = Util.checkString(req.getParameter("rcpm_clsf"));
String mang_no = Util.checkString(req.getParameter("mang_no"));
String entr_fee = Util.checkString(req.getParameter("entr_fee"));
String phon_hdqt_fee = Util.checkString(req.getParameter("phon_hdqt_fee"));
String rent = Util.checkString(req.getParameter("rent"));
String hzone_use_fee = Util.checkString(req.getParameter("hzone_use_fee"));
String ictry_tel_fee = Util.checkString(req.getParameter("ictry_tel_fee"));
String p00755tel_fee = Util.checkString(req.getParameter("p00755tel_fee"));
String intl_tel_fee = Util.checkString(req.getParameter("intl_tel_fee"));
String movm_tel_fee = Util.checkString(req.getParameter("movm_tel_fee"));
String onnet_curc_fee = Util.checkString(req.getParameter("onnet_curc_fee"));
String p070curc_fee = Util.checkString(req.getParameter("p070curc_fee"));
String in_pre_curc_fee = Util.checkString(req.getParameter("in_pre_curc_fee"));
String appm_curc_fee = Util.checkString(req.getParameter("appm_curc_fee"));
String img_curc_fee = Util.checkString(req.getParameter("img_curc_fee"));
String sms_use_fee = Util.checkString(req.getParameter("sms_use_fee"));
String supl_use_fee = Util.checkString(req.getParameter("supl_use_fee"));
String sound_src_make_fee = Util.checkString(req.getParameter("sound_src_make_fee"));
String frft = Util.checkString(req.getParameter("frft"));
String entr_fee_dscn = Util.checkString(req.getParameter("entr_fee_dscn"));
String base_fee_dscn = Util.checkString(req.getParameter("base_fee_dscn"));
String rent_dscn = Util.checkString(req.getParameter("rent_dscn"));
String ictry_tel_dscn = Util.checkString(req.getParameter("ictry_tel_dscn"));
String hzone_dscn = Util.checkString(req.getParameter("hzone_dscn"));
String movm_tel_dscn = Util.checkString(req.getParameter("movm_tel_dscn"));
String intl_tel_dscn = Util.checkString(req.getParameter("intl_tel_dscn"));
String p00755dscn = Util.checkString(req.getParameter("p00755dscn"));
String p070curc_dscn = Util.checkString(req.getParameter("p070curc_dscn"));
String in_pre_curc_dscn = Util.checkString(req.getParameter("in_pre_curc_dscn"));
String appm_curc_dscn = Util.checkString(req.getParameter("appm_curc_dscn"));
String cntr_prd_dscn = Util.checkString(req.getParameter("cntr_prd_dscn"));
String midl_plac_cmpy_dscn = Util.checkString(req.getParameter("midl_plac_cmpy_dscn"));
String onnet_dscn = Util.checkString(req.getParameter("onnet_dscn"));
String etc_dscn = Util.checkString(req.getParameter("etc_dscn"));
String auto_shift_dscn = Util.checkString(req.getParameter("auto_shift_dscn"));
String use_fee_tot = Util.checkString(req.getParameter("use_fee_tot"));
String use_pers = Util.checkString(req.getParameter("use_pers"));
String use_prd = Util.checkString(req.getParameter("use_prd"));
String chg_matt = Util.checkString(req.getParameter("chg_matt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String sale_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_yymm")));
String rcpm_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_clsf")));
String mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_no")));
String entr_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("entr_fee")));
String phon_hdqt_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("phon_hdqt_fee")));
String rent = Util.Uni2Ksc(Util.checkString(req.getParameter("rent")));
String hzone_use_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("hzone_use_fee")));
String ictry_tel_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("ictry_tel_fee")));
String p00755tel_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("p00755tel_fee")));
String intl_tel_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("intl_tel_fee")));
String movm_tel_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("movm_tel_fee")));
String onnet_curc_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("onnet_curc_fee")));
String p070curc_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("p070curc_fee")));
String in_pre_curc_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("in_pre_curc_fee")));
String appm_curc_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("appm_curc_fee")));
String img_curc_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("img_curc_fee")));
String sms_use_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("sms_use_fee")));
String supl_use_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("supl_use_fee")));
String sound_src_make_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("sound_src_make_fee")));
String frft = Util.Uni2Ksc(Util.checkString(req.getParameter("frft")));
String entr_fee_dscn = Util.Uni2Ksc(Util.checkString(req.getParameter("entr_fee_dscn")));
String base_fee_dscn = Util.Uni2Ksc(Util.checkString(req.getParameter("base_fee_dscn")));
String rent_dscn = Util.Uni2Ksc(Util.checkString(req.getParameter("rent_dscn")));
String ictry_tel_dscn = Util.Uni2Ksc(Util.checkString(req.getParameter("ictry_tel_dscn")));
String hzone_dscn = Util.Uni2Ksc(Util.checkString(req.getParameter("hzone_dscn")));
String movm_tel_dscn = Util.Uni2Ksc(Util.checkString(req.getParameter("movm_tel_dscn")));
String intl_tel_dscn = Util.Uni2Ksc(Util.checkString(req.getParameter("intl_tel_dscn")));
String p00755dscn = Util.Uni2Ksc(Util.checkString(req.getParameter("p00755dscn")));
String p070curc_dscn = Util.Uni2Ksc(Util.checkString(req.getParameter("p070curc_dscn")));
String in_pre_curc_dscn = Util.Uni2Ksc(Util.checkString(req.getParameter("in_pre_curc_dscn")));
String appm_curc_dscn = Util.Uni2Ksc(Util.checkString(req.getParameter("appm_curc_dscn")));
String cntr_prd_dscn = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_prd_dscn")));
String midl_plac_cmpy_dscn = Util.Uni2Ksc(Util.checkString(req.getParameter("midl_plac_cmpy_dscn")));
String onnet_dscn = Util.Uni2Ksc(Util.checkString(req.getParameter("onnet_dscn")));
String etc_dscn = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_dscn")));
String auto_shift_dscn = Util.Uni2Ksc(Util.checkString(req.getParameter("auto_shift_dscn")));
String use_fee_tot = Util.Uni2Ksc(Util.checkString(req.getParameter("use_fee_tot")));
String use_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("use_pers")));
String use_prd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_prd")));
String chg_matt = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_matt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSale_yymm(sale_yymm);
dm.setRcpm_clsf(rcpm_clsf);
dm.setMang_no(mang_no);
dm.setEntr_fee(entr_fee);
dm.setPhon_hdqt_fee(phon_hdqt_fee);
dm.setRent(rent);
dm.setHzone_use_fee(hzone_use_fee);
dm.setIctry_tel_fee(ictry_tel_fee);
dm.setP00755tel_fee(p00755tel_fee);
dm.setIntl_tel_fee(intl_tel_fee);
dm.setMovm_tel_fee(movm_tel_fee);
dm.setOnnet_curc_fee(onnet_curc_fee);
dm.setP070curc_fee(p070curc_fee);
dm.setIn_pre_curc_fee(in_pre_curc_fee);
dm.setAppm_curc_fee(appm_curc_fee);
dm.setImg_curc_fee(img_curc_fee);
dm.setSms_use_fee(sms_use_fee);
dm.setSupl_use_fee(supl_use_fee);
dm.setSound_src_make_fee(sound_src_make_fee);
dm.setFrft(frft);
dm.setEntr_fee_dscn(entr_fee_dscn);
dm.setBase_fee_dscn(base_fee_dscn);
dm.setRent_dscn(rent_dscn);
dm.setIctry_tel_dscn(ictry_tel_dscn);
dm.setHzone_dscn(hzone_dscn);
dm.setMovm_tel_dscn(movm_tel_dscn);
dm.setIntl_tel_dscn(intl_tel_dscn);
dm.setP00755dscn(p00755dscn);
dm.setP070curc_dscn(p070curc_dscn);
dm.setIn_pre_curc_dscn(in_pre_curc_dscn);
dm.setAppm_curc_dscn(appm_curc_dscn);
dm.setCntr_prd_dscn(cntr_prd_dscn);
dm.setMidl_plac_cmpy_dscn(midl_plac_cmpy_dscn);
dm.setOnnet_dscn(onnet_dscn);
dm.setEtc_dscn(etc_dscn);
dm.setAuto_shift_dscn(auto_shift_dscn);
dm.setUse_fee_tot(use_fee_tot);
dm.setUse_pers(use_pers);
dm.setUse_prd(use_prd);
dm.setChg_matt(chg_matt);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 12 23:07:18 KST 2012 */