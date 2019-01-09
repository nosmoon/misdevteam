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


package chosun.ciis.hd.trip.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.trip.ds.*;
import chosun.ciis.hd.trip.rec.*;

/**
 * 
 */


public class HD_TRIP_1901_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String flnm;
	public String dept_cd;
	public String dty_cd;
	public String posi_cd;
	public String busi_trip_frdt;
	public String busi_trip_todt;
	public String busi_trip_purp;
	public String dd_fee;
	public String busi_trip_dds;
	public String busi_trip_fee_stot;
	public String stay_area;
	public String stay_clsf;
	public String slip_proc_mang_dt;
	public String slip_proc_mang_seq;
	public String u_ipadd;
	public String u_id;

	public HD_TRIP_1901_ADM(){}
	public HD_TRIP_1901_ADM(String mode, String cmpy_cd, String emp_no, String occr_dt, String seq, String flnm, String dept_cd, String dty_cd, String posi_cd, String busi_trip_frdt, String busi_trip_todt, String busi_trip_purp, String dd_fee, String busi_trip_dds, String busi_trip_fee_stot, String stay_area, String stay_clsf, String slip_proc_mang_dt, String slip_proc_mang_seq, String u_ipadd, String u_id){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.flnm = flnm;
		this.dept_cd = dept_cd;
		this.dty_cd = dty_cd;
		this.posi_cd = posi_cd;
		this.busi_trip_frdt = busi_trip_frdt;
		this.busi_trip_todt = busi_trip_todt;
		this.busi_trip_purp = busi_trip_purp;
		this.dd_fee = dd_fee;
		this.busi_trip_dds = busi_trip_dds;
		this.busi_trip_fee_stot = busi_trip_fee_stot;
		this.stay_area = stay_area;
		this.stay_clsf = stay_clsf;
		this.slip_proc_mang_dt = slip_proc_mang_dt;
		this.slip_proc_mang_seq = slip_proc_mang_seq;
		this.u_ipadd = u_ipadd;
		this.u_id = u_id;
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

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setBusi_trip_frdt(String busi_trip_frdt){
		this.busi_trip_frdt = busi_trip_frdt;
	}

	public void setBusi_trip_todt(String busi_trip_todt){
		this.busi_trip_todt = busi_trip_todt;
	}

	public void setBusi_trip_purp(String busi_trip_purp){
		this.busi_trip_purp = busi_trip_purp;
	}

	public void setDd_fee(String dd_fee){
		this.dd_fee = dd_fee;
	}

	public void setBusi_trip_dds(String busi_trip_dds){
		this.busi_trip_dds = busi_trip_dds;
	}

	public void setBusi_trip_fee_stot(String busi_trip_fee_stot){
		this.busi_trip_fee_stot = busi_trip_fee_stot;
	}

	public void setStay_area(String stay_area){
		this.stay_area = stay_area;
	}

	public void setStay_clsf(String stay_clsf){
		this.stay_clsf = stay_clsf;
	}

	public void setSlip_proc_mang_dt(String slip_proc_mang_dt){
		this.slip_proc_mang_dt = slip_proc_mang_dt;
	}

	public void setSlip_proc_mang_seq(String slip_proc_mang_seq){
		this.slip_proc_mang_seq = slip_proc_mang_seq;
	}

	public void setU_ipadd(String u_ipadd){
		this.u_ipadd = u_ipadd;
	}

	public void setU_id(String u_id){
		this.u_id = u_id;
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

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getBusi_trip_frdt(){
		return this.busi_trip_frdt;
	}

	public String getBusi_trip_todt(){
		return this.busi_trip_todt;
	}

	public String getBusi_trip_purp(){
		return this.busi_trip_purp;
	}

	public String getDd_fee(){
		return this.dd_fee;
	}

	public String getBusi_trip_dds(){
		return this.busi_trip_dds;
	}

	public String getBusi_trip_fee_stot(){
		return this.busi_trip_fee_stot;
	}

	public String getStay_area(){
		return this.stay_area;
	}

	public String getStay_clsf(){
		return this.stay_clsf;
	}

	public String getSlip_proc_mang_dt(){
		return this.slip_proc_mang_dt;
	}

	public String getSlip_proc_mang_seq(){
		return this.slip_proc_mang_seq;
	}

	public String getU_ipadd(){
		return this.u_ipadd;
	}

	public String getU_id(){
		return this.u_id;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_TRIP_1901_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_TRIP_1901_ADM dm = (HD_TRIP_1901_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.occr_dt);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.flnm);
		cstmt.setString(9, dm.dept_cd);
		cstmt.setString(10, dm.dty_cd);
		cstmt.setString(11, dm.posi_cd);
		cstmt.setString(12, dm.busi_trip_frdt);
		cstmt.setString(13, dm.busi_trip_todt);
		cstmt.setString(14, dm.busi_trip_purp);
		cstmt.setString(15, dm.dd_fee);
		cstmt.setString(16, dm.busi_trip_dds);
		cstmt.setString(17, dm.busi_trip_fee_stot);
		cstmt.setString(18, dm.stay_area);
		cstmt.setString(19, dm.stay_clsf);
		cstmt.setString(20, dm.slip_proc_mang_dt);
		cstmt.setString(21, dm.slip_proc_mang_seq);
		cstmt.setString(22, dm.u_ipadd);
		cstmt.setString(23, dm.u_id);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.trip.ds.HD_TRIP_1901_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("dty_cd = [" + getDty_cd() + "]");
		System.out.println("posi_cd = [" + getPosi_cd() + "]");
		System.out.println("busi_trip_frdt = [" + getBusi_trip_frdt() + "]");
		System.out.println("busi_trip_todt = [" + getBusi_trip_todt() + "]");
		System.out.println("busi_trip_purp = [" + getBusi_trip_purp() + "]");
		System.out.println("dd_fee = [" + getDd_fee() + "]");
		System.out.println("busi_trip_dds = [" + getBusi_trip_dds() + "]");
		System.out.println("busi_trip_fee_stot = [" + getBusi_trip_fee_stot() + "]");
		System.out.println("stay_area = [" + getStay_area() + "]");
		System.out.println("stay_clsf = [" + getStay_clsf() + "]");
		System.out.println("slip_proc_mang_dt = [" + getSlip_proc_mang_dt() + "]");
		System.out.println("slip_proc_mang_seq = [" + getSlip_proc_mang_seq() + "]");
		System.out.println("u_ipadd = [" + getU_ipadd() + "]");
		System.out.println("u_id = [" + getU_id() + "]");
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
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String dty_cd = req.getParameter("dty_cd");
if( dty_cd == null){
	System.out.println(this.toString+" : dty_cd is null" );
}else{
	System.out.println(this.toString+" : dty_cd is "+dty_cd );
}
String posi_cd = req.getParameter("posi_cd");
if( posi_cd == null){
	System.out.println(this.toString+" : posi_cd is null" );
}else{
	System.out.println(this.toString+" : posi_cd is "+posi_cd );
}
String busi_trip_frdt = req.getParameter("busi_trip_frdt");
if( busi_trip_frdt == null){
	System.out.println(this.toString+" : busi_trip_frdt is null" );
}else{
	System.out.println(this.toString+" : busi_trip_frdt is "+busi_trip_frdt );
}
String busi_trip_todt = req.getParameter("busi_trip_todt");
if( busi_trip_todt == null){
	System.out.println(this.toString+" : busi_trip_todt is null" );
}else{
	System.out.println(this.toString+" : busi_trip_todt is "+busi_trip_todt );
}
String busi_trip_purp = req.getParameter("busi_trip_purp");
if( busi_trip_purp == null){
	System.out.println(this.toString+" : busi_trip_purp is null" );
}else{
	System.out.println(this.toString+" : busi_trip_purp is "+busi_trip_purp );
}
String dd_fee = req.getParameter("dd_fee");
if( dd_fee == null){
	System.out.println(this.toString+" : dd_fee is null" );
}else{
	System.out.println(this.toString+" : dd_fee is "+dd_fee );
}
String busi_trip_dds = req.getParameter("busi_trip_dds");
if( busi_trip_dds == null){
	System.out.println(this.toString+" : busi_trip_dds is null" );
}else{
	System.out.println(this.toString+" : busi_trip_dds is "+busi_trip_dds );
}
String busi_trip_fee_stot = req.getParameter("busi_trip_fee_stot");
if( busi_trip_fee_stot == null){
	System.out.println(this.toString+" : busi_trip_fee_stot is null" );
}else{
	System.out.println(this.toString+" : busi_trip_fee_stot is "+busi_trip_fee_stot );
}
String stay_area = req.getParameter("stay_area");
if( stay_area == null){
	System.out.println(this.toString+" : stay_area is null" );
}else{
	System.out.println(this.toString+" : stay_area is "+stay_area );
}
String stay_clsf = req.getParameter("stay_clsf");
if( stay_clsf == null){
	System.out.println(this.toString+" : stay_clsf is null" );
}else{
	System.out.println(this.toString+" : stay_clsf is "+stay_clsf );
}
String slip_proc_mang_dt = req.getParameter("slip_proc_mang_dt");
if( slip_proc_mang_dt == null){
	System.out.println(this.toString+" : slip_proc_mang_dt is null" );
}else{
	System.out.println(this.toString+" : slip_proc_mang_dt is "+slip_proc_mang_dt );
}
String slip_proc_mang_seq = req.getParameter("slip_proc_mang_seq");
if( slip_proc_mang_seq == null){
	System.out.println(this.toString+" : slip_proc_mang_seq is null" );
}else{
	System.out.println(this.toString+" : slip_proc_mang_seq is "+slip_proc_mang_seq );
}
String u_ipadd = req.getParameter("u_ipadd");
if( u_ipadd == null){
	System.out.println(this.toString+" : u_ipadd is null" );
}else{
	System.out.println(this.toString+" : u_ipadd is "+u_ipadd );
}
String u_id = req.getParameter("u_id");
if( u_id == null){
	System.out.println(this.toString+" : u_id is null" );
}else{
	System.out.println(this.toString+" : u_id is "+u_id );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String flnm = Util.checkString(req.getParameter("flnm"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String dty_cd = Util.checkString(req.getParameter("dty_cd"));
String posi_cd = Util.checkString(req.getParameter("posi_cd"));
String busi_trip_frdt = Util.checkString(req.getParameter("busi_trip_frdt"));
String busi_trip_todt = Util.checkString(req.getParameter("busi_trip_todt"));
String busi_trip_purp = Util.checkString(req.getParameter("busi_trip_purp"));
String dd_fee = Util.checkString(req.getParameter("dd_fee"));
String busi_trip_dds = Util.checkString(req.getParameter("busi_trip_dds"));
String busi_trip_fee_stot = Util.checkString(req.getParameter("busi_trip_fee_stot"));
String stay_area = Util.checkString(req.getParameter("stay_area"));
String stay_clsf = Util.checkString(req.getParameter("stay_clsf"));
String slip_proc_mang_dt = Util.checkString(req.getParameter("slip_proc_mang_dt"));
String slip_proc_mang_seq = Util.checkString(req.getParameter("slip_proc_mang_seq"));
String u_ipadd = Util.checkString(req.getParameter("u_ipadd"));
String u_id = Util.checkString(req.getParameter("u_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String dty_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dty_cd")));
String posi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("posi_cd")));
String busi_trip_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("busi_trip_frdt")));
String busi_trip_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("busi_trip_todt")));
String busi_trip_purp = Util.Uni2Ksc(Util.checkString(req.getParameter("busi_trip_purp")));
String dd_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("dd_fee")));
String busi_trip_dds = Util.Uni2Ksc(Util.checkString(req.getParameter("busi_trip_dds")));
String busi_trip_fee_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("busi_trip_fee_stot")));
String stay_area = Util.Uni2Ksc(Util.checkString(req.getParameter("stay_area")));
String stay_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("stay_clsf")));
String slip_proc_mang_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_mang_dt")));
String slip_proc_mang_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_mang_seq")));
String u_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("u_ipadd")));
String u_id = Util.Uni2Ksc(Util.checkString(req.getParameter("u_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setFlnm(flnm);
dm.setDept_cd(dept_cd);
dm.setDty_cd(dty_cd);
dm.setPosi_cd(posi_cd);
dm.setBusi_trip_frdt(busi_trip_frdt);
dm.setBusi_trip_todt(busi_trip_todt);
dm.setBusi_trip_purp(busi_trip_purp);
dm.setDd_fee(dd_fee);
dm.setBusi_trip_dds(busi_trip_dds);
dm.setBusi_trip_fee_stot(busi_trip_fee_stot);
dm.setStay_area(stay_area);
dm.setStay_clsf(stay_clsf);
dm.setSlip_proc_mang_dt(slip_proc_mang_dt);
dm.setSlip_proc_mang_seq(slip_proc_mang_seq);
dm.setU_ipadd(u_ipadd);
dm.setU_id(u_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 13 13:34:34 KST 2009 */