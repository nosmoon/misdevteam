
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


package chosun.ciis.hd.dalon.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.dalon.ds.*;
import chosun.ciis.hd.dalon.rec.*;

/**
 * 
 */


public class HD_DALON_1101_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String aply_basi_dt;
	public String seq;
	public String new_apst_dt;
	public String posi_clsf;
	public String prsnt_tm_aft;
	public String prsnt_tm_prv;
	public String finish_tm_aft;
	public String finish_tm_prv;
	public String pay_amt;
	public String connect_ip;
	public String connect_userid;

	public HD_DALON_1101_ADM(){}
	public HD_DALON_1101_ADM(String mode, String cmpy_cd, String aply_basi_dt, String seq, String new_apst_dt, String posi_clsf, String prsnt_tm_aft, String prsnt_tm_prv, String finish_tm_aft, String finish_tm_prv, String pay_amt, String connect_ip, String connect_userid){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.aply_basi_dt = aply_basi_dt;
		this.seq = seq;
		this.new_apst_dt = new_apst_dt;
		this.posi_clsf = posi_clsf;
		this.prsnt_tm_aft = prsnt_tm_aft;
		this.prsnt_tm_prv = prsnt_tm_prv;
		this.finish_tm_aft = finish_tm_aft;
		this.finish_tm_prv = finish_tm_prv;
		this.pay_amt = pay_amt;
		this.connect_ip = connect_ip;
		this.connect_userid = connect_userid;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAply_basi_dt(String aply_basi_dt){
		this.aply_basi_dt = aply_basi_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setNew_apst_dt(String new_apst_dt){
		this.new_apst_dt = new_apst_dt;
	}

	public void setPosi_clsf(String posi_clsf){
		this.posi_clsf = posi_clsf;
	}

	public void setPrsnt_tm_aft(String prsnt_tm_aft){
		this.prsnt_tm_aft = prsnt_tm_aft;
	}

	public void setPrsnt_tm_prv(String prsnt_tm_prv){
		this.prsnt_tm_prv = prsnt_tm_prv;
	}

	public void setFinish_tm_aft(String finish_tm_aft){
		this.finish_tm_aft = finish_tm_aft;
	}

	public void setFinish_tm_prv(String finish_tm_prv){
		this.finish_tm_prv = finish_tm_prv;
	}

	public void setPay_amt(String pay_amt){
		this.pay_amt = pay_amt;
	}

	public void setConnect_ip(String connect_ip){
		this.connect_ip = connect_ip;
	}

	public void setConnect_userid(String connect_userid){
		this.connect_userid = connect_userid;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAply_basi_dt(){
		return this.aply_basi_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getNew_apst_dt(){
		return this.new_apst_dt;
	}

	public String getPosi_clsf(){
		return this.posi_clsf;
	}

	public String getPrsnt_tm_aft(){
		return this.prsnt_tm_aft;
	}

	public String getPrsnt_tm_prv(){
		return this.prsnt_tm_prv;
	}

	public String getFinish_tm_aft(){
		return this.finish_tm_aft;
	}

	public String getFinish_tm_prv(){
		return this.finish_tm_prv;
	}

	public String getPay_amt(){
		return this.pay_amt;
	}

	public String getConnect_ip(){
		return this.connect_ip;
	}

	public String getConnect_userid(){
		return this.connect_userid;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_DALON_1101_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_DALON_1101_ADM dm = (HD_DALON_1101_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.aply_basi_dt);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.new_apst_dt);
		cstmt.setString(8, dm.posi_clsf);
		cstmt.setString(9, dm.prsnt_tm_aft);
		cstmt.setString(10, dm.prsnt_tm_prv);
		cstmt.setString(11, dm.finish_tm_aft);
		cstmt.setString(12, dm.finish_tm_prv);
		cstmt.setString(13, dm.pay_amt);
		cstmt.setString(14, dm.connect_ip);
		cstmt.setString(15, dm.connect_userid);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.dalon.ds.HD_DALON_1101_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("aply_basi_dt = [" + getAply_basi_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("new_apst_dt = [" + getNew_apst_dt() + "]");
		System.out.println("posi_clsf = [" + getPosi_clsf() + "]");
		System.out.println("prsnt_tm_aft = [" + getPrsnt_tm_aft() + "]");
		System.out.println("prsnt_tm_prv = [" + getPrsnt_tm_prv() + "]");
		System.out.println("finish_tm_aft = [" + getFinish_tm_aft() + "]");
		System.out.println("finish_tm_prv = [" + getFinish_tm_prv() + "]");
		System.out.println("pay_amt = [" + getPay_amt() + "]");
		System.out.println("connect_ip = [" + getConnect_ip() + "]");
		System.out.println("connect_userid = [" + getConnect_userid() + "]");
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
String new_apst_dt = req.getParameter("new_apst_dt");
if( new_apst_dt == null){
	System.out.println(this.toString+" : new_apst_dt is null" );
}else{
	System.out.println(this.toString+" : new_apst_dt is "+new_apst_dt );
}
String posi_clsf = req.getParameter("posi_clsf");
if( posi_clsf == null){
	System.out.println(this.toString+" : posi_clsf is null" );
}else{
	System.out.println(this.toString+" : posi_clsf is "+posi_clsf );
}
String prsnt_tm_aft = req.getParameter("prsnt_tm_aft");
if( prsnt_tm_aft == null){
	System.out.println(this.toString+" : prsnt_tm_aft is null" );
}else{
	System.out.println(this.toString+" : prsnt_tm_aft is "+prsnt_tm_aft );
}
String prsnt_tm_prv = req.getParameter("prsnt_tm_prv");
if( prsnt_tm_prv == null){
	System.out.println(this.toString+" : prsnt_tm_prv is null" );
}else{
	System.out.println(this.toString+" : prsnt_tm_prv is "+prsnt_tm_prv );
}
String finish_tm_aft = req.getParameter("finish_tm_aft");
if( finish_tm_aft == null){
	System.out.println(this.toString+" : finish_tm_aft is null" );
}else{
	System.out.println(this.toString+" : finish_tm_aft is "+finish_tm_aft );
}
String finish_tm_prv = req.getParameter("finish_tm_prv");
if( finish_tm_prv == null){
	System.out.println(this.toString+" : finish_tm_prv is null" );
}else{
	System.out.println(this.toString+" : finish_tm_prv is "+finish_tm_prv );
}
String pay_amt = req.getParameter("pay_amt");
if( pay_amt == null){
	System.out.println(this.toString+" : pay_amt is null" );
}else{
	System.out.println(this.toString+" : pay_amt is "+pay_amt );
}
String connect_ip = req.getParameter("connect_ip");
if( connect_ip == null){
	System.out.println(this.toString+" : connect_ip is null" );
}else{
	System.out.println(this.toString+" : connect_ip is "+connect_ip );
}
String connect_userid = req.getParameter("connect_userid");
if( connect_userid == null){
	System.out.println(this.toString+" : connect_userid is null" );
}else{
	System.out.println(this.toString+" : connect_userid is "+connect_userid );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String aply_basi_dt = Util.checkString(req.getParameter("aply_basi_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String new_apst_dt = Util.checkString(req.getParameter("new_apst_dt"));
String posi_clsf = Util.checkString(req.getParameter("posi_clsf"));
String prsnt_tm_aft = Util.checkString(req.getParameter("prsnt_tm_aft"));
String prsnt_tm_prv = Util.checkString(req.getParameter("prsnt_tm_prv"));
String finish_tm_aft = Util.checkString(req.getParameter("finish_tm_aft"));
String finish_tm_prv = Util.checkString(req.getParameter("finish_tm_prv"));
String pay_amt = Util.checkString(req.getParameter("pay_amt"));
String connect_ip = Util.checkString(req.getParameter("connect_ip"));
String connect_userid = Util.checkString(req.getParameter("connect_userid"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String aply_basi_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_basi_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String new_apst_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("new_apst_dt")));
String posi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("posi_clsf")));
String prsnt_tm_aft = Util.Uni2Ksc(Util.checkString(req.getParameter("prsnt_tm_aft")));
String prsnt_tm_prv = Util.Uni2Ksc(Util.checkString(req.getParameter("prsnt_tm_prv")));
String finish_tm_aft = Util.Uni2Ksc(Util.checkString(req.getParameter("finish_tm_aft")));
String finish_tm_prv = Util.Uni2Ksc(Util.checkString(req.getParameter("finish_tm_prv")));
String pay_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_amt")));
String connect_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("connect_ip")));
String connect_userid = Util.Uni2Ksc(Util.checkString(req.getParameter("connect_userid")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setAply_basi_dt(aply_basi_dt);
dm.setSeq(seq);
dm.setNew_apst_dt(new_apst_dt);
dm.setPosi_clsf(posi_clsf);
dm.setPrsnt_tm_aft(prsnt_tm_aft);
dm.setPrsnt_tm_prv(prsnt_tm_prv);
dm.setFinish_tm_aft(finish_tm_aft);
dm.setFinish_tm_prv(finish_tm_prv);
dm.setPay_amt(pay_amt);
dm.setConnect_ip(connect_ip);
dm.setConnect_userid(connect_userid);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 21 20:19:17 KST 2009 */