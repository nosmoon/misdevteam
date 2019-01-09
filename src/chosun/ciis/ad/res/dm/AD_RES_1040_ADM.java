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


public class AD_RES_1040_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_cd;
	public String issu_dt;
	public String mode;
	public String sect_clas_cd;
	public String sect_nm_cd;
	public String sect_cd;
	public String edt_clsf;
	public String bgn_side;
	public String end_side;
	public String issu_cnt;
	public String tabl_clsf;
	public String pre_sect_clas_cd;
	public String pre_sect_nm_cd;
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_RES_1040_ADM(){}
	public AD_RES_1040_ADM(String cmpy_cd, String medi_cd, String issu_dt, String mode, String sect_clas_cd, String sect_nm_cd, String sect_cd, String edt_clsf, String bgn_side, String end_side, String issu_cnt, String tabl_clsf, String pre_sect_clas_cd, String pre_sect_nm_cd, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.medi_cd = medi_cd;
		this.issu_dt = issu_dt;
		this.mode = mode;
		this.sect_clas_cd = sect_clas_cd;
		this.sect_nm_cd = sect_nm_cd;
		this.sect_cd = sect_cd;
		this.edt_clsf = edt_clsf;
		this.bgn_side = bgn_side;
		this.end_side = end_side;
		this.issu_cnt = issu_cnt;
		this.tabl_clsf = tabl_clsf;
		this.pre_sect_clas_cd = pre_sect_clas_cd;
		this.pre_sect_nm_cd = pre_sect_nm_cd;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setSect_clas_cd(String sect_clas_cd){
		this.sect_clas_cd = sect_clas_cd;
	}

	public void setSect_nm_cd(String sect_nm_cd){
		this.sect_nm_cd = sect_nm_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setEdt_clsf(String edt_clsf){
		this.edt_clsf = edt_clsf;
	}

	public void setBgn_side(String bgn_side){
		this.bgn_side = bgn_side;
	}

	public void setEnd_side(String end_side){
		this.end_side = end_side;
	}

	public void setIssu_cnt(String issu_cnt){
		this.issu_cnt = issu_cnt;
	}

	public void setTabl_clsf(String tabl_clsf){
		this.tabl_clsf = tabl_clsf;
	}

	public void setPre_sect_clas_cd(String pre_sect_clas_cd){
		this.pre_sect_clas_cd = pre_sect_clas_cd;
	}

	public void setPre_sect_nm_cd(String pre_sect_nm_cd){
		this.pre_sect_nm_cd = pre_sect_nm_cd;
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

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getMode(){
		return this.mode;
	}

	public String getSect_clas_cd(){
		return this.sect_clas_cd;
	}

	public String getSect_nm_cd(){
		return this.sect_nm_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getEdt_clsf(){
		return this.edt_clsf;
	}

	public String getBgn_side(){
		return this.bgn_side;
	}

	public String getEnd_side(){
		return this.end_side;
	}

	public String getIssu_cnt(){
		return this.issu_cnt;
	}

	public String getTabl_clsf(){
		return this.tabl_clsf;
	}

	public String getPre_sect_clas_cd(){
		return this.pre_sect_clas_cd;
	}

	public String getPre_sect_nm_cd(){
		return this.pre_sect_nm_cd;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_RES_1040_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_RES_1040_ADM dm = (AD_RES_1040_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_cd);
		cstmt.setString(5, dm.issu_dt);
		cstmt.setString(6, dm.mode);
		cstmt.setString(7, dm.sect_clas_cd);
		cstmt.setString(8, dm.sect_nm_cd);
		cstmt.setString(9, dm.sect_cd);
		cstmt.setString(10, dm.edt_clsf);
		cstmt.setString(11, dm.bgn_side);
		cstmt.setString(12, dm.end_side);
		cstmt.setString(13, dm.issu_cnt);
		cstmt.setString(14, dm.tabl_clsf);
		cstmt.setString(15, dm.pre_sect_clas_cd);
		cstmt.setString(16, dm.pre_sect_nm_cd);
		cstmt.setString(17, dm.incmg_pers_ip);
		cstmt.setString(18, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.res.ds.AD_RES_1040_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("issu_dt = [" + getIssu_dt() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("sect_clas_cd = [" + getSect_clas_cd() + "]");
		System.out.println("sect_nm_cd = [" + getSect_nm_cd() + "]");
		System.out.println("sect_cd = [" + getSect_cd() + "]");
		System.out.println("edt_clsf = [" + getEdt_clsf() + "]");
		System.out.println("bgn_side = [" + getBgn_side() + "]");
		System.out.println("end_side = [" + getEnd_side() + "]");
		System.out.println("issu_cnt = [" + getIssu_cnt() + "]");
		System.out.println("tabl_clsf = [" + getTabl_clsf() + "]");
		System.out.println("pre_sect_clas_cd = [" + getPre_sect_clas_cd() + "]");
		System.out.println("pre_sect_nm_cd = [" + getPre_sect_nm_cd() + "]");
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
String issu_dt = req.getParameter("issu_dt");
if( issu_dt == null){
	System.out.println(this.toString+" : issu_dt is null" );
}else{
	System.out.println(this.toString+" : issu_dt is "+issu_dt );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String sect_clas_cd = req.getParameter("sect_clas_cd");
if( sect_clas_cd == null){
	System.out.println(this.toString+" : sect_clas_cd is null" );
}else{
	System.out.println(this.toString+" : sect_clas_cd is "+sect_clas_cd );
}
String sect_nm_cd = req.getParameter("sect_nm_cd");
if( sect_nm_cd == null){
	System.out.println(this.toString+" : sect_nm_cd is null" );
}else{
	System.out.println(this.toString+" : sect_nm_cd is "+sect_nm_cd );
}
String sect_cd = req.getParameter("sect_cd");
if( sect_cd == null){
	System.out.println(this.toString+" : sect_cd is null" );
}else{
	System.out.println(this.toString+" : sect_cd is "+sect_cd );
}
String edt_clsf = req.getParameter("edt_clsf");
if( edt_clsf == null){
	System.out.println(this.toString+" : edt_clsf is null" );
}else{
	System.out.println(this.toString+" : edt_clsf is "+edt_clsf );
}
String bgn_side = req.getParameter("bgn_side");
if( bgn_side == null){
	System.out.println(this.toString+" : bgn_side is null" );
}else{
	System.out.println(this.toString+" : bgn_side is "+bgn_side );
}
String end_side = req.getParameter("end_side");
if( end_side == null){
	System.out.println(this.toString+" : end_side is null" );
}else{
	System.out.println(this.toString+" : end_side is "+end_side );
}
String issu_cnt = req.getParameter("issu_cnt");
if( issu_cnt == null){
	System.out.println(this.toString+" : issu_cnt is null" );
}else{
	System.out.println(this.toString+" : issu_cnt is "+issu_cnt );
}
String tabl_clsf = req.getParameter("tabl_clsf");
if( tabl_clsf == null){
	System.out.println(this.toString+" : tabl_clsf is null" );
}else{
	System.out.println(this.toString+" : tabl_clsf is "+tabl_clsf );
}
String pre_sect_clas_cd = req.getParameter("pre_sect_clas_cd");
if( pre_sect_clas_cd == null){
	System.out.println(this.toString+" : pre_sect_clas_cd is null" );
}else{
	System.out.println(this.toString+" : pre_sect_clas_cd is "+pre_sect_clas_cd );
}
String pre_sect_nm_cd = req.getParameter("pre_sect_nm_cd");
if( pre_sect_nm_cd == null){
	System.out.println(this.toString+" : pre_sect_nm_cd is null" );
}else{
	System.out.println(this.toString+" : pre_sect_nm_cd is "+pre_sect_nm_cd );
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
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String mode = Util.checkString(req.getParameter("mode"));
String sect_clas_cd = Util.checkString(req.getParameter("sect_clas_cd"));
String sect_nm_cd = Util.checkString(req.getParameter("sect_nm_cd"));
String sect_cd = Util.checkString(req.getParameter("sect_cd"));
String edt_clsf = Util.checkString(req.getParameter("edt_clsf"));
String bgn_side = Util.checkString(req.getParameter("bgn_side"));
String end_side = Util.checkString(req.getParameter("end_side"));
String issu_cnt = Util.checkString(req.getParameter("issu_cnt"));
String tabl_clsf = Util.checkString(req.getParameter("tabl_clsf"));
String pre_sect_clas_cd = Util.checkString(req.getParameter("pre_sect_clas_cd"));
String pre_sect_nm_cd = Util.checkString(req.getParameter("pre_sect_nm_cd"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String sect_clas_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_clas_cd")));
String sect_nm_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_nm_cd")));
String sect_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd")));
String edt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("edt_clsf")));
String bgn_side = Util.Uni2Ksc(Util.checkString(req.getParameter("bgn_side")));
String end_side = Util.Uni2Ksc(Util.checkString(req.getParameter("end_side")));
String issu_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_cnt")));
String tabl_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("tabl_clsf")));
String pre_sect_clas_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("pre_sect_clas_cd")));
String pre_sect_nm_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("pre_sect_nm_cd")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_cd(medi_cd);
dm.setIssu_dt(issu_dt);
dm.setMode(mode);
dm.setSect_clas_cd(sect_clas_cd);
dm.setSect_nm_cd(sect_nm_cd);
dm.setSect_cd(sect_cd);
dm.setEdt_clsf(edt_clsf);
dm.setBgn_side(bgn_side);
dm.setEnd_side(end_side);
dm.setIssu_cnt(issu_cnt);
dm.setTabl_clsf(tabl_clsf);
dm.setPre_sect_clas_cd(pre_sect_clas_cd);
dm.setPre_sect_nm_cd(pre_sect_nm_cd);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 28 17:27:34 KST 2017 */