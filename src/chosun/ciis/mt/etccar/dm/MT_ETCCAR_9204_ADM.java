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


package chosun.ciis.mt.etccar.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etccar.ds.*;
import chosun.ciis.mt.etccar.rec.*;

/**
 * 
 */


public class MT_ETCCAR_9204_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String cancle_yn;
	public String incmg_pers;
	
	public MT_ETCCAR_9204_ADM(){}
	public MT_ETCCAR_9204_ADM(String cmpy_cd, String occr_dt, String seq, String incmg_pers, String cancle_yn){
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.cancle_yn = cancle_yn;
		this.incmg_pers = incmg_pers;
		
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

	public void setCancle_yn(String cancle_yn){
		this.cancle_yn = cancle_yn;
	}
	
	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
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
	
	public String getCancle_yn(){
		return this.cancle_yn;
	}
	
	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCCAR_9204_A(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCCAR_9204_ADM dm = (MT_ETCCAR_9204_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_dt);
		cstmt.setString(5, dm.seq);
		cstmt.setString(6, dm.cancle_yn);
		cstmt.setString(7, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etccar.ds.MT_ETCCAR_9204_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("cancle_yn = [" + getCancle_yn() + "]");
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
String req_occr_dt = req.getParameter("req_occr_dt");
if( req_occr_dt == null){
	System.out.println(this.toString+" : req_occr_dt is null" );
}else{
	System.out.println(this.toString+" : req_occr_dt is "+req_occr_dt );
}
String req_seq = req.getParameter("req_seq");
if( req_seq == null){
	System.out.println(this.toString+" : req_seq is null" );
}else{
	System.out.println(this.toString+" : req_seq is "+req_seq );
}
String start_dt = req.getParameter("start_dt");
if( start_dt == null){
	System.out.println(this.toString+" : start_dt is null" );
}else{
	System.out.println(this.toString+" : start_dt is "+start_dt );
}
String driv_dt = req.getParameter("driv_dt");
if( driv_dt == null){
	System.out.println(this.toString+" : driv_dt is null" );
}else{
	System.out.println(this.toString+" : driv_dt is "+driv_dt );
}
String car_no = req.getParameter("car_no");
if( car_no == null){
	System.out.println(this.toString+" : car_no is null" );
}else{
	System.out.println(this.toString+" : car_no is "+car_no );
}
String start_tm = req.getParameter("start_tm");
if( start_tm == null){
	System.out.println(this.toString+" : start_tm is null" );
}else{
	System.out.println(this.toString+" : start_tm is "+start_tm );
}
String ariv_tm = req.getParameter("ariv_tm");
if( ariv_tm == null){
	System.out.println(this.toString+" : ariv_tm is null" );
}else{
	System.out.println(this.toString+" : ariv_tm is "+ariv_tm );
}
String dest = req.getParameter("dest");
if( dest == null){
	System.out.println(this.toString+" : dest is null" );
}else{
	System.out.println(this.toString+" : dest is "+dest );
}
String drvr_nm = req.getParameter("drvr_nm");
if( drvr_nm == null){
	System.out.println(this.toString+" : drvr_nm is null" );
}else{
	System.out.println(this.toString+" : drvr_nm is "+drvr_nm );
}
String rid_pers = req.getParameter("rid_pers");
if( rid_pers == null){
	System.out.println(this.toString+" : rid_pers is null" );
}else{
	System.out.println(this.toString+" : rid_pers is "+rid_pers );
}
String rid_deptcd = req.getParameter("rid_deptcd");
if( rid_deptcd == null){
	System.out.println(this.toString+" : rid_deptcd is null" );
}else{
	System.out.println(this.toString+" : rid_deptcd is "+rid_deptcd );
}
String rid_dept_nm = req.getParameter("rid_dept_nm");
if( rid_dept_nm == null){
	System.out.println(this.toString+" : rid_dept_nm is null" );
}else{
	System.out.println(this.toString+" : rid_dept_nm is "+rid_dept_nm );
}
String driv_purp = req.getParameter("driv_purp");
if( driv_purp == null){
	System.out.println(this.toString+" : driv_purp is null" );
}else{
	System.out.println(this.toString+" : driv_purp is "+driv_purp );
}
String incmg_pers_ipaddr = req.getParameter("incmg_pers_ipaddr");
if( incmg_pers_ipaddr == null){
	System.out.println(this.toString+" : incmg_pers_ipaddr is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipaddr is "+incmg_pers_ipaddr );
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
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String req_occr_dt = Util.checkString(req.getParameter("req_occr_dt"));
String req_seq = Util.checkString(req.getParameter("req_seq"));
String start_dt = Util.checkString(req.getParameter("start_dt"));
String driv_dt = Util.checkString(req.getParameter("driv_dt"));
String car_no = Util.checkString(req.getParameter("car_no"));
String start_tm = Util.checkString(req.getParameter("start_tm"));
String ariv_tm = Util.checkString(req.getParameter("ariv_tm"));
String dest = Util.checkString(req.getParameter("dest"));
String drvr_nm = Util.checkString(req.getParameter("drvr_nm"));
String rid_pers = Util.checkString(req.getParameter("rid_pers"));
String rid_deptcd = Util.checkString(req.getParameter("rid_deptcd"));
String rid_dept_nm = Util.checkString(req.getParameter("rid_dept_nm"));
String driv_purp = Util.checkString(req.getParameter("driv_purp"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String req_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("req_occr_dt")));
String req_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("req_seq")));
String start_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("start_dt")));
String driv_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("driv_dt")));
String car_no = Util.Uni2Ksc(Util.checkString(req.getParameter("car_no")));
String start_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("start_tm")));
String ariv_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("ariv_tm")));
String dest = Util.Uni2Ksc(Util.checkString(req.getParameter("dest")));
String drvr_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("drvr_nm")));
String rid_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("rid_pers")));
String rid_deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("rid_deptcd")));
String rid_dept_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("rid_dept_nm")));
String driv_purp = Util.Uni2Ksc(Util.checkString(req.getParameter("driv_purp")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setReq_occr_dt(req_occr_dt);
dm.setReq_seq(req_seq);
dm.setStart_dt(start_dt);
dm.setDriv_dt(driv_dt);
dm.setCar_no(car_no);
dm.setStart_tm(start_tm);
dm.setAriv_tm(ariv_tm);
dm.setDest(dest);
dm.setDrvr_nm(drvr_nm);
dm.setRid_pers(rid_pers);
dm.setRid_deptcd(rid_deptcd);
dm.setRid_dept_nm(rid_dept_nm);
dm.setDriv_purp(driv_purp);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Sep 05 08:41:08 KST 2012 */