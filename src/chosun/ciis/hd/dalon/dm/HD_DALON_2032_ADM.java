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


public class HD_DALON_2032_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String seq;
	public String prvdd_prsnt_tm_prv;
	public String finish_dd_clsf;
	public String prvdd_finish_tm_aft;
	public String prvdd_finish_tm_prv;
	public String thdd_prsnt_tm_aft;
	public String thdd_prsnt_tm_prv;
	public String pay_amt;
	public String connect_ip;
	public String connect_userid;

	public HD_DALON_2032_ADM(){}
	public HD_DALON_2032_ADM(String mode, String cmpy_cd, String seq, String prvdd_prsnt_tm_prv, String finish_dd_clsf, String prvdd_finish_tm_aft, String prvdd_finish_tm_prv, String thdd_prsnt_tm_aft, String thdd_prsnt_tm_prv, String pay_amt, String connect_ip, String connect_userid){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.seq = seq;
		this.prvdd_prsnt_tm_prv = prvdd_prsnt_tm_prv;
		this.finish_dd_clsf = finish_dd_clsf;
		this.prvdd_finish_tm_aft = prvdd_finish_tm_aft;
		this.prvdd_finish_tm_prv = prvdd_finish_tm_prv;
		this.thdd_prsnt_tm_aft = thdd_prsnt_tm_aft;
		this.thdd_prsnt_tm_prv = thdd_prsnt_tm_prv;
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

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setPrvdd_prsnt_tm_prv(String prvdd_prsnt_tm_prv){
		this.prvdd_prsnt_tm_prv = prvdd_prsnt_tm_prv;
	}

	public void setFinish_dd_clsf(String finish_dd_clsf){
		this.finish_dd_clsf = finish_dd_clsf;
	}

	public void setPrvdd_finish_tm_aft(String prvdd_finish_tm_aft){
		this.prvdd_finish_tm_aft = prvdd_finish_tm_aft;
	}

	public void setPrvdd_finish_tm_prv(String prvdd_finish_tm_prv){
		this.prvdd_finish_tm_prv = prvdd_finish_tm_prv;
	}

	public void setThdd_prsnt_tm_aft(String thdd_prsnt_tm_aft){
		this.thdd_prsnt_tm_aft = thdd_prsnt_tm_aft;
	}

	public void setThdd_prsnt_tm_prv(String thdd_prsnt_tm_prv){
		this.thdd_prsnt_tm_prv = thdd_prsnt_tm_prv;
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

	public String getSeq(){
		return this.seq;
	}

	public String getPrvdd_prsnt_tm_prv(){
		return this.prvdd_prsnt_tm_prv;
	}

	public String getFinish_dd_clsf(){
		return this.finish_dd_clsf;
	}

	public String getPrvdd_finish_tm_aft(){
		return this.prvdd_finish_tm_aft;
	}

	public String getPrvdd_finish_tm_prv(){
		return this.prvdd_finish_tm_prv;
	}

	public String getThdd_prsnt_tm_aft(){
		return this.thdd_prsnt_tm_aft;
	}

	public String getThdd_prsnt_tm_prv(){
		return this.thdd_prsnt_tm_prv;
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
		 return "{ call MISHDL.SP_HD_DALON_2032_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_DALON_2032_ADM dm = (HD_DALON_2032_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.seq);
		cstmt.setString(6, dm.prvdd_prsnt_tm_prv);
		cstmt.setString(7, dm.finish_dd_clsf);
		cstmt.setString(8, dm.prvdd_finish_tm_aft);
		cstmt.setString(9, dm.prvdd_finish_tm_prv);
		cstmt.setString(10, dm.thdd_prsnt_tm_aft);
		cstmt.setString(11, dm.thdd_prsnt_tm_prv);
		cstmt.setString(12, dm.pay_amt);
		cstmt.setString(13, dm.connect_ip);
		cstmt.setString(14, dm.connect_userid);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.dalon.ds.HD_DALON_2032_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("prvdd_prsnt_tm_prv = [" + getPrvdd_prsnt_tm_prv() + "]");
		System.out.println("finish_dd_clsf = [" + getFinish_dd_clsf() + "]");
		System.out.println("prvdd_finish_tm_aft = [" + getPrvdd_finish_tm_aft() + "]");
		System.out.println("prvdd_finish_tm_prv = [" + getPrvdd_finish_tm_prv() + "]");
		System.out.println("thdd_prsnt_tm_aft = [" + getThdd_prsnt_tm_aft() + "]");
		System.out.println("thdd_prsnt_tm_prv = [" + getThdd_prsnt_tm_prv() + "]");
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
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String prvdd_prsnt_tm_prv = req.getParameter("prvdd_prsnt_tm_prv");
if( prvdd_prsnt_tm_prv == null){
	System.out.println(this.toString+" : prvdd_prsnt_tm_prv is null" );
}else{
	System.out.println(this.toString+" : prvdd_prsnt_tm_prv is "+prvdd_prsnt_tm_prv );
}
String finish_dd_clsf = req.getParameter("finish_dd_clsf");
if( finish_dd_clsf == null){
	System.out.println(this.toString+" : finish_dd_clsf is null" );
}else{
	System.out.println(this.toString+" : finish_dd_clsf is "+finish_dd_clsf );
}
String prvdd_finish_tm_aft = req.getParameter("prvdd_finish_tm_aft");
if( prvdd_finish_tm_aft == null){
	System.out.println(this.toString+" : prvdd_finish_tm_aft is null" );
}else{
	System.out.println(this.toString+" : prvdd_finish_tm_aft is "+prvdd_finish_tm_aft );
}
String prvdd_finish_tm_prv = req.getParameter("prvdd_finish_tm_prv");
if( prvdd_finish_tm_prv == null){
	System.out.println(this.toString+" : prvdd_finish_tm_prv is null" );
}else{
	System.out.println(this.toString+" : prvdd_finish_tm_prv is "+prvdd_finish_tm_prv );
}
String thdd_prsnt_tm_aft = req.getParameter("thdd_prsnt_tm_aft");
if( thdd_prsnt_tm_aft == null){
	System.out.println(this.toString+" : thdd_prsnt_tm_aft is null" );
}else{
	System.out.println(this.toString+" : thdd_prsnt_tm_aft is "+thdd_prsnt_tm_aft );
}
String thdd_prsnt_tm_prv = req.getParameter("thdd_prsnt_tm_prv");
if( thdd_prsnt_tm_prv == null){
	System.out.println(this.toString+" : thdd_prsnt_tm_prv is null" );
}else{
	System.out.println(this.toString+" : thdd_prsnt_tm_prv is "+thdd_prsnt_tm_prv );
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
String seq = Util.checkString(req.getParameter("seq"));
String prvdd_prsnt_tm_prv = Util.checkString(req.getParameter("prvdd_prsnt_tm_prv"));
String finish_dd_clsf = Util.checkString(req.getParameter("finish_dd_clsf"));
String prvdd_finish_tm_aft = Util.checkString(req.getParameter("prvdd_finish_tm_aft"));
String prvdd_finish_tm_prv = Util.checkString(req.getParameter("prvdd_finish_tm_prv"));
String thdd_prsnt_tm_aft = Util.checkString(req.getParameter("thdd_prsnt_tm_aft"));
String thdd_prsnt_tm_prv = Util.checkString(req.getParameter("thdd_prsnt_tm_prv"));
String pay_amt = Util.checkString(req.getParameter("pay_amt"));
String connect_ip = Util.checkString(req.getParameter("connect_ip"));
String connect_userid = Util.checkString(req.getParameter("connect_userid"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String prvdd_prsnt_tm_prv = Util.Uni2Ksc(Util.checkString(req.getParameter("prvdd_prsnt_tm_prv")));
String finish_dd_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("finish_dd_clsf")));
String prvdd_finish_tm_aft = Util.Uni2Ksc(Util.checkString(req.getParameter("prvdd_finish_tm_aft")));
String prvdd_finish_tm_prv = Util.Uni2Ksc(Util.checkString(req.getParameter("prvdd_finish_tm_prv")));
String thdd_prsnt_tm_aft = Util.Uni2Ksc(Util.checkString(req.getParameter("thdd_prsnt_tm_aft")));
String thdd_prsnt_tm_prv = Util.Uni2Ksc(Util.checkString(req.getParameter("thdd_prsnt_tm_prv")));
String pay_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_amt")));
String connect_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("connect_ip")));
String connect_userid = Util.Uni2Ksc(Util.checkString(req.getParameter("connect_userid")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setSeq(seq);
dm.setPrvdd_prsnt_tm_prv(prvdd_prsnt_tm_prv);
dm.setFinish_dd_clsf(finish_dd_clsf);
dm.setPrvdd_finish_tm_aft(prvdd_finish_tm_aft);
dm.setPrvdd_finish_tm_prv(prvdd_finish_tm_prv);
dm.setThdd_prsnt_tm_aft(thdd_prsnt_tm_aft);
dm.setThdd_prsnt_tm_prv(thdd_prsnt_tm_prv);
dm.setPay_amt(pay_amt);
dm.setConnect_ip(connect_ip);
dm.setConnect_userid(connect_userid);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 27 10:58:24 KST 2012 */