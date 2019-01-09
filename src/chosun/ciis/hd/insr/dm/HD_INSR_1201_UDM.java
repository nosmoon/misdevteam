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


package chosun.ciis.hd.insr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.insr.ds.*;
import chosun.ciis.hd.insr.rec.*;

/**
 * 
 */


public class HD_INSR_1201_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String hlth_insr_entr_dt;
	public String hlth_entr_no;
	public String slf_hlth_insr_fee;
	public String cmpy_hlth_insr_fee;
	public String self_insr_med_care_insr_fee;
	public String cmpy_insr_med_care_insr_fee;
	public String chg_pers;
	public String incmg_pers_ipass;
	public String incmg_pers;

	public HD_INSR_1201_UDM(){}
	public HD_INSR_1201_UDM(String cmpy_cd, String emp_no, String hlth_insr_entr_dt, String hlth_entr_no, String slf_hlth_insr_fee, String cmpy_hlth_insr_fee, String self_insr_med_care_insr_fee, String cmpy_insr_med_care_insr_fee, String chg_pers, String incmg_pers_ipass, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.hlth_insr_entr_dt = hlth_insr_entr_dt;
		this.hlth_entr_no = hlth_entr_no;
		this.slf_hlth_insr_fee = slf_hlth_insr_fee;
		this.cmpy_hlth_insr_fee = cmpy_hlth_insr_fee;
		this.self_insr_med_care_insr_fee = self_insr_med_care_insr_fee;
		this.cmpy_insr_med_care_insr_fee = cmpy_insr_med_care_insr_fee;
		this.chg_pers = chg_pers;
		this.incmg_pers_ipass = incmg_pers_ipass;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setHlth_insr_entr_dt(String hlth_insr_entr_dt){
		this.hlth_insr_entr_dt = hlth_insr_entr_dt;
	}

	public void setHlth_entr_no(String hlth_entr_no){
		this.hlth_entr_no = hlth_entr_no;
	}

	public void setSlf_hlth_insr_fee(String slf_hlth_insr_fee){
		this.slf_hlth_insr_fee = slf_hlth_insr_fee;
	}

	public void setCmpy_hlth_insr_fee(String cmpy_hlth_insr_fee){
		this.cmpy_hlth_insr_fee = cmpy_hlth_insr_fee;
	}

	public void setSelf_insr_med_care_insr_fee(String self_insr_med_care_insr_fee){
		this.self_insr_med_care_insr_fee = self_insr_med_care_insr_fee;
	}

	public void setCmpy_insr_med_care_insr_fee(String cmpy_insr_med_care_insr_fee){
		this.cmpy_insr_med_care_insr_fee = cmpy_insr_med_care_insr_fee;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setIncmg_pers_ipass(String incmg_pers_ipass){
		this.incmg_pers_ipass = incmg_pers_ipass;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getHlth_insr_entr_dt(){
		return this.hlth_insr_entr_dt;
	}

	public String getHlth_entr_no(){
		return this.hlth_entr_no;
	}

	public String getSlf_hlth_insr_fee(){
		return this.slf_hlth_insr_fee;
	}

	public String getCmpy_hlth_insr_fee(){
		return this.cmpy_hlth_insr_fee;
	}

	public String getSelf_insr_med_care_insr_fee(){
		return this.self_insr_med_care_insr_fee;
	}

	public String getCmpy_insr_med_care_insr_fee(){
		return this.cmpy_insr_med_care_insr_fee;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getIncmg_pers_ipass(){
		return this.incmg_pers_ipass;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_INSR_1201_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_INSR_1201_UDM dm = (HD_INSR_1201_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, Types.VARCHAR);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.hlth_insr_entr_dt);
		cstmt.setString(7, dm.hlth_entr_no);
		cstmt.setString(8, dm.slf_hlth_insr_fee);
		cstmt.setString(9, dm.cmpy_hlth_insr_fee);
		cstmt.setString(10, dm.self_insr_med_care_insr_fee);
		cstmt.setString(11, dm.cmpy_insr_med_care_insr_fee);
		cstmt.setString(12, dm.chg_pers);
		cstmt.setString(13, dm.incmg_pers_ipass);
		cstmt.setString(14, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_INSR_1201_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("hlth_insr_entr_dt = [" + getHlth_insr_entr_dt() + "]");
		System.out.println("hlth_entr_no = [" + getHlth_entr_no() + "]");
		System.out.println("slf_hlth_insr_fee = [" + getSlf_hlth_insr_fee() + "]");
		System.out.println("cmpy_hlth_insr_fee = [" + getCmpy_hlth_insr_fee() + "]");
		System.out.println("self_insr_med_care_insr_fee = [" + getSelf_insr_med_care_insr_fee() + "]");
		System.out.println("cmpy_insr_med_care_insr_fee = [" + getCmpy_insr_med_care_insr_fee() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
		System.out.println("incmg_pers_ipass = [" + getIncmg_pers_ipass() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String hlth_insr_entr_dt = req.getParameter("hlth_insr_entr_dt");
if( hlth_insr_entr_dt == null){
	System.out.println(this.toString+" : hlth_insr_entr_dt is null" );
}else{
	System.out.println(this.toString+" : hlth_insr_entr_dt is "+hlth_insr_entr_dt );
}
String hlth_entr_no = req.getParameter("hlth_entr_no");
if( hlth_entr_no == null){
	System.out.println(this.toString+" : hlth_entr_no is null" );
}else{
	System.out.println(this.toString+" : hlth_entr_no is "+hlth_entr_no );
}
String slf_hlth_insr_fee = req.getParameter("slf_hlth_insr_fee");
if( slf_hlth_insr_fee == null){
	System.out.println(this.toString+" : slf_hlth_insr_fee is null" );
}else{
	System.out.println(this.toString+" : slf_hlth_insr_fee is "+slf_hlth_insr_fee );
}
String cmpy_hlth_insr_fee = req.getParameter("cmpy_hlth_insr_fee");
if( cmpy_hlth_insr_fee == null){
	System.out.println(this.toString+" : cmpy_hlth_insr_fee is null" );
}else{
	System.out.println(this.toString+" : cmpy_hlth_insr_fee is "+cmpy_hlth_insr_fee );
}
String self_insr_med_care_insr_fee = req.getParameter("self_insr_med_care_insr_fee");
if( self_insr_med_care_insr_fee == null){
	System.out.println(this.toString+" : self_insr_med_care_insr_fee is null" );
}else{
	System.out.println(this.toString+" : self_insr_med_care_insr_fee is "+self_insr_med_care_insr_fee );
}
String cmpy_insr_med_care_insr_fee = req.getParameter("cmpy_insr_med_care_insr_fee");
if( cmpy_insr_med_care_insr_fee == null){
	System.out.println(this.toString+" : cmpy_insr_med_care_insr_fee is null" );
}else{
	System.out.println(this.toString+" : cmpy_insr_med_care_insr_fee is "+cmpy_insr_med_care_insr_fee );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
String incmg_pers_ipass = req.getParameter("incmg_pers_ipass");
if( incmg_pers_ipass == null){
	System.out.println(this.toString+" : incmg_pers_ipass is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipass is "+incmg_pers_ipass );
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

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String hlth_insr_entr_dt = Util.checkString(req.getParameter("hlth_insr_entr_dt"));
String hlth_entr_no = Util.checkString(req.getParameter("hlth_entr_no"));
String slf_hlth_insr_fee = Util.checkString(req.getParameter("slf_hlth_insr_fee"));
String cmpy_hlth_insr_fee = Util.checkString(req.getParameter("cmpy_hlth_insr_fee"));
String self_insr_med_care_insr_fee = Util.checkString(req.getParameter("self_insr_med_care_insr_fee"));
String cmpy_insr_med_care_insr_fee = Util.checkString(req.getParameter("cmpy_insr_med_care_insr_fee"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String incmg_pers_ipass = Util.checkString(req.getParameter("incmg_pers_ipass"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String hlth_insr_entr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("hlth_insr_entr_dt")));
String hlth_entr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("hlth_entr_no")));
String slf_hlth_insr_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("slf_hlth_insr_fee")));
String cmpy_hlth_insr_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_hlth_insr_fee")));
String self_insr_med_care_insr_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("self_insr_med_care_insr_fee")));
String cmpy_insr_med_care_insr_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_insr_med_care_insr_fee")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String incmg_pers_ipass = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipass")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setHlth_insr_entr_dt(hlth_insr_entr_dt);
dm.setHlth_entr_no(hlth_entr_no);
dm.setSlf_hlth_insr_fee(slf_hlth_insr_fee);
dm.setCmpy_hlth_insr_fee(cmpy_hlth_insr_fee);
dm.setSelf_insr_med_care_insr_fee(self_insr_med_care_insr_fee);
dm.setCmpy_insr_med_care_insr_fee(cmpy_insr_med_care_insr_fee);
dm.setChg_pers(chg_pers);
dm.setIncmg_pers_ipass(incmg_pers_ipass);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 14 16:59:07 KST 2009 */