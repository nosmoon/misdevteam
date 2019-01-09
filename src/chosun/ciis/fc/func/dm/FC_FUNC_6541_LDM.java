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


package chosun.ciis.fc.func.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.ds.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_6541_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mtry_dt_fr;
	public String mtry_dt_to;
	public String flag;

	public FC_FUNC_6541_LDM(){}
	public FC_FUNC_6541_LDM(String cmpy_cd, String mtry_dt_fr, String mtry_dt_to, String flag){
		this.cmpy_cd = cmpy_cd;
		this.mtry_dt_fr = mtry_dt_fr;
		this.mtry_dt_to = mtry_dt_to;
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMtry_dt_fr(String mtry_dt_fr){
		this.mtry_dt_fr = mtry_dt_fr;
	}

	public void setMtry_dt_to(String mtry_dt_to){
		this.mtry_dt_to = mtry_dt_to;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMtry_dt_fr(){
		return this.mtry_dt_fr;
	}

	public String getMtry_dt_to(){
		return this.mtry_dt_to;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_6541_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_6541_LDM dm = (FC_FUNC_6541_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mtry_dt_fr);
		cstmt.setString(5, dm.mtry_dt_to);
		cstmt.setString(6, dm.flag);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_6541_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mtry_dt_fr = [" + getMtry_dt_fr() + "]");
		System.out.println("mtry_dt_to = [" + getMtry_dt_to() + "]");
		System.out.println("flag = [" + getFlag() + "]");
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
String mtry_dt_fr = req.getParameter("mtry_dt_fr");
if( mtry_dt_fr == null){
	System.out.println(this.toString+" : mtry_dt_fr is null" );
}else{
	System.out.println(this.toString+" : mtry_dt_fr is "+mtry_dt_fr );
}
String mtry_dt_to = req.getParameter("mtry_dt_to");
if( mtry_dt_to == null){
	System.out.println(this.toString+" : mtry_dt_to is null" );
}else{
	System.out.println(this.toString+" : mtry_dt_to is "+mtry_dt_to );
}
String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mtry_dt_fr = Util.checkString(req.getParameter("mtry_dt_fr"));
String mtry_dt_to = Util.checkString(req.getParameter("mtry_dt_to"));
String flag = Util.checkString(req.getParameter("flag"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mtry_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt_fr")));
String mtry_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt_to")));
String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMtry_dt_fr(mtry_dt_fr);
dm.setMtry_dt_to(mtry_dt_to);
dm.setFlag(flag);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 29 17:22:45 KST 2016 */