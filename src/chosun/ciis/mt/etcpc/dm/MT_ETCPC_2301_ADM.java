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


package chosun.ciis.mt.etcpc.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etcpc.ds.*;
import chosun.ciis.mt.etcpc.rec.*;

/**
 * 
 */


public class MT_ETCPC_2301_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mchn_mang_no;
	public String seq;
	public String swlics_no;
	public String swnm;
	public String swver;
	public String swestb_dt;
	public String swclsf;
	public String remk;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String gubun;

	public MT_ETCPC_2301_ADM(){}
	public MT_ETCPC_2301_ADM(String cmpy_cd, String mchn_mang_no, String seq, String swlics_no, String swnm, String swver, String swestb_dt, String swclsf, String remk, String incmg_pers_ipaddr, String incmg_pers, String gubun){
		this.cmpy_cd = cmpy_cd;
		this.mchn_mang_no = mchn_mang_no;
		this.seq = seq;
		this.swlics_no = swlics_no;
		this.swnm = swnm;
		this.swver = swver;
		this.swestb_dt = swestb_dt;
		this.swclsf = swclsf;
		this.remk = remk;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.gubun = gubun;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMchn_mang_no(String mchn_mang_no){
		this.mchn_mang_no = mchn_mang_no;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSwlics_no(String swlics_no){
		this.swlics_no = swlics_no;
	}

	public void setSwnm(String swnm){
		this.swnm = swnm;
	}

	public void setSwver(String swver){
		this.swver = swver;
	}

	public void setSwestb_dt(String swestb_dt){
		this.swestb_dt = swestb_dt;
	}

	public void setSwclsf(String swclsf){
		this.swclsf = swclsf;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMchn_mang_no(){
		return this.mchn_mang_no;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSwlics_no(){
		return this.swlics_no;
	}

	public String getSwnm(){
		return this.swnm;
	}

	public String getSwver(){
		return this.swver;
	}

	public String getSwestb_dt(){
		return this.swestb_dt;
	}

	public String getSwclsf(){
		return this.swclsf;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCPC_2301_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCPC_2301_ADM dm = (MT_ETCPC_2301_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mchn_mang_no);
		cstmt.setString(5, dm.seq);
		cstmt.setString(6, dm.swlics_no);
		cstmt.setString(7, dm.swnm);
		cstmt.setString(8, dm.swver);
		cstmt.setString(9, dm.swestb_dt);
		cstmt.setString(10, dm.swclsf);
		cstmt.setString(11, dm.remk);
		cstmt.setString(12, dm.incmg_pers_ipaddr);
		cstmt.setString(13, dm.incmg_pers);
		cstmt.setString(14, dm.gubun);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etcpc.ds.MT_ETCPC_2301_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mchn_mang_no = [" + getMchn_mang_no() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("swlics_no = [" + getSwlics_no() + "]");
		System.out.println("swnm = [" + getSwnm() + "]");
		System.out.println("swver = [" + getSwver() + "]");
		System.out.println("swestb_dt = [" + getSwestb_dt() + "]");
		System.out.println("swclsf = [" + getSwclsf() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("gubun = [" + getGubun() + "]");
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
String mchn_mang_no = req.getParameter("mchn_mang_no");
if( mchn_mang_no == null){
	System.out.println(this.toString+" : mchn_mang_no is null" );
}else{
	System.out.println(this.toString+" : mchn_mang_no is "+mchn_mang_no );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String swlics_no = req.getParameter("swlics_no");
if( swlics_no == null){
	System.out.println(this.toString+" : swlics_no is null" );
}else{
	System.out.println(this.toString+" : swlics_no is "+swlics_no );
}
String swnm = req.getParameter("swnm");
if( swnm == null){
	System.out.println(this.toString+" : swnm is null" );
}else{
	System.out.println(this.toString+" : swnm is "+swnm );
}
String swver = req.getParameter("swver");
if( swver == null){
	System.out.println(this.toString+" : swver is null" );
}else{
	System.out.println(this.toString+" : swver is "+swver );
}
String swestb_dt = req.getParameter("swestb_dt");
if( swestb_dt == null){
	System.out.println(this.toString+" : swestb_dt is null" );
}else{
	System.out.println(this.toString+" : swestb_dt is "+swestb_dt );
}
String swclsf = req.getParameter("swclsf");
if( swclsf == null){
	System.out.println(this.toString+" : swclsf is null" );
}else{
	System.out.println(this.toString+" : swclsf is "+swclsf );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
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
String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mchn_mang_no = Util.checkString(req.getParameter("mchn_mang_no"));
String seq = Util.checkString(req.getParameter("seq"));
String swlics_no = Util.checkString(req.getParameter("swlics_no"));
String swnm = Util.checkString(req.getParameter("swnm"));
String swver = Util.checkString(req.getParameter("swver"));
String swestb_dt = Util.checkString(req.getParameter("swestb_dt"));
String swclsf = Util.checkString(req.getParameter("swclsf"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String gubun = Util.checkString(req.getParameter("gubun"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mchn_mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("mchn_mang_no")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String swlics_no = Util.Uni2Ksc(Util.checkString(req.getParameter("swlics_no")));
String swnm = Util.Uni2Ksc(Util.checkString(req.getParameter("swnm")));
String swver = Util.Uni2Ksc(Util.checkString(req.getParameter("swver")));
String swestb_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("swestb_dt")));
String swclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("swclsf")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMchn_mang_no(mchn_mang_no);
dm.setSeq(seq);
dm.setSwlics_no(swlics_no);
dm.setSwnm(swnm);
dm.setSwver(swver);
dm.setSwestb_dt(swestb_dt);
dm.setSwclsf(swclsf);
dm.setRemk(remk);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setGubun(gubun);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 07 13:57:52 KST 2009 */