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


package chosun.ciis.ad.brn.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_BRN_1920_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String preng_advt_bo;
	public String cmpy_cd;
	public String hndl_clsf;
	public String preng_occr_dt;
	public String medi_cd;
	public String pubc_dt;
	public String hndl_plac_cd;
	public String slcrg_pers;
	public String mchrg_pers;
	public String fee_rate;
	public String bo_chrg_aprv;
	public String preng_occr_seq;
	public String advt_cont;
	public String dlco_no;
	public String pubc_side;
	public String sect_nm;
	public String arow;
	public String uprc;
	public String advt_fee;
	public String vat;
	public String guid_sec_kind_cd;
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_BRN_1920_ADM(){}
	public AD_BRN_1920_ADM(String flag, String preng_advt_bo, String cmpy_cd, String hndl_clsf, String preng_occr_dt, String medi_cd, String pubc_dt, String hndl_plac_cd, String slcrg_pers, String mchrg_pers, String fee_rate, String bo_chrg_aprv, String preng_occr_seq, String advt_cont, String dlco_no, String pubc_side, String sect_nm, String arow, String uprc, String advt_fee, String vat, String guid_sec_kind_cd, String incmg_pers_ip, String incmg_pers){
		this.flag = flag;
		this.preng_advt_bo = preng_advt_bo;
		this.cmpy_cd = cmpy_cd;
		this.hndl_clsf = hndl_clsf;
		this.preng_occr_dt = preng_occr_dt;
		this.medi_cd = medi_cd;
		this.pubc_dt = pubc_dt;
		this.hndl_plac_cd = hndl_plac_cd;
		this.slcrg_pers = slcrg_pers;
		this.mchrg_pers = mchrg_pers;
		this.fee_rate = fee_rate;
		this.bo_chrg_aprv = bo_chrg_aprv;
		this.preng_occr_seq = preng_occr_seq;
		this.advt_cont = advt_cont;
		this.dlco_no = dlco_no;
		this.pubc_side = pubc_side;
		this.sect_nm = sect_nm;
		this.arow = arow;
		this.uprc = uprc;
		this.advt_fee = advt_fee;
		this.vat = vat;
		this.guid_sec_kind_cd = guid_sec_kind_cd;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setPreng_advt_bo(String preng_advt_bo){
		this.preng_advt_bo = preng_advt_bo;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setHndl_clsf(String hndl_clsf){
		this.hndl_clsf = hndl_clsf;
	}

	public void setPreng_occr_dt(String preng_occr_dt){
		this.preng_occr_dt = preng_occr_dt;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public void setHndl_plac_cd(String hndl_plac_cd){
		this.hndl_plac_cd = hndl_plac_cd;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
	}

	public void setFee_rate(String fee_rate){
		this.fee_rate = fee_rate;
	}

	public void setBo_chrg_aprv(String bo_chrg_aprv){
		this.bo_chrg_aprv = bo_chrg_aprv;
	}

	public void setPreng_occr_seq(String preng_occr_seq){
		this.preng_occr_seq = preng_occr_seq;
	}

	public void setAdvt_cont(String advt_cont){
		this.advt_cont = advt_cont;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setPubc_side(String pubc_side){
		this.pubc_side = pubc_side;
	}

	public void setSect_nm(String sect_nm){
		this.sect_nm = sect_nm;
	}

	public void setArow(String arow){
		this.arow = arow;
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

	public void setGuid_sec_kind_cd(String guid_sec_kind_cd){
		this.guid_sec_kind_cd = guid_sec_kind_cd;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getPreng_advt_bo(){
		return this.preng_advt_bo;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getHndl_clsf(){
		return this.hndl_clsf;
	}

	public String getPreng_occr_dt(){
		return this.preng_occr_dt;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getHndl_plac_cd(){
		return this.hndl_plac_cd;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
	}

	public String getFee_rate(){
		return this.fee_rate;
	}

	public String getBo_chrg_aprv(){
		return this.bo_chrg_aprv;
	}

	public String getPreng_occr_seq(){
		return this.preng_occr_seq;
	}

	public String getAdvt_cont(){
		return this.advt_cont;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getPubc_side(){
		return this.pubc_side;
	}

	public String getSect_nm(){
		return this.sect_nm;
	}

	public String getArow(){
		return this.arow;
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

	public String getGuid_sec_kind_cd(){
		return this.guid_sec_kind_cd;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_BRN_1920_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BRN_1920_ADM dm = (AD_BRN_1920_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.preng_advt_bo);
		cstmt.setString(5, dm.cmpy_cd);
		cstmt.setString(6, dm.hndl_clsf);
		cstmt.setString(7, dm.preng_occr_dt);
		cstmt.setString(8, dm.medi_cd);
		cstmt.setString(9, dm.pubc_dt);
		cstmt.setString(10, dm.hndl_plac_cd);
		cstmt.setString(11, dm.slcrg_pers);
		cstmt.setString(12, dm.mchrg_pers);
		cstmt.setString(13, dm.fee_rate);
		cstmt.setString(14, dm.bo_chrg_aprv);
		cstmt.setString(15, dm.preng_occr_seq);
		cstmt.setString(16, dm.advt_cont);
		cstmt.setString(17, dm.dlco_no);
		cstmt.setString(18, dm.pubc_side);
		cstmt.setString(19, dm.sect_nm);
		cstmt.setString(20, dm.arow);
		cstmt.setString(21, dm.uprc);
		cstmt.setString(22, dm.advt_fee);
		cstmt.setString(23, dm.vat);
		cstmt.setString(24, dm.guid_sec_kind_cd);
		cstmt.setString(25, dm.incmg_pers_ip);
		cstmt.setString(26, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.brn.ds.AD_BRN_1920_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("preng_advt_bo = [" + getPreng_advt_bo() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("hndl_clsf = [" + getHndl_clsf() + "]");
		System.out.println("preng_occr_dt = [" + getPreng_occr_dt() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("pubc_dt = [" + getPubc_dt() + "]");
		System.out.println("hndl_plac_cd = [" + getHndl_plac_cd() + "]");
		System.out.println("slcrg_pers = [" + getSlcrg_pers() + "]");
		System.out.println("mchrg_pers = [" + getMchrg_pers() + "]");
		System.out.println("fee_rate = [" + getFee_rate() + "]");
		System.out.println("bo_chrg_aprv = [" + getBo_chrg_aprv() + "]");
		System.out.println("preng_occr_seq = [" + getPreng_occr_seq() + "]");
		System.out.println("advt_cont = [" + getAdvt_cont() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("pubc_side = [" + getPubc_side() + "]");
		System.out.println("sect_nm = [" + getSect_nm() + "]");
		System.out.println("arow = [" + getArow() + "]");
		System.out.println("uprc = [" + getUprc() + "]");
		System.out.println("advt_fee = [" + getAdvt_fee() + "]");
		System.out.println("vat = [" + getVat() + "]");
		System.out.println("guid_sec_kind_cd = [" + getGuid_sec_kind_cd() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
String preng_advt_bo = req.getParameter("preng_advt_bo");
if( preng_advt_bo == null){
	System.out.println(this.toString+" : preng_advt_bo is null" );
}else{
	System.out.println(this.toString+" : preng_advt_bo is "+preng_advt_bo );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String hndl_clsf = req.getParameter("hndl_clsf");
if( hndl_clsf == null){
	System.out.println(this.toString+" : hndl_clsf is null" );
}else{
	System.out.println(this.toString+" : hndl_clsf is "+hndl_clsf );
}
String preng_occr_dt = req.getParameter("preng_occr_dt");
if( preng_occr_dt == null){
	System.out.println(this.toString+" : preng_occr_dt is null" );
}else{
	System.out.println(this.toString+" : preng_occr_dt is "+preng_occr_dt );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String pubc_dt = req.getParameter("pubc_dt");
if( pubc_dt == null){
	System.out.println(this.toString+" : pubc_dt is null" );
}else{
	System.out.println(this.toString+" : pubc_dt is "+pubc_dt );
}
String hndl_plac_cd = req.getParameter("hndl_plac_cd");
if( hndl_plac_cd == null){
	System.out.println(this.toString+" : hndl_plac_cd is null" );
}else{
	System.out.println(this.toString+" : hndl_plac_cd is "+hndl_plac_cd );
}
String slcrg_pers = req.getParameter("slcrg_pers");
if( slcrg_pers == null){
	System.out.println(this.toString+" : slcrg_pers is null" );
}else{
	System.out.println(this.toString+" : slcrg_pers is "+slcrg_pers );
}
String mchrg_pers = req.getParameter("mchrg_pers");
if( mchrg_pers == null){
	System.out.println(this.toString+" : mchrg_pers is null" );
}else{
	System.out.println(this.toString+" : mchrg_pers is "+mchrg_pers );
}
String fee_rate = req.getParameter("fee_rate");
if( fee_rate == null){
	System.out.println(this.toString+" : fee_rate is null" );
}else{
	System.out.println(this.toString+" : fee_rate is "+fee_rate );
}
String bo_chrg_aprv = req.getParameter("bo_chrg_aprv");
if( bo_chrg_aprv == null){
	System.out.println(this.toString+" : bo_chrg_aprv is null" );
}else{
	System.out.println(this.toString+" : bo_chrg_aprv is "+bo_chrg_aprv );
}
String preng_occr_seq = req.getParameter("preng_occr_seq");
if( preng_occr_seq == null){
	System.out.println(this.toString+" : preng_occr_seq is null" );
}else{
	System.out.println(this.toString+" : preng_occr_seq is "+preng_occr_seq );
}
String advt_cont = req.getParameter("advt_cont");
if( advt_cont == null){
	System.out.println(this.toString+" : advt_cont is null" );
}else{
	System.out.println(this.toString+" : advt_cont is "+advt_cont );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String pubc_side = req.getParameter("pubc_side");
if( pubc_side == null){
	System.out.println(this.toString+" : pubc_side is null" );
}else{
	System.out.println(this.toString+" : pubc_side is "+pubc_side );
}
String sect_nm = req.getParameter("sect_nm");
if( sect_nm == null){
	System.out.println(this.toString+" : sect_nm is null" );
}else{
	System.out.println(this.toString+" : sect_nm is "+sect_nm );
}
String arow = req.getParameter("arow");
if( arow == null){
	System.out.println(this.toString+" : arow is null" );
}else{
	System.out.println(this.toString+" : arow is "+arow );
}
String uprc = req.getParameter("uprc");
if( uprc == null){
	System.out.println(this.toString+" : uprc is null" );
}else{
	System.out.println(this.toString+" : uprc is "+uprc );
}
String advt_fee = req.getParameter("advt_fee");
if( advt_fee == null){
	System.out.println(this.toString+" : advt_fee is null" );
}else{
	System.out.println(this.toString+" : advt_fee is "+advt_fee );
}
String vat = req.getParameter("vat");
if( vat == null){
	System.out.println(this.toString+" : vat is null" );
}else{
	System.out.println(this.toString+" : vat is "+vat );
}
String guid_sec_kind_cd = req.getParameter("guid_sec_kind_cd");
if( guid_sec_kind_cd == null){
	System.out.println(this.toString+" : guid_sec_kind_cd is null" );
}else{
	System.out.println(this.toString+" : guid_sec_kind_cd is "+guid_sec_kind_cd );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String flag = Util.checkString(req.getParameter("flag"));
String preng_advt_bo = Util.checkString(req.getParameter("preng_advt_bo"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
String preng_occr_dt = Util.checkString(req.getParameter("preng_occr_dt"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String pubc_dt = Util.checkString(req.getParameter("pubc_dt"));
String hndl_plac_cd = Util.checkString(req.getParameter("hndl_plac_cd"));
String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
String mchrg_pers = Util.checkString(req.getParameter("mchrg_pers"));
String fee_rate = Util.checkString(req.getParameter("fee_rate"));
String bo_chrg_aprv = Util.checkString(req.getParameter("bo_chrg_aprv"));
String preng_occr_seq = Util.checkString(req.getParameter("preng_occr_seq"));
String advt_cont = Util.checkString(req.getParameter("advt_cont"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String pubc_side = Util.checkString(req.getParameter("pubc_side"));
String sect_nm = Util.checkString(req.getParameter("sect_nm"));
String arow = Util.checkString(req.getParameter("arow"));
String uprc = Util.checkString(req.getParameter("uprc"));
String advt_fee = Util.checkString(req.getParameter("advt_fee"));
String vat = Util.checkString(req.getParameter("vat"));
String guid_sec_kind_cd = Util.checkString(req.getParameter("guid_sec_kind_cd"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String preng_advt_bo = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_advt_bo")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String hndl_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("hndl_clsf")));
String preng_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_occr_dt")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String pubc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_dt")));
String hndl_plac_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("hndl_plac_cd")));
String slcrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("slcrg_pers")));
String mchrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("mchrg_pers")));
String fee_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("fee_rate")));
String bo_chrg_aprv = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_chrg_aprv")));
String preng_occr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_occr_seq")));
String advt_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_cont")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String pubc_side = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_side")));
String sect_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_nm")));
String arow = Util.Uni2Ksc(Util.checkString(req.getParameter("arow")));
String uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc")));
String advt_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_fee")));
String vat = Util.Uni2Ksc(Util.checkString(req.getParameter("vat")));
String guid_sec_kind_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("guid_sec_kind_cd")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setPreng_advt_bo(preng_advt_bo);
dm.setCmpy_cd(cmpy_cd);
dm.setHndl_clsf(hndl_clsf);
dm.setPreng_occr_dt(preng_occr_dt);
dm.setMedi_cd(medi_cd);
dm.setPubc_dt(pubc_dt);
dm.setHndl_plac_cd(hndl_plac_cd);
dm.setSlcrg_pers(slcrg_pers);
dm.setMchrg_pers(mchrg_pers);
dm.setFee_rate(fee_rate);
dm.setBo_chrg_aprv(bo_chrg_aprv);
dm.setPreng_occr_seq(preng_occr_seq);
dm.setAdvt_cont(advt_cont);
dm.setDlco_no(dlco_no);
dm.setPubc_side(pubc_side);
dm.setSect_nm(sect_nm);
dm.setArow(arow);
dm.setUprc(uprc);
dm.setAdvt_fee(advt_fee);
dm.setVat(vat);
dm.setGuid_sec_kind_cd(guid_sec_kind_cd);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Jul 18 17:09:20 KST 2009 */