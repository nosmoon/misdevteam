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


package chosun.ciis.hd.affr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.ds.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_1414_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String treat_edu_todt;

	public HD_AFFR_1414_LDM(){}
	public HD_AFFR_1414_LDM(String cmpy_cd, String treat_edu_todt){
		this.cmpy_cd = cmpy_cd;
		this.treat_edu_todt = treat_edu_todt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setTreat_edu_todt(String treat_edu_todt){
		this.treat_edu_todt = treat_edu_todt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getTreat_edu_todt(){
		return this.treat_edu_todt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_1414_L(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_1414_LDM dm = (HD_AFFR_1414_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.treat_edu_todt);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_1414_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("treat_edu_todt = [" + getTreat_edu_todt() + "]");
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
String treat_edu_todt = req.getParameter("treat_edu_todt");
if( treat_edu_todt == null){
	System.out.println(this.toString+" : treat_edu_todt is null" );
}else{
	System.out.println(this.toString+" : treat_edu_todt is "+treat_edu_todt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String treat_edu_todt = Util.checkString(req.getParameter("treat_edu_todt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String treat_edu_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("treat_edu_todt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setTreat_edu_todt(treat_edu_todt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 03 11:21:18 KST 2009 */