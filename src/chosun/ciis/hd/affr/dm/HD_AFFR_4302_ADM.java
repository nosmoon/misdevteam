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


package chosun.ciis.hd.affr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.ds.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_4302_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String occr_dt;
	public String seq;
	public String category_clsf;
	public String grp_indt_clsf;
	public String indt_cd;
	public String indt_nm;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_AFFR_4302_ADM(){}
	public HD_AFFR_4302_ADM(String cmpy_cd, String mode, String occr_dt, String seq, String category_clsf, String grp_indt_clsf, String indt_cd, String indt_nm, String incmg_pers_ipadd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.category_clsf = category_clsf;
		this.grp_indt_clsf = grp_indt_clsf;
		this.indt_cd = indt_cd;
		this.indt_nm = indt_nm;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setCategory_clsf(String category_clsf){
		this.category_clsf = category_clsf;
	}

	public void setGrp_indt_clsf(String grp_indt_clsf){
		this.grp_indt_clsf = grp_indt_clsf;
	}

	public void setIndt_cd(String indt_cd){
		this.indt_cd = indt_cd;
	}

	public void setIndt_nm(String indt_nm){
		this.indt_nm = indt_nm;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
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

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getCategory_clsf(){
		return this.category_clsf;
	}

	public String getGrp_indt_clsf(){
		return this.grp_indt_clsf;
	}

	public String getIndt_cd(){
		return this.indt_cd;
	}

	public String getIndt_nm(){
		return this.indt_nm;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_4302_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_4302_ADM dm = (HD_AFFR_4302_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.occr_dt);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.category_clsf);
		cstmt.setString(8, dm.grp_indt_clsf);
		cstmt.setString(9, dm.indt_cd);
		cstmt.setString(10, dm.indt_nm);
		cstmt.setString(11, dm.incmg_pers_ipadd);
		cstmt.setString(12, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_4302_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("category_clsf = [" + getCategory_clsf() + "]");
		System.out.println("grp_indt_clsf = [" + getGrp_indt_clsf() + "]");
		System.out.println("indt_cd = [" + getIndt_cd() + "]");
		System.out.println("indt_nm = [" + getIndt_nm() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
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
String category_clsf = req.getParameter("category_clsf");
if( category_clsf == null){
	System.out.println(this.toString+" : category_clsf is null" );
}else{
	System.out.println(this.toString+" : category_clsf is "+category_clsf );
}
String grp_indt_clsf = req.getParameter("grp_indt_clsf");
if( grp_indt_clsf == null){
	System.out.println(this.toString+" : grp_indt_clsf is null" );
}else{
	System.out.println(this.toString+" : grp_indt_clsf is "+grp_indt_clsf );
}
String indt_cd = req.getParameter("indt_cd");
if( indt_cd == null){
	System.out.println(this.toString+" : indt_cd is null" );
}else{
	System.out.println(this.toString+" : indt_cd is "+indt_cd );
}
String indt_nm = req.getParameter("indt_nm");
if( indt_nm == null){
	System.out.println(this.toString+" : indt_nm is null" );
}else{
	System.out.println(this.toString+" : indt_nm is "+indt_nm );
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

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String category_clsf = Util.checkString(req.getParameter("category_clsf"));
String grp_indt_clsf = Util.checkString(req.getParameter("grp_indt_clsf"));
String indt_cd = Util.checkString(req.getParameter("indt_cd"));
String indt_nm = Util.checkString(req.getParameter("indt_nm"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String category_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("category_clsf")));
String grp_indt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("grp_indt_clsf")));
String indt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("indt_cd")));
String indt_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("indt_nm")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setCategory_clsf(category_clsf);
dm.setGrp_indt_clsf(grp_indt_clsf);
dm.setIndt_cd(indt_cd);
dm.setIndt_nm(indt_nm);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 29 17:28:45 KST 2009 */