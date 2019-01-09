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


package chosun.ciis.hd.ddemp.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.ddemp.ds.*;
import chosun.ciis.hd.ddemp.rec.*;

/**
 * 
 */


public class HD_DDEMP_1104_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String canc_mode;
	public String mode;
	public String chk;
	public String cmpy_cd;
	public String mang_no;
	public String occr_dt;
	public String seq;
	public String slip_proc_mang_dt;
	public String slip_proc_mang_seq;
	public String u_ipadd;
	public String u_id;

	public HD_DDEMP_1104_ADM(){}
	public HD_DDEMP_1104_ADM(String canc_mode, String mode, String chk, String cmpy_cd, String mang_no, String occr_dt, String seq, String slip_proc_mang_dt, String slip_proc_mang_seq, String u_ipadd, String u_id){
		this.canc_mode = canc_mode;
		this.mode = mode;
		this.chk = chk;
		this.cmpy_cd = cmpy_cd;
		this.mang_no = mang_no;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.slip_proc_mang_dt = slip_proc_mang_dt;
		this.slip_proc_mang_seq = slip_proc_mang_seq;
		this.u_ipadd = u_ipadd;
		this.u_id = u_id;
	}

	public void setCanc_mode(String canc_mode){
		this.canc_mode = canc_mode;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setChk(String chk){
		this.chk = chk;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
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

	public String getCanc_mode(){
		return this.canc_mode;
	}

	public String getMode(){
		return this.mode;
	}

	public String getChk(){
		return this.chk;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMang_no(){
		return this.mang_no;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
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
		 return "{ call MISHDL.SP_HD_DDEMP_1104_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_DDEMP_1104_ADM dm = (HD_DDEMP_1104_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.canc_mode);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.chk);
		cstmt.setString(6, dm.cmpy_cd);
		cstmt.setString(7, dm.mang_no);
		cstmt.setString(8, dm.occr_dt);
		cstmt.setString(9, dm.seq);
		cstmt.setString(10, dm.slip_proc_mang_dt);
		cstmt.setString(11, dm.slip_proc_mang_seq);
		cstmt.setString(12, dm.u_ipadd);
		cstmt.setString(13, dm.u_id);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.ddemp.ds.HD_DDEMP_1104_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("canc_mode = [" + getCanc_mode() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("chk = [" + getChk() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mang_no = [" + getMang_no() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("slip_proc_mang_dt = [" + getSlip_proc_mang_dt() + "]");
		System.out.println("slip_proc_mang_seq = [" + getSlip_proc_mang_seq() + "]");
		System.out.println("u_ipadd = [" + getU_ipadd() + "]");
		System.out.println("u_id = [" + getU_id() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String canc_mode = req.getParameter("canc_mode");
if( canc_mode == null){
	System.out.println(this.toString+" : canc_mode is null" );
}else{
	System.out.println(this.toString+" : canc_mode is "+canc_mode );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String chk = req.getParameter("chk");
if( chk == null){
	System.out.println(this.toString+" : chk is null" );
}else{
	System.out.println(this.toString+" : chk is "+chk );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String mang_no = req.getParameter("mang_no");
if( mang_no == null){
	System.out.println(this.toString+" : mang_no is null" );
}else{
	System.out.println(this.toString+" : mang_no is "+mang_no );
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

String canc_mode = Util.checkString(req.getParameter("canc_mode"));
String mode = Util.checkString(req.getParameter("mode"));
String chk = Util.checkString(req.getParameter("chk"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mang_no = Util.checkString(req.getParameter("mang_no"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String slip_proc_mang_dt = Util.checkString(req.getParameter("slip_proc_mang_dt"));
String slip_proc_mang_seq = Util.checkString(req.getParameter("slip_proc_mang_seq"));
String u_ipadd = Util.checkString(req.getParameter("u_ipadd"));
String u_id = Util.checkString(req.getParameter("u_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String canc_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("canc_mode")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String chk = Util.Uni2Ksc(Util.checkString(req.getParameter("chk")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_no")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String slip_proc_mang_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_mang_dt")));
String slip_proc_mang_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_mang_seq")));
String u_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("u_ipadd")));
String u_id = Util.Uni2Ksc(Util.checkString(req.getParameter("u_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCanc_mode(canc_mode);
dm.setMode(mode);
dm.setChk(chk);
dm.setCmpy_cd(cmpy_cd);
dm.setMang_no(mang_no);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setSlip_proc_mang_dt(slip_proc_mang_dt);
dm.setSlip_proc_mang_seq(slip_proc_mang_seq);
dm.setU_ipadd(u_ipadd);
dm.setU_id(u_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Sep 07 21:47:26 KST 2009 */