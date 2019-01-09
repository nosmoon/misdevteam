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


package chosun.ciis.hd.dwnwrk.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.dwnwrk.ds.*;
import chosun.ciis.hd.dwnwrk.rec.*;

/**
 * 
 */


public class HD_DWNWRK_1002_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String new_aply_basi_dt;
	public String aply_basi_dt;
	public String seq;
	public String erl_prsnt_alon_clsf;
	public String aply_duty_tm;
	public String alon_amt;
	public String u_ipadd;
	public String u_id;

	public HD_DWNWRK_1002_ADM(){}
	public HD_DWNWRK_1002_ADM(String mode, String cmpy_cd, String new_aply_basi_dt, String aply_basi_dt, String seq, String erl_prsnt_alon_clsf, String aply_duty_tm, String alon_amt, String u_ipadd, String u_id){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.new_aply_basi_dt = new_aply_basi_dt;
		this.aply_basi_dt = aply_basi_dt;
		this.seq = seq;
		this.erl_prsnt_alon_clsf = erl_prsnt_alon_clsf;
		this.aply_duty_tm = aply_duty_tm;
		this.alon_amt = alon_amt;
		this.u_ipadd = u_ipadd;
		this.u_id = u_id;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setNew_aply_basi_dt(String new_aply_basi_dt){
		this.new_aply_basi_dt = new_aply_basi_dt;
	}

	public void setAply_basi_dt(String aply_basi_dt){
		this.aply_basi_dt = aply_basi_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setErl_prsnt_alon_clsf(String erl_prsnt_alon_clsf){
		this.erl_prsnt_alon_clsf = erl_prsnt_alon_clsf;
	}

	public void setAply_duty_tm(String aply_duty_tm){
		this.aply_duty_tm = aply_duty_tm;
	}

	public void setAlon_amt(String alon_amt){
		this.alon_amt = alon_amt;
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

	public String getNew_aply_basi_dt(){
		return this.new_aply_basi_dt;
	}

	public String getAply_basi_dt(){
		return this.aply_basi_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getErl_prsnt_alon_clsf(){
		return this.erl_prsnt_alon_clsf;
	}

	public String getAply_duty_tm(){
		return this.aply_duty_tm;
	}

	public String getAlon_amt(){
		return this.alon_amt;
	}

	public String getU_ipadd(){
		return this.u_ipadd;
	}

	public String getU_id(){
		return this.u_id;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_DWNWRK_1002_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_DWNWRK_1002_ADM dm = (HD_DWNWRK_1002_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.new_aply_basi_dt);
		cstmt.setString(6, dm.aply_basi_dt);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.erl_prsnt_alon_clsf);
		cstmt.setString(9, dm.aply_duty_tm);
		cstmt.setString(10, dm.alon_amt);
		cstmt.setString(11, dm.u_ipadd);
		cstmt.setString(12, dm.u_id);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.dwnwrk.ds.HD_DWNWRK_1002_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("new_aply_basi_dt = [" + getNew_aply_basi_dt() + "]");
		System.out.println("aply_basi_dt = [" + getAply_basi_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("erl_prsnt_alon_clsf = [" + getErl_prsnt_alon_clsf() + "]");
		System.out.println("aply_duty_tm = [" + getAply_duty_tm() + "]");
		System.out.println("alon_amt = [" + getAlon_amt() + "]");
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
String new_aply_basi_dt = req.getParameter("new_aply_basi_dt");
if( new_aply_basi_dt == null){
	System.out.println(this.toString+" : new_aply_basi_dt is null" );
}else{
	System.out.println(this.toString+" : new_aply_basi_dt is "+new_aply_basi_dt );
}
String aply_basi_dt = req.getParameter("aply_basi_dt");
if( aply_basi_dt == null){
	System.out.println(this.toString+" : aply_basi_dt is null" );
}else{
	System.out.println(this.toString+" : aply_basi_dt is "+aply_basi_dt );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String erl_prsnt_alon_clsf = req.getParameter("erl_prsnt_alon_clsf");
if( erl_prsnt_alon_clsf == null){
	System.out.println(this.toString+" : erl_prsnt_alon_clsf is null" );
}else{
	System.out.println(this.toString+" : erl_prsnt_alon_clsf is "+erl_prsnt_alon_clsf );
}
String aply_duty_tm = req.getParameter("aply_duty_tm");
if( aply_duty_tm == null){
	System.out.println(this.toString+" : aply_duty_tm is null" );
}else{
	System.out.println(this.toString+" : aply_duty_tm is "+aply_duty_tm );
}
String alon_amt = req.getParameter("alon_amt");
if( alon_amt == null){
	System.out.println(this.toString+" : alon_amt is null" );
}else{
	System.out.println(this.toString+" : alon_amt is "+alon_amt );
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
String new_aply_basi_dt = Util.checkString(req.getParameter("new_aply_basi_dt"));
String aply_basi_dt = Util.checkString(req.getParameter("aply_basi_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String erl_prsnt_alon_clsf = Util.checkString(req.getParameter("erl_prsnt_alon_clsf"));
String aply_duty_tm = Util.checkString(req.getParameter("aply_duty_tm"));
String alon_amt = Util.checkString(req.getParameter("alon_amt"));
String u_ipadd = Util.checkString(req.getParameter("u_ipadd"));
String u_id = Util.checkString(req.getParameter("u_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String new_aply_basi_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("new_aply_basi_dt")));
String aply_basi_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_basi_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String erl_prsnt_alon_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("erl_prsnt_alon_clsf")));
String aply_duty_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_duty_tm")));
String alon_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("alon_amt")));
String u_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("u_ipadd")));
String u_id = Util.Uni2Ksc(Util.checkString(req.getParameter("u_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setNew_aply_basi_dt(new_aply_basi_dt);
dm.setAply_basi_dt(aply_basi_dt);
dm.setSeq(seq);
dm.setErl_prsnt_alon_clsf(erl_prsnt_alon_clsf);
dm.setAply_duty_tm(aply_duty_tm);
dm.setAlon_amt(alon_amt);
dm.setU_ipadd(u_ipadd);
dm.setU_id(u_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 23 13:38:42 KST 2009 */