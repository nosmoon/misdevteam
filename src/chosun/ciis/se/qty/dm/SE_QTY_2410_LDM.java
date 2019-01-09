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


package chosun.ciis.se.qty.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.qty.ds.*;
import chosun.ciis.se.qty.rec.*;

/**
 * 
 */


public class SE_QTY_2410_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String issu_dt1;
	public String issu_dt2;
	public String send_clos_grp_clsf;
	public String incmg_pers;

	public SE_QTY_2410_LDM(){}
	public SE_QTY_2410_LDM(String cmpy_cd, String issu_dt1, String issu_dt2, String send_clos_grp_clsf, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.issu_dt1 = issu_dt1;
		this.issu_dt2 = issu_dt2;
		this.send_clos_grp_clsf = send_clos_grp_clsf;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIssu_dt1(String issu_dt1){
		this.issu_dt1 = issu_dt1;
	}

	public void setIssu_dt2(String issu_dt2){
		this.issu_dt2 = issu_dt2;
	}

	public void setSend_clos_grp_clsf(String send_clos_grp_clsf){
		this.send_clos_grp_clsf = send_clos_grp_clsf;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIssu_dt1(){
		return this.issu_dt1;
	}

	public String getIssu_dt2(){
		return this.issu_dt2;
	}

	public String getSend_clos_grp_clsf(){
		return this.send_clos_grp_clsf;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_QTY_2410_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_QTY_2410_LDM dm = (SE_QTY_2410_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.issu_dt1);
		cstmt.setString(5, dm.issu_dt2);
		cstmt.setString(6, dm.send_clos_grp_clsf);
		cstmt.setString(7, dm.incmg_pers);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.qty.ds.SE_QTY_2410_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("issu_dt1 = " + getIssu_dt1());
        System.out.println("issu_dt2 = " + getIssu_dt2());
        System.out.println("send_clos_grp_clsf = " + getSend_clos_grp_clsf());
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
String issu_dt1 = req.getParameter("issu_dt1");
if( issu_dt1 == null){
	System.out.println(this.toString+" : issu_dt1 is null" );
}else{
	System.out.println(this.toString+" : issu_dt1 is "+issu_dt1 );
}
String issu_dt2 = req.getParameter("issu_dt2");
if( issu_dt2 == null){
	System.out.println(this.toString+" : issu_dt2 is null" );
}else{
	System.out.println(this.toString+" : issu_dt2 is "+issu_dt2 );
}
String send_clos_grp_clsf = req.getParameter("send_clos_grp_clsf");
if( send_clos_grp_clsf == null){
	System.out.println(this.toString+" : send_clos_grp_clsf is null" );
}else{
	System.out.println(this.toString+" : send_clos_grp_clsf is "+send_clos_grp_clsf );
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
String issu_dt1 = Util.checkString(req.getParameter("issu_dt1"));
String issu_dt2 = Util.checkString(req.getParameter("issu_dt2"));
String send_clos_grp_clsf = Util.checkString(req.getParameter("send_clos_grp_clsf"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String issu_dt1 = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt1")));
String issu_dt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt2")));
String send_clos_grp_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("send_clos_grp_clsf")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIssu_dt1(issu_dt1);
dm.setIssu_dt2(issu_dt2);
dm.setSend_clos_grp_clsf(send_clos_grp_clsf);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 17 19:51:44 KST 2009 */