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


package chosun.ciis.is.bus.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.bus.ds.*;
import chosun.ciis.is.bus.rec.*;

/**
 * 
 */


public class IS_BUS_1210_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yyyy;
	public String clsf;

	public IS_BUS_1210_LDM(){}
	public IS_BUS_1210_LDM(String cmpy_cd, String yyyy, String clsf){
		this.cmpy_cd = cmpy_cd;
		this.yyyy = yyyy;
		this.clsf = clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYyyy(String yyyy){
		this.yyyy = yyyy;
	}

	public void setClsf(String clsf){
		this.clsf = clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYyyy(){
		return this.yyyy;
	}

	public String getClsf(){
		return this.clsf;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_BUS_1210_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_BUS_1210_LDM dm = (IS_BUS_1210_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yyyy);
		cstmt.setString(5, dm.clsf);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.bus.ds.IS_BUS_1210_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("yyyy = [" + getYyyy() + "]");
		System.out.println("clsf = [" + getClsf() + "]");
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
String yyyy = req.getParameter("yyyy");
if( yyyy == null){
	System.out.println(this.toString+" : yyyy is null" );
}else{
	System.out.println(this.toString+" : yyyy is "+yyyy );
}
String clsf = req.getParameter("clsf");
if( clsf == null){
	System.out.println(this.toString+" : clsf is null" );
}else{
	System.out.println(this.toString+" : clsf is "+clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yyyy = Util.checkString(req.getParameter("yyyy"));
String clsf = Util.checkString(req.getParameter("clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yyyy = Util.Uni2Ksc(Util.checkString(req.getParameter("yyyy")));
String clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYyyy(yyyy);
dm.setClsf(clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 20 10:14:40 KST 2012 */