

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


public class HD_SALY_1350_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String rfl_saly_yy;
	public String rfl_saly_no;
	public String emp_no;
	public String exst_pay_saly_yy;
	public String exst_pay_saly_no;
	public String retr_rgla_saly;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_SALY_1350_ADM(){}
	public HD_SALY_1350_ADM(String cmpy_cd, String mode, String rfl_saly_yy, String rfl_saly_no, String emp_no, String exst_pay_saly_yy, String exst_pay_saly_no, String retr_rgla_saly, String incmg_pers_ipadd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.rfl_saly_yy = rfl_saly_yy;
		this.rfl_saly_no = rfl_saly_no;
		this.emp_no = emp_no;
		this.exst_pay_saly_yy = exst_pay_saly_yy;
		this.exst_pay_saly_no = exst_pay_saly_no;
		this.retr_rgla_saly = retr_rgla_saly;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setRfl_saly_yy(String rfl_saly_yy){
		this.rfl_saly_yy = rfl_saly_yy;
	}

	public void setRfl_saly_no(String rfl_saly_no){
		this.rfl_saly_no = rfl_saly_no;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setExst_pay_saly_yy(String exst_pay_saly_yy){
		this.exst_pay_saly_yy = exst_pay_saly_yy;
	}

	public void setExst_pay_saly_no(String exst_pay_saly_no){
		this.exst_pay_saly_no = exst_pay_saly_no;
	}

	public void setRetr_rgla_saly(String retr_rgla_saly){
		this.retr_rgla_saly = retr_rgla_saly;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getRfl_saly_yy(){
		return this.rfl_saly_yy;
	}

	public String getRfl_saly_no(){
		return this.rfl_saly_no;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getExst_pay_saly_yy(){
		return this.exst_pay_saly_yy;
	}

	public String getExst_pay_saly_no(){
		return this.exst_pay_saly_no;
	}

	public String getRetr_rgla_saly(){
		return this.retr_rgla_saly;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SALY_1350_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SALY_1350_ADM dm = (HD_SALY_1350_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, Types.VARCHAR);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.mode);
		cstmt.setString(6, dm.rfl_saly_yy);
		cstmt.setString(7, dm.rfl_saly_no);
		cstmt.setString(8, dm.emp_no);
		cstmt.setString(9, dm.exst_pay_saly_yy);
		cstmt.setString(10, dm.exst_pay_saly_no);
		cstmt.setString(11, dm.retr_rgla_saly);
		cstmt.setString(12, dm.incmg_pers_ipadd);
		cstmt.setString(13, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_SALY_1350_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("rfl_saly_yy = [" + getRfl_saly_yy() + "]");
		System.out.println("rfl_saly_no = [" + getRfl_saly_no() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("exst_pay_saly_yy = [" + getExst_pay_saly_yy() + "]");
		System.out.println("exst_pay_saly_no = [" + getExst_pay_saly_no() + "]");
		System.out.println("retr_rgla_saly = [" + getRetr_rgla_saly() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String rfl_saly_yy = req.getParameter("rfl_saly_yy");
if( rfl_saly_yy == null){
	System.out.println(this.toString+" : rfl_saly_yy is null" );
}else{
	System.out.println(this.toString+" : rfl_saly_yy is "+rfl_saly_yy );
}
String rfl_saly_no = req.getParameter("rfl_saly_no");
if( rfl_saly_no == null){
	System.out.println(this.toString+" : rfl_saly_no is null" );
}else{
	System.out.println(this.toString+" : rfl_saly_no is "+rfl_saly_no );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String exst_pay_saly_yy = req.getParameter("exst_pay_saly_yy");
if( exst_pay_saly_yy == null){
	System.out.println(this.toString+" : exst_pay_saly_yy is null" );
}else{
	System.out.println(this.toString+" : exst_pay_saly_yy is "+exst_pay_saly_yy );
}
String exst_pay_saly_no = req.getParameter("exst_pay_saly_no");
if( exst_pay_saly_no == null){
	System.out.println(this.toString+" : exst_pay_saly_no is null" );
}else{
	System.out.println(this.toString+" : exst_pay_saly_no is "+exst_pay_saly_no );
}
String retr_rgla_saly = req.getParameter("retr_rgla_saly");
if( retr_rgla_saly == null){
	System.out.println(this.toString+" : retr_rgla_saly is null" );
}else{
	System.out.println(this.toString+" : retr_rgla_saly is "+retr_rgla_saly );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
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
String mode = Util.checkString(req.getParameter("mode"));
String rfl_saly_yy = Util.checkString(req.getParameter("rfl_saly_yy"));
String rfl_saly_no = Util.checkString(req.getParameter("rfl_saly_no"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String exst_pay_saly_yy = Util.checkString(req.getParameter("exst_pay_saly_yy"));
String exst_pay_saly_no = Util.checkString(req.getParameter("exst_pay_saly_no"));
String retr_rgla_saly = Util.checkString(req.getParameter("retr_rgla_saly"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String rfl_saly_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("rfl_saly_yy")));
String rfl_saly_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rfl_saly_no")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String exst_pay_saly_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("exst_pay_saly_yy")));
String exst_pay_saly_no = Util.Uni2Ksc(Util.checkString(req.getParameter("exst_pay_saly_no")));
String retr_rgla_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("retr_rgla_saly")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setRfl_saly_yy(rfl_saly_yy);
dm.setRfl_saly_no(rfl_saly_no);
dm.setEmp_no(emp_no);
dm.setExst_pay_saly_yy(exst_pay_saly_yy);
dm.setExst_pay_saly_no(exst_pay_saly_no);
dm.setRetr_rgla_saly(retr_rgla_saly);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 04 09:59:40 KST 2011 */