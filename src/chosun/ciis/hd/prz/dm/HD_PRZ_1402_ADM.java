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


package chosun.ciis.hd.prz.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.prz.ds.*;
import chosun.ciis.hd.prz.rec.*;

/**
 * 
 */


public class HD_PRZ_1402_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String flnm;
	public String dept_cd;
	public String dty_cd;
	public String posi_cd;
	public String req_dt;
	public String displcemt_dt;
	public String connect_ip;
	public String connect_userid;

	public HD_PRZ_1402_ADM(){}
	public HD_PRZ_1402_ADM(String mode, String cmpy_cd, String emp_no, String occr_dt, String seq, String flnm, String dept_cd, String dty_cd, String posi_cd, String req_dt, String displcemt_dt, String connect_ip, String connect_userid){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.flnm = flnm;
		this.dept_cd = dept_cd;
		this.dty_cd = dty_cd;
		this.posi_cd = posi_cd;
		this.req_dt = req_dt;
		this.displcemt_dt = displcemt_dt;
		this.connect_ip = connect_ip;
		this.connect_userid = connect_userid;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setReq_dt(String req_dt){
		this.req_dt = req_dt;
	}

	public void setDisplcemt_dt(String displcemt_dt){
		this.displcemt_dt = displcemt_dt;
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

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getReq_dt(){
		return this.req_dt;
	}

	public String getDisplcemt_dt(){
		return this.displcemt_dt;
	}

	public String getConnect_ip(){
		return this.connect_ip;
	}

	public String getConnect_userid(){
		return this.connect_userid;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_PRZ_1402_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_PRZ_1402_ADM dm = (HD_PRZ_1402_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.occr_dt);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.flnm);
		cstmt.setString(9, dm.dept_cd);
		cstmt.setString(10, dm.dty_cd);
		cstmt.setString(11, dm.posi_cd);
		cstmt.setString(12, dm.req_dt);
		cstmt.setString(13, dm.displcemt_dt);
		cstmt.setString(14, dm.connect_ip);
		cstmt.setString(15, dm.connect_userid);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.prz.ds.HD_PRZ_1402_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("dty_cd = [" + getDty_cd() + "]");
		System.out.println("posi_cd = [" + getPosi_cd() + "]");
		System.out.println("req_dt = [" + getReq_dt() + "]");
		System.out.println("displcemt_dt = [" + getDisplcemt_dt() + "]");
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
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String dty_cd = req.getParameter("dty_cd");
if( dty_cd == null){
	System.out.println(this.toString+" : dty_cd is null" );
}else{
	System.out.println(this.toString+" : dty_cd is "+dty_cd );
}
String posi_cd = req.getParameter("posi_cd");
if( posi_cd == null){
	System.out.println(this.toString+" : posi_cd is null" );
}else{
	System.out.println(this.toString+" : posi_cd is "+posi_cd );
}
String req_dt = req.getParameter("req_dt");
if( req_dt == null){
	System.out.println(this.toString+" : req_dt is null" );
}else{
	System.out.println(this.toString+" : req_dt is "+req_dt );
}
String displcemt_dt = req.getParameter("displcemt_dt");
if( displcemt_dt == null){
	System.out.println(this.toString+" : displcemt_dt is null" );
}else{
	System.out.println(this.toString+" : displcemt_dt is "+displcemt_dt );
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

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String flnm = Util.checkString(req.getParameter("flnm"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String dty_cd = Util.checkString(req.getParameter("dty_cd"));
String posi_cd = Util.checkString(req.getParameter("posi_cd"));
String req_dt = Util.checkString(req.getParameter("req_dt"));
String displcemt_dt = Util.checkString(req.getParameter("displcemt_dt"));
String connect_ip = Util.checkString(req.getParameter("connect_ip"));
String connect_userid = Util.checkString(req.getParameter("connect_userid"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String dty_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dty_cd")));
String posi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("posi_cd")));
String req_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("req_dt")));
String displcemt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("displcemt_dt")));
String connect_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("connect_ip")));
String connect_userid = Util.Uni2Ksc(Util.checkString(req.getParameter("connect_userid")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setFlnm(flnm);
dm.setDept_cd(dept_cd);
dm.setDty_cd(dty_cd);
dm.setPosi_cd(posi_cd);
dm.setReq_dt(req_dt);
dm.setDisplcemt_dt(displcemt_dt);
dm.setConnect_ip(connect_ip);
dm.setConnect_userid(connect_userid);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 20 13:58:25 KST 2009 */