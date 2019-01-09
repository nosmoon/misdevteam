
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


package chosun.ciis.hd.dalon.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.dalon.ds.*;
import chosun.ciis.hd.dalon.rec.*;

/**
 * 
 */


public class HD_DALON_1600_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dept_cd;
	public String emp_no;
	public String cost_obj_clsf;
	public String stand_dt;
	public String stand_dt_fm;
	public String stand_dt_to;
	public String radio_check_value;

	public HD_DALON_1600_LDM(){}
	public HD_DALON_1600_LDM(String cmpy_cd, String dept_cd, String emp_no, String cost_obj_clsf, String stand_dt, String stand_dt_fm, String stand_dt_to, String radio_check_value){
		this.cmpy_cd = cmpy_cd;
		this.dept_cd = dept_cd;
		this.emp_no = emp_no;
		this.cost_obj_clsf = cost_obj_clsf;
		this.stand_dt = stand_dt;
		this.stand_dt_fm = stand_dt_fm;
		this.stand_dt_to = stand_dt_to;
		this.radio_check_value = radio_check_value;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setCost_obj_clsf(String cost_obj_clsf){
		this.cost_obj_clsf = cost_obj_clsf;
	}

	public void setStand_dt(String stand_dt){
		this.stand_dt = stand_dt;
	}

	public void setStand_dt_fm(String stand_dt_fm){
		this.stand_dt_fm = stand_dt_fm;
	}

	public void setStand_dt_to(String stand_dt_to){
		this.stand_dt_to = stand_dt_to;
	}

	public void setRadio_check_value(String radio_check_value){
		this.radio_check_value = radio_check_value;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getCost_obj_clsf(){
		return this.cost_obj_clsf;
	}

	public String getStand_dt(){
		return this.stand_dt;
	}

	public String getStand_dt_fm(){
		return this.stand_dt_fm;
	}

	public String getStand_dt_to(){
		return this.stand_dt_to;
	}

	public String getRadio_check_value(){
		return this.radio_check_value;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_DALON_1600_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_DALON_1600_LDM dm = (HD_DALON_1600_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dept_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.cost_obj_clsf);
		cstmt.setString(7, dm.stand_dt);
		cstmt.setString(8, dm.stand_dt_fm);
		cstmt.setString(9, dm.stand_dt_to);
		cstmt.setString(10, dm.radio_check_value);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.dalon.ds.HD_DALON_1600_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("cost_obj_clsf = [" + getCost_obj_clsf() + "]");
		System.out.println("stand_dt = [" + getStand_dt() + "]");
		System.out.println("stand_dt_fm = [" + getStand_dt_fm() + "]");
		System.out.println("stand_dt_to = [" + getStand_dt_to() + "]");
		System.out.println("radio_check_value = [" + getRadio_check_value() + "]");
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
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String cost_obj_clsf = req.getParameter("cost_obj_clsf");
if( cost_obj_clsf == null){
	System.out.println(this.toString+" : cost_obj_clsf is null" );
}else{
	System.out.println(this.toString+" : cost_obj_clsf is "+cost_obj_clsf );
}
String stand_dt = req.getParameter("stand_dt");
if( stand_dt == null){
	System.out.println(this.toString+" : stand_dt is null" );
}else{
	System.out.println(this.toString+" : stand_dt is "+stand_dt );
}
String stand_dt_fm = req.getParameter("stand_dt_fm");
if( stand_dt_fm == null){
	System.out.println(this.toString+" : stand_dt_fm is null" );
}else{
	System.out.println(this.toString+" : stand_dt_fm is "+stand_dt_fm );
}
String stand_dt_to = req.getParameter("stand_dt_to");
if( stand_dt_to == null){
	System.out.println(this.toString+" : stand_dt_to is null" );
}else{
	System.out.println(this.toString+" : stand_dt_to is "+stand_dt_to );
}
String radio_check_value = req.getParameter("radio_check_value");
if( radio_check_value == null){
	System.out.println(this.toString+" : radio_check_value is null" );
}else{
	System.out.println(this.toString+" : radio_check_value is "+radio_check_value );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String cost_obj_clsf = Util.checkString(req.getParameter("cost_obj_clsf"));
String stand_dt = Util.checkString(req.getParameter("stand_dt"));
String stand_dt_fm = Util.checkString(req.getParameter("stand_dt_fm"));
String stand_dt_to = Util.checkString(req.getParameter("stand_dt_to"));
String radio_check_value = Util.checkString(req.getParameter("radio_check_value"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String cost_obj_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("cost_obj_clsf")));
String stand_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("stand_dt")));
String stand_dt_fm = Util.Uni2Ksc(Util.checkString(req.getParameter("stand_dt_fm")));
String stand_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("stand_dt_to")));
String radio_check_value = Util.Uni2Ksc(Util.checkString(req.getParameter("radio_check_value")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDept_cd(dept_cd);
dm.setEmp_no(emp_no);
dm.setCost_obj_clsf(cost_obj_clsf);
dm.setStand_dt(stand_dt);
dm.setStand_dt_fm(stand_dt_fm);
dm.setStand_dt_to(stand_dt_to);
dm.setRadio_check_value(radio_check_value);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 16 17:39:50 KST 2009 */