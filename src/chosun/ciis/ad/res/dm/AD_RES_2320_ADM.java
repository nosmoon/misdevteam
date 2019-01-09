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


package chosun.ciis.ad.res.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.res.ds.*;
import chosun.ciis.ad.res.rec.*;

/**
 * 
 */


public class AD_RES_2320_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{
	
	public String cmpy_cd;
	public String medi_cd;
	public String pubc_dt;
	public String mode1;
	public String preng_occr_seq1;
	public String sect_cd1;
	public String sect_seq1;
	public String cm1;
	public String dn1;
	public String advt_cont1;
	public String uprc1;
	public String advt_fee1;
	public String vat1;
	public String dlco_no1;
	public String slcrg_pers1;
	public String mchrg_pers1;
	public String issu_side1;
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_RES_2320_ADM(){}
	public AD_RES_2320_ADM(String cmpy_cd, String medi_cd, String pubc_dt, String mode1, String preng_occr_seq1, String sect_cd1, String sect_seq1, String cm1, String dn1, String advt_cont1, String uprc1, String advt_fee1, String vat1, String dlco_no1, String slcrg_pers1, String mchrg_pers1, String issu_side1, String incmg_pers_ip, String incmg_pers){
		System.out.println("dm::1");
		this.cmpy_cd = cmpy_cd;
		this.medi_cd = medi_cd;
		this.pubc_dt = pubc_dt;
		this.mode1 = mode1;
		this.preng_occr_seq1 = preng_occr_seq1;
		this.sect_cd1 = sect_cd1;
		this.sect_seq1 = sect_seq1;
		this.cm1 = cm1;
		this.dn1 = dn1;
		this.advt_cont1 = advt_cont1;
		this.uprc1 = uprc1;
		this.advt_fee1 = advt_fee1;
		this.vat1 = vat1;
		this.dlco_no1 = dlco_no1;
		this.slcrg_pers1 = slcrg_pers1;
		this.mchrg_pers1 = mchrg_pers1;
		this.issu_side1 = issu_side1;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public void setMode1(String mode1){
		this.mode1 = mode1;
	}

	public void setPreng_occr_seq1(String preng_occr_seq1){
		this.preng_occr_seq1 = preng_occr_seq1;
	}

	public void setSect_cd1(String sect_cd1){
		this.sect_cd1 = sect_cd1;
	}

	public void setSect_seq1(String sect_seq1){
		this.sect_seq1 = sect_seq1;
	}

	public void setCm1(String cm1){
		this.cm1 = cm1;
	}

	public void setDn1(String dn1){
		this.dn1 = dn1;
	}

	public void setAdvt_cont1(String advt_cont1){
		this.advt_cont1 = advt_cont1;
	}

	public void setUprc1(String uprc1){
		this.uprc1 = uprc1;
	}

	public void setAdvt_fee1(String advt_fee1){
		this.advt_fee1 = advt_fee1;
	}

	public void setVat1(String vat1){
		this.vat1 = vat1;
	}

	public void setDlco_no1(String dlco_no1){
		this.dlco_no1 = dlco_no1;
	}
	public void setSlcrg_pers1(String slcrg_pers1){
		this.slcrg_pers1 = slcrg_pers1;
	}
	public void setMchrg_pers1(String mchrg_pers1){
		this.mchrg_pers1 = mchrg_pers1;
	}
	public void setIssu_side1(String issu_side1){
		this.issu_side1 = issu_side1;
	}
	
	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getMode1(){
		return this.mode1;
	}

	public String getPreng_occr_seq1(){
		return this.preng_occr_seq1;
	}

	public String getSect_cd1(){
		return this.sect_cd1;
	}

	public String getSect_seq1(){
		return this.sect_seq1;
	}

	public String getCm1(){
		return this.cm1;
	}

	public String getDn1(){
		return this.dn1;
	}

	public String getAdvt_cont1(){
		return this.advt_cont1;
	}

	public String getUprc1(){
		return this.uprc1;
	}

	public String getAdvt_fee1(){
		return this.advt_fee1;
	}

	public String getVat1(){
		return this.vat1;
	}

	public String getDlco_no1(){
		return this.dlco_no1;
	}
	
	public String getSlcrg_pers1(){
		return this.slcrg_pers1;
	}
	
	public String getMchrg_pers1(){
		return this.mchrg_pers1;
	}
	
	public String getIssu_side1(){
		return this.issu_side1;
	}
	
	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_RES_2320_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_RES_2320_ADM dm = (AD_RES_2320_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_cd);
		cstmt.setString(5, dm.pubc_dt);
		cstmt.setString(6, dm.mode1);
		cstmt.setString(7, dm.preng_occr_seq1);
		cstmt.setString(8, dm.sect_cd1);
		cstmt.setString(9, dm.sect_seq1);
		cstmt.setString(10, dm.cm1);
		cstmt.setString(11, dm.dn1);
		cstmt.setString(12, dm.advt_cont1);
		cstmt.setString(13, dm.uprc1);
		cstmt.setString(14, dm.advt_fee1);
		cstmt.setString(15, dm.vat1);
		cstmt.setString(16, dm.dlco_no1);
		cstmt.setString(17, dm.slcrg_pers1);
		cstmt.setString(18, dm.mchrg_pers1);
		cstmt.setString(19, dm.issu_side1);
		cstmt.setString(20, dm.incmg_pers_ip);
		cstmt.setString(21, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.res.ds.AD_RES_2320_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("pubc_dt = [" + getPubc_dt() + "]");
		System.out.println("mode1 = [" + getMode1() + "]");
		System.out.println("preng_occr_seq1 = [" + getPreng_occr_seq1() + "]");
		System.out.println("sect_cd1 = [" + getSect_cd1() + "]");
		System.out.println("sect_seq1 = [" + getSect_seq1() + "]");
		System.out.println("cm1 = [" + getCm1() + "]");
		System.out.println("dn1 = [" + getDn1() + "]");
		System.out.println("advt_cont1 = [" + getAdvt_cont1() + "]");
		System.out.println("uprc1 = [" + getUprc1() + "]");
		System.out.println("advt_fee1 = [" + getAdvt_fee1() + "]");
		System.out.println("vat1 = [" + getVat1() + "]");
		System.out.println("dlco_no1 = [" + getDlco_no1() + "]");
		System.out.println("slcrg_pers1 = [" + getSlcrg_pers1() + "]");
		System.out.println("mchrg_pers1 = [" + getMchrg_pers1() + "]");
		System.out.println("issu_side1 = [" + getIssu_side1() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String mode1 = req.getParameter("mode1");
if( mode1 == null){
	System.out.println(this.toString+" : mode1 is null" );
}else{
	System.out.println(this.toString+" : mode1 is "+mode1 );
}
String preng_occr_seq1 = req.getParameter("preng_occr_seq1");
if( preng_occr_seq1 == null){
	System.out.println(this.toString+" : preng_occr_seq1 is null" );
}else{
	System.out.println(this.toString+" : preng_occr_seq1 is "+preng_occr_seq1 );
}
String sect_cd1 = req.getParameter("sect_cd1");
if( sect_cd1 == null){
	System.out.println(this.toString+" : sect_cd1 is null" );
}else{
	System.out.println(this.toString+" : sect_cd1 is "+sect_cd1 );
}
String sect_seq1 = req.getParameter("sect_seq1");
if( sect_seq1 == null){
	System.out.println(this.toString+" : sect_seq1 is null" );
}else{
	System.out.println(this.toString+" : sect_seq1 is "+sect_seq1 );
}
String cm1 = req.getParameter("cm1");
if( cm1 == null){
	System.out.println(this.toString+" : cm1 is null" );
}else{
	System.out.println(this.toString+" : cm1 is "+cm1 );
}
String dn1 = req.getParameter("dn1");
if( dn1 == null){
	System.out.println(this.toString+" : dn1 is null" );
}else{
	System.out.println(this.toString+" : dn1 is "+dn1 );
}
String advt_cont1 = req.getParameter("advt_cont1");
if( advt_cont1 == null){
	System.out.println(this.toString+" : advt_cont1 is null" );
}else{
	System.out.println(this.toString+" : advt_cont1 is "+advt_cont1 );
}
String uprc1 = req.getParameter("uprc1");
if( uprc1 == null){
	System.out.println(this.toString+" : uprc1 is null" );
}else{
	System.out.println(this.toString+" : uprc1 is "+uprc1 );
}
String advt_fee1 = req.getParameter("advt_fee1");
if( advt_fee1 == null){
	System.out.println(this.toString+" : advt_fee1 is null" );
}else{
	System.out.println(this.toString+" : advt_fee1 is "+advt_fee1 );
}
String vat1 = req.getParameter("vat1");
if( vat1 == null){
	System.out.println(this.toString+" : vat1 is null" );
}else{
	System.out.println(this.toString+" : vat1 is "+vat1 );
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

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String pubc_dt = Util.checkString(req.getParameter("pubc_dt"));
String mode1 = Util.checkString(req.getParameter("mode1"));
String preng_occr_seq1 = Util.checkString(req.getParameter("preng_occr_seq1"));
String sect_cd1 = Util.checkString(req.getParameter("sect_cd1"));
String sect_seq1 = Util.checkString(req.getParameter("sect_seq1"));
String cm1 = Util.checkString(req.getParameter("cm1"));
String dn1 = Util.checkString(req.getParameter("dn1"));
String advt_cont1 = Util.checkString(req.getParameter("advt_cont1"));
String uprc1 = Util.checkString(req.getParameter("uprc1"));
String advt_fee1 = Util.checkString(req.getParameter("advt_fee1"));
String vat1 = Util.checkString(req.getParameter("vat1"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String pubc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_dt")));
String mode1 = Util.Uni2Ksc(Util.checkString(req.getParameter("mode1")));
String preng_occr_seq1 = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_occr_seq1")));
String sect_cd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd1")));
String sect_seq1 = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_seq1")));
String cm1 = Util.Uni2Ksc(Util.checkString(req.getParameter("cm1")));
String dn1 = Util.Uni2Ksc(Util.checkString(req.getParameter("dn1")));
String advt_cont1 = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_cont1")));
String uprc1 = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc1")));
String advt_fee1 = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_fee1")));
String vat1 = Util.Uni2Ksc(Util.checkString(req.getParameter("vat1")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_cd(medi_cd);
dm.setPubc_dt(pubc_dt);
dm.setMode1(mode1);
dm.setPreng_occr_seq1(preng_occr_seq1);
dm.setSect_cd1(sect_cd1);
dm.setSect_seq1(sect_seq1);
dm.setCm1(cm1);
dm.setDn1(dn1);
dm.setAdvt_cont1(advt_cont1);
dm.setUprc1(uprc1);
dm.setAdvt_fee1(advt_fee1);
dm.setVat1(vat1);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 21 18:07:24 KST 2013 */