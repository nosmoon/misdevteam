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


package chosun.ciis.pr.papmake.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.sendmg.ds.*;
import chosun.ciis.pr.sendmg.rec.*;

/**
 * 
 */


public class PR_PAPMAKE_1020_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String gubun;
	public String cmpy_cd;
	public String duty_dt;
	public String fac_clsf;
	public String sub_seq;
	public String prt_clsf;
	public String mesr_plac_clsf;
	public String tmpt;
	public String hmdt;
	public String cnfm_tm;
	public String incmg_pers_ipaddr;
	public String incmg_pers;

	public PR_PAPMAKE_1020_ADM(){}
	public PR_PAPMAKE_1020_ADM(String gubun, String cmpy_cd, String duty_dt, String fac_clsf, String sub_seq, String prt_clsf, String mesr_plac_clsf, String tmpt, String hmdt, String cnfm_tm, String incmg_pers_ipaddr, String incmg_pers){
		this.gubun = gubun;
		this.cmpy_cd = cmpy_cd;
		this.duty_dt = duty_dt;
		this.fac_clsf = fac_clsf;
		this.sub_seq = sub_seq;
		this.prt_clsf = prt_clsf;
		this.mesr_plac_clsf = mesr_plac_clsf;
		this.tmpt = tmpt;
		this.hmdt = hmdt;
		this.cnfm_tm = cnfm_tm;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDuty_dt(String duty_dt){
		this.duty_dt = duty_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public void setPrt_clsf(String prt_clsf){
		this.prt_clsf = prt_clsf;
	}

	public void setMesr_plac_clsf(String mesr_plac_clsf){
		this.mesr_plac_clsf = mesr_plac_clsf;
	}

	public void setTmpt(String tmpt){
		this.tmpt = tmpt;
	}

	public void setHmdt(String hmdt){
		this.hmdt = hmdt;
	}

	public void setCnfm_tm(String cnfm_tm){
		this.cnfm_tm = cnfm_tm;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDuty_dt(){
		return this.duty_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getSub_seq(){
		return this.sub_seq;
	}

	public String getPrt_clsf(){
		return this.prt_clsf;
	}

	public String getMesr_plac_clsf(){
		return this.mesr_plac_clsf;
	}

	public String getTmpt(){
		return this.tmpt;
	}

	public String getHmdt(){
		return this.hmdt;
	}

	public String getCnfm_tm(){
		return this.cnfm_tm;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_PR_PAPMAKE_1020_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_PAPMAKE_1020_ADM dm = (PR_PAPMAKE_1020_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.gubun);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.duty_dt);
		cstmt.setString(6, dm.fac_clsf);
		cstmt.setString(7, dm.sub_seq);
		cstmt.setString(8, dm.prt_clsf);
		cstmt.setString(9, dm.mesr_plac_clsf);
		cstmt.setString(10, dm.tmpt);
		cstmt.setString(11, dm.hmdt);
		cstmt.setString(12, dm.cnfm_tm);
		cstmt.setString(13, dm.incmg_pers_ipaddr);
		cstmt.setString(14, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.papmake.ds.PR_PAPMAKE_1020_ADataSet();
	}



    public void print(){
        System.out.println("gubun = " + getGubun());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("duty_dt = " + getDuty_dt());
        System.out.println("fac_clsf = " + getFac_clsf());
        System.out.println("sub_seq = " + getSub_seq());
        System.out.println("prt_clsf = " + getPrt_clsf());
        System.out.println("mesr_plac_clsf = " + getMesr_plac_clsf());
        System.out.println("tmpt = " + getTmpt());
        System.out.println("hmdt = " + getHmdt());
        System.out.println("cnfm_tm = " + getCnfm_tm());
        System.out.println("incmg_pers_ipaddr = " + getIncmg_pers_ipaddr());
        System.out.println("incmg_pers = " + getIncmg_pers());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String duty_dt = req.getParameter("duty_dt");
if( duty_dt == null){
	System.out.println(this.toString+" : duty_dt is null" );
}else{
	System.out.println(this.toString+" : duty_dt is "+duty_dt );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String sub_seq = req.getParameter("sub_seq");
if( sub_seq == null){
	System.out.println(this.toString+" : sub_seq is null" );
}else{
	System.out.println(this.toString+" : sub_seq is "+sub_seq );
}
String prt_clsf = req.getParameter("prt_clsf");
if( prt_clsf == null){
	System.out.println(this.toString+" : prt_clsf is null" );
}else{
	System.out.println(this.toString+" : prt_clsf is "+prt_clsf );
}
String mesr_plac_clsf = req.getParameter("mesr_plac_clsf");
if( mesr_plac_clsf == null){
	System.out.println(this.toString+" : mesr_plac_clsf is null" );
}else{
	System.out.println(this.toString+" : mesr_plac_clsf is "+mesr_plac_clsf );
}
String tmpt = req.getParameter("tmpt");
if( tmpt == null){
	System.out.println(this.toString+" : tmpt is null" );
}else{
	System.out.println(this.toString+" : tmpt is "+tmpt );
}
String hmdt = req.getParameter("hmdt");
if( hmdt == null){
	System.out.println(this.toString+" : hmdt is null" );
}else{
	System.out.println(this.toString+" : hmdt is "+hmdt );
}
String cnfm_tm = req.getParameter("cnfm_tm");
if( cnfm_tm == null){
	System.out.println(this.toString+" : cnfm_tm is null" );
}else{
	System.out.println(this.toString+" : cnfm_tm is "+cnfm_tm );
}
String incmg_pers_ipaddr = req.getParameter("incmg_pers_ipaddr");
if( incmg_pers_ipaddr == null){
	System.out.println(this.toString+" : incmg_pers_ipaddr is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipaddr is "+incmg_pers_ipaddr );
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

String gubun = Util.checkString(req.getParameter("gubun"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String duty_dt = Util.checkString(req.getParameter("duty_dt"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String sub_seq = Util.checkString(req.getParameter("sub_seq"));
String prt_clsf = Util.checkString(req.getParameter("prt_clsf"));
String mesr_plac_clsf = Util.checkString(req.getParameter("mesr_plac_clsf"));
String tmpt = Util.checkString(req.getParameter("tmpt"));
String hmdt = Util.checkString(req.getParameter("hmdt"));
String cnfm_tm = Util.checkString(req.getParameter("cnfm_tm"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String duty_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_dt")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_seq")));
String prt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_clsf")));
String mesr_plac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("mesr_plac_clsf")));
String tmpt = Util.Uni2Ksc(Util.checkString(req.getParameter("tmpt")));
String hmdt = Util.Uni2Ksc(Util.checkString(req.getParameter("hmdt")));
String cnfm_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("cnfm_tm")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setGubun(gubun);
dm.setCmpy_cd(cmpy_cd);
dm.setDuty_dt(duty_dt);
dm.setFac_clsf(fac_clsf);
dm.setSub_seq(sub_seq);
dm.setPrt_clsf(prt_clsf);
dm.setMesr_plac_clsf(mesr_plac_clsf);
dm.setTmpt(tmpt);
dm.setHmdt(hmdt);
dm.setCnfm_tm(cnfm_tm);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 18 22:25:09 KST 2009 */