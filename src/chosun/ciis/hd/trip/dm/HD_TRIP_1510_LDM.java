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


package chosun.ciis.hd.trip.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.trip.ds.*;
import chosun.ciis.hd.trip.rec.*;

/**
 * 
 */


public class HD_TRIP_1510_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String proc_stat_clsf;
	public String cmpy_cd;
	public String emp_no;
	public String seq;
	public String occr_dt;

	public HD_TRIP_1510_LDM(){}
	public HD_TRIP_1510_LDM(String proc_stat_clsf, String cmpy_cd, String emp_no, String seq, String occr_dt){
		this.proc_stat_clsf = proc_stat_clsf;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.seq = seq;
		this.occr_dt = occr_dt;
	}

	public void setProc_stat_clsf(String proc_stat_clsf){
		this.proc_stat_clsf = proc_stat_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public String getProc_stat_clsf(){
		return this.proc_stat_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_TRIP_1510_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_TRIP_1510_LDM dm = (HD_TRIP_1510_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.proc_stat_clsf);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.occr_dt);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.trip.ds.HD_TRIP_1510_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("proc_stat_clsf = [" + getProc_stat_clsf() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String proc_stat_clsf = req.getParameter("proc_stat_clsf");
if( proc_stat_clsf == null){
	System.out.println(this.toString+" : proc_stat_clsf is null" );
}else{
	System.out.println(this.toString+" : proc_stat_clsf is "+proc_stat_clsf );
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
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String proc_stat_clsf = Util.checkString(req.getParameter("proc_stat_clsf"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String seq = Util.checkString(req.getParameter("seq"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String proc_stat_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_stat_clsf")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setProc_stat_clsf(proc_stat_clsf);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setSeq(seq);
dm.setOccr_dt(occr_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 12 15:11:12 KST 2009 */