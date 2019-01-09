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


package chosun.ciis.hd.vaca.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.vaca.ds.*;
import chosun.ciis.hd.vaca.rec.*;

/**
 * 
 */


public class HD_VACA_1621_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String seq;
	public String obj_dept_cd;
	public String obj_emp_no;
	public String prv_aprv_emp_no;
	public String aft_aprv_emp_no;
	public String fr_dt;
	public String to_dt;
	public String use_yn;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_VACA_1621_ADM(){}
	public HD_VACA_1621_ADM(String mode, String cmpy_cd, String seq, String obj_dept_cd, String obj_emp_no, String prv_aprv_emp_no, String aft_aprv_emp_no, String fr_dt, String to_dt, String use_yn, String incmg_pers_ipadd, String incmg_pers){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.seq = seq;
		this.obj_dept_cd = obj_dept_cd;
		this.obj_emp_no = obj_emp_no;
		this.prv_aprv_emp_no = prv_aprv_emp_no;
		this.aft_aprv_emp_no = aft_aprv_emp_no;
		this.fr_dt = fr_dt;
		this.to_dt = to_dt;
		this.use_yn = use_yn;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setObj_dept_cd(String obj_dept_cd){
		this.obj_dept_cd = obj_dept_cd;
	}

	public void setObj_emp_no(String obj_emp_no){
		this.obj_emp_no = obj_emp_no;
	}

	public void setPrv_aprv_emp_no(String prv_aprv_emp_no){
		this.prv_aprv_emp_no = prv_aprv_emp_no;
	}

	public void setAft_aprv_emp_no(String aft_aprv_emp_no){
		this.aft_aprv_emp_no = aft_aprv_emp_no;
	}

	public void setFr_dt(String fr_dt){
		this.fr_dt = fr_dt;
	}

	public void setTo_dt(String to_dt){
		this.to_dt = to_dt;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getObj_dept_cd(){
		return this.obj_dept_cd;
	}

	public String getObj_emp_no(){
		return this.obj_emp_no;
	}

	public String getPrv_aprv_emp_no(){
		return this.prv_aprv_emp_no;
	}

	public String getAft_aprv_emp_no(){
		return this.aft_aprv_emp_no;
	}

	public String getFr_dt(){
		return this.fr_dt;
	}

	public String getTo_dt(){
		return this.to_dt;
	}

	public String getUse_yn(){
		return this.use_yn;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_VACA_1621_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_VACA_1621_ADM dm = (HD_VACA_1621_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.seq);
		cstmt.setString(6, dm.obj_dept_cd);
		cstmt.setString(7, dm.obj_emp_no);
		cstmt.setString(8, dm.prv_aprv_emp_no);
		cstmt.setString(9, dm.aft_aprv_emp_no);
		cstmt.setString(10, dm.fr_dt);
		cstmt.setString(11, dm.to_dt);
		cstmt.setString(12, dm.use_yn);
		cstmt.setString(13, dm.incmg_pers_ipadd);
		cstmt.setString(14, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.vaca.ds.HD_VACA_1621_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("obj_dept_cd = [" + getObj_dept_cd() + "]");
		System.out.println("obj_emp_no = [" + getObj_emp_no() + "]");
		System.out.println("prv_aprv_emp_no = [" + getPrv_aprv_emp_no() + "]");
		System.out.println("aft_aprv_emp_no = [" + getAft_aprv_emp_no() + "]");
		System.out.println("fr_dt = [" + getFr_dt() + "]");
		System.out.println("to_dt = [" + getTo_dt() + "]");
		System.out.println("use_yn = [" + getUse_yn() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String obj_dept_cd = req.getParameter("obj_dept_cd");
if( obj_dept_cd == null){
	System.out.println(this.toString+" : obj_dept_cd is null" );
}else{
	System.out.println(this.toString+" : obj_dept_cd is "+obj_dept_cd );
}
String obj_emp_no = req.getParameter("obj_emp_no");
if( obj_emp_no == null){
	System.out.println(this.toString+" : obj_emp_no is null" );
}else{
	System.out.println(this.toString+" : obj_emp_no is "+obj_emp_no );
}
String prv_aprv_emp_no = req.getParameter("prv_aprv_emp_no");
if( prv_aprv_emp_no == null){
	System.out.println(this.toString+" : prv_aprv_emp_no is null" );
}else{
	System.out.println(this.toString+" : prv_aprv_emp_no is "+prv_aprv_emp_no );
}
String aft_aprv_emp_no = req.getParameter("aft_aprv_emp_no");
if( aft_aprv_emp_no == null){
	System.out.println(this.toString+" : aft_aprv_emp_no is null" );
}else{
	System.out.println(this.toString+" : aft_aprv_emp_no is "+aft_aprv_emp_no );
}
String fr_dt = req.getParameter("fr_dt");
if( fr_dt == null){
	System.out.println(this.toString+" : fr_dt is null" );
}else{
	System.out.println(this.toString+" : fr_dt is "+fr_dt );
}
String to_dt = req.getParameter("to_dt");
if( to_dt == null){
	System.out.println(this.toString+" : to_dt is null" );
}else{
	System.out.println(this.toString+" : to_dt is "+to_dt );
}
String use_yn = req.getParameter("use_yn");
if( use_yn == null){
	System.out.println(this.toString+" : use_yn is null" );
}else{
	System.out.println(this.toString+" : use_yn is "+use_yn );
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

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String seq = Util.checkString(req.getParameter("seq"));
String obj_dept_cd = Util.checkString(req.getParameter("obj_dept_cd"));
String obj_emp_no = Util.checkString(req.getParameter("obj_emp_no"));
String prv_aprv_emp_no = Util.checkString(req.getParameter("prv_aprv_emp_no"));
String aft_aprv_emp_no = Util.checkString(req.getParameter("aft_aprv_emp_no"));
String fr_dt = Util.checkString(req.getParameter("fr_dt"));
String to_dt = Util.checkString(req.getParameter("to_dt"));
String use_yn = Util.checkString(req.getParameter("use_yn"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String obj_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("obj_dept_cd")));
String obj_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("obj_emp_no")));
String prv_aprv_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("prv_aprv_emp_no")));
String aft_aprv_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("aft_aprv_emp_no")));
String fr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_dt")));
String to_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_dt")));
String use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("use_yn")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setSeq(seq);
dm.setObj_dept_cd(obj_dept_cd);
dm.setObj_emp_no(obj_emp_no);
dm.setPrv_aprv_emp_no(prv_aprv_emp_no);
dm.setAft_aprv_emp_no(aft_aprv_emp_no);
dm.setFr_dt(fr_dt);
dm.setTo_dt(to_dt);
dm.setUse_yn(use_yn);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 16 11:18:40 KST 2018 */