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


package chosun.ciis.se.trg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.trg.ds.*;
import chosun.ciis.se.trg.rec.*;

/**
 * 
 */


public class SE_TRG_1710_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yy1;
	public String yy2;
	public String incmg_pers;

	public SE_TRG_1710_LDM(){}
	public SE_TRG_1710_LDM(String cmpy_cd, String yy1, String yy2, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.yy1 = yy1;
		this.yy2 = yy2;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYy1(String yy1){
		this.yy1 = yy1;
	}

	public void setYy2(String yy2){
		this.yy2 = yy2;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYy1(){
		return this.yy1;
	}

	public String getYy2(){
		return this.yy2;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_TRG_1710_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_TRG_1710_LDM dm = (SE_TRG_1710_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yy1);
		cstmt.setString(5, dm.yy2);
		cstmt.setString(6, dm.incmg_pers);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.trg.ds.SE_TRG_1710_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("yy1 = " + getYy1());
        System.out.println("yy2 = " + getYy2());
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
String yy1 = req.getParameter("yy1");
if( yy1 == null){
	System.out.println(this.toString+" : yy1 is null" );
}else{
	System.out.println(this.toString+" : yy1 is "+yy1 );
}
String yy2 = req.getParameter("yy2");
if( yy2 == null){
	System.out.println(this.toString+" : yy2 is null" );
}else{
	System.out.println(this.toString+" : yy2 is "+yy2 );
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
String yy1 = Util.checkString(req.getParameter("yy1"));
String yy2 = Util.checkString(req.getParameter("yy2"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yy1 = Util.Uni2Ksc(Util.checkString(req.getParameter("yy1")));
String yy2 = Util.Uni2Ksc(Util.checkString(req.getParameter("yy2")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYy1(yy1);
dm.setYy2(yy2);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 13 14:45:17 KST 2009 */