/***************************************************************************************************
* 파일명 : .java
* 기능 : 인사-급여관리-총보상 생성 및 조회(TV조선용)
* 작성일자 : 2014-10-15
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.saly.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.ds.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_1701_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String saly_yy;
	public String emp_no;

	public HD_SALY_1701_LDM(){}
	public HD_SALY_1701_LDM(String cmpy_cd, String saly_yy, String emp_no){
		this.cmpy_cd = cmpy_cd;
		this.saly_yy = saly_yy;
		this.emp_no = emp_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSaly_yy(String saly_yy){
		this.saly_yy = saly_yy;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSaly_yy(){
		return this.saly_yy;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SALY_1701_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SALY_1701_LDM dm = (HD_SALY_1701_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.saly_yy);
		cstmt.setString(5, dm.emp_no);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.saly.ds.HD_SALY_1701_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("saly_yy = [" + getSaly_yy() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
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
String saly_yy = req.getParameter("saly_yy");
if( saly_yy == null){
	System.out.println(this.toString+" : saly_yy is null" );
}else{
	System.out.println(this.toString+" : saly_yy is "+saly_yy );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String saly_yy = Util.checkString(req.getParameter("saly_yy"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String saly_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("saly_yy")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSaly_yy(saly_yy);
dm.setEmp_no(emp_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Aug 30 23:42:49 KST 2009 */