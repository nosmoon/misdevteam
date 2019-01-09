/***************************************************************************************************
* 파일명 : SS_A_VSCDDM.java
* 기능 : 독자현황-VacationStop-등록,수정,삭제를 위한 DM
* 작성일자 : 2004-03-20
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.rdr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sls.rdr.rec.*;

/**
 * 독자현황-VacationStop-등록,수정,삭제를 위한 DM
 */

public class SS_A_VSCDDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String accflag;
	public String incmgpers;
	public String vaca_arearegncd;
	public String vaca_areacd;
	public String vaca_arearegnnm;
	public String vaca_areanm;
	public String vaca_areatel_no1;
	public String vaca_areatel_no2;
	public String vaca_areatel_no3;
	public String vaca_areazip;
	public String vaca_areaaddr;
	public String vaca_areadtlsaddr;
	public String bocd;
	public String descri;

	public SS_A_VSCDDM(){}
	public SS_A_VSCDDM(String accflag, String incmgpers, String vaca_arearegncd, String vaca_areacd, String vaca_arearegnnm, String vaca_areanm, String vaca_areatel_no1, String vaca_areatel_no2, String vaca_areatel_no3, String vaca_areazip, String vaca_areaaddr, String vaca_areadtlsaddr, String bocd, String descri){
		this.accflag = accflag;
		this.incmgpers = incmgpers;
		this.vaca_arearegncd = vaca_arearegncd;
		this.vaca_areacd = vaca_areacd;
		this.vaca_arearegnnm = vaca_arearegnnm;
		this.vaca_areanm = vaca_areanm;
		this.vaca_areatel_no1 = vaca_areatel_no1;
		this.vaca_areatel_no2 = vaca_areatel_no2;
		this.vaca_areatel_no3 = vaca_areatel_no3;
		this.vaca_areazip = vaca_areazip;
		this.vaca_areaaddr = vaca_areaaddr;
		this.vaca_areadtlsaddr = vaca_areadtlsaddr;
		this.bocd = bocd;
		this.descri = descri;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setVaca_arearegncd(String vaca_arearegncd){
		this.vaca_arearegncd = vaca_arearegncd;
	}

	public void setVaca_areacd(String vaca_areacd){
		this.vaca_areacd = vaca_areacd;
	}

	public void setVaca_arearegnnm(String vaca_arearegnnm){
		this.vaca_arearegnnm = vaca_arearegnnm;
	}

	public void setVaca_areanm(String vaca_areanm){
		this.vaca_areanm = vaca_areanm;
	}

	public void setVaca_areatel_no1(String vaca_areatel_no1){
		this.vaca_areatel_no1 = vaca_areatel_no1;
	}

	public void setVaca_areatel_no2(String vaca_areatel_no2){
		this.vaca_areatel_no2 = vaca_areatel_no2;
	}

	public void setVaca_areatel_no3(String vaca_areatel_no3){
		this.vaca_areatel_no3 = vaca_areatel_no3;
	}

	public void setVaca_areazip(String vaca_areazip){
		this.vaca_areazip = vaca_areazip;
	}

	public void setVaca_areaaddr(String vaca_areaaddr){
		this.vaca_areaaddr = vaca_areaaddr;
	}

	public void setVaca_areadtlsaddr(String vaca_areadtlsaddr){
		this.vaca_areadtlsaddr = vaca_areadtlsaddr;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setDescri(String descri){
		this.descri = descri;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getVaca_arearegncd(){
		return this.vaca_arearegncd;
	}

	public String getVaca_areacd(){
		return this.vaca_areacd;
	}

	public String getVaca_arearegnnm(){
		return this.vaca_arearegnnm;
	}

	public String getVaca_areanm(){
		return this.vaca_areanm;
	}

	public String getVaca_areatel_no1(){
		return this.vaca_areatel_no1;
	}

	public String getVaca_areatel_no2(){
		return this.vaca_areatel_no2;
	}

	public String getVaca_areatel_no3(){
		return this.vaca_areatel_no3;
	}

	public String getVaca_areazip(){
		return this.vaca_areazip;
	}

	public String getVaca_areaaddr(){
		return this.vaca_areaaddr;
	}

	public String getVaca_areadtlsaddr(){
		return this.vaca_areadtlsaddr;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getDescri(){
		return this.descri;
	}

	public String getSQL(){
		 return "{ call SP_SS_A_VSCD( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_VSCDDM dm = (SS_A_VSCDDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.accflag);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.vaca_arearegncd);
		cstmt.setString(6, dm.vaca_areacd);
		cstmt.setString(7, dm.vaca_arearegnnm);
		cstmt.setString(8, dm.vaca_areanm);
		cstmt.setString(9, dm.vaca_areatel_no1);
		cstmt.setString(10, dm.vaca_areatel_no2);
		cstmt.setString(11, dm.vaca_areatel_no3);
		cstmt.setString(12, dm.vaca_areazip);
		cstmt.setString(13, dm.vaca_areaaddr);
		cstmt.setString(14, dm.vaca_areadtlsaddr);
		cstmt.setString(15, dm.bocd);
		cstmt.setString(16, dm.descri);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.rdr.ds.SS_A_VSCDDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String vaca_arearegncd = req.getParameter("vaca_arearegncd");
if( vaca_arearegncd == null){
	System.out.println(this.toString+" : vaca_arearegncd is null" );
}else{
	System.out.println(this.toString+" : vaca_arearegncd is "+vaca_arearegncd );
}
String vaca_areacd = req.getParameter("vaca_areacd");
if( vaca_areacd == null){
	System.out.println(this.toString+" : vaca_areacd is null" );
}else{
	System.out.println(this.toString+" : vaca_areacd is "+vaca_areacd );
}
String vaca_arearegnnm = req.getParameter("vaca_arearegnnm");
if( vaca_arearegnnm == null){
	System.out.println(this.toString+" : vaca_arearegnnm is null" );
}else{
	System.out.println(this.toString+" : vaca_arearegnnm is "+vaca_arearegnnm );
}
String vaca_areanm = req.getParameter("vaca_areanm");
if( vaca_areanm == null){
	System.out.println(this.toString+" : vaca_areanm is null" );
}else{
	System.out.println(this.toString+" : vaca_areanm is "+vaca_areanm );
}
String vaca_areatel_no1 = req.getParameter("vaca_areatel_no1");
if( vaca_areatel_no1 == null){
	System.out.println(this.toString+" : vaca_areatel_no1 is null" );
}else{
	System.out.println(this.toString+" : vaca_areatel_no1 is "+vaca_areatel_no1 );
}
String vaca_areatel_no2 = req.getParameter("vaca_areatel_no2");
if( vaca_areatel_no2 == null){
	System.out.println(this.toString+" : vaca_areatel_no2 is null" );
}else{
	System.out.println(this.toString+" : vaca_areatel_no2 is "+vaca_areatel_no2 );
}
String vaca_areatel_no3 = req.getParameter("vaca_areatel_no3");
if( vaca_areatel_no3 == null){
	System.out.println(this.toString+" : vaca_areatel_no3 is null" );
}else{
	System.out.println(this.toString+" : vaca_areatel_no3 is "+vaca_areatel_no3 );
}
String vaca_areazip = req.getParameter("vaca_areazip");
if( vaca_areazip == null){
	System.out.println(this.toString+" : vaca_areazip is null" );
}else{
	System.out.println(this.toString+" : vaca_areazip is "+vaca_areazip );
}
String vaca_areaaddr = req.getParameter("vaca_areaaddr");
if( vaca_areaaddr == null){
	System.out.println(this.toString+" : vaca_areaaddr is null" );
}else{
	System.out.println(this.toString+" : vaca_areaaddr is "+vaca_areaaddr );
}
String vaca_areadtlsaddr = req.getParameter("vaca_areadtlsaddr");
if( vaca_areadtlsaddr == null){
	System.out.println(this.toString+" : vaca_areadtlsaddr is null" );
}else{
	System.out.println(this.toString+" : vaca_areadtlsaddr is "+vaca_areadtlsaddr );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String descri = req.getParameter("descri");
if( descri == null){
	System.out.println(this.toString+" : descri is null" );
}else{
	System.out.println(this.toString+" : descri is "+descri );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String accflag = Util.checkString(req.getParameter("accflag"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String vaca_arearegncd = Util.checkString(req.getParameter("vaca_arearegncd"));
String vaca_areacd = Util.checkString(req.getParameter("vaca_areacd"));
String vaca_arearegnnm = Util.checkString(req.getParameter("vaca_arearegnnm"));
String vaca_areanm = Util.checkString(req.getParameter("vaca_areanm"));
String vaca_areatel_no1 = Util.checkString(req.getParameter("vaca_areatel_no1"));
String vaca_areatel_no2 = Util.checkString(req.getParameter("vaca_areatel_no2"));
String vaca_areatel_no3 = Util.checkString(req.getParameter("vaca_areatel_no3"));
String vaca_areazip = Util.checkString(req.getParameter("vaca_areazip"));
String vaca_areaaddr = Util.checkString(req.getParameter("vaca_areaaddr"));
String vaca_areadtlsaddr = Util.checkString(req.getParameter("vaca_areadtlsaddr"));
String bocd = Util.checkString(req.getParameter("bocd"));
String descri = Util.checkString(req.getParameter("descri"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String vaca_arearegncd = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_arearegncd")));
String vaca_areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_areacd")));
String vaca_arearegnnm = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_arearegnnm")));
String vaca_areanm = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_areanm")));
String vaca_areatel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_areatel_no1")));
String vaca_areatel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_areatel_no2")));
String vaca_areatel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_areatel_no3")));
String vaca_areazip = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_areazip")));
String vaca_areaaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_areaaddr")));
String vaca_areadtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_areadtlsaddr")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String descri = Util.Uni2Ksc(Util.checkString(req.getParameter("descri")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAccflag(accflag);
dm.setIncmgpers(incmgpers);
dm.setVaca_arearegncd(vaca_arearegncd);
dm.setVaca_areacd(vaca_areacd);
dm.setVaca_arearegnnm(vaca_arearegnnm);
dm.setVaca_areanm(vaca_areanm);
dm.setVaca_areatel_no1(vaca_areatel_no1);
dm.setVaca_areatel_no2(vaca_areatel_no2);
dm.setVaca_areatel_no3(vaca_areatel_no3);
dm.setVaca_areazip(vaca_areazip);
dm.setVaca_areaaddr(vaca_areaaddr);
dm.setVaca_areadtlsaddr(vaca_areadtlsaddr);
dm.setBocd(bocd);
dm.setDescri(descri);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 29 11:39:03 KST 2004 */