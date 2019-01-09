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


package chosun.ciis.sp.sal.rec;

import java.sql.*;
import chosun.ciis.sp.sal.dm.*;
import chosun.ciis.sp.sal.ds.*;

/**
 * 
 */


public class SP_SAL_1210_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String mang_no;
	public String entr_fee;
	public String phon_hdqt_fee;
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
	public String use_prd;
	public String chg_matt;
	public String flag;

	public SP_SAL_1210_LCURLIST1Record(){}

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
	}

	public void setEntr_fee(String entr_fee){
		this.entr_fee = entr_fee;
	}

	public void setPhon_hdqt_fee(String phon_hdqt_fee){
		this.phon_hdqt_fee = phon_hdqt_fee;
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

	public void setUse_prd(String use_prd){
		this.use_prd = use_prd;
	}

	public void setChg_matt(String chg_matt){
		this.chg_matt = chg_matt;
	}

	public void setFlag(String flag){
		this.flag = flag;
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

	public String getUse_prd(){
		return this.use_prd;
	}

	public String getChg_matt(){
		return this.chg_matt;
	}

	public String getFlag(){
		return this.flag;
	}
}

/* 작성시간 : Thu Jul 12 20:28:29 KST 2012 */