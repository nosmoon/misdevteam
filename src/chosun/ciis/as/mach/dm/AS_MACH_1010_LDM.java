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


package chosun.ciis.as.mach.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.mach.ds.*;
import chosun.ciis.as.mach.rec.*;

/**
 * 
 */


public class AS_MACH_1010_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String work_clsf;
	public String mach_clsf;
	public String bldg_clsf;
	public String mach_name;
	public String model_name;
	public String fr_inst_dt;
	public String to_inst_dt;
	public String fr_exp_dt;
	public String to_exp_dt;

	public AS_MACH_1010_LDM(){}
	public AS_MACH_1010_LDM(String cmpy_cd, String work_clsf, String mach_clsf, String bldg_clsf, String mach_name, String model_name, String fr_inst_dt, String to_inst_dt, String fr_exp_dt, String to_exp_dt){
		this.cmpy_cd = cmpy_cd;
		this.work_clsf = work_clsf;
		this.mach_clsf = mach_clsf;
		this.bldg_clsf = bldg_clsf;
		this.mach_name = mach_name;
		this.model_name = model_name;
		this.fr_inst_dt = fr_inst_dt;
		this.to_inst_dt = to_inst_dt;
		this.fr_exp_dt = fr_exp_dt;
		this.to_exp_dt = to_exp_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setWork_clsf(String work_clsf){
		this.work_clsf = work_clsf;
	}

	public void setMach_clsf(String mach_clsf){
		this.mach_clsf = mach_clsf;
	}

	public void setBldg_clsf(String bldg_clsf){
		this.bldg_clsf = bldg_clsf;
	}

	public void setMach_name(String mach_name){
		this.mach_name = mach_name;
	}

	public void setModel_name(String model_name){
		this.model_name = model_name;
	}

	public void setFr_inst_dt(String fr_inst_dt){
		this.fr_inst_dt = fr_inst_dt;
	}

	public void setTo_inst_dt(String to_inst_dt){
		this.to_inst_dt = to_inst_dt;
	}

	public void setFr_exp_dt(String fr_exp_dt){
		this.fr_exp_dt = fr_exp_dt;
	}

	public void setTo_exp_dt(String to_exp_dt){
		this.to_exp_dt = to_exp_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getWork_clsf(){
		return this.work_clsf;
	}

	public String getMach_clsf(){
		return this.mach_clsf;
	}

	public String getBldg_clsf(){
		return this.bldg_clsf;
	}

	public String getMach_name(){
		return this.mach_name;
	}

	public String getModel_name(){
		return this.model_name;
	}

	public String getFr_inst_dt(){
		return this.fr_inst_dt;
	}

	public String getTo_inst_dt(){
		return this.to_inst_dt;
	}

	public String getFr_exp_dt(){
		return this.fr_exp_dt;
	}

	public String getTo_exp_dt(){
		return this.to_exp_dt;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_MACH_1010_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_MACH_1010_LDM dm = (AS_MACH_1010_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.work_clsf);
		cstmt.setString(5, dm.mach_clsf);
		cstmt.setString(6, dm.bldg_clsf);
		cstmt.setString(7, dm.mach_name);
		cstmt.setString(8, dm.model_name);
		cstmt.setString(9, dm.fr_inst_dt);
		cstmt.setString(10, dm.to_inst_dt);
		cstmt.setString(11, dm.fr_exp_dt);
		cstmt.setString(12, dm.to_exp_dt);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.mach.ds.AS_MACH_1010_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("work_clsf = [" + getWork_clsf() + "]");
		System.out.println("mach_clsf = [" + getMach_clsf() + "]");
		System.out.println("bldg_clsf = [" + getBldg_clsf() + "]");
		System.out.println("mach_name = [" + getMach_name() + "]");
		System.out.println("model_name = [" + getModel_name() + "]");
		System.out.println("fr_inst_dt = [" + getFr_inst_dt() + "]");
		System.out.println("to_inst_dt = [" + getTo_inst_dt() + "]");
		System.out.println("fr_exp_dt = [" + getFr_exp_dt() + "]");
		System.out.println("to_exp_dt = [" + getTo_exp_dt() + "]");
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
String work_clsf = req.getParameter("work_clsf");
if( work_clsf == null){
	System.out.println(this.toString+" : work_clsf is null" );
}else{
	System.out.println(this.toString+" : work_clsf is "+work_clsf );
}
String mach_clsf = req.getParameter("mach_clsf");
if( mach_clsf == null){
	System.out.println(this.toString+" : mach_clsf is null" );
}else{
	System.out.println(this.toString+" : mach_clsf is "+mach_clsf );
}
String bldg_clsf = req.getParameter("bldg_clsf");
if( bldg_clsf == null){
	System.out.println(this.toString+" : bldg_clsf is null" );
}else{
	System.out.println(this.toString+" : bldg_clsf is "+bldg_clsf );
}
String mach_name = req.getParameter("mach_name");
if( mach_name == null){
	System.out.println(this.toString+" : mach_name is null" );
}else{
	System.out.println(this.toString+" : mach_name is "+mach_name );
}
String model_name = req.getParameter("model_name");
if( model_name == null){
	System.out.println(this.toString+" : model_name is null" );
}else{
	System.out.println(this.toString+" : model_name is "+model_name );
}
String fr_inst_dt = req.getParameter("fr_inst_dt");
if( fr_inst_dt == null){
	System.out.println(this.toString+" : fr_inst_dt is null" );
}else{
	System.out.println(this.toString+" : fr_inst_dt is "+fr_inst_dt );
}
String to_inst_dt = req.getParameter("to_inst_dt");
if( to_inst_dt == null){
	System.out.println(this.toString+" : to_inst_dt is null" );
}else{
	System.out.println(this.toString+" : to_inst_dt is "+to_inst_dt );
}
String fr_exp_dt = req.getParameter("fr_exp_dt");
if( fr_exp_dt == null){
	System.out.println(this.toString+" : fr_exp_dt is null" );
}else{
	System.out.println(this.toString+" : fr_exp_dt is "+fr_exp_dt );
}
String to_exp_dt = req.getParameter("to_exp_dt");
if( to_exp_dt == null){
	System.out.println(this.toString+" : to_exp_dt is null" );
}else{
	System.out.println(this.toString+" : to_exp_dt is "+to_exp_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String work_clsf = Util.checkString(req.getParameter("work_clsf"));
String mach_clsf = Util.checkString(req.getParameter("mach_clsf"));
String bldg_clsf = Util.checkString(req.getParameter("bldg_clsf"));
String mach_name = Util.checkString(req.getParameter("mach_name"));
String model_name = Util.checkString(req.getParameter("model_name"));
String fr_inst_dt = Util.checkString(req.getParameter("fr_inst_dt"));
String to_inst_dt = Util.checkString(req.getParameter("to_inst_dt"));
String fr_exp_dt = Util.checkString(req.getParameter("fr_exp_dt"));
String to_exp_dt = Util.checkString(req.getParameter("to_exp_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String work_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("work_clsf")));
String mach_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("mach_clsf")));
String bldg_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("bldg_clsf")));
String mach_name = Util.Uni2Ksc(Util.checkString(req.getParameter("mach_name")));
String model_name = Util.Uni2Ksc(Util.checkString(req.getParameter("model_name")));
String fr_inst_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_inst_dt")));
String to_inst_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_inst_dt")));
String fr_exp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_exp_dt")));
String to_exp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_exp_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setWork_clsf(work_clsf);
dm.setMach_clsf(mach_clsf);
dm.setBldg_clsf(bldg_clsf);
dm.setMach_name(mach_name);
dm.setModel_name(model_name);
dm.setFr_inst_dt(fr_inst_dt);
dm.setTo_inst_dt(to_inst_dt);
dm.setFr_exp_dt(fr_exp_dt);
dm.setTo_exp_dt(to_exp_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 10 13:59:12 KST 2015 */