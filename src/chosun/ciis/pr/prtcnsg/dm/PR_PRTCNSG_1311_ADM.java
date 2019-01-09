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


package chosun.ciis.pr.prtcnsg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.prtcnsg.ds.*;
import chosun.ciis.pr.prtcnsg.rec.*;

/**
 * 
 */


public class PR_PRTCNSG_1311_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fac_clsf;
	public String aply_dt;
	public String prt_basi_qty;
	public String pj_basi_qty;
	public String prt_uprc_bw_1;
	public String prt_uprc_clr_1;
	public String prt_uprc_bw_2;
	public String prt_uprc_clr_2;
	public String prt_pj_rate_bw_1;
	public String prt_pj_rate_clr_1;
	public String prt_pj_rate_bw_2;
	public String prt_pj_rate_clr_2;
	public String film_make_fee;
	public String pack_fee;
	public String paper_wgt;
	public String eps_no;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String gubun;

	public PR_PRTCNSG_1311_ADM(){}
	public PR_PRTCNSG_1311_ADM(String cmpy_cd, String fac_clsf, String aply_dt, String prt_basi_qty, String pj_basi_qty, String prt_uprc_bw_1, String prt_uprc_clr_1, String prt_uprc_bw_2, String prt_uprc_clr_2, String prt_pj_rate_bw_1, String prt_pj_rate_clr_1, String prt_pj_rate_bw_2, String prt_pj_rate_clr_2, String film_make_fee, String pack_fee, String paper_wgt, String eps_no, String incmg_pers_ipaddr, String incmg_pers, String gubun){
		this.cmpy_cd = cmpy_cd;
		this.fac_clsf = fac_clsf;
		this.aply_dt = aply_dt;
		this.prt_basi_qty = prt_basi_qty;
		this.pj_basi_qty = pj_basi_qty;
		this.prt_uprc_bw_1 = prt_uprc_bw_1;
		this.prt_uprc_clr_1 = prt_uprc_clr_1;
		this.prt_uprc_bw_2 = prt_uprc_bw_2;
		this.prt_uprc_clr_2 = prt_uprc_clr_2;
		this.prt_pj_rate_bw_1 = prt_pj_rate_bw_1;
		this.prt_pj_rate_clr_1 = prt_pj_rate_clr_1;
		this.prt_pj_rate_bw_2 = prt_pj_rate_bw_2;
		this.prt_pj_rate_clr_2 = prt_pj_rate_clr_2;
		this.film_make_fee = film_make_fee;
		this.pack_fee = pack_fee;
		this.paper_wgt = paper_wgt;
		this.eps_no = eps_no;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.gubun = gubun;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
	}

	public void setPrt_basi_qty(String prt_basi_qty){
		this.prt_basi_qty = prt_basi_qty;
	}

	public void setPj_basi_qty(String pj_basi_qty){
		this.pj_basi_qty = pj_basi_qty;
	}

	public void setPrt_uprc_bw_1(String prt_uprc_bw_1){
		this.prt_uprc_bw_1 = prt_uprc_bw_1;
	}

	public void setPrt_uprc_clr_1(String prt_uprc_clr_1){
		this.prt_uprc_clr_1 = prt_uprc_clr_1;
	}

	public void setPrt_uprc_bw_2(String prt_uprc_bw_2){
		this.prt_uprc_bw_2 = prt_uprc_bw_2;
	}

	public void setPrt_uprc_clr_2(String prt_uprc_clr_2){
		this.prt_uprc_clr_2 = prt_uprc_clr_2;
	}

	public void setPrt_pj_rate_bw_1(String prt_pj_rate_bw_1){
		this.prt_pj_rate_bw_1 = prt_pj_rate_bw_1;
	}

	public void setPrt_pj_rate_clr_1(String prt_pj_rate_clr_1){
		this.prt_pj_rate_clr_1 = prt_pj_rate_clr_1;
	}

	public void setPrt_pj_rate_bw_2(String prt_pj_rate_bw_2){
		this.prt_pj_rate_bw_2 = prt_pj_rate_bw_2;
	}

	public void setPrt_pj_rate_clr_2(String prt_pj_rate_clr_2){
		this.prt_pj_rate_clr_2 = prt_pj_rate_clr_2;
	}

	public void setFilm_make_fee(String film_make_fee){
		this.film_make_fee = film_make_fee;
	}

	public void setPack_fee(String pack_fee){
		this.pack_fee = pack_fee;
	}

	public void setPaper_wgt(String paper_wgt){
		this.paper_wgt = paper_wgt;
	}

	public void setEps_no(String eps_no){
		this.eps_no = eps_no;
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

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getAply_dt(){
		return this.aply_dt;
	}

	public String getPrt_basi_qty(){
		return this.prt_basi_qty;
	}

	public String getPj_basi_qty(){
		return this.pj_basi_qty;
	}

	public String getPrt_uprc_bw_1(){
		return this.prt_uprc_bw_1;
	}

	public String getPrt_uprc_clr_1(){
		return this.prt_uprc_clr_1;
	}

	public String getPrt_uprc_bw_2(){
		return this.prt_uprc_bw_2;
	}

	public String getPrt_uprc_clr_2(){
		return this.prt_uprc_clr_2;
	}

	public String getPrt_pj_rate_bw_1(){
		return this.prt_pj_rate_bw_1;
	}

	public String getPrt_pj_rate_clr_1(){
		return this.prt_pj_rate_clr_1;
	}

	public String getPrt_pj_rate_bw_2(){
		return this.prt_pj_rate_bw_2;
	}

	public String getPrt_pj_rate_clr_2(){
		return this.prt_pj_rate_clr_2;
	}

	public String getFilm_make_fee(){
		return this.film_make_fee;
	}

	public String getPack_fee(){
		return this.pack_fee;
	}

	public String getPaper_wgt(){
		return this.paper_wgt;
	}

	public String getEps_no(){
		return this.eps_no;
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
		 return "{ call MISMAT.SP_PR_PRTCNSG_1311_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_PRTCNSG_1311_ADM dm = (PR_PRTCNSG_1311_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fac_clsf);
		cstmt.setString(5, dm.aply_dt);
		cstmt.setString(6, dm.prt_basi_qty);
		cstmt.setString(7, dm.pj_basi_qty);
		cstmt.setString(8, dm.prt_uprc_bw_1);
		cstmt.setString(9, dm.prt_uprc_clr_1);
		cstmt.setString(10, dm.prt_uprc_bw_2);
		cstmt.setString(11, dm.prt_uprc_clr_2);
		cstmt.setString(12, dm.prt_pj_rate_bw_1);
		cstmt.setString(13, dm.prt_pj_rate_clr_1);
		cstmt.setString(14, dm.prt_pj_rate_bw_2);
		cstmt.setString(15, dm.prt_pj_rate_clr_2);
		cstmt.setString(16, dm.film_make_fee);
		cstmt.setString(17, dm.pack_fee);
		cstmt.setString(18, dm.paper_wgt);
		cstmt.setString(19, dm.eps_no);
		cstmt.setString(20, dm.incmg_pers_ipaddr);
		cstmt.setString(21, dm.incmg_pers);
		cstmt.setString(22, dm.gubun);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.prtcnsg.ds.PR_PRTCNSG_1311_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("aply_dt = [" + getAply_dt() + "]");
		System.out.println("prt_basi_qty = [" + getPrt_basi_qty() + "]");
		System.out.println("pj_basi_qty = [" + getPj_basi_qty() + "]");
		System.out.println("prt_uprc_bw_1 = [" + getPrt_uprc_bw_1() + "]");
		System.out.println("prt_uprc_clr_1 = [" + getPrt_uprc_clr_1() + "]");
		System.out.println("prt_uprc_bw_2 = [" + getPrt_uprc_bw_2() + "]");
		System.out.println("prt_uprc_clr_2 = [" + getPrt_uprc_clr_2() + "]");
		System.out.println("prt_pj_rate_bw_1 = [" + getPrt_pj_rate_bw_1() + "]");
		System.out.println("prt_pj_rate_clr_1 = [" + getPrt_pj_rate_clr_1() + "]");
		System.out.println("prt_pj_rate_bw_2 = [" + getPrt_pj_rate_bw_2() + "]");
		System.out.println("prt_pj_rate_clr_2 = [" + getPrt_pj_rate_clr_2() + "]");
		System.out.println("film_make_fee = [" + getFilm_make_fee() + "]");
		System.out.println("pack_fee = [" + getPack_fee() + "]");
		System.out.println("paper_wgt = [" + getPaper_wgt() + "]");
		System.out.println("eps_no = [" + getEps_no() + "]");
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
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String aply_dt = req.getParameter("aply_dt");
if( aply_dt == null){
	System.out.println(this.toString+" : aply_dt is null" );
}else{
	System.out.println(this.toString+" : aply_dt is "+aply_dt );
}
String prt_basi_qty = req.getParameter("prt_basi_qty");
if( prt_basi_qty == null){
	System.out.println(this.toString+" : prt_basi_qty is null" );
}else{
	System.out.println(this.toString+" : prt_basi_qty is "+prt_basi_qty );
}
String pj_basi_qty = req.getParameter("pj_basi_qty");
if( pj_basi_qty == null){
	System.out.println(this.toString+" : pj_basi_qty is null" );
}else{
	System.out.println(this.toString+" : pj_basi_qty is "+pj_basi_qty );
}
String prt_uprc_bw_1 = req.getParameter("prt_uprc_bw_1");
if( prt_uprc_bw_1 == null){
	System.out.println(this.toString+" : prt_uprc_bw_1 is null" );
}else{
	System.out.println(this.toString+" : prt_uprc_bw_1 is "+prt_uprc_bw_1 );
}
String prt_uprc_clr_1 = req.getParameter("prt_uprc_clr_1");
if( prt_uprc_clr_1 == null){
	System.out.println(this.toString+" : prt_uprc_clr_1 is null" );
}else{
	System.out.println(this.toString+" : prt_uprc_clr_1 is "+prt_uprc_clr_1 );
}
String prt_uprc_bw_2 = req.getParameter("prt_uprc_bw_2");
if( prt_uprc_bw_2 == null){
	System.out.println(this.toString+" : prt_uprc_bw_2 is null" );
}else{
	System.out.println(this.toString+" : prt_uprc_bw_2 is "+prt_uprc_bw_2 );
}
String prt_uprc_clr_2 = req.getParameter("prt_uprc_clr_2");
if( prt_uprc_clr_2 == null){
	System.out.println(this.toString+" : prt_uprc_clr_2 is null" );
}else{
	System.out.println(this.toString+" : prt_uprc_clr_2 is "+prt_uprc_clr_2 );
}
String prt_pj_rate_bw_1 = req.getParameter("prt_pj_rate_bw_1");
if( prt_pj_rate_bw_1 == null){
	System.out.println(this.toString+" : prt_pj_rate_bw_1 is null" );
}else{
	System.out.println(this.toString+" : prt_pj_rate_bw_1 is "+prt_pj_rate_bw_1 );
}
String prt_pj_rate_clr_1 = req.getParameter("prt_pj_rate_clr_1");
if( prt_pj_rate_clr_1 == null){
	System.out.println(this.toString+" : prt_pj_rate_clr_1 is null" );
}else{
	System.out.println(this.toString+" : prt_pj_rate_clr_1 is "+prt_pj_rate_clr_1 );
}
String prt_pj_rate_bw_2 = req.getParameter("prt_pj_rate_bw_2");
if( prt_pj_rate_bw_2 == null){
	System.out.println(this.toString+" : prt_pj_rate_bw_2 is null" );
}else{
	System.out.println(this.toString+" : prt_pj_rate_bw_2 is "+prt_pj_rate_bw_2 );
}
String prt_pj_rate_clr_2 = req.getParameter("prt_pj_rate_clr_2");
if( prt_pj_rate_clr_2 == null){
	System.out.println(this.toString+" : prt_pj_rate_clr_2 is null" );
}else{
	System.out.println(this.toString+" : prt_pj_rate_clr_2 is "+prt_pj_rate_clr_2 );
}
String film_make_fee = req.getParameter("film_make_fee");
if( film_make_fee == null){
	System.out.println(this.toString+" : film_make_fee is null" );
}else{
	System.out.println(this.toString+" : film_make_fee is "+film_make_fee );
}
String pack_fee = req.getParameter("pack_fee");
if( pack_fee == null){
	System.out.println(this.toString+" : pack_fee is null" );
}else{
	System.out.println(this.toString+" : pack_fee is "+pack_fee );
}
String paper_wgt = req.getParameter("paper_wgt");
if( paper_wgt == null){
	System.out.println(this.toString+" : paper_wgt is null" );
}else{
	System.out.println(this.toString+" : paper_wgt is "+paper_wgt );
}
String eps_no = req.getParameter("eps_no");
if( eps_no == null){
	System.out.println(this.toString+" : eps_no is null" );
}else{
	System.out.println(this.toString+" : eps_no is "+eps_no );
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
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String aply_dt = Util.checkString(req.getParameter("aply_dt"));
String prt_basi_qty = Util.checkString(req.getParameter("prt_basi_qty"));
String pj_basi_qty = Util.checkString(req.getParameter("pj_basi_qty"));
String prt_uprc_bw_1 = Util.checkString(req.getParameter("prt_uprc_bw_1"));
String prt_uprc_clr_1 = Util.checkString(req.getParameter("prt_uprc_clr_1"));
String prt_uprc_bw_2 = Util.checkString(req.getParameter("prt_uprc_bw_2"));
String prt_uprc_clr_2 = Util.checkString(req.getParameter("prt_uprc_clr_2"));
String prt_pj_rate_bw_1 = Util.checkString(req.getParameter("prt_pj_rate_bw_1"));
String prt_pj_rate_clr_1 = Util.checkString(req.getParameter("prt_pj_rate_clr_1"));
String prt_pj_rate_bw_2 = Util.checkString(req.getParameter("prt_pj_rate_bw_2"));
String prt_pj_rate_clr_2 = Util.checkString(req.getParameter("prt_pj_rate_clr_2"));
String film_make_fee = Util.checkString(req.getParameter("film_make_fee"));
String pack_fee = Util.checkString(req.getParameter("pack_fee"));
String paper_wgt = Util.checkString(req.getParameter("paper_wgt"));
String eps_no = Util.checkString(req.getParameter("eps_no"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String gubun = Util.checkString(req.getParameter("gubun"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String aply_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_dt")));
String prt_basi_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_basi_qty")));
String pj_basi_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("pj_basi_qty")));
String prt_uprc_bw_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_uprc_bw_1")));
String prt_uprc_clr_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_uprc_clr_1")));
String prt_uprc_bw_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_uprc_bw_2")));
String prt_uprc_clr_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_uprc_clr_2")));
String prt_pj_rate_bw_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_pj_rate_bw_1")));
String prt_pj_rate_clr_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_pj_rate_clr_1")));
String prt_pj_rate_bw_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_pj_rate_bw_2")));
String prt_pj_rate_clr_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_pj_rate_clr_2")));
String film_make_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("film_make_fee")));
String pack_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("pack_fee")));
String paper_wgt = Util.Uni2Ksc(Util.checkString(req.getParameter("paper_wgt")));
String eps_no = Util.Uni2Ksc(Util.checkString(req.getParameter("eps_no")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFac_clsf(fac_clsf);
dm.setAply_dt(aply_dt);
dm.setPrt_basi_qty(prt_basi_qty);
dm.setPj_basi_qty(pj_basi_qty);
dm.setPrt_uprc_bw_1(prt_uprc_bw_1);
dm.setPrt_uprc_clr_1(prt_uprc_clr_1);
dm.setPrt_uprc_bw_2(prt_uprc_bw_2);
dm.setPrt_uprc_clr_2(prt_uprc_clr_2);
dm.setPrt_pj_rate_bw_1(prt_pj_rate_bw_1);
dm.setPrt_pj_rate_clr_1(prt_pj_rate_clr_1);
dm.setPrt_pj_rate_bw_2(prt_pj_rate_bw_2);
dm.setPrt_pj_rate_clr_2(prt_pj_rate_clr_2);
dm.setFilm_make_fee(film_make_fee);
dm.setPack_fee(pack_fee);
dm.setPaper_wgt(paper_wgt);
dm.setEps_no(eps_no);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setGubun(gubun);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 22 16:35:48 KST 2009 */