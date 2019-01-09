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


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_7011_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fisc_fr;
	public String fisc_to;
	public String acct_cd1;
	public String acct_cd2;
	public String acct_cd3;
	public String acct_cd4;
	public String acct_cd5;
	public String acct_cd6;
	public String acct_cd7;
	public String acct_cd8;
	public String acct_cd9;
	public String acct_cd10;
	public String acct_cd11;
	public String acct_cd12;

	public FC_ACCT_7011_LDM(){}
	public FC_ACCT_7011_LDM(String cmpy_cd, String fisc_fr, String fisc_to, String acct_cd1, String acct_cd2, String acct_cd3, String acct_cd4, String acct_cd5, String acct_cd6, String acct_cd7, String acct_cd8, String acct_cd9, String acct_cd10, String acct_cd11, String acct_cd12){
		this.cmpy_cd = cmpy_cd;
		this.fisc_fr = fisc_fr;
		this.fisc_to = fisc_to;
		this.acct_cd1 = acct_cd1;
		this.acct_cd2 = acct_cd2;
		this.acct_cd3 = acct_cd3;
		this.acct_cd4 = acct_cd4;
		this.acct_cd5 = acct_cd5;
		this.acct_cd6 = acct_cd6;
		this.acct_cd7 = acct_cd7;
		this.acct_cd8 = acct_cd8;
		this.acct_cd9 = acct_cd9;
		this.acct_cd10 = acct_cd10;
		this.acct_cd11 = acct_cd11;
		this.acct_cd12 = acct_cd12;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFisc_fr(String fisc_fr){
		this.fisc_fr = fisc_fr;
	}

	public void setFisc_to(String fisc_to){
		this.fisc_to = fisc_to;
	}

	public void setAcct_cd1(String acct_cd1){
		this.acct_cd1 = acct_cd1;
	}

	public void setAcct_cd2(String acct_cd2){
		this.acct_cd2 = acct_cd2;
	}

	public void setAcct_cd3(String acct_cd3){
		this.acct_cd3 = acct_cd3;
	}

	public void setAcct_cd4(String acct_cd4){
		this.acct_cd4 = acct_cd4;
	}

	public void setAcct_cd5(String acct_cd5){
		this.acct_cd5 = acct_cd5;
	}

	public void setAcct_cd6(String acct_cd6){
		this.acct_cd6 = acct_cd6;
	}

	public void setAcct_cd7(String acct_cd7){
		this.acct_cd7 = acct_cd7;
	}

	public void setAcct_cd8(String acct_cd8){
		this.acct_cd8 = acct_cd8;
	}

	public void setAcct_cd9(String acct_cd9){
		this.acct_cd9 = acct_cd9;
	}

	public void setAcct_cd10(String acct_cd10){
		this.acct_cd10 = acct_cd10;
	}

	public void setAcct_cd11(String acct_cd11){
		this.acct_cd11 = acct_cd11;
	}

	public void setAcct_cd12(String acct_cd12){
		this.acct_cd12 = acct_cd12;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFisc_fr(){
		return this.fisc_fr;
	}

	public String getFisc_to(){
		return this.fisc_to;
	}

	public String getAcct_cd1(){
		return this.acct_cd1;
	}

	public String getAcct_cd2(){
		return this.acct_cd2;
	}

	public String getAcct_cd3(){
		return this.acct_cd3;
	}

	public String getAcct_cd4(){
		return this.acct_cd4;
	}

	public String getAcct_cd5(){
		return this.acct_cd5;
	}

	public String getAcct_cd6(){
		return this.acct_cd6;
	}

	public String getAcct_cd7(){
		return this.acct_cd7;
	}

	public String getAcct_cd8(){
		return this.acct_cd8;
	}

	public String getAcct_cd9(){
		return this.acct_cd9;
	}

	public String getAcct_cd10(){
		return this.acct_cd10;
	}

	public String getAcct_cd11(){
		return this.acct_cd11;
	}

	public String getAcct_cd12(){
		return this.acct_cd12;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_7011_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_7011_LDM dm = (FC_ACCT_7011_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fisc_fr);
		cstmt.setString(5, dm.fisc_to);
		cstmt.setString(6, dm.acct_cd1);
		cstmt.setString(7, dm.acct_cd2);
		cstmt.setString(8, dm.acct_cd3);
		cstmt.setString(9, dm.acct_cd4);
		cstmt.setString(10, dm.acct_cd5);
		cstmt.setString(11, dm.acct_cd6);
		cstmt.setString(12, dm.acct_cd7);
		cstmt.setString(13, dm.acct_cd8);
		cstmt.setString(14, dm.acct_cd9);
		cstmt.setString(15, dm.acct_cd10);
		cstmt.setString(16, dm.acct_cd11);
		cstmt.setString(17, dm.acct_cd12);
		cstmt.registerOutParameter(18, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_7011_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("fisc_fr = " + getFisc_fr());
        System.out.println("fisc_to = " + getFisc_to());
        System.out.println("acct_cd1 = " + getAcct_cd1());
        System.out.println("acct_cd2 = " + getAcct_cd2());
        System.out.println("acct_cd3 = " + getAcct_cd3());
        System.out.println("acct_cd4 = " + getAcct_cd4());
        System.out.println("acct_cd5 = " + getAcct_cd5());
        System.out.println("acct_cd6 = " + getAcct_cd6());
        System.out.println("acct_cd7 = " + getAcct_cd7());
        System.out.println("acct_cd8 = " + getAcct_cd8());
        System.out.println("acct_cd9 = " + getAcct_cd9());
        System.out.println("acct_cd10 = " + getAcct_cd10());
        System.out.println("acct_cd11 = " + getAcct_cd11());
        System.out.println("acct_cd12 = " + getAcct_cd12());
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
String fisc_fr = req.getParameter("fisc_fr");
if( fisc_fr == null){
	System.out.println(this.toString+" : fisc_fr is null" );
}else{
	System.out.println(this.toString+" : fisc_fr is "+fisc_fr );
}
String fisc_to = req.getParameter("fisc_to");
if( fisc_to == null){
	System.out.println(this.toString+" : fisc_to is null" );
}else{
	System.out.println(this.toString+" : fisc_to is "+fisc_to );
}
String acct_cd1 = req.getParameter("acct_cd1");
if( acct_cd1 == null){
	System.out.println(this.toString+" : acct_cd1 is null" );
}else{
	System.out.println(this.toString+" : acct_cd1 is "+acct_cd1 );
}
String acct_cd2 = req.getParameter("acct_cd2");
if( acct_cd2 == null){
	System.out.println(this.toString+" : acct_cd2 is null" );
}else{
	System.out.println(this.toString+" : acct_cd2 is "+acct_cd2 );
}
String acct_cd3 = req.getParameter("acct_cd3");
if( acct_cd3 == null){
	System.out.println(this.toString+" : acct_cd3 is null" );
}else{
	System.out.println(this.toString+" : acct_cd3 is "+acct_cd3 );
}
String acct_cd4 = req.getParameter("acct_cd4");
if( acct_cd4 == null){
	System.out.println(this.toString+" : acct_cd4 is null" );
}else{
	System.out.println(this.toString+" : acct_cd4 is "+acct_cd4 );
}
String acct_cd5 = req.getParameter("acct_cd5");
if( acct_cd5 == null){
	System.out.println(this.toString+" : acct_cd5 is null" );
}else{
	System.out.println(this.toString+" : acct_cd5 is "+acct_cd5 );
}
String acct_cd6 = req.getParameter("acct_cd6");
if( acct_cd6 == null){
	System.out.println(this.toString+" : acct_cd6 is null" );
}else{
	System.out.println(this.toString+" : acct_cd6 is "+acct_cd6 );
}
String acct_cd7 = req.getParameter("acct_cd7");
if( acct_cd7 == null){
	System.out.println(this.toString+" : acct_cd7 is null" );
}else{
	System.out.println(this.toString+" : acct_cd7 is "+acct_cd7 );
}
String acct_cd8 = req.getParameter("acct_cd8");
if( acct_cd8 == null){
	System.out.println(this.toString+" : acct_cd8 is null" );
}else{
	System.out.println(this.toString+" : acct_cd8 is "+acct_cd8 );
}
String acct_cd9 = req.getParameter("acct_cd9");
if( acct_cd9 == null){
	System.out.println(this.toString+" : acct_cd9 is null" );
}else{
	System.out.println(this.toString+" : acct_cd9 is "+acct_cd9 );
}
String acct_cd10 = req.getParameter("acct_cd10");
if( acct_cd10 == null){
	System.out.println(this.toString+" : acct_cd10 is null" );
}else{
	System.out.println(this.toString+" : acct_cd10 is "+acct_cd10 );
}
String acct_cd11 = req.getParameter("acct_cd11");
if( acct_cd11 == null){
	System.out.println(this.toString+" : acct_cd11 is null" );
}else{
	System.out.println(this.toString+" : acct_cd11 is "+acct_cd11 );
}
String acct_cd12 = req.getParameter("acct_cd12");
if( acct_cd12 == null){
	System.out.println(this.toString+" : acct_cd12 is null" );
}else{
	System.out.println(this.toString+" : acct_cd12 is "+acct_cd12 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fisc_fr = Util.checkString(req.getParameter("fisc_fr"));
String fisc_to = Util.checkString(req.getParameter("fisc_to"));
String acct_cd1 = Util.checkString(req.getParameter("acct_cd1"));
String acct_cd2 = Util.checkString(req.getParameter("acct_cd2"));
String acct_cd3 = Util.checkString(req.getParameter("acct_cd3"));
String acct_cd4 = Util.checkString(req.getParameter("acct_cd4"));
String acct_cd5 = Util.checkString(req.getParameter("acct_cd5"));
String acct_cd6 = Util.checkString(req.getParameter("acct_cd6"));
String acct_cd7 = Util.checkString(req.getParameter("acct_cd7"));
String acct_cd8 = Util.checkString(req.getParameter("acct_cd8"));
String acct_cd9 = Util.checkString(req.getParameter("acct_cd9"));
String acct_cd10 = Util.checkString(req.getParameter("acct_cd10"));
String acct_cd11 = Util.checkString(req.getParameter("acct_cd11"));
String acct_cd12 = Util.checkString(req.getParameter("acct_cd12"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fisc_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_fr")));
String fisc_to = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_to")));
String acct_cd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd1")));
String acct_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd2")));
String acct_cd3 = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd3")));
String acct_cd4 = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd4")));
String acct_cd5 = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd5")));
String acct_cd6 = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd6")));
String acct_cd7 = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd7")));
String acct_cd8 = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd8")));
String acct_cd9 = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd9")));
String acct_cd10 = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd10")));
String acct_cd11 = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd11")));
String acct_cd12 = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd12")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFisc_fr(fisc_fr);
dm.setFisc_to(fisc_to);
dm.setAcct_cd1(acct_cd1);
dm.setAcct_cd2(acct_cd2);
dm.setAcct_cd3(acct_cd3);
dm.setAcct_cd4(acct_cd4);
dm.setAcct_cd5(acct_cd5);
dm.setAcct_cd6(acct_cd6);
dm.setAcct_cd7(acct_cd7);
dm.setAcct_cd8(acct_cd8);
dm.setAcct_cd9(acct_cd9);
dm.setAcct_cd10(acct_cd10);
dm.setAcct_cd11(acct_cd11);
dm.setAcct_cd12(acct_cd12);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Feb 06 15:09:48 KST 2009 */