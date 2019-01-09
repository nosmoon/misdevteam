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


package chosun.ciis.hd.saly.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.ds.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_4301_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String seiz_clsf;
	public String st_acpn_dt;
	public String et_acpn_dt;

	public HD_SALY_4301_LDM(){}
	public HD_SALY_4301_LDM(String cmpy_cd, String emp_no, String seiz_clsf, String st_acpn_dt, String et_acpn_dt){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.seiz_clsf = seiz_clsf;
		this.st_acpn_dt = st_acpn_dt;
		this.et_acpn_dt = et_acpn_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setSeiz_clsf(String seiz_clsf){
		this.seiz_clsf = seiz_clsf;
	}

	public void setSt_acpn_dt(String st_acpn_dt){
		this.st_acpn_dt = st_acpn_dt;
	}

	public void setEt_acpn_dt(String et_acpn_dt){
		this.et_acpn_dt = et_acpn_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getSeiz_clsf(){
		return this.seiz_clsf;
	}

	public String getSt_acpn_dt(){
		return this.st_acpn_dt;
	}

	public String getEt_acpn_dt(){
		return this.et_acpn_dt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SALY_4301_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SALY_4301_LDM dm = (HD_SALY_4301_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.seiz_clsf);
		cstmt.setString(6, dm.st_acpn_dt);
		cstmt.setString(7, dm.et_acpn_dt);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.saly.ds.HD_SALY_4301_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("seiz_clsf = [" + getSeiz_clsf() + "]");
		System.out.println("st_acpn_dt = [" + getSt_acpn_dt() + "]");
		System.out.println("et_acpn_dt = [" + getEt_acpn_dt() + "]");
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
String seiz_clsf = req.getParameter("seiz_clsf");
if( seiz_clsf == null){
	System.out.println(this.toString+" : seiz_clsf is null" );
}else{
	System.out.println(this.toString+" : seiz_clsf is "+seiz_clsf );
}
String st_acpn_dt = req.getParameter("st_acpn_dt");
if( st_acpn_dt == null){
	System.out.println(this.toString+" : st_acpn_dt is null" );
}else{
	System.out.println(this.toString+" : st_acpn_dt is "+st_acpn_dt );
}
String et_acpn_dt = req.getParameter("et_acpn_dt");
if( et_acpn_dt == null){
	System.out.println(this.toString+" : et_acpn_dt is null" );
}else{
	System.out.println(this.toString+" : et_acpn_dt is "+et_acpn_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String seiz_clsf = Util.checkString(req.getParameter("seiz_clsf"));
String st_acpn_dt = Util.checkString(req.getParameter("st_acpn_dt"));
String et_acpn_dt = Util.checkString(req.getParameter("et_acpn_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String seiz_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("seiz_clsf")));
String st_acpn_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("st_acpn_dt")));
String et_acpn_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("et_acpn_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setSeiz_clsf(seiz_clsf);
dm.setSt_acpn_dt(st_acpn_dt);
dm.setEt_acpn_dt(et_acpn_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 20 13:20:16 KST 2009 */