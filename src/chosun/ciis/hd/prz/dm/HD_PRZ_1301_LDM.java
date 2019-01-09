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


package chosun.ciis.hd.prz.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.prz.ds.*;
import chosun.ciis.hd.prz.rec.*;

/**
 * 
 */


public class HD_PRZ_1301_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String tms_s;
	public String tms_e;
	public String dept_cd;
	public String main_insp_dt_fm;
	public String main_insp_dt_to;
	public String aplc_clsf;
	public String obj_clsf;
	public String emp_no;

	public HD_PRZ_1301_LDM(){}
	public HD_PRZ_1301_LDM(String cmpy_cd, String tms_s, String tms_e, String dept_cd, String main_insp_dt_fm, String main_insp_dt_to, String aplc_clsf, String obj_clsf, String emp_no){
		this.cmpy_cd = cmpy_cd;
		this.tms_s = tms_s;
		this.tms_e = tms_e;
		this.dept_cd = dept_cd;
		this.main_insp_dt_fm = main_insp_dt_fm;
		this.main_insp_dt_to = main_insp_dt_to;
		this.aplc_clsf = aplc_clsf;
		this.obj_clsf = obj_clsf;
		this.emp_no = emp_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setTms_s(String tms_s){
		this.tms_s = tms_s;
	}

	public void setTms_e(String tms_e){
		this.tms_e = tms_e;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setMain_insp_dt_fm(String main_insp_dt_fm){
		this.main_insp_dt_fm = main_insp_dt_fm;
	}

	public void setMain_insp_dt_to(String main_insp_dt_to){
		this.main_insp_dt_to = main_insp_dt_to;
	}

	public void setAplc_clsf(String aplc_clsf){
		this.aplc_clsf = aplc_clsf;
	}

	public void setObj_clsf(String obj_clsf){
		this.obj_clsf = obj_clsf;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getTms_s(){
		return this.tms_s;
	}

	public String getTms_e(){
		return this.tms_e;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getMain_insp_dt_fm(){
		return this.main_insp_dt_fm;
	}

	public String getMain_insp_dt_to(){
		return this.main_insp_dt_to;
	}

	public String getAplc_clsf(){
		return this.aplc_clsf;
	}

	public String getObj_clsf(){
		return this.obj_clsf;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_PRZ_1301_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_PRZ_1301_LDM dm = (HD_PRZ_1301_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.tms_s);
		cstmt.setString(5, dm.tms_e);
		cstmt.setString(6, dm.dept_cd);
		cstmt.setString(7, dm.main_insp_dt_fm);
		cstmt.setString(8, dm.main_insp_dt_to);
		cstmt.setString(9, dm.aplc_clsf);
		cstmt.setString(10, dm.obj_clsf);
		cstmt.setString(11, dm.emp_no);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_PRZ_1301_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("tms_s = [" + getTms_s() + "]");
		System.out.println("tms_e = [" + getTms_e() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("main_insp_dt_fm = [" + getMain_insp_dt_fm() + "]");
		System.out.println("main_insp_dt_to = [" + getMain_insp_dt_to() + "]");
		System.out.println("aplc_clsf = [" + getAplc_clsf() + "]");
		System.out.println("obj_clsf = [" + getObj_clsf() + "]");
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
String tms_s = req.getParameter("tms_s");
if( tms_s == null){
	System.out.println(this.toString+" : tms_s is null" );
}else{
	System.out.println(this.toString+" : tms_s is "+tms_s );
}
String tms_e = req.getParameter("tms_e");
if( tms_e == null){
	System.out.println(this.toString+" : tms_e is null" );
}else{
	System.out.println(this.toString+" : tms_e is "+tms_e );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String main_insp_dt_fm = req.getParameter("main_insp_dt_fm");
if( main_insp_dt_fm == null){
	System.out.println(this.toString+" : main_insp_dt_fm is null" );
}else{
	System.out.println(this.toString+" : main_insp_dt_fm is "+main_insp_dt_fm );
}
String main_insp_dt_to = req.getParameter("main_insp_dt_to");
if( main_insp_dt_to == null){
	System.out.println(this.toString+" : main_insp_dt_to is null" );
}else{
	System.out.println(this.toString+" : main_insp_dt_to is "+main_insp_dt_to );
}
String aplc_clsf = req.getParameter("aplc_clsf");
if( aplc_clsf == null){
	System.out.println(this.toString+" : aplc_clsf is null" );
}else{
	System.out.println(this.toString+" : aplc_clsf is "+aplc_clsf );
}
String obj_clsf = req.getParameter("obj_clsf");
if( obj_clsf == null){
	System.out.println(this.toString+" : obj_clsf is null" );
}else{
	System.out.println(this.toString+" : obj_clsf is "+obj_clsf );
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
String tms_s = Util.checkString(req.getParameter("tms_s"));
String tms_e = Util.checkString(req.getParameter("tms_e"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String main_insp_dt_fm = Util.checkString(req.getParameter("main_insp_dt_fm"));
String main_insp_dt_to = Util.checkString(req.getParameter("main_insp_dt_to"));
String aplc_clsf = Util.checkString(req.getParameter("aplc_clsf"));
String obj_clsf = Util.checkString(req.getParameter("obj_clsf"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String tms_s = Util.Uni2Ksc(Util.checkString(req.getParameter("tms_s")));
String tms_e = Util.Uni2Ksc(Util.checkString(req.getParameter("tms_e")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String main_insp_dt_fm = Util.Uni2Ksc(Util.checkString(req.getParameter("main_insp_dt_fm")));
String main_insp_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("main_insp_dt_to")));
String aplc_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_clsf")));
String obj_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("obj_clsf")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setTms_s(tms_s);
dm.setTms_e(tms_e);
dm.setDept_cd(dept_cd);
dm.setMain_insp_dt_fm(main_insp_dt_fm);
dm.setMain_insp_dt_to(main_insp_dt_to);
dm.setAplc_clsf(aplc_clsf);
dm.setObj_clsf(obj_clsf);
dm.setEmp_no(emp_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Nov 23 14:12:37 KST 2009 */