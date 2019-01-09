/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_L_EXTN_MOVMDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String viewflag;
	public String allbo;
	public String deptcd;
	public String partcd;
	public String areacd;
	public String bocd;
	public String frdt;
	public String todt;
	public String medicd;
	public String boextn;
	public String empextn;
	public String cmpyextn;
	public String exgextn;
	public String rdrextn;
	public String cybextn;
	public String ccextn;
	public String campextn;
	public String movm;
	public String jmextn;
	public String movmtrsf;
	public long pageno;
	public long pagesize;
	public String cmpy_cd;
	public String incmg_pers; 
	public String excldpay;
  
	public SS_L_EXTN_MOVMDM(){}
	public SS_L_EXTN_MOVMDM(String viewflag, String allbo, String deptcd, String partcd, String areacd, String bocd, String frdt, String todt, String medicd, String boextn, String empextn, String exgextn, String rdrextn, String cybextn, String ccextn, String campextn, String movm, String jmextn, String movmtrsf, long pageno, long pagesize, String cmpy_cd, String incmg_pers, String excldpay, String cmpyextn){
		this.viewflag = viewflag;
		this.allbo = allbo;
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.frdt = frdt;
		this.todt = todt;
		this.medicd = medicd;
		this.boextn = boextn;
		this.empextn = empextn;
		this.exgextn = exgextn;
		this.rdrextn = rdrextn;
		this.cybextn = cybextn;
		this.ccextn = ccextn;
		this.campextn = campextn;
		this.movm = movm;
		this.jmextn = jmextn;
		this.movmtrsf = movmtrsf;
		this.pageno = pageno;
		this.pagesize = pagesize;
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.excldpay = excldpay;
		this.cmpyextn = cmpyextn;
	}

	public String getExcldpay() {
		return excldpay;
	}
	
	public void setExcldpay(String excldpay) {
		this.excldpay = excldpay;
	}
	
	public void setViewflag(String viewflag){
		this.viewflag = viewflag;
	}

	public void setAllbo(String allbo){
		this.allbo = allbo;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setPartcd(String partcd){
		this.partcd = partcd;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setBoextn(String boextn){
		this.boextn = boextn;
	}

	public void setEmpextn(String empextn){
		this.empextn = empextn;
	}

	public String getCmpyextn() {
		return cmpyextn;
	}
	public void setCmpyextn(String cmpyextn) {
		this.cmpyextn = cmpyextn;
	}
	public void setExgextn(String exgextn){
		this.exgextn = exgextn;
	}

	public void setRdrextn(String rdrextn){
		this.rdrextn = rdrextn;
	}

	public void setCybextn(String cybextn){
		this.cybextn = cybextn;
	}

	public void setCcextn(String ccextn){
		this.ccextn = ccextn;
	}

	public void setCampextn(String campextn){
		this.campextn = campextn;
	}

	public void setMovm(String movm){
		this.movm = movm;
	}

	public void setJmextn(String jmextn){
		this.jmextn = jmextn;
	}

	public void setMovmtrsf(String movmtrsf){
		this.movmtrsf = movmtrsf;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getViewflag(){
		return this.viewflag;
	}

	public String getAllbo(){
		return this.allbo;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getPartcd(){
		return this.partcd;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getBoextn(){
		return this.boextn;
	}

	public String getEmpextn(){
		return this.empextn;
	}

	public String getExgextn(){
		return this.exgextn;
	}

	public String getRdrextn(){
		return this.rdrextn;
	}

	public String getCybextn(){
		return this.cybextn;
	}

	public String getCcextn(){
		return this.ccextn;
	}

	public String getCampextn(){
		return this.campextn;
	}

	public String getMovm(){
		return this.movm;
	}

	public String getJmextn(){
		return this.jmextn;
	}

	public String getMovmtrsf(){
		return this.movmtrsf;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_L_EXTN_MOVM(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_EXTN_MOVMDM dm = (SS_L_EXTN_MOVMDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.viewflag);
		cstmt.setString(4, dm.allbo);
		cstmt.setString(5, dm.deptcd);
		cstmt.setString(6, dm.partcd);
		cstmt.setString(7, dm.areacd);
		cstmt.setString(8, dm.bocd);
		cstmt.setString(9, dm.frdt);
		cstmt.setString(10, dm.todt);
		cstmt.setString(11, dm.medicd);
		cstmt.setString(12, dm.boextn);
		cstmt.setString(13, dm.empextn);
		cstmt.setString(14, dm.cmpyextn);
		cstmt.setString(15, dm.exgextn);
		cstmt.setString(16, dm.rdrextn);
		cstmt.setString(17, dm.cybextn);
		cstmt.setString(18, dm.ccextn);
		cstmt.setString(19, dm.campextn);
		cstmt.setString(20, dm.movm);
		cstmt.setString(21, dm.jmextn);
		cstmt.setString(22, dm.movmtrsf);
		cstmt.setLong(23, dm.pageno);
		cstmt.setLong(24, dm.pagesize);
		cstmt.setString(25, dm.cmpy_cd);
		cstmt.setString(26, dm.incmg_pers);
		cstmt.registerOutParameter(27, Types.VARCHAR);
		cstmt.registerOutParameter(28, Types.VARCHAR);
		cstmt.registerOutParameter(29, Types.VARCHAR);
		cstmt.registerOutParameter(30, Types.VARCHAR);
		cstmt.registerOutParameter(31, Types.VARCHAR);
		cstmt.registerOutParameter(32, Types.VARCHAR);
		cstmt.registerOutParameter(33, Types.VARCHAR);
		cstmt.registerOutParameter(34, Types.VARCHAR);
		cstmt.registerOutParameter(35, Types.VARCHAR);
		cstmt.registerOutParameter(36, Types.VARCHAR);
		cstmt.registerOutParameter(37, OracleTypes.CURSOR);
		cstmt.registerOutParameter(38, Types.INTEGER);
		cstmt.registerOutParameter(39, Types.INTEGER);
		cstmt.registerOutParameter(40, Types.INTEGER);
		cstmt.registerOutParameter(41, Types.INTEGER);
		cstmt.registerOutParameter(42, Types.INTEGER);
		cstmt.registerOutParameter(43, Types.INTEGER);
		cstmt.registerOutParameter(44, Types.INTEGER);
		cstmt.registerOutParameter(45, Types.INTEGER);
		cstmt.registerOutParameter(46, Types.INTEGER);
		cstmt.registerOutParameter(47, Types.INTEGER);
		cstmt.registerOutParameter(48, Types.INTEGER);
		cstmt.registerOutParameter(49, Types.INTEGER);
		cstmt.registerOutParameter(50, Types.INTEGER);
		cstmt.registerOutParameter(51, Types.INTEGER);
		cstmt.registerOutParameter(52, Types.INTEGER);
		cstmt.setString(53, dm.excldpay);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_EXTN_MOVMDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("viewflag = [" + getViewflag() + "]");
		System.out.println("allbo = [" + getAllbo() + "]");
		System.out.println("deptcd = [" + getDeptcd() + "]");
		System.out.println("partcd = [" + getPartcd() + "]");
		System.out.println("areacd = [" + getAreacd() + "]");
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("medicd = [" + getMedicd() + "]");
		System.out.println("boextn = [" + getBoextn() + "]");
		System.out.println("empextn = [" + getEmpextn() + "]");
		System.out.println("cmpyextn = [" + getCmpyextn() + "]");
		System.out.println("exgextn = [" + getExgextn() + "]");
		System.out.println("rdrextn = [" + getRdrextn() + "]");
		System.out.println("cybextn = [" + getCybextn() + "]");
		System.out.println("ccextn = [" + getCcextn() + "]");
		System.out.println("campextn = [" + getCampextn() + "]");
		System.out.println("movm = [" + getMovm() + "]");
		System.out.println("jmextn = [" + getJmextn() + "]");
		System.out.println("movmtrsf = [" + getMovmtrsf() + "]");
		System.out.println("pageno = [" + getPageno() + "]");
		System.out.println("pagesize = [" + getPagesize() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("excldpay = [" + getExcldpay() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String viewflag = req.getParameter("viewflag");
if( viewflag == null){
	System.out.println(this.toString+" : viewflag is null" );
}else{
	System.out.println(this.toString+" : viewflag is "+viewflag );
}
String allbo = req.getParameter("allbo");
if( allbo == null){
	System.out.println(this.toString+" : allbo is null" );
}else{
	System.out.println(this.toString+" : allbo is "+allbo );
}
String deptcd = req.getParameter("deptcd");
if( deptcd == null){
	System.out.println(this.toString+" : deptcd is null" );
}else{
	System.out.println(this.toString+" : deptcd is "+deptcd );
}
String partcd = req.getParameter("partcd");
if( partcd == null){
	System.out.println(this.toString+" : partcd is null" );
}else{
	System.out.println(this.toString+" : partcd is "+partcd );
}
String areacd = req.getParameter("areacd");
if( areacd == null){
	System.out.println(this.toString+" : areacd is null" );
}else{
	System.out.println(this.toString+" : areacd is "+areacd );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
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
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String boextn = req.getParameter("boextn");
if( boextn == null){
	System.out.println(this.toString+" : boextn is null" );
}else{
	System.out.println(this.toString+" : boextn is "+boextn );
}
String empextn = req.getParameter("empextn");
if( empextn == null){
	System.out.println(this.toString+" : empextn is null" );
}else{
	System.out.println(this.toString+" : empextn is "+empextn );
}
String exgextn = req.getParameter("exgextn");
if( exgextn == null){
	System.out.println(this.toString+" : exgextn is null" );
}else{
	System.out.println(this.toString+" : exgextn is "+exgextn );
}
String rdrextn = req.getParameter("rdrextn");
if( rdrextn == null){
	System.out.println(this.toString+" : rdrextn is null" );
}else{
	System.out.println(this.toString+" : rdrextn is "+rdrextn );
}
String cybextn = req.getParameter("cybextn");
if( cybextn == null){
	System.out.println(this.toString+" : cybextn is null" );
}else{
	System.out.println(this.toString+" : cybextn is "+cybextn );
}
String ccextn = req.getParameter("ccextn");
if( ccextn == null){
	System.out.println(this.toString+" : ccextn is null" );
}else{
	System.out.println(this.toString+" : ccextn is "+ccextn );
}
String campextn = req.getParameter("campextn");
if( campextn == null){
	System.out.println(this.toString+" : campextn is null" );
}else{
	System.out.println(this.toString+" : campextn is "+campextn );
}
String movm = req.getParameter("movm");
if( movm == null){
	System.out.println(this.toString+" : movm is null" );
}else{
	System.out.println(this.toString+" : movm is "+movm );
}
String jmextn = req.getParameter("jmextn");
if( jmextn == null){
	System.out.println(this.toString+" : jmextn is null" );
}else{
	System.out.println(this.toString+" : jmextn is "+jmextn );
}
String movmtrsf = req.getParameter("movmtrsf");
if( movmtrsf == null){
	System.out.println(this.toString+" : movmtrsf is null" );
}else{
	System.out.println(this.toString+" : movmtrsf is "+movmtrsf );
}
String pageno = req.getParameter("pageno");
if( pageno == null){
	System.out.println(this.toString+" : pageno is null" );
}else{
	System.out.println(this.toString+" : pageno is "+pageno );
}
String pagesize = req.getParameter("pagesize");
if( pagesize == null){
	System.out.println(this.toString+" : pagesize is null" );
}else{
	System.out.println(this.toString+" : pagesize is "+pagesize );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
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

String viewflag = Util.checkString(req.getParameter("viewflag"));
String allbo = Util.checkString(req.getParameter("allbo"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
String partcd = Util.checkString(req.getParameter("partcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String medicd = Util.checkString(req.getParameter("medicd"));
String boextn = Util.checkString(req.getParameter("boextn"));
String empextn = Util.checkString(req.getParameter("empextn"));
String exgextn = Util.checkString(req.getParameter("exgextn"));
String rdrextn = Util.checkString(req.getParameter("rdrextn"));
String cybextn = Util.checkString(req.getParameter("cybextn"));
String ccextn = Util.checkString(req.getParameter("ccextn"));
String campextn = Util.checkString(req.getParameter("campextn"));
String movm = Util.checkString(req.getParameter("movm"));
String jmextn = Util.checkString(req.getParameter("jmextn"));
String movmtrsf = Util.checkString(req.getParameter("movmtrsf"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String viewflag = Util.Uni2Ksc(Util.checkString(req.getParameter("viewflag")));
String allbo = Util.Uni2Ksc(Util.checkString(req.getParameter("allbo")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String boextn = Util.Uni2Ksc(Util.checkString(req.getParameter("boextn")));
String empextn = Util.Uni2Ksc(Util.checkString(req.getParameter("empextn")));
String exgextn = Util.Uni2Ksc(Util.checkString(req.getParameter("exgextn")));
String rdrextn = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrextn")));
String cybextn = Util.Uni2Ksc(Util.checkString(req.getParameter("cybextn")));
String ccextn = Util.Uni2Ksc(Util.checkString(req.getParameter("ccextn")));
String campextn = Util.Uni2Ksc(Util.checkString(req.getParameter("campextn")));
String movm = Util.Uni2Ksc(Util.checkString(req.getParameter("movm")));
String jmextn = Util.Uni2Ksc(Util.checkString(req.getParameter("jmextn")));
String movmtrsf = Util.Uni2Ksc(Util.checkString(req.getParameter("movmtrsf")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setViewflag(viewflag);
dm.setAllbo(allbo);
dm.setDeptcd(deptcd);
dm.setPartcd(partcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setMedicd(medicd);
dm.setBoextn(boextn);
dm.setEmpextn(empextn);
dm.setExgextn(exgextn);
dm.setRdrextn(rdrextn);
dm.setCybextn(cybextn);
dm.setCcextn(ccextn);
dm.setCampextn(campextn);
dm.setMovm(movm);
dm.setJmextn(jmextn);
dm.setMovmtrsf(movmtrsf);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 12 11:00:43 KST 2016 */