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


package chosun.ciis.co.semuro.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.semuro.ds.*;
import chosun.ciis.co.semuro.rec.*;

/**
 * 
 */


public class CO_SEMURO_1600_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String from_dt;
	public String to_dt;
	public String emp_no;
	public String per_ipaddr;
	public String recv_id;
	public String semuro_id;
	public String stmt_clsf;
	public String tmsg_type;
	public String pers_clsf;
	public String slip_clsf_cd;

	public CO_SEMURO_1600_ADM(){}
	public CO_SEMURO_1600_ADM(String cmpy_cd, String from_dt, String to_dt, String emp_no, String per_ipaddr, String recv_id, String semuro_id, String stmt_clsf, String tmsg_type, String pers_clsf, String slip_clsf_cd){
		this.cmpy_cd = cmpy_cd;
		this.from_dt = from_dt;
		this.to_dt = to_dt;
		this.emp_no = emp_no;
		this.per_ipaddr = per_ipaddr;
		this.recv_id = recv_id;
		this.semuro_id = semuro_id;
		this.stmt_clsf = stmt_clsf;
		this.tmsg_type = tmsg_type;
		this.pers_clsf = pers_clsf;
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFrom_dt(String from_dt){
		this.from_dt = from_dt;
	}

	public void setTo_dt(String to_dt){
		this.to_dt = to_dt;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setPer_ipaddr(String per_ipaddr){
		this.per_ipaddr = per_ipaddr;
	}

	public void setRecv_id(String recv_id){
		this.recv_id = recv_id;
	}

	public void setSemuro_id(String semuro_id){
		this.semuro_id = semuro_id;
	}

	public void setStmt_clsf(String stmt_clsf){
		this.stmt_clsf = stmt_clsf;
	}

	public void setTmsg_type(String tmsg_type){
		this.tmsg_type = tmsg_type;
	}

	public void setPers_clsf(String pers_clsf){
		this.pers_clsf = pers_clsf;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFrom_dt(){
		return this.from_dt;
	}

	public String getTo_dt(){
		return this.to_dt;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getPer_ipaddr(){
		return this.per_ipaddr;
	}

	public String getRecv_id(){
		return this.recv_id;
	}

	public String getSemuro_id(){
		return this.semuro_id;
	}

	public String getStmt_clsf(){
		return this.stmt_clsf;
	}

	public String getTmsg_type(){
		return this.tmsg_type;
	}

	public String getPers_clsf(){
		return this.pers_clsf;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSQL(){
		 return "{ call MISCOM.SP_CO_SEMURO_1600_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_SEMURO_1600_ADM dm = (CO_SEMURO_1600_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.from_dt);
		cstmt.setString(5, dm.to_dt);
		cstmt.setString(6, dm.emp_no);
		cstmt.setString(7, dm.per_ipaddr);
		cstmt.setString(8, dm.recv_id);
		cstmt.setString(9, dm.semuro_id);
		cstmt.setString(10, dm.stmt_clsf);
		cstmt.setString(11, dm.tmsg_type);
		cstmt.setString(12, dm.pers_clsf);
		cstmt.setString(13, dm.slip_clsf_cd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.semuro.ds.CO_SEMURO_1600_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("from_dt = [" + getFrom_dt() + "]");
		System.out.println("to_dt = [" + getTo_dt() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("per_ipaddr = [" + getPer_ipaddr() + "]");
		System.out.println("recv_id = [" + getRecv_id() + "]");
		System.out.println("semuro_id = [" + getSemuro_id() + "]");
		System.out.println("stmt_clsf = [" + getStmt_clsf() + "]");
		System.out.println("tmsg_type = [" + getTmsg_type() + "]");
		System.out.println("pers_clsf = [" + getPers_clsf() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
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
String from_dt = req.getParameter("from_dt");
if( from_dt == null){
	System.out.println(this.toString+" : from_dt is null" );
}else{
	System.out.println(this.toString+" : from_dt is "+from_dt );
}
String to_dt = req.getParameter("to_dt");
if( to_dt == null){
	System.out.println(this.toString+" : to_dt is null" );
}else{
	System.out.println(this.toString+" : to_dt is "+to_dt );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String per_ipaddr = req.getParameter("per_ipaddr");
if( per_ipaddr == null){
	System.out.println(this.toString+" : per_ipaddr is null" );
}else{
	System.out.println(this.toString+" : per_ipaddr is "+per_ipaddr );
}
String recv_id = req.getParameter("recv_id");
if( recv_id == null){
	System.out.println(this.toString+" : recv_id is null" );
}else{
	System.out.println(this.toString+" : recv_id is "+recv_id );
}
String semuro_id = req.getParameter("semuro_id");
if( semuro_id == null){
	System.out.println(this.toString+" : semuro_id is null" );
}else{
	System.out.println(this.toString+" : semuro_id is "+semuro_id );
}
String stmt_clsf = req.getParameter("stmt_clsf");
if( stmt_clsf == null){
	System.out.println(this.toString+" : stmt_clsf is null" );
}else{
	System.out.println(this.toString+" : stmt_clsf is "+stmt_clsf );
}
String tmsg_type = req.getParameter("tmsg_type");
if( tmsg_type == null){
	System.out.println(this.toString+" : tmsg_type is null" );
}else{
	System.out.println(this.toString+" : tmsg_type is "+tmsg_type );
}
String pers_clsf = req.getParameter("pers_clsf");
if( pers_clsf == null){
	System.out.println(this.toString+" : pers_clsf is null" );
}else{
	System.out.println(this.toString+" : pers_clsf is "+pers_clsf );
}
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String from_dt = Util.checkString(req.getParameter("from_dt"));
String to_dt = Util.checkString(req.getParameter("to_dt"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String per_ipaddr = Util.checkString(req.getParameter("per_ipaddr"));
String recv_id = Util.checkString(req.getParameter("recv_id"));
String semuro_id = Util.checkString(req.getParameter("semuro_id"));
String stmt_clsf = Util.checkString(req.getParameter("stmt_clsf"));
String tmsg_type = Util.checkString(req.getParameter("tmsg_type"));
String pers_clsf = Util.checkString(req.getParameter("pers_clsf"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String from_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("from_dt")));
String to_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_dt")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String per_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("per_ipaddr")));
String recv_id = Util.Uni2Ksc(Util.checkString(req.getParameter("recv_id")));
String semuro_id = Util.Uni2Ksc(Util.checkString(req.getParameter("semuro_id")));
String stmt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("stmt_clsf")));
String tmsg_type = Util.Uni2Ksc(Util.checkString(req.getParameter("tmsg_type")));
String pers_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("pers_clsf")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFrom_dt(from_dt);
dm.setTo_dt(to_dt);
dm.setEmp_no(emp_no);
dm.setPer_ipaddr(per_ipaddr);
dm.setRecv_id(recv_id);
dm.setSemuro_id(semuro_id);
dm.setStmt_clsf(stmt_clsf);
dm.setTmsg_type(tmsg_type);
dm.setPers_clsf(pers_clsf);
dm.setSlip_clsf_cd(slip_clsf_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 16 17:08:01 KST 2009 */