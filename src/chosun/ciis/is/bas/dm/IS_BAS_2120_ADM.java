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


package chosun.ciis.is.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.bas.ds.*;
import chosun.ciis.is.bas.rec.*;

/**
 * 
 */


public class IS_BAS_2120_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String reg_dt;
	public String reg_seq;
	public String boks_re_resn_clsf;
	public String frdt;
	public String todt;
	public String chrg_pers;
	public String resn;
	public String incmg_pers;
	public String incmg_pers_ip;

	public IS_BAS_2120_ADM(){}
	public IS_BAS_2120_ADM(String cmpy_cd, String mode, String reg_dt, String reg_seq, String boks_re_resn_clsf, String frdt, String todt, String chrg_pers, String resn, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.reg_dt = reg_dt;
		this.reg_seq = reg_seq;
		this.boks_re_resn_clsf = boks_re_resn_clsf;
		this.frdt = frdt;
		this.todt = todt;
		this.chrg_pers = chrg_pers;
		this.resn = resn;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setReg_dt(String reg_dt){
		this.reg_dt = reg_dt;
	}

	public void setReg_seq(String reg_seq){
		this.reg_seq = reg_seq;
	}

	public void setBoks_re_resn_clsf(String boks_re_resn_clsf){
		this.boks_re_resn_clsf = boks_re_resn_clsf;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setResn(String resn){
		this.resn = resn;
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

	public String getMode(){
		return this.mode;
	}

	public String getReg_dt(){
		return this.reg_dt;
	}

	public String getReg_seq(){
		return this.reg_seq;
	}

	public String getBoks_re_resn_clsf(){
		return this.boks_re_resn_clsf;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getResn(){
		return this.resn;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_BAS_2120_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_BAS_2120_ADM dm = (IS_BAS_2120_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.reg_dt);
		cstmt.setString(6, dm.reg_seq);
		cstmt.setString(7, dm.boks_re_resn_clsf);
		cstmt.setString(8, dm.frdt);
		cstmt.setString(9, dm.todt);
		cstmt.setString(10, dm.chrg_pers);
		cstmt.setString(11, dm.resn);
		cstmt.setString(12, dm.incmg_pers);
		cstmt.setString(13, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.bas.ds.IS_BAS_2120_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("reg_dt = [" + getReg_dt() + "]");
		System.out.println("reg_seq = [" + getReg_seq() + "]");
		System.out.println("boks_re_resn_clsf = [" + getBoks_re_resn_clsf() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("chrg_pers = [" + getChrg_pers() + "]");
		System.out.println("resn = [" + getResn() + "]");
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String reg_dt = req.getParameter("reg_dt");
if( reg_dt == null){
	System.out.println(this.toString+" : reg_dt is null" );
}else{
	System.out.println(this.toString+" : reg_dt is "+reg_dt );
}
String reg_seq = req.getParameter("reg_seq");
if( reg_seq == null){
	System.out.println(this.toString+" : reg_seq is null" );
}else{
	System.out.println(this.toString+" : reg_seq is "+reg_seq );
}
String boks_re_resn_clsf = req.getParameter("boks_re_resn_clsf");
if( boks_re_resn_clsf == null){
	System.out.println(this.toString+" : boks_re_resn_clsf is null" );
}else{
	System.out.println(this.toString+" : boks_re_resn_clsf is "+boks_re_resn_clsf );
}
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String chrg_pers = req.getParameter("chrg_pers");
if( chrg_pers == null){
	System.out.println(this.toString+" : chrg_pers is null" );
}else{
	System.out.println(this.toString+" : chrg_pers is "+chrg_pers );
}
String resn = req.getParameter("resn");
if( resn == null){
	System.out.println(this.toString+" : resn is null" );
}else{
	System.out.println(this.toString+" : resn is "+resn );
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
String mode = Util.checkString(req.getParameter("mode"));
String reg_dt = Util.checkString(req.getParameter("reg_dt"));
String reg_seq = Util.checkString(req.getParameter("reg_seq"));
String boks_re_resn_clsf = Util.checkString(req.getParameter("boks_re_resn_clsf"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
String resn = Util.checkString(req.getParameter("resn"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String reg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_dt")));
String reg_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_seq")));
String boks_re_resn_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("boks_re_resn_clsf")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
String resn = Util.Uni2Ksc(Util.checkString(req.getParameter("resn")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setReg_dt(reg_dt);
dm.setReg_seq(reg_seq);
dm.setBoks_re_resn_clsf(boks_re_resn_clsf);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setChrg_pers(chrg_pers);
dm.setResn(resn);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 25 17:21:31 KST 2012 */