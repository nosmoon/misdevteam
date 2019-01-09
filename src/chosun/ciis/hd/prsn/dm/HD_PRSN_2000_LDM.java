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


package chosun.ciis.hd.prsn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.prsn.ds.*;
import chosun.ciis.hd.prsn.rec.*;

/**
 * 
 */


public class HD_PRSN_2000_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String dept_cd;
	public String annc_frdt;
	public String annc_todt;

	public HD_PRSN_2000_LDM(){}
	public HD_PRSN_2000_LDM(String cmpy_cd, String emp_no, String dept_cd, String annc_frdt, String annc_todt){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.dept_cd = dept_cd;
		this.annc_frdt = annc_frdt;
		this.annc_todt = annc_todt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setAnnc_frdt(String annc_frdt){
		this.annc_frdt = annc_frdt;
	}

	public void setAnnc_todt(String annc_todt){
		this.annc_todt = annc_todt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getAnnc_frdt(){
		return this.annc_frdt;
	}

	public String getAnnc_todt(){
		return this.annc_todt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_PRSN_2000_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_PRSN_2000_LDM dm = (HD_PRSN_2000_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.dept_cd);
		cstmt.setString(6, dm.annc_frdt);
		cstmt.setString(7, dm.annc_todt);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.prsn.ds.HD_PRSN_2000_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("emp_no = " + getEmp_no());
        System.out.println("dept_cd = " + getDept_cd());
        System.out.println("annc_frdt = " + getAnnc_frdt());
        System.out.println("annc_todt = " + getAnnc_todt());
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
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String annc_frdt = req.getParameter("annc_frdt");
if( annc_frdt == null){
	System.out.println(this.toString+" : annc_frdt is null" );
}else{
	System.out.println(this.toString+" : annc_frdt is "+annc_frdt );
}
String annc_todt = req.getParameter("annc_todt");
if( annc_todt == null){
	System.out.println(this.toString+" : annc_todt is null" );
}else{
	System.out.println(this.toString+" : annc_todt is "+annc_todt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String annc_frdt = Util.checkString(req.getParameter("annc_frdt"));
String annc_todt = Util.checkString(req.getParameter("annc_todt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String annc_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("annc_frdt")));
String annc_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("annc_todt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setDept_cd(dept_cd);
dm.setAnnc_frdt(annc_frdt);
dm.setAnnc_todt(annc_todt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Apr 12 14:05:43 KST 2009 */