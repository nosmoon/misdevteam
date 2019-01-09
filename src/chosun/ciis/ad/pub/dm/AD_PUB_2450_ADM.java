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


package chosun.ciis.ad.pub.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.pub.ds.*;
import chosun.ciis.ad.pub.rec.*;

/**
 * 
 */


public class AD_PUB_2450_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String medi_cd;
	public String pubc_occr_dt;
	public String pubc_occr_seq;
	public String evnt_seq;
	public String evnt_cd;
	public String remk;
	public String spn_clsf;
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_PUB_2450_ADM(){}
	public AD_PUB_2450_ADM(String mode, String cmpy_cd, String medi_cd, String pubc_occr_dt, String pubc_occr_seq, String evnt_seq, String evnt_cd, String remk, String spn_clsf, String incmg_pers_ip, String incmg_pers){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.medi_cd = medi_cd;
		this.pubc_occr_dt = pubc_occr_dt;
		this.pubc_occr_seq = pubc_occr_seq;
		this.evnt_seq = evnt_seq;
		this.evnt_cd = evnt_cd;
		this.remk = remk;
		this.spn_clsf = spn_clsf;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setPubc_occr_dt(String pubc_occr_dt){
		this.pubc_occr_dt = pubc_occr_dt;
	}

	public void setPubc_occr_seq(String pubc_occr_seq){
		this.pubc_occr_seq = pubc_occr_seq;
	}

	public void setEvnt_seq(String evnt_seq){
		this.evnt_seq = evnt_seq;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setSpn_clsf(String spn_clsf){
		this.spn_clsf = spn_clsf;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getPubc_occr_dt(){
		return this.pubc_occr_dt;
	}

	public String getPubc_occr_seq(){
		return this.pubc_occr_seq;
	}

	public String getEvnt_seq(){
		return this.evnt_seq;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSpn_clsf(){
		return this.spn_clsf;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_PUB_2450_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_PUB_2450_ADM dm = (AD_PUB_2450_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.medi_cd);
		cstmt.setString(6, dm.pubc_occr_dt);
		cstmt.setString(7, dm.pubc_occr_seq);
		cstmt.setString(8, dm.evnt_seq);
		cstmt.setString(9, dm.evnt_cd);
		cstmt.setString(10, dm.remk);
		cstmt.setString(11, dm.spn_clsf);
		cstmt.setString(12, dm.incmg_pers_ip);
		cstmt.setString(13, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.pub.ds.AD_PUB_2450_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("pubc_occr_dt = [" + getPubc_occr_dt() + "]");
		System.out.println("pubc_occr_seq = [" + getPubc_occr_seq() + "]");
		System.out.println("evnt_seq = [" + getEvnt_seq() + "]");
		System.out.println("evnt_cd = [" + getEvnt_cd() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("spn_clsf = [" + getSpn_clsf() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String pubc_occr_dt = req.getParameter("pubc_occr_dt");
if( pubc_occr_dt == null){
	System.out.println(this.toString+" : pubc_occr_dt is null" );
}else{
	System.out.println(this.toString+" : pubc_occr_dt is "+pubc_occr_dt );
}
String pubc_occr_seq = req.getParameter("pubc_occr_seq");
if( pubc_occr_seq == null){
	System.out.println(this.toString+" : pubc_occr_seq is null" );
}else{
	System.out.println(this.toString+" : pubc_occr_seq is "+pubc_occr_seq );
}
String evnt_seq = req.getParameter("evnt_seq");
if( evnt_seq == null){
	System.out.println(this.toString+" : evnt_seq is null" );
}else{
	System.out.println(this.toString+" : evnt_seq is "+evnt_seq );
}
String evnt_cd = req.getParameter("evnt_cd");
if( evnt_cd == null){
	System.out.println(this.toString+" : evnt_cd is null" );
}else{
	System.out.println(this.toString+" : evnt_cd is "+evnt_cd );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String spn_clsf = req.getParameter("spn_clsf");
if( spn_clsf == null){
	System.out.println(this.toString+" : spn_clsf is null" );
}else{
	System.out.println(this.toString+" : spn_clsf is "+spn_clsf );
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

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String pubc_occr_dt = Util.checkString(req.getParameter("pubc_occr_dt"));
String pubc_occr_seq = Util.checkString(req.getParameter("pubc_occr_seq"));
String evnt_seq = Util.checkString(req.getParameter("evnt_seq"));
String evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
String remk = Util.checkString(req.getParameter("remk"));
String spn_clsf = Util.checkString(req.getParameter("spn_clsf"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String pubc_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_occr_dt")));
String pubc_occr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_occr_seq")));
String evnt_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_seq")));
String evnt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String spn_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("spn_clsf")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setMedi_cd(medi_cd);
dm.setPubc_occr_dt(pubc_occr_dt);
dm.setPubc_occr_seq(pubc_occr_seq);
dm.setEvnt_seq(evnt_seq);
dm.setEvnt_cd(evnt_cd);
dm.setRemk(remk);
dm.setSpn_clsf(spn_clsf);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 10 17:33:03 KST 2017 */