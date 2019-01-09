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


package chosun.ciis.hd.cost.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.cost.ds.*;
import chosun.ciis.hd.cost.rec.*;

/**
 * 
 */


public class HD_COST_2100_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_fr_dt;
	public String occr_to_dt;
	public String proc_stat;
	public String actu_slip_no;

	public HD_COST_2100_LDM(){}
	public HD_COST_2100_LDM(String cmpy_cd, String occr_fr_dt, String occr_to_dt, String proc_stat, String actu_slip_no){
		this.cmpy_cd = cmpy_cd;
		this.occr_fr_dt = occr_fr_dt;
		this.occr_to_dt = occr_to_dt;
		this.proc_stat = proc_stat;
		this.actu_slip_no = actu_slip_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_fr_dt(String occr_fr_dt){
		this.occr_fr_dt = occr_fr_dt;
	}

	public void setOccr_to_dt(String occr_to_dt){
		this.occr_to_dt = occr_to_dt;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_fr_dt(){
		return this.occr_fr_dt;
	}

	public String getOccr_to_dt(){
		return this.occr_to_dt;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_COST_2100_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_COST_2100_LDM dm = (HD_COST_2100_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_fr_dt);
		cstmt.setString(5, dm.occr_to_dt);
		cstmt.setString(6, dm.proc_stat);
		cstmt.setString(7, dm.actu_slip_no);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.cost.ds.HD_COST_2100_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_fr_dt = [" + getOccr_fr_dt() + "]");
		System.out.println("occr_to_dt = [" + getOccr_to_dt() + "]");
		System.out.println("proc_stat = [" + getProc_stat() + "]");
		System.out.println("actu_slip_no = [" + getActu_slip_no() + "]");
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
String occr_fr_dt = req.getParameter("occr_fr_dt");
if( occr_fr_dt == null){
	System.out.println(this.toString+" : occr_fr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_fr_dt is "+occr_fr_dt );
}
String occr_to_dt = req.getParameter("occr_to_dt");
if( occr_to_dt == null){
	System.out.println(this.toString+" : occr_to_dt is null" );
}else{
	System.out.println(this.toString+" : occr_to_dt is "+occr_to_dt );
}
String proc_stat = req.getParameter("proc_stat");
if( proc_stat == null){
	System.out.println(this.toString+" : proc_stat is null" );
}else{
	System.out.println(this.toString+" : proc_stat is "+proc_stat );
}
String actu_slip_no = req.getParameter("actu_slip_no");
if( actu_slip_no == null){
	System.out.println(this.toString+" : actu_slip_no is null" );
}else{
	System.out.println(this.toString+" : actu_slip_no is "+actu_slip_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_fr_dt = Util.checkString(req.getParameter("occr_fr_dt"));
String occr_to_dt = Util.checkString(req.getParameter("occr_to_dt"));
String proc_stat = Util.checkString(req.getParameter("proc_stat"));
String actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_fr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_fr_dt")));
String occr_to_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_to_dt")));
String proc_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_stat")));
String actu_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("actu_slip_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_fr_dt(occr_fr_dt);
dm.setOccr_to_dt(occr_to_dt);
dm.setProc_stat(proc_stat);
dm.setActu_slip_no(actu_slip_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Aug 27 18:59:18 KST 2012 */