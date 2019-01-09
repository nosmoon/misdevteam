/***************************************************************************************************
* 파일명 : SS_A_INSRACCDDM.java
* 기능 : 지국지원-상해보험-사고-등록,수정,삭제를 위한 DM
* 작성일자 : 2004-02-20
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
 * 지국지원-상해보험-사고-등록,수정,삭제를 위한 DM
 */

public class SS_A_INSRACCDDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String accflag;
	public String acpndt;
	public String accdacpnno;
	public String boemp_no;
	public String bocd;
	public String accddt;
	public String accdtm;
	public String cont;
	public String procstat;

	public SS_A_INSRACCDDM(){}
	public SS_A_INSRACCDDM(String incmgpers, String accflag, String acpndt, String accdacpnno, String boemp_no, String bocd, String accddt, String accdtm, String cont, String procstat){
		this.incmgpers = incmgpers;
		this.accflag = accflag;
		this.acpndt = acpndt;
		this.accdacpnno = accdacpnno;
		this.boemp_no = boemp_no;
		this.bocd = bocd;
		this.accddt = accddt;
		this.accdtm = accdtm;
		this.cont = cont;
		this.procstat = procstat;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setAcpndt(String acpndt){
		this.acpndt = acpndt;
	}

	public void setAccdacpnno(String accdacpnno){
		this.accdacpnno = accdacpnno;
	}

	public void setBoemp_no(String boemp_no){
		this.boemp_no = boemp_no;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setAccddt(String accddt){
		this.accddt = accddt;
	}

	public void setAccdtm(String accdtm){
		this.accdtm = accdtm;
	}

	public void setCont(String cont){
		this.cont = cont;
	}

	public void setProcstat(String procstat){
		this.procstat = procstat;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getAcpndt(){
		return this.acpndt;
	}

	public String getAccdacpnno(){
		return this.accdacpnno;
	}

	public String getBoemp_no(){
		return this.boemp_no;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getAccddt(){
		return this.accddt;
	}

	public String getAccdtm(){
		return this.accdtm;
	}

	public String getCont(){
		return this.cont;
	}

	public String getProcstat(){
		return this.procstat;
	}

	public String getSQL(){
		 return "{ call SP_SS_A_INSRACCD( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_INSRACCDDM dm = (SS_A_INSRACCDDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.accflag);
		cstmt.setString(5, dm.acpndt);
		cstmt.setString(6, dm.accdacpnno);
		cstmt.setString(7, dm.boemp_no);
		cstmt.setString(8, dm.bocd);
		cstmt.setString(9, dm.accddt);
		cstmt.setString(10, dm.accdtm);
		cstmt.setString(11, dm.cont);
		cstmt.setString(12, dm.procstat);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_A_INSRACCDDataSet();
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
String acpndt = req.getParameter("acpndt");
if( acpndt == null){
	System.out.println(this.toString+" : acpndt is null" );
}else{
	System.out.println(this.toString+" : acpndt is "+acpndt );
}
String accdacpnno = req.getParameter("accdacpnno");
if( accdacpnno == null){
	System.out.println(this.toString+" : accdacpnno is null" );
}else{
	System.out.println(this.toString+" : accdacpnno is "+accdacpnno );
}
String boemp_no = req.getParameter("boemp_no");
if( boemp_no == null){
	System.out.println(this.toString+" : boemp_no is null" );
}else{
	System.out.println(this.toString+" : boemp_no is "+boemp_no );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String accddt = req.getParameter("accddt");
if( accddt == null){
	System.out.println(this.toString+" : accddt is null" );
}else{
	System.out.println(this.toString+" : accddt is "+accddt );
}
String accdtm = req.getParameter("accdtm");
if( accdtm == null){
	System.out.println(this.toString+" : accdtm is null" );
}else{
	System.out.println(this.toString+" : accdtm is "+accdtm );
}
String cont = req.getParameter("cont");
if( cont == null){
	System.out.println(this.toString+" : cont is null" );
}else{
	System.out.println(this.toString+" : cont is "+cont );
}
String procstat = req.getParameter("procstat");
if( procstat == null){
	System.out.println(this.toString+" : procstat is null" );
}else{
	System.out.println(this.toString+" : procstat is "+procstat );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String accflag = Util.checkString(req.getParameter("accflag"));
String acpndt = Util.checkString(req.getParameter("acpndt"));
String accdacpnno = Util.checkString(req.getParameter("accdacpnno"));
String boemp_no = Util.checkString(req.getParameter("boemp_no"));
String bocd = Util.checkString(req.getParameter("bocd"));
String accddt = Util.checkString(req.getParameter("accddt"));
String accdtm = Util.checkString(req.getParameter("accdtm"));
String cont = Util.checkString(req.getParameter("cont"));
String procstat = Util.checkString(req.getParameter("procstat"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String acpndt = Util.Uni2Ksc(Util.checkString(req.getParameter("acpndt")));
String accdacpnno = Util.Uni2Ksc(Util.checkString(req.getParameter("accdacpnno")));
String boemp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("boemp_no")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String accddt = Util.Uni2Ksc(Util.checkString(req.getParameter("accddt")));
String accdtm = Util.Uni2Ksc(Util.checkString(req.getParameter("accdtm")));
String cont = Util.Uni2Ksc(Util.checkString(req.getParameter("cont")));
String procstat = Util.Uni2Ksc(Util.checkString(req.getParameter("procstat")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setAccflag(accflag);
dm.setAcpndt(acpndt);
dm.setAccdacpnno(accdacpnno);
dm.setBoemp_no(boemp_no);
dm.setBocd(bocd);
dm.setAccddt(accddt);
dm.setAccdtm(accdtm);
dm.setCont(cont);
dm.setProcstat(procstat);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Feb 22 19:07:24 KST 2004 */