/***************************************************************************************************
* 파일명 : SL_MO_A_COMM_APT_THRWDM.java
* 기능 :  아파트투입률조사_모바일용
* 작성일자 : 2017-01-19
* 작성자 : 장 선 희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 *
 */


public class SL_MO_A_COMM_APT_THRWDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String accflag;
	public String bocd;
	public String addrcd;
	public String dongno;
	public long pyong1;
	public long hoscnt1;
	public long pyong2;
	public long hoscnt2;
	public long pyong3;
	public long hoscnt3;
	public String invsgdt;
	public String invsgno;
	public String incmgpers;
	public String housval;
	public String regtype1;
	public String regtype2;
	public String aptfloor;
	public String aptho;

	public SL_MO_A_COMM_APT_THRWDM(){}
	public SL_MO_A_COMM_APT_THRWDM(String accflag, String bocd, String addrcd, String dongno, long pyong1, long hoscnt1, long pyong2, long hoscnt2, long pyong3, long hoscnt3, String invsgdt, String invsgno, String incmgpers, String housval, String regtype1, String regtype2, String aptfloor, String aptho){
		this.accflag = accflag;
		this.bocd = bocd;
		this.addrcd = addrcd;
		this.dongno = dongno;
		this.pyong1 = pyong1;
		this.hoscnt1 = hoscnt1;
		this.pyong2 = pyong2;
		this.hoscnt2 = hoscnt2;
		this.pyong3 = pyong3;
		this.hoscnt3 = hoscnt3;
		this.invsgdt = invsgdt;
		this.invsgno = invsgno;
		this.incmgpers = incmgpers;
		this.housval = housval;
		this.regtype1 = regtype1;
		this.regtype2 = regtype2;
		this.aptfloor = aptfloor;
		this.aptho = aptho;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setAddrcd(String addrcd){
		this.addrcd = addrcd;
	}

	public void setDongno(String dongno){
		this.dongno = dongno;
	}

	public void setPyong1(long pyong1){
		this.pyong1 = pyong1;
	}

	public void setHoscnt1(long hoscnt1){
		this.hoscnt1 = hoscnt1;
	}

	public void setPyong2(long pyong2){
		this.pyong2 = pyong2;
	}

	public void setHoscnt2(long hoscnt2){
		this.hoscnt2 = hoscnt2;
	}

	public void setPyong3(long pyong3){
		this.pyong3 = pyong3;
	}

	public void setHoscnt3(long hoscnt3){
		this.hoscnt3 = hoscnt3;
	}

	public void setInvsgdt(String invsgdt){
		this.invsgdt = invsgdt;
	}

	public void setInvsgno(String invsgno){
		this.invsgno = invsgno;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setHousval(String housval){
		this.housval = housval;
	}

	public void setRegtype1(String regtype1){
		this.regtype1 = regtype1;
	}

	public void setRegtype2(String regtype2){
		this.regtype2 = regtype2;
	}

	public void setAptfloor(String aptfloor){
		this.aptfloor = aptfloor;
	}

	public void setAptho(String aptho){
		this.aptho = aptho;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getAddrcd(){
		return this.addrcd;
	}

	public String getDongno(){
		return this.dongno;
	}

	public long getPyong1(){
		return this.pyong1;
	}

	public long getHoscnt1(){
		return this.hoscnt1;
	}

	public long getPyong2(){
		return this.pyong2;
	}

	public long getHoscnt2(){
		return this.hoscnt2;
	}

	public long getPyong3(){
		return this.pyong3;
	}

	public long getHoscnt3(){
		return this.hoscnt3;
	}

	public String getInvsgdt(){
		return this.invsgdt;
	}

	public String getInvsgno(){
		return this.invsgno;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getHousval(){
		return this.housval;
	}

	public String getRegtype1(){
		return this.regtype1;
	}

	public String getRegtype2(){
		return this.regtype2;
	}

	public String getAptfloor(){
		return this.aptfloor;
	}

	public String getAptho(){
		return this.aptho;
	}

	public String getSQL(){
		 return "{ call SP_SL_MO_A_COMM_APT_THRW( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_MO_A_COMM_APT_THRWDM dm = (SL_MO_A_COMM_APT_THRWDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.accflag);
		cstmt.setString(4, dm.bocd);
		cstmt.setString(5, dm.addrcd);
		cstmt.setString(6, dm.dongno);
		cstmt.setLong(7, dm.pyong1);
		cstmt.setLong(8, dm.hoscnt1);
		cstmt.setLong(9, dm.pyong2);
		cstmt.setLong(10, dm.hoscnt2);
		cstmt.setLong(11, dm.pyong3);
		cstmt.setLong(12, dm.hoscnt3);
		cstmt.setString(13, dm.invsgdt);
		cstmt.setString(14, dm.invsgno);
		cstmt.setString(15, dm.incmgpers);
		cstmt.setString(16, dm.housval);
		cstmt.setString(17, dm.regtype1);
		cstmt.setString(18, dm.regtype2);
		cstmt.setString(19, dm.aptfloor);
		cstmt.setString(20, dm.aptho);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SL_MO_A_COMM_APT_THRWDataSet();
	}



    public void print(){
        System.out.println("accflag = " + getAccflag());
        System.out.println("bocd = " + getBocd());
        System.out.println("addrcd = " + getAddrcd());
        System.out.println("dongno = " + getDongno());
        System.out.println("pyong1 = " + getPyong1());
        System.out.println("hoscnt1 = " + getHoscnt1());
        System.out.println("pyong2 = " + getPyong2());
        System.out.println("hoscnt2 = " + getHoscnt2());
        System.out.println("pyong3 = " + getPyong3());
        System.out.println("hoscnt3 = " + getHoscnt3());
        System.out.println("invsgdt = " + getInvsgdt());
        System.out.println("invsgno = " + getInvsgno());
        System.out.println("incmgpers = " + getIncmgpers());
        System.out.println("housval = " + getHousval());
        System.out.println("regtype1 = " + getRegtype1());
        System.out.println("regtype2 = " + getRegtype2());
        System.out.println("aptfloor = " + getAptfloor());
        System.out.println("aptho = " + getAptho());
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
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String addrcd = req.getParameter("addrcd");
if( addrcd == null){
	System.out.println(this.toString+" : addrcd is null" );
}else{
	System.out.println(this.toString+" : addrcd is "+addrcd );
}
String dongno = req.getParameter("dongno");
if( dongno == null){
	System.out.println(this.toString+" : dongno is null" );
}else{
	System.out.println(this.toString+" : dongno is "+dongno );
}
String pyong1 = req.getParameter("pyong1");
if( pyong1 == null){
	System.out.println(this.toString+" : pyong1 is null" );
}else{
	System.out.println(this.toString+" : pyong1 is "+pyong1 );
}
String hoscnt1 = req.getParameter("hoscnt1");
if( hoscnt1 == null){
	System.out.println(this.toString+" : hoscnt1 is null" );
}else{
	System.out.println(this.toString+" : hoscnt1 is "+hoscnt1 );
}
String pyong2 = req.getParameter("pyong2");
if( pyong2 == null){
	System.out.println(this.toString+" : pyong2 is null" );
}else{
	System.out.println(this.toString+" : pyong2 is "+pyong2 );
}
String hoscnt2 = req.getParameter("hoscnt2");
if( hoscnt2 == null){
	System.out.println(this.toString+" : hoscnt2 is null" );
}else{
	System.out.println(this.toString+" : hoscnt2 is "+hoscnt2 );
}
String pyong3 = req.getParameter("pyong3");
if( pyong3 == null){
	System.out.println(this.toString+" : pyong3 is null" );
}else{
	System.out.println(this.toString+" : pyong3 is "+pyong3 );
}
String hoscnt3 = req.getParameter("hoscnt3");
if( hoscnt3 == null){
	System.out.println(this.toString+" : hoscnt3 is null" );
}else{
	System.out.println(this.toString+" : hoscnt3 is "+hoscnt3 );
}
String invsgdt = req.getParameter("invsgdt");
if( invsgdt == null){
	System.out.println(this.toString+" : invsgdt is null" );
}else{
	System.out.println(this.toString+" : invsgdt is "+invsgdt );
}
String invsgno = req.getParameter("invsgno");
if( invsgno == null){
	System.out.println(this.toString+" : invsgno is null" );
}else{
	System.out.println(this.toString+" : invsgno is "+invsgno );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String housval = req.getParameter("housval");
if( housval == null){
	System.out.println(this.toString+" : housval is null" );
}else{
	System.out.println(this.toString+" : housval is "+housval );
}
String regtype1 = req.getParameter("regtype1");
if( regtype1 == null){
	System.out.println(this.toString+" : regtype1 is null" );
}else{
	System.out.println(this.toString+" : regtype1 is "+regtype1 );
}
String regtype2 = req.getParameter("regtype2");
if( regtype2 == null){
	System.out.println(this.toString+" : regtype2 is null" );
}else{
	System.out.println(this.toString+" : regtype2 is "+regtype2 );
}
String aptfloor = req.getParameter("aptfloor");
if( aptfloor == null){
	System.out.println(this.toString+" : aptfloor is null" );
}else{
	System.out.println(this.toString+" : aptfloor is "+aptfloor );
}
String aptho = req.getParameter("aptho");
if( aptho == null){
	System.out.println(this.toString+" : aptho is null" );
}else{
	System.out.println(this.toString+" : aptho is "+aptho );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String accflag = Util.checkString(req.getParameter("accflag"));
String bocd = Util.checkString(req.getParameter("bocd"));
String addrcd = Util.checkString(req.getParameter("addrcd"));
String dongno = Util.checkString(req.getParameter("dongno"));
String pyong1 = Util.checkString(req.getParameter("pyong1"));
String hoscnt1 = Util.checkString(req.getParameter("hoscnt1"));
String pyong2 = Util.checkString(req.getParameter("pyong2"));
String hoscnt2 = Util.checkString(req.getParameter("hoscnt2"));
String pyong3 = Util.checkString(req.getParameter("pyong3"));
String hoscnt3 = Util.checkString(req.getParameter("hoscnt3"));
String invsgdt = Util.checkString(req.getParameter("invsgdt"));
String invsgno = Util.checkString(req.getParameter("invsgno"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String housval = Util.checkString(req.getParameter("housval"));
String regtype1 = Util.checkString(req.getParameter("regtype1"));
String regtype2 = Util.checkString(req.getParameter("regtype2"));
String aptfloor = Util.checkString(req.getParameter("aptfloor"));
String aptho = Util.checkString(req.getParameter("aptho"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String addrcd = Util.Uni2Ksc(Util.checkString(req.getParameter("addrcd")));
String dongno = Util.Uni2Ksc(Util.checkString(req.getParameter("dongno")));
String pyong1 = Util.Uni2Ksc(Util.checkString(req.getParameter("pyong1")));
String hoscnt1 = Util.Uni2Ksc(Util.checkString(req.getParameter("hoscnt1")));
String pyong2 = Util.Uni2Ksc(Util.checkString(req.getParameter("pyong2")));
String hoscnt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("hoscnt2")));
String pyong3 = Util.Uni2Ksc(Util.checkString(req.getParameter("pyong3")));
String hoscnt3 = Util.Uni2Ksc(Util.checkString(req.getParameter("hoscnt3")));
String invsgdt = Util.Uni2Ksc(Util.checkString(req.getParameter("invsgdt")));
String invsgno = Util.Uni2Ksc(Util.checkString(req.getParameter("invsgno")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String housval = Util.Uni2Ksc(Util.checkString(req.getParameter("housval")));
String regtype1 = Util.Uni2Ksc(Util.checkString(req.getParameter("regtype1")));
String regtype2 = Util.Uni2Ksc(Util.checkString(req.getParameter("regtype2")));
String aptfloor = Util.Uni2Ksc(Util.checkString(req.getParameter("aptfloor")));
String aptho = Util.Uni2Ksc(Util.checkString(req.getParameter("aptho")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAccflag(accflag);
dm.setBocd(bocd);
dm.setAddrcd(addrcd);
dm.setDongno(dongno);
dm.setPyong1(pyong1);
dm.setHoscnt1(hoscnt1);
dm.setPyong2(pyong2);
dm.setHoscnt2(hoscnt2);
dm.setPyong3(pyong3);
dm.setHoscnt3(hoscnt3);
dm.setInvsgdt(invsgdt);
dm.setInvsgno(invsgno);
dm.setIncmgpers(incmgpers);
dm.setHousval(housval);
dm.setRegtype1(regtype1);
dm.setRegtype2(regtype2);
dm.setAptfloor(aptfloor);
dm.setAptho(aptho);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jan 19 19:17:43 KST 2017 */