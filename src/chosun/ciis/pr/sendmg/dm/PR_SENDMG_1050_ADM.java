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


package chosun.ciis.pr.sendmg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.sendmg.ds.*;
import chosun.ciis.pr.sendmg.rec.*;

/**
 * 
 */


public class PR_SENDMG_1050_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String issu_dt;
	public String nwsp_type;
	public String fac;
	public String ecnt;
	public String off_plat_basi_tm;
	public String trsm_end_basi_tm;
	public String sect;
	public String last_edt_page;
	public String off_plat_tm;
	public String off_plat_end_tm;
	public String re_off_plat_clr;
	public String re_off_plat_bw;
	public String re_re_off_plat_clr;
	public String re_re_off_plat_bw;
	public String incmg_pers_ipaddr;
	public String incmg_pers;

	public PR_SENDMG_1050_ADM(){}
	public PR_SENDMG_1050_ADM(String cmpy_cd, String issu_dt, String nwsp_type, String fac, String ecnt, String off_plat_basi_tm, String trsm_end_basi_tm, String sect, String last_edt_page, String off_plat_tm, String off_plat_end_tm, String re_off_plat_clr, String re_off_plat_bw, String re_re_off_plat_clr, String re_re_off_plat_bw, String incmg_pers_ipaddr, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.issu_dt = issu_dt;
		this.nwsp_type = nwsp_type;
		this.fac = fac;
		this.ecnt = ecnt;
		this.off_plat_basi_tm = off_plat_basi_tm;
		this.trsm_end_basi_tm = trsm_end_basi_tm;
		this.sect = sect;
		this.last_edt_page = last_edt_page;
		this.off_plat_tm = off_plat_tm;
		this.off_plat_end_tm = off_plat_end_tm;
		this.re_off_plat_clr = re_off_plat_clr;
		this.re_off_plat_bw = re_off_plat_bw;
		this.re_re_off_plat_clr = re_re_off_plat_clr;
		this.re_re_off_plat_bw = re_re_off_plat_bw;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setNwsp_type(String nwsp_type){
		this.nwsp_type = nwsp_type;
	}

	public void setFac(String fac){
		this.fac = fac;
	}

	public void setEcnt(String ecnt){
		this.ecnt = ecnt;
	}

	public void setOff_plat_basi_tm(String off_plat_basi_tm){
		this.off_plat_basi_tm = off_plat_basi_tm;
	}

	public void setTrsm_end_basi_tm(String trsm_end_basi_tm){
		this.trsm_end_basi_tm = trsm_end_basi_tm;
	}

	public void setSect(String sect){
		this.sect = sect;
	}

	public void setLast_edt_page(String last_edt_page){
		this.last_edt_page = last_edt_page;
	}

	public void setOff_plat_tm(String off_plat_tm){
		this.off_plat_tm = off_plat_tm;
	}

	public void setOff_plat_end_tm(String off_plat_end_tm){
		this.off_plat_end_tm = off_plat_end_tm;
	}

	public void setRe_off_plat_clr(String re_off_plat_clr){
		this.re_off_plat_clr = re_off_plat_clr;
	}

	public void setRe_off_plat_bw(String re_off_plat_bw){
		this.re_off_plat_bw = re_off_plat_bw;
	}

	public void setRe_re_off_plat_clr(String re_re_off_plat_clr){
		this.re_re_off_plat_clr = re_re_off_plat_clr;
	}

	public void setRe_re_off_plat_bw(String re_re_off_plat_bw){
		this.re_re_off_plat_bw = re_re_off_plat_bw;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getNwsp_type(){
		return this.nwsp_type;
	}

	public String getFac(){
		return this.fac;
	}

	public String getEcnt(){
		return this.ecnt;
	}

	public String getOff_plat_basi_tm(){
		return this.off_plat_basi_tm;
	}

	public String getTrsm_end_basi_tm(){
		return this.trsm_end_basi_tm;
	}

	public String getSect(){
		return this.sect;
	}

	public String getLast_edt_page(){
		return this.last_edt_page;
	}

	public String getOff_plat_tm(){
		return this.off_plat_tm;
	}

	public String getOff_plat_end_tm(){
		return this.off_plat_end_tm;
	}

	public String getRe_off_plat_clr(){
		return this.re_off_plat_clr;
	}

	public String getRe_off_plat_bw(){
		return this.re_off_plat_bw;
	}

	public String getRe_re_off_plat_clr(){
		return this.re_re_off_plat_clr;
	}

	public String getRe_re_off_plat_bw(){
		return this.re_re_off_plat_bw;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_PR_SENDMG_1050_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_SENDMG_1050_ADM dm = (PR_SENDMG_1050_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.issu_dt);
		cstmt.setString(5, dm.nwsp_type);
		cstmt.setString(6, dm.fac);
		cstmt.setString(7, dm.ecnt);
		cstmt.setString(8, dm.off_plat_basi_tm);
		cstmt.setString(9, dm.trsm_end_basi_tm);
		cstmt.setString(10, dm.sect);
		cstmt.setString(11, dm.last_edt_page);
		cstmt.setString(12, dm.off_plat_tm);
		cstmt.setString(13, dm.off_plat_end_tm);
		cstmt.setString(14, dm.re_off_plat_clr);
		cstmt.setString(15, dm.re_off_plat_bw);
		cstmt.setString(16, dm.re_re_off_plat_clr);
		cstmt.setString(17, dm.re_re_off_plat_bw);
		cstmt.setString(18, dm.incmg_pers_ipaddr);
		cstmt.setString(19, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.sendmg.ds.PR_SENDMG_1050_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("issu_dt = [" + getIssu_dt() + "]");
		System.out.println("nwsp_type = [" + getNwsp_type() + "]");
		System.out.println("fac = [" + getFac() + "]");
		System.out.println("ecnt = [" + getEcnt() + "]");
		System.out.println("off_plat_basi_tm = [" + getOff_plat_basi_tm() + "]");
		System.out.println("trsm_end_basi_tm = [" + getTrsm_end_basi_tm() + "]");
		System.out.println("sect = [" + getSect() + "]");
		System.out.println("last_edt_page = [" + getLast_edt_page() + "]");
		System.out.println("off_plat_tm = [" + getOff_plat_tm() + "]");
		System.out.println("off_plat_end_tm = [" + getOff_plat_end_tm() + "]");
		System.out.println("re_off_plat_clr = [" + getRe_off_plat_clr() + "]");
		System.out.println("re_off_plat_bw = [" + getRe_off_plat_bw() + "]");
		System.out.println("re_re_off_plat_clr = [" + getRe_re_off_plat_clr() + "]");
		System.out.println("re_re_off_plat_bw = [" + getRe_re_off_plat_bw() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
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
String issu_dt = req.getParameter("issu_dt");
if( issu_dt == null){
	System.out.println(this.toString+" : issu_dt is null" );
}else{
	System.out.println(this.toString+" : issu_dt is "+issu_dt );
}
String nwsp_type = req.getParameter("nwsp_type");
if( nwsp_type == null){
	System.out.println(this.toString+" : nwsp_type is null" );
}else{
	System.out.println(this.toString+" : nwsp_type is "+nwsp_type );
}
String fac = req.getParameter("fac");
if( fac == null){
	System.out.println(this.toString+" : fac is null" );
}else{
	System.out.println(this.toString+" : fac is "+fac );
}
String ecnt = req.getParameter("ecnt");
if( ecnt == null){
	System.out.println(this.toString+" : ecnt is null" );
}else{
	System.out.println(this.toString+" : ecnt is "+ecnt );
}
String off_plat_basi_tm = req.getParameter("off_plat_basi_tm");
if( off_plat_basi_tm == null){
	System.out.println(this.toString+" : off_plat_basi_tm is null" );
}else{
	System.out.println(this.toString+" : off_plat_basi_tm is "+off_plat_basi_tm );
}
String trsm_end_basi_tm = req.getParameter("trsm_end_basi_tm");
if( trsm_end_basi_tm == null){
	System.out.println(this.toString+" : trsm_end_basi_tm is null" );
}else{
	System.out.println(this.toString+" : trsm_end_basi_tm is "+trsm_end_basi_tm );
}
String sect = req.getParameter("sect");
if( sect == null){
	System.out.println(this.toString+" : sect is null" );
}else{
	System.out.println(this.toString+" : sect is "+sect );
}
String last_edt_page = req.getParameter("last_edt_page");
if( last_edt_page == null){
	System.out.println(this.toString+" : last_edt_page is null" );
}else{
	System.out.println(this.toString+" : last_edt_page is "+last_edt_page );
}
String off_plat_tm = req.getParameter("off_plat_tm");
if( off_plat_tm == null){
	System.out.println(this.toString+" : off_plat_tm is null" );
}else{
	System.out.println(this.toString+" : off_plat_tm is "+off_plat_tm );
}
String off_plat_end_tm = req.getParameter("off_plat_end_tm");
if( off_plat_end_tm == null){
	System.out.println(this.toString+" : off_plat_end_tm is null" );
}else{
	System.out.println(this.toString+" : off_plat_end_tm is "+off_plat_end_tm );
}
String re_off_plat_clr = req.getParameter("re_off_plat_clr");
if( re_off_plat_clr == null){
	System.out.println(this.toString+" : re_off_plat_clr is null" );
}else{
	System.out.println(this.toString+" : re_off_plat_clr is "+re_off_plat_clr );
}
String re_off_plat_bw = req.getParameter("re_off_plat_bw");
if( re_off_plat_bw == null){
	System.out.println(this.toString+" : re_off_plat_bw is null" );
}else{
	System.out.println(this.toString+" : re_off_plat_bw is "+re_off_plat_bw );
}
String re_re_off_plat_clr = req.getParameter("re_re_off_plat_clr");
if( re_re_off_plat_clr == null){
	System.out.println(this.toString+" : re_re_off_plat_clr is null" );
}else{
	System.out.println(this.toString+" : re_re_off_plat_clr is "+re_re_off_plat_clr );
}
String re_re_off_plat_bw = req.getParameter("re_re_off_plat_bw");
if( re_re_off_plat_bw == null){
	System.out.println(this.toString+" : re_re_off_plat_bw is null" );
}else{
	System.out.println(this.toString+" : re_re_off_plat_bw is "+re_re_off_plat_bw );
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

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String nwsp_type = Util.checkString(req.getParameter("nwsp_type"));
String fac = Util.checkString(req.getParameter("fac"));
String ecnt = Util.checkString(req.getParameter("ecnt"));
String off_plat_basi_tm = Util.checkString(req.getParameter("off_plat_basi_tm"));
String trsm_end_basi_tm = Util.checkString(req.getParameter("trsm_end_basi_tm"));
String sect = Util.checkString(req.getParameter("sect"));
String last_edt_page = Util.checkString(req.getParameter("last_edt_page"));
String off_plat_tm = Util.checkString(req.getParameter("off_plat_tm"));
String off_plat_end_tm = Util.checkString(req.getParameter("off_plat_end_tm"));
String re_off_plat_clr = Util.checkString(req.getParameter("re_off_plat_clr"));
String re_off_plat_bw = Util.checkString(req.getParameter("re_off_plat_bw"));
String re_re_off_plat_clr = Util.checkString(req.getParameter("re_re_off_plat_clr"));
String re_re_off_plat_bw = Util.checkString(req.getParameter("re_re_off_plat_bw"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String nwsp_type = Util.Uni2Ksc(Util.checkString(req.getParameter("nwsp_type")));
String fac = Util.Uni2Ksc(Util.checkString(req.getParameter("fac")));
String ecnt = Util.Uni2Ksc(Util.checkString(req.getParameter("ecnt")));
String off_plat_basi_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("off_plat_basi_tm")));
String trsm_end_basi_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("trsm_end_basi_tm")));
String sect = Util.Uni2Ksc(Util.checkString(req.getParameter("sect")));
String last_edt_page = Util.Uni2Ksc(Util.checkString(req.getParameter("last_edt_page")));
String off_plat_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("off_plat_tm")));
String off_plat_end_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("off_plat_end_tm")));
String re_off_plat_clr = Util.Uni2Ksc(Util.checkString(req.getParameter("re_off_plat_clr")));
String re_off_plat_bw = Util.Uni2Ksc(Util.checkString(req.getParameter("re_off_plat_bw")));
String re_re_off_plat_clr = Util.Uni2Ksc(Util.checkString(req.getParameter("re_re_off_plat_clr")));
String re_re_off_plat_bw = Util.Uni2Ksc(Util.checkString(req.getParameter("re_re_off_plat_bw")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIssu_dt(issu_dt);
dm.setNwsp_type(nwsp_type);
dm.setFac(fac);
dm.setEcnt(ecnt);
dm.setOff_plat_basi_tm(off_plat_basi_tm);
dm.setTrsm_end_basi_tm(trsm_end_basi_tm);
dm.setSect(sect);
dm.setLast_edt_page(last_edt_page);
dm.setOff_plat_tm(off_plat_tm);
dm.setOff_plat_end_tm(off_plat_end_tm);
dm.setRe_off_plat_clr(re_off_plat_clr);
dm.setRe_off_plat_bw(re_off_plat_bw);
dm.setRe_re_off_plat_clr(re_re_off_plat_clr);
dm.setRe_re_off_plat_bw(re_re_off_plat_bw);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 25 10:37:05 KST 2009 */