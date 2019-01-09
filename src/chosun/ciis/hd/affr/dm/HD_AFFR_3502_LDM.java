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


package chosun.ciis.hd.affr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.ds.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_3502_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String sch_yyyy;
	public String emp_no;
	public String entr_clsf;
	public String sch_clsf;

	public HD_AFFR_3502_LDM(){}
	public HD_AFFR_3502_LDM(String cmpy_cd, String sch_yyyy, String emp_no, String entr_clsf, String sch_clsf){
		this.cmpy_cd = cmpy_cd;
		this.sch_yyyy = sch_yyyy;
		this.emp_no = emp_no;
		this.entr_clsf = entr_clsf;
		this.sch_clsf = sch_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSch_yyyy(String sch_yyyy){
		this.sch_yyyy = sch_yyyy;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setEntr_clsf(String entr_clsf){
		this.entr_clsf = entr_clsf;
	}

	public void setSch_clsf(String sch_clsf){
		this.sch_clsf = sch_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSch_yyyy(){
		return this.sch_yyyy;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getEntr_clsf(){
		return this.entr_clsf;
	}

	public String getSch_clsf(){
		return this.sch_clsf;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_3502_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_3502_LDM dm = (HD_AFFR_3502_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.sch_yyyy);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.entr_clsf);
		cstmt.setString(7, dm.sch_clsf);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_3502_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("sch_yyyy = [" + getSch_yyyy() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("entr_clsf = [" + getEntr_clsf() + "]");
		System.out.println("sch_clsf = [" + getSch_clsf() + "]");
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
String sch_yyyy = req.getParameter("sch_yyyy");
if( sch_yyyy == null){
	System.out.println(this.toString+" : sch_yyyy is null" );
}else{
	System.out.println(this.toString+" : sch_yyyy is "+sch_yyyy );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String entr_clsf = req.getParameter("entr_clsf");
if( entr_clsf == null){
	System.out.println(this.toString+" : entr_clsf is null" );
}else{
	System.out.println(this.toString+" : entr_clsf is "+entr_clsf );
}
String sch_clsf = req.getParameter("sch_clsf");
if( sch_clsf == null){
	System.out.println(this.toString+" : sch_clsf is null" );
}else{
	System.out.println(this.toString+" : sch_clsf is "+sch_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String sch_yyyy = Util.checkString(req.getParameter("sch_yyyy"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String entr_clsf = Util.checkString(req.getParameter("entr_clsf"));
String sch_clsf = Util.checkString(req.getParameter("sch_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String sch_yyyy = Util.Uni2Ksc(Util.checkString(req.getParameter("sch_yyyy")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String entr_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("entr_clsf")));
String sch_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("sch_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSch_yyyy(sch_yyyy);
dm.setEmp_no(emp_no);
dm.setEntr_clsf(entr_clsf);
dm.setSch_clsf(sch_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Nov 02 20:06:03 KST 2009 */