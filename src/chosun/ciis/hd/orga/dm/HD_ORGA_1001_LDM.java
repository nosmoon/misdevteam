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


package chosun.ciis.hd.orga.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.orga.ds.*;
import chosun.ciis.hd.orga.rec.*;

/**
 * 
 */


public class HD_ORGA_1001_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String now_use_yn;
	public String dept_nm;
	public String orga_reorga_dd;

	public HD_ORGA_1001_LDM(){}
	public HD_ORGA_1001_LDM(String cmpy_cd, String now_use_yn, String dept_nm, String orga_reorga_dd){
		this.cmpy_cd = cmpy_cd;
		this.now_use_yn = now_use_yn;
		this.dept_nm = dept_nm;
		this.orga_reorga_dd = orga_reorga_dd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setNow_use_yn(String now_use_yn){
		this.now_use_yn = now_use_yn;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setOrga_reorga_dd(String orga_reorga_dd){
		this.orga_reorga_dd = orga_reorga_dd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getNow_use_yn(){
		return this.now_use_yn;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getOrga_reorga_dd(){
		return this.orga_reorga_dd;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_ORGA_1001_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_ORGA_1001_LDM dm = (HD_ORGA_1001_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.now_use_yn);
		cstmt.setString(5, dm.dept_nm);
		cstmt.setString(6, dm.orga_reorga_dd);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.orga.ds.HD_ORGA_1001_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("now_use_yn = [" + getNow_use_yn() + "]");
		System.out.println("dept_nm = [" + getDept_nm() + "]");
		System.out.println("orga_reorga_dd = [" + getOrga_reorga_dd() + "]");
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
String now_use_yn = req.getParameter("now_use_yn");
if( now_use_yn == null){
	System.out.println(this.toString+" : now_use_yn is null" );
}else{
	System.out.println(this.toString+" : now_use_yn is "+now_use_yn );
}
String dept_nm = req.getParameter("dept_nm");
if( dept_nm == null){
	System.out.println(this.toString+" : dept_nm is null" );
}else{
	System.out.println(this.toString+" : dept_nm is "+dept_nm );
}
String orga_reorga_dd = req.getParameter("orga_reorga_dd");
if( orga_reorga_dd == null){
	System.out.println(this.toString+" : orga_reorga_dd is null" );
}else{
	System.out.println(this.toString+" : orga_reorga_dd is "+orga_reorga_dd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String now_use_yn = Util.checkString(req.getParameter("now_use_yn"));
String dept_nm = Util.checkString(req.getParameter("dept_nm"));
String orga_reorga_dd = Util.checkString(req.getParameter("orga_reorga_dd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String now_use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("now_use_yn")));
String dept_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_nm")));
String orga_reorga_dd = Util.Uni2Ksc(Util.checkString(req.getParameter("orga_reorga_dd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setNow_use_yn(now_use_yn);
dm.setDept_nm(dept_nm);
dm.setOrga_reorga_dd(orga_reorga_dd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Jul 11 19:22:39 KST 2009 */