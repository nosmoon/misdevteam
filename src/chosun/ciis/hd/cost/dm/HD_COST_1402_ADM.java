/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
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


public class HD_COST_1402_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String emp_no;
	public String card_no;
	public String remk_2;
	public String seq;
	public String occr_dt;
	public String incmg_pers;
	public String use_type;
	public String medi_cd;
	public String dtls_medi_cd;

	public HD_COST_1402_ADM(){}
	public HD_COST_1402_ADM(String cmpy_cd, String mode, String emp_no, String card_no, String remk_2, String seq, String occr_dt, String incmg_pers, String use_type, String medi_cd, String dtls_medi_cd){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.emp_no = emp_no;
		this.card_no = card_no;
		this.remk_2 = remk_2;
		this.seq = seq;
		this.occr_dt = occr_dt;
		this.incmg_pers = incmg_pers;
		this.use_type = use_type;
		this.medi_cd = medi_cd;
		this.dtls_medi_cd = dtls_medi_cd;
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

	public void setCard_no(String card_no){
		this.card_no = card_no;
	}

	public void setRemk_2(String remk_2){
		this.remk_2 = remk_2;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setUse_type(String use_type){
		this.use_type = use_type;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
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

	public String getCard_no(){
		return this.card_no;
	}

	public String getRemk_2(){
		return this.remk_2;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getUse_type(){
		return this.use_type;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_COST_1402_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_COST_1402_ADM dm = (HD_COST_1402_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.card_no);
		cstmt.setString(7, dm.remk_2);
		cstmt.setString(8, dm.seq);
		cstmt.setString(9, dm.occr_dt);
		cstmt.setString(10, dm.incmg_pers);
		cstmt.setString(11, dm.use_type);
		cstmt.setString(12, dm.medi_cd);
		cstmt.setString(13, dm.dtls_medi_cd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.cost.ds.HD_COST_1402_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("card_no = [" + getCard_no() + "]");
		System.out.println("remk_2 = [" + getRemk_2() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("use_type = [" + getUse_type() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("dtls_medi_cd = [" + getDtls_medi_cd() + "]");
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
String card_no = req.getParameter("card_no");
if( card_no == null){
	System.out.println(this.toString+" : card_no is null" );
}else{
	System.out.println(this.toString+" : card_no is "+card_no );
}
String remk_2 = req.getParameter("remk_2");
if( remk_2 == null){
	System.out.println(this.toString+" : remk_2 is null" );
}else{
	System.out.println(this.toString+" : remk_2 is "+remk_2 );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String use_type = req.getParameter("use_type");
if( use_type == null){
	System.out.println(this.toString+" : use_type is null" );
}else{
	System.out.println(this.toString+" : use_type is "+use_type );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String dtls_medi_cd = req.getParameter("dtls_medi_cd");
if( dtls_medi_cd == null){
	System.out.println(this.toString+" : dtls_medi_cd is null" );
}else{
	System.out.println(this.toString+" : dtls_medi_cd is "+dtls_medi_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String card_no = Util.checkString(req.getParameter("card_no"));
String remk_2 = Util.checkString(req.getParameter("remk_2"));
String seq = Util.checkString(req.getParameter("seq"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String use_type = Util.checkString(req.getParameter("use_type"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String dtls_medi_cd = Util.checkString(req.getParameter("dtls_medi_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String card_no = Util.Uni2Ksc(Util.checkString(req.getParameter("card_no")));
String remk_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("remk_2")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String use_type = Util.Uni2Ksc(Util.checkString(req.getParameter("use_type")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String dtls_medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_medi_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setEmp_no(emp_no);
dm.setCard_no(card_no);
dm.setRemk_2(remk_2);
dm.setSeq(seq);
dm.setOccr_dt(occr_dt);
dm.setIncmg_pers(incmg_pers);
dm.setUse_type(use_type);
dm.setMedi_cd(medi_cd);
dm.setDtls_medi_cd(dtls_medi_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 03 10:45:55 KST 2017 */