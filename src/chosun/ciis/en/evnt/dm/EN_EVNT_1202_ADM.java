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


package chosun.ciis.en.evnt.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.en.evnt.ds.*;
import chosun.ciis.en.evnt.rec.*;

/**
 * 
 */


public class EN_EVNT_1202_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String evnt_yy;
	public String evnt_cd;
	public String evnt_seq;
	public String evnt_rcpm_unit_clsf;
	public String vitl_acct_no_bgn;
	public String vitl_acct_no_end;
	public String use_end_yn;
	public String remk;
	public String incmg_pers_ip;
	public String incmg_pers;
	public String chg_pers;

	public EN_EVNT_1202_ADM(){}
	public EN_EVNT_1202_ADM(String mode, String cmpy_cd, String evnt_yy, String evnt_cd, String evnt_seq, String evnt_rcpm_unit_clsf, String vitl_acct_no_bgn, String vitl_acct_no_end, String use_end_yn, String remk, String incmg_pers_ip, String incmg_pers, String chg_pers){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.evnt_yy = evnt_yy;
		this.evnt_cd = evnt_cd;
		this.evnt_seq = evnt_seq;
		this.evnt_rcpm_unit_clsf = evnt_rcpm_unit_clsf;
		this.vitl_acct_no_bgn = vitl_acct_no_bgn;
		this.vitl_acct_no_end = vitl_acct_no_end;
		this.use_end_yn = use_end_yn;
		this.remk = remk;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEvnt_yy(String evnt_yy){
		this.evnt_yy = evnt_yy;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setEvnt_seq(String evnt_seq){
		this.evnt_seq = evnt_seq;
	}

	public void setEvnt_rcpm_unit_clsf(String evnt_rcpm_unit_clsf){
		this.evnt_rcpm_unit_clsf = evnt_rcpm_unit_clsf;
	}

	public void setVitl_acct_no_bgn(String vitl_acct_no_bgn){
		this.vitl_acct_no_bgn = vitl_acct_no_bgn;
	}

	public void setVitl_acct_no_end(String vitl_acct_no_end){
		this.vitl_acct_no_end = vitl_acct_no_end;
	}

	public void setUse_end_yn(String use_end_yn){
		this.use_end_yn = use_end_yn;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEvnt_yy(){
		return this.evnt_yy;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getEvnt_seq(){
		return this.evnt_seq;
	}

	public String getEvnt_rcpm_unit_clsf(){
		return this.evnt_rcpm_unit_clsf;
	}

	public String getVitl_acct_no_bgn(){
		return this.vitl_acct_no_bgn;
	}

	public String getVitl_acct_no_end(){
		return this.vitl_acct_no_end;
	}

	public String getUse_end_yn(){
		return this.use_end_yn;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getSQL(){
		 return "{ call MISENP.SP_EN_EVNT_1202_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		EN_EVNT_1202_ADM dm = (EN_EVNT_1202_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.evnt_yy);
		cstmt.setString(6, dm.evnt_cd);
		cstmt.setString(7, dm.evnt_seq);
		cstmt.setString(8, dm.evnt_rcpm_unit_clsf);
		cstmt.setString(9, dm.vitl_acct_no_bgn);
		cstmt.setString(10, dm.vitl_acct_no_end);
		cstmt.setString(11, dm.use_end_yn);
		cstmt.setString(12, dm.remk);
		cstmt.setString(13, dm.incmg_pers_ip);
		cstmt.setString(14, dm.incmg_pers);
		cstmt.setString(15, dm.chg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.en.evnt.ds.EN_EVNT_1202_ADataSet();
	}



    public void print(){
        System.out.println("mode = " + getMode());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("evnt_yy = " + getEvnt_yy());
        System.out.println("evnt_cd = " + getEvnt_cd());
        System.out.println("evnt_seq = " + getEvnt_seq());
        System.out.println("evnt_rcpm_unit_clsf = " + getEvnt_rcpm_unit_clsf());
        System.out.println("vitl_acct_no_bgn = " + getVitl_acct_no_bgn());
        System.out.println("vitl_acct_no_end = " + getVitl_acct_no_end());
        System.out.println("use_end_yn = " + getUse_end_yn());
        System.out.println("remk = " + getRemk());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("chg_pers = " + getChg_pers());
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
String evnt_yy = req.getParameter("evnt_yy");
if( evnt_yy == null){
	System.out.println(this.toString+" : evnt_yy is null" );
}else{
	System.out.println(this.toString+" : evnt_yy is "+evnt_yy );
}
String evnt_cd = req.getParameter("evnt_cd");
if( evnt_cd == null){
	System.out.println(this.toString+" : evnt_cd is null" );
}else{
	System.out.println(this.toString+" : evnt_cd is "+evnt_cd );
}
String evnt_seq = req.getParameter("evnt_seq");
if( evnt_seq == null){
	System.out.println(this.toString+" : evnt_seq is null" );
}else{
	System.out.println(this.toString+" : evnt_seq is "+evnt_seq );
}
String evnt_rcpm_unit_clsf = req.getParameter("evnt_rcpm_unit_clsf");
if( evnt_rcpm_unit_clsf == null){
	System.out.println(this.toString+" : evnt_rcpm_unit_clsf is null" );
}else{
	System.out.println(this.toString+" : evnt_rcpm_unit_clsf is "+evnt_rcpm_unit_clsf );
}
String vitl_acct_no_bgn = req.getParameter("vitl_acct_no_bgn");
if( vitl_acct_no_bgn == null){
	System.out.println(this.toString+" : vitl_acct_no_bgn is null" );
}else{
	System.out.println(this.toString+" : vitl_acct_no_bgn is "+vitl_acct_no_bgn );
}
String vitl_acct_no_end = req.getParameter("vitl_acct_no_end");
if( vitl_acct_no_end == null){
	System.out.println(this.toString+" : vitl_acct_no_end is null" );
}else{
	System.out.println(this.toString+" : vitl_acct_no_end is "+vitl_acct_no_end );
}
String use_end_yn = req.getParameter("use_end_yn");
if( use_end_yn == null){
	System.out.println(this.toString+" : use_end_yn is null" );
}else{
	System.out.println(this.toString+" : use_end_yn is "+use_end_yn );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
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
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
String evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
String evnt_seq = Util.checkString(req.getParameter("evnt_seq"));
String evnt_rcpm_unit_clsf = Util.checkString(req.getParameter("evnt_rcpm_unit_clsf"));
String vitl_acct_no_bgn = Util.checkString(req.getParameter("vitl_acct_no_bgn"));
String vitl_acct_no_end = Util.checkString(req.getParameter("vitl_acct_no_end"));
String use_end_yn = Util.checkString(req.getParameter("use_end_yn"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String evnt_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_yy")));
String evnt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd")));
String evnt_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_seq")));
String evnt_rcpm_unit_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_rcpm_unit_clsf")));
String vitl_acct_no_bgn = Util.Uni2Ksc(Util.checkString(req.getParameter("vitl_acct_no_bgn")));
String vitl_acct_no_end = Util.Uni2Ksc(Util.checkString(req.getParameter("vitl_acct_no_end")));
String use_end_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("use_end_yn")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEvnt_yy(evnt_yy);
dm.setEvnt_cd(evnt_cd);
dm.setEvnt_seq(evnt_seq);
dm.setEvnt_rcpm_unit_clsf(evnt_rcpm_unit_clsf);
dm.setVitl_acct_no_bgn(vitl_acct_no_bgn);
dm.setVitl_acct_no_end(vitl_acct_no_end);
dm.setUse_end_yn(use_end_yn);
dm.setRemk(remk);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 12 14:20:00 KST 2009 */