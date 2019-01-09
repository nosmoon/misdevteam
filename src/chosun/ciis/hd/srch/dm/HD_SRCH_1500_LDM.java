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


public class HD_SRCH_1500_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String in_cmpy_st_dt;
	public String in_cmpy_et_dt;
	public String std_dt;
	public String stay_ck;

	public HD_SRCH_1500_LDM(){}
	public HD_SRCH_1500_LDM(String cmpy_cd, String in_cmpy_st_dt, String in_cmpy_et_dt, String std_dt, String stay_ck){
		this.cmpy_cd = cmpy_cd;
		this.in_cmpy_st_dt = in_cmpy_st_dt;
		this.in_cmpy_et_dt = in_cmpy_et_dt;
		this.std_dt = std_dt;
		this.stay_ck = stay_ck;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIn_cmpy_st_dt(String in_cmpy_st_dt){
		this.in_cmpy_st_dt = in_cmpy_st_dt;
	}

	public void setIn_cmpy_et_dt(String in_cmpy_et_dt){
		this.in_cmpy_et_dt = in_cmpy_et_dt;
	}

	public void setStd_dt(String std_dt){
		this.std_dt = std_dt;
	}

	public void setStay_ck(String stay_ck){
		this.stay_ck = stay_ck;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIn_cmpy_st_dt(){
		return this.in_cmpy_st_dt;
	}

	public String getIn_cmpy_et_dt(){
		return this.in_cmpy_et_dt;
	}

	public String getStd_dt(){
		return this.std_dt;
	}

	public String getStay_ck(){
		return this.stay_ck;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SRCH_1500_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SRCH_1500_LDM dm = (HD_SRCH_1500_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.in_cmpy_st_dt);
		cstmt.setString(5, dm.in_cmpy_et_dt);
		cstmt.setString(6, dm.std_dt);
		cstmt.setString(7, dm.stay_ck);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_SRCH_1500_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("in_cmpy_st_dt = [" + getIn_cmpy_st_dt() + "]");
		System.out.println("in_cmpy_et_dt = [" + getIn_cmpy_et_dt() + "]");
		System.out.println("std_dt = [" + getStd_dt() + "]");
		System.out.println("stay_ck = [" + getStay_ck() + "]");
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
String in_cmpy_st_dt = req.getParameter("in_cmpy_st_dt");
if( in_cmpy_st_dt == null){
	System.out.println(this.toString+" : in_cmpy_st_dt is null" );
}else{
	System.out.println(this.toString+" : in_cmpy_st_dt is "+in_cmpy_st_dt );
}
String in_cmpy_et_dt = req.getParameter("in_cmpy_et_dt");
if( in_cmpy_et_dt == null){
	System.out.println(this.toString+" : in_cmpy_et_dt is null" );
}else{
	System.out.println(this.toString+" : in_cmpy_et_dt is "+in_cmpy_et_dt );
}
String std_dt = req.getParameter("std_dt");
if( std_dt == null){
	System.out.println(this.toString+" : std_dt is null" );
}else{
	System.out.println(this.toString+" : std_dt is "+std_dt );
}
String stay_ck = req.getParameter("stay_ck");
if( stay_ck == null){
	System.out.println(this.toString+" : stay_ck is null" );
}else{
	System.out.println(this.toString+" : stay_ck is "+stay_ck );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String in_cmpy_st_dt = Util.checkString(req.getParameter("in_cmpy_st_dt"));
String in_cmpy_et_dt = Util.checkString(req.getParameter("in_cmpy_et_dt"));
String std_dt = Util.checkString(req.getParameter("std_dt"));
String stay_ck = Util.checkString(req.getParameter("stay_ck"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String in_cmpy_st_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("in_cmpy_st_dt")));
String in_cmpy_et_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("in_cmpy_et_dt")));
String std_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("std_dt")));
String stay_ck = Util.Uni2Ksc(Util.checkString(req.getParameter("stay_ck")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIn_cmpy_st_dt(in_cmpy_st_dt);
dm.setIn_cmpy_et_dt(in_cmpy_et_dt);
dm.setStd_dt(std_dt);
dm.setStay_ck(stay_ck);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Aug 17 09:26:22 KST 2009 */