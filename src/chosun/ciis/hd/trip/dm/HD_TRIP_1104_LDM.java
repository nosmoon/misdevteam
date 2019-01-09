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


package chosun.ciis.hd.trip.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.trip.ds.*;
import chosun.ciis.hd.trip.rec.*;

/**
 * 
 */


public class HD_TRIP_1104_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String area_clsf;
	public String cost_clsf;
	public String emp_no;
	public String occr_dt;

	public HD_TRIP_1104_LDM(){}
	public HD_TRIP_1104_LDM(String cmpy_cd, String area_clsf, String cost_clsf, String emp_no, String occr_dt){
		this.cmpy_cd = cmpy_cd;
		this.area_clsf = area_clsf;
		this.cost_clsf = cost_clsf;
		this.emp_no = emp_no;
		this.occr_dt = occr_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setArea_clsf(String area_clsf){
		this.area_clsf = area_clsf;
	}

	public void setCost_clsf(String cost_clsf){
		this.cost_clsf = cost_clsf;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getArea_clsf(){
		return this.area_clsf;
	}

	public String getCost_clsf(){
		return this.cost_clsf;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_TRIP_1104_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_TRIP_1104_LDM dm = (HD_TRIP_1104_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.area_clsf);
		cstmt.setString(5, dm.cost_clsf);
		cstmt.setString(6, dm.emp_no);
		cstmt.setString(7, dm.occr_dt);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.trip.ds.HD_TRIP_1104_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("area_clsf = " + getArea_clsf());
        System.out.println("cost_clsf = " + getCost_clsf());
        System.out.println("emp_no = " + getEmp_no());
        System.out.println("occr_dt = " + getOccr_dt());
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
String area_clsf = req.getParameter("area_clsf");
if( area_clsf == null){
	System.out.println(this.toString+" : area_clsf is null" );
}else{
	System.out.println(this.toString+" : area_clsf is "+area_clsf );
}
String cost_clsf = req.getParameter("cost_clsf");
if( cost_clsf == null){
	System.out.println(this.toString+" : cost_clsf is null" );
}else{
	System.out.println(this.toString+" : cost_clsf is "+cost_clsf );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String area_clsf = Util.checkString(req.getParameter("area_clsf"));
String cost_clsf = Util.checkString(req.getParameter("cost_clsf"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String area_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("area_clsf")));
String cost_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("cost_clsf")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setArea_clsf(area_clsf);
dm.setCost_clsf(cost_clsf);
dm.setEmp_no(emp_no);
dm.setOccr_dt(occr_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 07 17:20:03 KST 2009 */