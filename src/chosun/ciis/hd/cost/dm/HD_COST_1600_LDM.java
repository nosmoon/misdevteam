/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.cost.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.cost.ds.*;
import chosun.ciis.hd.cost.rec.*;

/**
 * 
 */


public class HD_COST_1600_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String decid_yymm_fr;
	public String decid_yymm_to;
	public String hd_mang_clsf;
	public String hd_card_type;
	public String dept_cd;
	public String emp_no;

	public HD_COST_1600_LDM(){}
	public HD_COST_1600_LDM(String cmpy_cd, String decid_yymm_fr, String decid_yymm_to, String hd_mang_clsf, String hd_card_type, String dept_cd, String emp_no){
		this.cmpy_cd = cmpy_cd;
		this.decid_yymm_fr = decid_yymm_fr;
		this.decid_yymm_to = decid_yymm_to;
		this.hd_mang_clsf = hd_mang_clsf;
		this.hd_card_type = hd_card_type;
		this.dept_cd = dept_cd;
		this.emp_no = emp_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDecid_yymm_fr(String decid_yymm_fr){
		this.decid_yymm_fr = decid_yymm_fr;
	}

	public void setDecid_yymm_to(String decid_yymm_to){
		this.decid_yymm_to = decid_yymm_to;
	}

	public void setHd_mang_clsf(String hd_mang_clsf){
		this.hd_mang_clsf = hd_mang_clsf;
	}

	public void setHd_card_type(String hd_card_type){
		this.hd_card_type = hd_card_type;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDecid_yymm_fr(){
		return this.decid_yymm_fr;
	}

	public String getDecid_yymm_to(){
		return this.decid_yymm_to;
	}

	public String getHd_mang_clsf(){
		return this.hd_mang_clsf;
	}

	public String getHd_card_type(){
		return this.hd_card_type;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_COST_1600_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_COST_1600_LDM dm = (HD_COST_1600_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.decid_yymm_fr);
		cstmt.setString(5, dm.decid_yymm_to);
		cstmt.setString(6, dm.hd_mang_clsf);
		cstmt.setString(7, dm.hd_card_type);
		cstmt.setString(8, dm.dept_cd);
		cstmt.setString(9, dm.emp_no);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.cost.ds.HD_COST_1600_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("decid_yymm_fr = [" + getDecid_yymm_fr() + "]");
		System.out.println("decid_yymm_to = [" + getDecid_yymm_to() + "]");
		System.out.println("hd_mang_clsf = [" + getHd_mang_clsf() + "]");
		System.out.println("hd_card_type = [" + getHd_card_type() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
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
String decid_yymm_fr = req.getParameter("decid_yymm_fr");
if( decid_yymm_fr == null){
	System.out.println(this.toString+" : decid_yymm_fr is null" );
}else{
	System.out.println(this.toString+" : decid_yymm_fr is "+decid_yymm_fr );
}
String decid_yymm_to = req.getParameter("decid_yymm_to");
if( decid_yymm_to == null){
	System.out.println(this.toString+" : decid_yymm_to is null" );
}else{
	System.out.println(this.toString+" : decid_yymm_to is "+decid_yymm_to );
}
String hd_mang_clsf = req.getParameter("hd_mang_clsf");
if( hd_mang_clsf == null){
	System.out.println(this.toString+" : hd_mang_clsf is null" );
}else{
	System.out.println(this.toString+" : hd_mang_clsf is "+hd_mang_clsf );
}
String hd_card_type = req.getParameter("hd_card_type");
if( hd_card_type == null){
	System.out.println(this.toString+" : hd_card_type is null" );
}else{
	System.out.println(this.toString+" : hd_card_type is "+hd_card_type );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String decid_yymm_fr = Util.checkString(req.getParameter("decid_yymm_fr"));
String decid_yymm_to = Util.checkString(req.getParameter("decid_yymm_to"));
String hd_mang_clsf = Util.checkString(req.getParameter("hd_mang_clsf"));
String hd_card_type = Util.checkString(req.getParameter("hd_card_type"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String decid_yymm_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("decid_yymm_fr")));
String decid_yymm_to = Util.Uni2Ksc(Util.checkString(req.getParameter("decid_yymm_to")));
String hd_mang_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("hd_mang_clsf")));
String hd_card_type = Util.Uni2Ksc(Util.checkString(req.getParameter("hd_card_type")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDecid_yymm_fr(decid_yymm_fr);
dm.setDecid_yymm_to(decid_yymm_to);
dm.setHd_mang_clsf(hd_mang_clsf);
dm.setHd_card_type(hd_card_type);
dm.setDept_cd(dept_cd);
dm.setEmp_no(emp_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Oct 19 14:53:52 KST 2016 */