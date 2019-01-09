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


package chosun.ciis.hd.hlywrk.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.hlywrk.ds.*;
import chosun.ciis.hd.hlywrk.rec.*;

/**
 * 
 */


public class HD_HLYWRK_1100_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String dept_cd;
	public String cmpy_cd;
	public String now_date;

	public HD_HLYWRK_1100_LDM(){}
	public HD_HLYWRK_1100_LDM(String dept_cd, String cmpy_cd, String now_date){
		this.dept_cd = dept_cd;
		this.cmpy_cd = cmpy_cd;
		this.now_date = now_date;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setNow_date(String now_date){
		this.now_date = now_date;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getNow_date(){
		return this.now_date;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_HLYWRK_1100_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_HLYWRK_1100_LDM dm = (HD_HLYWRK_1100_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.dept_cd);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.now_date);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.hlywrk.ds.HD_HLYWRK_1100_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("now_date = [" + getNow_date() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String now_date = req.getParameter("now_date");
if( now_date == null){
	System.out.println(this.toString+" : now_date is null" );
}else{
	System.out.println(this.toString+" : now_date is "+now_date );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String now_date = Util.checkString(req.getParameter("now_date"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String now_date = Util.Uni2Ksc(Util.checkString(req.getParameter("now_date")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDept_cd(dept_cd);
dm.setCmpy_cd(cmpy_cd);
dm.setNow_date(now_date);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Oct 01 13:58:58 KST 2009 */