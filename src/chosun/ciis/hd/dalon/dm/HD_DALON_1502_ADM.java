
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


public class HD_DALON_1502_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String chk;
	public String emp_no;
	public String cost_obj_clsf;
	public String dept_cd;
	public String frdt;
	public String todt;
	public String out_in_plac;
	public String cost;
	public String proc_stat;
	public String tablename;
	public String occr_dt;
	public String seq;
	public String excl_pers_clsf;
	public String connect_ip;
	public String connect_userid;	


	public HD_DALON_1502_ADM(){}
	public HD_DALON_1502_ADM(String mode, String cmpy_cd, String chk, String emp_no, String cost_obj_clsf, String dept_cd, String frdt, String todt, String out_in_plac, String cost, String proc_stat, String tablename, String occr_dt, String seq, String excl_pers_clsf, String connect_ip, String connect_userid){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.chk = chk;
		this.emp_no = emp_no;
		this.cost_obj_clsf = cost_obj_clsf;
		this.dept_cd = dept_cd;
		this.frdt = frdt;
		this.todt = todt;
		this.out_in_plac = out_in_plac;
		this.cost = cost;
		this.proc_stat = proc_stat;
		this.tablename = tablename;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.excl_pers_clsf = excl_pers_clsf;
		this.connect_ip = connect_ip;
		this.connect_userid = connect_userid;		
		
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setChk(String chk){
		this.chk = chk;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setCost_obj_clsf(String cost_obj_clsf){
		this.cost_obj_clsf = cost_obj_clsf;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
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

	public void setCost(String cost){
		this.cost = cost;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setTablename(String tablename){
		this.tablename = tablename;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}
	
	public void setSeq(String seq){
		this.seq = seq;
	}
	
	public void setExcl_pers_clsf(String excl_pers_clsf){
		this.excl_pers_clsf = excl_pers_clsf;
	}

	public void setConnect_ip(String connect_ip){
		this.connect_ip = connect_ip;
	}

	public void setConnect_userid(String connect_userid){
		this.connect_userid = connect_userid;
	}
	
	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getChk(){
		return this.chk;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getCost_obj_clsf(){
		return this.cost_obj_clsf;
	}

	public String getDept_cd(){
		return this.dept_cd;
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

	public String getCost(){
		return this.cost;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getTablename(){
		return this.tablename;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}
	
	public String getSeq(){
		return this.seq;
	}
	
	public String getExcl_pers_clsf(){
		return this.excl_pers_clsf;
	}

	public String getConnect_ip(){
		return this.connect_ip;
	}

	public String getConnect_userid(){
		return this.connect_userid;
	}
	
	public String getSQL(){
		 return "{ call MISHDL.SP_HD_DALON_1502_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_DALON_1502_ADM dm = (HD_DALON_1502_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.chk);
		cstmt.setString(6, dm.emp_no);
		cstmt.setString(7, dm.cost_obj_clsf);
		cstmt.setString(8, dm.occr_dt);
		cstmt.setString(9, dm.seq);
		cstmt.setString(10, dm.dept_cd);
		cstmt.setString(11, dm.frdt);
		cstmt.setString(12, dm.todt);
		cstmt.setString(13, dm.out_in_plac);
		cstmt.setString(14, dm.cost);
		cstmt.setString(15, dm.proc_stat);
		cstmt.setString(16, dm.excl_pers_clsf);
		cstmt.setString(17, dm.tablename);
		cstmt.setString(18, dm.connect_ip);
		cstmt.setString(19, dm.connect_userid);		
		
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.dalon.ds.HD_DALON_1502_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("chk = [" + getChk() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("cost_obj_clsf = [" + getCost_obj_clsf() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("out_in_plac = [" + getOut_in_plac() + "]");
		System.out.println("cost = [" + getCost() + "]");
		System.out.println("proc_stat = [" + getProc_stat() + "]");
		System.out.println("excl_pers_clsf = [" + getExcl_pers_clsf() + "]");
		System.out.println("tablename = [" + getTablename() + "]");
		System.out.println("connect_ip = [" + getConnect_ip() + "]");
		System.out.println("connect_userid = [" + getConnect_userid() + "]");		
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String chk = req.getParameter("chk");
if( chk == null){
	System.out.println(this.toString+" : chk is null" );
}else{
	System.out.println(this.toString+" : chk is "+chk );
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
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
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
String cost = req.getParameter("cost");
if( cost == null){
	System.out.println(this.toString+" : cost is null" );
}else{
	System.out.println(this.toString+" : cost is "+cost );
}
String proc_stat = req.getParameter("proc_stat");
if( proc_stat == null){
	System.out.println(this.toString+" : proc_stat is null" );
}else{
	System.out.println(this.toString+" : proc_stat is "+proc_stat );
}
String tablename = req.getParameter("tablename");
if( tablename == null){
	System.out.println(this.toString+" : tablename is null" );
}else{
	System.out.println(this.toString+" : tablename is "+tablename );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String chk = Util.checkString(req.getParameter("chk"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String cost_obj_clsf = Util.checkString(req.getParameter("cost_obj_clsf"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String out_in_plac = Util.checkString(req.getParameter("out_in_plac"));
String cost = Util.checkString(req.getParameter("cost"));
String proc_stat = Util.checkString(req.getParameter("proc_stat"));
String tablename = Util.checkString(req.getParameter("tablename"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String chk = Util.Uni2Ksc(Util.checkString(req.getParameter("chk")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String cost_obj_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("cost_obj_clsf")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String out_in_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("out_in_plac")));
String cost = Util.Uni2Ksc(Util.checkString(req.getParameter("cost")));
String proc_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_stat")));
String tablename = Util.Uni2Ksc(Util.checkString(req.getParameter("tablename")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setChk(chk);
dm.setEmp_no(emp_no);
dm.setCost_obj_clsf(cost_obj_clsf);
dm.setDept_cd(dept_cd);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setOut_in_plac(out_in_plac);
dm.setCost(cost);
dm.setProc_stat(proc_stat);
dm.setTablename(tablename);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 16 14:55:53 KST 2009 */