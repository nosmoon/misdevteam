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


package chosun.ciis.co.semuro.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.semuro.ds.*;
import chosun.ciis.co.semuro.rec.*;

/**
 * 
 */


public class CO_SEMURO_1900_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String slip_occr_fr;
	public String slip_occr_to;
	public String slip_occr_cd;

	public CO_SEMURO_1900_LDM(){}
	public CO_SEMURO_1900_LDM(String cmpy_cd, String emp_no, String slip_occr_fr, String slip_occr_to, String slip_occr_cd){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.slip_occr_fr = slip_occr_fr;
		this.slip_occr_to = slip_occr_to;
		this.slip_occr_cd = slip_occr_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setSlip_occr_fr(String slip_occr_fr){
		this.slip_occr_fr = slip_occr_fr;
	}

	public void setSlip_occr_to(String slip_occr_to){
		this.slip_occr_to = slip_occr_to;
	}

	public void setSlip_occr_cd(String slip_occr_cd){
		this.slip_occr_cd = slip_occr_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getSlip_occr_fr(){
		return this.slip_occr_fr;
	}

	public String getSlip_occr_to(){
		return this.slip_occr_to;
	}

	public String getSlip_occr_cd(){
		return this.slip_occr_cd;
	}

	public String getSQL(){
		 return "{ call MISCOM.SP_CO_SEMURO_1900_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_SEMURO_1900_LDM dm = (CO_SEMURO_1900_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.slip_occr_fr);
		cstmt.setString(6, dm.slip_occr_to);
		cstmt.setString(7, dm.slip_occr_cd);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.semuro.ds.CO_SEMURO_1900_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("emp_no = " + getEmp_no());
        System.out.println("slip_occr_fr = " + getSlip_occr_fr());
        System.out.println("slip_occr_to = " + getSlip_occr_to());
        System.out.println("slip_occr_cd = " + getSlip_occr_cd());
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
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String slip_occr_fr = req.getParameter("slip_occr_fr");
if( slip_occr_fr == null){
	System.out.println(this.toString+" : slip_occr_fr is null" );
}else{
	System.out.println(this.toString+" : slip_occr_fr is "+slip_occr_fr );
}
String slip_occr_to = req.getParameter("slip_occr_to");
if( slip_occr_to == null){
	System.out.println(this.toString+" : slip_occr_to is null" );
}else{
	System.out.println(this.toString+" : slip_occr_to is "+slip_occr_to );
}
String slip_occr_cd = req.getParameter("slip_occr_cd");
if( slip_occr_cd == null){
	System.out.println(this.toString+" : slip_occr_cd is null" );
}else{
	System.out.println(this.toString+" : slip_occr_cd is "+slip_occr_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String slip_occr_fr = Util.checkString(req.getParameter("slip_occr_fr"));
String slip_occr_to = Util.checkString(req.getParameter("slip_occr_to"));
String slip_occr_cd = Util.checkString(req.getParameter("slip_occr_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String slip_occr_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_fr")));
String slip_occr_to = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_to")));
String slip_occr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setSlip_occr_fr(slip_occr_fr);
dm.setSlip_occr_to(slip_occr_to);
dm.setSlip_occr_cd(slip_occr_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 17 11:58:19 KST 2009 */