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


public class HD_SRCH_1700_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String in_cmpy_dt;

	public HD_SRCH_1700_LDM(){}
	public HD_SRCH_1700_LDM(String cmpy_cd, String in_cmpy_dt){
		this.cmpy_cd = cmpy_cd;
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SRCH_1700_L(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SRCH_1700_LDM dm = (HD_SRCH_1700_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.in_cmpy_dt);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_SRCH_1700_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("in_cmpy_dt = [" + getIn_cmpy_dt() + "]");
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
String in_cmpy_dt = req.getParameter("in_cmpy_dt");
if( in_cmpy_dt == null){
	System.out.println(this.toString+" : in_cmpy_dt is null" );
}else{
	System.out.println(this.toString+" : in_cmpy_dt is "+in_cmpy_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String in_cmpy_dt = Util.checkString(req.getParameter("in_cmpy_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String in_cmpy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("in_cmpy_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIn_cmpy_dt(in_cmpy_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Sep 04 09:56:16 KST 2009 */