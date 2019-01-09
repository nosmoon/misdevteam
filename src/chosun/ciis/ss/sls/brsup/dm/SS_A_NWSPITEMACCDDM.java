/***************************************************************************************************
* 파일명 : SS_A_NWSPITEMACCDDM.java
* 기능 : 지국지원-신문지원물품-사고-등록,수정,삭제를 위한 DM
* 작성일자 : 2004-01-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 지국지원-신문지원물품-사고-등록,수정,삭제를 위한 DM
 */
  
public class SS_A_NWSPITEMACCDDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String accflag;
	public String deptcd;
	public String areacd;
	public String bocd;
	public String aplcdt;
	public String aplcno;
	public String itemcd;
	public String accdno;
	public String accddt;
	public long accdqunt;
	public String regdt;
	public String remk;

	public SS_A_NWSPITEMACCDDM(){}
	public SS_A_NWSPITEMACCDDM(String incmgpers, String accflag, String deptcd, String areacd, String bocd, String aplcdt, String aplcno, String itemcd, String accdno, String accddt, long accdqunt, String regdt, String remk){
		this.incmgpers = incmgpers;
		this.accflag = accflag;
		this.deptcd = deptcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.aplcdt = aplcdt;
		this.aplcno = aplcno;
		this.itemcd = itemcd;
		this.accdno = accdno;
		this.accddt = accddt;
		this.accdqunt = accdqunt;
		this.regdt = regdt;
		this.remk = remk;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setAplcno(String aplcno){
		this.aplcno = aplcno;
	}

	public void setItemcd(String itemcd){
		this.itemcd = itemcd;
	}

	public void setAccdno(String accdno){
		this.accdno = accdno;
	}

	public void setAccddt(String accddt){
		this.accddt = accddt;
	}

	public void setAccdqunt(long accdqunt){
		this.accdqunt = accdqunt;
	}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getAplcno(){
		return this.aplcno;
	}

	public String getItemcd(){
		return this.itemcd;
	}

	public String getAccdno(){
		return this.accdno;
	}

	public String getAccddt(){
		return this.accddt;
	}

	public long getAccdqunt(){
		return this.accdqunt;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSQL(){
		 return "{ call SP_SS_A_NWSPITEMACCD( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_NWSPITEMACCDDM dm = (SS_A_NWSPITEMACCDDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.accflag);
		cstmt.setString(5, dm.deptcd);
		cstmt.setString(6, dm.areacd);
		cstmt.setString(7, dm.bocd);
		cstmt.setString(8, dm.aplcdt);
		cstmt.setString(9, dm.aplcno);
		cstmt.setString(10, dm.itemcd);
		cstmt.setString(11, dm.accdno);
		cstmt.setString(12, dm.accddt);
		cstmt.setLong(13, dm.accdqunt);
		cstmt.setString(14, dm.regdt);
		cstmt.setString(15, dm.remk);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_A_NWSPITEMACCDDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String deptcd = req.getParameter("deptcd");
if( deptcd == null){
	System.out.println(this.toString+" : deptcd is null" );
}else{
	System.out.println(this.toString+" : deptcd is "+deptcd );
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
String aplcdt = req.getParameter("aplcdt");
if( aplcdt == null){
	System.out.println(this.toString+" : aplcdt is null" );
}else{
	System.out.println(this.toString+" : aplcdt is "+aplcdt );
}
String aplcno = req.getParameter("aplcno");
if( aplcno == null){
	System.out.println(this.toString+" : aplcno is null" );
}else{
	System.out.println(this.toString+" : aplcno is "+aplcno );
}
String itemcd = req.getParameter("itemcd");
if( itemcd == null){
	System.out.println(this.toString+" : itemcd is null" );
}else{
	System.out.println(this.toString+" : itemcd is "+itemcd );
}
String accdno = req.getParameter("accdno");
if( accdno == null){
	System.out.println(this.toString+" : accdno is null" );
}else{
	System.out.println(this.toString+" : accdno is "+accdno );
}
String accddt = req.getParameter("accddt");
if( accddt == null){
	System.out.println(this.toString+" : accddt is null" );
}else{
	System.out.println(this.toString+" : accddt is "+accddt );
}
String accdqunt = req.getParameter("accdqunt");
if( accdqunt == null){
	System.out.println(this.toString+" : accdqunt is null" );
}else{
	System.out.println(this.toString+" : accdqunt is "+accdqunt );
}
String regdt = req.getParameter("regdt");
if( regdt == null){
	System.out.println(this.toString+" : regdt is null" );
}else{
	System.out.println(this.toString+" : regdt is "+regdt );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String accflag = Util.checkString(req.getParameter("accflag"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String aplcdt = Util.checkString(req.getParameter("aplcdt"));
String aplcno = Util.checkString(req.getParameter("aplcno"));
String itemcd = Util.checkString(req.getParameter("itemcd"));
String accdno = Util.checkString(req.getParameter("accdno"));
String accddt = Util.checkString(req.getParameter("accddt"));
String accdqunt = Util.checkString(req.getParameter("accdqunt"));
String regdt = Util.checkString(req.getParameter("regdt"));
String remk = Util.checkString(req.getParameter("remk"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String aplcdt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcdt")));
String aplcno = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcno")));
String itemcd = Util.Uni2Ksc(Util.checkString(req.getParameter("itemcd")));
String accdno = Util.Uni2Ksc(Util.checkString(req.getParameter("accdno")));
String accddt = Util.Uni2Ksc(Util.checkString(req.getParameter("accddt")));
String accdqunt = Util.Uni2Ksc(Util.checkString(req.getParameter("accdqunt")));
String regdt = Util.Uni2Ksc(Util.checkString(req.getParameter("regdt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setAccflag(accflag);
dm.setDeptcd(deptcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setAplcdt(aplcdt);
dm.setAplcno(aplcno);
dm.setItemcd(itemcd);
dm.setAccdno(accdno);
dm.setAccddt(accddt);
dm.setAccdqunt(accdqunt);
dm.setRegdt(regdt);
dm.setRemk(remk);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 05 16:18:34 KST 2004 */