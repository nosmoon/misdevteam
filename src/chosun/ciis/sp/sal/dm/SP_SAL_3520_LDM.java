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


package chosun.ciis.sp.sal.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sal.ds.*;
import chosun.ciis.sp.sal.rec.*;

/**
 * 
 */


public class SP_SAL_3520_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String work_yymm;
	public String dlco_cd;

	public SP_SAL_3520_LDM(){}
	public SP_SAL_3520_LDM(String cmpy_cd, String work_yymm, String dlco_cd){
		this.cmpy_cd = cmpy_cd;
		this.work_yymm = work_yymm;
		this.dlco_cd = dlco_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setWork_yymm(String work_yymm){
		this.work_yymm = work_yymm;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getWork_yymm(){
		return this.work_yymm;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_SP_SAL_3520_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SP_SAL_3520_LDM dm = (SP_SAL_3520_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.work_yymm);
		cstmt.setString(5, dm.dlco_cd);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.sp.sal.ds.SP_SAL_3520_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("work_yymm = [" + getWork_yymm() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
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
String work_yymm = req.getParameter("work_yymm");
if( work_yymm == null){
	System.out.println(this.toString+" : work_yymm is null" );
}else{
	System.out.println(this.toString+" : work_yymm is "+work_yymm );
}
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String work_yymm = Util.checkString(req.getParameter("work_yymm"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String work_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("work_yymm")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setWork_yymm(work_yymm);
dm.setDlco_cd(dlco_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 19 21:34:40 KST 2012 */