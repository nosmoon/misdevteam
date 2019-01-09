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


public class IS_COM_1710_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String send_atic_no;
	public String send_atic_nm;

	public IS_COM_1710_LDM(){}
	public IS_COM_1710_LDM(String cmpy_cd, String send_atic_no, String send_atic_nm){
		this.cmpy_cd = cmpy_cd;
		this.send_atic_no = send_atic_no;
		this.send_atic_nm = send_atic_nm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSend_atic_no(String send_atic_no){
		this.send_atic_no = send_atic_no;
	}

	public void setSend_atic_nm(String send_atic_nm){
		this.send_atic_nm = send_atic_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSend_atic_no(){
		return this.send_atic_no;
	}

	public String getSend_atic_nm(){
		return this.send_atic_nm;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_COM_1710_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_COM_1710_LDM dm = (IS_COM_1710_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.send_atic_no);
		cstmt.setString(5, dm.send_atic_nm);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.com.ds.IS_COM_1710_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("send_atic_no = [" + getSend_atic_no() + "]");
		System.out.println("send_atic_nm = [" + getSend_atic_nm() + "]");
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
String send_atic_no = req.getParameter("send_atic_no");
if( send_atic_no == null){
	System.out.println(this.toString+" : send_atic_no is null" );
}else{
	System.out.println(this.toString+" : send_atic_no is "+send_atic_no );
}
String send_atic_nm = req.getParameter("send_atic_nm");
if( send_atic_nm == null){
	System.out.println(this.toString+" : send_atic_nm is null" );
}else{
	System.out.println(this.toString+" : send_atic_nm is "+send_atic_nm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String send_atic_no = Util.checkString(req.getParameter("send_atic_no"));
String send_atic_nm = Util.checkString(req.getParameter("send_atic_nm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String send_atic_no = Util.Uni2Ksc(Util.checkString(req.getParameter("send_atic_no")));
String send_atic_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("send_atic_nm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSend_atic_no(send_atic_no);
dm.setSend_atic_nm(send_atic_nm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 29 18:48:39 KST 2012 */