/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.comm.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.comm.ds.*;
import chosun.ciis.se.comm.rec.*;

/**
 * 
 */


public class SE_COMM_1710_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String slip_occr_dt1;
	public String slip_occr_dt2;
	public String incmg_pers;

	public SE_COMM_1710_LDM(){}
	public SE_COMM_1710_LDM(String cmpy_cd, String slip_occr_dt1, String slip_occr_dt2, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.slip_occr_dt1 = slip_occr_dt1;
		this.slip_occr_dt2 = slip_occr_dt2;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSlip_occr_dt1(String slip_occr_dt1){
		this.slip_occr_dt1 = slip_occr_dt1;
	}

	public void setSlip_occr_dt2(String slip_occr_dt2){
		this.slip_occr_dt2 = slip_occr_dt2;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSlip_occr_dt1(){
		return this.slip_occr_dt1;
	}

	public String getSlip_occr_dt2(){
		return this.slip_occr_dt2;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_COMM_1710_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_COMM_1710_LDM dm = (SE_COMM_1710_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.slip_occr_dt1);
		cstmt.setString(5, dm.slip_occr_dt2);
		cstmt.setString(6, dm.incmg_pers);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.comm.ds.SE_COMM_1710_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("slip_occr_dt1 = " + getSlip_occr_dt1());
        System.out.println("slip_occr_dt2 = " + getSlip_occr_dt2());
        System.out.println("incmg_pers = " + getIncmg_pers());
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
String slip_occr_dt1 = req.getParameter("slip_occr_dt1");
if( slip_occr_dt1 == null){
	System.out.println(this.toString+" : slip_occr_dt1 is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt1 is "+slip_occr_dt1 );
}
String slip_occr_dt2 = req.getParameter("slip_occr_dt2");
if( slip_occr_dt2 == null){
	System.out.println(this.toString+" : slip_occr_dt2 is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt2 is "+slip_occr_dt2 );
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
String slip_occr_dt1 = Util.checkString(req.getParameter("slip_occr_dt1"));
String slip_occr_dt2 = Util.checkString(req.getParameter("slip_occr_dt2"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String slip_occr_dt1 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt1")));
String slip_occr_dt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt2")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSlip_occr_dt1(slip_occr_dt1);
dm.setSlip_occr_dt2(slip_occr_dt2);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 22 14:03:02 KST 2009 */