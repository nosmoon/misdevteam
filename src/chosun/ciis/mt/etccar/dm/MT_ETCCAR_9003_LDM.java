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


package chosun.ciis.mt.etccar.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etccar.ds.*;
import chosun.ciis.mt.etccar.rec.*;

/**
 * 
 */


public class MT_ETCCAR_9003_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String drvr_nm;
	public String start_dt;
	public String start_tm;
	public String ariv_dt;
	public String ariv_tm;

	public MT_ETCCAR_9003_LDM(){}
	public MT_ETCCAR_9003_LDM(String cmpy_cd, String drvr_nm, String start_dt, String start_tm, String ariv_dt, String ariv_tm){
		this.cmpy_cd = cmpy_cd;
		this.drvr_nm = drvr_nm;
		this.start_dt = start_dt;
		this.start_tm = start_tm;
		this.ariv_dt = ariv_dt;
		this.ariv_tm = ariv_tm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDrvr_nm(String drvr_nm){
		this.drvr_nm = drvr_nm;
	}

	public void setStart_dt(String start_dt){
		this.start_dt = start_dt;
	}

	public void setStart_tm(String start_tm){
		this.start_tm = start_tm;
	}

	public void setAriv_dt(String ariv_dt){
		this.ariv_dt = ariv_dt;
	}

	public void setAriv_tm(String ariv_tm){
		this.ariv_tm = ariv_tm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDrvr_nm(){
		return this.drvr_nm;
	}

	public String getStart_dt(){
		return this.start_dt;
	}

	public String getStart_tm(){
		return this.start_tm;
	}

	public String getAriv_dt(){
		return this.ariv_dt;
	}

	public String getAriv_tm(){
		return this.ariv_tm;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCCAR_9003_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCCAR_9003_LDM dm = (MT_ETCCAR_9003_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.drvr_nm);
		cstmt.setString(5, dm.start_dt);
		cstmt.setString(6, dm.start_tm);
		cstmt.setString(7, dm.ariv_dt);
		cstmt.setString(8, dm.ariv_tm);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etccar.ds.MT_ETCCAR_9003_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("drvr_nm = [" + getDrvr_nm() + "]");
		System.out.println("start_dt = [" + getStart_dt() + "]");
		System.out.println("start_tm = [" + getStart_tm() + "]");
		System.out.println("ariv_dt = [" + getAriv_dt() + "]");
		System.out.println("ariv_tm = [" + getAriv_tm() + "]");
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
String drvr_nm = req.getParameter("drvr_nm");
if( drvr_nm == null){
	System.out.println(this.toString+" : drvr_nm is null" );
}else{
	System.out.println(this.toString+" : drvr_nm is "+drvr_nm );
}
String start_dt = req.getParameter("start_dt");
if( start_dt == null){
	System.out.println(this.toString+" : start_dt is null" );
}else{
	System.out.println(this.toString+" : start_dt is "+start_dt );
}
String start_tm = req.getParameter("start_tm");
if( start_tm == null){
	System.out.println(this.toString+" : start_tm is null" );
}else{
	System.out.println(this.toString+" : start_tm is "+start_tm );
}
String ariv_dt = req.getParameter("ariv_dt");
if( ariv_dt == null){
	System.out.println(this.toString+" : ariv_dt is null" );
}else{
	System.out.println(this.toString+" : ariv_dt is "+ariv_dt );
}
String ariv_tm = req.getParameter("ariv_tm");
if( ariv_tm == null){
	System.out.println(this.toString+" : ariv_tm is null" );
}else{
	System.out.println(this.toString+" : ariv_tm is "+ariv_tm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String drvr_nm = Util.checkString(req.getParameter("drvr_nm"));
String start_dt = Util.checkString(req.getParameter("start_dt"));
String start_tm = Util.checkString(req.getParameter("start_tm"));
String ariv_dt = Util.checkString(req.getParameter("ariv_dt"));
String ariv_tm = Util.checkString(req.getParameter("ariv_tm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String drvr_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("drvr_nm")));
String start_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("start_dt")));
String start_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("start_tm")));
String ariv_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("ariv_dt")));
String ariv_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("ariv_tm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDrvr_nm(drvr_nm);
dm.setStart_dt(start_dt);
dm.setStart_tm(start_tm);
dm.setAriv_dt(ariv_dt);
dm.setAriv_tm(ariv_tm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Sep 06 18:03:04 KST 2012 */