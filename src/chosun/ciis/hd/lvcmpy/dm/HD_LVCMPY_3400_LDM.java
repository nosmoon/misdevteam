/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.lvcmpy.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.lvcmpy.ds.*;
import chosun.ciis.hd.lvcmpy.rec.*;

/**
 * 
 */


public class HD_LVCMPY_3400_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String estm_work_dt;
	public String day_clsf;

	public HD_LVCMPY_3400_LDM(){}
	public HD_LVCMPY_3400_LDM(String cmpy_cd, String estm_work_dt, String day_clsf){
		this.cmpy_cd = cmpy_cd;
		this.estm_work_dt = estm_work_dt;
		this.day_clsf = day_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEstm_work_dt(String estm_work_dt){
		this.estm_work_dt = estm_work_dt;
	}

	public void setDay_clsf(String day_clsf){
		this.day_clsf = day_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEstm_work_dt(){
		return this.estm_work_dt;
	}

	public String getDay_clsf(){
		return this.day_clsf;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_LVCMPY_3400_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_LVCMPY_3400_LDM dm = (HD_LVCMPY_3400_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.estm_work_dt);
		cstmt.setString(5, dm.day_clsf);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.lvcmpy.ds.HD_LVCMPY_3400_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("estm_work_dt = [" + getEstm_work_dt() + "]");
		System.out.println("day_clsf = [" + getDay_clsf() + "]");
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
String estm_work_dt = req.getParameter("estm_work_dt");
if( estm_work_dt == null){
	System.out.println(this.toString+" : estm_work_dt is null" );
}else{
	System.out.println(this.toString+" : estm_work_dt is "+estm_work_dt );
}
String day_clsf = req.getParameter("day_clsf");
if( day_clsf == null){
	System.out.println(this.toString+" : day_clsf is null" );
}else{
	System.out.println(this.toString+" : day_clsf is "+day_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String estm_work_dt = Util.checkString(req.getParameter("estm_work_dt"));
String day_clsf = Util.checkString(req.getParameter("day_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String estm_work_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("estm_work_dt")));
String day_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("day_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEstm_work_dt(estm_work_dt);
dm.setDay_clsf(day_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 13 16:56:59 KST 2017 */