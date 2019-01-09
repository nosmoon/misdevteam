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


public class HD_INFO_1082_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String frnc_word_seq;
	public String frnc_word_cd;
	public String frnc_word_nm;
	public String test_cd;
	public String test_nm;
	public String test_grad;
	public String test_scor;
	public String test_dt;
	public String test_enfc_instt;
	public String spc_matt;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_INFO_1082_ADM(){}
	public HD_INFO_1082_ADM(String mode, String cmpy_cd, String emp_no, String frnc_word_seq, String frnc_word_cd, String frnc_word_nm, String test_cd, String test_nm, String test_grad, String test_scor, String test_dt, String test_enfc_instt, String spc_matt, String incmg_pers_ipadd, String incmg_pers){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.frnc_word_seq = frnc_word_seq;
		this.frnc_word_cd = frnc_word_cd;
		this.frnc_word_nm = frnc_word_nm;
		this.test_cd = test_cd;
		this.test_nm = test_nm;
		this.test_grad = test_grad;
		this.test_scor = test_scor;
		this.test_dt = test_dt;
		this.test_enfc_instt = test_enfc_instt;
		this.spc_matt = spc_matt;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
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

	public void setFrnc_word_seq(String frnc_word_seq){
		this.frnc_word_seq = frnc_word_seq;
	}

	public void setFrnc_word_cd(String frnc_word_cd){
		this.frnc_word_cd = frnc_word_cd;
	}

	public void setFrnc_word_nm(String frnc_word_nm){
		this.frnc_word_nm = frnc_word_nm;
	}

	public void setTest_cd(String test_cd){
		this.test_cd = test_cd;
	}

	public void setTest_nm(String test_nm){
		this.test_nm = test_nm;
	}

	public void setTest_grad(String test_grad){
		this.test_grad = test_grad;
	}

	public void setTest_scor(String test_scor){
		this.test_scor = test_scor;
	}

	public void setTest_dt(String test_dt){
		this.test_dt = test_dt;
	}

	public void setTest_enfc_instt(String test_enfc_instt){
		this.test_enfc_instt = test_enfc_instt;
	}

	public void setSpc_matt(String spc_matt){
		this.spc_matt = spc_matt;
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

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFrnc_word_seq(){
		return this.frnc_word_seq;
	}

	public String getFrnc_word_cd(){
		return this.frnc_word_cd;
	}

	public String getFrnc_word_nm(){
		return this.frnc_word_nm;
	}

	public String getTest_cd(){
		return this.test_cd;
	}

	public String getTest_nm(){
		return this.test_nm;
	}

	public String getTest_grad(){
		return this.test_grad;
	}

	public String getTest_scor(){
		return this.test_scor;
	}

	public String getTest_dt(){
		return this.test_dt;
	}

	public String getTest_enfc_instt(){
		return this.test_enfc_instt;
	}

	public String getSpc_matt(){
		return this.spc_matt;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_INFO_1082_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_INFO_1082_ADM dm = (HD_INFO_1082_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.frnc_word_seq);
		cstmt.setString(7, dm.frnc_word_cd);
		cstmt.setString(8, dm.frnc_word_nm);
		cstmt.setString(9, dm.test_cd);
		cstmt.setString(10, dm.test_nm);
		cstmt.setString(11, dm.test_grad);
		cstmt.setString(12, dm.test_scor);
		cstmt.setString(13, dm.test_dt);
		cstmt.setString(14, dm.test_enfc_instt);
		cstmt.setString(15, dm.spc_matt);
		cstmt.setString(16, dm.incmg_pers_ipadd);
		cstmt.setString(17, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.info.ds.HD_INFO_1082_ADataSet();
	}



    public void print(){
        System.out.println("mode = " + getMode());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("emp_no = " + getEmp_no());
        System.out.println("frnc_word_seq = " + getFrnc_word_seq());
        System.out.println("frnc_word_cd = " + getFrnc_word_cd());
        System.out.println("frnc_word_nm = " + getFrnc_word_nm());
        System.out.println("test_cd = " + getTest_cd());
        System.out.println("test_nm = " + getTest_nm());
        System.out.println("test_grad = " + getTest_grad());
        System.out.println("test_scor = " + getTest_scor());
        System.out.println("test_dt = " + getTest_dt());
        System.out.println("test_enfc_instt = " + getTest_enfc_instt());
        System.out.println("spc_matt = " + getSpc_matt());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
        System.out.println("incmg_pers = " + getIncmg_pers());
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
String frnc_word_seq = req.getParameter("frnc_word_seq");
if( frnc_word_seq == null){
	System.out.println(this.toString+" : frnc_word_seq is null" );
}else{
	System.out.println(this.toString+" : frnc_word_seq is "+frnc_word_seq );
}
String frnc_word_cd = req.getParameter("frnc_word_cd");
if( frnc_word_cd == null){
	System.out.println(this.toString+" : frnc_word_cd is null" );
}else{
	System.out.println(this.toString+" : frnc_word_cd is "+frnc_word_cd );
}
String frnc_word_nm = req.getParameter("frnc_word_nm");
if( frnc_word_nm == null){
	System.out.println(this.toString+" : frnc_word_nm is null" );
}else{
	System.out.println(this.toString+" : frnc_word_nm is "+frnc_word_nm );
}
String test_cd = req.getParameter("test_cd");
if( test_cd == null){
	System.out.println(this.toString+" : test_cd is null" );
}else{
	System.out.println(this.toString+" : test_cd is "+test_cd );
}
String test_nm = req.getParameter("test_nm");
if( test_nm == null){
	System.out.println(this.toString+" : test_nm is null" );
}else{
	System.out.println(this.toString+" : test_nm is "+test_nm );
}
String test_grad = req.getParameter("test_grad");
if( test_grad == null){
	System.out.println(this.toString+" : test_grad is null" );
}else{
	System.out.println(this.toString+" : test_grad is "+test_grad );
}
String test_scor = req.getParameter("test_scor");
if( test_scor == null){
	System.out.println(this.toString+" : test_scor is null" );
}else{
	System.out.println(this.toString+" : test_scor is "+test_scor );
}
String test_dt = req.getParameter("test_dt");
if( test_dt == null){
	System.out.println(this.toString+" : test_dt is null" );
}else{
	System.out.println(this.toString+" : test_dt is "+test_dt );
}
String test_enfc_instt = req.getParameter("test_enfc_instt");
if( test_enfc_instt == null){
	System.out.println(this.toString+" : test_enfc_instt is null" );
}else{
	System.out.println(this.toString+" : test_enfc_instt is "+test_enfc_instt );
}
String spc_matt = req.getParameter("spc_matt");
if( spc_matt == null){
	System.out.println(this.toString+" : spc_matt is null" );
}else{
	System.out.println(this.toString+" : spc_matt is "+spc_matt );
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
String emp_no = Util.checkString(req.getParameter("emp_no"));
String frnc_word_seq = Util.checkString(req.getParameter("frnc_word_seq"));
String frnc_word_cd = Util.checkString(req.getParameter("frnc_word_cd"));
String frnc_word_nm = Util.checkString(req.getParameter("frnc_word_nm"));
String test_cd = Util.checkString(req.getParameter("test_cd"));
String test_nm = Util.checkString(req.getParameter("test_nm"));
String test_grad = Util.checkString(req.getParameter("test_grad"));
String test_scor = Util.checkString(req.getParameter("test_scor"));
String test_dt = Util.checkString(req.getParameter("test_dt"));
String test_enfc_instt = Util.checkString(req.getParameter("test_enfc_instt"));
String spc_matt = Util.checkString(req.getParameter("spc_matt"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String frnc_word_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("frnc_word_seq")));
String frnc_word_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("frnc_word_cd")));
String frnc_word_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("frnc_word_nm")));
String test_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("test_cd")));
String test_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("test_nm")));
String test_grad = Util.Uni2Ksc(Util.checkString(req.getParameter("test_grad")));
String test_scor = Util.Uni2Ksc(Util.checkString(req.getParameter("test_scor")));
String test_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("test_dt")));
String test_enfc_instt = Util.Uni2Ksc(Util.checkString(req.getParameter("test_enfc_instt")));
String spc_matt = Util.Uni2Ksc(Util.checkString(req.getParameter("spc_matt")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setFrnc_word_seq(frnc_word_seq);
dm.setFrnc_word_cd(frnc_word_cd);
dm.setFrnc_word_nm(frnc_word_nm);
dm.setTest_cd(test_cd);
dm.setTest_nm(test_nm);
dm.setTest_grad(test_grad);
dm.setTest_scor(test_scor);
dm.setTest_dt(test_dt);
dm.setTest_enfc_instt(test_enfc_instt);
dm.setSpc_matt(spc_matt);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 11 11:30:23 KST 2009 */