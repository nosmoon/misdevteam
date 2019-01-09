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


package chosun.ciis.mt.submatrcla.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrcla.ds.*;
import chosun.ciis.mt.submatrcla.rec.*;

/**
 * 
 */


public class MT_SUBMATRCLA_2005_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String dept_cd;
	public String clam_clsf;
	public String clam_actu_cd;
	public String via_dept;
	public String aplc_pers;
	public String mode;
	public String medi_cd;
	public String rela_yn;

	public MT_SUBMATRCLA_2005_ADM(){}
	public MT_SUBMATRCLA_2005_ADM(String cmpy_cd, String occr_dt, String seq, String dept_cd, String clam_clsf, String clam_actu_cd, String via_dept, String aplc_pers, String mode, String medi_cd, String rela_yn){
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.dept_cd = dept_cd;
		this.clam_clsf = clam_clsf;
		this.clam_actu_cd = clam_actu_cd;
		this.via_dept = via_dept;
		this.aplc_pers = aplc_pers;
		this.mode = mode;
		this.medi_cd = medi_cd;
		this.rela_yn = rela_yn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setClam_clsf(String clam_clsf){
		this.clam_clsf = clam_clsf;
	}

	public void setClam_actu_cd(String clam_actu_cd){
		this.clam_actu_cd = clam_actu_cd;
	}

	public void setVia_dept(String via_dept){
		this.via_dept = via_dept;
	}

	public void setAplc_pers(String aplc_pers){
		this.aplc_pers = aplc_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setRela_yn(String rela_yn){
		this.rela_yn = rela_yn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getClam_clsf(){
		return this.clam_clsf;
	}

	public String getClam_actu_cd(){
		return this.clam_actu_cd;
	}

	public String getVia_dept(){
		return this.via_dept;
	}

	public String getAplc_pers(){
		return this.aplc_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getRela_yn(){
		return this.rela_yn;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_SUBMATRCLA_2005_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_SUBMATRCLA_2005_ADM dm = (MT_SUBMATRCLA_2005_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_dt);
		cstmt.setString(5, dm.seq);
		cstmt.setString(6, dm.dept_cd);
		cstmt.setString(7, dm.clam_clsf);
		cstmt.setString(8, dm.clam_actu_cd);
		cstmt.setString(9, dm.via_dept);
		cstmt.setString(10, dm.aplc_pers);
		cstmt.setString(11, dm.mode);
		cstmt.setString(12, dm.medi_cd);
		cstmt.setString(13, dm.rela_yn);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.submatrcla.ds.MT_SUBMATRCLA_2005_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("clam_clsf = [" + getClam_clsf() + "]");
		System.out.println("clam_actu_cd = [" + getClam_actu_cd() + "]");
		System.out.println("via_dept = [" + getVia_dept() + "]");
		System.out.println("aplc_pers = [" + getAplc_pers() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("rela_yn = [" + getRela_yn() + "]");
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
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String clam_clsf = req.getParameter("clam_clsf");
if( clam_clsf == null){
	System.out.println(this.toString+" : clam_clsf is null" );
}else{
	System.out.println(this.toString+" : clam_clsf is "+clam_clsf );
}
String clam_actu_cd = req.getParameter("clam_actu_cd");
if( clam_actu_cd == null){
	System.out.println(this.toString+" : clam_actu_cd is null" );
}else{
	System.out.println(this.toString+" : clam_actu_cd is "+clam_actu_cd );
}
String via_dept = req.getParameter("via_dept");
if( via_dept == null){
	System.out.println(this.toString+" : via_dept is null" );
}else{
	System.out.println(this.toString+" : via_dept is "+via_dept );
}
String aplc_pers = req.getParameter("aplc_pers");
if( aplc_pers == null){
	System.out.println(this.toString+" : aplc_pers is null" );
}else{
	System.out.println(this.toString+" : aplc_pers is "+aplc_pers );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String rela_yn = req.getParameter("rela_yn");
if( rela_yn == null){
	System.out.println(this.toString+" : rela_yn is null" );
}else{
	System.out.println(this.toString+" : rela_yn is "+rela_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String clam_clsf = Util.checkString(req.getParameter("clam_clsf"));
String clam_actu_cd = Util.checkString(req.getParameter("clam_actu_cd"));
String via_dept = Util.checkString(req.getParameter("via_dept"));
String aplc_pers = Util.checkString(req.getParameter("aplc_pers"));
String mode = Util.checkString(req.getParameter("mode"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String rela_yn = Util.checkString(req.getParameter("rela_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String clam_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_clsf")));
String clam_actu_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_actu_cd")));
String via_dept = Util.Uni2Ksc(Util.checkString(req.getParameter("via_dept")));
String aplc_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_pers")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String rela_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("rela_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setDept_cd(dept_cd);
dm.setClam_clsf(clam_clsf);
dm.setClam_actu_cd(clam_actu_cd);
dm.setVia_dept(via_dept);
dm.setAplc_pers(aplc_pers);
dm.setMode(mode);
dm.setMedi_cd(medi_cd);
dm.setRela_yn(rela_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 03 09:39:09 KST 2009 */