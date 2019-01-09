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


package chosun.ciis.ad.pub.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.driver.OracleTypes;
import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_PUB_1010_PDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_cd;
	public String proc_dt;
	public String proc_seq;
	public String print_dt;
	

	public AD_PUB_1010_PDM(){}
	public AD_PUB_1010_PDM(String cmpy_cd, String medi_cd, String proc_dt, String proc_seq, String print_dt){
		this.cmpy_cd = cmpy_cd;
		this.medi_cd = medi_cd;
		this.proc_dt = proc_dt;
		this.proc_seq = proc_seq;
		this.print_dt = print_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setProc_dt(String proc_dt){
		this.proc_dt = proc_dt;
	}

	public void setProc_seq(String proc_seq){
		this.proc_seq = proc_seq;
	}
	
	public void setPrint_dt(String print_dt){
		this.print_dt = print_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getProc_dt(){
		return this.proc_dt;
	}

	public String getProc_seq(){
		return this.proc_seq;
	}
	
	public String getPrint_dt(){
		return this.print_dt;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_PUB_1010_P(? ,? ,? ,? ,? ,? ,?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_PUB_1010_PDM dm = (AD_PUB_1010_PDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_cd);
		cstmt.setString(5, dm.proc_dt);
		cstmt.setString(6, dm.proc_seq);
		cstmt.setString(7, dm.print_dt);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.pub.ds.AD_PUB_1010_PDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("proc_dt = [" + getProc_dt() + "]");
		System.out.println("proc_seq = [" + getProc_seq() + "]");
		System.out.println("print_dt = [" + getPrint_dt() + "]");
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
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String proc_dt = req.getParameter("proc_dt");
if( proc_dt == null){
	System.out.println(this.toString+" : proc_dt is null" );
}else{
	System.out.println(this.toString+" : proc_dt is "+proc_dt );
}
String proc_seq = req.getParameter("proc_seq");
if( proc_seq == null){
	System.out.println(this.toString+" : proc_seq is null" );
}else{
	System.out.println(this.toString+" : proc_seq is "+proc_seq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String proc_dt = Util.checkString(req.getParameter("proc_dt"));
String proc_seq = Util.checkString(req.getParameter("proc_seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String proc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_dt")));
String proc_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_cd(medi_cd);
dm.setProc_dt(proc_dt);
dm.setProc_seq(proc_seq);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 02 15:30:12 KST 2009 */