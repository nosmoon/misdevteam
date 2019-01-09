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


package chosun.ciis.hd.lvcmpy.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.lvcmpy.ds.*;
import chosun.ciis.hd.lvcmpy.rec.*;

/**
 * 
 */


public class HD_LVCMPY_2000_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String lvcmpy_mm_np;
	public String lvcmpy_mm_hlth;
	public String lvcmpy_mm_emp;
	public String emp_insr_fee_drbk_amt;
	public String incmg_pers;

	public HD_LVCMPY_2000_UDM(){}
	public HD_LVCMPY_2000_UDM(String cmpy_cd, String emp_no, String lvcmpy_mm_np, String lvcmpy_mm_hlth, String lvcmpy_mm_emp, String emp_insr_fee_drbk_amt, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.lvcmpy_mm_np = lvcmpy_mm_np;
		this.lvcmpy_mm_hlth = lvcmpy_mm_hlth;
		this.lvcmpy_mm_emp = lvcmpy_mm_emp;
		this.emp_insr_fee_drbk_amt = emp_insr_fee_drbk_amt;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setLvcmpy_mm_np(String lvcmpy_mm_np){
		this.lvcmpy_mm_np = lvcmpy_mm_np;
	}

	public void setLvcmpy_mm_hlth(String lvcmpy_mm_hlth){
		this.lvcmpy_mm_hlth = lvcmpy_mm_hlth;
	}

	public void setLvcmpy_mm_emp(String lvcmpy_mm_emp){
		this.lvcmpy_mm_emp = lvcmpy_mm_emp;
	}

	public void setEmp_insr_fee_drbk_amt(String emp_insr_fee_drbk_amt){
		this.emp_insr_fee_drbk_amt = emp_insr_fee_drbk_amt;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getLvcmpy_mm_np(){
		return this.lvcmpy_mm_np;
	}

	public String getLvcmpy_mm_hlth(){
		return this.lvcmpy_mm_hlth;
	}

	public String getLvcmpy_mm_emp(){
		return this.lvcmpy_mm_emp;
	}

	public String getEmp_insr_fee_drbk_amt(){
		return this.emp_insr_fee_drbk_amt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_LVCMPY_2000_U(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_LVCMPY_2000_UDM dm = (HD_LVCMPY_2000_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.lvcmpy_mm_np);
		cstmt.setString(6, dm.lvcmpy_mm_hlth);
		cstmt.setString(7, dm.lvcmpy_mm_emp);
		cstmt.setString(8, dm.emp_insr_fee_drbk_amt);
		cstmt.setString(9, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.lvcmpy.ds.HD_LVCMPY_2000_UDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("emp_no = " + getEmp_no());
        System.out.println("lvcmpy_mm_np = " + getLvcmpy_mm_np());
        System.out.println("lvcmpy_mm_hlth = " + getLvcmpy_mm_hlth());
        System.out.println("lvcmpy_mm_emp = " + getLvcmpy_mm_emp());
        System.out.println("emp_insr_fee_drbk_amt = " + getEmp_insr_fee_drbk_amt());
        System.out.println("incmg_pers = " + getIncmg_pers());
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
String lvcmpy_mm_np = req.getParameter("lvcmpy_mm_np");
if( lvcmpy_mm_np == null){
	System.out.println(this.toString+" : lvcmpy_mm_np is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_mm_np is "+lvcmpy_mm_np );
}
String lvcmpy_mm_hlth = req.getParameter("lvcmpy_mm_hlth");
if( lvcmpy_mm_hlth == null){
	System.out.println(this.toString+" : lvcmpy_mm_hlth is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_mm_hlth is "+lvcmpy_mm_hlth );
}
String lvcmpy_mm_emp = req.getParameter("lvcmpy_mm_emp");
if( lvcmpy_mm_emp == null){
	System.out.println(this.toString+" : lvcmpy_mm_emp is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_mm_emp is "+lvcmpy_mm_emp );
}
String emp_insr_fee_drbk_amt = req.getParameter("emp_insr_fee_drbk_amt");
if( emp_insr_fee_drbk_amt == null){
	System.out.println(this.toString+" : emp_insr_fee_drbk_amt is null" );
}else{
	System.out.println(this.toString+" : emp_insr_fee_drbk_amt is "+emp_insr_fee_drbk_amt );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String lvcmpy_mm_np = Util.checkString(req.getParameter("lvcmpy_mm_np"));
String lvcmpy_mm_hlth = Util.checkString(req.getParameter("lvcmpy_mm_hlth"));
String lvcmpy_mm_emp = Util.checkString(req.getParameter("lvcmpy_mm_emp"));
String emp_insr_fee_drbk_amt = Util.checkString(req.getParameter("emp_insr_fee_drbk_amt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String lvcmpy_mm_np = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_mm_np")));
String lvcmpy_mm_hlth = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_mm_hlth")));
String lvcmpy_mm_emp = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_mm_emp")));
String emp_insr_fee_drbk_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_insr_fee_drbk_amt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setLvcmpy_mm_np(lvcmpy_mm_np);
dm.setLvcmpy_mm_hlth(lvcmpy_mm_hlth);
dm.setLvcmpy_mm_emp(lvcmpy_mm_emp);
dm.setEmp_insr_fee_drbk_amt(emp_insr_fee_drbk_amt);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 30 20:47:53 KST 2009 */