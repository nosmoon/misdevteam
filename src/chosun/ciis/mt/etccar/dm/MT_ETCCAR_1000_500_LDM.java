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


public class MT_ETCCAR_1000_500_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String driv_dt;
	public String driv;
	public String car_no;

	public MT_ETCCAR_1000_500_LDM(){}
	public MT_ETCCAR_1000_500_LDM(String cmpy_cd, String driv_dt, String driv, String car_no){
		this.cmpy_cd = cmpy_cd;
		this.driv_dt = driv_dt;
		this.driv = driv;
		this.car_no = car_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDriv_dt(String driv_dt){
		this.driv_dt = driv_dt;
	}

	public void setDriv(String driv){
		this.driv = driv;
	}

	public void setCar_no(String car_no){
		this.car_no = car_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDriv_dt(){
		return this.driv_dt;
	}

	public String getDriv(){
		return this.driv;
	}

	public String getCar_no(){
		return this.car_no;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCCAR_1000_500_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCCAR_1000_500_LDM dm = (MT_ETCCAR_1000_500_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.driv_dt);
		cstmt.setString(5, dm.driv);
		cstmt.setString(6, dm.car_no);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etccar.ds.MT_ETCCAR_1000_500_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("driv_dt = [" + getDriv_dt() + "]");
		System.out.println("driv = [" + getDriv() + "]");
		System.out.println("car_no = [" + getCar_no() + "]");
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
String driv_dt = req.getParameter("driv_dt");
if( driv_dt == null){
	System.out.println(this.toString+" : driv_dt is null" );
}else{
	System.out.println(this.toString+" : driv_dt is "+driv_dt );
}
String driv = req.getParameter("driv");
if( driv == null){
	System.out.println(this.toString+" : driv is null" );
}else{
	System.out.println(this.toString+" : driv is "+driv );
}
String car_no = req.getParameter("car_no");
if( car_no == null){
	System.out.println(this.toString+" : car_no is null" );
}else{
	System.out.println(this.toString+" : car_no is "+car_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String driv_dt = Util.checkString(req.getParameter("driv_dt"));
String driv = Util.checkString(req.getParameter("driv"));
String car_no = Util.checkString(req.getParameter("car_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String driv_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("driv_dt")));
String driv = Util.Uni2Ksc(Util.checkString(req.getParameter("driv")));
String car_no = Util.Uni2Ksc(Util.checkString(req.getParameter("car_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDriv_dt(driv_dt);
dm.setDriv(driv);
dm.setCar_no(car_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Sep 18 14:37:10 KST 2012 */