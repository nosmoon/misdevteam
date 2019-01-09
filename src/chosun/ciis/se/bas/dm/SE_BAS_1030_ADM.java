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


package chosun.ciis.se.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.bas.ds.*;
import chosun.ciis.se.bas.rec.*;

/**
 * 
 */


public class SE_BAS_1030_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String accflag;
	public String cmpy_cd;
	public String supr_dept_cd;
	public String chrg_pers;
	public String dept_cd;
	public String hdpt_cd;
	public String dept_nm;
	public String use_yn;
	public String feat_clsf;
	public String step;
	public String mode_ar;
	public String dept_cd_ar;
	public String area_cd_ar;
	public String area_nm_ar;
	public String sido_cd_ar;
	public String chrg_pers_ar;
	public String acct_sido_cd_ar;
	public String sell_sido_cd_ar;
	public String sell_srt_col_ar;
	public String use_yn_ar;
	public String incmgpers;
	public String incmg_pers_ip;

	public SE_BAS_1030_ADM(){}
	public SE_BAS_1030_ADM(String accflag, String cmpy_cd, String supr_dept_cd, String chrg_pers, String dept_cd, String hdpt_cd, String dept_nm, String use_yn, String feat_clsf, String step, String mode_ar, String dept_cd_ar, String area_cd_ar, String area_nm_ar, String sido_cd_ar, String chrg_pers_ar, String acct_sido_cd_ar, String sell_sido_cd_ar, String sell_srt_col_ar, String use_yn_ar, String incmgpers, String incmg_pers_ip){
		this.accflag = accflag;
		this.cmpy_cd = cmpy_cd;
		this.supr_dept_cd = supr_dept_cd;
		this.chrg_pers = chrg_pers;
		this.dept_cd = dept_cd;
		this.hdpt_cd = hdpt_cd;
		this.dept_nm = dept_nm;
		this.use_yn = use_yn;
		this.feat_clsf = feat_clsf;
		this.step = step;
		this.mode_ar = mode_ar;
		this.dept_cd_ar = dept_cd_ar;
		this.area_cd_ar = area_cd_ar;
		this.area_nm_ar = area_nm_ar;
		this.sido_cd_ar = sido_cd_ar;
		this.chrg_pers_ar = chrg_pers_ar;
		this.acct_sido_cd_ar = acct_sido_cd_ar;
		this.sell_sido_cd_ar = sell_sido_cd_ar;
		this.sell_srt_col_ar = sell_srt_col_ar;
		this.use_yn_ar = use_yn_ar;
		this.incmgpers = incmgpers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSupr_dept_cd(String supr_dept_cd){
		this.supr_dept_cd = supr_dept_cd;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setHdpt_cd(String hdpt_cd){
		this.hdpt_cd = hdpt_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public void setFeat_clsf(String feat_clsf){
		this.feat_clsf = feat_clsf;
	}

	public void setStep(String step){
		this.step = step;
	}

	public void setMode_ar(String mode_ar){
		this.mode_ar = mode_ar;
	}

	public void setDept_cd_ar(String dept_cd_ar){
		this.dept_cd_ar = dept_cd_ar;
	}

	public void setArea_cd_ar(String area_cd_ar){
		this.area_cd_ar = area_cd_ar;
	}

	public void setArea_nm_ar(String area_nm_ar){
		this.area_nm_ar = area_nm_ar;
	}

	public void setSido_cd_ar(String sido_cd_ar){
		this.sido_cd_ar = sido_cd_ar;
	}

	public void setChrg_pers_ar(String chrg_pers_ar){
		this.chrg_pers_ar = chrg_pers_ar;
	}

	public void setAcct_sido_cd_ar(String acct_sido_cd_ar){
		this.acct_sido_cd_ar = acct_sido_cd_ar;
	}

	public void setSell_sido_cd_ar(String sell_sido_cd_ar){
		this.sell_sido_cd_ar = sell_sido_cd_ar;
	}

	public void setSell_srt_col_ar(String sell_srt_col_ar){
		this.sell_srt_col_ar = sell_srt_col_ar;
	}

	public void setUse_yn_ar(String use_yn_ar){
		this.use_yn_ar = use_yn_ar;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSupr_dept_cd(){
		return this.supr_dept_cd;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getHdpt_cd(){
		return this.hdpt_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getUse_yn(){
		return this.use_yn;
	}

	public String getFeat_clsf(){
		return this.feat_clsf;
	}

	public String getStep(){
		return this.step;
	}

	public String getMode_ar(){
		return this.mode_ar;
	}

	public String getDept_cd_ar(){
		return this.dept_cd_ar;
	}

	public String getArea_cd_ar(){
		return this.area_cd_ar;
	}

	public String getArea_nm_ar(){
		return this.area_nm_ar;
	}

	public String getSido_cd_ar(){
		return this.sido_cd_ar;
	}

	public String getChrg_pers_ar(){
		return this.chrg_pers_ar;
	}

	public String getAcct_sido_cd_ar(){
		return this.acct_sido_cd_ar;
	}

	public String getSell_sido_cd_ar(){
		return this.sell_sido_cd_ar;
	}

	public String getSell_srt_col_ar(){
		return this.sell_srt_col_ar;
	}

	public String getUse_yn_ar(){
		return this.use_yn_ar;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_BAS_1030_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BAS_1030_ADM dm = (SE_BAS_1030_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.accflag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.supr_dept_cd);
		cstmt.setString(6, dm.chrg_pers);
		cstmt.setString(7, dm.dept_cd);
		cstmt.setString(8, dm.hdpt_cd);
		cstmt.setString(9, dm.dept_nm);
		cstmt.setString(10, dm.use_yn);
		cstmt.setString(11, dm.feat_clsf);
		cstmt.setString(12, dm.step);
		cstmt.setString(13, dm.mode_ar);
		cstmt.setString(14, dm.dept_cd_ar);
		cstmt.setString(15, dm.area_cd_ar);
		cstmt.setString(16, dm.area_nm_ar);
		cstmt.setString(17, dm.sido_cd_ar);
		cstmt.setString(18, dm.chrg_pers_ar);
		cstmt.setString(19, dm.acct_sido_cd_ar);
		cstmt.setString(20, dm.sell_sido_cd_ar);
		cstmt.setString(21, dm.sell_srt_col_ar);
		cstmt.setString(22, dm.use_yn_ar);
		cstmt.setString(23, dm.incmgpers);
		cstmt.setString(24, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.bas.ds.SE_BAS_1030_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("accflag = [" + getAccflag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("supr_dept_cd = [" + getSupr_dept_cd() + "]");
		System.out.println("chrg_pers = [" + getChrg_pers() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("hdpt_cd = [" + getHdpt_cd() + "]");
		System.out.println("dept_nm = [" + getDept_nm() + "]");
		System.out.println("use_yn = [" + getUse_yn() + "]");
		System.out.println("feat_clsf = [" + getFeat_clsf() + "]");
		System.out.println("step = [" + getStep() + "]");
		System.out.println("mode_ar = [" + getMode_ar() + "]");
		System.out.println("dept_cd_ar = [" + getDept_cd_ar() + "]");
		System.out.println("area_cd_ar = [" + getArea_cd_ar() + "]");
		System.out.println("area_nm_ar = [" + getArea_nm_ar() + "]");
		System.out.println("sido_cd_ar = [" + getSido_cd_ar() + "]");
		System.out.println("chrg_pers_ar = [" + getChrg_pers_ar() + "]");
		System.out.println("acct_sido_cd_ar = [" + getAcct_sido_cd_ar() + "]");
		System.out.println("sell_sido_cd_ar = [" + getSell_sido_cd_ar() + "]");
		System.out.println("sell_srt_col_ar = [" + getSell_srt_col_ar() + "]");
		System.out.println("use_yn_ar = [" + getUse_yn_ar() + "]");
		System.out.println("incmgpers = [" + getIncmgpers() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String supr_dept_cd = req.getParameter("supr_dept_cd");
if( supr_dept_cd == null){
	System.out.println(this.toString+" : supr_dept_cd is null" );
}else{
	System.out.println(this.toString+" : supr_dept_cd is "+supr_dept_cd );
}
String chrg_pers = req.getParameter("chrg_pers");
if( chrg_pers == null){
	System.out.println(this.toString+" : chrg_pers is null" );
}else{
	System.out.println(this.toString+" : chrg_pers is "+chrg_pers );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String hdpt_cd = req.getParameter("hdpt_cd");
if( hdpt_cd == null){
	System.out.println(this.toString+" : hdpt_cd is null" );
}else{
	System.out.println(this.toString+" : hdpt_cd is "+hdpt_cd );
}
String dept_nm = req.getParameter("dept_nm");
if( dept_nm == null){
	System.out.println(this.toString+" : dept_nm is null" );
}else{
	System.out.println(this.toString+" : dept_nm is "+dept_nm );
}
String use_yn = req.getParameter("use_yn");
if( use_yn == null){
	System.out.println(this.toString+" : use_yn is null" );
}else{
	System.out.println(this.toString+" : use_yn is "+use_yn );
}
String feat_clsf = req.getParameter("feat_clsf");
if( feat_clsf == null){
	System.out.println(this.toString+" : feat_clsf is null" );
}else{
	System.out.println(this.toString+" : feat_clsf is "+feat_clsf );
}
String step = req.getParameter("step");
if( step == null){
	System.out.println(this.toString+" : step is null" );
}else{
	System.out.println(this.toString+" : step is "+step );
}
String mode_ar = req.getParameter("mode_ar");
if( mode_ar == null){
	System.out.println(this.toString+" : mode_ar is null" );
}else{
	System.out.println(this.toString+" : mode_ar is "+mode_ar );
}
String dept_cd_ar = req.getParameter("dept_cd_ar");
if( dept_cd_ar == null){
	System.out.println(this.toString+" : dept_cd_ar is null" );
}else{
	System.out.println(this.toString+" : dept_cd_ar is "+dept_cd_ar );
}
String area_cd_ar = req.getParameter("area_cd_ar");
if( area_cd_ar == null){
	System.out.println(this.toString+" : area_cd_ar is null" );
}else{
	System.out.println(this.toString+" : area_cd_ar is "+area_cd_ar );
}
String area_nm_ar = req.getParameter("area_nm_ar");
if( area_nm_ar == null){
	System.out.println(this.toString+" : area_nm_ar is null" );
}else{
	System.out.println(this.toString+" : area_nm_ar is "+area_nm_ar );
}
String sido_cd_ar = req.getParameter("sido_cd_ar");
if( sido_cd_ar == null){
	System.out.println(this.toString+" : sido_cd_ar is null" );
}else{
	System.out.println(this.toString+" : sido_cd_ar is "+sido_cd_ar );
}
String chrg_pers_ar = req.getParameter("chrg_pers_ar");
if( chrg_pers_ar == null){
	System.out.println(this.toString+" : chrg_pers_ar is null" );
}else{
	System.out.println(this.toString+" : chrg_pers_ar is "+chrg_pers_ar );
}
String acct_sido_cd_ar = req.getParameter("acct_sido_cd_ar");
if( acct_sido_cd_ar == null){
	System.out.println(this.toString+" : acct_sido_cd_ar is null" );
}else{
	System.out.println(this.toString+" : acct_sido_cd_ar is "+acct_sido_cd_ar );
}
String sell_sido_cd_ar = req.getParameter("sell_sido_cd_ar");
if( sell_sido_cd_ar == null){
	System.out.println(this.toString+" : sell_sido_cd_ar is null" );
}else{
	System.out.println(this.toString+" : sell_sido_cd_ar is "+sell_sido_cd_ar );
}
String sell_srt_col_ar = req.getParameter("sell_srt_col_ar");
if( sell_srt_col_ar == null){
	System.out.println(this.toString+" : sell_srt_col_ar is null" );
}else{
	System.out.println(this.toString+" : sell_srt_col_ar is "+sell_srt_col_ar );
}
String use_yn_ar = req.getParameter("use_yn_ar");
if( use_yn_ar == null){
	System.out.println(this.toString+" : use_yn_ar is null" );
}else{
	System.out.println(this.toString+" : use_yn_ar is "+use_yn_ar );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
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

String accflag = Util.checkString(req.getParameter("accflag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String supr_dept_cd = Util.checkString(req.getParameter("supr_dept_cd"));
String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String hdpt_cd = Util.checkString(req.getParameter("hdpt_cd"));
String dept_nm = Util.checkString(req.getParameter("dept_nm"));
String use_yn = Util.checkString(req.getParameter("use_yn"));
String feat_clsf = Util.checkString(req.getParameter("feat_clsf"));
String step = Util.checkString(req.getParameter("step"));
String mode_ar = Util.checkString(req.getParameter("mode_ar"));
String dept_cd_ar = Util.checkString(req.getParameter("dept_cd_ar"));
String area_cd_ar = Util.checkString(req.getParameter("area_cd_ar"));
String area_nm_ar = Util.checkString(req.getParameter("area_nm_ar"));
String sido_cd_ar = Util.checkString(req.getParameter("sido_cd_ar"));
String chrg_pers_ar = Util.checkString(req.getParameter("chrg_pers_ar"));
String acct_sido_cd_ar = Util.checkString(req.getParameter("acct_sido_cd_ar"));
String sell_sido_cd_ar = Util.checkString(req.getParameter("sell_sido_cd_ar"));
String sell_srt_col_ar = Util.checkString(req.getParameter("sell_srt_col_ar"));
String use_yn_ar = Util.checkString(req.getParameter("use_yn_ar"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String supr_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("supr_dept_cd")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String hdpt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("hdpt_cd")));
String dept_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_nm")));
String use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("use_yn")));
String feat_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("feat_clsf")));
String step = Util.Uni2Ksc(Util.checkString(req.getParameter("step")));
String mode_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_ar")));
String dept_cd_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd_ar")));
String area_cd_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd_ar")));
String area_nm_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("area_nm_ar")));
String sido_cd_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("sido_cd_ar")));
String chrg_pers_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers_ar")));
String acct_sido_cd_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_sido_cd_ar")));
String sell_sido_cd_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("sell_sido_cd_ar")));
String sell_srt_col_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("sell_srt_col_ar")));
String use_yn_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("use_yn_ar")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAccflag(accflag);
dm.setCmpy_cd(cmpy_cd);
dm.setSupr_dept_cd(supr_dept_cd);
dm.setChrg_pers(chrg_pers);
dm.setDept_cd(dept_cd);
dm.setHdpt_cd(hdpt_cd);
dm.setDept_nm(dept_nm);
dm.setUse_yn(use_yn);
dm.setFeat_clsf(feat_clsf);
dm.setStep(step);
dm.setMode_ar(mode_ar);
dm.setDept_cd_ar(dept_cd_ar);
dm.setArea_cd_ar(area_cd_ar);
dm.setArea_nm_ar(area_nm_ar);
dm.setSido_cd_ar(sido_cd_ar);
dm.setChrg_pers_ar(chrg_pers_ar);
dm.setAcct_sido_cd_ar(acct_sido_cd_ar);
dm.setSell_sido_cd_ar(sell_sido_cd_ar);
dm.setSell_srt_col_ar(sell_srt_col_ar);
dm.setUse_yn_ar(use_yn_ar);
dm.setIncmgpers(incmgpers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Jul 11 15:45:17 KST 2009 */