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


public class MT_ETCCAR_3000_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String repa_dt_fr;
	public String repa_dt_to;
	public String car_no;
	public String repa_clsf;

	public MT_ETCCAR_3000_LDM(){}
	public MT_ETCCAR_3000_LDM(String cmpy_cd, String repa_dt_fr, String repa_dt_to, String car_no, String repa_clsf){
		this.cmpy_cd = cmpy_cd;
		this.repa_dt_fr = repa_dt_fr;
		this.repa_dt_to = repa_dt_to;
		this.car_no = car_no;
		this.repa_clsf = repa_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRepa_dt_fr(String repa_dt_fr){
		this.repa_dt_fr = repa_dt_fr;
	}

	public void setRepa_dt_to(String repa_dt_to){
		this.repa_dt_to = repa_dt_to;
	}

	public void setCar_no(String car_no){
		this.car_no = car_no;
	}

	public void setRepa_clsf(String repa_clsf){
		this.repa_clsf = repa_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRepa_dt_fr(){
		return this.repa_dt_fr;
	}

	public String getRepa_dt_to(){
		return this.repa_dt_to;
	}

	public String getCar_no(){
		return this.car_no;
	}

	public String getRepa_clsf(){
		return this.repa_clsf;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCCAR_3000_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCCAR_3000_LDM dm = (MT_ETCCAR_3000_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.repa_dt_fr);
		cstmt.setString(5, dm.repa_dt_to);
		cstmt.setString(6, dm.car_no);
		cstmt.setString(7, dm.repa_clsf);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etccar.ds.MT_ETCCAR_3000_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("repa_dt_fr = [" + getRepa_dt_fr() + "]");
		System.out.println("repa_dt_to = [" + getRepa_dt_to() + "]");
		System.out.println("car_no = [" + getCar_no() + "]");
		System.out.println("repa_clsf = [" + getRepa_clsf() + "]");
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
String repa_dt_fr = req.getParameter("repa_dt_fr");
if( repa_dt_fr == null){
	System.out.println(this.toString+" : repa_dt_fr is null" );
}else{
	System.out.println(this.toString+" : repa_dt_fr is "+repa_dt_fr );
}
String repa_dt_to = req.getParameter("repa_dt_to");
if( repa_dt_to == null){
	System.out.println(this.toString+" : repa_dt_to is null" );
}else{
	System.out.println(this.toString+" : repa_dt_to is "+repa_dt_to );
}
String car_no = req.getParameter("car_no");
if( car_no == null){
	System.out.println(this.toString+" : car_no is null" );
}else{
	System.out.println(this.toString+" : car_no is "+car_no );
}
String repa_clsf = req.getParameter("repa_clsf");
if( repa_clsf == null){
	System.out.println(this.toString+" : repa_clsf is null" );
}else{
	System.out.println(this.toString+" : repa_clsf is "+repa_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String repa_dt_fr = Util.checkString(req.getParameter("repa_dt_fr"));
String repa_dt_to = Util.checkString(req.getParameter("repa_dt_to"));
String car_no = Util.checkString(req.getParameter("car_no"));
String repa_clsf = Util.checkString(req.getParameter("repa_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String repa_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("repa_dt_fr")));
String repa_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("repa_dt_to")));
String car_no = Util.Uni2Ksc(Util.checkString(req.getParameter("car_no")));
String repa_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("repa_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setRepa_dt_fr(repa_dt_fr);
dm.setRepa_dt_to(repa_dt_to);
dm.setCar_no(car_no);
dm.setRepa_clsf(repa_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 13 21:33:28 KST 2009 */