/***************************************************************************************************
* 파일명 : .java
* 기능 :  세션정보가져오기
* 작성일자 : 2014.03.31
* 작성자   : 노상현
***************************************************************************************************/


package chosun.ciis.co.mng.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.mng.ds.*;
import chosun.ciis.co.mng.rec.*;

/**
 * 세션정보가져오기
 */

public class CO_MNG_1050_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String acct_cd;
	public String info_emp_no;

	public CO_MNG_1050_LDM(){}
	public CO_MNG_1050_LDM(String cmpy_cd, String acct_cd, String info_emp_no){
		this.cmpy_cd = cmpy_cd;
		this.acct_cd = acct_cd;
		this.info_emp_no = info_emp_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setInfo_emp_no(String info_emp_no){
		this.info_emp_no = info_emp_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getInfo_emp_no(){
		return this.info_emp_no;
	}

	public String getSQL(){
		 return "{ call MISCOM.SP_CO_MNG_1050_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_MNG_1050_LDM dm = (CO_MNG_1050_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.acct_cd);
		cstmt.setString(5, dm.info_emp_no);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.mng.ds.CO_MNG_1050_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("acct_cd = [" + getAcct_cd() + "]");
		System.out.println("info_emp_no = [" + getInfo_emp_no() + "]");
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
String acct_cd = req.getParameter("acct_cd");
if( acct_cd == null){
	System.out.println(this.toString+" : acct_cd is null" );
}else{
	System.out.println(this.toString+" : acct_cd is "+acct_cd );
}
String info_emp_no = req.getParameter("info_emp_no");
if( info_emp_no == null){
	System.out.println(this.toString+" : info_emp_no is null" );
}else{
	System.out.println(this.toString+" : info_emp_no is "+info_emp_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String acct_cd = Util.checkString(req.getParameter("acct_cd"));
String info_emp_no = Util.checkString(req.getParameter("info_emp_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String acct_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd")));
String info_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("info_emp_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAcct_cd(acct_cd);
dm.setInfo_emp_no(info_emp_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 31 12:32:10 KST 2014 */