

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


public class HD_DALON_1510_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String cost_obj_clsf;
	public String frdt;
	public String todt;
	public String out_in_plac;
	public String connect_ip;
	public String connect_userid;

	public HD_DALON_1510_ADM(){}
	public HD_DALON_1510_ADM(String cmpy_cd, String emp_no, String cost_obj_clsf, String frdt, String todt, String out_in_plac, String connect_ip, String connect_userid){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.cost_obj_clsf = cost_obj_clsf;
		this.frdt = frdt;
		this.todt = todt;
		this.out_in_plac = out_in_plac;
		this.connect_ip = connect_ip;
		this.connect_userid = connect_userid;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setCost_obj_clsf(String cost_obj_clsf){
		this.cost_obj_clsf = cost_obj_clsf;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setOut_in_plac(String out_in_plac){
		this.out_in_plac = out_in_plac;
	}

	public void setConnect_ip(String connect_ip){
		this.connect_ip = connect_ip;
	}

	public void setConnect_userid(String connect_userid){
		this.connect_userid = connect_userid;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getCost_obj_clsf(){
		return this.cost_obj_clsf;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getOut_in_plac(){
		return this.out_in_plac;
	}

	public String getConnect_ip(){
		return this.connect_ip;
	}

	public String getConnect_userid(){
		return this.connect_userid;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_DALON_1510_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_DALON_1510_ADM dm = (HD_DALON_1510_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.cost_obj_clsf);
		cstmt.setString(6, dm.frdt);
		cstmt.setString(7, dm.todt);
		cstmt.setString(8, dm.out_in_plac);
		cstmt.setString(9, dm.connect_ip);
		cstmt.setString(10, dm.connect_userid);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_DALON_1510_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("cost_obj_clsf = [" + getCost_obj_clsf() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("out_in_plac = [" + getOut_in_plac() + "]");
		System.out.println("connect_ip = [" + getConnect_ip() + "]");
		System.out.println("connect_userid = [" + getConnect_userid() + "]");
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
String cost_obj_clsf = req.getParameter("cost_obj_clsf");
if( cost_obj_clsf == null){
	System.out.println(this.toString+" : cost_obj_clsf is null" );
}else{
	System.out.println(this.toString+" : cost_obj_clsf is "+cost_obj_clsf );
}
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String out_in_plac = req.getParameter("out_in_plac");
if( out_in_plac == null){
	System.out.println(this.toString+" : out_in_plac is null" );
}else{
	System.out.println(this.toString+" : out_in_plac is "+out_in_plac );
}
String connect_ip = req.getParameter("connect_ip");
if( connect_ip == null){
	System.out.println(this.toString+" : connect_ip is null" );
}else{
	System.out.println(this.toString+" : connect_ip is "+connect_ip );
}
String connect_userid = req.getParameter("connect_userid");
if( connect_userid == null){
	System.out.println(this.toString+" : connect_userid is null" );
}else{
	System.out.println(this.toString+" : connect_userid is "+connect_userid );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String cost_obj_clsf = Util.checkString(req.getParameter("cost_obj_clsf"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String out_in_plac = Util.checkString(req.getParameter("out_in_plac"));
String connect_ip = Util.checkString(req.getParameter("connect_ip"));
String connect_userid = Util.checkString(req.getParameter("connect_userid"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String cost_obj_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("cost_obj_clsf")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String out_in_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("out_in_plac")));
String connect_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("connect_ip")));
String connect_userid = Util.Uni2Ksc(Util.checkString(req.getParameter("connect_userid")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setCost_obj_clsf(cost_obj_clsf);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setOut_in_plac(out_in_plac);
dm.setConnect_ip(connect_ip);
dm.setConnect_userid(connect_userid);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 14 11:34:24 KST 2011 */