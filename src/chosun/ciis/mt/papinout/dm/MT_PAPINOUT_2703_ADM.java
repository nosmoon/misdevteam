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


package chosun.ciis.mt.papinout.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papinout.ds.*;
import chosun.ciis.mt.papinout.rec.*;

/**
 *
 */


public class MT_PAPINOUT_2703_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String save_fac_clsf;
	public String save_yymm;
	public String matr_cd;
	public String per_id;
	public String per_ip_addr;
	public String gubun;
	public String fac_clsf;
	public String seq;
	public String owh_plan_roll;
	public String owh_plan_wgt;
	public String owh_plan_dt;

	public MT_PAPINOUT_2703_ADM(){}
	public MT_PAPINOUT_2703_ADM(String cmpy_cd, String save_fac_clsf, String save_yymm, String matr_cd, String per_id, String per_ip_addr, String gubun, String fac_clsf, String seq, String owh_plan_roll, String owh_plan_wgt, String owh_plan_dt){
		this.cmpy_cd = cmpy_cd;
		this.save_fac_clsf = save_fac_clsf;
		this.save_yymm = save_yymm;
		this.matr_cd = matr_cd;
		this.per_id = per_id;
		this.per_ip_addr = per_ip_addr;
		this.gubun = gubun;
		this.fac_clsf = fac_clsf;
		this.seq = seq;
		this.owh_plan_roll = owh_plan_roll;
		this.owh_plan_wgt = owh_plan_wgt;
		this.owh_plan_dt = owh_plan_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSave_fac_clsf(String save_fac_clsf){
		this.save_fac_clsf = save_fac_clsf;
	}

	public void setSave_yymm(String save_yymm){
		this.save_yymm = save_yymm;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setPer_id(String per_id){
		this.per_id = per_id;
	}

	public void setPer_ip_addr(String per_ip_addr){
		this.per_ip_addr = per_ip_addr;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setOwh_plan_roll(String owh_plan_roll){
		this.owh_plan_roll = owh_plan_roll;
	}

	public void setOwh_plan_wgt(String owh_plan_wgt){
		this.owh_plan_wgt = owh_plan_wgt;
	}

	public void setOwh_plan_dt(String owh_plan_dt){
		this.owh_plan_dt = owh_plan_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSave_fac_clsf(){
		return this.save_fac_clsf;
	}

	public String getSave_yymm(){
		return this.save_yymm;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getPer_id(){
		return this.per_id;
	}

	public String getPer_ip_addr(){
		return this.per_ip_addr;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getOwh_plan_roll(){
		return this.owh_plan_roll;
	}

	public String getOwh_plan_wgt(){
		return this.owh_plan_wgt;
	}

	public String getOwh_plan_dt(){
		return this.owh_plan_dt;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPINOUT_2703_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPINOUT_2703_ADM dm = (MT_PAPINOUT_2703_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.save_fac_clsf);
		cstmt.setString(5, dm.save_yymm);
		cstmt.setString(6, dm.matr_cd);
		cstmt.setString(7, dm.per_id);
		cstmt.setString(8, dm.per_ip_addr);
		cstmt.setString(9, dm.gubun);
		cstmt.setString(10, dm.fac_clsf);
		cstmt.setString(11, dm.seq);
		cstmt.setString(12, dm.owh_plan_roll);
		cstmt.setString(13, dm.owh_plan_wgt);
		cstmt.setString(14, dm.owh_plan_dt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papinout.ds.MT_PAPINOUT_2703_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("save_fac_clsf = [" + getSave_fac_clsf() + "]");
		System.out.println("save_yymm = [" + getSave_yymm() + "]");
		System.out.println("matr_cd = [" + getMatr_cd() + "]");
		System.out.println("per_id = [" + getPer_id() + "]");
		System.out.println("per_ip_addr = [" + getPer_ip_addr() + "]");
		System.out.println("gubun = [" + getGubun() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("owh_plan_roll = [" + getOwh_plan_roll() + "]");
		System.out.println("owh_plan_wgt = [" + getOwh_plan_wgt() + "]");
		System.out.println("owh_plan_dt = [" + getOwh_plan_dt() + "]");
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
String save_fac_clsf = req.getParameter("save_fac_clsf");
if( save_fac_clsf == null){
	System.out.println(this.toString+" : save_fac_clsf is null" );
}else{
	System.out.println(this.toString+" : save_fac_clsf is "+save_fac_clsf );
}
String save_yymm = req.getParameter("save_yymm");
if( save_yymm == null){
	System.out.println(this.toString+" : save_yymm is null" );
}else{
	System.out.println(this.toString+" : save_yymm is "+save_yymm );
}
String matr_cd = req.getParameter("matr_cd");
if( matr_cd == null){
	System.out.println(this.toString+" : matr_cd is null" );
}else{
	System.out.println(this.toString+" : matr_cd is "+matr_cd );
}
String per_id = req.getParameter("per_id");
if( per_id == null){
	System.out.println(this.toString+" : per_id is null" );
}else{
	System.out.println(this.toString+" : per_id is "+per_id );
}
String per_ip_addr = req.getParameter("per_ip_addr");
if( per_ip_addr == null){
	System.out.println(this.toString+" : per_ip_addr is null" );
}else{
	System.out.println(this.toString+" : per_ip_addr is "+per_ip_addr );
}
String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String owh_plan_roll = req.getParameter("owh_plan_roll");
if( owh_plan_roll == null){
	System.out.println(this.toString+" : owh_plan_roll is null" );
}else{
	System.out.println(this.toString+" : owh_plan_roll is "+owh_plan_roll );
}
String owh_plan_wgt = req.getParameter("owh_plan_wgt");
if( owh_plan_wgt == null){
	System.out.println(this.toString+" : owh_plan_wgt is null" );
}else{
	System.out.println(this.toString+" : owh_plan_wgt is "+owh_plan_wgt );
}
String owh_plan_dt = req.getParameter("owh_plan_dt");
if( owh_plan_dt == null){
	System.out.println(this.toString+" : owh_plan_dt is null" );
}else{
	System.out.println(this.toString+" : owh_plan_dt is "+owh_plan_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String save_fac_clsf = Util.checkString(req.getParameter("save_fac_clsf"));
String save_yymm = Util.checkString(req.getParameter("save_yymm"));
String matr_cd = Util.checkString(req.getParameter("matr_cd"));
String per_id = Util.checkString(req.getParameter("per_id"));
String per_ip_addr = Util.checkString(req.getParameter("per_ip_addr"));
String gubun = Util.checkString(req.getParameter("gubun"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String seq = Util.checkString(req.getParameter("seq"));
String owh_plan_roll = Util.checkString(req.getParameter("owh_plan_roll"));
String owh_plan_wgt = Util.checkString(req.getParameter("owh_plan_wgt"));
String owh_plan_dt = Util.checkString(req.getParameter("owh_plan_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String save_fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("save_fac_clsf")));
String save_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("save_yymm")));
String matr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd")));
String per_id = Util.Uni2Ksc(Util.checkString(req.getParameter("per_id")));
String per_ip_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("per_ip_addr")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String owh_plan_roll = Util.Uni2Ksc(Util.checkString(req.getParameter("owh_plan_roll")));
String owh_plan_wgt = Util.Uni2Ksc(Util.checkString(req.getParameter("owh_plan_wgt")));
String owh_plan_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("owh_plan_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSave_fac_clsf(save_fac_clsf);
dm.setSave_yymm(save_yymm);
dm.setMatr_cd(matr_cd);
dm.setPer_id(per_id);
dm.setPer_ip_addr(per_ip_addr);
dm.setGubun(gubun);
dm.setFac_clsf(fac_clsf);
dm.setSeq(seq);
dm.setOwh_plan_roll(owh_plan_roll);
dm.setOwh_plan_wgt(owh_plan_wgt);
dm.setOwh_plan_dt(owh_plan_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 01 15:53:01 KST 2009 */