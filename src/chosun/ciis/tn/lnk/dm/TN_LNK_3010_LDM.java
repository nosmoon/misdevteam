/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.tn.lnk.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.lnk.ds.*;
import chosun.ciis.tn.lnk.rec.*;

/**
 * 
 */


public class TN_LNK_3010_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String pymt_yymm;
	public String pymt_day;
	public String proc_clsf;
	public String dt_clsf;
	public String frdt;
	public String todt;

	public TN_LNK_3010_LDM(){}
	public TN_LNK_3010_LDM(String cmpy_cd, String pymt_yymm, String pymt_day, String proc_clsf, String dt_clsf, String frdt, String todt){
		this.cmpy_cd = cmpy_cd;
		this.pymt_yymm = pymt_yymm;
		this.pymt_day = pymt_day;
		this.proc_clsf = proc_clsf;
		this.dt_clsf = dt_clsf;
		this.frdt = frdt;
		this.todt = todt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPymt_yymm(String pymt_yymm){
		this.pymt_yymm = pymt_yymm;
	}

	public void setPymt_day(String pymt_day){
		this.pymt_day = pymt_day;
	}

	public void setProc_clsf(String proc_clsf){
		this.proc_clsf = proc_clsf;
	}

	public void setDt_clsf(String dt_clsf){
		this.dt_clsf = dt_clsf;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPymt_yymm(){
		return this.pymt_yymm;
	}

	public String getPymt_day(){
		return this.pymt_day;
	}

	public String getProc_clsf(){
		return this.proc_clsf;
	}

	public String getDt_clsf(){
		return this.dt_clsf;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_LNK_3010_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_LNK_3010_LDM dm = (TN_LNK_3010_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.pymt_yymm);
		cstmt.setString(5, dm.pymt_day);
		cstmt.setString(6, dm.proc_clsf);
		cstmt.setString(7, dm.dt_clsf);
		cstmt.setString(8, dm.frdt);
		cstmt.setString(9, dm.todt);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.lnk.ds.TN_LNK_3010_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("pymt_yymm = [" + getPymt_yymm() + "]");
		System.out.println("pymt_day = [" + getPymt_day() + "]");
		System.out.println("proc_clsf = [" + getProc_clsf() + "]");
		System.out.println("dt_clsf = [" + getDt_clsf() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
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
String pymt_yymm = req.getParameter("pymt_yymm");
if( pymt_yymm == null){
	System.out.println(this.toString+" : pymt_yymm is null" );
}else{
	System.out.println(this.toString+" : pymt_yymm is "+pymt_yymm );
}
String pymt_day = req.getParameter("pymt_day");
if( pymt_day == null){
	System.out.println(this.toString+" : pymt_day is null" );
}else{
	System.out.println(this.toString+" : pymt_day is "+pymt_day );
}
String proc_clsf = req.getParameter("proc_clsf");
if( proc_clsf == null){
	System.out.println(this.toString+" : proc_clsf is null" );
}else{
	System.out.println(this.toString+" : proc_clsf is "+proc_clsf );
}
String dt_clsf = req.getParameter("dt_clsf");
if( dt_clsf == null){
	System.out.println(this.toString+" : dt_clsf is null" );
}else{
	System.out.println(this.toString+" : dt_clsf is "+dt_clsf );
}
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String pymt_yymm = Util.checkString(req.getParameter("pymt_yymm"));
String pymt_day = Util.checkString(req.getParameter("pymt_day"));
String proc_clsf = Util.checkString(req.getParameter("proc_clsf"));
String dt_clsf = Util.checkString(req.getParameter("dt_clsf"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String pymt_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("pymt_yymm")));
String pymt_day = Util.Uni2Ksc(Util.checkString(req.getParameter("pymt_day")));
String proc_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_clsf")));
String dt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dt_clsf")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setPymt_yymm(pymt_yymm);
dm.setPymt_day(pymt_day);
dm.setProc_clsf(proc_clsf);
dm.setDt_clsf(dt_clsf);
dm.setFrdt(frdt);
dm.setTodt(todt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Aug 22 17:58:09 KST 2016 */