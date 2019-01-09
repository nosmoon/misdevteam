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


package chosun.ciis.is.sal.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.sal.ds.*;
import chosun.ciis.is.sal.rec.*;

/**
 * 
 */


public class IS_SAL_1420_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String work_clsf;
	public String clos_yymm;

	public IS_SAL_1420_LDM(){}
	public IS_SAL_1420_LDM(String cmpy_cd, String work_clsf, String clos_yymm){
		this.cmpy_cd = cmpy_cd;
		this.work_clsf = work_clsf;
		this.clos_yymm = clos_yymm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setWork_clsf(String work_clsf){
		this.work_clsf = work_clsf;
	}

	public void setClos_yymm(String clos_yymm){
		this.clos_yymm = clos_yymm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getWork_clsf(){
		return this.work_clsf;
	}

	public String getClos_yymm(){
		return this.clos_yymm;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_SAL_1420_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_SAL_1420_LDM dm = (IS_SAL_1420_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.work_clsf);
		cstmt.setString(5, dm.clos_yymm);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.sal.ds.IS_SAL_1420_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("work_clsf = [" + getWork_clsf() + "]");
		System.out.println("clos_yymm = [" + getClos_yymm() + "]");
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
String clos_yymm = req.getParameter("clos_yymm");
if( clos_yymm == null){
	System.out.println(this.toString+" : clos_yymm is null" );
}else{
	System.out.println(this.toString+" : clos_yymm is "+clos_yymm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String work_clsf = Util.checkString(req.getParameter("work_clsf"));
String clos_yymm = Util.checkString(req.getParameter("clos_yymm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String work_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("work_clsf")));
String clos_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_yymm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setWork_clsf(work_clsf);
dm.setClos_yymm(clos_yymm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 14 14:07:35 KST 2012 */