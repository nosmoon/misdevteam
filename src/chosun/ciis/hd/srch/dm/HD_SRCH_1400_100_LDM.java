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


package chosun.ciis.hd.srch.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.srch.ds.*;
import chosun.ciis.hd.srch.rec.*;

/**
 * 
 */


public class HD_SRCH_1400_100_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String pick_st_dt;
	public String pick_et_dt;

	public HD_SRCH_1400_100_LDM(){}
	public HD_SRCH_1400_100_LDM(String cmpy_cd, String pick_st_dt, String pick_et_dt){
		this.cmpy_cd = cmpy_cd;
		this.pick_st_dt = pick_st_dt;
		this.pick_et_dt = pick_et_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPick_st_dt(String pick_st_dt){
		this.pick_st_dt = pick_st_dt;
	}

	public void setPick_et_dt(String pick_et_dt){
		this.pick_et_dt = pick_et_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPick_st_dt(){
		return this.pick_st_dt;
	}

	public String getPick_et_dt(){
		return this.pick_et_dt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SRCH_1400_100_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SRCH_1400_100_LDM dm = (HD_SRCH_1400_100_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.pick_st_dt);
		cstmt.setString(5, dm.pick_et_dt);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.srch.ds.HD_SRCH_1400_100_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("pick_st_dt = [" + getPick_st_dt() + "]");
		System.out.println("pick_et_dt = [" + getPick_et_dt() + "]");
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
String pick_st_dt = req.getParameter("pick_st_dt");
if( pick_st_dt == null){
	System.out.println(this.toString+" : pick_st_dt is null" );
}else{
	System.out.println(this.toString+" : pick_st_dt is "+pick_st_dt );
}
String pick_et_dt = req.getParameter("pick_et_dt");
if( pick_et_dt == null){
	System.out.println(this.toString+" : pick_et_dt is null" );
}else{
	System.out.println(this.toString+" : pick_et_dt is "+pick_et_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String pick_st_dt = Util.checkString(req.getParameter("pick_st_dt"));
String pick_et_dt = Util.checkString(req.getParameter("pick_et_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String pick_st_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pick_st_dt")));
String pick_et_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pick_et_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setPick_st_dt(pick_st_dt);
dm.setPick_et_dt(pick_et_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Dec 20 11:18:26 KST 2016 */