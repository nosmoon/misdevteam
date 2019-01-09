

package chosun.ciis.hd.com.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.com.ds.*;
import chosun.ciis.hd.com.rec.*;

/**
 * 
 */


public class HD_COM_5300_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String pgm_id;
	public String pgm_nm;
	public String pgm_url;
	public String job_clsf;
	public String annc_cont;
	public String annc_clsf;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_COM_5300_IDM(){}
	public HD_COM_5300_IDM(String cmpy_cd, String emp_no, String pgm_id, String pgm_nm, String pgm_url, String job_clsf, String annc_cont, String annc_clsf, String incmg_pers_ipadd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.pgm_id = pgm_id;
		this.pgm_nm = pgm_nm;
		this.pgm_url = pgm_url;
		this.job_clsf = job_clsf;
		this.annc_cont = annc_cont;
		this.annc_clsf = annc_clsf;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setPgm_id(String pgm_id){
		this.pgm_id = pgm_id;
	}

	public void setPgm_nm(String pgm_nm){
		this.pgm_nm = pgm_nm;
	}

	public void setPgm_url(String pgm_url){
		this.pgm_url = pgm_url;
	}

	public void setJob_clsf(String job_clsf){
		this.job_clsf = job_clsf;
	}

	public void setAnnc_cont(String annc_cont){
		this.annc_cont = annc_cont;
	}

	public void setAnnc_clsf(String annc_clsf){
		this.annc_clsf = annc_clsf;
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

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getPgm_id(){
		return this.pgm_id;
	}

	public String getPgm_nm(){
		return this.pgm_nm;
	}

	public String getPgm_url(){
		return this.pgm_url;
	}

	public String getJob_clsf(){
		return this.job_clsf;
	}

	public String getAnnc_cont(){
		return this.annc_cont;
	}

	public String getAnnc_clsf(){
		return this.annc_clsf;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_COM_5300_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_COM_5300_IDM dm = (HD_COM_5300_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.pgm_id);
		cstmt.setString(6, dm.pgm_nm);
		cstmt.setString(7, dm.pgm_url);
		cstmt.setString(8, dm.job_clsf);
		cstmt.setString(9, dm.annc_cont);
		cstmt.setString(10, dm.annc_clsf);
		cstmt.setString(11, dm.incmg_pers_ipadd);
		cstmt.setString(12, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_COM_5300_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("pgm_id = [" + getPgm_id() + "]");
		System.out.println("pgm_nm = [" + getPgm_nm() + "]");
		System.out.println("pgm_url = [" + getPgm_url() + "]");
		System.out.println("job_clsf = [" + getJob_clsf() + "]");
		System.out.println("annc_cont = [" + getAnnc_cont() + "]");
		System.out.println("annc_clsf = [" + getAnnc_clsf() + "]");
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
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String pgm_id = req.getParameter("pgm_id");
if( pgm_id == null){
	System.out.println(this.toString+" : pgm_id is null" );
}else{
	System.out.println(this.toString+" : pgm_id is "+pgm_id );
}
String pgm_nm = req.getParameter("pgm_nm");
if( pgm_nm == null){
	System.out.println(this.toString+" : pgm_nm is null" );
}else{
	System.out.println(this.toString+" : pgm_nm is "+pgm_nm );
}
String pgm_url = req.getParameter("pgm_url");
if( pgm_url == null){
	System.out.println(this.toString+" : pgm_url is null" );
}else{
	System.out.println(this.toString+" : pgm_url is "+pgm_url );
}
String job_clsf = req.getParameter("job_clsf");
if( job_clsf == null){
	System.out.println(this.toString+" : job_clsf is null" );
}else{
	System.out.println(this.toString+" : job_clsf is "+job_clsf );
}
String annc_cont = req.getParameter("annc_cont");
if( annc_cont == null){
	System.out.println(this.toString+" : annc_cont is null" );
}else{
	System.out.println(this.toString+" : annc_cont is "+annc_cont );
}
String annc_clsf = req.getParameter("annc_clsf");
if( annc_clsf == null){
	System.out.println(this.toString+" : annc_clsf is null" );
}else{
	System.out.println(this.toString+" : annc_clsf is "+annc_clsf );
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
String emp_no = Util.checkString(req.getParameter("emp_no"));
String pgm_id = Util.checkString(req.getParameter("pgm_id"));
String pgm_nm = Util.checkString(req.getParameter("pgm_nm"));
String pgm_url = Util.checkString(req.getParameter("pgm_url"));
String job_clsf = Util.checkString(req.getParameter("job_clsf"));
String annc_cont = Util.checkString(req.getParameter("annc_cont"));
String annc_clsf = Util.checkString(req.getParameter("annc_clsf"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String pgm_id = Util.Uni2Ksc(Util.checkString(req.getParameter("pgm_id")));
String pgm_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("pgm_nm")));
String pgm_url = Util.Uni2Ksc(Util.checkString(req.getParameter("pgm_url")));
String job_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("job_clsf")));
String annc_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("annc_cont")));
String annc_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("annc_clsf")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setPgm_id(pgm_id);
dm.setPgm_nm(pgm_nm);
dm.setPgm_url(pgm_url);
dm.setJob_clsf(job_clsf);
dm.setAnnc_cont(annc_cont);
dm.setAnnc_clsf(annc_clsf);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 09 15:40:28 KST 2010 */