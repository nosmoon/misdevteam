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


public class PR_SENDMG_1010_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String gubun;
	public String cmpy_cd;
	public String issu_dt;
	public String medi_cd;
	public String make_pers;
	public String weth;
	public String ser_no;
	public String side1_atic;
	public String rept_matt;
	public String fac_clsf_1;
	public String ecnt;
	public String prt_bgn_tm;
	public String prt_end_tm;
	public String fac_clsf_2;
	public String chrg_pers;
	public String fst_route;
	public String fst_route_tm;
	public String last_route;
	public String last_route_tm;
	public String incmg_pers_ipaddr;
	public String incmg_pers;

	public PR_SENDMG_1010_ADM(){}
	public PR_SENDMG_1010_ADM(String gubun, String cmpy_cd, String issu_dt, String medi_cd, String make_pers, String weth, String ser_no, String side1_atic, String rept_matt, String fac_clsf_1, String ecnt, String prt_bgn_tm, String prt_end_tm, String fac_clsf_2, String chrg_pers, String fst_route, String fst_route_tm, String last_route, String last_route_tm, String incmg_pers_ipaddr, String incmg_pers){
		this.gubun = gubun;
		this.cmpy_cd = cmpy_cd;
		this.issu_dt = issu_dt;
		this.medi_cd = medi_cd;
		this.make_pers = make_pers;
		this.weth = weth;
		this.ser_no = ser_no;
		this.side1_atic = side1_atic;
		this.rept_matt = rept_matt;
		this.fac_clsf_1 = fac_clsf_1;
		this.ecnt = ecnt;
		this.prt_bgn_tm = prt_bgn_tm;
		this.prt_end_tm = prt_end_tm;
		this.fac_clsf_2 = fac_clsf_2;
		this.chrg_pers = chrg_pers;
		this.fst_route = fst_route;
		this.fst_route_tm = fst_route_tm;
		this.last_route = last_route;
		this.last_route_tm = last_route_tm;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMake_pers(String make_pers){
		this.make_pers = make_pers;
	}

	public void setWeth(String weth){
		this.weth = weth;
	}

	public void setSer_no(String ser_no){
		this.ser_no = ser_no;
	}

	public void setSide1_atic(String side1_atic){
		this.side1_atic = side1_atic;
	}

	public void setRept_matt(String rept_matt){
		this.rept_matt = rept_matt;
	}

	public void setFac_clsf_1(String fac_clsf_1){
		this.fac_clsf_1 = fac_clsf_1;
	}

	public void setEcnt(String ecnt){
		this.ecnt = ecnt;
	}

	public void setPrt_bgn_tm(String prt_bgn_tm){
		this.prt_bgn_tm = prt_bgn_tm;
	}

	public void setPrt_end_tm(String prt_end_tm){
		this.prt_end_tm = prt_end_tm;
	}

	public void setFac_clsf_2(String fac_clsf_2){
		this.fac_clsf_2 = fac_clsf_2;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setFst_route(String fst_route){
		this.fst_route = fst_route;
	}

	public void setFst_route_tm(String fst_route_tm){
		this.fst_route_tm = fst_route_tm;
	}

	public void setLast_route(String last_route){
		this.last_route = last_route;
	}

	public void setLast_route_tm(String last_route_tm){
		this.last_route_tm = last_route_tm;
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

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMake_pers(){
		return this.make_pers;
	}

	public String getWeth(){
		return this.weth;
	}

	public String getSer_no(){
		return this.ser_no;
	}

	public String getSide1_atic(){
		return this.side1_atic;
	}

	public String getRept_matt(){
		return this.rept_matt;
	}

	public String getFac_clsf_1(){
		return this.fac_clsf_1;
	}

	public String getEcnt(){
		return this.ecnt;
	}

	public String getPrt_bgn_tm(){
		return this.prt_bgn_tm;
	}

	public String getPrt_end_tm(){
		return this.prt_end_tm;
	}

	public String getFac_clsf_2(){
		return this.fac_clsf_2;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getFst_route(){
		return this.fst_route;
	}

	public String getFst_route_tm(){
		return this.fst_route_tm;
	}

	public String getLast_route(){
		return this.last_route;
	}

	public String getLast_route_tm(){
		return this.last_route_tm;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_PR_SENDMG_1010_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_SENDMG_1010_ADM dm = (PR_SENDMG_1010_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.gubun);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.issu_dt);
		cstmt.setString(6, dm.medi_cd);
		cstmt.setString(7, dm.make_pers);
		cstmt.setString(8, dm.weth);
		cstmt.setString(9, dm.ser_no);
		cstmt.setString(10, dm.side1_atic);
		cstmt.setString(11, dm.rept_matt);
		cstmt.setString(12, dm.fac_clsf_1);
		cstmt.setString(13, dm.ecnt);
		cstmt.setString(14, dm.prt_bgn_tm);
		cstmt.setString(15, dm.prt_end_tm);
		cstmt.setString(16, dm.fac_clsf_2);
		cstmt.setString(17, dm.chrg_pers);
		cstmt.setString(18, dm.fst_route);
		cstmt.setString(19, dm.fst_route_tm);
		cstmt.setString(20, dm.last_route);
		cstmt.setString(21, dm.last_route_tm);
		cstmt.setString(22, dm.incmg_pers_ipaddr);
		cstmt.setString(23, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.sendmg.ds.PR_SENDMG_1010_ADataSet();
	}



    public void print(){
        System.out.println("gubun = " + getGubun());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("issu_dt = " + getIssu_dt());
        System.out.println("medi_cd = " + getMedi_cd());
        System.out.println("make_pers = " + getMake_pers());
        System.out.println("weth = " + getWeth());
        System.out.println("ser_no = " + getSer_no());
        System.out.println("side1_atic = " + getSide1_atic());
        System.out.println("rept_matt = " + getRept_matt());
        System.out.println("fac_clsf_1 = " + getFac_clsf_1());
        System.out.println("ecnt = " + getEcnt());
        System.out.println("prt_bgn_tm = " + getPrt_bgn_tm());
        System.out.println("prt_end_tm = " + getPrt_end_tm());
        System.out.println("fac_clsf_2 = " + getFac_clsf_2());
        System.out.println("chrg_pers = " + getChrg_pers());
        System.out.println("fst_route = " + getFst_route());
        System.out.println("fst_route_tm = " + getFst_route_tm());
        System.out.println("last_route = " + getLast_route());
        System.out.println("last_route_tm = " + getLast_route_tm());
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
String issu_dt = req.getParameter("issu_dt");
if( issu_dt == null){
	System.out.println(this.toString+" : issu_dt is null" );
}else{
	System.out.println(this.toString+" : issu_dt is "+issu_dt );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String make_pers = req.getParameter("make_pers");
if( make_pers == null){
	System.out.println(this.toString+" : make_pers is null" );
}else{
	System.out.println(this.toString+" : make_pers is "+make_pers );
}
String weth = req.getParameter("weth");
if( weth == null){
	System.out.println(this.toString+" : weth is null" );
}else{
	System.out.println(this.toString+" : weth is "+weth );
}
String ser_no = req.getParameter("ser_no");
if( ser_no == null){
	System.out.println(this.toString+" : ser_no is null" );
}else{
	System.out.println(this.toString+" : ser_no is "+ser_no );
}
String side1_atic = req.getParameter("side1_atic");
if( side1_atic == null){
	System.out.println(this.toString+" : side1_atic is null" );
}else{
	System.out.println(this.toString+" : side1_atic is "+side1_atic );
}
String rept_matt = req.getParameter("rept_matt");
if( rept_matt == null){
	System.out.println(this.toString+" : rept_matt is null" );
}else{
	System.out.println(this.toString+" : rept_matt is "+rept_matt );
}
String fac_clsf_1 = req.getParameter("fac_clsf_1");
if( fac_clsf_1 == null){
	System.out.println(this.toString+" : fac_clsf_1 is null" );
}else{
	System.out.println(this.toString+" : fac_clsf_1 is "+fac_clsf_1 );
}
String ecnt = req.getParameter("ecnt");
if( ecnt == null){
	System.out.println(this.toString+" : ecnt is null" );
}else{
	System.out.println(this.toString+" : ecnt is "+ecnt );
}
String prt_bgn_tm = req.getParameter("prt_bgn_tm");
if( prt_bgn_tm == null){
	System.out.println(this.toString+" : prt_bgn_tm is null" );
}else{
	System.out.println(this.toString+" : prt_bgn_tm is "+prt_bgn_tm );
}
String prt_end_tm = req.getParameter("prt_end_tm");
if( prt_end_tm == null){
	System.out.println(this.toString+" : prt_end_tm is null" );
}else{
	System.out.println(this.toString+" : prt_end_tm is "+prt_end_tm );
}
String fac_clsf_2 = req.getParameter("fac_clsf_2");
if( fac_clsf_2 == null){
	System.out.println(this.toString+" : fac_clsf_2 is null" );
}else{
	System.out.println(this.toString+" : fac_clsf_2 is "+fac_clsf_2 );
}
String chrg_pers = req.getParameter("chrg_pers");
if( chrg_pers == null){
	System.out.println(this.toString+" : chrg_pers is null" );
}else{
	System.out.println(this.toString+" : chrg_pers is "+chrg_pers );
}
String fst_route = req.getParameter("fst_route");
if( fst_route == null){
	System.out.println(this.toString+" : fst_route is null" );
}else{
	System.out.println(this.toString+" : fst_route is "+fst_route );
}
String fst_route_tm = req.getParameter("fst_route_tm");
if( fst_route_tm == null){
	System.out.println(this.toString+" : fst_route_tm is null" );
}else{
	System.out.println(this.toString+" : fst_route_tm is "+fst_route_tm );
}
String last_route = req.getParameter("last_route");
if( last_route == null){
	System.out.println(this.toString+" : last_route is null" );
}else{
	System.out.println(this.toString+" : last_route is "+last_route );
}
String last_route_tm = req.getParameter("last_route_tm");
if( last_route_tm == null){
	System.out.println(this.toString+" : last_route_tm is null" );
}else{
	System.out.println(this.toString+" : last_route_tm is "+last_route_tm );
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
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String make_pers = Util.checkString(req.getParameter("make_pers"));
String weth = Util.checkString(req.getParameter("weth"));
String ser_no = Util.checkString(req.getParameter("ser_no"));
String side1_atic = Util.checkString(req.getParameter("side1_atic"));
String rept_matt = Util.checkString(req.getParameter("rept_matt"));
String fac_clsf_1 = Util.checkString(req.getParameter("fac_clsf_1"));
String ecnt = Util.checkString(req.getParameter("ecnt"));
String prt_bgn_tm = Util.checkString(req.getParameter("prt_bgn_tm"));
String prt_end_tm = Util.checkString(req.getParameter("prt_end_tm"));
String fac_clsf_2 = Util.checkString(req.getParameter("fac_clsf_2"));
String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
String fst_route = Util.checkString(req.getParameter("fst_route"));
String fst_route_tm = Util.checkString(req.getParameter("fst_route_tm"));
String last_route = Util.checkString(req.getParameter("last_route"));
String last_route_tm = Util.checkString(req.getParameter("last_route_tm"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String make_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("make_pers")));
String weth = Util.Uni2Ksc(Util.checkString(req.getParameter("weth")));
String ser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ser_no")));
String side1_atic = Util.Uni2Ksc(Util.checkString(req.getParameter("side1_atic")));
String rept_matt = Util.Uni2Ksc(Util.checkString(req.getParameter("rept_matt")));
String fac_clsf_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf_1")));
String ecnt = Util.Uni2Ksc(Util.checkString(req.getParameter("ecnt")));
String prt_bgn_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_bgn_tm")));
String prt_end_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_end_tm")));
String fac_clsf_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf_2")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
String fst_route = Util.Uni2Ksc(Util.checkString(req.getParameter("fst_route")));
String fst_route_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("fst_route_tm")));
String last_route = Util.Uni2Ksc(Util.checkString(req.getParameter("last_route")));
String last_route_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("last_route_tm")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setGubun(gubun);
dm.setCmpy_cd(cmpy_cd);
dm.setIssu_dt(issu_dt);
dm.setMedi_cd(medi_cd);
dm.setMake_pers(make_pers);
dm.setWeth(weth);
dm.setSer_no(ser_no);
dm.setSide1_atic(side1_atic);
dm.setRept_matt(rept_matt);
dm.setFac_clsf_1(fac_clsf_1);
dm.setEcnt(ecnt);
dm.setPrt_bgn_tm(prt_bgn_tm);
dm.setPrt_end_tm(prt_end_tm);
dm.setFac_clsf_2(fac_clsf_2);
dm.setChrg_pers(chrg_pers);
dm.setFst_route(fst_route);
dm.setFst_route_tm(fst_route_tm);
dm.setLast_route(last_route);
dm.setLast_route_tm(last_route_tm);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 18 16:37:04 KST 2009 */