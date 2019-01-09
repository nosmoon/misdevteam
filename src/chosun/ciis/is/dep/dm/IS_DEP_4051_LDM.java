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


package chosun.ciis.is.dep.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.dep.ds.*;
import chosun.ciis.is.dep.rec.*;

/**
 * 
 */


public class IS_DEP_4051_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String cmpy_cd;
	public String card_rcpm_reg_dt;
	public String card_rcpm_reg_seq;
	public String proc_frdt;
	public String proc_todt;

	public IS_DEP_4051_LDM(){}
	public IS_DEP_4051_LDM(String flag, String cmpy_cd, String card_rcpm_reg_dt, String card_rcpm_reg_seq, String proc_frdt, String proc_todt){
		this.flag = flag;
		this.cmpy_cd = cmpy_cd;
		this.card_rcpm_reg_dt = card_rcpm_reg_dt;
		this.card_rcpm_reg_seq = card_rcpm_reg_seq;
		this.proc_frdt = proc_frdt;
		this.proc_todt = proc_todt;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCard_rcpm_reg_dt(String card_rcpm_reg_dt){
		this.card_rcpm_reg_dt = card_rcpm_reg_dt;
	}

	public void setCard_rcpm_reg_seq(String card_rcpm_reg_seq){
		this.card_rcpm_reg_seq = card_rcpm_reg_seq;
	}

	public void setProc_frdt(String proc_frdt){
		this.proc_frdt = proc_frdt;
	}

	public void setProc_todt(String proc_todt){
		this.proc_todt = proc_todt;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCard_rcpm_reg_dt(){
		return this.card_rcpm_reg_dt;
	}

	public String getCard_rcpm_reg_seq(){
		return this.card_rcpm_reg_seq;
	}

	public String getProc_frdt(){
		return this.proc_frdt;
	}

	public String getProc_todt(){
		return this.proc_todt;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_DEP_4051_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_DEP_4051_LDM dm = (IS_DEP_4051_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.card_rcpm_reg_dt);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.setString(6, dm.card_rcpm_reg_seq);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.setString(7, dm.proc_frdt);
		cstmt.setString(8, dm.proc_todt);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, Types.INTEGER);
		cstmt.registerOutParameter(14, Types.INTEGER);
		cstmt.registerOutParameter(15, Types.INTEGER);
		cstmt.registerOutParameter(16, Types.INTEGER);
		cstmt.registerOutParameter(17, Types.INTEGER);
		cstmt.registerOutParameter(18, Types.VARCHAR);
		cstmt.registerOutParameter(19, Types.VARCHAR);
		cstmt.registerOutParameter(20, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.dep.ds.IS_DEP_4051_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("card_rcpm_reg_dt = [" + getCard_rcpm_reg_dt() + "]");
		System.out.println("card_rcpm_reg_seq = [" + getCard_rcpm_reg_seq() + "]");
		System.out.println("proc_frdt = [" + getProc_frdt() + "]");
		System.out.println("proc_todt = [" + getProc_todt() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String card_rcpm_reg_dt = req.getParameter("card_rcpm_reg_dt");
if( card_rcpm_reg_dt == null){
	System.out.println(this.toString+" : card_rcpm_reg_dt is null" );
}else{
	System.out.println(this.toString+" : card_rcpm_reg_dt is "+card_rcpm_reg_dt );
}
String card_rcpm_reg_seq = req.getParameter("card_rcpm_reg_seq");
if( card_rcpm_reg_seq == null){
	System.out.println(this.toString+" : card_rcpm_reg_seq is null" );
}else{
	System.out.println(this.toString+" : card_rcpm_reg_seq is "+card_rcpm_reg_seq );
}
String proc_frdt = req.getParameter("proc_frdt");
if( proc_frdt == null){
	System.out.println(this.toString+" : proc_frdt is null" );
}else{
	System.out.println(this.toString+" : proc_frdt is "+proc_frdt );
}
String proc_todt = req.getParameter("proc_todt");
if( proc_todt == null){
	System.out.println(this.toString+" : proc_todt is null" );
}else{
	System.out.println(this.toString+" : proc_todt is "+proc_todt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String flag = Util.checkString(req.getParameter("flag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String card_rcpm_reg_dt = Util.checkString(req.getParameter("card_rcpm_reg_dt"));
String card_rcpm_reg_seq = Util.checkString(req.getParameter("card_rcpm_reg_seq"));
String proc_frdt = Util.checkString(req.getParameter("proc_frdt"));
String proc_todt = Util.checkString(req.getParameter("proc_todt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String card_rcpm_reg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("card_rcpm_reg_dt")));
String card_rcpm_reg_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("card_rcpm_reg_seq")));
String proc_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_frdt")));
String proc_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_todt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setCmpy_cd(cmpy_cd);
dm.setCard_rcpm_reg_dt(card_rcpm_reg_dt);
dm.setCard_rcpm_reg_seq(card_rcpm_reg_seq);
dm.setProc_frdt(proc_frdt);
dm.setProc_todt(proc_todt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 10 16:03:30 KST 2012 */