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


package chosun.ciis.mt.submatrout.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrout.ds.*;
import chosun.ciis.mt.submatrout.rec.*;

/**
 * 
 */


public class MT_SUBMATROUT_1151_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fac_clsf;
	public String owh_dt;
	public String gubun;
	public String occr_dt;
	public String seq;
	public String matr_cd;
	public String curdd_ewh_qunt;
	public String plan_dt;
	public String pers_ipaddr;
	public String pers_id;

	public MT_SUBMATROUT_1151_ADM(){}
	public MT_SUBMATROUT_1151_ADM(String cmpy_cd, String fac_clsf, String owh_dt, String gubun, String occr_dt, String seq, String matr_cd, String curdd_ewh_qunt, String plan_dt, String pers_ipaddr, String pers_id){
		this.cmpy_cd = cmpy_cd;
		this.fac_clsf = fac_clsf;
		this.owh_dt = owh_dt;
		this.gubun = gubun;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.matr_cd = matr_cd;
		this.curdd_ewh_qunt = curdd_ewh_qunt;
		this.plan_dt = plan_dt;
		this.pers_ipaddr = pers_ipaddr;
		this.pers_id = pers_id;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setOwh_dt(String owh_dt){
		this.owh_dt = owh_dt;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setCurdd_ewh_qunt(String curdd_ewh_qunt){
		this.curdd_ewh_qunt = curdd_ewh_qunt;
	}

	public void setPlan_dt(String plan_dt){
		this.plan_dt = plan_dt;
	}

	public void setPers_ipaddr(String pers_ipaddr){
		this.pers_ipaddr = pers_ipaddr;
	}

	public void setPers_id(String pers_id){
		this.pers_id = pers_id;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getOwh_dt(){
		return this.owh_dt;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getCurdd_ewh_qunt(){
		return this.curdd_ewh_qunt;
	}

	public String getPlan_dt(){
		return this.plan_dt;
	}

	public String getPers_ipaddr(){
		return this.pers_ipaddr;
	}

	public String getPers_id(){
		return this.pers_id;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_SUBMATROUT_1151_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_SUBMATROUT_1151_ADM dm = (MT_SUBMATROUT_1151_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fac_clsf);
		cstmt.setString(5, dm.owh_dt);
		cstmt.setString(6, dm.gubun);
		cstmt.setString(7, dm.occr_dt);
		cstmt.setString(8, dm.seq);
		cstmt.setString(9, dm.matr_cd);
		cstmt.setString(10, dm.curdd_ewh_qunt);
		cstmt.setString(11, dm.plan_dt);
		cstmt.setString(12, dm.pers_ipaddr);
		cstmt.setString(13, dm.pers_id);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.submatrout.ds.MT_SUBMATROUT_1151_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("owh_dt = [" + getOwh_dt() + "]");
		System.out.println("gubun = [" + getGubun() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("matr_cd = [" + getMatr_cd() + "]");
		System.out.println("curdd_ewh_qunt = [" + getCurdd_ewh_qunt() + "]");
		System.out.println("plan_dt = [" + getPlan_dt() + "]");
		System.out.println("pers_ipaddr = [" + getPers_ipaddr() + "]");
		System.out.println("pers_id = [" + getPers_id() + "]");
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
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String owh_dt = req.getParameter("owh_dt");
if( owh_dt == null){
	System.out.println(this.toString+" : owh_dt is null" );
}else{
	System.out.println(this.toString+" : owh_dt is "+owh_dt );
}
String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
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
String matr_cd = req.getParameter("matr_cd");
if( matr_cd == null){
	System.out.println(this.toString+" : matr_cd is null" );
}else{
	System.out.println(this.toString+" : matr_cd is "+matr_cd );
}
String curdd_ewh_qunt = req.getParameter("curdd_ewh_qunt");
if( curdd_ewh_qunt == null){
	System.out.println(this.toString+" : curdd_ewh_qunt is null" );
}else{
	System.out.println(this.toString+" : curdd_ewh_qunt is "+curdd_ewh_qunt );
}
String plan_dt = req.getParameter("plan_dt");
if( plan_dt == null){
	System.out.println(this.toString+" : plan_dt is null" );
}else{
	System.out.println(this.toString+" : plan_dt is "+plan_dt );
}
String pers_ipaddr = req.getParameter("pers_ipaddr");
if( pers_ipaddr == null){
	System.out.println(this.toString+" : pers_ipaddr is null" );
}else{
	System.out.println(this.toString+" : pers_ipaddr is "+pers_ipaddr );
}
String pers_id = req.getParameter("pers_id");
if( pers_id == null){
	System.out.println(this.toString+" : pers_id is null" );
}else{
	System.out.println(this.toString+" : pers_id is "+pers_id );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String owh_dt = Util.checkString(req.getParameter("owh_dt"));
String gubun = Util.checkString(req.getParameter("gubun"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String matr_cd = Util.checkString(req.getParameter("matr_cd"));
String curdd_ewh_qunt = Util.checkString(req.getParameter("curdd_ewh_qunt"));
String plan_dt = Util.checkString(req.getParameter("plan_dt"));
String pers_ipaddr = Util.checkString(req.getParameter("pers_ipaddr"));
String pers_id = Util.checkString(req.getParameter("pers_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String owh_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("owh_dt")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String matr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd")));
String curdd_ewh_qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("curdd_ewh_qunt")));
String plan_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("plan_dt")));
String pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("pers_ipaddr")));
String pers_id = Util.Uni2Ksc(Util.checkString(req.getParameter("pers_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFac_clsf(fac_clsf);
dm.setOwh_dt(owh_dt);
dm.setGubun(gubun);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setMatr_cd(matr_cd);
dm.setCurdd_ewh_qunt(curdd_ewh_qunt);
dm.setPlan_dt(plan_dt);
dm.setPers_ipaddr(pers_ipaddr);
dm.setPers_id(pers_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Nov 03 20:08:05 KST 2009 */