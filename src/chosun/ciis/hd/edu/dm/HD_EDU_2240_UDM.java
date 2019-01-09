

package chosun.ciis.hd.edu.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.edu.ds.*;
import chosun.ciis.hd.edu.rec.*;

/**
 * 
 */


public class HD_EDU_2240_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String cour_lng_cd;
	public String cour_obj_cd;
	public String cour_tm_cd;
	public String lv_cd;
	public String lv_test_req_cd;
	public String tel_no;
	public String incmg_pers;

	public HD_EDU_2240_UDM(){}
	public HD_EDU_2240_UDM(String cmpy_cd, String mode, String emp_no, String occr_dt, String seq, String cour_lng_cd, String cour_obj_cd, String cour_tm_cd, String lv_cd, String lv_test_req_cd, String tel_no, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.emp_no = emp_no;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.cour_lng_cd = cour_lng_cd;
		this.cour_obj_cd = cour_obj_cd;
		this.cour_tm_cd = cour_tm_cd;
		this.lv_cd = lv_cd;
		this.lv_test_req_cd = lv_test_req_cd;
		this.tel_no = tel_no;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setCour_lng_cd(String cour_lng_cd){
		this.cour_lng_cd = cour_lng_cd;
	}

	public void setCour_obj_cd(String cour_obj_cd){
		this.cour_obj_cd = cour_obj_cd;
	}

	public void setCour_tm_cd(String cour_tm_cd){
		this.cour_tm_cd = cour_tm_cd;
	}

	public void setLv_cd(String lv_cd){
		this.lv_cd = lv_cd;
	}

	public void setLv_test_req_cd(String lv_test_req_cd){
		this.lv_test_req_cd = lv_test_req_cd;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
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

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getCour_lng_cd(){
		return this.cour_lng_cd;
	}

	public String getCour_obj_cd(){
		return this.cour_obj_cd;
	}

	public String getCour_tm_cd(){
		return this.cour_tm_cd;
	}

	public String getLv_cd(){
		return this.lv_cd;
	}

	public String getLv_test_req_cd(){
		return this.lv_test_req_cd;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_EDU_2240_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_EDU_2240_UDM dm = (HD_EDU_2240_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.occr_dt);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.cour_lng_cd);
		cstmt.setString(9, dm.cour_obj_cd);
		cstmt.setString(10, dm.cour_tm_cd);
		cstmt.setString(11, dm.lv_cd);
		cstmt.setString(12, dm.lv_test_req_cd);
		cstmt.setString(13, dm.tel_no);
		cstmt.setString(14, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_EDU_2240_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("cour_lng_cd = [" + getCour_lng_cd() + "]");
		System.out.println("cour_obj_cd = [" + getCour_obj_cd() + "]");
		System.out.println("cour_tm_cd = [" + getCour_tm_cd() + "]");
		System.out.println("lv_cd = [" + getLv_cd() + "]");
		System.out.println("lv_test_req_cd = [" + getLv_test_req_cd() + "]");
		System.out.println("tel_no = [" + getTel_no() + "]");
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
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String cour_lng_cd = req.getParameter("cour_lng_cd");
if( cour_lng_cd == null){
	System.out.println(this.toString+" : cour_lng_cd is null" );
}else{
	System.out.println(this.toString+" : cour_lng_cd is "+cour_lng_cd );
}
String cour_obj_cd = req.getParameter("cour_obj_cd");
if( cour_obj_cd == null){
	System.out.println(this.toString+" : cour_obj_cd is null" );
}else{
	System.out.println(this.toString+" : cour_obj_cd is "+cour_obj_cd );
}
String cour_tm_cd = req.getParameter("cour_tm_cd");
if( cour_tm_cd == null){
	System.out.println(this.toString+" : cour_tm_cd is null" );
}else{
	System.out.println(this.toString+" : cour_tm_cd is "+cour_tm_cd );
}
String lv_cd = req.getParameter("lv_cd");
if( lv_cd == null){
	System.out.println(this.toString+" : lv_cd is null" );
}else{
	System.out.println(this.toString+" : lv_cd is "+lv_cd );
}
String lv_test_req_cd = req.getParameter("lv_test_req_cd");
if( lv_test_req_cd == null){
	System.out.println(this.toString+" : lv_test_req_cd is null" );
}else{
	System.out.println(this.toString+" : lv_test_req_cd is "+lv_test_req_cd );
}
String tel_no = req.getParameter("tel_no");
if( tel_no == null){
	System.out.println(this.toString+" : tel_no is null" );
}else{
	System.out.println(this.toString+" : tel_no is "+tel_no );
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
String emp_no = Util.checkString(req.getParameter("emp_no"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String cour_lng_cd = Util.checkString(req.getParameter("cour_lng_cd"));
String cour_obj_cd = Util.checkString(req.getParameter("cour_obj_cd"));
String cour_tm_cd = Util.checkString(req.getParameter("cour_tm_cd"));
String lv_cd = Util.checkString(req.getParameter("lv_cd"));
String lv_test_req_cd = Util.checkString(req.getParameter("lv_test_req_cd"));
String tel_no = Util.checkString(req.getParameter("tel_no"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String cour_lng_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cour_lng_cd")));
String cour_obj_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cour_obj_cd")));
String cour_tm_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cour_tm_cd")));
String lv_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("lv_cd")));
String lv_test_req_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("lv_test_req_cd")));
String tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setEmp_no(emp_no);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setCour_lng_cd(cour_lng_cd);
dm.setCour_obj_cd(cour_obj_cd);
dm.setCour_tm_cd(cour_tm_cd);
dm.setLv_cd(lv_cd);
dm.setLv_test_req_cd(lv_test_req_cd);
dm.setTel_no(tel_no);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 13 15:27:43 KST 2011 */