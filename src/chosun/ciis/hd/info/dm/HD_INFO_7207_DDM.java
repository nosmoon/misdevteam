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


package chosun.ciis.hd.info.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.ds.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_7207_DDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String pay_mm;
	public String actu_slip_no;
	public String slip_proc_mang_dt;
	public String slip_proc_mang_seq;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_INFO_7207_DDM(){}
	public HD_INFO_7207_DDM(String mode, String cmpy_cd, String pay_mm, String actu_slip_no, String slip_proc_mang_dt, String slip_proc_mang_seq, String incmg_pers_ipadd, String incmg_pers){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.pay_mm = pay_mm;
		this.actu_slip_no = actu_slip_no;
		this.slip_proc_mang_dt = slip_proc_mang_dt;
		this.slip_proc_mang_seq = slip_proc_mang_seq;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPay_mm(String pay_mm){
		this.pay_mm = pay_mm;
	}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}

	public void setSlip_proc_mang_dt(String slip_proc_mang_dt){
		this.slip_proc_mang_dt = slip_proc_mang_dt;
	}

	public void setSlip_proc_mang_seq(String slip_proc_mang_seq){
		this.slip_proc_mang_seq = slip_proc_mang_seq;
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

	public String getPay_mm(){
		return this.pay_mm;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}

	public String getSlip_proc_mang_dt(){
		return this.slip_proc_mang_dt;
	}

	public String getSlip_proc_mang_seq(){
		return this.slip_proc_mang_seq;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_INFO_7207_D(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_INFO_7207_DDM dm = (HD_INFO_7207_DDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.pay_mm);
		cstmt.setString(6, dm.actu_slip_no);
		cstmt.setString(7, dm.slip_proc_mang_dt);
		cstmt.setString(8, dm.slip_proc_mang_seq);
		cstmt.setString(9, dm.incmg_pers_ipadd);
		cstmt.setString(10, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.info.ds.HD_INFO_7207_DDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("pay_mm = [" + getPay_mm() + "]");
		System.out.println("actu_slip_no = [" + getActu_slip_no() + "]");
		System.out.println("slip_proc_mang_dt = [" + getSlip_proc_mang_dt() + "]");
		System.out.println("slip_proc_mang_seq = [" + getSlip_proc_mang_seq() + "]");
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
String pay_mm = req.getParameter("pay_mm");
if( pay_mm == null){
	System.out.println(this.toString+" : pay_mm is null" );
}else{
	System.out.println(this.toString+" : pay_mm is "+pay_mm );
}
String actu_slip_no = req.getParameter("actu_slip_no");
if( actu_slip_no == null){
	System.out.println(this.toString+" : actu_slip_no is null" );
}else{
	System.out.println(this.toString+" : actu_slip_no is "+actu_slip_no );
}
String slip_proc_mang_dt = req.getParameter("slip_proc_mang_dt");
if( slip_proc_mang_dt == null){
	System.out.println(this.toString+" : slip_proc_mang_dt is null" );
}else{
	System.out.println(this.toString+" : slip_proc_mang_dt is "+slip_proc_mang_dt );
}
String slip_proc_mang_seq = req.getParameter("slip_proc_mang_seq");
if( slip_proc_mang_seq == null){
	System.out.println(this.toString+" : slip_proc_mang_seq is null" );
}else{
	System.out.println(this.toString+" : slip_proc_mang_seq is "+slip_proc_mang_seq );
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
String pay_mm = Util.checkString(req.getParameter("pay_mm"));
String actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));
String slip_proc_mang_dt = Util.checkString(req.getParameter("slip_proc_mang_dt"));
String slip_proc_mang_seq = Util.checkString(req.getParameter("slip_proc_mang_seq"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String pay_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_mm")));
String actu_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("actu_slip_no")));
String slip_proc_mang_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_mang_dt")));
String slip_proc_mang_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_mang_seq")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setPay_mm(pay_mm);
dm.setActu_slip_no(actu_slip_no);
dm.setSlip_proc_mang_dt(slip_proc_mang_dt);
dm.setSlip_proc_mang_seq(slip_proc_mang_seq);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 16 16:10:05 KST 2013 */