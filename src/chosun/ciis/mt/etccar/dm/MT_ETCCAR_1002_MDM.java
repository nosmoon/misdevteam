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


package chosun.ciis.mt.etccar.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etccar.ds.*;
import chosun.ciis.mt.etccar.rec.*;

/**
 * 
 */


public class MT_ETCCAR_1002_MDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String car_no;
	public String use_usag;
	public String car_modl;
	public String mang_nm;

	public MT_ETCCAR_1002_MDM(){}
	public MT_ETCCAR_1002_MDM(String cmpy_cd, String car_no, String use_usag, String car_modl, String mang_nm){
		this.cmpy_cd = cmpy_cd;
		this.car_no = car_no;
		this.use_usag = use_usag;
		this.car_modl = car_modl;
		this.mang_nm = mang_nm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCar_no(String car_no){
		this.car_no = car_no;
	}

	public void setUse_usag(String use_usag){
		this.use_usag = use_usag;
	}

	public void setCar_modl(String car_modl){
		this.car_modl = car_modl;
	}

	public void setMang_nm(String mang_nm){
		this.mang_nm = mang_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCar_no(){
		return this.car_no;
	}

	public String getUse_usag(){
		return this.use_usag;
	}

	public String getCar_modl(){
		return this.car_modl;
	}

	public String getMang_nm(){
		return this.mang_nm;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCCAR_1002_M(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCCAR_1002_MDM dm = (MT_ETCCAR_1002_MDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.car_no);
		cstmt.setString(5, dm.use_usag);
		cstmt.setString(6, dm.car_modl);
		cstmt.setString(7, dm.mang_nm);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etccar.ds.MT_ETCCAR_1002_MDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("car_no = [" + getCar_no() + "]");
		System.out.println("use_usag = [" + getUse_usag() + "]");
		System.out.println("car_modl = [" + getCar_modl() + "]");
		System.out.println("mang_nm = [" + getMang_nm() + "]");
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
String car_no = req.getParameter("car_no");
if( car_no == null){
	System.out.println(this.toString+" : car_no is null" );
}else{
	System.out.println(this.toString+" : car_no is "+car_no );
}
String use_usag = req.getParameter("use_usag");
if( use_usag == null){
	System.out.println(this.toString+" : use_usag is null" );
}else{
	System.out.println(this.toString+" : use_usag is "+use_usag );
}
String car_modl = req.getParameter("car_modl");
if( car_modl == null){
	System.out.println(this.toString+" : car_modl is null" );
}else{
	System.out.println(this.toString+" : car_modl is "+car_modl );
}
String mang_nm = req.getParameter("mang_nm");
if( mang_nm == null){
	System.out.println(this.toString+" : mang_nm is null" );
}else{
	System.out.println(this.toString+" : mang_nm is "+mang_nm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String car_no = Util.checkString(req.getParameter("car_no"));
String use_usag = Util.checkString(req.getParameter("use_usag"));
String car_modl = Util.checkString(req.getParameter("car_modl"));
String mang_nm = Util.checkString(req.getParameter("mang_nm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String car_no = Util.Uni2Ksc(Util.checkString(req.getParameter("car_no")));
String use_usag = Util.Uni2Ksc(Util.checkString(req.getParameter("use_usag")));
String car_modl = Util.Uni2Ksc(Util.checkString(req.getParameter("car_modl")));
String mang_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_nm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setCar_no(car_no);
dm.setUse_usag(use_usag);
dm.setCar_modl(car_modl);
dm.setMang_nm(mang_nm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 12 19:30:49 KST 2009 */