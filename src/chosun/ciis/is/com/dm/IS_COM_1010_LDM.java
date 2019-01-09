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


package chosun.ciis.is.com.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.com.ds.*;
import chosun.ciis.is.com.rec.*;

/**
 * 
 */


public class IS_COM_1010_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String advcs_cd;
	public String advcs_nm;
	public String indt_cd;

	public IS_COM_1010_LDM(){}
	public IS_COM_1010_LDM(String cmpy_cd, String advcs_cd, String advcs_nm, String indt_cd){
		this.cmpy_cd = cmpy_cd;
		this.advcs_cd = advcs_cd;
		this.advcs_nm = advcs_nm;
		this.indt_cd = indt_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAdvcs_cd(String advcs_cd){
		this.advcs_cd = advcs_cd;
	}

	public void setAdvcs_nm(String advcs_nm){
		this.advcs_nm = advcs_nm;
	}

	public void setIndt_cd(String indt_cd){
		this.indt_cd = indt_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAdvcs_cd(){
		return this.advcs_cd;
	}

	public String getAdvcs_nm(){
		return this.advcs_nm;
	}

	public String getIndt_cd(){
		return this.indt_cd;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_COM_1010_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_COM_1010_LDM dm = (IS_COM_1010_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.advcs_cd);
		cstmt.setString(5, dm.advcs_nm);
		cstmt.setString(6, dm.indt_cd);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.com.ds.IS_COM_1010_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("advcs_cd = [" + getAdvcs_cd() + "]");
		System.out.println("advcs_nm = [" + getAdvcs_nm() + "]");
		System.out.println("indt_cd = [" + getIndt_cd() + "]");
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
String advcs_cd = req.getParameter("advcs_cd");
if( advcs_cd == null){
	System.out.println(this.toString+" : advcs_cd is null" );
}else{
	System.out.println(this.toString+" : advcs_cd is "+advcs_cd );
}
String advcs_nm = req.getParameter("advcs_nm");
if( advcs_nm == null){
	System.out.println(this.toString+" : advcs_nm is null" );
}else{
	System.out.println(this.toString+" : advcs_nm is "+advcs_nm );
}
String indt_cd = req.getParameter("indt_cd");
if( indt_cd == null){
	System.out.println(this.toString+" : indt_cd is null" );
}else{
	System.out.println(this.toString+" : indt_cd is "+indt_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String advcs_cd = Util.checkString(req.getParameter("advcs_cd"));
String advcs_nm = Util.checkString(req.getParameter("advcs_nm"));
String indt_cd = Util.checkString(req.getParameter("indt_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String advcs_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("advcs_cd")));
String advcs_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("advcs_nm")));
String indt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("indt_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAdvcs_cd(advcs_cd);
dm.setAdvcs_nm(advcs_nm);
dm.setIndt_cd(indt_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 25 22:47:37 KST 2012 */