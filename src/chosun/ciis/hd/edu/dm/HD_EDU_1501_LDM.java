
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


package chosun.ciis.hd.edu.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.edu.ds.*;
import chosun.ciis.hd.edu.rec.*;

/**
 * 
 */


public class HD_EDU_1501_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dept_cd;
	public String dept_nm;
	public String edu_frdt;
	public String edu_todt;
	public String edu_clsf;

	public HD_EDU_1501_LDM(){}
	public HD_EDU_1501_LDM(String cmpy_cd, String dept_cd, String dept_nm, String edu_frdt, String edu_todt, String edu_clsf){
		this.cmpy_cd = cmpy_cd;
		this.dept_cd = dept_cd;
		this.dept_nm = dept_nm;
		this.edu_frdt = edu_frdt;
		this.edu_todt = edu_todt;
		this.edu_clsf = edu_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEdu_frdt(String edu_frdt){
		this.edu_frdt = edu_frdt;
	}

	public void setEdu_todt(String edu_todt){
		this.edu_todt = edu_todt;
	}

	public void setEdu_clsf(String edu_clsf){
		this.edu_clsf = edu_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getEdu_frdt(){
		return this.edu_frdt;
	}

	public String getEdu_todt(){
		return this.edu_todt;
	}

	public String getEdu_clsf(){
		return this.edu_clsf;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_EDU_1501_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_EDU_1501_LDM dm = (HD_EDU_1501_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dept_cd);
		cstmt.setString(5, dm.dept_nm);
		cstmt.setString(6, dm.edu_frdt);
		cstmt.setString(7, dm.edu_todt);
		cstmt.setString(8, dm.edu_clsf);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.edu.ds.HD_EDU_1501_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("dept_cd = " + getDept_cd());
        System.out.println("dept_nm = " + getDept_nm());
        System.out.println("edu_frdt = " + getEdu_frdt());
        System.out.println("edu_todt = " + getEdu_todt());
        System.out.println("edu_clsf = " + getEdu_clsf());
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
String dept_nm = req.getParameter("dept_nm");
if( dept_nm == null){
	System.out.println(this.toString+" : dept_nm is null" );
}else{
	System.out.println(this.toString+" : dept_nm is "+dept_nm );
}
String edu_frdt = req.getParameter("edu_frdt");
if( edu_frdt == null){
	System.out.println(this.toString+" : edu_frdt is null" );
}else{
	System.out.println(this.toString+" : edu_frdt is "+edu_frdt );
}
String edu_todt = req.getParameter("edu_todt");
if( edu_todt == null){
	System.out.println(this.toString+" : edu_todt is null" );
}else{
	System.out.println(this.toString+" : edu_todt is "+edu_todt );
}
String edu_clsf = req.getParameter("edu_clsf");
if( edu_clsf == null){
	System.out.println(this.toString+" : edu_clsf is null" );
}else{
	System.out.println(this.toString+" : edu_clsf is "+edu_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String dept_nm = Util.checkString(req.getParameter("dept_nm"));
String edu_frdt = Util.checkString(req.getParameter("edu_frdt"));
String edu_todt = Util.checkString(req.getParameter("edu_todt"));
String edu_clsf = Util.checkString(req.getParameter("edu_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String dept_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_nm")));
String edu_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_frdt")));
String edu_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_todt")));
String edu_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDept_cd(dept_cd);
dm.setDept_nm(dept_nm);
dm.setEdu_frdt(edu_frdt);
dm.setEdu_todt(edu_todt);
dm.setEdu_clsf(edu_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 20 09:58:48 KST 2009 */