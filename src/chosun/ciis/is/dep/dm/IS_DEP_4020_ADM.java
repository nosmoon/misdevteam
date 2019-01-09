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


public class IS_DEP_4020_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String card_rcpm_reg_dt;
	public String card_rcpm_reg_seq;
	public String acct_mang_no;
	public String dlco_no;
	public String dept_cd;
	public String sub_dept_cd;
	public String chrg_pers;
	public String rcpm_slip_no;
	public String incmg_pers_ip;
	public String incmg_pers;

	public IS_DEP_4020_ADM(){}
	public IS_DEP_4020_ADM(String cmpy_cd, String mode, String card_rcpm_reg_dt, String card_rcpm_reg_seq, String acct_mang_no, String dlco_no, String dept_cd, String sub_dept_cd, String chrg_pers, String rcpm_slip_no, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.card_rcpm_reg_dt = card_rcpm_reg_dt;
		this.card_rcpm_reg_seq = card_rcpm_reg_seq;
		this.acct_mang_no = acct_mang_no;
		this.dlco_no = dlco_no;
		this.dept_cd = dept_cd;
		this.sub_dept_cd = sub_dept_cd;
		this.chrg_pers = chrg_pers;
		this.rcpm_slip_no = rcpm_slip_no;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCard_rcpm_reg_dt(String card_rcpm_reg_dt){
		this.card_rcpm_reg_dt = card_rcpm_reg_dt;
	}

	public void setCard_rcpm_reg_seq(String card_rcpm_reg_seq){
		this.card_rcpm_reg_seq = card_rcpm_reg_seq;
	}

	public void setAcct_mang_no(String acct_mang_no){
		this.acct_mang_no = acct_mang_no;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setRcpm_slip_no(String rcpm_slip_no){
		this.rcpm_slip_no = rcpm_slip_no;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCard_rcpm_reg_dt(){
		return this.card_rcpm_reg_dt;
	}

	public String getCard_rcpm_reg_seq(){
		return this.card_rcpm_reg_seq;
	}

	public String getAcct_mang_no(){
		return this.acct_mang_no;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getRcpm_slip_no(){
		return this.rcpm_slip_no;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_DEP_4020_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_DEP_4020_ADM dm = (IS_DEP_4020_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.card_rcpm_reg_dt);
		cstmt.setString(6, dm.card_rcpm_reg_seq);
		cstmt.setString(7, dm.acct_mang_no);
		cstmt.setString(8, dm.dlco_no);
		cstmt.setString(9, dm.dept_cd);
		cstmt.setString(10, dm.sub_dept_cd);
		cstmt.setString(11, dm.chrg_pers);
		cstmt.setString(12, dm.rcpm_slip_no);
		cstmt.setString(13, dm.incmg_pers_ip);
		cstmt.setString(14, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.dep.ds.IS_DEP_4020_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("card_rcpm_reg_dt = [" + getCard_rcpm_reg_dt() + "]");
		System.out.println("card_rcpm_reg_seq = [" + getCard_rcpm_reg_seq() + "]");
		System.out.println("acct_mang_no = [" + getAcct_mang_no() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("sub_dept_cd = [" + getSub_dept_cd() + "]");
		System.out.println("chrg_pers = [" + getChrg_pers() + "]");
		System.out.println("rcpm_slip_no = [" + getRcpm_slip_no() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
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
String acct_mang_no = req.getParameter("acct_mang_no");
if( acct_mang_no == null){
	System.out.println(this.toString+" : acct_mang_no is null" );
}else{
	System.out.println(this.toString+" : acct_mang_no is "+acct_mang_no );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String sub_dept_cd = req.getParameter("sub_dept_cd");
if( sub_dept_cd == null){
	System.out.println(this.toString+" : sub_dept_cd is null" );
}else{
	System.out.println(this.toString+" : sub_dept_cd is "+sub_dept_cd );
}
String chrg_pers = req.getParameter("chrg_pers");
if( chrg_pers == null){
	System.out.println(this.toString+" : chrg_pers is null" );
}else{
	System.out.println(this.toString+" : chrg_pers is "+chrg_pers );
}
String rcpm_slip_no = req.getParameter("rcpm_slip_no");
if( rcpm_slip_no == null){
	System.out.println(this.toString+" : rcpm_slip_no is null" );
}else{
	System.out.println(this.toString+" : rcpm_slip_no is "+rcpm_slip_no );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
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
String mode = Util.checkString(req.getParameter("mode"));
String card_rcpm_reg_dt = Util.checkString(req.getParameter("card_rcpm_reg_dt"));
String card_rcpm_reg_seq = Util.checkString(req.getParameter("card_rcpm_reg_seq"));
String acct_mang_no = Util.checkString(req.getParameter("acct_mang_no"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
String rcpm_slip_no = Util.checkString(req.getParameter("rcpm_slip_no"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String card_rcpm_reg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("card_rcpm_reg_dt")));
String card_rcpm_reg_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("card_rcpm_reg_seq")));
String acct_mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_mang_no")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String sub_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_dept_cd")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
String rcpm_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_slip_no")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setCard_rcpm_reg_dt(card_rcpm_reg_dt);
dm.setCard_rcpm_reg_seq(card_rcpm_reg_seq);
dm.setAcct_mang_no(acct_mang_no);
dm.setDlco_no(dlco_no);
dm.setDept_cd(dept_cd);
dm.setSub_dept_cd(sub_dept_cd);
dm.setChrg_pers(chrg_pers);
dm.setRcpm_slip_no(rcpm_slip_no);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 09 22:26:44 KST 2012 */