/***************************************************************************************************
* 파일명 : .java
* 기능 : 기초정보관리 - 장표관리
* 작성일자 : 2010-04-12
* 작성자 : 이민효
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.as.test.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.commatr.ds.*;
import chosun.ciis.mt.commatr.rec.*;

/**
 * 
 */


public class AS_TEST_1002_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers;
	public String sche_name;
	public String proc_name;
	public String dev_yn;
	public String real_yn;

	public AS_TEST_1002_LDM(){}
	public AS_TEST_1002_LDM(String cmpy_cd, String incmg_pers, String sche_name, String proc_name, String dev_yn, String real_yn){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.sche_name = sche_name;
		this.proc_name = proc_name;
		this.dev_yn = dev_yn;
		this.real_yn = real_yn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setSche_name(String sche_name){
		this.sche_name = sche_name;
	}

	public void setProc_name(String proc_name){
		this.proc_name = proc_name;
	}

	public void setDev_yn(String dev_yn){
		this.dev_yn = dev_yn;
	}

	public void setReal_yn(String real_yn){
		this.real_yn = real_yn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSche_name(){
		return this.sche_name;
	}

	public String getProc_name(){
		return this.proc_name;
	}

	public String getDev_yn(){
		return this.dev_yn;
	}

	public String getReal_yn(){
		return this.real_yn;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_TEST_1002_L( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_TEST_1002_LDM dm = (AS_TEST_1002_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.sche_name);
		cstmt.setString(6, dm.proc_name);
		cstmt.setString(7, dm.dev_yn);
		cstmt.setString(8, dm.real_yn);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.test.ds.AS_TEST_1002_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("proc_name = " + getProc_name());
        System.out.println("sche_name = " + getSche_name());
        System.out.println("dev_yn = " + getDev_yn());
        System.out.println("real_yn = " + getReal_yn());
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
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yymm = Util.checkString(req.getParameter("yymm"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYymm(yymm);
dm.setMedi_cd(medi_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 12 14:44:41 KST 2010 */