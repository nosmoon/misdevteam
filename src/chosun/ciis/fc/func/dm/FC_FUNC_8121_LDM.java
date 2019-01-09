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


public class FC_FUNC_8121_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String leas_no1;
	public String leas_no2;
	public String leas_no3;
	public String leas_no4;

	public FC_FUNC_8121_LDM(){}
	public FC_FUNC_8121_LDM(String cmpy_cd, String leas_no1, String leas_no2, String leas_no3, String leas_no4){
		this.cmpy_cd = cmpy_cd;
		this.leas_no1 = leas_no1;
		this.leas_no2 = leas_no2;
		this.leas_no3 = leas_no3;
		this.leas_no4 = leas_no4;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setLeas_no1(String leas_no1){
		this.leas_no1 = leas_no1;
	}

	public void setLeas_no2(String leas_no2){
		this.leas_no2 = leas_no2;
	}

	public void setLeas_no3(String leas_no3){
		this.leas_no3 = leas_no3;
	}

	public void setLeas_no4(String leas_no4){
		this.leas_no4 = leas_no4;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getLeas_no1(){
		return this.leas_no1;
	}

	public String getLeas_no2(){
		return this.leas_no2;
	}

	public String getLeas_no3(){
		return this.leas_no3;
	}

	public String getLeas_no4(){
		return this.leas_no4;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_8121_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_8121_LDM dm = (FC_FUNC_8121_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.leas_no1);
		cstmt.setString(5, dm.leas_no2);
		cstmt.setString(6, dm.leas_no3);
		cstmt.setString(7, dm.leas_no4);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_8121_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("leas_no1 = [" + getLeas_no1() + "]");
		System.out.println("leas_no2 = [" + getLeas_no2() + "]");
		System.out.println("leas_no3 = [" + getLeas_no3() + "]");
		System.out.println("leas_no4 = [" + getLeas_no4() + "]");
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
String leas_no1 = req.getParameter("leas_no1");
if( leas_no1 == null){
	System.out.println(this.toString+" : leas_no1 is null" );
}else{
	System.out.println(this.toString+" : leas_no1 is "+leas_no1 );
}
String leas_no2 = req.getParameter("leas_no2");
if( leas_no2 == null){
	System.out.println(this.toString+" : leas_no2 is null" );
}else{
	System.out.println(this.toString+" : leas_no2 is "+leas_no2 );
}
String leas_no3 = req.getParameter("leas_no3");
if( leas_no3 == null){
	System.out.println(this.toString+" : leas_no3 is null" );
}else{
	System.out.println(this.toString+" : leas_no3 is "+leas_no3 );
}
String leas_no4 = req.getParameter("leas_no4");
if( leas_no4 == null){
	System.out.println(this.toString+" : leas_no4 is null" );
}else{
	System.out.println(this.toString+" : leas_no4 is "+leas_no4 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String leas_no1 = Util.checkString(req.getParameter("leas_no1"));
String leas_no2 = Util.checkString(req.getParameter("leas_no2"));
String leas_no3 = Util.checkString(req.getParameter("leas_no3"));
String leas_no4 = Util.checkString(req.getParameter("leas_no4"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String leas_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_no1")));
String leas_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_no2")));
String leas_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_no3")));
String leas_no4 = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_no4")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setLeas_no1(leas_no1);
dm.setLeas_no2(leas_no2);
dm.setLeas_no3(leas_no3);
dm.setLeas_no4(leas_no4);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 22 16:48:37 KST 2009 */