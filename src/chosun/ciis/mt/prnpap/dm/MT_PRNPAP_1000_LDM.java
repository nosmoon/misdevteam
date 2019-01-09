/***************************************************************************************************
* 파일명 : MT_PRNPAP_1000_LDM.java
* 기능 :  원재료관리 / 인쇄용지 관리
* 작성일자 : 2009-03-30 
* 작성자 : 유경민
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.mt.prnpap.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.prnpap.ds.*;
import chosun.ciis.mt.prnpap.rec.*;

/**
 * 
 */


public class MT_PRNPAP_1000_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fac_clsf;
	public String papcmpy_cd;
	public String occr_dt_1;
	public String occr_qq_1;
	public String occr_dt_2;
	public String occr_qq_2;

	public MT_PRNPAP_1000_LDM(){}
	public MT_PRNPAP_1000_LDM(String cmpy_cd, String fac_clsf, String papcmpy_cd, String occr_dt_1, String occr_qq_1, String occr_dt_2, String occr_qq_2){
		this.cmpy_cd = cmpy_cd;
		this.fac_clsf = fac_clsf;
		this.papcmpy_cd = papcmpy_cd;
		this.occr_dt_1 = occr_dt_1;
		this.occr_qq_1 = occr_qq_1;
		this.occr_dt_2 = occr_dt_2;
		this.occr_qq_2 = occr_qq_2;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setPapcmpy_cd(String papcmpy_cd){
		this.papcmpy_cd = papcmpy_cd;
	}

	public void setOccr_dt_1(String occr_dt_1){
		this.occr_dt_1 = occr_dt_1;
	}

	public void setOccr_qq_1(String occr_qq_1){
		this.occr_qq_1 = occr_qq_1;
	}

	public void setOccr_dt_2(String occr_dt_2){
		this.occr_dt_2 = occr_dt_2;
	}

	public void setOccr_qq_2(String occr_qq_2){
		this.occr_qq_2 = occr_qq_2;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getPapcmpy_cd(){
		return this.papcmpy_cd;
	}

	public String getOccr_dt_1(){
		return this.occr_dt_1;
	}

	public String getOccr_qq_1(){
		return this.occr_qq_1;
	}

	public String getOccr_dt_2(){
		return this.occr_dt_2;
	}

	public String getOccr_qq_2(){
		return this.occr_qq_2;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PRNPAP_1000_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PRNPAP_1000_LDM dm = (MT_PRNPAP_1000_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fac_clsf);
		cstmt.setString(5, dm.papcmpy_cd);
		cstmt.setString(6, dm.occr_dt_1);
		cstmt.setString(7, dm.occr_qq_1);
		cstmt.setString(8, dm.occr_dt_2);
		cstmt.setString(9, dm.occr_qq_2);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.prnpap.ds.MT_PRNPAP_1000_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("papcmpy_cd = [" + getPapcmpy_cd() + "]");
		System.out.println("occr_dt_1 = [" + getOccr_dt_1() + "]");
		System.out.println("occr_qq_1 = [" + getOccr_qq_1() + "]");
		System.out.println("occr_dt_2 = [" + getOccr_dt_2() + "]");
		System.out.println("occr_qq_2 = [" + getOccr_qq_2() + "]");
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
String papcmpy_cd = req.getParameter("papcmpy_cd");
if( papcmpy_cd == null){
	System.out.println(this.toString+" : papcmpy_cd is null" );
}else{
	System.out.println(this.toString+" : papcmpy_cd is "+papcmpy_cd );
}
String occr_dt_1 = req.getParameter("occr_dt_1");
if( occr_dt_1 == null){
	System.out.println(this.toString+" : occr_dt_1 is null" );
}else{
	System.out.println(this.toString+" : occr_dt_1 is "+occr_dt_1 );
}
String occr_qq_1 = req.getParameter("occr_qq_1");
if( occr_qq_1 == null){
	System.out.println(this.toString+" : occr_qq_1 is null" );
}else{
	System.out.println(this.toString+" : occr_qq_1 is "+occr_qq_1 );
}
String occr_dt_2 = req.getParameter("occr_dt_2");
if( occr_dt_2 == null){
	System.out.println(this.toString+" : occr_dt_2 is null" );
}else{
	System.out.println(this.toString+" : occr_dt_2 is "+occr_dt_2 );
}
String occr_qq_2 = req.getParameter("occr_qq_2");
if( occr_qq_2 == null){
	System.out.println(this.toString+" : occr_qq_2 is null" );
}else{
	System.out.println(this.toString+" : occr_qq_2 is "+occr_qq_2 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String papcmpy_cd = Util.checkString(req.getParameter("papcmpy_cd"));
String occr_dt_1 = Util.checkString(req.getParameter("occr_dt_1"));
String occr_qq_1 = Util.checkString(req.getParameter("occr_qq_1"));
String occr_dt_2 = Util.checkString(req.getParameter("occr_dt_2"));
String occr_qq_2 = Util.checkString(req.getParameter("occr_qq_2"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String papcmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("papcmpy_cd")));
String occr_dt_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt_1")));
String occr_qq_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_qq_1")));
String occr_dt_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt_2")));
String occr_qq_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_qq_2")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFac_clsf(fac_clsf);
dm.setPapcmpy_cd(papcmpy_cd);
dm.setOccr_dt_1(occr_dt_1);
dm.setOccr_qq_1(occr_qq_1);
dm.setOccr_dt_2(occr_dt_2);
dm.setOccr_qq_2(occr_qq_2);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 30 17:09:10 KST 2009 */