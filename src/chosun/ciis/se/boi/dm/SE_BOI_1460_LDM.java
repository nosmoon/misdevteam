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


package chosun.ciis.se.boi.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.boi.ds.*;
import chosun.ciis.se.boi.rec.*;

/**
 * 
 */


public class SE_BOI_1460_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String bo_cd;
	public String bo_seq;
	public String bo_cntr_dt;
	public String yymm1;
	public String yymm2;
	public String incmg_pers;

	public SE_BOI_1460_LDM(){}
	public SE_BOI_1460_LDM(String cmpy_cd, String bo_cd, String bo_seq, String bo_cntr_dt, String yymm1, String yymm2, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.bo_cd = bo_cd;
		this.bo_seq = bo_seq;
		this.bo_cntr_dt = bo_cntr_dt;
		this.yymm1 = yymm1;
		this.yymm2 = yymm2;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setBo_cntr_dt(String bo_cntr_dt){
		this.bo_cntr_dt = bo_cntr_dt;
	}

	public void setYymm1(String yymm1){
		this.yymm1 = yymm1;
	}

	public void setYymm2(String yymm2){
		this.yymm2 = yymm2;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getBo_cntr_dt(){
		return this.bo_cntr_dt;
	}

	public String getYymm1(){
		return this.yymm1;
	}

	public String getYymm2(){
		return this.yymm2;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_SE_BOI_1460_L( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BOI_1460_LDM dm = (SE_BOI_1460_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.bo_cd);
		cstmt.setString(5, dm.bo_seq);
		cstmt.setString(6, dm.bo_cntr_dt);
		cstmt.setString(7, dm.yymm1);
		cstmt.setString(8, dm.yymm2);
		cstmt.setString(9, dm.incmg_pers);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.boi.ds.SE_BOI_1460_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("bo_cd = " + getBo_cd());
        System.out.println("bo_seq = " + getBo_seq());
        System.out.println("bo_cntr_dt = " + getBo_cntr_dt());
        System.out.println("yymm1 = " + getYymm1());
        System.out.println("yymm2 = " + getYymm2());
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
String bo_cd = req.getParameter("bo_cd");
if( bo_cd == null){
	System.out.println(this.toString+" : bo_cd is null" );
}else{
	System.out.println(this.toString+" : bo_cd is "+bo_cd );
}
String bo_seq = req.getParameter("bo_seq");
if( bo_seq == null){
	System.out.println(this.toString+" : bo_seq is null" );
}else{
	System.out.println(this.toString+" : bo_seq is "+bo_seq );
}
String bo_cntr_dt = req.getParameter("bo_cntr_dt");
if( bo_cntr_dt == null){
	System.out.println(this.toString+" : bo_cntr_dt is null" );
}else{
	System.out.println(this.toString+" : bo_cntr_dt is "+bo_cntr_dt );
}
String yymm1 = req.getParameter("yymm1");
if( yymm1 == null){
	System.out.println(this.toString+" : yymm1 is null" );
}else{
	System.out.println(this.toString+" : yymm1 is "+yymm1 );
}
String yymm2 = req.getParameter("yymm2");
if( yymm2 == null){
	System.out.println(this.toString+" : yymm2 is null" );
}else{
	System.out.println(this.toString+" : yymm2 is "+yymm2 );
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
String bo_cd = Util.checkString(req.getParameter("bo_cd"));
String bo_seq = Util.checkString(req.getParameter("bo_seq"));
String bo_cntr_dt = Util.checkString(req.getParameter("bo_cntr_dt"));
String yymm1 = Util.checkString(req.getParameter("yymm1"));
String yymm2 = Util.checkString(req.getParameter("yymm2"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String bo_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cd")));
String bo_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_seq")));
String bo_cntr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cntr_dt")));
String yymm1 = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm1")));
String yymm2 = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm2")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBo_cd(bo_cd);
dm.setBo_seq(bo_seq);
dm.setBo_cntr_dt(bo_cntr_dt);
dm.setYymm1(yymm1);
dm.setYymm2(yymm2);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 04 21:25:55 KST 2009 */