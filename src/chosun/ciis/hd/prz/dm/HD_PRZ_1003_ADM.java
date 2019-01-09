
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
import chosun.ciis.co.base.util.Base64Util;
import chosun.ciis.co.base.util.StreamUtil;

/**
 * 
 */


public class HD_PRZ_1003_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String aplc_clsf;
	public String obj_clsf;
	public String prz_pnsh_cd;
	public String req_pers_emp_no;
	public String req_pers_dept_cd;
	public String atic_pubc_dt;
	public String atic_pubc_side;
	public String case_nm;
	public String prz_cont;
	//public null atic_add_file;
	public byte[] atic_add_file;
	public String atic_add_file_nm;
	public String atic_add_file_size;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String incmg_dt_tm;
	public String clas_clsf;
	public String dtls_cont;

	public HD_PRZ_1003_ADM(){}
	public HD_PRZ_1003_ADM(String mode, String cmpy_cd, String aplc_clsf, String obj_clsf, String prz_pnsh_cd, String req_pers_emp_no, String req_pers_dept_cd, String atic_pubc_dt, String atic_pubc_side, String case_nm, String prz_cont, byte[]  atic_add_file, String atic_add_file_nm, String atic_add_file_size, String incmg_pers_ipadd, String incmg_pers, String incmg_dt_tm, String clas_clsf, String dtls_cont){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.aplc_clsf = aplc_clsf;
		this.obj_clsf = obj_clsf;
		this.prz_pnsh_cd = prz_pnsh_cd;
		this.req_pers_emp_no = req_pers_emp_no;
		this.req_pers_dept_cd = req_pers_dept_cd;
		this.atic_pubc_dt = atic_pubc_dt;
		this.atic_pubc_side = atic_pubc_side;
		this.case_nm = case_nm;
		this.prz_cont = prz_cont;
		this.atic_add_file = atic_add_file;
		this.atic_add_file_nm = atic_add_file_nm;
		this.atic_add_file_size = atic_add_file_nm;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.incmg_dt_tm = incmg_dt_tm;
		this.clas_clsf = clas_clsf;
		this.dtls_cont = dtls_cont;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAplc_clsf(String aplc_clsf){
		this.aplc_clsf = aplc_clsf;
	}

	public void setObj_clsf(String obj_clsf){
		this.obj_clsf = obj_clsf;
	}

	public void setPrz_pnsh_cd(String prz_pnsh_cd){
		this.prz_pnsh_cd = prz_pnsh_cd;
	}

	public void setReq_pers_emp_no(String req_pers_emp_no){
		this.req_pers_emp_no = req_pers_emp_no;
	}

	public void setReq_pers_dept_cd(String req_pers_dept_cd){
		this.req_pers_dept_cd = req_pers_dept_cd;
	}

	public void setAtic_pubc_dt(String atic_pubc_dt){
		this.atic_pubc_dt = atic_pubc_dt;
	}

	public void setAtic_pubc_side(String atic_pubc_side){
		this.atic_pubc_side = atic_pubc_side;
	}

	public void setCase_nm(String case_nm){
		this.case_nm = case_nm;
	}

	public void setPrz_cont(String prz_cont){
		this.prz_cont = prz_cont;
	}

	public void setAtic_add_file(byte[] atic_add_file){
		this.atic_add_file = atic_add_file;
	}

	public void setAtic_add_file_nm(String atic_add_file_nm){
		this.atic_add_file_nm = atic_add_file_nm;
	}

	public void setAtic_add_file_size(String atic_add_file_size){
		this.atic_add_file_size = atic_add_file_size;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}
	
	public void setClas_clsf(String clas_clsf){
		this.clas_clsf = clas_clsf;
	}
	
	public void setDtls_cont(String dtls_cont){
		this.dtls_cont = dtls_cont;
	}
	
	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAplc_clsf(){
		return this.aplc_clsf;
	}

	public String getObj_clsf(){
		return this.obj_clsf;
	}

	public String getPrz_pnsh_cd(){
		return this.prz_pnsh_cd;
	}

	public String getReq_pers_emp_no(){
		return this.req_pers_emp_no;
	}

	public String getReq_pers_dept_cd(){
		return this.req_pers_dept_cd;
	}

	public String getAtic_pubc_dt(){
		return this.atic_pubc_dt;
	}

	public String getAtic_pubc_side(){
		return this.atic_pubc_side;
	}

	public String getCase_nm(){
		return this.case_nm;
	}

	public String getPrz_cont(){
		return this.prz_cont;
	}

	public byte[] getAtic_add_file(){
		return this.atic_add_file;
	}

	public String getAtic_add_file_nm(){
		return this.atic_add_file_nm;
	}

	public String getAtic_add_file_size(){
		return this.atic_add_file_size;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}
	
	public String getClas_clsf(){
		return this.clas_clsf;
	}
	
	public String getDtls_cont(){
		return this.dtls_cont;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_PRZ_1003_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_PRZ_1003_ADM dm = (HD_PRZ_1003_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, Types.VARCHAR);
		cstmt.registerOutParameter(4, Types.VARCHAR);
		cstmt.registerOutParameter(5, Types.VARCHAR);		
		cstmt.setString(6, dm.mode);
		cstmt.setString(7, dm.cmpy_cd);
		cstmt.setString(8, dm.aplc_clsf);
		cstmt.setString(9, dm.obj_clsf);
		cstmt.setString(10, dm.prz_pnsh_cd);
		cstmt.setString(11, dm.req_pers_emp_no);
		cstmt.setString(12, dm.req_pers_dept_cd);
		cstmt.setString(13, dm.atic_pubc_dt);
		cstmt.setString(14, dm.atic_pubc_side);
		cstmt.setString(15, dm.case_nm);
		cstmt.setString(16, dm.prz_cont);
		//cstmt.setBytes(17, dm.getAtic_add_file());
		cstmt.setBytes(17, dm.atic_add_file);
		cstmt.setString(18, dm.atic_add_file_nm);
		cstmt.setString(19, dm.atic_add_file_size);
		cstmt.setString(20, dm.incmg_pers_ipadd);
		cstmt.setString(21, dm.incmg_pers);
		cstmt.setString(22, dm.incmg_dt_tm);
		cstmt.setString(23, dm.clas_clsf);
		cstmt.setString(24, dm.dtls_cont);

		/*
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.aplc_clsf);
		cstmt.setString(6, dm.obj_clsf);
		cstmt.setString(7, dm.prz_pnsh_cd);
		cstmt.setString(8, dm.req_pers_emp_no);
		cstmt.setString(9, dm.req_pers_dept_cd);
		cstmt.setString(10, dm.atic_pubc_dt);
		cstmt.setString(11, dm.atic_pubc_side);
		cstmt.setString(12, dm.case_nm);
		cstmt.setString(13, dm.prz_cont);	
		cstmt.setString(15, dm.incmg_pers_ipadd);
		cstmt.setString(16, dm.incmg_pers);
		cstmt.setString(17, dm.incmg_dt_tm);
		*/
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.prz.ds.HD_PRZ_1003_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("aplc_clsf = [" + getAplc_clsf() + "]");
		System.out.println("obj_clsf = [" + getObj_clsf() + "]");
		System.out.println("prz_pnsh_cd = [" + getPrz_pnsh_cd() + "]");
		System.out.println("req_pers_emp_no = [" + getReq_pers_emp_no() + "]");
		System.out.println("req_pers_dept_cd = [" + getReq_pers_dept_cd() + "]");
		System.out.println("atic_pubc_dt = [" + getAtic_pubc_dt() + "]");
		System.out.println("atic_pubc_side = [" + getAtic_pubc_side() + "]");
		System.out.println("case_nm = [" + getCase_nm() + "]");
		System.out.println("prz_cont = [" + getPrz_cont() + "]");
		System.out.println("atic_add_file = [" + getAtic_add_file() + "]");
		System.out.println("atic_add_file_nm = [" + getAtic_add_file_nm() + "]");
		System.out.println("atic_add_file_size = [" + getAtic_add_file_size() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_dt_tm = [" + getIncmg_dt_tm() + "]");
		System.out.println("clas_clsf = [" + getClas_clsf() + "]");
		System.out.println("dtls_cont = [" + getDtls_cont() + "]");
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
String aplc_clsf = req.getParameter("aplc_clsf");
if( aplc_clsf == null){
	System.out.println(this.toString+" : aplc_clsf is null" );
}else{
	System.out.println(this.toString+" : aplc_clsf is "+aplc_clsf );
}
String obj_clsf = req.getParameter("obj_clsf");
if( obj_clsf == null){
	System.out.println(this.toString+" : obj_clsf is null" );
}else{
	System.out.println(this.toString+" : obj_clsf is "+obj_clsf );
}
String prz_pnsh_cd = req.getParameter("prz_pnsh_cd");
if( prz_pnsh_cd == null){
	System.out.println(this.toString+" : prz_pnsh_cd is null" );
}else{
	System.out.println(this.toString+" : prz_pnsh_cd is "+prz_pnsh_cd );
}
String req_pers_emp_no = req.getParameter("req_pers_emp_no");
if( req_pers_emp_no == null){
	System.out.println(this.toString+" : req_pers_emp_no is null" );
}else{
	System.out.println(this.toString+" : req_pers_emp_no is "+req_pers_emp_no );
}
String req_pers_dept_cd = req.getParameter("req_pers_dept_cd");
if( req_pers_dept_cd == null){
	System.out.println(this.toString+" : req_pers_dept_cd is null" );
}else{
	System.out.println(this.toString+" : req_pers_dept_cd is "+req_pers_dept_cd );
}
String atic_pubc_dt = req.getParameter("atic_pubc_dt");
if( atic_pubc_dt == null){
	System.out.println(this.toString+" : atic_pubc_dt is null" );
}else{
	System.out.println(this.toString+" : atic_pubc_dt is "+atic_pubc_dt );
}
String atic_pubc_side = req.getParameter("atic_pubc_side");
if( atic_pubc_side == null){
	System.out.println(this.toString+" : atic_pubc_side is null" );
}else{
	System.out.println(this.toString+" : atic_pubc_side is "+atic_pubc_side );
}
String case_nm = req.getParameter("case_nm");
if( case_nm == null){
	System.out.println(this.toString+" : case_nm is null" );
}else{
	System.out.println(this.toString+" : case_nm is "+case_nm );
}
String prz_cont = req.getParameter("prz_cont");
if( prz_cont == null){
	System.out.println(this.toString+" : prz_cont is null" );
}else{
	System.out.println(this.toString+" : prz_cont is "+prz_cont );
}
String atic_add_file = req.getParameter("atic_add_file");
if( atic_add_file == null){
	System.out.println(this.toString+" : atic_add_file is null" );
}else{
	System.out.println(this.toString+" : atic_add_file is "+atic_add_file );
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
String incmg_dt_tm = req.getParameter("incmg_dt_tm");
if( incmg_dt_tm == null){
	System.out.println(this.toString+" : incmg_dt_tm is null" );
}else{
	System.out.println(this.toString+" : incmg_dt_tm is "+incmg_dt_tm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String aplc_clsf = Util.checkString(req.getParameter("aplc_clsf"));
String obj_clsf = Util.checkString(req.getParameter("obj_clsf"));
String prz_pnsh_cd = Util.checkString(req.getParameter("prz_pnsh_cd"));
String req_pers_emp_no = Util.checkString(req.getParameter("req_pers_emp_no"));
String req_pers_dept_cd = Util.checkString(req.getParameter("req_pers_dept_cd"));
String atic_pubc_dt = Util.checkString(req.getParameter("atic_pubc_dt"));
String atic_pubc_side = Util.checkString(req.getParameter("atic_pubc_side"));
String case_nm = Util.checkString(req.getParameter("case_nm"));
String prz_cont = Util.checkString(req.getParameter("prz_cont"));
String atic_add_file = Util.checkString(req.getParameter("atic_add_file"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_dt_tm = Util.checkString(req.getParameter("incmg_dt_tm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String aplc_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_clsf")));
String obj_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("obj_clsf")));
String prz_pnsh_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prz_pnsh_cd")));
String req_pers_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("req_pers_emp_no")));
String req_pers_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("req_pers_dept_cd")));
String atic_pubc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("atic_pubc_dt")));
String atic_pubc_side = Util.Uni2Ksc(Util.checkString(req.getParameter("atic_pubc_side")));
String case_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("case_nm")));
String prz_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("prz_cont")));
String atic_add_file = Util.Uni2Ksc(Util.checkString(req.getParameter("atic_add_file")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_dt_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_dt_tm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setAplc_clsf(aplc_clsf);
dm.setObj_clsf(obj_clsf);
dm.setPrz_pnsh_cd(prz_pnsh_cd);
dm.setReq_pers_emp_no(req_pers_emp_no);
dm.setReq_pers_dept_cd(req_pers_dept_cd);
dm.setAtic_pubc_dt(atic_pubc_dt);
dm.setAtic_pubc_side(atic_pubc_side);
dm.setCase_nm(case_nm);
dm.setPrz_cont(prz_cont);
dm.setAtic_add_file(atic_add_file);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_dt_tm(incmg_dt_tm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 01 13:46:42 KST 2009 */